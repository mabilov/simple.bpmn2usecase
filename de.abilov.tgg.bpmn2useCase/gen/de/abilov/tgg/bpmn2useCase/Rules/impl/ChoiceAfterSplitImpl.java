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
import de.abilov.tgg.bpmn2useCase.GW2S;
import de.abilov.tgg.bpmn2useCase.P2UC;

import de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit;
import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;

import de.abilov.useCase.ChoiceStep;
import de.abilov.useCase.Flow;
import de.abilov.useCase.ParallelFlow;
import de.abilov.useCase.ParallelStep;
import de.abilov.useCase.Step;
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
 * An implementation of the model object '<em><b>Choice After Split</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChoiceAfterSplitImpl extends AbstractRuleImpl implements ChoiceAfterSplit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceAfterSplitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getChoiceAfterSplit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, de.abilov.bpmn.Process process, ParallelGateway prevNode,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		// initial bindings
		Object[] result1_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_0_1_blackBBBBBBB(this, match, process,
				prevNode, sf1, egw, ecgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[process] = " + process + ", " + "[prevNode] = " + prevNode
							+ ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ChoiceAfterSplitImpl
				.pattern_ChoiceAfterSplit_0_2_bindingAndBlackFBBBBBBB(this, match, process, prevNode, sf1, egw, ecgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[prevNode] = "
					+ prevNode + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_0_4_blackBBBBBB(match, process,
					prevNode, sf1, egw, ecgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", "
						+ "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", "
						+ "[ecgw] = " + ecgw + ".");
			}
			ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_0_4_greenBBBBBBFFFFFFFF(match, process, prevNode, sf1, egw,
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
			Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_0_5_blackBBBBBB(match, process,
					prevNode, sf1, egw, ecgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[process] = " + process + ", " + "[prevNode] = " + prevNode + ", "
								+ "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
			}
			ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_0_5_greenBBBF(match, process, prevNode);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_0_6_expressionBBBBBBB(this, match, process, prevNode, sf1,
					egw, ecgw);
			return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_0_7_expressionF();
		} else {
			return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl
				.pattern_ChoiceAfterSplit_1_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[2];
		ParallelGateway prevNode = (ParallelGateway) result1_bindingAndBlack[3];
		ParallelStep pstep = (ParallelStep) result1_bindingAndBlack[4];
		GW2S pg2ps = (GW2S) result1_bindingAndBlack[5];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[6];
		Flow flow = (Flow) result1_bindingAndBlack[7];
		ExclusiveGateway egw = (ExclusiveGateway) result1_bindingAndBlack[8];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_1_1_greenBBFFBFBFB(useCase, pstep, egw,
				ecgw, csp);
		ParallelFlow pflow = (ParallelFlow) result1_green[2];
		ChoiceStep step = (ChoiceStep) result1_green[3];
		GW2S egwToStep = (GW2S) result1_green[5];
		GW2S ecgwToStep = (GW2S) result1_green[7];

		// collect translated elements
		Object[] result2_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_1_2_blackBBBBBBB(sf1, pflow, step, egw,
				egwToStep, ecgw, ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[egw] = "
					+ egw + ", " + "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = "
					+ ecgwToStep + ".");
		}
		Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_1_2_greenFBBBBBBB(sf1, pflow, step, egw,
				egwToStep, ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_1_3_blackBBBBBBBBBBBBBBB(ruleresult,
				process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, egwToStep, ecgw,
				ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
					+ ", " + "[p2uc] = " + p2uc + ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", "
					+ "[pg2ps] = " + pg2ps + ", " + "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow + ", " + "[step] = "
					+ step + ", " + "[flow] = " + flow + ", " + "[egw] = " + egw + ", " + "[egwToStep] = " + egwToStep
					+ ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult, process, useCase,
				prevNode, pstep, sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep);
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result3_green[13];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pflow__step____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[20];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[21];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[22];
				// EMoflonEdge egwToStep__egw____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge egwToStep__step____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge ecgwToStep__ecgw____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge ecgwToStep__step____target = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_1_5_expressionBBBBBBBBBBBBBBBB(this, ruleresult, process, useCase,
				p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, egwToStep, ecgw, ecgwToStep);
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[0];
		ParallelGateway prevNode = (ParallelGateway) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ExclusiveGateway egw = (ExclusiveGateway) result2_binding[3];
		ExclusiveGateway ecgw = (ExclusiveGateway) result2_binding[4];
		for (Object[] result2_black : ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_2_2_blackBFFBFFBBBB(process,
				prevNode, sf1, egw, ecgw, match)) {
			UseCase useCase = (UseCase) result2_black[1];
			P2UC p2uc = (P2UC) result2_black[2];
			ParallelStep pstep = (ParallelStep) result2_black[4];
			GW2S pg2ps = (GW2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_2_3_blackBBBBBBBFBB(process,
					useCase, p2uc, prevNode, pstep, pg2ps, sf1, egw, ecgw)) {
				Flow flow = (Flow) result3_black[7];
				Object[] result3_green = ChoiceAfterSplitImpl
						.pattern_ChoiceAfterSplit_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(process, useCase, p2uc, prevNode,
								pstep, pg2ps, sf1, flow, egw, ecgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[13];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pg2ps__prevNode____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge pg2ps__pstep____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge flow__pstep____steps = (EMoflonEdge) result3_green[20];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[22];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[23];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[24];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = ChoiceAfterSplitImpl
						.pattern_ChoiceAfterSplit_2_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, process,
								useCase, p2uc, prevNode, pstep, pg2ps, sf1, flow, egw, ecgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc
							+ ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", " + "[pg2ps] = "
							+ pg2ps + ", " + "[sf1] = " + sf1 + ", " + "[flow] = " + flow + ", " + "[egw] = " + egw
							+ ", " + "[ecgw] = " + ecgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, de.abilov.bpmn.Process process, ParallelGateway prevNode,
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
	public CSP isAppropriate_solveCsp_FWD(Match match, de.abilov.bpmn.Process process, ParallelGateway prevNode,
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
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1,
			Flow flow, ExclusiveGateway egw, ExclusiveGateway ecgw) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");
		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw.id", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");

		// Create unbound variables
		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow.id", csp);
		var_pflow_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_pflow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_egw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("pg2ps", pg2ps);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("flow", flow);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject process, EObject useCase, EObject p2uc,
			EObject prevNode, EObject pstep, EObject pg2ps, EObject sf1, EObject pflow, EObject step, EObject flow,
			EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("pstep", pstep);
		ruleresult.registerObject("pg2ps", pg2ps);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pflow", pflow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
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
	public boolean isAppropriate_BWD(Match match, UseCase useCase, ParallelStep pstep, ParallelFlow pflow,
			ChoiceStep step, Flow flow) {
		// initial bindings
		Object[] result1_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_10_1_blackBBBBBBB(this, match, useCase,
				pstep, pflow, step, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", "
					+ "[pstep] = " + pstep + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", "
					+ "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ChoiceAfterSplitImpl
				.pattern_ChoiceAfterSplit_10_2_bindingAndBlackFBBBBBBB(this, match, useCase, pstep, pflow, step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[pstep] = " + pstep
					+ ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_10_4_blackBBBBBB(match, useCase,
					pstep, pflow, step, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[pstep] = "
						+ pstep + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[flow] = " + flow
						+ ".");
			}
			ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_10_4_greenBBBBBFFF(match, useCase, pstep, pflow, step);
			// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result4_green[5];
			// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result4_green[6];
			// EMoflonEdge pflow__step____steps = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_10_5_blackBBBBBB(match, useCase,
					pstep, pflow, step, flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[useCase] = " + useCase + ", " + "[pstep] = " + pstep + ", "
								+ "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_10_5_greenBBBBFF(match, useCase, pstep, flow);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__pstep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_10_6_expressionBBBBBBB(this, match, useCase, pstep, pflow,
					step, flow);
			return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_10_7_expressionF();
		} else {
			return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl
				.pattern_ChoiceAfterSplit_11_1_bindingAndBlackFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[2];
		ParallelGateway prevNode = (ParallelGateway) result1_bindingAndBlack[3];
		ParallelStep pstep = (ParallelStep) result1_bindingAndBlack[4];
		GW2S pg2ps = (GW2S) result1_bindingAndBlack[5];
		ParallelFlow pflow = (ParallelFlow) result1_bindingAndBlack[6];
		ChoiceStep step = (ChoiceStep) result1_bindingAndBlack[7];
		Flow flow = (Flow) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_11_1_greenBBFBFFFFB(process, prevNode,
				step, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[2];
		ExclusiveGateway egw = (ExclusiveGateway) result1_green[4];
		GW2S egwToStep = (GW2S) result1_green[5];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_green[6];
		GW2S ecgwToStep = (GW2S) result1_green[7];

		// collect translated elements
		Object[] result2_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_11_2_blackBBBBBBB(sf1, pflow, step, egw,
				egwToStep, ecgw, ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[egw] = "
					+ egw + ", " + "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = "
					+ ecgwToStep + ".");
		}
		Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_11_2_greenFBBBBBBB(sf1, pflow, step, egw,
				egwToStep, ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_11_3_blackBBBBBBBBBBBBBBB(ruleresult,
				process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, egwToStep, ecgw,
				ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
					+ ", " + "[p2uc] = " + p2uc + ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", "
					+ "[pg2ps] = " + pg2ps + ", " + "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow + ", " + "[step] = "
					+ step + ", " + "[flow] = " + flow + ", " + "[egw] = " + egw + ", " + "[egwToStep] = " + egwToStep
					+ ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult, process,
				useCase, prevNode, pstep, sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep);
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result3_green[13];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pflow__step____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[20];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[21];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[22];
				// EMoflonEdge egwToStep__egw____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge egwToStep__step____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge ecgwToStep__ecgw____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge ecgwToStep__step____target = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_11_5_expressionBBBBBBBBBBBBBBBB(this, ruleresult, process,
				useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, egwToStep, ecgw, ecgwToStep);
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_12_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		UseCase useCase = (UseCase) result2_binding[0];
		ParallelStep pstep = (ParallelStep) result2_binding[1];
		ParallelFlow pflow = (ParallelFlow) result2_binding[2];
		ChoiceStep step = (ChoiceStep) result2_binding[3];
		Flow flow = (Flow) result2_binding[4];
		for (Object[] result2_black : ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_12_2_blackFBFFBFBBBB(useCase, pstep,
				pflow, step, flow, match)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			P2UC p2uc = (P2UC) result2_black[2];
			ParallelGateway prevNode = (ParallelGateway) result2_black[3];
			GW2S pg2ps = (GW2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_12_3_blackBBBBBBBBB(process,
					useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow)) {
				Object[] result3_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_12_3_greenBBBBBBBBBFFFFFFFFFFF(
						process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pg2ps__prevNode____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pg2ps__pstep____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pflow__step____steps = (EMoflonEdge) result3_green[18];
				// EMoflonEdge flow__pstep____steps = (EMoflonEdge) result3_green[19];

				// solve CSP
				Object[] result4_bindingAndBlack = ChoiceAfterSplitImpl
						.pattern_ChoiceAfterSplit_12_4_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, process,
								useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc
							+ ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", " + "[pg2ps] = "
							+ pg2ps + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[flow] = "
							+ flow + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, UseCase useCase, ParallelStep pstep, ParallelFlow pflow,
			ChoiceStep step, Flow flow) {
		match.registerObject("useCase", useCase);
		match.registerObject("pstep", pstep);
		match.registerObject("pflow", pflow);
		match.registerObject("step", step);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, UseCase useCase, ParallelStep pstep, ParallelFlow pflow,
			ChoiceStep step, Flow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, ParallelFlow pflow,
			ChoiceStep step, Flow flow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow.id", true, csp);
		var_pflow_id.setValue(pflow.getId());
		var_pflow_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", csp);
		var_sf1_id.setType("String");
		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw.id", csp);
		var_egw_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_pflow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_egw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("pg2ps", pg2ps);
		isApplicableMatch.registerObject("pflow", pflow);
		isApplicableMatch.registerObject("step", step);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject process, EObject useCase, EObject p2uc,
			EObject prevNode, EObject pstep, EObject pg2ps, EObject sf1, EObject pflow, EObject step, EObject flow,
			EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("pstep", pstep);
		ruleresult.registerObject("pg2ps", pg2ps);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pflow", pflow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
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
				&& match.getObject("pflow").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getParallelFlow())
				&& match.getObject("step").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getChoiceStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_476(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterSplitImpl
				.pattern_ChoiceAfterSplit_20_2_blackFFFFFB(_edge_flowElements)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_20_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_143(EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_21_2_blackFFFFFB(_edge_flows)) {
			UseCase useCase = (UseCase) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			ParallelFlow pflow = (ParallelFlow) result2_black[2];
			ChoiceStep step = (ChoiceStep) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_21_3_expressionFBBBBBBB(this, match, useCase, pstep,
					pflow, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_477(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_22_2_blackFFFFFB(_edge_sourceRef)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_22_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_478(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_23_2_blackFFFFFB(_edge_outgoing)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_23_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_144(EMoflonEdge _edge_invokedFlows) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterSplitImpl
				.pattern_ChoiceAfterSplit_24_2_blackFFFFFB(_edge_invokedFlows)) {
			UseCase useCase = (UseCase) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			ParallelFlow pflow = (ParallelFlow) result2_black[2];
			ChoiceStep step = (ChoiceStep) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_24_3_expressionFBBBBBBB(this, match, useCase, pstep,
					pflow, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_145(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_25_2_blackFFFFFB(_edge_steps)) {
			UseCase useCase = (UseCase) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			ParallelFlow pflow = (ParallelFlow) result2_black[2];
			ChoiceStep step = (ChoiceStep) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_25_3_expressionFBBBBBBB(this, match, useCase, pstep,
					pflow, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_479(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterSplitImpl
				.pattern_ChoiceAfterSplit_26_2_blackFFFFFB(_edge_flowElements)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_26_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_480(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterSplitImpl
				.pattern_ChoiceAfterSplit_27_2_blackFFFFFB(_edge_flowElements)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_27_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_481(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_28_2_blackFFFFFB(_edge_targetRef)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_28_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_28_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_482(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_29_2_blackFFFFFB(_edge_incoming)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_29_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_29_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_29_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_483(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_30_2_blackFFFFFB(_edge___conv)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_30_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_30_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_30_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_30_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterSplitImpl.pattern_ChoiceAfterSplit_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ChoiceAfterSplit");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		de.abilov.useCase.UseCase useCase = (de.abilov.useCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		de.abilov.tgg.bpmn2useCase.P2UC p2uc = (de.abilov.tgg.bpmn2useCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ParallelGateway prevNode = (de.abilov.bpmn.ParallelGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPstep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pstep")).findAny();
		de.abilov.useCase.ParallelStep pstep = (de.abilov.useCase.ParallelStep) matchForPstep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPg2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pg2ps")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pg2ps = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPg2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPflow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pflow")).findAny();
		de.abilov.useCase.ParallelFlow pflow = (de.abilov.useCase.ParallelFlow) matchForPflow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ChoiceStep step = (de.abilov.useCase.ChoiceStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

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

		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");

		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow", true, csp);
		var_pflow_id.setValue(pflow.getId());
		var_pflow_id.setType("String");

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

		eq0.setRuleName("ChoiceAfterSplit");
		eq0.solve(var_sf1_id, var_pflow_id);

		eq1.setRuleName("ChoiceAfterSplit");
		eq1.solve(var_egw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_pflow_id.setBound(false);
			var_step_id.setBound(false);
			eq0.solve(var_sf1_id, var_pflow_id);
			eq1.solve(var_egw_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				pflow.setId((String) var_pflow_id.getValue());
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
		ruleResult.setRule("ChoiceAfterSplit");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		de.abilov.useCase.UseCase useCase = (de.abilov.useCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		de.abilov.tgg.bpmn2useCase.P2UC p2uc = (de.abilov.tgg.bpmn2useCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ParallelGateway prevNode = (de.abilov.bpmn.ParallelGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPstep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pstep")).findAny();
		de.abilov.useCase.ParallelStep pstep = (de.abilov.useCase.ParallelStep) matchForPstep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPg2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pg2ps")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pg2ps = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPg2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPflow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pflow")).findAny();
		de.abilov.useCase.ParallelFlow pflow = (de.abilov.useCase.ParallelFlow) matchForPflow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ChoiceStep step = (de.abilov.useCase.ChoiceStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

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

		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");

		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow", true, csp);
		var_pflow_id.setValue(pflow.getId());
		var_pflow_id.setType("String");

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

		eq0.setRuleName("ChoiceAfterSplit");
		eq0.solve(var_sf1_id, var_pflow_id);

		eq1.setRuleName("ChoiceAfterSplit");
		eq1.solve(var_egw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_sf1_id.setBound(false);
			var_egw_id.setBound(false);
			eq0.solve(var_sf1_id, var_pflow_id);
			eq1.solve(var_egw_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (de.abilov.bpmn.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
		case RulesPackage.CHOICE_AFTER_SPLIT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (de.abilov.bpmn.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
			return null;
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (de.abilov.bpmn.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_PARALLELGATEWAY_PARALLELSTEP_GW2S_SEQUENCEFLOW_FLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(de.abilov.bpmn.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelStep) arguments.get(5), (GW2S) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Flow) arguments.get(8), (ExclusiveGateway) arguments.get(9),
					(ExclusiveGateway) arguments.get(10));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.CHOICE_AFTER_SPLIT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_CHOICESTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(ParallelStep) arguments.get(2), (ParallelFlow) arguments.get(3), (ChoiceStep) arguments.get(4),
					(Flow) arguments.get(5));
		case RulesPackage.CHOICE_AFTER_SPLIT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_CHOICESTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(ParallelStep) arguments.get(2), (ParallelFlow) arguments.get(3), (ChoiceStep) arguments.get(4),
					(Flow) arguments.get(5));
			return null;
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_CHOICESTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(ParallelStep) arguments.get(2), (ParallelFlow) arguments.get(3), (ChoiceStep) arguments.get(4),
					(Flow) arguments.get(5));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_PARALLELGATEWAY_PARALLELSTEP_GW2S_PARALLELFLOW_CHOICESTEP_FLOW:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(de.abilov.bpmn.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelStep) arguments.get(5), (GW2S) arguments.get(6),
					(ParallelFlow) arguments.get(7), (ChoiceStep) arguments.get(8), (Flow) arguments.get(9));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.CHOICE_AFTER_SPLIT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_476__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_476((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_143__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_143((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_477__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_477((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_478__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_478((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_144__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_144((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_145__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_145((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_479__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_479((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_480__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_480((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_481__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_481((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_482__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_482((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_483__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_483((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_SPLIT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ChoiceAfterSplit_0_1_blackBBBBBBB(ChoiceAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			return new Object[] { _this, match, process, prevNode, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_0_2_bindingFBBBBBBB(ChoiceAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process, prevNode, sf1, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, prevNode, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterSplit_0_2_bindingAndBlackFBBBBBBB(ChoiceAfterSplit _this,
			Match match, de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		Object[] result_pattern_ChoiceAfterSplit_0_2_binding = pattern_ChoiceAfterSplit_0_2_bindingFBBBBBBB(_this,
				match, process, prevNode, sf1, egw, ecgw);
		if (result_pattern_ChoiceAfterSplit_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterSplit_0_2_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_0_2_black = pattern_ChoiceAfterSplit_0_2_blackB(csp);
			if (result_pattern_ChoiceAfterSplit_0_2_black != null) {

				return new Object[] { csp, _this, match, process, prevNode, sf1, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterSplit_0_3_expressionFBB(ChoiceAfterSplit _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_0_4_blackBBBBBB(Match match, de.abilov.bpmn.Process process,
			ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			return new Object[] { match, process, prevNode, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_0_4_greenBBBBBBFFFFFFFF(Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
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

	public static final Object[] pattern_ChoiceAfterSplit_0_5_blackBBBBBB(Match match, de.abilov.bpmn.Process process,
			ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			return new Object[] { match, process, prevNode, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_0_5_greenBBBF(Match match, de.abilov.bpmn.Process process,
			ParallelGateway prevNode) {
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

	public static final void pattern_ChoiceAfterSplit_0_6_expressionBBBBBBB(ChoiceAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		_this.registerObjectsToMatch_FWD(match, process, prevNode, sf1, egw, ecgw);

	}

	public static final boolean pattern_ChoiceAfterSplit_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_1_1_bindingFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_4 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_5 = isApplicableMatch.getObject("pg2ps");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("egw");
		EObject _localVariable_9 = isApplicableMatch.getObject("ecgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpP2uc = _localVariable_2;
		EObject tmpPrevNode = _localVariable_3;
		EObject tmpPstep = _localVariable_4;
		EObject tmpPg2ps = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpEgw = _localVariable_8;
		EObject tmpEcgw = _localVariable_9;
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpP2uc instanceof P2UC) {
					P2UC p2uc = (P2UC) tmpP2uc;
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						if (tmpPstep instanceof ParallelStep) {
							ParallelStep pstep = (ParallelStep) tmpPstep;
							if (tmpPg2ps instanceof GW2S) {
								GW2S pg2ps = (GW2S) tmpPg2ps;
								if (tmpSf1 instanceof SequenceFlow) {
									SequenceFlow sf1 = (SequenceFlow) tmpSf1;
									if (tmpFlow instanceof Flow) {
										Flow flow = (Flow) tmpFlow;
										if (tmpEgw instanceof ExclusiveGateway) {
											ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
											if (tmpEcgw instanceof ExclusiveGateway) {
												ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
												return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps,
														sf1, flow, egw, ecgw, isApplicableMatch };
											}
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

	public static final Object[] pattern_ChoiceAfterSplit_1_1_blackBBBBBBBBBBBFB(de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1,
			Flow flow, ExclusiveGateway egw, ExclusiveGateway ecgw, ChoiceAfterSplit _this,
			IsApplicableMatch isApplicableMatch) {
		if (!ecgw.equals(egw)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, flow, egw, ecgw, _this,
							csp, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_1_1_bindingAndBlackFFFFFFFFFFBFB(ChoiceAfterSplit _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ChoiceAfterSplit_1_1_binding = pattern_ChoiceAfterSplit_1_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ChoiceAfterSplit_1_1_binding != null) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_ChoiceAfterSplit_1_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_ChoiceAfterSplit_1_1_binding[1];
			P2UC p2uc = (P2UC) result_pattern_ChoiceAfterSplit_1_1_binding[2];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_ChoiceAfterSplit_1_1_binding[3];
			ParallelStep pstep = (ParallelStep) result_pattern_ChoiceAfterSplit_1_1_binding[4];
			GW2S pg2ps = (GW2S) result_pattern_ChoiceAfterSplit_1_1_binding[5];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ChoiceAfterSplit_1_1_binding[6];
			Flow flow = (Flow) result_pattern_ChoiceAfterSplit_1_1_binding[7];
			ExclusiveGateway egw = (ExclusiveGateway) result_pattern_ChoiceAfterSplit_1_1_binding[8];
			ExclusiveGateway ecgw = (ExclusiveGateway) result_pattern_ChoiceAfterSplit_1_1_binding[9];

			Object[] result_pattern_ChoiceAfterSplit_1_1_black = pattern_ChoiceAfterSplit_1_1_blackBBBBBBBBBBBFB(
					process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, flow, egw, ecgw, _this, isApplicableMatch);
			if (result_pattern_ChoiceAfterSplit_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ChoiceAfterSplit_1_1_black[11];

				return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, flow, egw, ecgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_1_1_greenBBFFBFBFB(UseCase useCase, ParallelStep pstep,
			ExclusiveGateway egw, ExclusiveGateway ecgw, CSP csp) {
		ParallelFlow pflow = UseCaseFactory.eINSTANCE.createParallelFlow();
		ChoiceStep step = UseCaseFactory.eINSTANCE.createChoiceStep();
		GW2S egwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		GW2S ecgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("pflow", "id");
		Object _localVariable_1 = csp.getValue("step", "id");
		useCase.getFlows().add(pflow);
		pstep.getInvokedFlows().add(pflow);
		pflow.getSteps().add(step);
		egwToStep.setSource(egw);
		egwToStep.setTarget(step);
		ecgwToStep.setSource(ecgw);
		ecgwToStep.setTarget(step);
		String pflow_id_prime = (String) _localVariable_0;
		String step_id_prime = (String) _localVariable_1;
		pflow.setId(pflow_id_prime);
		step.setId(step_id_prime);
		return new Object[] { useCase, pstep, pflow, step, egw, egwToStep, ecgw, ecgwToStep, csp };
	}

	public static final Object[] pattern_ChoiceAfterSplit_1_2_blackBBBBBBB(SequenceFlow sf1, ParallelFlow pflow,
			ChoiceStep step, ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_1_2_greenFBBBBBBB(SequenceFlow sf1, ParallelFlow pflow,
			ChoiceStep step, ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getCreatedElements().add(pflow);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(egw);
		ruleresult.getCreatedLinkElements().add(egwToStep);
		ruleresult.getTranslatedElements().add(ecgw);
		ruleresult.getCreatedLinkElements().add(ecgwToStep);
		return new Object[] { ruleresult, sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep };
	}

	public static final Object[] pattern_ChoiceAfterSplit_1_3_blackBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject p2uc, EObject prevNode, EObject pstep, EObject pg2ps, EObject sf1,
			EObject pflow, EObject step, EObject flow, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		if (!process.equals(useCase)) {
			if (!process.equals(pstep)) {
				if (!process.equals(sf1)) {
					if (!process.equals(step)) {
						if (!p2uc.equals(process)) {
							if (!p2uc.equals(useCase)) {
								if (!p2uc.equals(prevNode)) {
									if (!p2uc.equals(pstep)) {
										if (!p2uc.equals(pg2ps)) {
											if (!p2uc.equals(sf1)) {
												if (!p2uc.equals(pflow)) {
													if (!p2uc.equals(step)) {
														if (!prevNode.equals(process)) {
															if (!prevNode.equals(useCase)) {
																if (!prevNode.equals(pstep)) {
																	if (!prevNode.equals(sf1)) {
																		if (!prevNode.equals(step)) {
																			if (!pstep.equals(useCase)) {
																				if (!pstep.equals(sf1)) {
																					if (!pstep.equals(step)) {
																						if (!pg2ps.equals(process)) {
																							if (!pg2ps
																									.equals(useCase)) {
																								if (!pg2ps.equals(
																										prevNode)) {
																									if (!pg2ps.equals(
																											pstep)) {
																										if (!pg2ps
																												.equals(sf1)) {
																											if (!pg2ps
																													.equals(step)) {
																												if (!sf1.equals(
																														useCase)) {
																													if (!sf1.equals(
																															step)) {
																														if (!pflow
																																.equals(process)) {
																															if (!pflow
																																	.equals(useCase)) {
																																if (!pflow
																																		.equals(prevNode)) {
																																	if (!pflow
																																			.equals(pstep)) {
																																		if (!pflow
																																				.equals(pg2ps)) {
																																			if (!pflow
																																					.equals(sf1)) {
																																				if (!pflow
																																						.equals(step)) {
																																					if (!step
																																							.equals(useCase)) {
																																						if (!flow
																																								.equals(process)) {
																																							if (!flow
																																									.equals(useCase)) {
																																								if (!flow
																																										.equals(p2uc)) {
																																									if (!flow
																																											.equals(prevNode)) {
																																										if (!flow
																																												.equals(pstep)) {
																																											if (!flow
																																													.equals(pg2ps)) {
																																												if (!flow
																																														.equals(sf1)) {
																																													if (!flow
																																															.equals(pflow)) {
																																														if (!flow
																																																.equals(step)) {
																																															if (!egw.equals(
																																																	process)) {
																																																if (!egw.equals(
																																																		useCase)) {
																																																	if (!egw.equals(
																																																			p2uc)) {
																																																		if (!egw.equals(
																																																				prevNode)) {
																																																			if (!egw.equals(
																																																					pstep)) {
																																																				if (!egw.equals(
																																																						pg2ps)) {
																																																					if (!egw.equals(
																																																							sf1)) {
																																																						if (!egw.equals(
																																																								pflow)) {
																																																							if (!egw.equals(
																																																									step)) {
																																																								if (!egw.equals(
																																																										flow)) {
																																																									if (!egw.equals(
																																																											egwToStep)) {
																																																										if (!egwToStep
																																																												.equals(process)) {
																																																											if (!egwToStep
																																																													.equals(useCase)) {
																																																												if (!egwToStep
																																																														.equals(p2uc)) {
																																																													if (!egwToStep
																																																															.equals(prevNode)) {
																																																														if (!egwToStep
																																																																.equals(pstep)) {
																																																															if (!egwToStep
																																																																	.equals(pg2ps)) {
																																																																if (!egwToStep
																																																																		.equals(sf1)) {
																																																																	if (!egwToStep
																																																																			.equals(pflow)) {
																																																																		if (!egwToStep
																																																																				.equals(step)) {
																																																																			if (!egwToStep
																																																																					.equals(flow)) {
																																																																				if (!ecgw
																																																																						.equals(process)) {
																																																																					if (!ecgw
																																																																							.equals(useCase)) {
																																																																						if (!ecgw
																																																																								.equals(p2uc)) {
																																																																							if (!ecgw
																																																																									.equals(prevNode)) {
																																																																								if (!ecgw
																																																																										.equals(pstep)) {
																																																																									if (!ecgw
																																																																											.equals(pg2ps)) {
																																																																										if (!ecgw
																																																																												.equals(sf1)) {
																																																																											if (!ecgw
																																																																													.equals(pflow)) {
																																																																												if (!ecgw
																																																																														.equals(step)) {
																																																																													if (!ecgw
																																																																															.equals(flow)) {
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
																																																																																						.equals(prevNode)) {
																																																																																					if (!ecgwToStep
																																																																																							.equals(pstep)) {
																																																																																						if (!ecgwToStep
																																																																																								.equals(pg2ps)) {
																																																																																							if (!ecgwToStep
																																																																																									.equals(sf1)) {
																																																																																								if (!ecgwToStep
																																																																																										.equals(pflow)) {
																																																																																									if (!ecgwToStep
																																																																																											.equals(step)) {
																																																																																										if (!ecgwToStep
																																																																																												.equals(flow)) {
																																																																																											if (!ecgwToStep
																																																																																													.equals(egw)) {
																																																																																												if (!ecgwToStep
																																																																																														.equals(egwToStep)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															process,
																																																																																															useCase,
																																																																																															p2uc,
																																																																																															prevNode,
																																																																																															pstep,
																																																																																															pg2ps,
																																																																																															sf1,
																																																																																															pflow,
																																																																																															step,
																																																																																															flow,
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
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject prevNode, EObject pstep,
			EObject sf1, EObject pflow, EObject step, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__egw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__ecgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ChoiceAfterSplit";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__pflow____flows_name_prime = "flows";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String pflow__step____steps_name_prime = "steps";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		String egwToStep__egw____source_name_prime = "source";
		String egwToStep__step____target_name_prime = "target";
		String ecgwToStep__ecgw____source_name_prime = "source";
		String ecgwToStep__step____target_name_prime = "target";
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(process__sf1____flowElements);
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		ruleresult.getCreatedEdges().add(useCase__pflow____flows);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		ruleresult.getCreatedEdges().add(pstep__pflow____invokedFlows);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(pflow__step____steps);
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
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		egwToStep__egw____source.setName(egwToStep__egw____source_name_prime);
		egwToStep__step____target.setName(egwToStep__step____target_name_prime);
		ecgwToStep__ecgw____source.setName(ecgwToStep__ecgw____source_name_prime);
		ecgwToStep__step____target.setName(ecgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, process, useCase, prevNode, pstep, sf1, pflow, step, egw, egwToStep, ecgw,
				ecgwToStep, process__sf1____flowElements, useCase__pflow____flows, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, pstep__pflow____invokedFlows, pflow__step____steps,
				process__egw____flowElements, process__ecgw____flowElements, sf1__egw____targetRef,
				egw__sf1____incoming, egw__ecgw______conv, egwToStep__egw____source, egwToStep__step____target,
				ecgwToStep__ecgw____source, ecgwToStep__step____target };
	}

	public static final void pattern_ChoiceAfterSplit_1_5_expressionBBBBBBBBBBBBBBBB(ChoiceAfterSplit _this,
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject p2uc, EObject prevNode,
			EObject pstep, EObject pg2ps, EObject sf1, EObject pflow, EObject step, EObject flow, EObject egw,
			EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_FWD(ruleresult, process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow,
				egw, egwToStep, ecgw, ecgwToStep);

	}

	public static final PerformRuleResult pattern_ChoiceAfterSplit_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_2_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_2_1_blackFBB(EClass eClass, ChoiceAfterSplit _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_2_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_2_1_binding = pattern_ChoiceAfterSplit_2_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ChoiceAfterSplit_2_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_2_1_black = pattern_ChoiceAfterSplit_2_1_blackFBB(eClass, _this);
			if (result_pattern_ChoiceAfterSplit_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ChoiceAfterSplit_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ChoiceAfterSplit";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ChoiceAfterSplit_2_2_bindingFFFFFB(Match match) {
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
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
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

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_2_2_blackBFFBFFBBBB(de.abilov.bpmn.Process process,
			ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!ecgw.equals(egw)) {
			boolean prevNodeisDiverging = prevNode.isIsDiverging();
			if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
				boolean egwisDiverging = egw.isIsDiverging();
				if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
					boolean ecgwisDiverging = ecgw.isIsDiverging();
					if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
						for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(process,
								P2UC.class, "source")) {
							UseCase useCase = p2uc.getTarget();
							if (useCase != null) {
								for (GW2S pg2ps : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, GW2S.class, "source")) {
									Step tmpPstep = pg2ps.getTarget();
									if (tmpPstep instanceof ParallelStep) {
										ParallelStep pstep = (ParallelStep) tmpPstep;
										_result.add(new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, sf1,
												egw, ecgw, match });
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

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_2_3_blackBBBBBBBFBB(de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!ecgw.equals(egw)) {
			if (process.getFlowElements().contains(prevNode)) {
				if (process.getFlowElements().contains(sf1)) {
					if (process.equals(p2uc.getSource())) {
						if (useCase.equals(p2uc.getTarget())) {
							if (prevNode.equals(sf1.getSourceRef())) {
								if (prevNode.equals(pg2ps.getSource())) {
									if (pstep.equals(pg2ps.getTarget())) {
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
																if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
																	for (Flow flow : useCase.getFlows()) {
																		if (flow.getSteps().contains(pstep)) {
																			_result.add(new Object[] { process, useCase,
																					p2uc, prevNode, pstep, pg2ps, sf1,
																					flow, egw, ecgw });
																		}
																	}
																}

															}

														}

													}
												}
											}
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

	public static final Object[] pattern_ChoiceAfterSplit_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep,
			GW2S pg2ps, SequenceFlow sf1, Flow flow, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg2ps__pstep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__pstep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pg2ps__prevNode____source_name_prime = "source";
		String pg2ps__pstep____target_name_prime = "target";
		String flow__pstep____steps_name_prime = "steps";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(pg2ps);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(flow);
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
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____outgoing);
		pg2ps__prevNode____source.setSrc(pg2ps);
		pg2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pg2ps__prevNode____source);
		pg2ps__pstep____target.setSrc(pg2ps);
		pg2ps__pstep____target.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(pg2ps__pstep____target);
		flow__pstep____steps.setSrc(flow);
		flow__pstep____steps.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(flow__pstep____steps);
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
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		pg2ps__prevNode____source.setName(pg2ps__prevNode____source_name_prime);
		pg2ps__pstep____target.setName(pg2ps__pstep____target_name_prime);
		flow__pstep____steps.setName(flow__pstep____steps_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, flow, egw, ecgw, isApplicableMatch,
				process__prevNode____flowElements, process__sf1____flowElements, useCase__flow____flows,
				p2uc__process____source, p2uc__useCase____target, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				pg2ps__prevNode____source, pg2ps__pstep____target, flow__pstep____steps, process__egw____flowElements,
				process__ecgw____flowElements, sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv };
	}

	public static final Object[] pattern_ChoiceAfterSplit_2_4_bindingFBBBBBBBBBBBB(ChoiceAfterSplit _this,
			IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1, Flow flow, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, process, useCase, p2uc, prevNode,
				pstep, pg2ps, sf1, flow, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps, sf1,
					flow, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterSplit_2_4_bindingAndBlackFBBBBBBBBBBBB(ChoiceAfterSplit _this,
			IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1, Flow flow, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		Object[] result_pattern_ChoiceAfterSplit_2_4_binding = pattern_ChoiceAfterSplit_2_4_bindingFBBBBBBBBBBBB(_this,
				isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, flow, egw, ecgw);
		if (result_pattern_ChoiceAfterSplit_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterSplit_2_4_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_2_4_black = pattern_ChoiceAfterSplit_2_4_blackB(csp);
			if (result_pattern_ChoiceAfterSplit_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps,
						sf1, flow, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterSplit_2_5_expressionFBB(ChoiceAfterSplit _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ChoiceAfterSplit_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ChoiceAfterSplit";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ChoiceAfterSplit_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_10_1_blackBBBBBBB(ChoiceAfterSplit _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		if (!flow.equals(pflow)) {
			return new Object[] { _this, match, useCase, pstep, pflow, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_10_2_bindingFBBBBBBB(ChoiceAfterSplit _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, useCase, pstep, pflow, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCase, pstep, pflow, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterSplit_10_2_bindingAndBlackFBBBBBBB(ChoiceAfterSplit _this,
			Match match, UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		Object[] result_pattern_ChoiceAfterSplit_10_2_binding = pattern_ChoiceAfterSplit_10_2_bindingFBBBBBBB(_this,
				match, useCase, pstep, pflow, step, flow);
		if (result_pattern_ChoiceAfterSplit_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterSplit_10_2_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_10_2_black = pattern_ChoiceAfterSplit_10_2_blackB(csp);
			if (result_pattern_ChoiceAfterSplit_10_2_black != null) {

				return new Object[] { csp, _this, match, useCase, pstep, pflow, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterSplit_10_3_expressionFBB(ChoiceAfterSplit _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_10_4_blackBBBBBB(Match match, UseCase useCase,
			ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		if (!flow.equals(pflow)) {
			return new Object[] { match, useCase, pstep, pflow, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_10_4_greenBBBBBFFF(Match match, UseCase useCase,
			ParallelStep pstep, ParallelFlow pflow, ChoiceStep step) {
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(pflow);
		match.getToBeTranslatedNodes().add(step);
		String useCase__pflow____flows_name_prime = "flows";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String pflow__step____steps_name_prime = "steps";
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		match.getToBeTranslatedEdges().add(useCase__pflow____flows);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		match.getToBeTranslatedEdges().add(pstep__pflow____invokedFlows);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(pflow__step____steps);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		return new Object[] { match, useCase, pstep, pflow, step, useCase__pflow____flows, pstep__pflow____invokedFlows,
				pflow__step____steps };
	}

	public static final Object[] pattern_ChoiceAfterSplit_10_5_blackBBBBBB(Match match, UseCase useCase,
			ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		if (!flow.equals(pflow)) {
			return new Object[] { match, useCase, pstep, pflow, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_10_5_greenBBBBFF(Match match, UseCase useCase,
			ParallelStep pstep, Flow flow) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__pstep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(pstep);
		match.getContextNodes().add(flow);
		String useCase__flow____flows_name_prime = "flows";
		String flow__pstep____steps_name_prime = "steps";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		flow__pstep____steps.setSrc(flow);
		flow__pstep____steps.setTrg(pstep);
		match.getContextEdges().add(flow__pstep____steps);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__pstep____steps.setName(flow__pstep____steps_name_prime);
		return new Object[] { match, useCase, pstep, flow, useCase__flow____flows, flow__pstep____steps };
	}

	public static final void pattern_ChoiceAfterSplit_10_6_expressionBBBBBBB(ChoiceAfterSplit _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, useCase, pstep, pflow, step, flow);

	}

	public static final boolean pattern_ChoiceAfterSplit_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_11_1_bindingFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_4 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_5 = isApplicableMatch.getObject("pg2ps");
		EObject _localVariable_6 = isApplicableMatch.getObject("pflow");
		EObject _localVariable_7 = isApplicableMatch.getObject("step");
		EObject _localVariable_8 = isApplicableMatch.getObject("flow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpP2uc = _localVariable_2;
		EObject tmpPrevNode = _localVariable_3;
		EObject tmpPstep = _localVariable_4;
		EObject tmpPg2ps = _localVariable_5;
		EObject tmpPflow = _localVariable_6;
		EObject tmpStep = _localVariable_7;
		EObject tmpFlow = _localVariable_8;
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpP2uc instanceof P2UC) {
					P2UC p2uc = (P2UC) tmpP2uc;
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						if (tmpPstep instanceof ParallelStep) {
							ParallelStep pstep = (ParallelStep) tmpPstep;
							if (tmpPg2ps instanceof GW2S) {
								GW2S pg2ps = (GW2S) tmpPg2ps;
								if (tmpPflow instanceof ParallelFlow) {
									ParallelFlow pflow = (ParallelFlow) tmpPflow;
									if (tmpStep instanceof ChoiceStep) {
										ChoiceStep step = (ChoiceStep) tmpStep;
										if (tmpFlow instanceof Flow) {
											Flow flow = (Flow) tmpFlow;
											return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, pflow,
													step, flow, isApplicableMatch };
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

	public static final Object[] pattern_ChoiceAfterSplit_11_1_blackBBBBBBBBBBFB(de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, ParallelFlow pflow,
			ChoiceStep step, Flow flow, ChoiceAfterSplit _this, IsApplicableMatch isApplicableMatch) {
		if (!flow.equals(pflow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_11_1_bindingAndBlackFFFFFFFFFBFB(ChoiceAfterSplit _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ChoiceAfterSplit_11_1_binding = pattern_ChoiceAfterSplit_11_1_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ChoiceAfterSplit_11_1_binding != null) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_ChoiceAfterSplit_11_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_ChoiceAfterSplit_11_1_binding[1];
			P2UC p2uc = (P2UC) result_pattern_ChoiceAfterSplit_11_1_binding[2];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_ChoiceAfterSplit_11_1_binding[3];
			ParallelStep pstep = (ParallelStep) result_pattern_ChoiceAfterSplit_11_1_binding[4];
			GW2S pg2ps = (GW2S) result_pattern_ChoiceAfterSplit_11_1_binding[5];
			ParallelFlow pflow = (ParallelFlow) result_pattern_ChoiceAfterSplit_11_1_binding[6];
			ChoiceStep step = (ChoiceStep) result_pattern_ChoiceAfterSplit_11_1_binding[7];
			Flow flow = (Flow) result_pattern_ChoiceAfterSplit_11_1_binding[8];

			Object[] result_pattern_ChoiceAfterSplit_11_1_black = pattern_ChoiceAfterSplit_11_1_blackBBBBBBBBBBFB(
					process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow, _this, isApplicableMatch);
			if (result_pattern_ChoiceAfterSplit_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ChoiceAfterSplit_11_1_black[10];

				return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_11_1_greenBBFBFFFFB(de.abilov.bpmn.Process process,
			ParallelGateway prevNode, ChoiceStep step, CSP csp) {
		SequenceFlow sf1 = BpmnFactory.eINSTANCE.createSequenceFlow();
		ExclusiveGateway egw = BpmnFactory.eINSTANCE.createExclusiveGateway();
		GW2S egwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		ExclusiveGateway ecgw = BpmnFactory.eINSTANCE.createExclusiveGateway();
		GW2S ecgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("sf1", "id");
		boolean egw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_1 = csp.getValue("egw", "id");
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
		String sf1_id_prime = (String) _localVariable_0;
		egw.setIsDiverging(Boolean.valueOf(egw_isDiverging_prime));
		String egw_id_prime = (String) _localVariable_1;
		ecgw.setIsDiverging(Boolean.valueOf(ecgw_isDiverging_prime));
		sf1.setId(sf1_id_prime);
		egw.setId(egw_id_prime);
		return new Object[] { process, prevNode, sf1, step, egw, egwToStep, ecgw, ecgwToStep, csp };
	}

	public static final Object[] pattern_ChoiceAfterSplit_11_2_blackBBBBBBB(SequenceFlow sf1, ParallelFlow pflow,
			ChoiceStep step, ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_11_2_greenFBBBBBBB(SequenceFlow sf1, ParallelFlow pflow,
			ChoiceStep step, ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(pflow);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(egw);
		ruleresult.getCreatedLinkElements().add(egwToStep);
		ruleresult.getCreatedElements().add(ecgw);
		ruleresult.getCreatedLinkElements().add(ecgwToStep);
		return new Object[] { ruleresult, sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep };
	}

	public static final Object[] pattern_ChoiceAfterSplit_11_3_blackBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject p2uc, EObject prevNode, EObject pstep, EObject pg2ps, EObject sf1,
			EObject pflow, EObject step, EObject flow, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		if (!process.equals(useCase)) {
			if (!process.equals(pstep)) {
				if (!process.equals(sf1)) {
					if (!process.equals(step)) {
						if (!p2uc.equals(process)) {
							if (!p2uc.equals(useCase)) {
								if (!p2uc.equals(prevNode)) {
									if (!p2uc.equals(pstep)) {
										if (!p2uc.equals(pg2ps)) {
											if (!p2uc.equals(sf1)) {
												if (!p2uc.equals(pflow)) {
													if (!p2uc.equals(step)) {
														if (!prevNode.equals(process)) {
															if (!prevNode.equals(useCase)) {
																if (!prevNode.equals(pstep)) {
																	if (!prevNode.equals(sf1)) {
																		if (!prevNode.equals(step)) {
																			if (!pstep.equals(useCase)) {
																				if (!pstep.equals(sf1)) {
																					if (!pstep.equals(step)) {
																						if (!pg2ps.equals(process)) {
																							if (!pg2ps
																									.equals(useCase)) {
																								if (!pg2ps.equals(
																										prevNode)) {
																									if (!pg2ps.equals(
																											pstep)) {
																										if (!pg2ps
																												.equals(sf1)) {
																											if (!pg2ps
																													.equals(step)) {
																												if (!sf1.equals(
																														useCase)) {
																													if (!sf1.equals(
																															step)) {
																														if (!pflow
																																.equals(process)) {
																															if (!pflow
																																	.equals(useCase)) {
																																if (!pflow
																																		.equals(prevNode)) {
																																	if (!pflow
																																			.equals(pstep)) {
																																		if (!pflow
																																				.equals(pg2ps)) {
																																			if (!pflow
																																					.equals(sf1)) {
																																				if (!pflow
																																						.equals(step)) {
																																					if (!step
																																							.equals(useCase)) {
																																						if (!flow
																																								.equals(process)) {
																																							if (!flow
																																									.equals(useCase)) {
																																								if (!flow
																																										.equals(p2uc)) {
																																									if (!flow
																																											.equals(prevNode)) {
																																										if (!flow
																																												.equals(pstep)) {
																																											if (!flow
																																													.equals(pg2ps)) {
																																												if (!flow
																																														.equals(sf1)) {
																																													if (!flow
																																															.equals(pflow)) {
																																														if (!flow
																																																.equals(step)) {
																																															if (!egw.equals(
																																																	process)) {
																																																if (!egw.equals(
																																																		useCase)) {
																																																	if (!egw.equals(
																																																			p2uc)) {
																																																		if (!egw.equals(
																																																				prevNode)) {
																																																			if (!egw.equals(
																																																					pstep)) {
																																																				if (!egw.equals(
																																																						pg2ps)) {
																																																					if (!egw.equals(
																																																							sf1)) {
																																																						if (!egw.equals(
																																																								pflow)) {
																																																							if (!egw.equals(
																																																									step)) {
																																																								if (!egw.equals(
																																																										flow)) {
																																																									if (!egw.equals(
																																																											egwToStep)) {
																																																										if (!egwToStep
																																																												.equals(process)) {
																																																											if (!egwToStep
																																																													.equals(useCase)) {
																																																												if (!egwToStep
																																																														.equals(p2uc)) {
																																																													if (!egwToStep
																																																															.equals(prevNode)) {
																																																														if (!egwToStep
																																																																.equals(pstep)) {
																																																															if (!egwToStep
																																																																	.equals(pg2ps)) {
																																																																if (!egwToStep
																																																																		.equals(sf1)) {
																																																																	if (!egwToStep
																																																																			.equals(pflow)) {
																																																																		if (!egwToStep
																																																																				.equals(step)) {
																																																																			if (!egwToStep
																																																																					.equals(flow)) {
																																																																				if (!ecgw
																																																																						.equals(process)) {
																																																																					if (!ecgw
																																																																							.equals(useCase)) {
																																																																						if (!ecgw
																																																																								.equals(p2uc)) {
																																																																							if (!ecgw
																																																																									.equals(prevNode)) {
																																																																								if (!ecgw
																																																																										.equals(pstep)) {
																																																																									if (!ecgw
																																																																											.equals(pg2ps)) {
																																																																										if (!ecgw
																																																																												.equals(sf1)) {
																																																																											if (!ecgw
																																																																													.equals(pflow)) {
																																																																												if (!ecgw
																																																																														.equals(step)) {
																																																																													if (!ecgw
																																																																															.equals(flow)) {
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
																																																																																						.equals(prevNode)) {
																																																																																					if (!ecgwToStep
																																																																																							.equals(pstep)) {
																																																																																						if (!ecgwToStep
																																																																																								.equals(pg2ps)) {
																																																																																							if (!ecgwToStep
																																																																																									.equals(sf1)) {
																																																																																								if (!ecgwToStep
																																																																																										.equals(pflow)) {
																																																																																									if (!ecgwToStep
																																																																																											.equals(step)) {
																																																																																										if (!ecgwToStep
																																																																																												.equals(flow)) {
																																																																																											if (!ecgwToStep
																																																																																													.equals(egw)) {
																																																																																												if (!ecgwToStep
																																																																																														.equals(egwToStep)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															process,
																																																																																															useCase,
																																																																																															p2uc,
																																																																																															prevNode,
																																																																																															pstep,
																																																																																															pg2ps,
																																																																																															sf1,
																																																																																															pflow,
																																																																																															step,
																																																																																															flow,
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
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject prevNode, EObject pstep,
			EObject sf1, EObject pflow, EObject step, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__egw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__ecgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ChoiceAfterSplit";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__pflow____flows_name_prime = "flows";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String pflow__step____steps_name_prime = "steps";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		String egwToStep__egw____source_name_prime = "source";
		String egwToStep__step____target_name_prime = "target";
		String ecgwToStep__ecgw____source_name_prime = "source";
		String ecgwToStep__step____target_name_prime = "target";
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getCreatedEdges().add(process__sf1____flowElements);
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		ruleresult.getTranslatedEdges().add(useCase__pflow____flows);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		ruleresult.getTranslatedEdges().add(pstep__pflow____invokedFlows);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(pflow__step____steps);
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
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		egwToStep__egw____source.setName(egwToStep__egw____source_name_prime);
		egwToStep__step____target.setName(egwToStep__step____target_name_prime);
		ecgwToStep__ecgw____source.setName(ecgwToStep__ecgw____source_name_prime);
		ecgwToStep__step____target.setName(ecgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, process, useCase, prevNode, pstep, sf1, pflow, step, egw, egwToStep, ecgw,
				ecgwToStep, process__sf1____flowElements, useCase__pflow____flows, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, pstep__pflow____invokedFlows, pflow__step____steps,
				process__egw____flowElements, process__ecgw____flowElements, sf1__egw____targetRef,
				egw__sf1____incoming, egw__ecgw______conv, egwToStep__egw____source, egwToStep__step____target,
				ecgwToStep__ecgw____source, ecgwToStep__step____target };
	}

	public static final void pattern_ChoiceAfterSplit_11_5_expressionBBBBBBBBBBBBBBBB(ChoiceAfterSplit _this,
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject p2uc, EObject prevNode,
			EObject pstep, EObject pg2ps, EObject sf1, EObject pflow, EObject step, EObject flow, EObject egw,
			EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_BWD(ruleresult, process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow,
				egw, egwToStep, ecgw, ecgwToStep);

	}

	public static final PerformRuleResult pattern_ChoiceAfterSplit_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_12_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_12_1_blackFBB(EClass eClass, ChoiceAfterSplit _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_12_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_12_1_binding = pattern_ChoiceAfterSplit_12_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ChoiceAfterSplit_12_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_12_1_black = pattern_ChoiceAfterSplit_12_1_blackFBB(eClass, _this);
			if (result_pattern_ChoiceAfterSplit_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ChoiceAfterSplit_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ChoiceAfterSplit";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ChoiceAfterSplit_12_2_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("useCase");
		EObject _localVariable_1 = match.getObject("pstep");
		EObject _localVariable_2 = match.getObject("pflow");
		EObject _localVariable_3 = match.getObject("step");
		EObject _localVariable_4 = match.getObject("flow");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpPstep = _localVariable_1;
		EObject tmpPflow = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpPstep instanceof ParallelStep) {
				ParallelStep pstep = (ParallelStep) tmpPstep;
				if (tmpPflow instanceof ParallelFlow) {
					ParallelFlow pflow = (ParallelFlow) tmpPflow;
					if (tmpStep instanceof ChoiceStep) {
						ChoiceStep step = (ChoiceStep) tmpStep;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							return new Object[] { useCase, pstep, pflow, step, flow, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_12_2_blackFBFFBFBBBB(UseCase useCase,
			ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!flow.equals(pflow)) {
			for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(useCase, P2UC.class,
					"target")) {
				de.abilov.bpmn.Process process = p2uc.getSource();
				if (process != null) {
					for (GW2S pg2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pstep,
							GW2S.class, "target")) {
						Gateway tmpPrevNode = pg2ps.getSource();
						if (tmpPrevNode instanceof ParallelGateway) {
							ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								_result.add(new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step,
										flow, match });
							}

						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_12_3_blackBBBBBBBBB(de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, ParallelFlow pflow,
			ChoiceStep step, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!flow.equals(pflow)) {
			if (process.getFlowElements().contains(prevNode)) {
				if (useCase.getFlows().contains(pflow)) {
					if (useCase.getFlows().contains(flow)) {
						if (process.equals(p2uc.getSource())) {
							if (useCase.equals(p2uc.getTarget())) {
								if (pstep.getInvokedFlows().contains(pflow)) {
									if (prevNode.equals(pg2ps.getSource())) {
										if (pstep.equals(pg2ps.getTarget())) {
											if (pflow.getSteps().contains(step)) {
												if (flow.getSteps().contains(pstep)) {
													boolean prevNodeisDiverging = prevNode.isIsDiverging();
													if (Boolean.valueOf(prevNodeisDiverging)
															.equals(Boolean.valueOf(true))) {
														_result.add(new Object[] { process, useCase, p2uc, prevNode,
																pstep, pg2ps, pflow, step, flow });
													}

												}
											}
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

	public static final Object[] pattern_ChoiceAfterSplit_12_3_greenBBBBBBBBBFFFFFFFFFFF(de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, ParallelFlow pflow,
			ChoiceStep step, Flow flow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg2ps__pstep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__pstep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__prevNode____flowElements_name_prime = "flowElements";
		String useCase__pflow____flows_name_prime = "flows";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String pg2ps__prevNode____source_name_prime = "source";
		String pg2ps__pstep____target_name_prime = "target";
		String pflow__step____steps_name_prime = "steps";
		String flow__pstep____steps_name_prime = "steps";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(pg2ps);
		isApplicableMatch.getAllContextElements().add(pflow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		isApplicableMatch.getAllContextElements().add(useCase__pflow____flows);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		isApplicableMatch.getAllContextElements().add(pstep__pflow____invokedFlows);
		pg2ps__prevNode____source.setSrc(pg2ps);
		pg2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pg2ps__prevNode____source);
		pg2ps__pstep____target.setSrc(pg2ps);
		pg2ps__pstep____target.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(pg2ps__pstep____target);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(pflow__step____steps);
		flow__pstep____steps.setSrc(flow);
		flow__pstep____steps.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(flow__pstep____steps);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		pg2ps__prevNode____source.setName(pg2ps__prevNode____source_name_prime);
		pg2ps__pstep____target.setName(pg2ps__pstep____target_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		flow__pstep____steps.setName(flow__pstep____steps_name_prime);
		return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow, isApplicableMatch,
				process__prevNode____flowElements, useCase__pflow____flows, useCase__flow____flows,
				p2uc__process____source, p2uc__useCase____target, pstep__pflow____invokedFlows,
				pg2ps__prevNode____source, pg2ps__pstep____target, pflow__step____steps, flow__pstep____steps };
	}

	public static final Object[] pattern_ChoiceAfterSplit_12_4_bindingFBBBBBBBBBBB(ChoiceAfterSplit _this,
			IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, process, useCase, p2uc, prevNode,
				pstep, pg2ps, pflow, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps, pflow,
					step, flow };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterSplit_12_4_bindingAndBlackFBBBBBBBBBBB(ChoiceAfterSplit _this,
			IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		Object[] result_pattern_ChoiceAfterSplit_12_4_binding = pattern_ChoiceAfterSplit_12_4_bindingFBBBBBBBBBBB(_this,
				isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow);
		if (result_pattern_ChoiceAfterSplit_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterSplit_12_4_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_12_4_black = pattern_ChoiceAfterSplit_12_4_blackB(csp);
			if (result_pattern_ChoiceAfterSplit_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps,
						pflow, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterSplit_12_5_expressionFBB(ChoiceAfterSplit _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ChoiceAfterSplit_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ChoiceAfterSplit";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ChoiceAfterSplit_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_1_blackFBB(EClass __eClass, ChoiceAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_20_1_binding = pattern_ChoiceAfterSplit_20_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterSplit_20_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_20_1_black = pattern_ChoiceAfterSplit_20_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterSplit_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterSplit_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_36250 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_36250)) {
					if (!ecgw.equals(__DEC_sf1_default_36250)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_54905 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_54905)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_542859 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_542859)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_842079 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_842079)) {
					if (!prevNode.equals(__DEC_egw___conv_842079)) {
						if (!ecgw.equals(__DEC_egw___conv_842079)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_515628 = ecgw.get__conv();
			if (__DEC_ecgw___conv_515628 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_515628)) {
					if (!prevNode.equals(__DEC_ecgw___conv_515628)) {
						if (!egw.equals(__DEC_ecgw___conv_515628)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_629488 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_629488)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_371473 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_371473)) {
					if (!prevNode.equals(__DEC_ecgw___conv_371473)) {
						if (!egw.equals(__DEC_ecgw___conv_371473)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_20_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpSf1 = _edge_flowElements.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (process.getFlowElements().contains(sf1)) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						if (process.getFlowElements().contains(prevNode)) {
							FlowNode tmpEgw = sf1.getTargetRef();
							if (tmpEgw instanceof ExclusiveGateway) {
								ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
								if (process.getFlowElements().contains(egw)) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
										Gateway tmpEcgw = egw.get__conv();
										if (tmpEcgw instanceof ExclusiveGateway) {
											ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
											if (!ecgw.equals(egw)) {
												if (process.getFlowElements().contains(ecgw)) {
													boolean egwisDiverging = egw.isIsDiverging();
													if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
														boolean ecgwisDiverging = ecgw.isIsDiverging();
														if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
															if (pattern_ChoiceAfterSplit_20_2_black_nac_1BB(sf1,
																	process) == null) {
																if (pattern_ChoiceAfterSplit_20_2_black_nac_2BB(egw,
																		process) == null) {
																	if (pattern_ChoiceAfterSplit_20_2_black_nac_7BB(egw,
																			sf1) == null) {
																		if (pattern_ChoiceAfterSplit_20_2_black_nac_9BB(
																				prevNode, egw) == null) {
																			if (pattern_ChoiceAfterSplit_20_2_black_nac_0BBB(
																					sf1, egw, ecgw) == null) {
																				if (pattern_ChoiceAfterSplit_20_2_black_nac_3BBB(
																						egw, prevNode, ecgw) == null) {
																					if (pattern_ChoiceAfterSplit_20_2_black_nac_4BBB(
																							ecgw, prevNode,
																							egw) == null) {
																						if (pattern_ChoiceAfterSplit_20_2_black_nac_5BB(
																								ecgw,
																								process) == null) {
																							if (pattern_ChoiceAfterSplit_20_2_black_nac_6BBB(
																									ecgw, prevNode,
																									egw) == null) {
																								if (pattern_ChoiceAfterSplit_20_2_black_nac_8BB(
																										ecgw,
																										sf1) == null) {
																									if (pattern_ChoiceAfterSplit_20_2_black_nac_10BB(
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterSplit_20_3_expressionFBBBBBBB(ChoiceAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_20_4_expressionFBB(ChoiceAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterSplit_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_21_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_21_1_blackFBB(EClass __eClass, ChoiceAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_21_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_21_1_binding = pattern_ChoiceAfterSplit_21_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterSplit_21_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_21_1_black = pattern_ChoiceAfterSplit_21_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterSplit_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterSplit_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_21_2_black_nac_0BB(ParallelFlow pflow, ParallelStep pstep) {
		for (ParallelStep __DEC_pflow_invokedFlows_346365 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, ParallelStep.class, "invokedFlows")) {
			if (!pstep.equals(__DEC_pflow_invokedFlows_346365)) {
				return new Object[] { pflow, pstep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_21_2_black_nac_1BB(ParallelFlow pflow, UseCase useCase) {
		for (UseCase __DEC_pflow_flows_979532 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_pflow_flows_979532)) {
				return new Object[] { pflow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_21_2_black_nac_2BBB(ChoiceStep step, ParallelFlow pflow,
			Flow flow) {
		if (!flow.equals(pflow)) {
			for (Flow __DEC_step_steps_444510 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!pflow.equals(__DEC_step_steps_444510)) {
					if (!flow.equals(__DEC_step_steps_444510)) {
						return new Object[] { step, pflow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_21_2_black_nac_3BB(ChoiceStep step, ParallelStep pstep) {
		for (Step __DEC_step_next_947859 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_947859)) {
				if (!pstep.equals(__DEC_step_next_947859)) {
					return new Object[] { step, pstep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_21_2_black_nac_4BB(Flow flow, ChoiceStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_21_2_black_nac_5BB(ParallelStep pstep, ChoiceStep step) {
		if (step.equals(pstep.getNext())) {
			return new Object[] { pstep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_21_2_blackFFFFFB(EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpPflow = _edge_flows.getTrg();
			if (tmpPflow instanceof ParallelFlow) {
				ParallelFlow pflow = (ParallelFlow) tmpPflow;
				if (useCase.getFlows().contains(pflow)) {
					if (pattern_ChoiceAfterSplit_21_2_black_nac_1BB(pflow, useCase) == null) {
						for (Flow flow : useCase.getFlows()) {
							if (!flow.equals(pflow)) {
								for (Step tmpStep : pflow.getSteps()) {
									if (tmpStep instanceof ChoiceStep) {
										ChoiceStep step = (ChoiceStep) tmpStep;
										if (pattern_ChoiceAfterSplit_21_2_black_nac_2BBB(step, pflow, flow) == null) {
											if (pattern_ChoiceAfterSplit_21_2_black_nac_4BB(flow, step) == null) {
												for (Step tmpPstep : flow.getSteps()) {
													if (tmpPstep instanceof ParallelStep) {
														ParallelStep pstep = (ParallelStep) tmpPstep;
														if (pstep.getInvokedFlows().contains(pflow)) {
															if (pattern_ChoiceAfterSplit_21_2_black_nac_0BB(pflow,
																	pstep) == null) {
																if (pattern_ChoiceAfterSplit_21_2_black_nac_3BB(step,
																		pstep) == null) {
																	if (pattern_ChoiceAfterSplit_21_2_black_nac_5BB(
																			pstep, step) == null) {
																		_result.add(new Object[] { useCase, pstep,
																				pflow, step, flow, _edge_flows });
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ChoiceAfterSplit_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterSplit_21_3_expressionFBBBBBBB(ChoiceAfterSplit _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, pstep, pflow, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_21_4_expressionFBB(ChoiceAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterSplit_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_1_blackFBB(EClass __eClass, ChoiceAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_22_1_binding = pattern_ChoiceAfterSplit_22_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterSplit_22_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_22_1_black = pattern_ChoiceAfterSplit_22_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterSplit_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterSplit_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_12336 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_12336)) {
					if (!ecgw.equals(__DEC_sf1_default_12336)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_719972 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_719972)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_734151 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_734151)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_607740 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_607740)) {
					if (!prevNode.equals(__DEC_egw___conv_607740)) {
						if (!ecgw.equals(__DEC_egw___conv_607740)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_285150 = ecgw.get__conv();
			if (__DEC_ecgw___conv_285150 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_285150)) {
					if (!prevNode.equals(__DEC_ecgw___conv_285150)) {
						if (!egw.equals(__DEC_ecgw___conv_285150)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_785838 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_785838)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_911920 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_911920)) {
					if (!prevNode.equals(__DEC_ecgw___conv_911920)) {
						if (!egw.equals(__DEC_ecgw___conv_911920)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_22_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				if (prevNode.equals(sf1.getSourceRef())) {
					FlowNode tmpEgw = sf1.getTargetRef();
					if (tmpEgw instanceof ExclusiveGateway) {
						ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
							Gateway tmpEcgw = egw.get__conv();
							if (tmpEcgw instanceof ExclusiveGateway) {
								ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
								if (!ecgw.equals(egw)) {
									boolean egwisDiverging = egw.isIsDiverging();
									if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
										boolean ecgwisDiverging = ecgw.isIsDiverging();
										if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
											if (pattern_ChoiceAfterSplit_22_2_black_nac_7BB(egw, sf1) == null) {
												if (pattern_ChoiceAfterSplit_22_2_black_nac_9BB(prevNode,
														egw) == null) {
													if (pattern_ChoiceAfterSplit_22_2_black_nac_0BBB(sf1, egw,
															ecgw) == null) {
														if (pattern_ChoiceAfterSplit_22_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_ChoiceAfterSplit_22_2_black_nac_4BBB(ecgw,
																	prevNode, egw) == null) {
																if (pattern_ChoiceAfterSplit_22_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_ChoiceAfterSplit_22_2_black_nac_8BB(
																			ecgw, sf1) == null) {
																		if (pattern_ChoiceAfterSplit_22_2_black_nac_10BB(
																				ecgw, prevNode) == null) {
																			for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(sf1,
																							de.abilov.bpmn.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(egw)) {
																						if (process.getFlowElements()
																								.contains(ecgw)) {
																							if (pattern_ChoiceAfterSplit_22_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_ChoiceAfterSplit_22_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_ChoiceAfterSplit_22_2_black_nac_5BB(
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterSplit_22_3_expressionFBBBBBBB(ChoiceAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_22_4_expressionFBB(ChoiceAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterSplit_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_1_blackFBB(EClass __eClass, ChoiceAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_23_1_binding = pattern_ChoiceAfterSplit_23_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterSplit_23_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_23_1_black = pattern_ChoiceAfterSplit_23_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterSplit_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterSplit_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_66353 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_66353)) {
					if (!ecgw.equals(__DEC_sf1_default_66353)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_196165 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_196165)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_757889 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_757889)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_609986 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_609986)) {
					if (!prevNode.equals(__DEC_egw___conv_609986)) {
						if (!ecgw.equals(__DEC_egw___conv_609986)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_405236 = ecgw.get__conv();
			if (__DEC_ecgw___conv_405236 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_405236)) {
					if (!prevNode.equals(__DEC_ecgw___conv_405236)) {
						if (!egw.equals(__DEC_ecgw___conv_405236)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_859696 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_859696)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_782380 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_782380)) {
					if (!prevNode.equals(__DEC_ecgw___conv_782380)) {
						if (!egw.equals(__DEC_ecgw___conv_782380)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_23_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof ParallelGateway) {
			ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
			EObject tmpSf1 = _edge_outgoing.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
						FlowNode tmpEgw = sf1.getTargetRef();
						if (tmpEgw instanceof ExclusiveGateway) {
							ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
							Gateway tmpEcgw = egw.get__conv();
							if (tmpEcgw instanceof ExclusiveGateway) {
								ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
								if (!ecgw.equals(egw)) {
									boolean egwisDiverging = egw.isIsDiverging();
									if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
										boolean ecgwisDiverging = ecgw.isIsDiverging();
										if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
											if (pattern_ChoiceAfterSplit_23_2_black_nac_7BB(egw, sf1) == null) {
												if (pattern_ChoiceAfterSplit_23_2_black_nac_9BB(prevNode,
														egw) == null) {
													if (pattern_ChoiceAfterSplit_23_2_black_nac_0BBB(sf1, egw,
															ecgw) == null) {
														if (pattern_ChoiceAfterSplit_23_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_ChoiceAfterSplit_23_2_black_nac_4BBB(ecgw,
																	prevNode, egw) == null) {
																if (pattern_ChoiceAfterSplit_23_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_ChoiceAfterSplit_23_2_black_nac_8BB(
																			ecgw, sf1) == null) {
																		if (pattern_ChoiceAfterSplit_23_2_black_nac_10BB(
																				ecgw, prevNode) == null) {
																			for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(prevNode,
																							de.abilov.bpmn.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(sf1)) {
																					if (process.getFlowElements()
																							.contains(egw)) {
																						if (process.getFlowElements()
																								.contains(ecgw)) {
																							if (pattern_ChoiceAfterSplit_23_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_ChoiceAfterSplit_23_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_ChoiceAfterSplit_23_2_black_nac_5BB(
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterSplit_23_3_expressionFBBBBBBB(ChoiceAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_23_4_expressionFBB(ChoiceAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterSplit_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_24_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_24_1_blackFBB(EClass __eClass, ChoiceAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_24_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_24_1_binding = pattern_ChoiceAfterSplit_24_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterSplit_24_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_24_1_black = pattern_ChoiceAfterSplit_24_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterSplit_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterSplit_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_24_2_black_nac_0BB(ParallelFlow pflow, ParallelStep pstep) {
		for (ParallelStep __DEC_pflow_invokedFlows_987242 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, ParallelStep.class, "invokedFlows")) {
			if (!pstep.equals(__DEC_pflow_invokedFlows_987242)) {
				return new Object[] { pflow, pstep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_24_2_black_nac_1BB(ParallelFlow pflow, UseCase useCase) {
		for (UseCase __DEC_pflow_flows_268120 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_pflow_flows_268120)) {
				return new Object[] { pflow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_24_2_black_nac_2BBB(ChoiceStep step, ParallelFlow pflow,
			Flow flow) {
		if (!flow.equals(pflow)) {
			for (Flow __DEC_step_steps_200318 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!pflow.equals(__DEC_step_steps_200318)) {
					if (!flow.equals(__DEC_step_steps_200318)) {
						return new Object[] { step, pflow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_24_2_black_nac_3BB(ChoiceStep step, ParallelStep pstep) {
		for (Step __DEC_step_next_30112 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_30112)) {
				if (!pstep.equals(__DEC_step_next_30112)) {
					return new Object[] { step, pstep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_24_2_black_nac_4BB(Flow flow, ChoiceStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_24_2_black_nac_5BB(ParallelStep pstep, ChoiceStep step) {
		if (step.equals(pstep.getNext())) {
			return new Object[] { pstep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_24_2_blackFFFFFB(EMoflonEdge _edge_invokedFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPstep = _edge_invokedFlows.getSrc();
		if (tmpPstep instanceof ParallelStep) {
			ParallelStep pstep = (ParallelStep) tmpPstep;
			EObject tmpPflow = _edge_invokedFlows.getTrg();
			if (tmpPflow instanceof ParallelFlow) {
				ParallelFlow pflow = (ParallelFlow) tmpPflow;
				if (pstep.getInvokedFlows().contains(pflow)) {
					if (pattern_ChoiceAfterSplit_24_2_black_nac_0BB(pflow, pstep) == null) {
						for (Step tmpStep : pflow.getSteps()) {
							if (tmpStep instanceof ChoiceStep) {
								ChoiceStep step = (ChoiceStep) tmpStep;
								if (pattern_ChoiceAfterSplit_24_2_black_nac_3BB(step, pstep) == null) {
									if (pattern_ChoiceAfterSplit_24_2_black_nac_5BB(pstep, step) == null) {
										for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(pstep, Flow.class, "steps")) {
											if (!flow.equals(pflow)) {
												if (pattern_ChoiceAfterSplit_24_2_black_nac_2BBB(step, pflow,
														flow) == null) {
													if (pattern_ChoiceAfterSplit_24_2_black_nac_4BB(flow,
															step) == null) {
														for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(pflow, UseCase.class,
																		"flows")) {
															if (useCase.getFlows().contains(flow)) {
																if (pattern_ChoiceAfterSplit_24_2_black_nac_1BB(pflow,
																		useCase) == null) {
																	_result.add(new Object[] { useCase, pstep, pflow,
																			step, flow, _edge_invokedFlows });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ChoiceAfterSplit_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterSplit_24_3_expressionFBBBBBBB(ChoiceAfterSplit _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, pstep, pflow, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_24_4_expressionFBB(ChoiceAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterSplit_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_25_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_25_1_blackFBB(EClass __eClass, ChoiceAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_25_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_25_1_binding = pattern_ChoiceAfterSplit_25_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterSplit_25_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_25_1_black = pattern_ChoiceAfterSplit_25_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterSplit_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterSplit_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_25_2_black_nac_0BB(ParallelFlow pflow, ParallelStep pstep) {
		for (ParallelStep __DEC_pflow_invokedFlows_771001 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, ParallelStep.class, "invokedFlows")) {
			if (!pstep.equals(__DEC_pflow_invokedFlows_771001)) {
				return new Object[] { pflow, pstep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_25_2_black_nac_1BB(ParallelFlow pflow, UseCase useCase) {
		for (UseCase __DEC_pflow_flows_155832 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_pflow_flows_155832)) {
				return new Object[] { pflow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_25_2_black_nac_2BBB(ChoiceStep step, ParallelFlow pflow,
			Flow flow) {
		if (!flow.equals(pflow)) {
			for (Flow __DEC_step_steps_555778 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!pflow.equals(__DEC_step_steps_555778)) {
					if (!flow.equals(__DEC_step_steps_555778)) {
						return new Object[] { step, pflow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_25_2_black_nac_3BB(ChoiceStep step, ParallelStep pstep) {
		for (Step __DEC_step_next_639266 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_639266)) {
				if (!pstep.equals(__DEC_step_next_639266)) {
					return new Object[] { step, pstep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_25_2_black_nac_4BB(Flow flow, ChoiceStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_25_2_black_nac_5BB(ParallelStep pstep, ChoiceStep step) {
		if (step.equals(pstep.getNext())) {
			return new Object[] { pstep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_25_2_blackFFFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPflow = _edge_steps.getSrc();
		if (tmpPflow instanceof ParallelFlow) {
			ParallelFlow pflow = (ParallelFlow) tmpPflow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ChoiceStep) {
				ChoiceStep step = (ChoiceStep) tmpStep;
				if (pflow.getSteps().contains(step)) {
					for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pflow,
							UseCase.class, "flows")) {
						if (pattern_ChoiceAfterSplit_25_2_black_nac_1BB(pflow, useCase) == null) {
							for (Flow flow : useCase.getFlows()) {
								if (!flow.equals(pflow)) {
									if (pattern_ChoiceAfterSplit_25_2_black_nac_2BBB(step, pflow, flow) == null) {
										if (pattern_ChoiceAfterSplit_25_2_black_nac_4BB(flow, step) == null) {
											for (Step tmpPstep : flow.getSteps()) {
												if (tmpPstep instanceof ParallelStep) {
													ParallelStep pstep = (ParallelStep) tmpPstep;
													if (pstep.getInvokedFlows().contains(pflow)) {
														if (pattern_ChoiceAfterSplit_25_2_black_nac_0BB(pflow,
																pstep) == null) {
															if (pattern_ChoiceAfterSplit_25_2_black_nac_3BB(step,
																	pstep) == null) {
																if (pattern_ChoiceAfterSplit_25_2_black_nac_5BB(pstep,
																		step) == null) {
																	_result.add(new Object[] { useCase, pstep, pflow,
																			step, flow, _edge_steps });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ChoiceAfterSplit_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterSplit_25_3_expressionFBBBBBBB(ChoiceAfterSplit _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, pstep, pflow, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_25_4_expressionFBB(ChoiceAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterSplit_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_1_blackFBB(EClass __eClass, ChoiceAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_26_1_binding = pattern_ChoiceAfterSplit_26_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterSplit_26_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_26_1_black = pattern_ChoiceAfterSplit_26_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterSplit_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterSplit_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_615347 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_615347)) {
					if (!ecgw.equals(__DEC_sf1_default_615347)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_617359 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_617359)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_559348 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_559348)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_373277 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_373277)) {
					if (!prevNode.equals(__DEC_egw___conv_373277)) {
						if (!ecgw.equals(__DEC_egw___conv_373277)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_8591 = ecgw.get__conv();
			if (__DEC_ecgw___conv_8591 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_8591)) {
					if (!prevNode.equals(__DEC_ecgw___conv_8591)) {
						if (!egw.equals(__DEC_ecgw___conv_8591)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_822712 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_822712)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_495497 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_495497)) {
					if (!prevNode.equals(__DEC_ecgw___conv_495497)) {
						if (!egw.equals(__DEC_ecgw___conv_495497)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_26_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
										if (pattern_ChoiceAfterSplit_26_2_black_nac_2BB(egw, process) == null) {
											if (pattern_ChoiceAfterSplit_26_2_black_nac_5BB(ecgw, process) == null) {
												for (FlowElement tmpPrevNode : process.getFlowElements()) {
													if (tmpPrevNode instanceof ParallelGateway) {
														ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
														boolean prevNodeisDiverging = prevNode.isIsDiverging();
														if (Boolean.valueOf(prevNodeisDiverging)
																.equals(Boolean.valueOf(true))) {
															if (pattern_ChoiceAfterSplit_26_2_black_nac_3BBB(egw,
																	prevNode, ecgw) == null) {
																if (pattern_ChoiceAfterSplit_26_2_black_nac_4BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_ChoiceAfterSplit_26_2_black_nac_6BBB(
																			ecgw, prevNode, egw) == null) {
																		if (pattern_ChoiceAfterSplit_26_2_black_nac_9BB(
																				prevNode, egw) == null) {
																			if (pattern_ChoiceAfterSplit_26_2_black_nac_10BB(
																					ecgw, prevNode) == null) {
																				for (FlowElement tmpSf1 : process
																						.getFlowElements()) {
																					if (tmpSf1 instanceof SequenceFlow) {
																						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																						if (prevNode.equals(
																								sf1.getSourceRef())) {
																							if (egw.equals(sf1
																									.getTargetRef())) {
																								if (pattern_ChoiceAfterSplit_26_2_black_nac_0BBB(
																										sf1, egw,
																										ecgw) == null) {
																									if (pattern_ChoiceAfterSplit_26_2_black_nac_1BB(
																											sf1,
																											process) == null) {
																										if (pattern_ChoiceAfterSplit_26_2_black_nac_7BB(
																												egw,
																												sf1) == null) {
																											if (pattern_ChoiceAfterSplit_26_2_black_nac_8BB(
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterSplit_26_3_expressionFBBBBBBB(ChoiceAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_26_4_expressionFBB(ChoiceAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterSplit_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_1_blackFBB(EClass __eClass, ChoiceAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_27_1_binding = pattern_ChoiceAfterSplit_27_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterSplit_27_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_27_1_black = pattern_ChoiceAfterSplit_27_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterSplit_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterSplit_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_679063 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_679063)) {
					if (!ecgw.equals(__DEC_sf1_default_679063)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_142967 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_142967)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_472921 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_472921)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_144056 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_144056)) {
					if (!prevNode.equals(__DEC_egw___conv_144056)) {
						if (!ecgw.equals(__DEC_egw___conv_144056)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_566298 = ecgw.get__conv();
			if (__DEC_ecgw___conv_566298 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_566298)) {
					if (!prevNode.equals(__DEC_ecgw___conv_566298)) {
						if (!egw.equals(__DEC_ecgw___conv_566298)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_871574 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_871574)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_253518 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_253518)) {
					if (!prevNode.equals(__DEC_ecgw___conv_253518)) {
						if (!egw.equals(__DEC_ecgw___conv_253518)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_27_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
						if (pattern_ChoiceAfterSplit_27_2_black_nac_5BB(ecgw, process) == null) {
							for (FlowElement tmpPrevNode : process.getFlowElements()) {
								if (tmpPrevNode instanceof ParallelGateway) {
									ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
										if (pattern_ChoiceAfterSplit_27_2_black_nac_10BB(ecgw, prevNode) == null) {
											for (FlowElement tmpSf1 : process.getFlowElements()) {
												if (tmpSf1 instanceof SequenceFlow) {
													SequenceFlow sf1 = (SequenceFlow) tmpSf1;
													if (prevNode.equals(sf1.getSourceRef())) {
														FlowNode tmpEgw = sf1.getTargetRef();
														if (tmpEgw instanceof ExclusiveGateway) {
															ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
															if (!ecgw.equals(egw)) {
																if (process.getFlowElements().contains(egw)) {
																	if (ecgw.equals(egw.get__conv())) {
																		boolean egwisDiverging = egw.isIsDiverging();
																		if (Boolean.valueOf(egwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			if (pattern_ChoiceAfterSplit_27_2_black_nac_1BB(
																					sf1, process) == null) {
																				if (pattern_ChoiceAfterSplit_27_2_black_nac_8BB(
																						ecgw, sf1) == null) {
																					if (pattern_ChoiceAfterSplit_27_2_black_nac_0BBB(
																							sf1, egw, ecgw) == null) {
																						if (pattern_ChoiceAfterSplit_27_2_black_nac_2BB(
																								egw, process) == null) {
																							if (pattern_ChoiceAfterSplit_27_2_black_nac_3BBB(
																									egw, prevNode,
																									ecgw) == null) {
																								if (pattern_ChoiceAfterSplit_27_2_black_nac_4BBB(
																										ecgw, prevNode,
																										egw) == null) {
																									if (pattern_ChoiceAfterSplit_27_2_black_nac_6BBB(
																											ecgw,
																											prevNode,
																											egw) == null) {
																										if (pattern_ChoiceAfterSplit_27_2_black_nac_7BB(
																												egw,
																												sf1) == null) {
																											if (pattern_ChoiceAfterSplit_27_2_black_nac_9BB(
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterSplit_27_3_expressionFBBBBBBB(ChoiceAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_27_4_expressionFBB(ChoiceAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterSplit_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_1_blackFBB(EClass __eClass, ChoiceAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_28_1_binding = pattern_ChoiceAfterSplit_28_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterSplit_28_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_28_1_black = pattern_ChoiceAfterSplit_28_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterSplit_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterSplit_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_980570 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_980570)) {
					if (!ecgw.equals(__DEC_sf1_default_980570)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_745022 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_745022)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_120784 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_120784)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_70038 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_70038)) {
					if (!prevNode.equals(__DEC_egw___conv_70038)) {
						if (!ecgw.equals(__DEC_egw___conv_70038)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_484351 = ecgw.get__conv();
			if (__DEC_ecgw___conv_484351 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_484351)) {
					if (!prevNode.equals(__DEC_ecgw___conv_484351)) {
						if (!egw.equals(__DEC_ecgw___conv_484351)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_756717 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_756717)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_900695 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_900695)) {
					if (!prevNode.equals(__DEC_ecgw___conv_900695)) {
						if (!egw.equals(__DEC_ecgw___conv_900695)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_28_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_targetRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpEgw = _edge_targetRef.getTrg();
			if (tmpEgw instanceof ExclusiveGateway) {
				ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
				if (egw.equals(sf1.getTargetRef())) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						Gateway tmpEcgw = egw.get__conv();
						if (tmpEcgw instanceof ExclusiveGateway) {
							ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
							if (!ecgw.equals(egw)) {
								boolean egwisDiverging = egw.isIsDiverging();
								if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
										boolean ecgwisDiverging = ecgw.isIsDiverging();
										if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
											if (pattern_ChoiceAfterSplit_28_2_black_nac_7BB(egw, sf1) == null) {
												if (pattern_ChoiceAfterSplit_28_2_black_nac_9BB(prevNode,
														egw) == null) {
													if (pattern_ChoiceAfterSplit_28_2_black_nac_0BBB(sf1, egw,
															ecgw) == null) {
														if (pattern_ChoiceAfterSplit_28_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_ChoiceAfterSplit_28_2_black_nac_4BBB(ecgw,
																	prevNode, egw) == null) {
																if (pattern_ChoiceAfterSplit_28_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_ChoiceAfterSplit_28_2_black_nac_8BB(
																			ecgw, sf1) == null) {
																		if (pattern_ChoiceAfterSplit_28_2_black_nac_10BB(
																				ecgw, prevNode) == null) {
																			for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(sf1,
																							de.abilov.bpmn.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(egw)) {
																						if (process.getFlowElements()
																								.contains(ecgw)) {
																							if (pattern_ChoiceAfterSplit_28_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_ChoiceAfterSplit_28_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_ChoiceAfterSplit_28_2_black_nac_5BB(
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterSplit_28_3_expressionFBBBBBBB(ChoiceAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_28_4_expressionFBB(ChoiceAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterSplit_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_1_blackFBB(EClass __eClass, ChoiceAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_29_1_binding = pattern_ChoiceAfterSplit_29_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterSplit_29_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_29_1_black = pattern_ChoiceAfterSplit_29_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterSplit_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterSplit_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_117587 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_117587)) {
					if (!ecgw.equals(__DEC_sf1_default_117587)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_220741 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_220741)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_413097 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_413097)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_361937 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_361937)) {
					if (!prevNode.equals(__DEC_egw___conv_361937)) {
						if (!ecgw.equals(__DEC_egw___conv_361937)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_431228 = ecgw.get__conv();
			if (__DEC_ecgw___conv_431228 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_431228)) {
					if (!prevNode.equals(__DEC_ecgw___conv_431228)) {
						if (!egw.equals(__DEC_ecgw___conv_431228)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_310436 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_310436)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_717197 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_717197)) {
					if (!prevNode.equals(__DEC_ecgw___conv_717197)) {
						if (!egw.equals(__DEC_ecgw___conv_717197)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_29_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
								if (tmpPrevNode instanceof ParallelGateway) {
									ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
									boolean ecgwisDiverging = ecgw.isIsDiverging();
									if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											if (pattern_ChoiceAfterSplit_29_2_black_nac_7BB(egw, sf1) == null) {
												if (pattern_ChoiceAfterSplit_29_2_black_nac_0BBB(sf1, egw,
														ecgw) == null) {
													if (pattern_ChoiceAfterSplit_29_2_black_nac_8BB(ecgw,
															sf1) == null) {
														if (pattern_ChoiceAfterSplit_29_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_ChoiceAfterSplit_29_2_black_nac_4BBB(ecgw,
																	prevNode, egw) == null) {
																if (pattern_ChoiceAfterSplit_29_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_ChoiceAfterSplit_29_2_black_nac_9BB(
																			prevNode, egw) == null) {
																		if (pattern_ChoiceAfterSplit_29_2_black_nac_10BB(
																				ecgw, prevNode) == null) {
																			for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(egw,
																							de.abilov.bpmn.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(sf1)) {
																						if (process.getFlowElements()
																								.contains(ecgw)) {
																							if (pattern_ChoiceAfterSplit_29_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_ChoiceAfterSplit_29_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_ChoiceAfterSplit_29_2_black_nac_5BB(
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterSplit_29_3_expressionFBBBBBBB(ChoiceAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_29_4_expressionFBB(ChoiceAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterSplit_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_1_bindingFB(ChoiceAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_1_blackFBB(EClass __eClass, ChoiceAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_1_bindingAndBlackFFB(ChoiceAfterSplit _this) {
		Object[] result_pattern_ChoiceAfterSplit_30_1_binding = pattern_ChoiceAfterSplit_30_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterSplit_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterSplit_30_1_binding[0];

			Object[] result_pattern_ChoiceAfterSplit_30_1_black = pattern_ChoiceAfterSplit_30_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterSplit_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterSplit_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_183981 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_183981)) {
					if (!ecgw.equals(__DEC_sf1_default_183981)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_939925 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_939925)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_876213 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_876213)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_582952 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_582952)) {
					if (!prevNode.equals(__DEC_egw___conv_582952)) {
						if (!ecgw.equals(__DEC_egw___conv_582952)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_948337 = ecgw.get__conv();
			if (__DEC_ecgw___conv_948337 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_948337)) {
					if (!prevNode.equals(__DEC_ecgw___conv_948337)) {
						if (!egw.equals(__DEC_ecgw___conv_948337)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_204005 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_204005)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_66220 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_66220)) {
					if (!prevNode.equals(__DEC_ecgw___conv_66220)) {
						if (!egw.equals(__DEC_ecgw___conv_66220)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterSplit_30_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
									if (tmpPrevNode instanceof ParallelGateway) {
										ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											if (pattern_ChoiceAfterSplit_30_2_black_nac_0BBB(sf1, egw, ecgw) == null) {
												if (pattern_ChoiceAfterSplit_30_2_black_nac_7BB(egw, sf1) == null) {
													if (pattern_ChoiceAfterSplit_30_2_black_nac_8BB(ecgw,
															sf1) == null) {
														if (pattern_ChoiceAfterSplit_30_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_ChoiceAfterSplit_30_2_black_nac_4BBB(ecgw,
																	prevNode, egw) == null) {
																if (pattern_ChoiceAfterSplit_30_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_ChoiceAfterSplit_30_2_black_nac_9BB(
																			prevNode, egw) == null) {
																		if (pattern_ChoiceAfterSplit_30_2_black_nac_10BB(
																				ecgw, prevNode) == null) {
																			for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(egw,
																							de.abilov.bpmn.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(sf1)) {
																						if (process.getFlowElements()
																								.contains(ecgw)) {
																							if (pattern_ChoiceAfterSplit_30_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_ChoiceAfterSplit_30_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_ChoiceAfterSplit_30_2_black_nac_5BB(
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterSplit_30_3_expressionFBBBBBBB(ChoiceAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterSplit_30_4_expressionFBB(ChoiceAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterSplit_30_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterSplit_30_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ChoiceAfterSplitImpl
