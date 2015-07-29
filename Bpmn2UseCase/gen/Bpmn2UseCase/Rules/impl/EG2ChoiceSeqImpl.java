/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.FN2S;
import Bpmn2UseCase.GW2S;

import Bpmn2UseCase.Rules.EG2ChoiceSeq;
import Bpmn2UseCase.Rules.RulesPackage;

import SimpleBPMN.ExclusiveGateway;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.ChoiceStep;
import SimpleUseCase.Flow;
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
 * An implementation of the model object '<em><b>EG2 Choice Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EG2ChoiceSeqImpl extends AbstractRuleImpl implements EG2ChoiceSeq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EG2ChoiceSeqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEG2ChoiceSeq();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		// initial bindings
		Object[] result1_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_0_1_blackBBBBBBB(this, match, prevNode, process,
				sf1, egw, ecgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process
							+ ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_0_2_bindingAndBlackFBBBBBBB(this,
				match, prevNode, process, sf1, egw, ecgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = "
					+ process + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_0_4_blackBBBBBB(match, prevNode, process,
					sf1, egw, ecgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", "
						+ "[ecgw] = " + ecgw + ".");
			}
			EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_0_4_greenBBBBBBFFFFFFFF(match, prevNode, process, sf1, egw, ecgw);
			// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result4_green[8];
			// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[9];
			// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[10];
			// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result4_green[11];
			// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result4_green[12];
			// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_0_5_blackBBBBBB(match, prevNode, process,
					sf1, egw, ecgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process + ", "
								+ "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
			}
			EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_0_6_expressionBBBBBBB(this, match, prevNode, process, sf1, egw, ecgw);
			return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_0_7_expressionF();
		} else {
			return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_1_1_bindingAndBlackFFFFFFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[0];
		Step prevStep = (Step) result1_bindingAndBlack[1];
		FN2S pn2ps = (FN2S) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[4];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[5];
		ExclusiveGateway egw = (ExclusiveGateway) result1_bindingAndBlack[6];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_1_1_greenBBFBFBFB(prevStep, flow, egw, ecgw,
				csp);
		ChoiceStep step = (ChoiceStep) result1_green[2];
		GW2S egwToStep = (GW2S) result1_green[4];
		GW2S ecgwToStep = (GW2S) result1_green[6];

		// collect translated elements
		Object[] result2_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_1_2_blackBBBBBB(step, sf1, egw, egwToStep, ecgw,
				ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[egwToStep] = "
					+ egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_1_2_greenFBBBBBB(step, sf1, egw, egwToStep, ecgw,
				ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_1_3_blackBBBBBBBBBBBB(ruleresult, prevNode,
				prevStep, pn2ps, flow, step, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[prevStep] = "
					+ prevStep + ", " + "[pn2ps] = " + pn2ps + ", " + "[flow] = " + flow + ", " + "[step] = " + step
					+ ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", "
					+ "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep
					+ ".");
		}
		EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, prevNode, prevStep, flow,
				step, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
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
		EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_1_5_expressionBBBBBBBBBBBBB(this, ruleresult, prevNode, prevStep, pn2ps,
				flow, step, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		FlowNode prevNode = (FlowNode) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ExclusiveGateway egw = (ExclusiveGateway) result2_binding[3];
		ExclusiveGateway ecgw = (ExclusiveGateway) result2_binding[4];
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_2_2_blackBFFBBBBB(prevNode, process, sf1,
				egw, ecgw, match)) {
			Step prevStep = (Step) result2_black[1];
			FN2S pn2ps = (FN2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_2_3_blackBBBFBBBB(prevNode, prevStep,
					pn2ps, process, sf1, egw, ecgw)) {
				Flow flow = (Flow) result3_black[3];
				Object[] result3_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_2_3_greenBBBBBBBBFFFFFFFFFFFFF(prevNode,
						prevStep, pn2ps, flow, process, sf1, egw, ecgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge pn2ps__prevNode____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge pn2ps__prevStep____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[19];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_2_4_bindingAndBlackFBBBBBBBBBB(
						this, isApplicableMatch, prevNode, prevStep, pn2ps, flow, process, sf1, egw, ecgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[prevStep] = " + prevStep + ", " + "[pn2ps] = "
							+ pn2ps + ", " + "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[sf1] = "
							+ sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
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
	public CSP isAppropriate_solveCsp_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, FlowNode prevNode, Step prevStep,
			FN2S pn2ps, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {// Create CSP
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
		isApplicableMatch.registerObject("pn2ps", pn2ps);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject pn2ps,
			EObject flow, EObject step, EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("pn2ps", pn2ps);
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
	public boolean isAppropriate_BWD(Match match, Step prevStep, Flow flow, ChoiceStep step) {
		// initial bindings
		Object[] result1_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_10_1_blackBBBBB(this, match, prevStep, flow,
				step);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevStep] = " + prevStep + ", "
					+ "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_10_2_bindingAndBlackFBBBBB(this, match,
				prevStep, flow, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = " + flow
					+ ", " + "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_10_4_blackBBBB(match, prevStep, flow, step);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = "
						+ flow + ", " + "[step] = " + step + ".");
			}
			EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_10_4_greenBBBBFF(match, prevStep, flow, step);
			// EMoflonEdge prevStep__step____next = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_10_5_blackBBBB(match, prevStep, flow, step);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = "
						+ flow + ", " + "[step] = " + step + ".");
			}
			EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_10_5_greenBBBF(match, prevStep, flow);
			// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result5_green[3];

			// register objects to match
			EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_10_6_expressionBBBBB(this, match, prevStep, flow, step);
			return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_10_7_expressionF();
		} else {
			return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_11_1_bindingAndBlackFFFFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[0];
		Step prevStep = (Step) result1_bindingAndBlack[1];
		FN2S pn2ps = (FN2S) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		ChoiceStep step = (ChoiceStep) result1_bindingAndBlack[4];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_11_1_greenBBBFFFFFB(prevNode, step, process,
				csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[3];
		ExclusiveGateway egw = (ExclusiveGateway) result1_green[4];
		GW2S egwToStep = (GW2S) result1_green[5];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_green[6];
		GW2S ecgwToStep = (GW2S) result1_green[7];

		// collect translated elements
		Object[] result2_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_11_2_blackBBBBBB(step, sf1, egw, egwToStep, ecgw,
				ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[egwToStep] = "
					+ egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_11_2_greenFBBBBBB(step, sf1, egw, egwToStep,
				ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_11_3_blackBBBBBBBBBBBB(ruleresult, prevNode,
				prevStep, pn2ps, flow, step, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[prevStep] = "
					+ prevStep + ", " + "[pn2ps] = " + pn2ps + ", " + "[flow] = " + flow + ", " + "[step] = " + step
					+ ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", "
					+ "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep
					+ ".");
		}
		EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, prevNode, prevStep, flow,
				step, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
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
		EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_11_5_expressionBBBBBBBBBBBBB(this, ruleresult, prevNode, prevStep, pn2ps,
				flow, step, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Step prevStep = (Step) result2_binding[0];
		Flow flow = (Flow) result2_binding[1];
		ChoiceStep step = (ChoiceStep) result2_binding[2];
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_12_2_blackFBFBBB(prevStep, flow, step,
				match)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			FN2S pn2ps = (FN2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_12_3_blackBBBBBF(prevNode, prevStep,
					pn2ps, flow, step)) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[5];
				Object[] result3_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_12_3_greenBBBBBBFFFFFFF(prevNode,
						prevStep, pn2ps, flow, step, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[7];
				// EMoflonEdge pn2ps__prevNode____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge pn2ps__prevStep____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[10];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_12_4_bindingAndBlackFBBBBBBBB(
						this, isApplicableMatch, prevNode, prevStep, pn2ps, flow, step, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[prevStep] = " + prevStep + ", " + "[pn2ps] = "
							+ pn2ps + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ", " + "[process] = "
							+ process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Step prevStep, Flow flow, ChoiceStep step) {
		match.registerObject("prevStep", prevStep);
		match.registerObject("flow", flow);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Step prevStep, Flow flow, ChoiceStep step) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FlowNode prevNode, Step prevStep,
			FN2S pn2ps, Flow flow, ChoiceStep step, SimpleBPMN.Process process) {// Create CSP
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
		isApplicableMatch.registerObject("pn2ps", pn2ps);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject pn2ps,
			EObject flow, EObject step, EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("pn2ps", pn2ps);
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
				.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getChoiceStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_65(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_20_2_blackFFFB(_edge_next)) {
			Step prevStep = (Step) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			ChoiceStep step = (ChoiceStep) result2_black[2];
			Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_20_3_expressionFBBBBB(this, match, prevStep, flow, step)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_66(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_21_2_blackFFFB(_edge_steps)) {
			Step prevStep = (Step) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			ChoiceStep step = (ChoiceStep) result2_black[2];
			Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_21_3_expressionFBBBBB(this, match, prevStep, flow, step)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_207(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_22_2_blackFFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_22_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, egw,
					ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_208(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_23_2_blackFFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_23_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, egw,
					ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_209(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_24_2_blackFFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_24_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, egw,
					ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_210(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_25_2_blackFFFFFB(_edge_sourceRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_25_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, egw,
					ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_211(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_26_2_blackFFFFFB(_edge_outgoing)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_26_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, egw,
					ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_212(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_27_2_blackFFFFFB(_edge_targetRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_27_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, egw,
					ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_213(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_28_2_blackFFFFFB(_edge_incoming)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_28_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, egw,
					ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_28_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_214(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_29_2_blackFFFFFB(_edge___conv)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_29_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, egw,
					ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_29_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_29_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EG2ChoiceSeq");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.FlowNode prevNode = (SimpleBPMN.FlowNode) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		SimpleUseCase.Step prevStep = (SimpleUseCase.Step) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2ps")).findAny();
		Bpmn2UseCase.FN2S pn2ps = (Bpmn2UseCase.FN2S) matchForPn2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ChoiceStep step = (SimpleUseCase.ChoiceStep) matchForStep.get().getNode();

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
		Bpmn2UseCase.GW2S egwToStep = (Bpmn2UseCase.GW2S) matchForEgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgw")).findAny();
		SimpleBPMN.ExclusiveGateway ecgw = (SimpleBPMN.ExclusiveGateway) matchForEcgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgwToStep")).findAny();
		Bpmn2UseCase.GW2S ecgwToStep = (Bpmn2UseCase.GW2S) matchForEcgwToStep.get().getNode();

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

		eq0.setRuleName("EG2ChoiceSeq");
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
		ruleResult.setRule("EG2ChoiceSeq");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.FlowNode prevNode = (SimpleBPMN.FlowNode) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		SimpleUseCase.Step prevStep = (SimpleUseCase.Step) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2ps")).findAny();
		Bpmn2UseCase.FN2S pn2ps = (Bpmn2UseCase.FN2S) matchForPn2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ChoiceStep step = (SimpleUseCase.ChoiceStep) matchForStep.get().getNode();

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
		Bpmn2UseCase.GW2S egwToStep = (Bpmn2UseCase.GW2S) matchForEgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgw")).findAny();
		SimpleBPMN.ExclusiveGateway ecgw = (SimpleBPMN.ExclusiveGateway) matchForEcgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgwToStep")).findAny();
		Bpmn2UseCase.GW2S ecgwToStep = (Bpmn2UseCase.GW2S) matchForEcgwToStep.get().getNode();

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

		eq0.setRuleName("EG2ChoiceSeq");
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
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// prepare
		Object[] result1_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_32_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_32_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_32_2_bindingFFFFFFFFBB(sourceMatch,
				targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		FlowNode prevNode = (FlowNode) result2_binding[0];
		Step prevStep = (Step) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		ChoiceStep step = (ChoiceStep) result2_binding[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[4];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[5];
		ExclusiveGateway egw = (ExclusiveGateway) result2_binding[6];
		ExclusiveGateway ecgw = (ExclusiveGateway) result2_binding[7];
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_32_2_blackBBFBBBBBBBB(prevNode, prevStep,
				flow, step, process, sf1, egw, ecgw, sourceMatch, targetMatch)) {
			FN2S pn2ps = (FN2S) result2_black[2];
			Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_32_2_greenBBBBBBBBBBBF(prevNode, prevStep,
					pn2ps, flow, step, process, sf1, egw, ecgw, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[11];

			// check csp
			Object[] result3_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_32_3_bindingAndBlackFBBBBBBBBBBBBB(
					this, isApplicableMatch, prevNode, prevStep, pn2ps, flow, step, process, sf1, egw, ecgw,
					sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_32_4_blackBB(result, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_32_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_32_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, FlowNode prevNode, Step prevStep,
			FN2S pn2ps, Flow flow, ChoiceStep step, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw.id", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_egw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("pn2ps", pn2ps);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("step", step);
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
		Object[] result1_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_35_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = EG2ChoiceSeqImpl
				.pattern_EG2ChoiceSeq_35_2_bindingAndBlackFFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// FlowNode prevNode = (FlowNode) result2_bindingAndBlack[0];
		// Step prevStep = (Step) result2_bindingAndBlack[1];
		// FN2S pn2ps = (FN2S) result2_bindingAndBlack[2];
		// Flow flow = (Flow) result2_bindingAndBlack[3];
		ChoiceStep step = (ChoiceStep) result2_bindingAndBlack[4];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[5];
		// SequenceFlow sf1 = (SequenceFlow) result2_bindingAndBlack[6];
		ExclusiveGateway egw = (ExclusiveGateway) result2_bindingAndBlack[7];
		ExclusiveGateway ecgw = (ExclusiveGateway) result2_bindingAndBlack[8];
		Object[] result2_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_35_2_greenBBBFFF(step, egw, ecgw);
		PerformRuleResult result = (PerformRuleResult) result2_green[3];
		// GW2S egwToStep = (GW2S) result2_green[4];
		// GW2S ecgwToStep = (GW2S) result2_green[5];

		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_35_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, FN2S pn2psParameter) {
		// create result
		Object[] result1_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_36_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_36_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_36_2_blackFFFFFFBB(ruleEntryContainer,
				ruleResult)) {
			// RuleEntryList pn2psList = (RuleEntryList) result2_black[0];
			FlowNode prevNode = (FlowNode) result2_black[1];
			FN2S pn2ps = (FN2S) result2_black[2];
			Step prevStep = (Step) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[5];

			// solve CSP
			Object[] result3_bindingAndBlack = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_36_3_bindingAndBlackFBBBBBBBB(this,
					isApplicableMatch, prevNode, prevStep, pn2ps, flow, process, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[prevNode] = " + prevNode
						+ ", " + "[prevStep] = " + prevStep + ", " + "[pn2ps] = " + pn2ps + ", " + "[flow] = " + flow
						+ ", " + "[process] = " + process + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_36_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_36_5_blackBBBBB(prevNode, prevStep,
						pn2ps, flow, process);
				if (result5_black != null) {

					// perform
					Object[] result6_black = EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_36_6_blackBBBBBB(prevNode, prevStep,
							pn2ps, flow, process, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[prevNode] = " + prevNode + ", " + "[prevStep] = " + prevStep + ", " + "[pn2ps] = "
								+ pn2ps + ", " + "[flow] = " + flow + ", " + "[process] = " + process + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_36_6_greenBBBFBFFFFFBB(prevNode, prevStep, flow, process,
							ruleResult, csp);
					// ChoiceStep step = (ChoiceStep) result6_green[3];
					// SequenceFlow sf1 = (SequenceFlow) result6_green[5];
					// ExclusiveGateway egw = (ExclusiveGateway) result6_green[6];
					// GW2S egwToStep = (GW2S) result6_green[7];
					// ExclusiveGateway ecgw = (ExclusiveGateway) result6_green[8];
					// GW2S ecgwToStep = (GW2S) result6_green[9];

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceSeqImpl.pattern_EG2ChoiceSeq_36_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FlowNode prevNode, Step prevStep,
			FN2S pn2ps, Flow flow, SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw.id", csp);
		var_egw_id.setType("String");
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
		isApplicableMatch.registerObject("pn2ps", pn2ps);
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
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
		case RulesPackage.EG2_CHOICE_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
			return null;
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FLOWNODE_STEP_FN2S_FLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (FlowNode) arguments.get(1),
					(Step) arguments.get(2), (FN2S) arguments.get(3), (Flow) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5), (SequenceFlow) arguments.get(6),
					(ExclusiveGateway) arguments.get(7), (ExclusiveGateway) arguments.get(8));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.EG2_CHOICE_SEQ___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_BWD__MATCH_STEP_FLOW_CHOICESTEP:
			return isAppropriate_BWD((Match) arguments.get(0), (Step) arguments.get(1), (Flow) arguments.get(2),
					(ChoiceStep) arguments.get(3));
		case RulesPackage.EG2_CHOICE_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_FLOW_CHOICESTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Step) arguments.get(1), (Flow) arguments.get(2),
					(ChoiceStep) arguments.get(3));
			return null;
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_FLOW_CHOICESTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Step) arguments.get(1),
					(Flow) arguments.get(2), (ChoiceStep) arguments.get(3));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOWNODE_STEP_FN2S_FLOW_CHOICESTEP_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FlowNode) arguments.get(1),
					(Step) arguments.get(2), (FN2S) arguments.get(3), (Flow) arguments.get(4),
					(ChoiceStep) arguments.get(5), (SimpleBPMN.Process) arguments.get(6));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.EG2_CHOICE_SEQ___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_65__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_65((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_66__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_66((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_207__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_207((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_208__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_208((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_209__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_209((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_210__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_210((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_211__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_211((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_212__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_212((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_213__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_213((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_214__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_214((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FLOWNODE_STEP_FN2S_FLOW_CHOICESTEP_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (FlowNode) arguments.get(1),
					(Step) arguments.get(2), (FN2S) arguments.get(3), (Flow) arguments.get(4),
					(ChoiceStep) arguments.get(5), (SimpleBPMN.Process) arguments.get(6),
					(SequenceFlow) arguments.get(7), (ExclusiveGateway) arguments.get(8),
					(ExclusiveGateway) arguments.get(9), (Match) arguments.get(10), (Match) arguments.get(11));
		case RulesPackage.EG2_CHOICE_SEQ___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.EG2_CHOICE_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S:
			return generateModel((RuleEntryContainer) arguments.get(0), (FN2S) arguments.get(1));
		case RulesPackage.EG2_CHOICE_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOWNODE_STEP_FN2S_FLOW_PROCESS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FlowNode) arguments.get(1),
					(Step) arguments.get(2), (FN2S) arguments.get(3), (Flow) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5), (ModelgeneratorRuleResult) arguments.get(6));
		case RulesPackage.EG2_CHOICE_SEQ___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EG2ChoiceSeq_0_1_blackBBBBBBB(EG2ChoiceSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
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

	public static final Object[] pattern_EG2ChoiceSeq_0_2_bindingFBBBBBBB(EG2ChoiceSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, process, sf1, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, process, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EG2ChoiceSeq_0_2_bindingAndBlackFBBBBBBB(EG2ChoiceSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		Object[] result_pattern_EG2ChoiceSeq_0_2_binding = pattern_EG2ChoiceSeq_0_2_bindingFBBBBBBB(_this, match,
				prevNode, process, sf1, egw, ecgw);
		if (result_pattern_EG2ChoiceSeq_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_EG2ChoiceSeq_0_2_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_0_2_black = pattern_EG2ChoiceSeq_0_2_blackB(csp);
			if (result_pattern_EG2ChoiceSeq_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, process, sf1, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_EG2ChoiceSeq_0_3_expressionFBB(EG2ChoiceSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_0_4_blackBBBBBB(Match match, FlowNode prevNode,
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

	public static final Object[] pattern_EG2ChoiceSeq_0_4_greenBBBBBBFFFFFFFF(Match match, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
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

	public static final Object[] pattern_EG2ChoiceSeq_0_5_blackBBBBBB(Match match, FlowNode prevNode,
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

	public static final Object[] pattern_EG2ChoiceSeq_0_5_greenBBBF(Match match, FlowNode prevNode,
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

	public static final void pattern_EG2ChoiceSeq_0_6_expressionBBBBBBB(EG2ChoiceSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		_this.registerObjectsToMatch_FWD(match, prevNode, process, sf1, egw, ecgw);

	}

	public static final boolean pattern_EG2ChoiceSeq_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceSeq_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_1_1_bindingFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("pn2ps");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_6 = isApplicableMatch.getObject("egw");
		EObject _localVariable_7 = isApplicableMatch.getObject("ecgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpPn2ps = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpSf1 = _localVariable_5;
		EObject tmpEgw = _localVariable_6;
		EObject tmpEcgw = _localVariable_7;
		if (tmpPrevNode instanceof FlowNode) {
			FlowNode prevNode = (FlowNode) tmpPrevNode;
			if (tmpPrevStep instanceof Step) {
				Step prevStep = (Step) tmpPrevStep;
				if (tmpPn2ps instanceof FN2S) {
					FN2S pn2ps = (FN2S) tmpPn2ps;
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
										return new Object[] { prevNode, prevStep, pn2ps, flow, process, sf1, egw, ecgw,
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

	public static final Object[] pattern_EG2ChoiceSeq_1_1_blackBBBBBBBBBFB(FlowNode prevNode, Step prevStep, FN2S pn2ps,
			Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw,
			EG2ChoiceSeq _this, IsApplicableMatch isApplicableMatch) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { prevNode, prevStep, pn2ps, flow, process, sf1, egw, ecgw, _this, csp,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_1_1_bindingAndBlackFFFFFFFFBFB(EG2ChoiceSeq _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EG2ChoiceSeq_1_1_binding = pattern_EG2ChoiceSeq_1_1_bindingFFFFFFFFB(isApplicableMatch);
		if (result_pattern_EG2ChoiceSeq_1_1_binding != null) {
			FlowNode prevNode = (FlowNode) result_pattern_EG2ChoiceSeq_1_1_binding[0];
			Step prevStep = (Step) result_pattern_EG2ChoiceSeq_1_1_binding[1];
			FN2S pn2ps = (FN2S) result_pattern_EG2ChoiceSeq_1_1_binding[2];
			Flow flow = (Flow) result_pattern_EG2ChoiceSeq_1_1_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EG2ChoiceSeq_1_1_binding[4];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_EG2ChoiceSeq_1_1_binding[5];
			ExclusiveGateway egw = (ExclusiveGateway) result_pattern_EG2ChoiceSeq_1_1_binding[6];
			ExclusiveGateway ecgw = (ExclusiveGateway) result_pattern_EG2ChoiceSeq_1_1_binding[7];

			Object[] result_pattern_EG2ChoiceSeq_1_1_black = pattern_EG2ChoiceSeq_1_1_blackBBBBBBBBBFB(prevNode,
					prevStep, pn2ps, flow, process, sf1, egw, ecgw, _this, isApplicableMatch);
			if (result_pattern_EG2ChoiceSeq_1_1_black != null) {
				CSP csp = (CSP) result_pattern_EG2ChoiceSeq_1_1_black[9];

				return new Object[] { prevNode, prevStep, pn2ps, flow, process, sf1, egw, ecgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_1_1_greenBBFBFBFB(Step prevStep, Flow flow, ExclusiveGateway egw,
			ExclusiveGateway ecgw, CSP csp) {
		ChoiceStep step = SimpleUseCaseFactory.eINSTANCE.createChoiceStep();
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

	public static final Object[] pattern_EG2ChoiceSeq_1_2_blackBBBBBB(ChoiceStep step, SequenceFlow sf1,
			ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { step, sf1, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_1_2_greenFBBBBBB(ChoiceStep step, SequenceFlow sf1,
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

	public static final Object[] pattern_EG2ChoiceSeq_1_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject prevStep, EObject pn2ps, EObject flow, EObject step, EObject process, EObject sf1,
			EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		if (!prevNode.equals(prevStep)) {
			if (!prevNode.equals(step)) {
				if (!prevNode.equals(process)) {
					if (!prevNode.equals(sf1)) {
						if (!prevStep.equals(step)) {
							if (!prevStep.equals(process)) {
								if (!prevStep.equals(sf1)) {
									if (!pn2ps.equals(prevNode)) {
										if (!pn2ps.equals(prevStep)) {
											if (!pn2ps.equals(step)) {
												if (!pn2ps.equals(process)) {
													if (!pn2ps.equals(sf1)) {
														if (!flow.equals(prevNode)) {
															if (!flow.equals(prevStep)) {
																if (!flow.equals(pn2ps)) {
																	if (!flow.equals(step)) {
																		if (!flow.equals(process)) {
																			if (!flow.equals(sf1)) {
																				if (!process.equals(step)) {
																					if (!process.equals(sf1)) {
																						if (!sf1.equals(step)) {
																							if (!egw.equals(prevNode)) {
																								if (!egw.equals(
																										prevStep)) {
																									if (!egw.equals(
																											pn2ps)) {
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
																																		.equals(prevStep)) {
																																	if (!egwToStep
																																			.equals(pn2ps)) {
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
																																									.equals(prevStep)) {
																																								if (!ecgw
																																										.equals(pn2ps)) {
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
																																																			.equals(prevStep)) {
																																																		if (!ecgwToStep
																																																				.equals(pn2ps)) {
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
																																																											prevStep,
																																																											pn2ps,
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
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject prevNode, EObject prevStep, EObject flow, EObject step, EObject process, EObject sf1, EObject egw,
			EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
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
		String ruleresult_ruleName_prime = "EG2ChoiceSeq";
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

	public static final void pattern_EG2ChoiceSeq_1_5_expressionBBBBBBBBBBBBB(EG2ChoiceSeq _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject pn2ps, EObject flow, EObject step,
			EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_FWD(ruleresult, prevNode, prevStep, pn2ps, flow, step, process, sf1, egw, egwToStep, ecgw,
				ecgwToStep);

	}

	public static final PerformRuleResult pattern_EG2ChoiceSeq_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_2_1_bindingFB(EG2ChoiceSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_2_1_blackFBB(EClass eClass, EG2ChoiceSeq _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_2_1_bindingAndBlackFFB(EG2ChoiceSeq _this) {
		Object[] result_pattern_EG2ChoiceSeq_2_1_binding = pattern_EG2ChoiceSeq_2_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceSeq_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EG2ChoiceSeq_2_1_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_2_1_black = pattern_EG2ChoiceSeq_2_1_blackFBB(eClass, _this);
			if (result_pattern_EG2ChoiceSeq_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EG2ChoiceSeq_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EG2ChoiceSeq";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EG2ChoiceSeq_2_2_bindingFFFFFB(Match match) {
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
		if (tmpPrevNode instanceof FlowNode) {
			FlowNode prevNode = (FlowNode) tmpPrevNode;
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

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_2_2_blackBFFBBBBB(FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					boolean egwisDiverging = egw.isIsDiverging();
					if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
						boolean ecgwisDiverging = ecgw.isIsDiverging();
						if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
							for (FN2S pn2ps : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(prevNode, FN2S.class, "source")) {
								Step prevStep = pn2ps.getTarget();
								if (prevStep != null) {
									_result.add(
											new Object[] { prevNode, prevStep, pn2ps, process, sf1, egw, ecgw, match });
								}

							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_2_3_blackBBBFBBBB(FlowNode prevNode, Step prevStep,
			FN2S pn2ps, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (prevNode.equals(pn2ps.getSource())) {
						if (prevStep.equals(pn2ps.getTarget())) {
							if (process.getFlowElements().contains(prevNode)) {
								if (process.getFlowElements().contains(sf1)) {
									if (process.getFlowElements().contains(egw)) {
										if (process.getFlowElements().contains(ecgw)) {
											if (prevNode.equals(sf1.getSourceRef())) {
												if (egw.equals(sf1.getTargetRef())) {
													if (ecgw.equals(egw.get__conv())) {
														boolean egwisDiverging = egw.isIsDiverging();
														if (Boolean.valueOf(egwisDiverging)
																.equals(Boolean.valueOf(true))) {
															boolean ecgwisDiverging = ecgw.isIsDiverging();
															if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
																for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(prevStep, Flow.class,
																				"steps")) {
																	_result.add(new Object[] { prevNode, prevStep,
																			pn2ps, flow, process, sf1, egw, ecgw });
																}
															}

														}

													}
												}
											}
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

	public static final Object[] pattern_EG2ChoiceSeq_2_3_greenBBBBBBBBFFFFFFFFFFFFF(FlowNode prevNode, Step prevStep,
			FN2S pn2ps, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pn2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2ps__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String pn2ps__prevNode____source_name_prime = "source";
		String pn2ps__prevStep____target_name_prime = "target";
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
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(pn2ps);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(egw);
		isApplicableMatch.getAllContextElements().add(ecgw);
		pn2ps__prevNode____source.setSrc(pn2ps);
		pn2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2ps__prevNode____source);
		pn2ps__prevStep____target.setSrc(pn2ps);
		pn2ps__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(pn2ps__prevStep____target);
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
		pn2ps__prevNode____source.setName(pn2ps__prevNode____source_name_prime);
		pn2ps__prevStep____target.setName(pn2ps__prevStep____target_name_prime);
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
		return new Object[] { prevNode, prevStep, pn2ps, flow, process, sf1, egw, ecgw, isApplicableMatch,
				pn2ps__prevNode____source, pn2ps__prevStep____target, flow__prevStep____steps,
				process__prevNode____flowElements, process__sf1____flowElements, process__egw____flowElements,
				process__ecgw____flowElements, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv };
	}

	public static final Object[] pattern_EG2ChoiceSeq_2_4_bindingFBBBBBBBBBB(EG2ChoiceSeq _this,
			IsApplicableMatch isApplicableMatch, FlowNode prevNode, Step prevStep, FN2S pn2ps, Flow flow,
			SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, prevNode, prevStep, pn2ps, flow,
				process, sf1, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, prevStep, pn2ps, flow, process, sf1, egw,
					ecgw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EG2ChoiceSeq_2_4_bindingAndBlackFBBBBBBBBBB(EG2ChoiceSeq _this,
			IsApplicableMatch isApplicableMatch, FlowNode prevNode, Step prevStep, FN2S pn2ps, Flow flow,
			SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		Object[] result_pattern_EG2ChoiceSeq_2_4_binding = pattern_EG2ChoiceSeq_2_4_bindingFBBBBBBBBBB(_this,
				isApplicableMatch, prevNode, prevStep, pn2ps, flow, process, sf1, egw, ecgw);
		if (result_pattern_EG2ChoiceSeq_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_EG2ChoiceSeq_2_4_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_2_4_black = pattern_EG2ChoiceSeq_2_4_blackB(csp);
			if (result_pattern_EG2ChoiceSeq_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, prevStep, pn2ps, flow, process, sf1, egw,
						ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_EG2ChoiceSeq_2_5_expressionFBB(EG2ChoiceSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EG2ChoiceSeq_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EG2ChoiceSeq";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EG2ChoiceSeq_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_10_1_blackBBBBB(EG2ChoiceSeq _this, Match match, Step prevStep,
			Flow flow, ChoiceStep step) {
		if (!prevStep.equals(step)) {
			return new Object[] { _this, match, prevStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_10_2_bindingFBBBBB(EG2ChoiceSeq _this, Match match, Step prevStep,
			Flow flow, ChoiceStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, prevStep, flow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EG2ChoiceSeq_10_2_bindingAndBlackFBBBBB(EG2ChoiceSeq _this, Match match,
			Step prevStep, Flow flow, ChoiceStep step) {
		Object[] result_pattern_EG2ChoiceSeq_10_2_binding = pattern_EG2ChoiceSeq_10_2_bindingFBBBBB(_this, match,
				prevStep, flow, step);
		if (result_pattern_EG2ChoiceSeq_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_EG2ChoiceSeq_10_2_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_10_2_black = pattern_EG2ChoiceSeq_10_2_blackB(csp);
			if (result_pattern_EG2ChoiceSeq_10_2_black != null) {

				return new Object[] { csp, _this, match, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_EG2ChoiceSeq_10_3_expressionFBB(EG2ChoiceSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_10_4_blackBBBB(Match match, Step prevStep, Flow flow,
			ChoiceStep step) {
		if (!prevStep.equals(step)) {
			return new Object[] { match, prevStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_10_4_greenBBBBFF(Match match, Step prevStep, Flow flow,
			ChoiceStep step) {
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

	public static final Object[] pattern_EG2ChoiceSeq_10_5_blackBBBB(Match match, Step prevStep, Flow flow,
			ChoiceStep step) {
		if (!prevStep.equals(step)) {
			return new Object[] { match, prevStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_10_5_greenBBBF(Match match, Step prevStep, Flow flow) {
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

	public static final void pattern_EG2ChoiceSeq_10_6_expressionBBBBB(EG2ChoiceSeq _this, Match match, Step prevStep,
			Flow flow, ChoiceStep step) {
		_this.registerObjectsToMatch_BWD(match, prevStep, flow, step);

	}

	public static final boolean pattern_EG2ChoiceSeq_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceSeq_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_11_1_bindingFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("pn2ps");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("step");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpPn2ps = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpStep = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		if (tmpPrevNode instanceof FlowNode) {
			FlowNode prevNode = (FlowNode) tmpPrevNode;
			if (tmpPrevStep instanceof Step) {
				Step prevStep = (Step) tmpPrevStep;
				if (tmpPn2ps instanceof FN2S) {
					FN2S pn2ps = (FN2S) tmpPn2ps;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpStep instanceof ChoiceStep) {
							ChoiceStep step = (ChoiceStep) tmpStep;
							if (tmpProcess instanceof SimpleBPMN.Process) {
								SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
								return new Object[] { prevNode, prevStep, pn2ps, flow, step, process,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_11_1_blackBBBBBBBFB(FlowNode prevNode, Step prevStep, FN2S pn2ps,
			Flow flow, ChoiceStep step, SimpleBPMN.Process process, EG2ChoiceSeq _this,
			IsApplicableMatch isApplicableMatch) {
		if (!prevStep.equals(step)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { prevNode, prevStep, pn2ps, flow, step, process, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_11_1_bindingAndBlackFFFFFFBFB(EG2ChoiceSeq _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EG2ChoiceSeq_11_1_binding = pattern_EG2ChoiceSeq_11_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_EG2ChoiceSeq_11_1_binding != null) {
			FlowNode prevNode = (FlowNode) result_pattern_EG2ChoiceSeq_11_1_binding[0];
			Step prevStep = (Step) result_pattern_EG2ChoiceSeq_11_1_binding[1];
			FN2S pn2ps = (FN2S) result_pattern_EG2ChoiceSeq_11_1_binding[2];
			Flow flow = (Flow) result_pattern_EG2ChoiceSeq_11_1_binding[3];
			ChoiceStep step = (ChoiceStep) result_pattern_EG2ChoiceSeq_11_1_binding[4];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EG2ChoiceSeq_11_1_binding[5];

			Object[] result_pattern_EG2ChoiceSeq_11_1_black = pattern_EG2ChoiceSeq_11_1_blackBBBBBBBFB(prevNode,
					prevStep, pn2ps, flow, step, process, _this, isApplicableMatch);
			if (result_pattern_EG2ChoiceSeq_11_1_black != null) {
				CSP csp = (CSP) result_pattern_EG2ChoiceSeq_11_1_black[7];

				return new Object[] { prevNode, prevStep, pn2ps, flow, step, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_11_1_greenBBBFFFFFB(FlowNode prevNode, ChoiceStep step,
			SimpleBPMN.Process process, CSP csp) {
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

	public static final Object[] pattern_EG2ChoiceSeq_11_2_blackBBBBBB(ChoiceStep step, SequenceFlow sf1,
			ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { step, sf1, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_11_2_greenFBBBBBB(ChoiceStep step, SequenceFlow sf1,
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

	public static final Object[] pattern_EG2ChoiceSeq_11_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject prevStep, EObject pn2ps, EObject flow, EObject step, EObject process, EObject sf1,
			EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		if (!prevNode.equals(prevStep)) {
			if (!prevNode.equals(step)) {
				if (!prevNode.equals(process)) {
					if (!prevNode.equals(sf1)) {
						if (!prevStep.equals(step)) {
							if (!prevStep.equals(process)) {
								if (!prevStep.equals(sf1)) {
									if (!pn2ps.equals(prevNode)) {
										if (!pn2ps.equals(prevStep)) {
											if (!pn2ps.equals(step)) {
												if (!pn2ps.equals(process)) {
													if (!pn2ps.equals(sf1)) {
														if (!flow.equals(prevNode)) {
															if (!flow.equals(prevStep)) {
																if (!flow.equals(pn2ps)) {
																	if (!flow.equals(step)) {
																		if (!flow.equals(process)) {
																			if (!flow.equals(sf1)) {
																				if (!process.equals(step)) {
																					if (!process.equals(sf1)) {
																						if (!sf1.equals(step)) {
																							if (!egw.equals(prevNode)) {
																								if (!egw.equals(
																										prevStep)) {
																									if (!egw.equals(
																											pn2ps)) {
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
																																		.equals(prevStep)) {
																																	if (!egwToStep
																																			.equals(pn2ps)) {
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
																																									.equals(prevStep)) {
																																								if (!ecgw
																																										.equals(pn2ps)) {
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
																																																			.equals(prevStep)) {
																																																		if (!ecgwToStep
																																																				.equals(pn2ps)) {
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
																																																											prevStep,
																																																											pn2ps,
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
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject prevNode, EObject prevStep, EObject flow, EObject step, EObject process, EObject sf1, EObject egw,
			EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
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
		String ruleresult_ruleName_prime = "EG2ChoiceSeq";
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

	public static final void pattern_EG2ChoiceSeq_11_5_expressionBBBBBBBBBBBBB(EG2ChoiceSeq _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject pn2ps, EObject flow, EObject step,
			EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_BWD(ruleresult, prevNode, prevStep, pn2ps, flow, step, process, sf1, egw, egwToStep, ecgw,
				ecgwToStep);

	}

	public static final PerformRuleResult pattern_EG2ChoiceSeq_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_12_1_bindingFB(EG2ChoiceSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_12_1_blackFBB(EClass eClass, EG2ChoiceSeq _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_12_1_bindingAndBlackFFB(EG2ChoiceSeq _this) {
		Object[] result_pattern_EG2ChoiceSeq_12_1_binding = pattern_EG2ChoiceSeq_12_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceSeq_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EG2ChoiceSeq_12_1_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_12_1_black = pattern_EG2ChoiceSeq_12_1_blackFBB(eClass, _this);
			if (result_pattern_EG2ChoiceSeq_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EG2ChoiceSeq_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EG2ChoiceSeq";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EG2ChoiceSeq_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevStep");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("step");
		EObject tmpPrevStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		if (tmpPrevStep instanceof Step) {
			Step prevStep = (Step) tmpPrevStep;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpStep instanceof ChoiceStep) {
					ChoiceStep step = (ChoiceStep) tmpStep;
					return new Object[] { prevStep, flow, step, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_12_2_blackFBFBBB(Step prevStep, Flow flow,
			ChoiceStep step, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevStep.equals(step)) {
			for (FN2S pn2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevStep, FN2S.class,
					"target")) {
				FlowNode prevNode = pn2ps.getSource();
				if (prevNode != null) {
					_result.add(new Object[] { prevNode, prevStep, pn2ps, flow, step, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_12_3_blackBBBBBF(FlowNode prevNode, Step prevStep,
			FN2S pn2ps, Flow flow, ChoiceStep step) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevStep.equals(step)) {
			if (step.equals(prevStep.getNext())) {
				if (prevNode.equals(pn2ps.getSource())) {
					if (prevStep.equals(pn2ps.getTarget())) {
						if (flow.getSteps().contains(prevStep)) {
							if (flow.getSteps().contains(step)) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
												"flowElements")) {
									_result.add(new Object[] { prevNode, prevStep, pn2ps, flow, step, process });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_12_3_greenBBBBBBFFFFFFF(FlowNode prevNode, Step prevStep,
			FN2S pn2ps, Flow flow, ChoiceStep step, SimpleBPMN.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2ps__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String prevStep__step____next_name_prime = "next";
		String pn2ps__prevNode____source_name_prime = "source";
		String pn2ps__prevStep____target_name_prime = "target";
		String flow__prevStep____steps_name_prime = "steps";
		String flow__step____steps_name_prime = "steps";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(pn2ps);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(process);
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		isApplicableMatch.getAllContextElements().add(prevStep__step____next);
		pn2ps__prevNode____source.setSrc(pn2ps);
		pn2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2ps__prevNode____source);
		pn2ps__prevStep____target.setSrc(pn2ps);
		pn2ps__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(pn2ps__prevStep____target);
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
		pn2ps__prevNode____source.setName(pn2ps__prevNode____source_name_prime);
		pn2ps__prevStep____target.setName(pn2ps__prevStep____target_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { prevNode, prevStep, pn2ps, flow, step, process, isApplicableMatch, prevStep__step____next,
				pn2ps__prevNode____source, pn2ps__prevStep____target, flow__prevStep____steps, flow__step____steps,
				process__prevNode____flowElements };
	}

	public static final Object[] pattern_EG2ChoiceSeq_12_4_bindingFBBBBBBBB(EG2ChoiceSeq _this,
			IsApplicableMatch isApplicableMatch, FlowNode prevNode, Step prevStep, FN2S pn2ps, Flow flow,
			ChoiceStep step, SimpleBPMN.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, prevNode, prevStep, pn2ps, flow, step,
				process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, prevStep, pn2ps, flow, step, process };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EG2ChoiceSeq_12_4_bindingAndBlackFBBBBBBBB(EG2ChoiceSeq _this,
			IsApplicableMatch isApplicableMatch, FlowNode prevNode, Step prevStep, FN2S pn2ps, Flow flow,
			ChoiceStep step, SimpleBPMN.Process process) {
		Object[] result_pattern_EG2ChoiceSeq_12_4_binding = pattern_EG2ChoiceSeq_12_4_bindingFBBBBBBBB(_this,
				isApplicableMatch, prevNode, prevStep, pn2ps, flow, step, process);
		if (result_pattern_EG2ChoiceSeq_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_EG2ChoiceSeq_12_4_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_12_4_black = pattern_EG2ChoiceSeq_12_4_blackB(csp);
			if (result_pattern_EG2ChoiceSeq_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, prevStep, pn2ps, flow, step, process };
			}
		}
		return null;
	}

	public static final boolean pattern_EG2ChoiceSeq_12_5_expressionFBB(EG2ChoiceSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EG2ChoiceSeq_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EG2ChoiceSeq";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EG2ChoiceSeq_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_20_1_bindingFB(EG2ChoiceSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_20_1_blackFBB(EClass __eClass, EG2ChoiceSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_20_1_bindingAndBlackFFB(EG2ChoiceSeq _this) {
		Object[] result_pattern_EG2ChoiceSeq_20_1_binding = pattern_EG2ChoiceSeq_20_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceSeq_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceSeq_20_1_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_20_1_black = pattern_EG2ChoiceSeq_20_1_blackFBB(__eClass, _this);
			if (result_pattern_EG2ChoiceSeq_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceSeq_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_20_2_black_nac_0BB(ChoiceStep step, Flow flow) {
		for (Flow __DEC_step_steps_383510 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_383510)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_20_2_black_nac_1BB(ChoiceStep step, Step prevStep) {
		if (!prevStep.equals(step)) {
			for (Step __DEC_step_next_228625 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_228625)) {
					if (!prevStep.equals(__DEC_step_next_228625)) {
						return new Object[] { step, prevStep };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_20_2_blackFFFB(EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevStep = _edge_next.getSrc();
		if (tmpPrevStep instanceof Step) {
			Step prevStep = (Step) tmpPrevStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof ChoiceStep) {
				ChoiceStep step = (ChoiceStep) tmpStep;
				if (!prevStep.equals(step)) {
					if (step.equals(prevStep.getNext())) {
						if (pattern_EG2ChoiceSeq_20_2_black_nac_1BB(step, prevStep) == null) {
							for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(prevStep, Flow.class, "steps")) {
								if (flow.getSteps().contains(step)) {
									if (pattern_EG2ChoiceSeq_20_2_black_nac_0BB(step, flow) == null) {
										_result.add(new Object[] { prevStep, flow, step, _edge_next });
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

	public static final Object[] pattern_EG2ChoiceSeq_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceSeq_20_3_expressionFBBBBB(EG2ChoiceSeq _this, Match match,
			Step prevStep, Flow flow, ChoiceStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceSeq_20_4_expressionFBB(EG2ChoiceSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceSeq_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_21_1_bindingFB(EG2ChoiceSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_21_1_blackFBB(EClass __eClass, EG2ChoiceSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_21_1_bindingAndBlackFFB(EG2ChoiceSeq _this) {
		Object[] result_pattern_EG2ChoiceSeq_21_1_binding = pattern_EG2ChoiceSeq_21_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceSeq_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceSeq_21_1_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_21_1_black = pattern_EG2ChoiceSeq_21_1_blackFBB(__eClass, _this);
			if (result_pattern_EG2ChoiceSeq_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceSeq_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_21_2_black_nac_0BB(ChoiceStep step, Flow flow) {
		for (Flow __DEC_step_steps_426309 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_426309)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_21_2_black_nac_1BB(ChoiceStep step, Step prevStep) {
		if (!prevStep.equals(step)) {
			for (Step __DEC_step_next_489278 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_489278)) {
					if (!prevStep.equals(__DEC_step_next_489278)) {
						return new Object[] { step, prevStep };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_21_2_blackFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ChoiceStep) {
				ChoiceStep step = (ChoiceStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_EG2ChoiceSeq_21_2_black_nac_0BB(step, flow) == null) {
						for (Step prevStep : flow.getSteps()) {
							if (!prevStep.equals(step)) {
								if (step.equals(prevStep.getNext())) {
									if (pattern_EG2ChoiceSeq_21_2_black_nac_1BB(step, prevStep) == null) {
										_result.add(new Object[] { prevStep, flow, step, _edge_steps });
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

	public static final Object[] pattern_EG2ChoiceSeq_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceSeq_21_3_expressionFBBBBB(EG2ChoiceSeq _this, Match match,
			Step prevStep, Flow flow, ChoiceStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceSeq_21_4_expressionFBB(EG2ChoiceSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceSeq_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_22_1_bindingFB(EG2ChoiceSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_22_1_blackFBB(EClass __eClass, EG2ChoiceSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_22_1_bindingAndBlackFFB(EG2ChoiceSeq _this) {
		Object[] result_pattern_EG2ChoiceSeq_22_1_binding = pattern_EG2ChoiceSeq_22_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceSeq_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceSeq_22_1_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_22_1_black = pattern_EG2ChoiceSeq_22_1_blackFBB(__eClass, _this);
			if (result_pattern_EG2ChoiceSeq_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceSeq_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_22_2_black_nac_0BBBB(SequenceFlow sf1, FlowNode prevNode,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_745836 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_745836)) {
							if (!egw.equals(__DEC_sf1_default_745836)) {
								if (!ecgw.equals(__DEC_sf1_default_745836)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_22_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_896163 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_896163)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_22_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_827705 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_827705)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_22_2_black_nac_3BBB(ExclusiveGateway egw, FlowNode prevNode,
			ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_785670 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_785670)) {
							if (!prevNode.equals(__DEC_egw___conv_785670)) {
								if (!ecgw.equals(__DEC_egw___conv_785670)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_22_2_black_nac_4BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_667493 = ecgw.get__conv();
					if (__DEC_ecgw___conv_667493 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_667493)) {
							if (!prevNode.equals(__DEC_ecgw___conv_667493)) {
								if (!egw.equals(__DEC_ecgw___conv_667493)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_22_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_558487 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_558487)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_22_2_black_nac_6BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_941983 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_941983)) {
							if (!prevNode.equals(__DEC_ecgw___conv_941983)) {
								if (!egw.equals(__DEC_ecgw___conv_941983)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_22_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_22_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_22_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpSf1 = _edge_flowElements.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (process.getFlowElements().contains(sf1)) {
					FlowNode prevNode = sf1.getSourceRef();
					if (prevNode != null) {
						if (process.getFlowElements().contains(prevNode)) {
							FlowNode tmpEgw = sf1.getTargetRef();
							if (tmpEgw instanceof ExclusiveGateway) {
								ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
								if (!egw.equals(prevNode)) {
									if (process.getFlowElements().contains(egw)) {
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
																if (pattern_EG2ChoiceSeq_22_2_black_nac_1BB(sf1,
																		process) == null) {
																	if (pattern_EG2ChoiceSeq_22_2_black_nac_2BB(egw,
																			process) == null) {
																		if (pattern_EG2ChoiceSeq_22_2_black_nac_7BB(egw,
																				sf1) == null) {
																			if (pattern_EG2ChoiceSeq_22_2_black_nac_0BBBB(
																					sf1, prevNode, egw, ecgw) == null) {
																				if (pattern_EG2ChoiceSeq_22_2_black_nac_3BBB(
																						egw, prevNode, ecgw) == null) {
																					if (pattern_EG2ChoiceSeq_22_2_black_nac_4BBB(
																							ecgw, prevNode,
																							egw) == null) {
																						if (pattern_EG2ChoiceSeq_22_2_black_nac_5BB(
																								ecgw,
																								process) == null) {
																							if (pattern_EG2ChoiceSeq_22_2_black_nac_6BBB(
																									ecgw, prevNode,
																									egw) == null) {
																								if (pattern_EG2ChoiceSeq_22_2_black_nac_8BB(
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

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceSeq_22_3_expressionFBBBBBBB(EG2ChoiceSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceSeq_22_4_expressionFBB(EG2ChoiceSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceSeq_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_23_1_bindingFB(EG2ChoiceSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_23_1_blackFBB(EClass __eClass, EG2ChoiceSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_23_1_bindingAndBlackFFB(EG2ChoiceSeq _this) {
		Object[] result_pattern_EG2ChoiceSeq_23_1_binding = pattern_EG2ChoiceSeq_23_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceSeq_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceSeq_23_1_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_23_1_black = pattern_EG2ChoiceSeq_23_1_blackFBB(__eClass, _this);
			if (result_pattern_EG2ChoiceSeq_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceSeq_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_23_2_black_nac_0BBBB(SequenceFlow sf1, FlowNode prevNode,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_164336 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_164336)) {
							if (!egw.equals(__DEC_sf1_default_164336)) {
								if (!ecgw.equals(__DEC_sf1_default_164336)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_23_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_106093 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_106093)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_23_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_733431 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_733431)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_23_2_black_nac_3BBB(ExclusiveGateway egw, FlowNode prevNode,
			ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_488337 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_488337)) {
							if (!prevNode.equals(__DEC_egw___conv_488337)) {
								if (!ecgw.equals(__DEC_egw___conv_488337)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_23_2_black_nac_4BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_26579 = ecgw.get__conv();
					if (__DEC_ecgw___conv_26579 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_26579)) {
							if (!prevNode.equals(__DEC_ecgw___conv_26579)) {
								if (!egw.equals(__DEC_ecgw___conv_26579)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_23_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_516201 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_516201)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_23_2_black_nac_6BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_335003 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_335003)) {
							if (!prevNode.equals(__DEC_ecgw___conv_335003)) {
								if (!egw.equals(__DEC_ecgw___conv_335003)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_23_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_23_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_23_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
										if (pattern_EG2ChoiceSeq_23_2_black_nac_2BB(egw, process) == null) {
											if (pattern_EG2ChoiceSeq_23_2_black_nac_5BB(ecgw, process) == null) {
												for (FlowElement tmpPrevNode : process.getFlowElements()) {
													if (tmpPrevNode instanceof FlowNode) {
														FlowNode prevNode = (FlowNode) tmpPrevNode;
														if (!egw.equals(prevNode)) {
															if (!ecgw.equals(prevNode)) {
																if (pattern_EG2ChoiceSeq_23_2_black_nac_3BBB(egw,
																		prevNode, ecgw) == null) {
																	if (pattern_EG2ChoiceSeq_23_2_black_nac_4BBB(ecgw,
																			prevNode, egw) == null) {
																		if (pattern_EG2ChoiceSeq_23_2_black_nac_6BBB(
																				ecgw, prevNode, egw) == null) {
																			for (FlowElement tmpSf1 : process
																					.getFlowElements()) {
																				if (tmpSf1 instanceof SequenceFlow) {
																					SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																					if (prevNode.equals(
																							sf1.getSourceRef())) {
																						if (egw.equals(
																								sf1.getTargetRef())) {
																							if (pattern_EG2ChoiceSeq_23_2_black_nac_0BBBB(
																									sf1, prevNode, egw,
																									ecgw) == null) {
																								if (pattern_EG2ChoiceSeq_23_2_black_nac_1BB(
																										sf1,
																										process) == null) {
																									if (pattern_EG2ChoiceSeq_23_2_black_nac_7BB(
																											egw,
																											sf1) == null) {
																										if (pattern_EG2ChoiceSeq_23_2_black_nac_8BB(
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

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceSeq_23_3_expressionFBBBBBBB(EG2ChoiceSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceSeq_23_4_expressionFBB(EG2ChoiceSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceSeq_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_24_1_bindingFB(EG2ChoiceSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_24_1_blackFBB(EClass __eClass, EG2ChoiceSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_24_1_bindingAndBlackFFB(EG2ChoiceSeq _this) {
		Object[] result_pattern_EG2ChoiceSeq_24_1_binding = pattern_EG2ChoiceSeq_24_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceSeq_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceSeq_24_1_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_24_1_black = pattern_EG2ChoiceSeq_24_1_blackFBB(__eClass, _this);
			if (result_pattern_EG2ChoiceSeq_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceSeq_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_24_2_black_nac_0BBBB(SequenceFlow sf1, FlowNode prevNode,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_434995 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_434995)) {
							if (!egw.equals(__DEC_sf1_default_434995)) {
								if (!ecgw.equals(__DEC_sf1_default_434995)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_24_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_184153 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_184153)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_24_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_114709 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_114709)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_24_2_black_nac_3BBB(ExclusiveGateway egw, FlowNode prevNode,
			ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_828404 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_828404)) {
							if (!prevNode.equals(__DEC_egw___conv_828404)) {
								if (!ecgw.equals(__DEC_egw___conv_828404)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_24_2_black_nac_4BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_547624 = ecgw.get__conv();
					if (__DEC_ecgw___conv_547624 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_547624)) {
							if (!prevNode.equals(__DEC_ecgw___conv_547624)) {
								if (!egw.equals(__DEC_ecgw___conv_547624)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_24_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_289318 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_289318)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_24_2_black_nac_6BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_406152 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_406152)) {
							if (!prevNode.equals(__DEC_ecgw___conv_406152)) {
								if (!egw.equals(__DEC_ecgw___conv_406152)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_24_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_24_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_24_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
						if (pattern_EG2ChoiceSeq_24_2_black_nac_5BB(ecgw, process) == null) {
							for (FlowElement tmpPrevNode : process.getFlowElements()) {
								if (tmpPrevNode instanceof FlowNode) {
									FlowNode prevNode = (FlowNode) tmpPrevNode;
									if (!ecgw.equals(prevNode)) {
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
																		boolean egwisDiverging = egw.isIsDiverging();
																		if (Boolean.valueOf(egwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			if (pattern_EG2ChoiceSeq_24_2_black_nac_1BB(
																					sf1, process) == null) {
																				if (pattern_EG2ChoiceSeq_24_2_black_nac_8BB(
																						ecgw, sf1) == null) {
																					if (pattern_EG2ChoiceSeq_24_2_black_nac_0BBBB(
																							sf1, prevNode, egw,
																							ecgw) == null) {
																						if (pattern_EG2ChoiceSeq_24_2_black_nac_2BB(
																								egw, process) == null) {
																							if (pattern_EG2ChoiceSeq_24_2_black_nac_3BBB(
																									egw, prevNode,
																									ecgw) == null) {
																								if (pattern_EG2ChoiceSeq_24_2_black_nac_4BBB(
																										ecgw, prevNode,
																										egw) == null) {
																									if (pattern_EG2ChoiceSeq_24_2_black_nac_6BBB(
																											ecgw,
																											prevNode,
																											egw) == null) {
																										if (pattern_EG2ChoiceSeq_24_2_black_nac_7BB(
																												egw,
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

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceSeq_24_3_expressionFBBBBBBB(EG2ChoiceSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceSeq_24_4_expressionFBB(EG2ChoiceSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceSeq_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_25_1_bindingFB(EG2ChoiceSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_25_1_blackFBB(EClass __eClass, EG2ChoiceSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_25_1_bindingAndBlackFFB(EG2ChoiceSeq _this) {
		Object[] result_pattern_EG2ChoiceSeq_25_1_binding = pattern_EG2ChoiceSeq_25_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceSeq_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceSeq_25_1_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_25_1_black = pattern_EG2ChoiceSeq_25_1_blackFBB(__eClass, _this);
			if (result_pattern_EG2ChoiceSeq_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceSeq_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_25_2_black_nac_0BBBB(SequenceFlow sf1, FlowNode prevNode,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_140782 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_140782)) {
							if (!egw.equals(__DEC_sf1_default_140782)) {
								if (!ecgw.equals(__DEC_sf1_default_140782)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_25_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_990356 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_990356)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_25_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_509725 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_509725)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_25_2_black_nac_3BBB(ExclusiveGateway egw, FlowNode prevNode,
			ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_185414 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_185414)) {
							if (!prevNode.equals(__DEC_egw___conv_185414)) {
								if (!ecgw.equals(__DEC_egw___conv_185414)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_25_2_black_nac_4BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_799317 = ecgw.get__conv();
					if (__DEC_ecgw___conv_799317 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_799317)) {
							if (!prevNode.equals(__DEC_ecgw___conv_799317)) {
								if (!egw.equals(__DEC_ecgw___conv_799317)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_25_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_761816 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_761816)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_25_2_black_nac_6BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_488562 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_488562)) {
							if (!prevNode.equals(__DEC_ecgw___conv_488562)) {
								if (!egw.equals(__DEC_ecgw___conv_488562)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_25_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_25_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_25_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof FlowNode) {
				FlowNode prevNode = (FlowNode) tmpPrevNode;
				if (prevNode.equals(sf1.getSourceRef())) {
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
												if (pattern_EG2ChoiceSeq_25_2_black_nac_7BB(egw, sf1) == null) {
													if (pattern_EG2ChoiceSeq_25_2_black_nac_0BBBB(sf1, prevNode, egw,
															ecgw) == null) {
														if (pattern_EG2ChoiceSeq_25_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_EG2ChoiceSeq_25_2_black_nac_4BBB(ecgw, prevNode,
																	egw) == null) {
																if (pattern_EG2ChoiceSeq_25_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_EG2ChoiceSeq_25_2_black_nac_8BB(ecgw,
																			sf1) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(sf1,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(prevNode)) {
																				if (process.getFlowElements()
																						.contains(egw)) {
																					if (process.getFlowElements()
																							.contains(ecgw)) {
																						if (pattern_EG2ChoiceSeq_25_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_EG2ChoiceSeq_25_2_black_nac_2BB(
																									egw,
																									process) == null) {
																								if (pattern_EG2ChoiceSeq_25_2_black_nac_5BB(
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

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceSeq_25_3_expressionFBBBBBBB(EG2ChoiceSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceSeq_25_4_expressionFBB(EG2ChoiceSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceSeq_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_26_1_bindingFB(EG2ChoiceSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_26_1_blackFBB(EClass __eClass, EG2ChoiceSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_26_1_bindingAndBlackFFB(EG2ChoiceSeq _this) {
		Object[] result_pattern_EG2ChoiceSeq_26_1_binding = pattern_EG2ChoiceSeq_26_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceSeq_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceSeq_26_1_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_26_1_black = pattern_EG2ChoiceSeq_26_1_blackFBB(__eClass, _this);
			if (result_pattern_EG2ChoiceSeq_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceSeq_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_26_2_black_nac_0BBBB(SequenceFlow sf1, FlowNode prevNode,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_779194 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_779194)) {
							if (!egw.equals(__DEC_sf1_default_779194)) {
								if (!ecgw.equals(__DEC_sf1_default_779194)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_26_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_382483 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_382483)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_26_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_745610 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_745610)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_26_2_black_nac_3BBB(ExclusiveGateway egw, FlowNode prevNode,
			ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_822797 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_822797)) {
							if (!prevNode.equals(__DEC_egw___conv_822797)) {
								if (!ecgw.equals(__DEC_egw___conv_822797)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_26_2_black_nac_4BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_987817 = ecgw.get__conv();
					if (__DEC_ecgw___conv_987817 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_987817)) {
							if (!prevNode.equals(__DEC_ecgw___conv_987817)) {
								if (!egw.equals(__DEC_ecgw___conv_987817)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_26_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_390841 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_390841)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_26_2_black_nac_6BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_808033 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_808033)) {
							if (!prevNode.equals(__DEC_ecgw___conv_808033)) {
								if (!egw.equals(__DEC_ecgw___conv_808033)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_26_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_26_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_26_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof FlowNode) {
			FlowNode prevNode = (FlowNode) tmpPrevNode;
			EObject tmpSf1 = _edge_outgoing.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
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
												if (pattern_EG2ChoiceSeq_26_2_black_nac_7BB(egw, sf1) == null) {
													if (pattern_EG2ChoiceSeq_26_2_black_nac_0BBBB(sf1, prevNode, egw,
															ecgw) == null) {
														if (pattern_EG2ChoiceSeq_26_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_EG2ChoiceSeq_26_2_black_nac_4BBB(ecgw, prevNode,
																	egw) == null) {
																if (pattern_EG2ChoiceSeq_26_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_EG2ChoiceSeq_26_2_black_nac_8BB(ecgw,
																			sf1) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(prevNode,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(sf1)) {
																				if (process.getFlowElements()
																						.contains(egw)) {
																					if (process.getFlowElements()
																							.contains(ecgw)) {
																						if (pattern_EG2ChoiceSeq_26_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_EG2ChoiceSeq_26_2_black_nac_2BB(
																									egw,
																									process) == null) {
																								if (pattern_EG2ChoiceSeq_26_2_black_nac_5BB(
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

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceSeq_26_3_expressionFBBBBBBB(EG2ChoiceSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceSeq_26_4_expressionFBB(EG2ChoiceSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceSeq_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_27_1_bindingFB(EG2ChoiceSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_27_1_blackFBB(EClass __eClass, EG2ChoiceSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_27_1_bindingAndBlackFFB(EG2ChoiceSeq _this) {
		Object[] result_pattern_EG2ChoiceSeq_27_1_binding = pattern_EG2ChoiceSeq_27_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceSeq_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceSeq_27_1_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_27_1_black = pattern_EG2ChoiceSeq_27_1_blackFBB(__eClass, _this);
			if (result_pattern_EG2ChoiceSeq_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceSeq_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_27_2_black_nac_0BBBB(SequenceFlow sf1, FlowNode prevNode,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_390952 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_390952)) {
							if (!egw.equals(__DEC_sf1_default_390952)) {
								if (!ecgw.equals(__DEC_sf1_default_390952)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_27_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_45422 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_45422)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_27_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_70471 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_70471)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_27_2_black_nac_3BBB(ExclusiveGateway egw, FlowNode prevNode,
			ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_685336 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_685336)) {
							if (!prevNode.equals(__DEC_egw___conv_685336)) {
								if (!ecgw.equals(__DEC_egw___conv_685336)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_27_2_black_nac_4BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_866752 = ecgw.get__conv();
					if (__DEC_ecgw___conv_866752 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_866752)) {
							if (!prevNode.equals(__DEC_ecgw___conv_866752)) {
								if (!egw.equals(__DEC_ecgw___conv_866752)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_27_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_929230 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_929230)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_27_2_black_nac_6BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_555166 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_555166)) {
							if (!prevNode.equals(__DEC_ecgw___conv_555166)) {
								if (!egw.equals(__DEC_ecgw___conv_555166)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_27_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_27_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_27_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_targetRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpEgw = _edge_targetRef.getTrg();
			if (tmpEgw instanceof ExclusiveGateway) {
				ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
				if (egw.equals(sf1.getTargetRef())) {
					FlowNode prevNode = sf1.getSourceRef();
					if (prevNode != null) {
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
												if (pattern_EG2ChoiceSeq_27_2_black_nac_7BB(egw, sf1) == null) {
													if (pattern_EG2ChoiceSeq_27_2_black_nac_0BBBB(sf1, prevNode, egw,
															ecgw) == null) {
														if (pattern_EG2ChoiceSeq_27_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_EG2ChoiceSeq_27_2_black_nac_4BBB(ecgw, prevNode,
																	egw) == null) {
																if (pattern_EG2ChoiceSeq_27_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_EG2ChoiceSeq_27_2_black_nac_8BB(ecgw,
																			sf1) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(sf1,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(prevNode)) {
																				if (process.getFlowElements()
																						.contains(egw)) {
																					if (process.getFlowElements()
																							.contains(ecgw)) {
																						if (pattern_EG2ChoiceSeq_27_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_EG2ChoiceSeq_27_2_black_nac_2BB(
																									egw,
																									process) == null) {
																								if (pattern_EG2ChoiceSeq_27_2_black_nac_5BB(
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

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceSeq_27_3_expressionFBBBBBBB(EG2ChoiceSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceSeq_27_4_expressionFBB(EG2ChoiceSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceSeq_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_28_1_bindingFB(EG2ChoiceSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_28_1_blackFBB(EClass __eClass, EG2ChoiceSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_28_1_bindingAndBlackFFB(EG2ChoiceSeq _this) {
		Object[] result_pattern_EG2ChoiceSeq_28_1_binding = pattern_EG2ChoiceSeq_28_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceSeq_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceSeq_28_1_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_28_1_black = pattern_EG2ChoiceSeq_28_1_blackFBB(__eClass, _this);
			if (result_pattern_EG2ChoiceSeq_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceSeq_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_28_2_black_nac_0BBBB(SequenceFlow sf1, FlowNode prevNode,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_368723 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_368723)) {
							if (!egw.equals(__DEC_sf1_default_368723)) {
								if (!ecgw.equals(__DEC_sf1_default_368723)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_28_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_666108 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_666108)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_28_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_517562 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_517562)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_28_2_black_nac_3BBB(ExclusiveGateway egw, FlowNode prevNode,
			ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_932767 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_932767)) {
							if (!prevNode.equals(__DEC_egw___conv_932767)) {
								if (!ecgw.equals(__DEC_egw___conv_932767)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_28_2_black_nac_4BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_317297 = ecgw.get__conv();
					if (__DEC_ecgw___conv_317297 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_317297)) {
							if (!prevNode.equals(__DEC_ecgw___conv_317297)) {
								if (!egw.equals(__DEC_ecgw___conv_317297)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_28_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_392301 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_392301)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_28_2_black_nac_6BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_421480 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_421480)) {
							if (!prevNode.equals(__DEC_ecgw___conv_421480)) {
								if (!egw.equals(__DEC_ecgw___conv_421480)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_28_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_28_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_28_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
								FlowNode prevNode = sf1.getSourceRef();
								if (prevNode != null) {
									if (!egw.equals(prevNode)) {
										if (!ecgw.equals(prevNode)) {
											boolean ecgwisDiverging = ecgw.isIsDiverging();
											if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
												if (pattern_EG2ChoiceSeq_28_2_black_nac_7BB(egw, sf1) == null) {
													if (pattern_EG2ChoiceSeq_28_2_black_nac_8BB(ecgw, sf1) == null) {
														if (pattern_EG2ChoiceSeq_28_2_black_nac_0BBBB(sf1, prevNode,
																egw, ecgw) == null) {
															if (pattern_EG2ChoiceSeq_28_2_black_nac_3BBB(egw, prevNode,
																	ecgw) == null) {
																if (pattern_EG2ChoiceSeq_28_2_black_nac_4BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_EG2ChoiceSeq_28_2_black_nac_6BBB(ecgw,
																			prevNode, egw) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(egw,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(prevNode)) {
																				if (process.getFlowElements()
																						.contains(sf1)) {
																					if (process.getFlowElements()
																							.contains(ecgw)) {
																						if (pattern_EG2ChoiceSeq_28_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_EG2ChoiceSeq_28_2_black_nac_2BB(
																									egw,
																									process) == null) {
																								if (pattern_EG2ChoiceSeq_28_2_black_nac_5BB(
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

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceSeq_28_3_expressionFBBBBBBB(EG2ChoiceSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceSeq_28_4_expressionFBB(EG2ChoiceSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceSeq_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_29_1_bindingFB(EG2ChoiceSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_29_1_blackFBB(EClass __eClass, EG2ChoiceSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_29_1_bindingAndBlackFFB(EG2ChoiceSeq _this) {
		Object[] result_pattern_EG2ChoiceSeq_29_1_binding = pattern_EG2ChoiceSeq_29_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceSeq_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceSeq_29_1_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_29_1_black = pattern_EG2ChoiceSeq_29_1_blackFBB(__eClass, _this);
			if (result_pattern_EG2ChoiceSeq_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceSeq_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_29_2_black_nac_0BBBB(SequenceFlow sf1, FlowNode prevNode,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_486513 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_486513)) {
							if (!egw.equals(__DEC_sf1_default_486513)) {
								if (!ecgw.equals(__DEC_sf1_default_486513)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_29_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_107518 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_107518)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_29_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_567822 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_567822)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_29_2_black_nac_3BBB(ExclusiveGateway egw, FlowNode prevNode,
			ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_796329 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_796329)) {
							if (!prevNode.equals(__DEC_egw___conv_796329)) {
								if (!ecgw.equals(__DEC_egw___conv_796329)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_29_2_black_nac_4BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_414068 = ecgw.get__conv();
					if (__DEC_ecgw___conv_414068 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_414068)) {
							if (!prevNode.equals(__DEC_ecgw___conv_414068)) {
								if (!egw.equals(__DEC_ecgw___conv_414068)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_29_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_62278 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_62278)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_29_2_black_nac_6BBB(ExclusiveGateway ecgw, FlowNode prevNode,
			ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_71259 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_71259)) {
							if (!prevNode.equals(__DEC_ecgw___conv_71259)) {
								if (!egw.equals(__DEC_ecgw___conv_71259)) {
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

	public static final Object[] pattern_EG2ChoiceSeq_29_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_29_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_29_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
									FlowNode prevNode = sf1.getSourceRef();
									if (prevNode != null) {
										if (!egw.equals(prevNode)) {
											if (!ecgw.equals(prevNode)) {
												if (pattern_EG2ChoiceSeq_29_2_black_nac_7BB(egw, sf1) == null) {
													if (pattern_EG2ChoiceSeq_29_2_black_nac_8BB(ecgw, sf1) == null) {
														if (pattern_EG2ChoiceSeq_29_2_black_nac_0BBBB(sf1, prevNode,
																egw, ecgw) == null) {
															if (pattern_EG2ChoiceSeq_29_2_black_nac_3BBB(egw, prevNode,
																	ecgw) == null) {
																if (pattern_EG2ChoiceSeq_29_2_black_nac_4BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_EG2ChoiceSeq_29_2_black_nac_6BBB(ecgw,
																			prevNode, egw) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(egw,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(prevNode)) {
																				if (process.getFlowElements()
																						.contains(sf1)) {
																					if (process.getFlowElements()
																							.contains(ecgw)) {
																						if (pattern_EG2ChoiceSeq_29_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_EG2ChoiceSeq_29_2_black_nac_2BB(
																									egw,
																									process) == null) {
																								if (pattern_EG2ChoiceSeq_29_2_black_nac_5BB(
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

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceSeq_29_3_expressionFBBBBBBB(EG2ChoiceSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceSeq_29_4_expressionFBB(EG2ChoiceSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceSeq_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_32_1_blackB(EG2ChoiceSeq _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EG2ChoiceSeq_32_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_EG2ChoiceSeq_32_2_bindingFFFFFFFFBB(Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("prevNode");
		EObject _localVariable_1 = targetMatch.getObject("prevStep");
		EObject _localVariable_2 = targetMatch.getObject("flow");
		EObject _localVariable_3 = targetMatch.getObject("step");
		EObject _localVariable_4 = sourceMatch.getObject("process");
		EObject _localVariable_5 = sourceMatch.getObject("sf1");
		EObject _localVariable_6 = sourceMatch.getObject("egw");
		EObject _localVariable_7 = sourceMatch.getObject("ecgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpSf1 = _localVariable_5;
		EObject tmpEgw = _localVariable_6;
		EObject tmpEcgw = _localVariable_7;
		if (tmpPrevNode instanceof FlowNode) {
			FlowNode prevNode = (FlowNode) tmpPrevNode;
			if (tmpPrevStep instanceof Step) {
				Step prevStep = (Step) tmpPrevStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpStep instanceof ChoiceStep) {
						ChoiceStep step = (ChoiceStep) tmpStep;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (tmpEgw instanceof ExclusiveGateway) {
									ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
									if (tmpEcgw instanceof ExclusiveGateway) {
										ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
										return new Object[] { prevNode, prevStep, flow, step, process, sf1, egw, ecgw,
												sourceMatch, targetMatch };
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

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_32_2_blackBBFBBBBBBBB(FlowNode prevNode, Step prevStep,
			Flow flow, ChoiceStep step, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevStep.equals(step)) {
			if (!egw.equals(prevNode)) {
				if (!ecgw.equals(prevNode)) {
					if (!ecgw.equals(egw)) {
						if (!sourceMatch.equals(targetMatch)) {
							if (step.equals(prevStep.getNext())) {
								if (flow.getSteps().contains(prevStep)) {
									if (flow.getSteps().contains(step)) {
										if (process.getFlowElements().contains(prevNode)) {
											if (process.getFlowElements().contains(sf1)) {
												if (process.getFlowElements().contains(egw)) {
													if (process.getFlowElements().contains(ecgw)) {
														if (prevNode.equals(sf1.getSourceRef())) {
															if (egw.equals(sf1.getTargetRef())) {
																if (ecgw.equals(egw.get__conv())) {
																	boolean egwisDiverging = egw.isIsDiverging();
																	if (Boolean.valueOf(egwisDiverging)
																			.equals(Boolean.valueOf(true))) {
																		boolean ecgwisDiverging = ecgw.isIsDiverging();
																		if (Boolean.valueOf(ecgwisDiverging)
																				.equals(false)) {
																			for (FN2S pn2ps : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(prevNode,
																							FN2S.class, "source")) {
																				if (prevStep
																						.equals(pn2ps.getTarget())) {
																					_result.add(new Object[] { prevNode,
																							prevStep, pn2ps, flow, step,
																							process, sf1, egw, ecgw,
																							sourceMatch, targetMatch });
																				}
																			}
																		}

																	}

																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EG2ChoiceSeq_32_2_greenBBBBBBBBBBBF(FlowNode prevNode, Step prevStep,
			FN2S pn2ps, Flow flow, ChoiceStep step, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw, Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "EG2ChoiceSeq";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(egw);
		isApplicableMatch.getAllContextElements().add(ecgw);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(pn2ps);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { prevNode, prevStep, pn2ps, flow, step, process, sf1, egw, ecgw, sourceMatch, targetMatch,
				isApplicableMatch };
	}

	public static final Object[] pattern_EG2ChoiceSeq_32_3_bindingFBBBBBBBBBBBBB(EG2ChoiceSeq _this,
			IsApplicableMatchCC isApplicableMatch, FlowNode prevNode, Step prevStep, FN2S pn2ps, Flow flow,
			ChoiceStep step, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, prevNode, prevStep, pn2ps, flow, step,
				process, sf1, egw, ecgw, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, prevStep, pn2ps, flow, step, process, sf1,
					egw, ecgw, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_32_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EG2ChoiceSeq_32_3_bindingAndBlackFBBBBBBBBBBBBB(EG2ChoiceSeq _this,
			IsApplicableMatchCC isApplicableMatch, FlowNode prevNode, Step prevStep, FN2S pn2ps, Flow flow,
			ChoiceStep step, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_EG2ChoiceSeq_32_3_binding = pattern_EG2ChoiceSeq_32_3_bindingFBBBBBBBBBBBBB(_this,
				isApplicableMatch, prevNode, prevStep, pn2ps, flow, step, process, sf1, egw, ecgw, sourceMatch,
				targetMatch);
		if (result_pattern_EG2ChoiceSeq_32_3_binding != null) {
			CSP csp = (CSP) result_pattern_EG2ChoiceSeq_32_3_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_32_3_black = pattern_EG2ChoiceSeq_32_3_blackB(csp);
			if (result_pattern_EG2ChoiceSeq_32_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, prevStep, pn2ps, flow, step, process,
						sf1, egw, ecgw, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_32_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_EG2ChoiceSeq_32_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EG2ChoiceSeq";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EG2ChoiceSeq_32_5_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_35_1_blackB(EG2ChoiceSeq _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EG2ChoiceSeq_35_2_bindingFFFFFFFFFB(IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("pn2ps");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("step");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_7 = isApplicableMatch.getObject("egw");
		EObject _localVariable_8 = isApplicableMatch.getObject("ecgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpPn2ps = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpStep = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmpEgw = _localVariable_7;
		EObject tmpEcgw = _localVariable_8;
		if (tmpPrevNode instanceof FlowNode) {
			FlowNode prevNode = (FlowNode) tmpPrevNode;
			if (tmpPrevStep instanceof Step) {
				Step prevStep = (Step) tmpPrevStep;
				if (tmpPn2ps instanceof FN2S) {
					FN2S pn2ps = (FN2S) tmpPn2ps;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpStep instanceof ChoiceStep) {
							ChoiceStep step = (ChoiceStep) tmpStep;
							if (tmpProcess instanceof SimpleBPMN.Process) {
								SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
								if (tmpSf1 instanceof SequenceFlow) {
									SequenceFlow sf1 = (SequenceFlow) tmpSf1;
									if (tmpEgw instanceof ExclusiveGateway) {
										ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
										if (tmpEcgw instanceof ExclusiveGateway) {
											ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
											return new Object[] { prevNode, prevStep, pn2ps, flow, step, process, sf1,
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
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_35_2_blackBBBBBBBBBB(FlowNode prevNode, Step prevStep, FN2S pn2ps,
			Flow flow, ChoiceStep step, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw, IsApplicableMatchCC isApplicableMatch) {
		if (!prevStep.equals(step)) {
			if (!egw.equals(prevNode)) {
				if (!ecgw.equals(prevNode)) {
					if (!ecgw.equals(egw)) {
						if (step.equals(prevStep.getNext())) {
							if (prevNode.equals(pn2ps.getSource())) {
								if (prevStep.equals(pn2ps.getTarget())) {
									if (flow.getSteps().contains(prevStep)) {
										if (flow.getSteps().contains(step)) {
											if (process.getFlowElements().contains(prevNode)) {
												if (process.getFlowElements().contains(sf1)) {
													if (process.getFlowElements().contains(egw)) {
														if (process.getFlowElements().contains(ecgw)) {
															if (prevNode.equals(sf1.getSourceRef())) {
																if (egw.equals(sf1.getTargetRef())) {
																	if (ecgw.equals(egw.get__conv())) {
																		boolean egwisDiverging = egw.isIsDiverging();
																		if (Boolean.valueOf(egwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			boolean ecgwisDiverging = ecgw
																					.isIsDiverging();
																			if (Boolean.valueOf(ecgwisDiverging)
																					.equals(false)) {
																				return new Object[] { prevNode,
																						prevStep, pn2ps, flow, step,
																						process, sf1, egw, ecgw,
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
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_35_2_bindingAndBlackFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_EG2ChoiceSeq_35_2_binding = pattern_EG2ChoiceSeq_35_2_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EG2ChoiceSeq_35_2_binding != null) {
			FlowNode prevNode = (FlowNode) result_pattern_EG2ChoiceSeq_35_2_binding[0];
			Step prevStep = (Step) result_pattern_EG2ChoiceSeq_35_2_binding[1];
			FN2S pn2ps = (FN2S) result_pattern_EG2ChoiceSeq_35_2_binding[2];
			Flow flow = (Flow) result_pattern_EG2ChoiceSeq_35_2_binding[3];
			ChoiceStep step = (ChoiceStep) result_pattern_EG2ChoiceSeq_35_2_binding[4];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EG2ChoiceSeq_35_2_binding[5];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_EG2ChoiceSeq_35_2_binding[6];
			ExclusiveGateway egw = (ExclusiveGateway) result_pattern_EG2ChoiceSeq_35_2_binding[7];
			ExclusiveGateway ecgw = (ExclusiveGateway) result_pattern_EG2ChoiceSeq_35_2_binding[8];

			Object[] result_pattern_EG2ChoiceSeq_35_2_black = pattern_EG2ChoiceSeq_35_2_blackBBBBBBBBBB(prevNode,
					prevStep, pn2ps, flow, step, process, sf1, egw, ecgw, isApplicableMatch);
			if (result_pattern_EG2ChoiceSeq_35_2_black != null) {

				return new Object[] { prevNode, prevStep, pn2ps, flow, step, process, sf1, egw, ecgw,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_35_2_greenBBBFFF(ChoiceStep step, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		GW2S egwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		GW2S ecgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		result.getCreatedElements().add(egwToStep);
		egwToStep.setSource(egw);
		egwToStep.setTarget(step);
		result.getCreatedElements().add(ecgwToStep);
		ecgwToStep.setSource(ecgw);
		ecgwToStep.setTarget(step);
		return new Object[] { step, egw, ecgw, result, egwToStep, ecgwToStep };
	}

	public static final PerformRuleResult pattern_EG2ChoiceSeq_35_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_36_1_blackB(EG2ChoiceSeq _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EG2ChoiceSeq_36_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_EG2ChoiceSeq_36_2_black_nac_0BB(ModelgeneratorRuleResult ruleResult,
			FlowNode prevNode) {
		if (ruleResult.getSourceObjects().contains(prevNode)) {
			return new Object[] { ruleResult, prevNode };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_36_2_black_nac_1BB(ModelgeneratorRuleResult ruleResult,
			FN2S pn2ps) {
		if (ruleResult.getCorrObjects().contains(pn2ps)) {
			return new Object[] { ruleResult, pn2ps };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_36_2_black_nac_2BB(ModelgeneratorRuleResult ruleResult,
			Step prevStep) {
		if (ruleResult.getTargetObjects().contains(prevStep)) {
			return new Object[] { ruleResult, prevStep };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_36_2_black_nac_3BB(ModelgeneratorRuleResult ruleResult,
			Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_36_2_black_nac_4BB(ModelgeneratorRuleResult ruleResult,
			SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceSeq_36_2_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList pn2psList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpPn2ps : pn2psList.getEntryObjects()) {
				if (tmpPn2ps instanceof FN2S) {
					FN2S pn2ps = (FN2S) tmpPn2ps;
					FlowNode prevNode = pn2ps.getSource();
					if (prevNode != null) {
						Step prevStep = pn2ps.getTarget();
						if (prevStep != null) {
							if (pattern_EG2ChoiceSeq_36_2_black_nac_1BB(ruleResult, pn2ps) == null) {
								if (pattern_EG2ChoiceSeq_36_2_black_nac_0BB(ruleResult, prevNode) == null) {
									if (pattern_EG2ChoiceSeq_36_2_black_nac_2BB(ruleResult, prevStep) == null) {
										for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
														"flowElements")) {
											if (pattern_EG2ChoiceSeq_36_2_black_nac_4BB(ruleResult, process) == null) {
												for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(prevStep, Flow.class, "steps")) {
													if (pattern_EG2ChoiceSeq_36_2_black_nac_3BB(ruleResult,
															flow) == null) {
														_result.add(new Object[] { pn2psList, prevNode, pn2ps, prevStep,
																flow, process, ruleEntryContainer, ruleResult });
													}
												}
											}
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

	public static final Object[] pattern_EG2ChoiceSeq_36_3_bindingFBBBBBBBB(EG2ChoiceSeq _this,
			IsApplicableMatch isApplicableMatch, FlowNode prevNode, Step prevStep, FN2S pn2ps, Flow flow,
			SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, prevNode, prevStep, pn2ps, flow,
				process, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, prevStep, pn2ps, flow, process, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceSeq_36_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EG2ChoiceSeq_36_3_bindingAndBlackFBBBBBBBB(EG2ChoiceSeq _this,
			IsApplicableMatch isApplicableMatch, FlowNode prevNode, Step prevStep, FN2S pn2ps, Flow flow,
			SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EG2ChoiceSeq_36_3_binding = pattern_EG2ChoiceSeq_36_3_bindingFBBBBBBBB(_this,
				isApplicableMatch, prevNode, prevStep, pn2ps, flow, process, ruleResult);
		if (result_pattern_EG2ChoiceSeq_36_3_binding != null) {
			CSP csp = (CSP) result_pattern_EG2ChoiceSeq_36_3_binding[0];

			Object[] result_pattern_EG2ChoiceSeq_36_3_black = pattern_EG2ChoiceSeq_36_3_blackB(csp);
			if (result_pattern_EG2ChoiceSeq_36_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, prevStep, pn2ps, flow, process,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EG2ChoiceSeq_36_4_expressionFBB(EG2ChoiceSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceSeq_36_5_blackBBBBB(FlowNode prevNode, Step prevStep, FN2S pn2ps,
			Flow flow, SimpleBPMN.Process process) {
		return new Object[] { prevNode, prevStep, pn2ps, flow, process };
	}

	public static final Object[] pattern_EG2ChoiceSeq_36_6_blackBBBBBB(FlowNode prevNode, Step prevStep, FN2S pn2ps,
			Flow flow, SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { prevNode, prevStep, pn2ps, flow, process, ruleResult };
	}

	public static final Object[] pattern_EG2ChoiceSeq_36_6_greenBBBFBFFFFFBB(FlowNode prevNode, Step prevStep,
			Flow flow, SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ChoiceStep step = SimpleUseCaseFactory.eINSTANCE.createChoiceStep();
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		ExclusiveGateway egw = SimpleBPMNFactory.eINSTANCE.createExclusiveGateway();
		GW2S egwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		ExclusiveGateway ecgw = SimpleBPMNFactory.eINSTANCE.createExclusiveGateway();
		GW2S ecgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		boolean egw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_1 = csp.getValue("egw", "id");
		boolean ecgw_isDiverging_prime = false;
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		prevStep.setNext(step);
		flow.getSteps().add(step);
		ruleResult.getTargetObjects().add(step);
		process.getFlowElements().add(sf1);
		sf1.setSourceRef(prevNode);
		ruleResult.getSourceObjects().add(sf1);
		process.getFlowElements().add(egw);
		sf1.setTargetRef(egw);
		ruleResult.getSourceObjects().add(egw);
		egwToStep.setSource(egw);
		egwToStep.setTarget(step);
		ruleResult.getCorrObjects().add(egwToStep);
		process.getFlowElements().add(ecgw);
		egw.set__conv(ecgw);
		ruleResult.getSourceObjects().add(ecgw);
		ecgwToStep.setSource(ecgw);
		ecgwToStep.setTarget(step);
		ruleResult.getCorrObjects().add(ecgwToStep);
		String step_id_prime = (String) _localVariable_0;
		egw.setIsDiverging(Boolean.valueOf(egw_isDiverging_prime));
		String egw_id_prime = (String) _localVariable_1;
		ecgw.setIsDiverging(Boolean.valueOf(ecgw_isDiverging_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		step.setId(step_id_prime);
		egw.setId(egw_id_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { prevNode, prevStep, flow, step, process, sf1, egw, egwToStep, ecgw, ecgwToStep,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EG2ChoiceSeq_36_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EG2ChoiceSeqImpl
