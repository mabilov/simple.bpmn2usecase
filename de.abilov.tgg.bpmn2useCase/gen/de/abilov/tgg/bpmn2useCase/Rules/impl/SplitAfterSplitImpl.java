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
import de.abilov.tgg.bpmn2useCase.P2UC;

import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;
import de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit;

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
 * An implementation of the model object '<em><b>Split After Split</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SplitAfterSplitImpl extends AbstractRuleImpl implements SplitAfterSplit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitAfterSplitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSplitAfterSplit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, de.abilov.bpmn.Process process, ParallelGateway prevNode,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		// initial bindings
		Object[] result1_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_0_1_blackBBBBBBB(this, match, process,
				prevNode, sf1, pgw, pcgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[process] = " + process + ", " + "[prevNode] = " + prevNode
							+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_0_2_bindingAndBlackFBBBBBBB(this,
				match, process, prevNode, sf1, pgw, pcgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[prevNode] = "
					+ prevNode + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SplitAfterSplitImpl.pattern_SplitAfterSplit_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_0_4_blackBBBBBB(match, process,
					prevNode, sf1, pgw, pcgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", "
						+ "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
						+ "[pcgw] = " + pcgw + ".");
			}
			SplitAfterSplitImpl.pattern_SplitAfterSplit_0_4_greenBBBBBBFFFFFFFF(match, process, prevNode, sf1, pgw,
					pcgw);
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[7];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[8];
					// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result4_green[9];
					// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result4_green[10];
					// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result4_green[11];
					// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result4_green[12];
					// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_0_5_blackBBBBBB(match, process,
					prevNode, sf1, pgw, pcgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[process] = " + process + ", " + "[prevNode] = " + prevNode + ", "
								+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
			}
			SplitAfterSplitImpl.pattern_SplitAfterSplit_0_5_greenBBBF(match, process, prevNode);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			SplitAfterSplitImpl.pattern_SplitAfterSplit_0_6_expressionBBBBBBB(this, match, process, prevNode, sf1, pgw,
					pcgw);
			return SplitAfterSplitImpl.pattern_SplitAfterSplit_0_7_expressionF();
		} else {
			return SplitAfterSplitImpl.pattern_SplitAfterSplit_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl
				.pattern_SplitAfterSplit_1_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[0];
		ParallelGateway prevNode = (ParallelGateway) result1_bindingAndBlack[1];
		UseCase useCase = (UseCase) result1_bindingAndBlack[2];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[3];
		ParallelStep pstep = (ParallelStep) result1_bindingAndBlack[4];
		GW2S pgw2ps = (GW2S) result1_bindingAndBlack[5];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[6];
		Flow flow = (Flow) result1_bindingAndBlack[7];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[8];
		ParallelGateway pcgw = (ParallelGateway) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_1_1_greenBBFFBFFBB(useCase, pstep, pgw,
				pcgw, csp);
		ParallelFlow pflow = (ParallelFlow) result1_green[2];
		ParallelStep step = (ParallelStep) result1_green[3];
		FN2S pcgwToStep = (FN2S) result1_green[5];
		GW2S pgwToStep = (GW2S) result1_green[6];

		// collect translated elements
		Object[] result2_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_1_2_blackBBBBBBB(sf1, pflow, step, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[pgw] = "
					+ pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", "
					+ "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_1_2_greenFBBBBBBB(sf1, pflow, step, pgw,
				pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_1_3_blackBBBBBBBBBBBBBBB(ruleresult,
				process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, pflow, step, flow, pgw, pcgwToStep, pgwToStep,
				pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[prevNode] = "
					+ prevNode + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[pstep] = "
					+ pstep + ", " + "[pgw2ps] = " + pgw2ps + ", " + "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow
					+ ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", " + "[pgw] = " + pgw + ", "
					+ "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw
					+ ".");
		}
		SplitAfterSplitImpl.pattern_SplitAfterSplit_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult, process, prevNode,
				useCase, pstep, sf1, pflow, step, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pflow__step____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[20];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[22];
				// EMoflonEdge pcgwToStep__pcgw____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pcgwToStep__step____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge pgwToStep__pgw____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge pgwToStep__step____target = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		SplitAfterSplitImpl.pattern_SplitAfterSplit_1_5_expressionBBBBBBBBBBBBBBBB(this, ruleresult, process, prevNode,
				useCase, p2uc, pstep, pgw2ps, sf1, pflow, step, flow, pgw, pcgwToStep, pgwToStep, pcgw);
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SplitAfterSplitImpl.pattern_SplitAfterSplit_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[0];
		ParallelGateway prevNode = (ParallelGateway) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ParallelGateway pgw = (ParallelGateway) result2_binding[3];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[4];
		for (Object[] result2_black : SplitAfterSplitImpl.pattern_SplitAfterSplit_2_2_blackBBFFFFBBBB(process, prevNode,
				sf1, pgw, pcgw, match)) {
			UseCase useCase = (UseCase) result2_black[2];
			P2UC p2uc = (P2UC) result2_black[3];
			ParallelStep pstep = (ParallelStep) result2_black[4];
			GW2S pgw2ps = (GW2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : SplitAfterSplitImpl.pattern_SplitAfterSplit_2_3_blackBBBBBBBFBB(process,
					prevNode, useCase, p2uc, pstep, pgw2ps, sf1, pgw, pcgw)) {
				Flow flow = (Flow) result3_black[7];
				Object[] result3_green = SplitAfterSplitImpl
						.pattern_SplitAfterSplit_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(process, prevNode, useCase, p2uc,
								pstep, pgw2ps, sf1, flow, pgw, pcgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pgw2ps__prevNode____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge pgw2ps__pstep____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge flow__pstep____steps = (EMoflonEdge) result3_green[20];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[22];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[24];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = SplitAfterSplitImpl
						.pattern_SplitAfterSplit_2_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, process,
								prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, pgw, pcgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[prevNode] = " + prevNode + ", " + "[useCase] = "
							+ useCase + ", " + "[p2uc] = " + p2uc + ", " + "[pstep] = " + pstep + ", " + "[pgw2ps] = "
							+ pgw2ps + ", " + "[sf1] = " + sf1 + ", " + "[flow] = " + flow + ", " + "[pgw] = " + pgw
							+ ", " + "[pcgw] = " + pcgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, de.abilov.bpmn.Process process, ParallelGateway prevNode,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		match.registerObject("process", process);
		match.registerObject("prevNode", prevNode);
		match.registerObject("sf1", sf1);
		match.registerObject("pgw", pgw);
		match.registerObject("pcgw", pcgw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, de.abilov.bpmn.Process process, ParallelGateway prevNode,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {// Create CSP
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
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1,
			Flow flow, ParallelGateway pgw, ParallelGateway pcgw) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

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
		eq_0.solve(var_pgw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("pgw2ps", pgw2ps);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("flow", flow);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject process, EObject prevNode, EObject useCase,
			EObject p2uc, EObject pstep, EObject pgw2ps, EObject sf1, EObject pflow, EObject step, EObject flow,
			EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("pstep", pstep);
		ruleresult.registerObject("pgw2ps", pgw2ps);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pflow", pflow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
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
	public boolean isAppropriate_BWD(Match match, UseCase useCase, ParallelStep pstep, ParallelFlow pflow,
			ParallelStep step, Flow flow) {
		// initial bindings
		Object[] result1_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_10_1_blackBBBBBBB(this, match, useCase,
				pstep, pflow, step, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", "
					+ "[pstep] = " + pstep + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", "
					+ "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SplitAfterSplitImpl
				.pattern_SplitAfterSplit_10_2_bindingAndBlackFBBBBBBB(this, match, useCase, pstep, pflow, step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[pstep] = " + pstep
					+ ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SplitAfterSplitImpl.pattern_SplitAfterSplit_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_10_4_blackBBBBBB(match, useCase, pstep,
					pflow, step, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[pstep] = "
						+ pstep + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[flow] = " + flow
						+ ".");
			}
			SplitAfterSplitImpl.pattern_SplitAfterSplit_10_4_greenBBBBBFFF(match, useCase, pstep, pflow, step);
			// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result4_green[5];
			// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result4_green[6];
			// EMoflonEdge pflow__step____steps = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_10_5_blackBBBBBB(match, useCase, pstep,
					pflow, step, flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[useCase] = " + useCase + ", " + "[pstep] = " + pstep + ", "
								+ "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			SplitAfterSplitImpl.pattern_SplitAfterSplit_10_5_greenBBBBFF(match, useCase, pstep, flow);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__pstep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			SplitAfterSplitImpl.pattern_SplitAfterSplit_10_6_expressionBBBBBBB(this, match, useCase, pstep, pflow, step,
					flow);
			return SplitAfterSplitImpl.pattern_SplitAfterSplit_10_7_expressionF();
		} else {
			return SplitAfterSplitImpl.pattern_SplitAfterSplit_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl
				.pattern_SplitAfterSplit_11_1_bindingAndBlackFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[0];
		ParallelGateway prevNode = (ParallelGateway) result1_bindingAndBlack[1];
		UseCase useCase = (UseCase) result1_bindingAndBlack[2];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[3];
		ParallelStep pstep = (ParallelStep) result1_bindingAndBlack[4];
		GW2S pgw2ps = (GW2S) result1_bindingAndBlack[5];
		ParallelFlow pflow = (ParallelFlow) result1_bindingAndBlack[6];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[7];
		Flow flow = (Flow) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_11_1_greenBBFBFFFFB(process, prevNode,
				step, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[2];
		ParallelGateway pgw = (ParallelGateway) result1_green[4];
		FN2S pcgwToStep = (FN2S) result1_green[5];
		GW2S pgwToStep = (GW2S) result1_green[6];
		ParallelGateway pcgw = (ParallelGateway) result1_green[7];

		// collect translated elements
		Object[] result2_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_11_2_blackBBBBBBB(sf1, pflow, step, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[pgw] = "
					+ pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", "
					+ "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_11_2_greenFBBBBBBB(sf1, pflow, step, pgw,
				pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_11_3_blackBBBBBBBBBBBBBBB(ruleresult,
				process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, pflow, step, flow, pgw, pcgwToStep, pgwToStep,
				pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[prevNode] = "
					+ prevNode + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[pstep] = "
					+ pstep + ", " + "[pgw2ps] = " + pgw2ps + ", " + "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow
					+ ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", " + "[pgw] = " + pgw + ", "
					+ "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw
					+ ".");
		}
		SplitAfterSplitImpl.pattern_SplitAfterSplit_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult, process, prevNode,
				useCase, pstep, sf1, pflow, step, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pflow__step____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[20];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[22];
				// EMoflonEdge pcgwToStep__pcgw____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pcgwToStep__step____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge pgwToStep__pgw____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge pgwToStep__step____target = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		SplitAfterSplitImpl.pattern_SplitAfterSplit_11_5_expressionBBBBBBBBBBBBBBBB(this, ruleresult, process, prevNode,
				useCase, p2uc, pstep, pgw2ps, sf1, pflow, step, flow, pgw, pcgwToStep, pgwToStep, pcgw);
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SplitAfterSplitImpl.pattern_SplitAfterSplit_12_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		UseCase useCase = (UseCase) result2_binding[0];
		ParallelStep pstep = (ParallelStep) result2_binding[1];
		ParallelFlow pflow = (ParallelFlow) result2_binding[2];
		ParallelStep step = (ParallelStep) result2_binding[3];
		Flow flow = (Flow) result2_binding[4];
		for (Object[] result2_black : SplitAfterSplitImpl.pattern_SplitAfterSplit_12_2_blackFFBFBFBBBB(useCase, pstep,
				pflow, step, flow, match)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			P2UC p2uc = (P2UC) result2_black[3];
			GW2S pgw2ps = (GW2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : SplitAfterSplitImpl.pattern_SplitAfterSplit_12_3_blackBBBBBBBBB(process,
					prevNode, useCase, p2uc, pstep, pgw2ps, pflow, step, flow)) {
				Object[] result3_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_12_3_greenBBBBBBBBBFFFFFFFFFFF(
						process, prevNode, useCase, p2uc, pstep, pgw2ps, pflow, step, flow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pgw2ps__prevNode____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pgw2ps__pstep____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pflow__step____steps = (EMoflonEdge) result3_green[18];
				// EMoflonEdge flow__pstep____steps = (EMoflonEdge) result3_green[19];

				// solve CSP
				Object[] result4_bindingAndBlack = SplitAfterSplitImpl
						.pattern_SplitAfterSplit_12_4_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, process,
								prevNode, useCase, p2uc, pstep, pgw2ps, pflow, step, flow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[prevNode] = " + prevNode + ", " + "[useCase] = "
							+ useCase + ", " + "[p2uc] = " + p2uc + ", " + "[pstep] = " + pstep + ", " + "[pgw2ps] = "
							+ pgw2ps + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[flow] = "
							+ flow + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, UseCase useCase, ParallelStep pstep, ParallelFlow pflow,
			ParallelStep step, Flow flow) {
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
			ParallelStep step, Flow flow) {// Create CSP
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
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ParallelFlow pflow,
			ParallelStep step, Flow flow) {// Create CSP
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
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", csp);
		var_pgw_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_pflow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_pgw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("pgw2ps", pgw2ps);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject process, EObject prevNode, EObject useCase,
			EObject p2uc, EObject pstep, EObject pgw2ps, EObject sf1, EObject pflow, EObject step, EObject flow,
			EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("pstep", pstep);
		ruleresult.registerObject("pgw2ps", pgw2ps);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pflow", pflow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
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
		return true
				&& match.getObject("pflow").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getParallelFlow())
				&& match.getObject("step").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getParallelStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_407(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterSplitImpl
				.pattern_SplitAfterSplit_20_2_blackFFFFFB(_edge_flowElements)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterSplitImpl.pattern_SplitAfterSplit_20_3_expressionFBBBBBBB(this, match, process, prevNode, sf1,
					pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_408(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterSplitImpl.pattern_SplitAfterSplit_21_2_blackFFFFFB(_edge_sourceRef)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterSplitImpl.pattern_SplitAfterSplit_21_3_expressionFBBBBBBB(this, match, process, prevNode, sf1,
					pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_409(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterSplitImpl.pattern_SplitAfterSplit_22_2_blackFFFFFB(_edge_outgoing)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterSplitImpl.pattern_SplitAfterSplit_22_3_expressionFBBBBBBB(this, match, process, prevNode, sf1,
					pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_126(EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterSplitImpl.pattern_SplitAfterSplit_23_2_blackFFFFFB(_edge_flows)) {
			UseCase useCase = (UseCase) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			ParallelFlow pflow = (ParallelFlow) result2_black[2];
			ParallelStep step = (ParallelStep) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterSplitImpl.pattern_SplitAfterSplit_23_3_expressionFBBBBBBB(this, match, useCase, pstep, pflow,
					step, flow)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_127(EMoflonEdge _edge_invokedFlows) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterSplitImpl
				.pattern_SplitAfterSplit_24_2_blackFFFFFB(_edge_invokedFlows)) {
			UseCase useCase = (UseCase) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			ParallelFlow pflow = (ParallelFlow) result2_black[2];
			ParallelStep step = (ParallelStep) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterSplitImpl.pattern_SplitAfterSplit_24_3_expressionFBBBBBBB(this, match, useCase, pstep, pflow,
					step, flow)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_128(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterSplitImpl.pattern_SplitAfterSplit_25_2_blackFFFFFB(_edge_steps)) {
			UseCase useCase = (UseCase) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			ParallelFlow pflow = (ParallelFlow) result2_black[2];
			ParallelStep step = (ParallelStep) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterSplitImpl.pattern_SplitAfterSplit_25_3_expressionFBBBBBBB(this, match, useCase, pstep, pflow,
					step, flow)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_410(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterSplitImpl
				.pattern_SplitAfterSplit_26_2_blackFFFFFB(_edge_flowElements)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterSplitImpl.pattern_SplitAfterSplit_26_3_expressionFBBBBBBB(this, match, process, prevNode, sf1,
					pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_411(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterSplitImpl
				.pattern_SplitAfterSplit_27_2_blackFFFFFB(_edge_flowElements)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterSplitImpl.pattern_SplitAfterSplit_27_3_expressionFBBBBBBB(this, match, process, prevNode, sf1,
					pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_412(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterSplitImpl.pattern_SplitAfterSplit_28_2_blackFFFFFB(_edge_targetRef)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterSplitImpl.pattern_SplitAfterSplit_28_3_expressionFBBBBBBB(this, match, process, prevNode, sf1,
					pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_28_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_413(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterSplitImpl.pattern_SplitAfterSplit_29_2_blackFFFFFB(_edge_incoming)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterSplitImpl.pattern_SplitAfterSplit_29_3_expressionFBBBBBBB(this, match, process, prevNode, sf1,
					pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_29_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_29_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_414(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterSplitImpl.pattern_SplitAfterSplit_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterSplitImpl.pattern_SplitAfterSplit_30_2_blackFFFFFB(_edge___conv)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterSplitImpl.pattern_SplitAfterSplit_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterSplitImpl.pattern_SplitAfterSplit_30_3_expressionFBBBBBBB(this, match, process, prevNode, sf1,
					pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterSplitImpl.pattern_SplitAfterSplit_30_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterSplitImpl.pattern_SplitAfterSplit_30_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterSplitImpl.pattern_SplitAfterSplit_30_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterSplitImpl.pattern_SplitAfterSplit_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SplitAfterSplit");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ParallelGateway prevNode = (de.abilov.bpmn.ParallelGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		de.abilov.useCase.UseCase useCase = (de.abilov.useCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		de.abilov.tgg.bpmn2useCase.P2UC p2uc = (de.abilov.tgg.bpmn2useCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPstep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pstep")).findAny();
		de.abilov.useCase.ParallelStep pstep = (de.abilov.useCase.ParallelStep) matchForPstep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw2ps")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pgw2ps = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPgw2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPflow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pflow")).findAny();
		de.abilov.useCase.ParallelFlow pflow = (de.abilov.useCase.ParallelFlow) matchForPflow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ParallelStep step = (de.abilov.useCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

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

		if (!(prevNode.isIsDiverging() == true)) {
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

		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");

		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow", true, csp);
		var_pflow_id.setValue(pflow.getId());
		var_pflow_id.setType("String");

		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("SplitAfterSplit");
		eq0.solve(var_sf1_id, var_pflow_id);

		eq1.setRuleName("SplitAfterSplit");
		eq1.solve(var_pgw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_pflow_id.setBound(false);
			var_step_id.setBound(false);
			eq0.solve(var_sf1_id, var_pflow_id);
			eq1.solve(var_pgw_id, var_step_id);
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
		ruleResult.setRule("SplitAfterSplit");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ParallelGateway prevNode = (de.abilov.bpmn.ParallelGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		de.abilov.useCase.UseCase useCase = (de.abilov.useCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		de.abilov.tgg.bpmn2useCase.P2UC p2uc = (de.abilov.tgg.bpmn2useCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPstep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pstep")).findAny();
		de.abilov.useCase.ParallelStep pstep = (de.abilov.useCase.ParallelStep) matchForPstep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw2ps")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pgw2ps = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPgw2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPflow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pflow")).findAny();
		de.abilov.useCase.ParallelFlow pflow = (de.abilov.useCase.ParallelFlow) matchForPflow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ParallelStep step = (de.abilov.useCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

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

		if (!(prevNode.isIsDiverging() == true)) {
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

		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");

		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow", true, csp);
		var_pflow_id.setValue(pflow.getId());
		var_pflow_id.setType("String");

		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("SplitAfterSplit");
		eq0.solve(var_sf1_id, var_pflow_id);

		eq1.setRuleName("SplitAfterSplit");
		eq1.solve(var_pgw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_sf1_id.setBound(false);
			var_pgw_id.setBound(false);
			eq0.solve(var_sf1_id, var_pflow_id);
			eq1.solve(var_pgw_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				sf1.setId((String) var_sf1_id.getValue());
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
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (de.abilov.bpmn.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.SPLIT_AFTER_SPLIT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (de.abilov.bpmn.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
			return null;
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (de.abilov.bpmn.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_USECASE_P2UC_PARALLELSTEP_GW2S_SEQUENCEFLOW_FLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(de.abilov.bpmn.Process) arguments.get(1), (ParallelGateway) arguments.get(2),
					(UseCase) arguments.get(3), (P2UC) arguments.get(4), (ParallelStep) arguments.get(5),
					(GW2S) arguments.get(6), (SequenceFlow) arguments.get(7), (Flow) arguments.get(8),
					(ParallelGateway) arguments.get(9), (ParallelGateway) arguments.get(10));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.SPLIT_AFTER_SPLIT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_PARALLELSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(ParallelStep) arguments.get(2), (ParallelFlow) arguments.get(3), (ParallelStep) arguments.get(4),
					(Flow) arguments.get(5));
		case RulesPackage.SPLIT_AFTER_SPLIT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_PARALLELSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(ParallelStep) arguments.get(2), (ParallelFlow) arguments.get(3), (ParallelStep) arguments.get(4),
					(Flow) arguments.get(5));
			return null;
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_PARALLELSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(ParallelStep) arguments.get(2), (ParallelFlow) arguments.get(3), (ParallelStep) arguments.get(4),
					(Flow) arguments.get(5));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_USECASE_P2UC_PARALLELSTEP_GW2S_PARALLELFLOW_PARALLELSTEP_FLOW:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(de.abilov.bpmn.Process) arguments.get(1), (ParallelGateway) arguments.get(2),
					(UseCase) arguments.get(3), (P2UC) arguments.get(4), (ParallelStep) arguments.get(5),
					(GW2S) arguments.get(6), (ParallelFlow) arguments.get(7), (ParallelStep) arguments.get(8),
					(Flow) arguments.get(9));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.SPLIT_AFTER_SPLIT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_407__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_407((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_408__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_408((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_409__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_409((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_126__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_126((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_127__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_127((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_128__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_128((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_410__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_410((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_411__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_411((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_412__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_412((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_413__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_413((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_414__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_414((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_SPLIT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SplitAfterSplit_0_1_blackBBBBBBB(SplitAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					return new Object[] { _this, match, process, prevNode, sf1, pgw, pcgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_0_2_bindingFBBBBBBB(SplitAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process, prevNode, sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, prevNode, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterSplit_0_2_bindingAndBlackFBBBBBBB(SplitAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		Object[] result_pattern_SplitAfterSplit_0_2_binding = pattern_SplitAfterSplit_0_2_bindingFBBBBBBB(_this, match,
				process, prevNode, sf1, pgw, pcgw);
		if (result_pattern_SplitAfterSplit_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterSplit_0_2_binding[0];

			Object[] result_pattern_SplitAfterSplit_0_2_black = pattern_SplitAfterSplit_0_2_blackB(csp);
			if (result_pattern_SplitAfterSplit_0_2_black != null) {

				return new Object[] { csp, _this, match, process, prevNode, sf1, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterSplit_0_3_expressionFBB(SplitAfterSplit _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_0_4_blackBBBBBB(Match match, de.abilov.bpmn.Process process,
			ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					return new Object[] { match, process, prevNode, sf1, pgw, pcgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_0_4_greenBBBBBBFFFFFFFF(Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf1);
		match.getToBeTranslatedNodes().add(pgw);
		match.getToBeTranslatedNodes().add(pcgw);
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		match.getToBeTranslatedEdges().add(process__sf1____flowElements);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		match.getToBeTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____outgoing);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		match.getToBeTranslatedEdges().add(process__pgw____flowElements);
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
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		return new Object[] { match, process, prevNode, sf1, pgw, pcgw, process__sf1____flowElements,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, process__pgw____flowElements,
				process__pcgw____flowElements, sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv };
	}

	public static final Object[] pattern_SplitAfterSplit_0_5_blackBBBBBB(Match match, de.abilov.bpmn.Process process,
			ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					return new Object[] { match, process, prevNode, sf1, pgw, pcgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_0_5_greenBBBF(Match match, de.abilov.bpmn.Process process,
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

	public static final void pattern_SplitAfterSplit_0_6_expressionBBBBBBB(SplitAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		_this.registerObjectsToMatch_FWD(match, process, prevNode, sf1, pgw, pcgw);

	}

	public static final boolean pattern_SplitAfterSplit_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_1_1_bindingFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_3 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_4 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_5 = isApplicableMatch.getObject("pgw2ps");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_9 = isApplicableMatch.getObject("pcgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpP2uc = _localVariable_3;
		EObject tmpPstep = _localVariable_4;
		EObject tmpPgw2ps = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpPgw = _localVariable_8;
		EObject tmpPcgw = _localVariable_9;
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpP2uc instanceof P2UC) {
						P2UC p2uc = (P2UC) tmpP2uc;
						if (tmpPstep instanceof ParallelStep) {
							ParallelStep pstep = (ParallelStep) tmpPstep;
							if (tmpPgw2ps instanceof GW2S) {
								GW2S pgw2ps = (GW2S) tmpPgw2ps;
								if (tmpSf1 instanceof SequenceFlow) {
									SequenceFlow sf1 = (SequenceFlow) tmpSf1;
									if (tmpFlow instanceof Flow) {
										Flow flow = (Flow) tmpFlow;
										if (tmpPgw instanceof ParallelGateway) {
											ParallelGateway pgw = (ParallelGateway) tmpPgw;
											if (tmpPcgw instanceof ParallelGateway) {
												ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
												return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps,
														sf1, flow, pgw, pcgw, isApplicableMatch };
											}
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

	public static final Object[] pattern_SplitAfterSplit_1_1_blackBBBBBBBBBBBFB(de.abilov.bpmn.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1,
			Flow flow, ParallelGateway pgw, ParallelGateway pcgw, SplitAfterSplit _this,
			IsApplicableMatch isApplicableMatch) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, pgw, pcgw,
									_this, csp, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_1_1_bindingAndBlackFFFFFFFFFFBFB(SplitAfterSplit _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SplitAfterSplit_1_1_binding = pattern_SplitAfterSplit_1_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SplitAfterSplit_1_1_binding != null) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_SplitAfterSplit_1_1_binding[0];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_SplitAfterSplit_1_1_binding[1];
			UseCase useCase = (UseCase) result_pattern_SplitAfterSplit_1_1_binding[2];
			P2UC p2uc = (P2UC) result_pattern_SplitAfterSplit_1_1_binding[3];
			ParallelStep pstep = (ParallelStep) result_pattern_SplitAfterSplit_1_1_binding[4];
			GW2S pgw2ps = (GW2S) result_pattern_SplitAfterSplit_1_1_binding[5];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_SplitAfterSplit_1_1_binding[6];
			Flow flow = (Flow) result_pattern_SplitAfterSplit_1_1_binding[7];
			ParallelGateway pgw = (ParallelGateway) result_pattern_SplitAfterSplit_1_1_binding[8];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_SplitAfterSplit_1_1_binding[9];

			Object[] result_pattern_SplitAfterSplit_1_1_black = pattern_SplitAfterSplit_1_1_blackBBBBBBBBBBBFB(process,
					prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, pgw, pcgw, _this, isApplicableMatch);
			if (result_pattern_SplitAfterSplit_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SplitAfterSplit_1_1_black[11];

				return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, pgw, pcgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_1_1_greenBBFFBFFBB(UseCase useCase, ParallelStep pstep,
			ParallelGateway pgw, ParallelGateway pcgw, CSP csp) {
		ParallelFlow pflow = UseCaseFactory.eINSTANCE.createParallelFlow();
		ParallelStep step = UseCaseFactory.eINSTANCE.createParallelStep();
		FN2S pcgwToStep = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("pflow", "id");
		Object _localVariable_1 = csp.getValue("step", "id");
		useCase.getFlows().add(pflow);
		pstep.getInvokedFlows().add(pflow);
		pflow.getSteps().add(step);
		pcgwToStep.setSource(pcgw);
		pcgwToStep.setTarget(step);
		pgwToStep.setSource(pgw);
		pgwToStep.setTarget(step);
		String pflow_id_prime = (String) _localVariable_0;
		String step_id_prime = (String) _localVariable_1;
		pflow.setId(pflow_id_prime);
		step.setId(step_id_prime);
		return new Object[] { useCase, pstep, pflow, step, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_SplitAfterSplit_1_2_blackBBBBBBB(SequenceFlow sf1, ParallelFlow pflow,
			ParallelStep step, ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { sf1, pflow, step, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_1_2_greenFBBBBBBB(SequenceFlow sf1, ParallelFlow pflow,
			ParallelStep step, ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getCreatedElements().add(pflow);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(pgw);
		ruleresult.getCreatedLinkElements().add(pcgwToStep);
		ruleresult.getCreatedLinkElements().add(pgwToStep);
		ruleresult.getTranslatedElements().add(pcgw);
		return new Object[] { ruleresult, sf1, pflow, step, pgw, pcgwToStep, pgwToStep, pcgw };
	}

	public static final Object[] pattern_SplitAfterSplit_1_3_blackBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject prevNode, EObject useCase, EObject p2uc, EObject pstep, EObject pgw2ps,
			EObject sf1, EObject pflow, EObject step, EObject flow, EObject pgw, EObject pcgwToStep, EObject pgwToStep,
			EObject pcgw) {
		if (!process.equals(useCase)) {
			if (!process.equals(pstep)) {
				if (!process.equals(sf1)) {
					if (!process.equals(step)) {
						if (!prevNode.equals(process)) {
							if (!prevNode.equals(useCase)) {
								if (!prevNode.equals(pstep)) {
									if (!prevNode.equals(sf1)) {
										if (!prevNode.equals(step)) {
											if (!p2uc.equals(process)) {
												if (!p2uc.equals(prevNode)) {
													if (!p2uc.equals(useCase)) {
														if (!p2uc.equals(pstep)) {
															if (!p2uc.equals(pgw2ps)) {
																if (!p2uc.equals(sf1)) {
																	if (!p2uc.equals(pflow)) {
																		if (!p2uc.equals(step)) {
																			if (!p2uc.equals(pgw)) {
																				if (!p2uc.equals(pcgwToStep)) {
																					if (!p2uc.equals(pgwToStep)) {
																						if (!p2uc.equals(pcgw)) {
																							if (!pstep
																									.equals(useCase)) {
																								if (!pstep
																										.equals(sf1)) {
																									if (!pstep.equals(
																											step)) {
																										if (!pgw2ps
																												.equals(process)) {
																											if (!pgw2ps
																													.equals(prevNode)) {
																												if (!pgw2ps
																														.equals(useCase)) {
																													if (!pgw2ps
																															.equals(pstep)) {
																														if (!pgw2ps
																																.equals(sf1)) {
																															if (!pgw2ps
																																	.equals(step)) {
																																if (!pgw2ps
																																		.equals(pgwToStep)) {
																																	if (!sf1.equals(
																																			useCase)) {
																																		if (!sf1.equals(
																																				step)) {
																																			if (!pflow
																																					.equals(process)) {
																																				if (!pflow
																																						.equals(prevNode)) {
																																					if (!pflow
																																							.equals(useCase)) {
																																						if (!pflow
																																								.equals(pstep)) {
																																							if (!pflow
																																									.equals(pgw2ps)) {
																																								if (!pflow
																																										.equals(sf1)) {
																																									if (!pflow
																																											.equals(step)) {
																																										if (!pflow
																																												.equals(pgw)) {
																																											if (!pflow
																																													.equals(pgwToStep)) {
																																												if (!step
																																														.equals(useCase)) {
																																													if (!flow
																																															.equals(process)) {
																																														if (!flow
																																																.equals(prevNode)) {
																																															if (!flow
																																																	.equals(useCase)) {
																																																if (!flow
																																																		.equals(p2uc)) {
																																																	if (!flow
																																																			.equals(pstep)) {
																																																		if (!flow
																																																				.equals(pgw2ps)) {
																																																			if (!flow
																																																					.equals(sf1)) {
																																																				if (!flow
																																																						.equals(pflow)) {
																																																					if (!flow
																																																							.equals(step)) {
																																																						if (!flow
																																																								.equals(pgw)) {
																																																							if (!flow
																																																									.equals(pcgwToStep)) {
																																																								if (!flow
																																																										.equals(pgwToStep)) {
																																																									if (!flow
																																																											.equals(pcgw)) {
																																																										if (!pgw.equals(
																																																												process)) {
																																																											if (!pgw.equals(
																																																													prevNode)) {
																																																												if (!pgw.equals(
																																																														useCase)) {
																																																													if (!pgw.equals(
																																																															pstep)) {
																																																														if (!pgw.equals(
																																																																pgw2ps)) {
																																																															if (!pgw.equals(
																																																																	sf1)) {
																																																																if (!pgw.equals(
																																																																		step)) {
																																																																	if (!pgw.equals(
																																																																			pgwToStep)) {
																																																																		if (!pcgwToStep
																																																																				.equals(process)) {
																																																																			if (!pcgwToStep
																																																																					.equals(prevNode)) {
																																																																				if (!pcgwToStep
																																																																						.equals(useCase)) {
																																																																					if (!pcgwToStep
																																																																							.equals(pstep)) {
																																																																						if (!pcgwToStep
																																																																								.equals(pgw2ps)) {
																																																																							if (!pcgwToStep
																																																																									.equals(sf1)) {
																																																																								if (!pcgwToStep
																																																																										.equals(pflow)) {
																																																																									if (!pcgwToStep
																																																																											.equals(step)) {
																																																																										if (!pcgwToStep
																																																																												.equals(pgw)) {
																																																																											if (!pcgwToStep
																																																																													.equals(pgwToStep)) {
																																																																												if (!pgwToStep
																																																																														.equals(process)) {
																																																																													if (!pgwToStep
																																																																															.equals(prevNode)) {
																																																																														if (!pgwToStep
																																																																																.equals(useCase)) {
																																																																															if (!pgwToStep
																																																																																	.equals(pstep)) {
																																																																																if (!pgwToStep
																																																																																		.equals(sf1)) {
																																																																																	if (!pgwToStep
																																																																																			.equals(step)) {
																																																																																		if (!pcgw
																																																																																				.equals(process)) {
																																																																																			if (!pcgw
																																																																																					.equals(prevNode)) {
																																																																																				if (!pcgw
																																																																																						.equals(useCase)) {
																																																																																					if (!pcgw
																																																																																							.equals(pstep)) {
																																																																																						if (!pcgw
																																																																																								.equals(pgw2ps)) {
																																																																																							if (!pcgw
																																																																																									.equals(sf1)) {
																																																																																								if (!pcgw
																																																																																										.equals(pflow)) {
																																																																																									if (!pcgw
																																																																																											.equals(step)) {
																																																																																										if (!pcgw
																																																																																												.equals(pgw)) {
																																																																																											if (!pcgw
																																																																																													.equals(pcgwToStep)) {
																																																																																												if (!pcgw
																																																																																														.equals(pgwToStep)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															process,
																																																																																															prevNode,
																																																																																															useCase,
																																																																																															p2uc,
																																																																																															pstep,
																																																																																															pgw2ps,
																																																																																															sf1,
																																																																																															pflow,
																																																																																															step,
																																																																																															flow,
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
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject prevNode, EObject useCase, EObject pstep,
			EObject sf1, EObject pflow, EObject step, EObject pgw, EObject pcgwToStep, EObject pgwToStep,
			EObject pcgw) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SplitAfterSplit";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String useCase__pflow____flows_name_prime = "flows";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String pflow__step____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String pcgwToStep__pcgw____source_name_prime = "source";
		String pcgwToStep__step____target_name_prime = "target";
		String pgwToStep__pgw____source_name_prime = "source";
		String pgwToStep__step____target_name_prime = "target";
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(process__sf1____flowElements);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		ruleresult.getCreatedEdges().add(useCase__pflow____flows);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		ruleresult.getCreatedEdges().add(pstep__pflow____invokedFlows);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(pflow__step____steps);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		ruleresult.getTranslatedEdges().add(process__pgw____flowElements);
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
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		pcgwToStep__pcgw____source.setName(pcgwToStep__pcgw____source_name_prime);
		pcgwToStep__step____target.setName(pcgwToStep__step____target_name_prime);
		pgwToStep__pgw____source.setName(pgwToStep__pgw____source_name_prime);
		pgwToStep__step____target.setName(pgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, process, prevNode, useCase, pstep, sf1, pflow, step, pgw, pcgwToStep,
				pgwToStep, pcgw, process__sf1____flowElements, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				useCase__pflow____flows, pstep__pflow____invokedFlows, pflow__step____steps,
				process__pgw____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, pcgwToStep__pcgw____source, pcgwToStep__step____target,
				pgwToStep__pgw____source, pgwToStep__step____target };
	}

	public static final void pattern_SplitAfterSplit_1_5_expressionBBBBBBBBBBBBBBBB(SplitAfterSplit _this,
			PerformRuleResult ruleresult, EObject process, EObject prevNode, EObject useCase, EObject p2uc,
			EObject pstep, EObject pgw2ps, EObject sf1, EObject pflow, EObject step, EObject flow, EObject pgw,
			EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_FWD(ruleresult, process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, pflow, step, flow,
				pgw, pcgwToStep, pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_SplitAfterSplit_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_2_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_2_1_blackFBB(EClass eClass, SplitAfterSplit _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_2_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_2_1_binding = pattern_SplitAfterSplit_2_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SplitAfterSplit_2_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_2_1_black = pattern_SplitAfterSplit_2_1_blackFBB(eClass, _this);
			if (result_pattern_SplitAfterSplit_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SplitAfterSplit_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SplitAfterSplit";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SplitAfterSplit_2_2_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("prevNode");
		EObject _localVariable_2 = match.getObject("sf1");
		EObject _localVariable_3 = match.getObject("pgw");
		EObject _localVariable_4 = match.getObject("pcgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpSf1 = _localVariable_2;
		EObject tmpPgw = _localVariable_3;
		EObject tmpPcgw = _localVariable_4;
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				if (tmpSf1 instanceof SequenceFlow) {
					SequenceFlow sf1 = (SequenceFlow) tmpSf1;
					if (tmpPgw instanceof ParallelGateway) {
						ParallelGateway pgw = (ParallelGateway) tmpPgw;
						if (tmpPcgw instanceof ParallelGateway) {
							ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
							return new Object[] { process, prevNode, sf1, pgw, pcgw, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_2_2_blackBBFFFFBBBB(de.abilov.bpmn.Process process,
			ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
						boolean pgwisDiverging = pgw.isIsDiverging();
						if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
							boolean pcgwisDiverging = pcgw.isIsDiverging();
							if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
								for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(process, P2UC.class, "source")) {
									UseCase useCase = p2uc.getTarget();
									if (useCase != null) {
										for (GW2S pgw2ps : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(prevNode, GW2S.class, "source")) {
											Step tmpPstep = pgw2ps.getTarget();
											if (tmpPstep instanceof ParallelStep) {
												ParallelStep pstep = (ParallelStep) tmpPstep;
												_result.add(new Object[] { process, prevNode, useCase, p2uc, pstep,
														pgw2ps, sf1, pgw, pcgw, match });
											}

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

	public static final Iterable<Object[]> pattern_SplitAfterSplit_2_3_blackBBBBBBBFBB(de.abilov.bpmn.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					if (process.getFlowElements().contains(prevNode)) {
						if (process.getFlowElements().contains(sf1)) {
							if (prevNode.equals(sf1.getSourceRef())) {
								if (process.equals(p2uc.getSource())) {
									if (useCase.equals(p2uc.getTarget())) {
										if (prevNode.equals(pgw2ps.getSource())) {
											if (pstep.equals(pgw2ps.getTarget())) {
												if (process.getFlowElements().contains(pgw)) {
													if (process.getFlowElements().contains(pcgw)) {
														if (pgw.equals(sf1.getTargetRef())) {
															if (pcgw.equals(pgw.get__conv())) {
																boolean prevNodeisDiverging = prevNode.isIsDiverging();
																if (Boolean.valueOf(prevNodeisDiverging)
																		.equals(Boolean.valueOf(true))) {
																	boolean pgwisDiverging = pgw.isIsDiverging();
																	if (Boolean.valueOf(pgwisDiverging)
																			.equals(Boolean.valueOf(true))) {
																		boolean pcgwisDiverging = pcgw.isIsDiverging();
																		if (Boolean.valueOf(pcgwisDiverging)
																				.equals(false)) {
																			for (Flow flow : useCase.getFlows()) {
																				if (flow.getSteps().contains(pstep)) {
																					_result.add(new Object[] { process,
																							prevNode, useCase, p2uc,
																							pstep, pgw2ps, sf1, flow,
																							pgw, pcgw });
																				}
																			}
																		}

																	}

																}

															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SplitAfterSplit_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			de.abilov.bpmn.Process process, ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep,
			GW2S pgw2ps, SequenceFlow sf1, Flow flow, ParallelGateway pgw, ParallelGateway pcgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw2ps__pstep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__pstep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String pgw2ps__prevNode____source_name_prime = "source";
		String pgw2ps__pstep____target_name_prime = "target";
		String flow__pstep____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(pgw2ps);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(pcgw);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(process__sf1____flowElements);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____outgoing);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		pgw2ps__prevNode____source.setSrc(pgw2ps);
		pgw2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pgw2ps__prevNode____source);
		pgw2ps__pstep____target.setSrc(pgw2ps);
		pgw2ps__pstep____target.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(pgw2ps__pstep____target);
		flow__pstep____steps.setSrc(flow);
		flow__pstep____steps.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(flow__pstep____steps);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(process__pgw____flowElements);
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
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		pgw2ps__prevNode____source.setName(pgw2ps__prevNode____source_name_prime);
		pgw2ps__pstep____target.setName(pgw2ps__pstep____target_name_prime);
		flow__pstep____steps.setName(flow__pstep____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, pgw, pcgw, isApplicableMatch,
				process__prevNode____flowElements, process__sf1____flowElements, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, useCase__flow____flows, p2uc__process____source, p2uc__useCase____target,
				pgw2ps__prevNode____source, pgw2ps__pstep____target, flow__pstep____steps, process__pgw____flowElements,
				process__pcgw____flowElements, sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv };
	}

	public static final Object[] pattern_SplitAfterSplit_2_4_bindingFBBBBBBBBBBBB(SplitAfterSplit _this,
			IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process, ParallelGateway prevNode,
			UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1, Flow flow,
			ParallelGateway pgw, ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, process, prevNode, useCase, p2uc,
				pstep, pgw2ps, sf1, flow, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1,
					flow, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterSplit_2_4_bindingAndBlackFBBBBBBBBBBBB(SplitAfterSplit _this,
			IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process, ParallelGateway prevNode,
			UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1, Flow flow,
			ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_SplitAfterSplit_2_4_binding = pattern_SplitAfterSplit_2_4_bindingFBBBBBBBBBBBB(_this,
				isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, pgw, pcgw);
		if (result_pattern_SplitAfterSplit_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterSplit_2_4_binding[0];

			Object[] result_pattern_SplitAfterSplit_2_4_black = pattern_SplitAfterSplit_2_4_blackB(csp);
			if (result_pattern_SplitAfterSplit_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps,
						sf1, flow, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterSplit_2_5_expressionFBB(SplitAfterSplit _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SplitAfterSplit_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SplitAfterSplit";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SplitAfterSplit_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_10_1_blackBBBBBBB(SplitAfterSplit _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ParallelStep step, Flow flow) {
		if (!pstep.equals(step)) {
			if (!flow.equals(pflow)) {
				return new Object[] { _this, match, useCase, pstep, pflow, step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_10_2_bindingFBBBBBBB(SplitAfterSplit _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ParallelStep step, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, useCase, pstep, pflow, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCase, pstep, pflow, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterSplit_10_2_bindingAndBlackFBBBBBBB(SplitAfterSplit _this,
			Match match, UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ParallelStep step, Flow flow) {
		Object[] result_pattern_SplitAfterSplit_10_2_binding = pattern_SplitAfterSplit_10_2_bindingFBBBBBBB(_this,
				match, useCase, pstep, pflow, step, flow);
		if (result_pattern_SplitAfterSplit_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterSplit_10_2_binding[0];

			Object[] result_pattern_SplitAfterSplit_10_2_black = pattern_SplitAfterSplit_10_2_blackB(csp);
			if (result_pattern_SplitAfterSplit_10_2_black != null) {

				return new Object[] { csp, _this, match, useCase, pstep, pflow, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterSplit_10_3_expressionFBB(SplitAfterSplit _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_10_4_blackBBBBBB(Match match, UseCase useCase,
			ParallelStep pstep, ParallelFlow pflow, ParallelStep step, Flow flow) {
		if (!pstep.equals(step)) {
			if (!flow.equals(pflow)) {
				return new Object[] { match, useCase, pstep, pflow, step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_10_4_greenBBBBBFFF(Match match, UseCase useCase,
			ParallelStep pstep, ParallelFlow pflow, ParallelStep step) {
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

	public static final Object[] pattern_SplitAfterSplit_10_5_blackBBBBBB(Match match, UseCase useCase,
			ParallelStep pstep, ParallelFlow pflow, ParallelStep step, Flow flow) {
		if (!pstep.equals(step)) {
			if (!flow.equals(pflow)) {
				return new Object[] { match, useCase, pstep, pflow, step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_10_5_greenBBBBFF(Match match, UseCase useCase,
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

	public static final void pattern_SplitAfterSplit_10_6_expressionBBBBBBB(SplitAfterSplit _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ParallelStep step, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, useCase, pstep, pflow, step, flow);

	}

	public static final boolean pattern_SplitAfterSplit_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_11_1_bindingFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_3 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_4 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_5 = isApplicableMatch.getObject("pgw2ps");
		EObject _localVariable_6 = isApplicableMatch.getObject("pflow");
		EObject _localVariable_7 = isApplicableMatch.getObject("step");
		EObject _localVariable_8 = isApplicableMatch.getObject("flow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpP2uc = _localVariable_3;
		EObject tmpPstep = _localVariable_4;
		EObject tmpPgw2ps = _localVariable_5;
		EObject tmpPflow = _localVariable_6;
		EObject tmpStep = _localVariable_7;
		EObject tmpFlow = _localVariable_8;
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpP2uc instanceof P2UC) {
						P2UC p2uc = (P2UC) tmpP2uc;
						if (tmpPstep instanceof ParallelStep) {
							ParallelStep pstep = (ParallelStep) tmpPstep;
							if (tmpPgw2ps instanceof GW2S) {
								GW2S pgw2ps = (GW2S) tmpPgw2ps;
								if (tmpPflow instanceof ParallelFlow) {
									ParallelFlow pflow = (ParallelFlow) tmpPflow;
									if (tmpStep instanceof ParallelStep) {
										ParallelStep step = (ParallelStep) tmpStep;
										if (tmpFlow instanceof Flow) {
											Flow flow = (Flow) tmpFlow;
											return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps,
													pflow, step, flow, isApplicableMatch };
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

	public static final Object[] pattern_SplitAfterSplit_11_1_blackBBBBBBBBBBFB(de.abilov.bpmn.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ParallelFlow pflow,
			ParallelStep step, Flow flow, SplitAfterSplit _this, IsApplicableMatch isApplicableMatch) {
		if (!pstep.equals(step)) {
			if (!flow.equals(pflow)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, pflow, step, flow, _this,
								csp, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_11_1_bindingAndBlackFFFFFFFFFBFB(SplitAfterSplit _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SplitAfterSplit_11_1_binding = pattern_SplitAfterSplit_11_1_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SplitAfterSplit_11_1_binding != null) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_SplitAfterSplit_11_1_binding[0];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_SplitAfterSplit_11_1_binding[1];
			UseCase useCase = (UseCase) result_pattern_SplitAfterSplit_11_1_binding[2];
			P2UC p2uc = (P2UC) result_pattern_SplitAfterSplit_11_1_binding[3];
			ParallelStep pstep = (ParallelStep) result_pattern_SplitAfterSplit_11_1_binding[4];
			GW2S pgw2ps = (GW2S) result_pattern_SplitAfterSplit_11_1_binding[5];
			ParallelFlow pflow = (ParallelFlow) result_pattern_SplitAfterSplit_11_1_binding[6];
			ParallelStep step = (ParallelStep) result_pattern_SplitAfterSplit_11_1_binding[7];
			Flow flow = (Flow) result_pattern_SplitAfterSplit_11_1_binding[8];

			Object[] result_pattern_SplitAfterSplit_11_1_black = pattern_SplitAfterSplit_11_1_blackBBBBBBBBBBFB(process,
					prevNode, useCase, p2uc, pstep, pgw2ps, pflow, step, flow, _this, isApplicableMatch);
			if (result_pattern_SplitAfterSplit_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SplitAfterSplit_11_1_black[10];

				return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, pflow, step, flow, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_11_1_greenBBFBFFFFB(de.abilov.bpmn.Process process,
			ParallelGateway prevNode, ParallelStep step, CSP csp) {
		SequenceFlow sf1 = BpmnFactory.eINSTANCE.createSequenceFlow();
		ParallelGateway pgw = BpmnFactory.eINSTANCE.createParallelGateway();
		FN2S pcgwToStep = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		ParallelGateway pcgw = BpmnFactory.eINSTANCE.createParallelGateway();
		Object _localVariable_0 = csp.getValue("sf1", "id");
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_1 = csp.getValue("pgw", "id");
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
		String sf1_id_prime = (String) _localVariable_0;
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		String pgw_id_prime = (String) _localVariable_1;
		pcgw.setIsDiverging(Boolean.valueOf(pcgw_isDiverging_prime));
		sf1.setId(sf1_id_prime);
		pgw.setId(pgw_id_prime);
		return new Object[] { process, prevNode, sf1, step, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_SplitAfterSplit_11_2_blackBBBBBBB(SequenceFlow sf1, ParallelFlow pflow,
			ParallelStep step, ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { sf1, pflow, step, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_11_2_greenFBBBBBBB(SequenceFlow sf1, ParallelFlow pflow,
			ParallelStep step, ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(pflow);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(pgw);
		ruleresult.getCreatedLinkElements().add(pcgwToStep);
		ruleresult.getCreatedLinkElements().add(pgwToStep);
		ruleresult.getCreatedElements().add(pcgw);
		return new Object[] { ruleresult, sf1, pflow, step, pgw, pcgwToStep, pgwToStep, pcgw };
	}

	public static final Object[] pattern_SplitAfterSplit_11_3_blackBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject prevNode, EObject useCase, EObject p2uc, EObject pstep, EObject pgw2ps,
			EObject sf1, EObject pflow, EObject step, EObject flow, EObject pgw, EObject pcgwToStep, EObject pgwToStep,
			EObject pcgw) {
		if (!process.equals(useCase)) {
			if (!process.equals(pstep)) {
				if (!process.equals(sf1)) {
					if (!process.equals(step)) {
						if (!prevNode.equals(process)) {
							if (!prevNode.equals(useCase)) {
								if (!prevNode.equals(pstep)) {
									if (!prevNode.equals(sf1)) {
										if (!prevNode.equals(step)) {
											if (!p2uc.equals(process)) {
												if (!p2uc.equals(prevNode)) {
													if (!p2uc.equals(useCase)) {
														if (!p2uc.equals(pstep)) {
															if (!p2uc.equals(pgw2ps)) {
																if (!p2uc.equals(sf1)) {
																	if (!p2uc.equals(pflow)) {
																		if (!p2uc.equals(step)) {
																			if (!p2uc.equals(pgw)) {
																				if (!p2uc.equals(pcgwToStep)) {
																					if (!p2uc.equals(pgwToStep)) {
																						if (!p2uc.equals(pcgw)) {
																							if (!pstep
																									.equals(useCase)) {
																								if (!pstep
																										.equals(sf1)) {
																									if (!pstep.equals(
																											step)) {
																										if (!pgw2ps
																												.equals(process)) {
																											if (!pgw2ps
																													.equals(prevNode)) {
																												if (!pgw2ps
																														.equals(useCase)) {
																													if (!pgw2ps
																															.equals(pstep)) {
																														if (!pgw2ps
																																.equals(sf1)) {
																															if (!pgw2ps
																																	.equals(step)) {
																																if (!pgw2ps
																																		.equals(pgwToStep)) {
																																	if (!sf1.equals(
																																			useCase)) {
																																		if (!sf1.equals(
																																				step)) {
																																			if (!pflow
																																					.equals(process)) {
																																				if (!pflow
																																						.equals(prevNode)) {
																																					if (!pflow
																																							.equals(useCase)) {
																																						if (!pflow
																																								.equals(pstep)) {
																																							if (!pflow
																																									.equals(pgw2ps)) {
																																								if (!pflow
																																										.equals(sf1)) {
																																									if (!pflow
																																											.equals(step)) {
																																										if (!pflow
																																												.equals(pgw)) {
																																											if (!pflow
																																													.equals(pgwToStep)) {
																																												if (!step
																																														.equals(useCase)) {
																																													if (!flow
																																															.equals(process)) {
																																														if (!flow
																																																.equals(prevNode)) {
																																															if (!flow
																																																	.equals(useCase)) {
																																																if (!flow
																																																		.equals(p2uc)) {
																																																	if (!flow
																																																			.equals(pstep)) {
																																																		if (!flow
																																																				.equals(pgw2ps)) {
																																																			if (!flow
																																																					.equals(sf1)) {
																																																				if (!flow
																																																						.equals(pflow)) {
																																																					if (!flow
																																																							.equals(step)) {
																																																						if (!flow
																																																								.equals(pgw)) {
																																																							if (!flow
																																																									.equals(pcgwToStep)) {
																																																								if (!flow
																																																										.equals(pgwToStep)) {
																																																									if (!flow
																																																											.equals(pcgw)) {
																																																										if (!pgw.equals(
																																																												process)) {
																																																											if (!pgw.equals(
																																																													prevNode)) {
																																																												if (!pgw.equals(
																																																														useCase)) {
																																																													if (!pgw.equals(
																																																															pstep)) {
																																																														if (!pgw.equals(
																																																																pgw2ps)) {
																																																															if (!pgw.equals(
																																																																	sf1)) {
																																																																if (!pgw.equals(
																																																																		step)) {
																																																																	if (!pgw.equals(
																																																																			pgwToStep)) {
																																																																		if (!pcgwToStep
																																																																				.equals(process)) {
																																																																			if (!pcgwToStep
																																																																					.equals(prevNode)) {
																																																																				if (!pcgwToStep
																																																																						.equals(useCase)) {
																																																																					if (!pcgwToStep
																																																																							.equals(pstep)) {
																																																																						if (!pcgwToStep
																																																																								.equals(pgw2ps)) {
																																																																							if (!pcgwToStep
																																																																									.equals(sf1)) {
																																																																								if (!pcgwToStep
																																																																										.equals(pflow)) {
																																																																									if (!pcgwToStep
																																																																											.equals(step)) {
																																																																										if (!pcgwToStep
																																																																												.equals(pgw)) {
																																																																											if (!pcgwToStep
																																																																													.equals(pgwToStep)) {
																																																																												if (!pgwToStep
																																																																														.equals(process)) {
																																																																													if (!pgwToStep
																																																																															.equals(prevNode)) {
																																																																														if (!pgwToStep
																																																																																.equals(useCase)) {
																																																																															if (!pgwToStep
																																																																																	.equals(pstep)) {
																																																																																if (!pgwToStep
																																																																																		.equals(sf1)) {
																																																																																	if (!pgwToStep
																																																																																			.equals(step)) {
																																																																																		if (!pcgw
																																																																																				.equals(process)) {
																																																																																			if (!pcgw
																																																																																					.equals(prevNode)) {
																																																																																				if (!pcgw
																																																																																						.equals(useCase)) {
																																																																																					if (!pcgw
																																																																																							.equals(pstep)) {
																																																																																						if (!pcgw
																																																																																								.equals(pgw2ps)) {
																																																																																							if (!pcgw
																																																																																									.equals(sf1)) {
																																																																																								if (!pcgw
																																																																																										.equals(pflow)) {
																																																																																									if (!pcgw
																																																																																											.equals(step)) {
																																																																																										if (!pcgw
																																																																																												.equals(pgw)) {
																																																																																											if (!pcgw
																																																																																													.equals(pcgwToStep)) {
																																																																																												if (!pcgw
																																																																																														.equals(pgwToStep)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															process,
																																																																																															prevNode,
																																																																																															useCase,
																																																																																															p2uc,
																																																																																															pstep,
																																																																																															pgw2ps,
																																																																																															sf1,
																																																																																															pflow,
																																																																																															step,
																																																																																															flow,
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
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject prevNode, EObject useCase, EObject pstep,
			EObject sf1, EObject pflow, EObject step, EObject pgw, EObject pcgwToStep, EObject pgwToStep,
			EObject pcgw) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SplitAfterSplit";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String useCase__pflow____flows_name_prime = "flows";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String pflow__step____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String pcgwToStep__pcgw____source_name_prime = "source";
		String pcgwToStep__step____target_name_prime = "target";
		String pgwToStep__pgw____source_name_prime = "source";
		String pgwToStep__step____target_name_prime = "target";
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getCreatedEdges().add(process__sf1____flowElements);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		ruleresult.getTranslatedEdges().add(useCase__pflow____flows);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		ruleresult.getTranslatedEdges().add(pstep__pflow____invokedFlows);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(pflow__step____steps);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		ruleresult.getCreatedEdges().add(process__pgw____flowElements);
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
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		pcgwToStep__pcgw____source.setName(pcgwToStep__pcgw____source_name_prime);
		pcgwToStep__step____target.setName(pcgwToStep__step____target_name_prime);
		pgwToStep__pgw____source.setName(pgwToStep__pgw____source_name_prime);
		pgwToStep__step____target.setName(pgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, process, prevNode, useCase, pstep, sf1, pflow, step, pgw, pcgwToStep,
				pgwToStep, pcgw, process__sf1____flowElements, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				useCase__pflow____flows, pstep__pflow____invokedFlows, pflow__step____steps,
				process__pgw____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, pcgwToStep__pcgw____source, pcgwToStep__step____target,
				pgwToStep__pgw____source, pgwToStep__step____target };
	}

	public static final void pattern_SplitAfterSplit_11_5_expressionBBBBBBBBBBBBBBBB(SplitAfterSplit _this,
			PerformRuleResult ruleresult, EObject process, EObject prevNode, EObject useCase, EObject p2uc,
			EObject pstep, EObject pgw2ps, EObject sf1, EObject pflow, EObject step, EObject flow, EObject pgw,
			EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_BWD(ruleresult, process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, pflow, step, flow,
				pgw, pcgwToStep, pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_SplitAfterSplit_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_12_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_12_1_blackFBB(EClass eClass, SplitAfterSplit _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_12_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_12_1_binding = pattern_SplitAfterSplit_12_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SplitAfterSplit_12_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_12_1_black = pattern_SplitAfterSplit_12_1_blackFBB(eClass, _this);
			if (result_pattern_SplitAfterSplit_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SplitAfterSplit_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SplitAfterSplit";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SplitAfterSplit_12_2_bindingFFFFFB(Match match) {
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
					if (tmpStep instanceof ParallelStep) {
						ParallelStep step = (ParallelStep) tmpStep;
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

	public static final Iterable<Object[]> pattern_SplitAfterSplit_12_2_blackFFBFBFBBBB(UseCase useCase,
			ParallelStep pstep, ParallelFlow pflow, ParallelStep step, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pstep.equals(step)) {
			if (!flow.equals(pflow)) {
				for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(useCase, P2UC.class,
						"target")) {
					de.abilov.bpmn.Process process = p2uc.getSource();
					if (process != null) {
						for (GW2S pgw2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pstep,
								GW2S.class, "target")) {
							Gateway tmpPrevNode = pgw2ps.getSource();
							if (tmpPrevNode instanceof ParallelGateway) {
								ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
								boolean prevNodeisDiverging = prevNode.isIsDiverging();
								if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
									_result.add(new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, pflow,
											step, flow, match });
								}

							}

						}
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_12_3_blackBBBBBBBBB(de.abilov.bpmn.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ParallelFlow pflow,
			ParallelStep step, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pstep.equals(step)) {
			if (!flow.equals(pflow)) {
				if (process.getFlowElements().contains(prevNode)) {
					if (useCase.getFlows().contains(pflow)) {
						if (useCase.getFlows().contains(flow)) {
							if (process.equals(p2uc.getSource())) {
								if (useCase.equals(p2uc.getTarget())) {
									if (pstep.getInvokedFlows().contains(pflow)) {
										if (prevNode.equals(pgw2ps.getSource())) {
											if (pstep.equals(pgw2ps.getTarget())) {
												if (pflow.getSteps().contains(step)) {
													if (flow.getSteps().contains(pstep)) {
														boolean prevNodeisDiverging = prevNode.isIsDiverging();
														if (Boolean.valueOf(prevNodeisDiverging)
																.equals(Boolean.valueOf(true))) {
															_result.add(new Object[] { process, prevNode, useCase, p2uc,
																	pstep, pgw2ps, pflow, step, flow });
														}

													}
												}
											}
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

	public static final Object[] pattern_SplitAfterSplit_12_3_greenBBBBBBBBBFFFFFFFFFFF(de.abilov.bpmn.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ParallelFlow pflow,
			ParallelStep step, Flow flow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw2ps__pstep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__pstep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__prevNode____flowElements_name_prime = "flowElements";
		String useCase__pflow____flows_name_prime = "flows";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String pgw2ps__prevNode____source_name_prime = "source";
		String pgw2ps__pstep____target_name_prime = "target";
		String pflow__step____steps_name_prime = "steps";
		String flow__pstep____steps_name_prime = "steps";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(pgw2ps);
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
		pgw2ps__prevNode____source.setSrc(pgw2ps);
		pgw2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pgw2ps__prevNode____source);
		pgw2ps__pstep____target.setSrc(pgw2ps);
		pgw2ps__pstep____target.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(pgw2ps__pstep____target);
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
		pgw2ps__prevNode____source.setName(pgw2ps__prevNode____source_name_prime);
		pgw2ps__pstep____target.setName(pgw2ps__pstep____target_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		flow__pstep____steps.setName(flow__pstep____steps_name_prime);
		return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, pflow, step, flow, isApplicableMatch,
				process__prevNode____flowElements, useCase__pflow____flows, useCase__flow____flows,
				p2uc__process____source, p2uc__useCase____target, pstep__pflow____invokedFlows,
				pgw2ps__prevNode____source, pgw2ps__pstep____target, pflow__step____steps, flow__pstep____steps };
	}

	public static final Object[] pattern_SplitAfterSplit_12_4_bindingFBBBBBBBBBBB(SplitAfterSplit _this,
			IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process, ParallelGateway prevNode,
			UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ParallelFlow pflow, ParallelStep step,
			Flow flow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, process, prevNode, useCase, p2uc,
				pstep, pgw2ps, pflow, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps, pflow,
					step, flow };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterSplit_12_4_bindingAndBlackFBBBBBBBBBBB(SplitAfterSplit _this,
			IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process, ParallelGateway prevNode,
			UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ParallelFlow pflow, ParallelStep step,
			Flow flow) {
		Object[] result_pattern_SplitAfterSplit_12_4_binding = pattern_SplitAfterSplit_12_4_bindingFBBBBBBBBBBB(_this,
				isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps, pflow, step, flow);
		if (result_pattern_SplitAfterSplit_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterSplit_12_4_binding[0];

			Object[] result_pattern_SplitAfterSplit_12_4_black = pattern_SplitAfterSplit_12_4_blackB(csp);
			if (result_pattern_SplitAfterSplit_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps,
						pflow, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterSplit_12_5_expressionFBB(SplitAfterSplit _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SplitAfterSplit_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SplitAfterSplit";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SplitAfterSplit_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_20_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_20_1_blackFBB(EClass __eClass, SplitAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_20_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_20_1_binding = pattern_SplitAfterSplit_20_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterSplit_20_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_20_1_black = pattern_SplitAfterSplit_20_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterSplit_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterSplit_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterSplit_20_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_47798 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_20_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_691738 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_691738)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_20_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_603696 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_603696)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_20_2_black_nac_3BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_221929 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_221929)) {
							if (!prevNode.equals(__DEC_pgw___conv_221929)) {
								if (!pcgw.equals(__DEC_pgw___conv_221929)) {
									return new Object[] { pgw, prevNode, pcgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_20_2_black_nac_4BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_258069 = pcgw.get__conv();
					if (__DEC_pcgw___conv_258069 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_258069)) {
							if (!prevNode.equals(__DEC_pcgw___conv_258069)) {
								if (!pgw.equals(__DEC_pcgw___conv_258069)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_20_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_395615 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_395615)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_20_2_black_nac_6BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_352745 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_352745)) {
							if (!prevNode.equals(__DEC_pcgw___conv_352745)) {
								if (!pgw.equals(__DEC_pcgw___conv_352745)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_20_2_black_nac_7BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_20_2_black_nac_8BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_20_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
							FlowNode tmpPgw = sf1.getTargetRef();
							if (tmpPgw instanceof ParallelGateway) {
								ParallelGateway pgw = (ParallelGateway) tmpPgw;
								if (!pgw.equals(prevNode)) {
									if (process.getFlowElements().contains(pgw)) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											Gateway tmpPcgw = pgw.get__conv();
											if (tmpPcgw instanceof ParallelGateway) {
												ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
												if (!pcgw.equals(prevNode)) {
													if (!pcgw.equals(pgw)) {
														if (process.getFlowElements().contains(pcgw)) {
															boolean pgwisDiverging = pgw.isIsDiverging();
															if (Boolean.valueOf(pgwisDiverging)
																	.equals(Boolean.valueOf(true))) {
																boolean pcgwisDiverging = pcgw.isIsDiverging();
																if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
																	if (pattern_SplitAfterSplit_20_2_black_nac_0B(
																			sf1) == null) {
																		if (pattern_SplitAfterSplit_20_2_black_nac_1BB(
																				sf1, process) == null) {
																			if (pattern_SplitAfterSplit_20_2_black_nac_2BB(
																					pgw, process) == null) {
																				if (pattern_SplitAfterSplit_20_2_black_nac_7BB(
																						prevNode, pgw) == null) {
																					if (pattern_SplitAfterSplit_20_2_black_nac_3BBB(
																							pgw, prevNode,
																							pcgw) == null) {
																						if (pattern_SplitAfterSplit_20_2_black_nac_4BBB(
																								pcgw, prevNode,
																								pgw) == null) {
																							if (pattern_SplitAfterSplit_20_2_black_nac_5BB(
																									pcgw,
																									process) == null) {
																								if (pattern_SplitAfterSplit_20_2_black_nac_6BBB(
																										pcgw, prevNode,
																										pgw) == null) {
																									if (pattern_SplitAfterSplit_20_2_black_nac_8BB(
																											pcgw,
																											prevNode) == null) {
																										_result.add(
																												new Object[] {
																														process,
																														prevNode,
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

		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterSplit_20_3_expressionFBBBBBBB(SplitAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_20_4_expressionFBB(SplitAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterSplit_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterSplit_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_21_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_21_1_blackFBB(EClass __eClass, SplitAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_21_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_21_1_binding = pattern_SplitAfterSplit_21_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterSplit_21_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_21_1_black = pattern_SplitAfterSplit_21_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterSplit_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterSplit_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterSplit_21_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_840193 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_21_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_634599 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_634599)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_21_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_710195 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_710195)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_21_2_black_nac_3BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_169306 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_169306)) {
							if (!prevNode.equals(__DEC_pgw___conv_169306)) {
								if (!pcgw.equals(__DEC_pgw___conv_169306)) {
									return new Object[] { pgw, prevNode, pcgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_21_2_black_nac_4BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_564069 = pcgw.get__conv();
					if (__DEC_pcgw___conv_564069 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_564069)) {
							if (!prevNode.equals(__DEC_pcgw___conv_564069)) {
								if (!pgw.equals(__DEC_pcgw___conv_564069)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_21_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_593163 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_593163)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_21_2_black_nac_6BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_871446 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_871446)) {
							if (!prevNode.equals(__DEC_pcgw___conv_871446)) {
								if (!pgw.equals(__DEC_pcgw___conv_871446)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_21_2_black_nac_7BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_21_2_black_nac_8BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_21_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				if (prevNode.equals(sf1.getSourceRef())) {
					FlowNode tmpPgw = sf1.getTargetRef();
					if (tmpPgw instanceof ParallelGateway) {
						ParallelGateway pgw = (ParallelGateway) tmpPgw;
						if (!pgw.equals(prevNode)) {
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								Gateway tmpPcgw = pgw.get__conv();
								if (tmpPcgw instanceof ParallelGateway) {
									ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
									if (!pcgw.equals(prevNode)) {
										if (!pcgw.equals(pgw)) {
											boolean pgwisDiverging = pgw.isIsDiverging();
											if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
												boolean pcgwisDiverging = pcgw.isIsDiverging();
												if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
													if (pattern_SplitAfterSplit_21_2_black_nac_0B(sf1) == null) {
														if (pattern_SplitAfterSplit_21_2_black_nac_7BB(prevNode,
																pgw) == null) {
															if (pattern_SplitAfterSplit_21_2_black_nac_3BBB(pgw,
																	prevNode, pcgw) == null) {
																if (pattern_SplitAfterSplit_21_2_black_nac_4BBB(pcgw,
																		prevNode, pgw) == null) {
																	if (pattern_SplitAfterSplit_21_2_black_nac_6BBB(
																			pcgw, prevNode, pgw) == null) {
																		if (pattern_SplitAfterSplit_21_2_black_nac_8BB(
																				pcgw, prevNode) == null) {
																			for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(sf1,
																							de.abilov.bpmn.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(pgw)) {
																						if (process.getFlowElements()
																								.contains(pcgw)) {
																							if (pattern_SplitAfterSplit_21_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_SplitAfterSplit_21_2_black_nac_2BB(
																										pgw,
																										process) == null) {
																									if (pattern_SplitAfterSplit_21_2_black_nac_5BB(
																											pcgw,
																											process) == null) {
																										_result.add(
																												new Object[] {
																														process,
																														prevNode,
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

		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterSplit_21_3_expressionFBBBBBBB(SplitAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_21_4_expressionFBB(SplitAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterSplit_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterSplit_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_22_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_22_1_blackFBB(EClass __eClass, SplitAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_22_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_22_1_binding = pattern_SplitAfterSplit_22_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterSplit_22_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_22_1_black = pattern_SplitAfterSplit_22_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterSplit_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterSplit_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterSplit_22_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_61280 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_22_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_587652 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_587652)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_22_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_391091 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_391091)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_22_2_black_nac_3BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_967379 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_967379)) {
							if (!prevNode.equals(__DEC_pgw___conv_967379)) {
								if (!pcgw.equals(__DEC_pgw___conv_967379)) {
									return new Object[] { pgw, prevNode, pcgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_22_2_black_nac_4BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_12229 = pcgw.get__conv();
					if (__DEC_pcgw___conv_12229 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_12229)) {
							if (!prevNode.equals(__DEC_pcgw___conv_12229)) {
								if (!pgw.equals(__DEC_pcgw___conv_12229)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_22_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_562912 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_562912)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_22_2_black_nac_6BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_758251 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_758251)) {
							if (!prevNode.equals(__DEC_pcgw___conv_758251)) {
								if (!pgw.equals(__DEC_pcgw___conv_758251)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_22_2_black_nac_7BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_22_2_black_nac_8BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_22_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
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
						FlowNode tmpPgw = sf1.getTargetRef();
						if (tmpPgw instanceof ParallelGateway) {
							ParallelGateway pgw = (ParallelGateway) tmpPgw;
							if (!pgw.equals(prevNode)) {
								Gateway tmpPcgw = pgw.get__conv();
								if (tmpPcgw instanceof ParallelGateway) {
									ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
									if (!pcgw.equals(prevNode)) {
										if (!pcgw.equals(pgw)) {
											boolean pgwisDiverging = pgw.isIsDiverging();
											if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
												boolean pcgwisDiverging = pcgw.isIsDiverging();
												if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
													if (pattern_SplitAfterSplit_22_2_black_nac_0B(sf1) == null) {
														if (pattern_SplitAfterSplit_22_2_black_nac_7BB(prevNode,
																pgw) == null) {
															if (pattern_SplitAfterSplit_22_2_black_nac_3BBB(pgw,
																	prevNode, pcgw) == null) {
																if (pattern_SplitAfterSplit_22_2_black_nac_4BBB(pcgw,
																		prevNode, pgw) == null) {
																	if (pattern_SplitAfterSplit_22_2_black_nac_6BBB(
																			pcgw, prevNode, pgw) == null) {
																		if (pattern_SplitAfterSplit_22_2_black_nac_8BB(
																				pcgw, prevNode) == null) {
																			for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(prevNode,
																							de.abilov.bpmn.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(sf1)) {
																					if (process.getFlowElements()
																							.contains(pgw)) {
																						if (process.getFlowElements()
																								.contains(pcgw)) {
																							if (pattern_SplitAfterSplit_22_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_SplitAfterSplit_22_2_black_nac_2BB(
																										pgw,
																										process) == null) {
																									if (pattern_SplitAfterSplit_22_2_black_nac_5BB(
																											pcgw,
																											process) == null) {
																										_result.add(
																												new Object[] {
																														process,
																														prevNode,
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

		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterSplit_22_3_expressionFBBBBBBB(SplitAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_22_4_expressionFBB(SplitAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterSplit_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterSplit_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_23_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_23_1_blackFBB(EClass __eClass, SplitAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_23_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_23_1_binding = pattern_SplitAfterSplit_23_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterSplit_23_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_23_1_black = pattern_SplitAfterSplit_23_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterSplit_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterSplit_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterSplit_23_2_black_nac_0BBB(ParallelFlow pflow, ParallelStep pstep,
			ParallelStep step) {
		if (!pstep.equals(step)) {
			for (ParallelStep __DEC_pflow_invokedFlows_450394 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pflow, ParallelStep.class, "invokedFlows")) {
				if (!pstep.equals(__DEC_pflow_invokedFlows_450394)) {
					if (!step.equals(__DEC_pflow_invokedFlows_450394)) {
						return new Object[] { pflow, pstep, step };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_23_2_black_nac_1BB(ParallelFlow pflow, UseCase useCase) {
		for (UseCase __DEC_pflow_flows_816356 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_pflow_flows_816356)) {
				return new Object[] { pflow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_23_2_black_nac_2BBB(ParallelStep step, ParallelFlow pflow,
			Flow flow) {
		if (!flow.equals(pflow)) {
			for (Flow __DEC_step_steps_764395 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!pflow.equals(__DEC_step_steps_764395)) {
					if (!flow.equals(__DEC_step_steps_764395)) {
						return new Object[] { step, pflow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_23_2_black_nac_3BB(ParallelStep step, ParallelStep pstep) {
		if (!pstep.equals(step)) {
			for (Step __DEC_step_next_285314 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_285314)) {
					if (!pstep.equals(__DEC_step_next_285314)) {
						return new Object[] { step, pstep };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_23_2_black_nac_4BB(ParallelStep step, ParallelFlow pflow) {
		if (step.getInvokedFlows().contains(pflow)) {
			return new Object[] { step, pflow };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_23_2_black_nac_5BB(Flow flow, ParallelStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_23_2_black_nac_6BB(ParallelStep pstep, ParallelStep step) {
		if (step.equals(pstep.getNext())) {
			return new Object[] { pstep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_23_2_blackFFFFFB(EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpPflow = _edge_flows.getTrg();
			if (tmpPflow instanceof ParallelFlow) {
				ParallelFlow pflow = (ParallelFlow) tmpPflow;
				if (useCase.getFlows().contains(pflow)) {
					if (pattern_SplitAfterSplit_23_2_black_nac_1BB(pflow, useCase) == null) {
						for (Flow flow : useCase.getFlows()) {
							if (!flow.equals(pflow)) {
								for (Step tmpStep : pflow.getSteps()) {
									if (tmpStep instanceof ParallelStep) {
										ParallelStep step = (ParallelStep) tmpStep;
										if (pattern_SplitAfterSplit_23_2_black_nac_2BBB(step, pflow, flow) == null) {
											if (pattern_SplitAfterSplit_23_2_black_nac_4BB(step, pflow) == null) {
												if (pattern_SplitAfterSplit_23_2_black_nac_5BB(flow, step) == null) {
													for (Step tmpPstep : flow.getSteps()) {
														if (tmpPstep instanceof ParallelStep) {
															ParallelStep pstep = (ParallelStep) tmpPstep;
															if (!pstep.equals(step)) {
																if (pstep.getInvokedFlows().contains(pflow)) {
																	if (pattern_SplitAfterSplit_23_2_black_nac_0BBB(
																			pflow, pstep, step) == null) {
																		if (pattern_SplitAfterSplit_23_2_black_nac_3BB(
																				step, pstep) == null) {
																			if (pattern_SplitAfterSplit_23_2_black_nac_6BB(
																					pstep, step) == null) {
																				_result.add(new Object[] { useCase,
																						pstep, pflow, step, flow,
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

	public static final Object[] pattern_SplitAfterSplit_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterSplit_23_3_expressionFBBBBBBB(SplitAfterSplit _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ParallelStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, pstep, pflow, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_23_4_expressionFBB(SplitAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterSplit_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterSplit_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_24_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_24_1_blackFBB(EClass __eClass, SplitAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_24_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_24_1_binding = pattern_SplitAfterSplit_24_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterSplit_24_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_24_1_black = pattern_SplitAfterSplit_24_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterSplit_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterSplit_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterSplit_24_2_black_nac_0BBB(ParallelFlow pflow, ParallelStep pstep,
			ParallelStep step) {
		if (!pstep.equals(step)) {
			for (ParallelStep __DEC_pflow_invokedFlows_789048 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pflow, ParallelStep.class, "invokedFlows")) {
				if (!pstep.equals(__DEC_pflow_invokedFlows_789048)) {
					if (!step.equals(__DEC_pflow_invokedFlows_789048)) {
						return new Object[] { pflow, pstep, step };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_24_2_black_nac_1BB(ParallelFlow pflow, UseCase useCase) {
		for (UseCase __DEC_pflow_flows_479310 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_pflow_flows_479310)) {
				return new Object[] { pflow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_24_2_black_nac_2BBB(ParallelStep step, ParallelFlow pflow,
			Flow flow) {
		if (!flow.equals(pflow)) {
			for (Flow __DEC_step_steps_173712 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!pflow.equals(__DEC_step_steps_173712)) {
					if (!flow.equals(__DEC_step_steps_173712)) {
						return new Object[] { step, pflow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_24_2_black_nac_3BB(ParallelStep step, ParallelStep pstep) {
		if (!pstep.equals(step)) {
			for (Step __DEC_step_next_9868 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_9868)) {
					if (!pstep.equals(__DEC_step_next_9868)) {
						return new Object[] { step, pstep };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_24_2_black_nac_4BB(ParallelStep step, ParallelFlow pflow) {
		if (step.getInvokedFlows().contains(pflow)) {
			return new Object[] { step, pflow };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_24_2_black_nac_5BB(Flow flow, ParallelStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_24_2_black_nac_6BB(ParallelStep pstep, ParallelStep step) {
		if (step.equals(pstep.getNext())) {
			return new Object[] { pstep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_24_2_blackFFFFFB(EMoflonEdge _edge_invokedFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPstep = _edge_invokedFlows.getSrc();
		if (tmpPstep instanceof ParallelStep) {
			ParallelStep pstep = (ParallelStep) tmpPstep;
			EObject tmpPflow = _edge_invokedFlows.getTrg();
			if (tmpPflow instanceof ParallelFlow) {
				ParallelFlow pflow = (ParallelFlow) tmpPflow;
				if (pstep.getInvokedFlows().contains(pflow)) {
					for (Step tmpStep : pflow.getSteps()) {
						if (tmpStep instanceof ParallelStep) {
							ParallelStep step = (ParallelStep) tmpStep;
							if (!pstep.equals(step)) {
								if (pattern_SplitAfterSplit_24_2_black_nac_0BBB(pflow, pstep, step) == null) {
									if (pattern_SplitAfterSplit_24_2_black_nac_3BB(step, pstep) == null) {
										if (pattern_SplitAfterSplit_24_2_black_nac_4BB(step, pflow) == null) {
											if (pattern_SplitAfterSplit_24_2_black_nac_6BB(pstep, step) == null) {
												for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(pstep, Flow.class, "steps")) {
													if (!flow.equals(pflow)) {
														if (pattern_SplitAfterSplit_24_2_black_nac_2BBB(step, pflow,
																flow) == null) {
															if (pattern_SplitAfterSplit_24_2_black_nac_5BB(flow,
																	step) == null) {
																for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(pflow, UseCase.class,
																				"flows")) {
																	if (useCase.getFlows().contains(flow)) {
																		if (pattern_SplitAfterSplit_24_2_black_nac_1BB(
																				pflow, useCase) == null) {
																			_result.add(new Object[] { useCase, pstep,
																					pflow, step, flow,
																					_edge_invokedFlows });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SplitAfterSplit_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterSplit_24_3_expressionFBBBBBBB(SplitAfterSplit _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ParallelStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, pstep, pflow, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_24_4_expressionFBB(SplitAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterSplit_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterSplit_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_25_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_25_1_blackFBB(EClass __eClass, SplitAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_25_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_25_1_binding = pattern_SplitAfterSplit_25_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterSplit_25_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_25_1_black = pattern_SplitAfterSplit_25_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterSplit_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterSplit_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterSplit_25_2_black_nac_0BBB(ParallelFlow pflow, ParallelStep pstep,
			ParallelStep step) {
		if (!pstep.equals(step)) {
			for (ParallelStep __DEC_pflow_invokedFlows_411011 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pflow, ParallelStep.class, "invokedFlows")) {
				if (!pstep.equals(__DEC_pflow_invokedFlows_411011)) {
					if (!step.equals(__DEC_pflow_invokedFlows_411011)) {
						return new Object[] { pflow, pstep, step };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_25_2_black_nac_1BB(ParallelFlow pflow, UseCase useCase) {
		for (UseCase __DEC_pflow_flows_635653 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_pflow_flows_635653)) {
				return new Object[] { pflow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_25_2_black_nac_2BBB(ParallelStep step, ParallelFlow pflow,
			Flow flow) {
		if (!flow.equals(pflow)) {
			for (Flow __DEC_step_steps_962219 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!pflow.equals(__DEC_step_steps_962219)) {
					if (!flow.equals(__DEC_step_steps_962219)) {
						return new Object[] { step, pflow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_25_2_black_nac_3BB(ParallelStep step, ParallelStep pstep) {
		if (!pstep.equals(step)) {
			for (Step __DEC_step_next_200552 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_200552)) {
					if (!pstep.equals(__DEC_step_next_200552)) {
						return new Object[] { step, pstep };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_25_2_black_nac_4BB(ParallelStep step, ParallelFlow pflow) {
		if (step.getInvokedFlows().contains(pflow)) {
			return new Object[] { step, pflow };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_25_2_black_nac_5BB(Flow flow, ParallelStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_25_2_black_nac_6BB(ParallelStep pstep, ParallelStep step) {
		if (step.equals(pstep.getNext())) {
			return new Object[] { pstep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_25_2_blackFFFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPflow = _edge_steps.getSrc();
		if (tmpPflow instanceof ParallelFlow) {
			ParallelFlow pflow = (ParallelFlow) tmpPflow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (pflow.getSteps().contains(step)) {
					if (pattern_SplitAfterSplit_25_2_black_nac_4BB(step, pflow) == null) {
						for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pflow,
								UseCase.class, "flows")) {
							if (pattern_SplitAfterSplit_25_2_black_nac_1BB(pflow, useCase) == null) {
								for (Flow flow : useCase.getFlows()) {
									if (!flow.equals(pflow)) {
										if (pattern_SplitAfterSplit_25_2_black_nac_2BBB(step, pflow, flow) == null) {
											if (pattern_SplitAfterSplit_25_2_black_nac_5BB(flow, step) == null) {
												for (Step tmpPstep : flow.getSteps()) {
													if (tmpPstep instanceof ParallelStep) {
														ParallelStep pstep = (ParallelStep) tmpPstep;
														if (!pstep.equals(step)) {
															if (pstep.getInvokedFlows().contains(pflow)) {
																if (pattern_SplitAfterSplit_25_2_black_nac_0BBB(pflow,
																		pstep, step) == null) {
																	if (pattern_SplitAfterSplit_25_2_black_nac_3BB(step,
																			pstep) == null) {
																		if (pattern_SplitAfterSplit_25_2_black_nac_6BB(
																				pstep, step) == null) {
																			_result.add(new Object[] { useCase, pstep,
																					pflow, step, flow, _edge_steps });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SplitAfterSplit_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterSplit_25_3_expressionFBBBBBBB(SplitAfterSplit _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ParallelStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, pstep, pflow, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_25_4_expressionFBB(SplitAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterSplit_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterSplit_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_26_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_26_1_blackFBB(EClass __eClass, SplitAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_26_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_26_1_binding = pattern_SplitAfterSplit_26_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterSplit_26_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_26_1_black = pattern_SplitAfterSplit_26_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterSplit_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterSplit_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterSplit_26_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_343856 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_696515 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_696515)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_26_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_933329 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_933329)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_26_2_black_nac_3BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_555160 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_555160)) {
							if (!prevNode.equals(__DEC_pgw___conv_555160)) {
								if (!pcgw.equals(__DEC_pgw___conv_555160)) {
									return new Object[] { pgw, prevNode, pcgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_26_2_black_nac_4BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_121470 = pcgw.get__conv();
					if (__DEC_pcgw___conv_121470 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_121470)) {
							if (!prevNode.equals(__DEC_pcgw___conv_121470)) {
								if (!pgw.equals(__DEC_pcgw___conv_121470)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_26_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_859921 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_859921)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_26_2_black_nac_6BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_975144 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_975144)) {
							if (!prevNode.equals(__DEC_pcgw___conv_975144)) {
								if (!pgw.equals(__DEC_pcgw___conv_975144)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_26_2_black_nac_7BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_26_2_black_nac_8BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_26_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
										if (pattern_SplitAfterSplit_26_2_black_nac_2BB(pgw, process) == null) {
											if (pattern_SplitAfterSplit_26_2_black_nac_5BB(pcgw, process) == null) {
												for (FlowElement tmpPrevNode : process.getFlowElements()) {
													if (tmpPrevNode instanceof ParallelGateway) {
														ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
														if (!pgw.equals(prevNode)) {
															if (!pcgw.equals(prevNode)) {
																boolean prevNodeisDiverging = prevNode.isIsDiverging();
																if (Boolean.valueOf(prevNodeisDiverging)
																		.equals(Boolean.valueOf(true))) {
																	if (pattern_SplitAfterSplit_26_2_black_nac_3BBB(pgw,
																			prevNode, pcgw) == null) {
																		if (pattern_SplitAfterSplit_26_2_black_nac_4BBB(
																				pcgw, prevNode, pgw) == null) {
																			if (pattern_SplitAfterSplit_26_2_black_nac_6BBB(
																					pcgw, prevNode, pgw) == null) {
																				if (pattern_SplitAfterSplit_26_2_black_nac_7BB(
																						prevNode, pgw) == null) {
																					if (pattern_SplitAfterSplit_26_2_black_nac_8BB(
																							pcgw, prevNode) == null) {
																						for (FlowElement tmpSf1 : process
																								.getFlowElements()) {
																							if (tmpSf1 instanceof SequenceFlow) {
																								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																								if (prevNode.equals(sf1
																										.getSourceRef())) {
																									if (pgw.equals(sf1
																											.getTargetRef())) {
																										if (pattern_SplitAfterSplit_26_2_black_nac_0B(
																												sf1) == null) {
																											if (pattern_SplitAfterSplit_26_2_black_nac_1BB(
																													sf1,
																													process) == null) {
																												_result.add(
																														new Object[] {
																																process,
																																prevNode,
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

		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterSplit_26_3_expressionFBBBBBBB(SplitAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_26_4_expressionFBB(SplitAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterSplit_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterSplit_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_27_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_27_1_blackFBB(EClass __eClass, SplitAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_27_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_27_1_binding = pattern_SplitAfterSplit_27_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterSplit_27_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_27_1_black = pattern_SplitAfterSplit_27_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterSplit_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterSplit_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterSplit_27_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_900790 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_591235 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_591235)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_27_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_691452 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_691452)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_27_2_black_nac_3BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_469599 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_469599)) {
							if (!prevNode.equals(__DEC_pgw___conv_469599)) {
								if (!pcgw.equals(__DEC_pgw___conv_469599)) {
									return new Object[] { pgw, prevNode, pcgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_27_2_black_nac_4BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_12364 = pcgw.get__conv();
					if (__DEC_pcgw___conv_12364 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_12364)) {
							if (!prevNode.equals(__DEC_pcgw___conv_12364)) {
								if (!pgw.equals(__DEC_pcgw___conv_12364)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_27_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_230780 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_230780)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_27_2_black_nac_6BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_714372 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_714372)) {
							if (!prevNode.equals(__DEC_pcgw___conv_714372)) {
								if (!pgw.equals(__DEC_pcgw___conv_714372)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_27_2_black_nac_7BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_27_2_black_nac_8BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_27_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
						if (pattern_SplitAfterSplit_27_2_black_nac_5BB(pcgw, process) == null) {
							for (FlowElement tmpPrevNode : process.getFlowElements()) {
								if (tmpPrevNode instanceof ParallelGateway) {
									ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
									if (!pcgw.equals(prevNode)) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											if (pattern_SplitAfterSplit_27_2_black_nac_8BB(pcgw, prevNode) == null) {
												for (FlowElement tmpSf1 : process.getFlowElements()) {
													if (tmpSf1 instanceof SequenceFlow) {
														SequenceFlow sf1 = (SequenceFlow) tmpSf1;
														if (prevNode.equals(sf1.getSourceRef())) {
															FlowNode tmpPgw = sf1.getTargetRef();
															if (tmpPgw instanceof ParallelGateway) {
																ParallelGateway pgw = (ParallelGateway) tmpPgw;
																if (!pgw.equals(prevNode)) {
																	if (!pcgw.equals(pgw)) {
																		if (process.getFlowElements().contains(pgw)) {
																			if (pcgw.equals(pgw.get__conv())) {
																				boolean pgwisDiverging = pgw
																						.isIsDiverging();
																				if (Boolean.valueOf(pgwisDiverging)
																						.equals(Boolean
																								.valueOf(true))) {
																					if (pattern_SplitAfterSplit_27_2_black_nac_0B(
																							sf1) == null) {
																						if (pattern_SplitAfterSplit_27_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_SplitAfterSplit_27_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_SplitAfterSplit_27_2_black_nac_3BBB(
																										pgw, prevNode,
																										pcgw) == null) {
																									if (pattern_SplitAfterSplit_27_2_black_nac_4BBB(
																											pcgw,
																											prevNode,
																											pgw) == null) {
																										if (pattern_SplitAfterSplit_27_2_black_nac_6BBB(
																												pcgw,
																												prevNode,
																												pgw) == null) {
																											if (pattern_SplitAfterSplit_27_2_black_nac_7BB(
																													prevNode,
																													pgw) == null) {
																												_result.add(
																														new Object[] {
																																process,
																																prevNode,
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

		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterSplit_27_3_expressionFBBBBBBB(SplitAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_27_4_expressionFBB(SplitAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterSplit_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterSplit_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_28_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_28_1_blackFBB(EClass __eClass, SplitAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_28_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_28_1_binding = pattern_SplitAfterSplit_28_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterSplit_28_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_28_1_black = pattern_SplitAfterSplit_28_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterSplit_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterSplit_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterSplit_28_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_906091 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_350485 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_350485)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_28_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_462993 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_462993)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_28_2_black_nac_3BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_336015 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_336015)) {
							if (!prevNode.equals(__DEC_pgw___conv_336015)) {
								if (!pcgw.equals(__DEC_pgw___conv_336015)) {
									return new Object[] { pgw, prevNode, pcgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_28_2_black_nac_4BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_655530 = pcgw.get__conv();
					if (__DEC_pcgw___conv_655530 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_655530)) {
							if (!prevNode.equals(__DEC_pcgw___conv_655530)) {
								if (!pgw.equals(__DEC_pcgw___conv_655530)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_28_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_360368 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_360368)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_28_2_black_nac_6BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_244080 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_244080)) {
							if (!prevNode.equals(__DEC_pcgw___conv_244080)) {
								if (!pgw.equals(__DEC_pcgw___conv_244080)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_28_2_black_nac_7BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_28_2_black_nac_8BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_28_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_targetRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPgw = _edge_targetRef.getTrg();
			if (tmpPgw instanceof ParallelGateway) {
				ParallelGateway pgw = (ParallelGateway) tmpPgw;
				if (pgw.equals(sf1.getTargetRef())) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						if (!pgw.equals(prevNode)) {
							Gateway tmpPcgw = pgw.get__conv();
							if (tmpPcgw instanceof ParallelGateway) {
								ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
								if (!pcgw.equals(prevNode)) {
									if (!pcgw.equals(pgw)) {
										boolean pgwisDiverging = pgw.isIsDiverging();
										if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
											boolean prevNodeisDiverging = prevNode.isIsDiverging();
											if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
												boolean pcgwisDiverging = pcgw.isIsDiverging();
												if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
													if (pattern_SplitAfterSplit_28_2_black_nac_0B(sf1) == null) {
														if (pattern_SplitAfterSplit_28_2_black_nac_7BB(prevNode,
																pgw) == null) {
															if (pattern_SplitAfterSplit_28_2_black_nac_3BBB(pgw,
																	prevNode, pcgw) == null) {
																if (pattern_SplitAfterSplit_28_2_black_nac_4BBB(pcgw,
																		prevNode, pgw) == null) {
																	if (pattern_SplitAfterSplit_28_2_black_nac_6BBB(
																			pcgw, prevNode, pgw) == null) {
																		if (pattern_SplitAfterSplit_28_2_black_nac_8BB(
																				pcgw, prevNode) == null) {
																			for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(sf1,
																							de.abilov.bpmn.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(pgw)) {
																						if (process.getFlowElements()
																								.contains(pcgw)) {
																							if (pattern_SplitAfterSplit_28_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_SplitAfterSplit_28_2_black_nac_2BB(
																										pgw,
																										process) == null) {
																									if (pattern_SplitAfterSplit_28_2_black_nac_5BB(
																											pcgw,
																											process) == null) {
																										_result.add(
																												new Object[] {
																														process,
																														prevNode,
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

		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterSplit_28_3_expressionFBBBBBBB(SplitAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_28_4_expressionFBB(SplitAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterSplit_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterSplit_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_29_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_29_1_blackFBB(EClass __eClass, SplitAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_29_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_29_1_binding = pattern_SplitAfterSplit_29_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterSplit_29_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_29_1_black = pattern_SplitAfterSplit_29_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterSplit_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterSplit_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterSplit_29_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_481214 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_29_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_975054 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_975054)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_29_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_470672 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_470672)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_29_2_black_nac_3BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_891888 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_891888)) {
							if (!prevNode.equals(__DEC_pgw___conv_891888)) {
								if (!pcgw.equals(__DEC_pgw___conv_891888)) {
									return new Object[] { pgw, prevNode, pcgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_29_2_black_nac_4BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_503695 = pcgw.get__conv();
					if (__DEC_pcgw___conv_503695 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_503695)) {
							if (!prevNode.equals(__DEC_pcgw___conv_503695)) {
								if (!pgw.equals(__DEC_pcgw___conv_503695)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_29_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_834127 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_834127)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_29_2_black_nac_6BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_84380 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_84380)) {
							if (!prevNode.equals(__DEC_pcgw___conv_84380)) {
								if (!pgw.equals(__DEC_pcgw___conv_84380)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_29_2_black_nac_7BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_29_2_black_nac_8BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_29_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
								if (tmpPrevNode instanceof ParallelGateway) {
									ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
									if (!pgw.equals(prevNode)) {
										if (!pcgw.equals(prevNode)) {
											boolean pcgwisDiverging = pcgw.isIsDiverging();
											if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
												boolean prevNodeisDiverging = prevNode.isIsDiverging();
												if (Boolean.valueOf(prevNodeisDiverging)
														.equals(Boolean.valueOf(true))) {
													if (pattern_SplitAfterSplit_29_2_black_nac_0B(sf1) == null) {
														if (pattern_SplitAfterSplit_29_2_black_nac_3BBB(pgw, prevNode,
																pcgw) == null) {
															if (pattern_SplitAfterSplit_29_2_black_nac_4BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_SplitAfterSplit_29_2_black_nac_6BBB(pcgw,
																		prevNode, pgw) == null) {
																	if (pattern_SplitAfterSplit_29_2_black_nac_7BB(
																			prevNode, pgw) == null) {
																		if (pattern_SplitAfterSplit_29_2_black_nac_8BB(
																				pcgw, prevNode) == null) {
																			for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(pgw,
																							de.abilov.bpmn.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(sf1)) {
																						if (process.getFlowElements()
																								.contains(pcgw)) {
																							if (pattern_SplitAfterSplit_29_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_SplitAfterSplit_29_2_black_nac_2BB(
																										pgw,
																										process) == null) {
																									if (pattern_SplitAfterSplit_29_2_black_nac_5BB(
																											pcgw,
																											process) == null) {
																										_result.add(
																												new Object[] {
																														process,
																														prevNode,
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

		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterSplit_29_3_expressionFBBBBBBB(SplitAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_29_4_expressionFBB(SplitAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterSplit_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterSplit_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_30_1_bindingFB(SplitAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_30_1_blackFBB(EClass __eClass, SplitAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_30_1_bindingAndBlackFFB(SplitAfterSplit _this) {
		Object[] result_pattern_SplitAfterSplit_30_1_binding = pattern_SplitAfterSplit_30_1_bindingFB(_this);
		if (result_pattern_SplitAfterSplit_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterSplit_30_1_binding[0];

			Object[] result_pattern_SplitAfterSplit_30_1_black = pattern_SplitAfterSplit_30_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterSplit_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterSplit_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterSplit_30_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_720311 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_30_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_302867 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_302867)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_30_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_79512 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_79512)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_30_2_black_nac_3BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_663444 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_663444)) {
							if (!prevNode.equals(__DEC_pgw___conv_663444)) {
								if (!pcgw.equals(__DEC_pgw___conv_663444)) {
									return new Object[] { pgw, prevNode, pcgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_30_2_black_nac_4BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_550472 = pcgw.get__conv();
					if (__DEC_pcgw___conv_550472 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_550472)) {
							if (!prevNode.equals(__DEC_pcgw___conv_550472)) {
								if (!pgw.equals(__DEC_pcgw___conv_550472)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_30_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_86077 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_86077)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_30_2_black_nac_6BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_789607 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_789607)) {
							if (!prevNode.equals(__DEC_pcgw___conv_789607)) {
								if (!pgw.equals(__DEC_pcgw___conv_789607)) {
									return new Object[] { pcgw, prevNode, pgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_30_2_black_nac_7BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterSplit_30_2_black_nac_8BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterSplit_30_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
									if (tmpPrevNode instanceof ParallelGateway) {
										ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
										if (!pgw.equals(prevNode)) {
											if (!pcgw.equals(prevNode)) {
												boolean prevNodeisDiverging = prevNode.isIsDiverging();
												if (Boolean.valueOf(prevNodeisDiverging)
														.equals(Boolean.valueOf(true))) {
													if (pattern_SplitAfterSplit_30_2_black_nac_0B(sf1) == null) {
														if (pattern_SplitAfterSplit_30_2_black_nac_3BBB(pgw, prevNode,
																pcgw) == null) {
															if (pattern_SplitAfterSplit_30_2_black_nac_4BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_SplitAfterSplit_30_2_black_nac_6BBB(pcgw,
																		prevNode, pgw) == null) {
																	if (pattern_SplitAfterSplit_30_2_black_nac_7BB(
																			prevNode, pgw) == null) {
																		if (pattern_SplitAfterSplit_30_2_black_nac_8BB(
																				pcgw, prevNode) == null) {
																			for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(pgw,
																							de.abilov.bpmn.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(sf1)) {
																						if (process.getFlowElements()
																								.contains(pcgw)) {
																							if (pattern_SplitAfterSplit_30_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_SplitAfterSplit_30_2_black_nac_2BB(
																										pgw,
																										process) == null) {
																									if (pattern_SplitAfterSplit_30_2_black_nac_5BB(
																											pcgw,
																											process) == null) {
																										_result.add(
																												new Object[] {
																														process,
																														prevNode,
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

		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_30_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterSplit_30_3_expressionFBBBBBBB(SplitAfterSplit _this, Match match,
			de.abilov.bpmn.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterSplit_30_4_expressionFBB(SplitAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterSplit_30_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterSplit_30_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterSplit_30_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SplitAfterSplitImpl
