/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.FN2S;
import Bpmn2UseCase.GW2S;
import Bpmn2UseCase.P2UC;

import Bpmn2UseCase.Rules.PG2ParallelStepAfterPG;
import Bpmn2UseCase.Rules.RulesPackage;

import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.Flow;
import SimpleUseCase.ParallelFlow;
import SimpleUseCase.ParallelStep;
import SimpleUseCase.SimpleUseCaseFactory;
import SimpleUseCase.Step;
import SimpleUseCase.UseCase;

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
 * An implementation of the model object '<em><b>PG2 Parallel Step After PG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PG2ParallelStepAfterPGImpl extends AbstractRuleImpl implements PG2ParallelStepAfterPG {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PG2ParallelStepAfterPGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPG2ParallelStepAfterPG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SimpleBPMN.Process process, ParallelGateway prevNode,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		// initial bindings
		Object[] result1_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_0_1_blackBBBBBBB(this, match,
				process, prevNode, sf1, pgw, pcgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[process] = " + process + ", " + "[prevNode] = " + prevNode
							+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_0_2_bindingAndBlackFBBBBBBB(this, match, process, prevNode, sf1, pgw,
						pcgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[prevNode] = "
					+ prevNode + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_0_4_blackBBBBBB(match,
					process, prevNode, sf1, pgw, pcgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", "
						+ "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
						+ "[pcgw] = " + pcgw + ".");
			}
			PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_0_4_greenBBBBBBFFFFFFFF(match, process, prevNode,
					sf1, pgw, pcgw);
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[7];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[8];
					// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result4_green[9];
					// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result4_green[10];
					// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result4_green[11];
					// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result4_green[12];
					// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_0_5_blackBBBBBB(match,
					process, prevNode, sf1, pgw, pcgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[process] = " + process + ", " + "[prevNode] = " + prevNode + ", "
								+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
			}
			PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_0_5_greenBBBF(match, process, prevNode);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_0_6_expressionBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw);
			return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_0_7_expressionF();
		} else {
			return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_1_1_bindingAndBlackFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[0];
		ParallelGateway prevNode = (ParallelGateway) result1_bindingAndBlack[1];
		UseCase useCase = (UseCase) result1_bindingAndBlack[2];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[3];
		ParallelStep pstep = (ParallelStep) result1_bindingAndBlack[4];
		GW2S pgw2ps = (GW2S) result1_bindingAndBlack[5];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[6];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[7];
		ParallelGateway pcgw = (ParallelGateway) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_1_1_greenBBFFBFFBB(useCase,
				pstep, pgw, pcgw, csp);
		ParallelFlow flow = (ParallelFlow) result1_green[2];
		ParallelStep step = (ParallelStep) result1_green[3];
		FN2S pcgwToStep = (FN2S) result1_green[5];
		GW2S pgwToStep = (GW2S) result1_green[6];

		// collect translated elements
		Object[] result2_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_1_2_blackBBBBBBB(sf1, flow,
				step, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ", " + "[pgw] = " + pgw
					+ ", " + "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = "
					+ pcgw + ".");
		}
		Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_1_2_greenFBBBBBBB(sf1, flow,
				step, pgw, pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_1_3_blackBBBBBBBBBBBBBB(
				ruleresult, process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, step, pgw, pcgwToStep,
				pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[prevNode] = "
					+ prevNode + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[pstep] = "
					+ pstep + ", " + "[pgw2ps] = " + pgw2ps + ", " + "[sf1] = " + sf1 + ", " + "[flow] = " + flow + ", "
					+ "[step] = " + step + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", "
					+ "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult,
				process, prevNode, useCase, pstep, sf1, flow, step, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pstep__flow____invokedFlows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[17];
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
		PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_1_5_expressionBBBBBBBBBBBBBBB(this, ruleresult,
				process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, step, pgw, pcgwToStep, pgwToStep, pcgw);
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[0];
		ParallelGateway prevNode = (ParallelGateway) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ParallelGateway pgw = (ParallelGateway) result2_binding[3];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[4];
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_2_2_blackBBFFFFBBBB(process, prevNode, sf1, pgw, pcgw, match)) {
			UseCase useCase = (UseCase) result2_black[2];
			P2UC p2uc = (P2UC) result2_black[3];
			ParallelStep pstep = (ParallelStep) result2_black[4];
			GW2S pgw2ps = (GW2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_2_3_blackBBBBBBBBB(
					process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, pgw, pcgw)) {
				Object[] result3_green = PG2ParallelStepAfterPGImpl
						.pattern_PG2ParallelStepAfterPG_2_3_greenBBBBBBBBBFFFFFFFFFFFFFF(process, prevNode, useCase,
								p2uc, pstep, pgw2ps, sf1, pgw, pcgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[13];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pgw2ps__prevNode____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pgw2ps__pstep____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[20];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[22];

				// solve CSP
				Object[] result4_bindingAndBlack = PG2ParallelStepAfterPGImpl
						.pattern_PG2ParallelStepAfterPG_2_4_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
								process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, pgw, pcgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[prevNode] = " + prevNode + ", " + "[useCase] = "
							+ useCase + ", " + "[p2uc] = " + p2uc + ", " + "[pstep] = " + pstep + ", " + "[pgw2ps] = "
							+ pgw2ps + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SimpleBPMN.Process process, ParallelGateway prevNode,
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
	public CSP isAppropriate_solveCsp_FWD(Match match, SimpleBPMN.Process process, ParallelGateway prevNode,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {// Create CSP
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
		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow.id", csp);
		var_flow_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_flow_id);
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
			EObject p2uc, EObject pstep, EObject pgw2ps, EObject sf1, EObject flow, EObject step, EObject pgw,
			EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("pstep", pstep);
		ruleresult.registerObject("pgw2ps", pgw2ps);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("step", step);
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
		return true && match.getObject("sf1").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow())
				&& match.getObject("pgw").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getParallelGateway())
				&& match.getObject("pcgw").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getParallelGateway());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, UseCase useCase, ParallelStep pstep, ParallelFlow flow,
			ParallelStep step) {
		// initial bindings
		Object[] result1_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_10_1_blackBBBBBB(this, match,
				useCase, pstep, flow, step);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", "
					+ "[pstep] = " + pstep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_10_2_bindingAndBlackFBBBBBB(this, match, useCase, pstep, flow, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[pstep] = " + pstep
					+ ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_10_4_blackBBBBB(match,
					useCase, pstep, flow, step);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[pstep] = "
						+ pstep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
			}
			PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_10_4_greenBBBBBFFF(match, useCase, pstep, flow,
					step);
					// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result4_green[5];
					// EMoflonEdge pstep__flow____invokedFlows = (EMoflonEdge) result4_green[6];
					// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_10_5_blackBBBBB(match,
					useCase, pstep, flow, step);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[pstep] = "
						+ pstep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
			}
			PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_10_5_greenBBB(match, useCase, pstep);

			// register objects to match
			PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_10_6_expressionBBBBBB(this, match, useCase, pstep,
					flow, step);
			return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_10_7_expressionF();
		} else {
			return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_11_1_bindingAndBlackFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[0];
		ParallelGateway prevNode = (ParallelGateway) result1_bindingAndBlack[1];
		UseCase useCase = (UseCase) result1_bindingAndBlack[2];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[3];
		ParallelStep pstep = (ParallelStep) result1_bindingAndBlack[4];
		GW2S pgw2ps = (GW2S) result1_bindingAndBlack[5];
		ParallelFlow flow = (ParallelFlow) result1_bindingAndBlack[6];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_11_1_greenBBFBFFFFB(process,
				prevNode, step, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[2];
		ParallelGateway pgw = (ParallelGateway) result1_green[4];
		FN2S pcgwToStep = (FN2S) result1_green[5];
		GW2S pgwToStep = (GW2S) result1_green[6];
		ParallelGateway pcgw = (ParallelGateway) result1_green[7];

		// collect translated elements
		Object[] result2_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_11_2_blackBBBBBBB(sf1, flow,
				step, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ", " + "[pgw] = " + pgw
					+ ", " + "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = "
					+ pcgw + ".");
		}
		Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_11_2_greenFBBBBBBB(sf1, flow,
				step, pgw, pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_11_3_blackBBBBBBBBBBBBBB(
				ruleresult, process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, step, pgw, pcgwToStep,
				pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[prevNode] = "
					+ prevNode + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[pstep] = "
					+ pstep + ", " + "[pgw2ps] = " + pgw2ps + ", " + "[sf1] = " + sf1 + ", " + "[flow] = " + flow + ", "
					+ "[step] = " + step + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", "
					+ "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult,
				process, prevNode, useCase, pstep, sf1, flow, step, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pstep__flow____invokedFlows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[17];
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
		PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_11_5_expressionBBBBBBBBBBBBBBB(this, ruleresult,
				process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, step, pgw, pcgwToStep, pgwToStep, pcgw);
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		UseCase useCase = (UseCase) result2_binding[0];
		ParallelStep pstep = (ParallelStep) result2_binding[1];
		ParallelFlow flow = (ParallelFlow) result2_binding[2];
		ParallelStep step = (ParallelStep) result2_binding[3];
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_12_2_blackFFBFBFBBB(useCase, pstep, flow, step, match)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			P2UC p2uc = (P2UC) result2_black[3];
			GW2S pgw2ps = (GW2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_12_3_blackBBBBBBBB(
					process, prevNode, useCase, p2uc, pstep, pgw2ps, flow, step)) {
				Object[] result3_green = PG2ParallelStepAfterPGImpl
						.pattern_PG2ParallelStepAfterPG_12_3_greenBBBBBBBBFFFFFFFFF(process, prevNode, useCase, p2uc,
								pstep, pgw2ps, flow, step);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[9];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[10];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge pstep__flow____invokedFlows = (EMoflonEdge) result3_green[13];
				// EMoflonEdge pgw2ps__prevNode____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pgw2ps__pstep____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = PG2ParallelStepAfterPGImpl
						.pattern_PG2ParallelStepAfterPG_12_4_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								process, prevNode, useCase, p2uc, pstep, pgw2ps, flow, step);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[prevNode] = " + prevNode + ", " + "[useCase] = "
							+ useCase + ", " + "[p2uc] = " + p2uc + ", " + "[pstep] = " + pstep + ", " + "[pgw2ps] = "
							+ pgw2ps + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, UseCase useCase, ParallelStep pstep, ParallelFlow flow,
			ParallelStep step) {
		match.registerObject("useCase", useCase);
		match.registerObject("pstep", pstep);
		match.registerObject("flow", flow);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, UseCase useCase, ParallelStep pstep, ParallelFlow flow,
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ParallelFlow flow,
			ParallelStep step) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow.id", true, csp);
		var_flow_id.setValue(flow.getId());
		var_flow_id.setType("String");
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
		eq.solve(var_sf1_id, var_flow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_pgw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("pgw2ps", pgw2ps);
		isApplicableMatch.registerObject("flow", flow);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject process, EObject prevNode, EObject useCase,
			EObject p2uc, EObject pstep, EObject pgw2ps, EObject sf1, EObject flow, EObject step, EObject pgw,
			EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("pstep", pstep);
		ruleresult.registerObject("pgw2ps", pgw2ps);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("step", step);
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
				&& match.getObject("flow").eClass()
						.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getParallelFlow())
				&& match.getObject("step").eClass()
						.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getParallelStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_20_2_blackFFFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_20_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_20_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_20_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_21_2_blackFFFFFB(_edge_sourceRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_21_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_21_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_21_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_3(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_22_2_blackFFFFFB(_edge_outgoing)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_22_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_22_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_22_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_2(EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_23_2_blackFFFFB(_edge_flows)) {
			UseCase useCase = (UseCase) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			ParallelFlow flow = (ParallelFlow) result2_black[2];
			ParallelStep step = (ParallelStep) result2_black[3];
			Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_23_3_expressionFBBBBBB(this, match, useCase,
					pstep, flow, step)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_23_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_23_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_3(EMoflonEdge _edge_invokedFlows) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_24_2_blackFFFFB(_edge_invokedFlows)) {
			UseCase useCase = (UseCase) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			ParallelFlow flow = (ParallelFlow) result2_black[2];
			ParallelStep step = (ParallelStep) result2_black[3];
			Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_24_3_expressionFBBBBBB(this, match, useCase,
					pstep, flow, step)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_24_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_24_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_4(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_25_2_blackFFFFB(_edge_steps)) {
			UseCase useCase = (UseCase) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			ParallelFlow flow = (ParallelFlow) result2_black[2];
			ParallelStep step = (ParallelStep) result2_black[3];
			Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_25_3_expressionFBBBBBB(this, match, useCase,
					pstep, flow, step)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_25_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_25_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_4(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_26_2_blackFFFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_26_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_26_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_26_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_5(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_27_2_blackFFFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_27_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_27_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_27_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_6(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_28_2_blackFFFFFB(_edge_targetRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_28_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_28_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_28_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_7(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_29_2_blackFFFFFB(_edge_incoming)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_29_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_29_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_29_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_8(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_30_2_blackFFFFFB(_edge___conv)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_30_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_30_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_30_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_30_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PG2ParallelStepAfterPG");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.ParallelGateway prevNode = (SimpleBPMN.ParallelGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		Bpmn2UseCase.P2UC p2uc = (Bpmn2UseCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPstep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pstep")).findAny();
		SimpleUseCase.ParallelStep pstep = (SimpleUseCase.ParallelStep) matchForPstep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw2ps")).findAny();
		Bpmn2UseCase.GW2S pgw2ps = (Bpmn2UseCase.GW2S) matchForPgw2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.ParallelFlow flow = (SimpleUseCase.ParallelFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ParallelStep step = (SimpleUseCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw")).findAny();
		SimpleBPMN.ParallelGateway pgw = (SimpleBPMN.ParallelGateway) matchForPgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPcgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pcgwToStep")).findAny();
		Bpmn2UseCase.FN2S pcgwToStep = (Bpmn2UseCase.FN2S) matchForPcgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgwToStep")).findAny();
		Bpmn2UseCase.GW2S pgwToStep = (Bpmn2UseCase.GW2S) matchForPgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPcgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pcgw")).findAny();
		SimpleBPMN.ParallelGateway pcgw = (SimpleBPMN.ParallelGateway) matchForPcgw.get().getNode();

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

		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow", true, csp);
		var_flow_id.setValue(flow.getId());
		var_flow_id.setType("String");

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

		eq0.setRuleName("PG2ParallelStepAfterPG");
		eq0.solve(var_sf1_id, var_flow_id);

		eq1.setRuleName("PG2ParallelStepAfterPG");
		eq1.solve(var_pgw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_flow_id.setBound(false);
			var_step_id.setBound(false);
			eq0.solve(var_sf1_id, var_flow_id);
			eq1.solve(var_pgw_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				flow.setId((String) var_flow_id.getValue());
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
		ruleResult.setRule("PG2ParallelStepAfterPG");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.ParallelGateway prevNode = (SimpleBPMN.ParallelGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		Bpmn2UseCase.P2UC p2uc = (Bpmn2UseCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPstep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pstep")).findAny();
		SimpleUseCase.ParallelStep pstep = (SimpleUseCase.ParallelStep) matchForPstep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw2ps")).findAny();
		Bpmn2UseCase.GW2S pgw2ps = (Bpmn2UseCase.GW2S) matchForPgw2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.ParallelFlow flow = (SimpleUseCase.ParallelFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ParallelStep step = (SimpleUseCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw")).findAny();
		SimpleBPMN.ParallelGateway pgw = (SimpleBPMN.ParallelGateway) matchForPgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPcgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pcgwToStep")).findAny();
		Bpmn2UseCase.FN2S pcgwToStep = (Bpmn2UseCase.FN2S) matchForPcgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgwToStep")).findAny();
		Bpmn2UseCase.GW2S pgwToStep = (Bpmn2UseCase.GW2S) matchForPgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPcgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pcgw")).findAny();
		SimpleBPMN.ParallelGateway pcgw = (SimpleBPMN.ParallelGateway) matchForPcgw.get().getNode();

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

		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow", true, csp);
		var_flow_id.setValue(flow.getId());
		var_flow_id.setType("String");

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

		eq0.setRuleName("PG2ParallelStepAfterPG");
		eq0.solve(var_sf1_id, var_flow_id);

		eq1.setRuleName("PG2ParallelStepAfterPG");
		eq1.solve(var_pgw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_sf1_id.setBound(false);
			var_pgw_id.setBound(false);
			eq0.solve(var_sf1_id, var_flow_id);
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
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// prepare
		Object[] result1_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_33_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_33_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_33_2_bindingFFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[0];
		ParallelGateway prevNode = (ParallelGateway) result2_binding[1];
		UseCase useCase = (UseCase) result2_binding[2];
		ParallelStep pstep = (ParallelStep) result2_binding[3];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[4];
		ParallelFlow flow = (ParallelFlow) result2_binding[5];
		ParallelStep step = (ParallelStep) result2_binding[6];
		ParallelGateway pgw = (ParallelGateway) result2_binding[7];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[8];
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_33_2_blackBBBFBFBBBBBBB(
				process, prevNode, useCase, pstep, sf1, flow, step, pgw, pcgw, sourceMatch, targetMatch)) {
			P2UC p2uc = (P2UC) result2_black[3];
			GW2S pgw2ps = (GW2S) result2_black[5];
			Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_33_2_greenBBBBBBBBBBBBBF(
					process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, step, pgw, pcgw, sourceMatch,
					targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[13];

			// check csp
			Object[] result3_bindingAndBlack = PG2ParallelStepAfterPGImpl
					.pattern_PG2ParallelStepAfterPG_33_3_bindingAndBlackFBBBBBBBBBBBBBBB(this, isApplicableMatch,
							process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, step, pgw, pcgw, sourceMatch,
							targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_33_4_blackBB(result,
						isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_33_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_33_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1,
			ParallelFlow flow, ParallelStep step, ParallelGateway pgw, ParallelGateway pcgw, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");
		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow.id", true, csp);
		var_flow_id.setValue(flow.getId());
		var_flow_id.setType("String");
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_flow_id);
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
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("pgw", pgw);
		isApplicableMatch.registerObject("pcgw", pcgw);
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
		Object[] result1_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_36_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_36_2_bindingAndBlackFFFFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[0];
		// ParallelGateway prevNode = (ParallelGateway) result2_bindingAndBlack[1];
		// UseCase useCase = (UseCase) result2_bindingAndBlack[2];
		// P2UC p2uc = (P2UC) result2_bindingAndBlack[3];
		// ParallelStep pstep = (ParallelStep) result2_bindingAndBlack[4];
		// GW2S pgw2ps = (GW2S) result2_bindingAndBlack[5];
		// SequenceFlow sf1 = (SequenceFlow) result2_bindingAndBlack[6];
		// ParallelFlow flow = (ParallelFlow) result2_bindingAndBlack[7];
		ParallelStep step = (ParallelStep) result2_bindingAndBlack[8];
		ParallelGateway pgw = (ParallelGateway) result2_bindingAndBlack[9];
		ParallelGateway pcgw = (ParallelGateway) result2_bindingAndBlack[10];
		Object[] result2_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_36_2_greenBBBFFF(step, pgw,
				pcgw);
		PerformRuleResult result = (PerformRuleResult) result2_green[3];
		// FN2S pcgwToStep = (FN2S) result2_green[4];
		// GW2S pgwToStep = (GW2S) result2_green[5];

		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_36_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, GW2S pgw2psParameter) {
		// create result
		Object[] result1_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_37_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_37_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : PG2ParallelStepAfterPGImpl
				.pattern_PG2ParallelStepAfterPG_37_2_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList pgw2psList = (RuleEntryList) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			ParallelGateway prevNode = (ParallelGateway) result2_black[2];
			GW2S pgw2ps = (GW2S) result2_black[3];
			ParallelStep pstep = (ParallelStep) result2_black[4];
			P2UC p2uc = (P2UC) result2_black[5];
			UseCase useCase = (UseCase) result2_black[6];

			// solve CSP
			Object[] result3_bindingAndBlack = PG2ParallelStepAfterPGImpl
					.pattern_PG2ParallelStepAfterPG_37_3_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, process,
							prevNode, useCase, p2uc, pstep, pgw2ps, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[process] = " + process
						+ ", " + "[prevNode] = " + prevNode + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = "
						+ p2uc + ", " + "[pstep] = " + pstep + ", " + "[pgw2ps] = " + pgw2ps + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_37_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_37_5_blackBBBBBB(
						process, prevNode, useCase, p2uc, pstep, pgw2ps);
				if (result5_black != null) {

					// perform
					Object[] result6_black = PG2ParallelStepAfterPGImpl
							.pattern_PG2ParallelStepAfterPG_37_6_blackBBBBBBB(process, prevNode, useCase, p2uc, pstep,
									pgw2ps, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[process] = " + process + ", " + "[prevNode] = " + prevNode + ", " + "[useCase] = "
								+ useCase + ", " + "[p2uc] = " + p2uc + ", " + "[pstep] = " + pstep + ", "
								+ "[pgw2ps] = " + pgw2ps + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_37_6_greenBBBBFFFFFFFBB(process, prevNode,
							useCase, pstep, ruleResult, csp);
					// SequenceFlow sf1 = (SequenceFlow) result6_green[4];
					// ParallelFlow flow = (ParallelFlow) result6_green[5];
					// ParallelStep step = (ParallelStep) result6_green[6];
					// ParallelGateway pgw = (ParallelGateway) result6_green[7];
					// FN2S pcgwToStep = (FN2S) result6_green[8];
					// GW2S pgwToStep = (GW2S) result6_green[9];
					// ParallelGateway pcgw = (ParallelGateway) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterPGImpl.pattern_PG2ParallelStepAfterPG_37_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", csp);
		var_sf1_id.setType("String");
		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow.id", csp);
		var_flow_id.setType("String");
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", csp);
		var_pgw_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_flow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_pgw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("pgw2ps", pgw2ps);
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
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
			return null;
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_USECASE_P2UC_PARALLELSTEP_GW2S_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (ParallelGateway) arguments.get(2),
					(UseCase) arguments.get(3), (P2UC) arguments.get(4), (ParallelStep) arguments.get(5),
					(GW2S) arguments.get(6), (SequenceFlow) arguments.get(7), (ParallelGateway) arguments.get(8),
					(ParallelGateway) arguments.get(9));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_PARALLELSTEP:
			return isAppropriate_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(ParallelStep) arguments.get(2), (ParallelFlow) arguments.get(3), (ParallelStep) arguments.get(4));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_PARALLELSTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(ParallelStep) arguments.get(2), (ParallelFlow) arguments.get(3), (ParallelStep) arguments.get(4));
			return null;
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_PARALLELSTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(ParallelStep) arguments.get(2), (ParallelFlow) arguments.get(3), (ParallelStep) arguments.get(4));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_USECASE_P2UC_PARALLELSTEP_GW2S_PARALLELFLOW_PARALLELSTEP:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (ParallelGateway) arguments.get(2),
					(UseCase) arguments.get(3), (P2UC) arguments.get(4), (ParallelStep) arguments.get(5),
					(GW2S) arguments.get(6), (ParallelFlow) arguments.get(7), (ParallelStep) arguments.get(8));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_3((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_3((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_4((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_5((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_6((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_7((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PROCESS_PARALLELGATEWAY_USECASE_P2UC_PARALLELSTEP_GW2S_SEQUENCEFLOW_PARALLELFLOW_PARALLELSTEP_PARALLELGATEWAY_PARALLELGATEWAY_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (ParallelGateway) arguments.get(2),
					(UseCase) arguments.get(3), (P2UC) arguments.get(4), (ParallelStep) arguments.get(5),
					(GW2S) arguments.get(6), (SequenceFlow) arguments.get(7), (ParallelFlow) arguments.get(8),
					(ParallelStep) arguments.get(9), (ParallelGateway) arguments.get(10),
					(ParallelGateway) arguments.get(11), (Match) arguments.get(12), (Match) arguments.get(13));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S:
			return generateModel((RuleEntryContainer) arguments.get(0), (GW2S) arguments.get(1));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_USECASE_P2UC_PARALLELSTEP_GW2S_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (ParallelGateway) arguments.get(2),
					(UseCase) arguments.get(3), (P2UC) arguments.get(4), (ParallelStep) arguments.get(5),
					(GW2S) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_0_1_blackBBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_0_2_bindingFBBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process, prevNode, sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, prevNode, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_0_2_bindingAndBlackFBBBBBBB(
			PG2ParallelStepAfterPG _this, Match match, SimpleBPMN.Process process, ParallelGateway prevNode,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_PG2ParallelStepAfterPG_0_2_binding = pattern_PG2ParallelStepAfterPG_0_2_bindingFBBBBBBB(
				_this, match, process, prevNode, sf1, pgw, pcgw);
		if (result_pattern_PG2ParallelStepAfterPG_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepAfterPG_0_2_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_0_2_black = pattern_PG2ParallelStepAfterPG_0_2_blackB(csp);
			if (result_pattern_PG2ParallelStepAfterPG_0_2_black != null) {

				return new Object[] { csp, _this, match, process, prevNode, sf1, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_0_3_expressionFBB(PG2ParallelStepAfterPG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_0_4_blackBBBBBB(Match match, SimpleBPMN.Process process,
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_0_4_greenBBBBBBFFFFFFFF(Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_0_5_blackBBBBBB(Match match, SimpleBPMN.Process process,
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_0_5_greenBBBF(Match match, SimpleBPMN.Process process,
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

	public static final void pattern_PG2ParallelStepAfterPG_0_6_expressionBBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		_this.registerObjectsToMatch_FWD(match, process, prevNode, sf1, pgw, pcgw);

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_3 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_4 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_5 = isApplicableMatch.getObject("pgw2ps");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_7 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_8 = isApplicableMatch.getObject("pcgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpP2uc = _localVariable_3;
		EObject tmpPstep = _localVariable_4;
		EObject tmpPgw2ps = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmpPgw = _localVariable_7;
		EObject tmpPcgw = _localVariable_8;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
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
									if (tmpPgw instanceof ParallelGateway) {
										ParallelGateway pgw = (ParallelGateway) tmpPgw;
										if (tmpPcgw instanceof ParallelGateway) {
											ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
											return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1,
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
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_1_1_blackBBBBBBBBBBFB(SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, PG2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, pgw, pcgw,
									_this, csp, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_1_1_bindingAndBlackFFFFFFFFFBFB(
			PG2ParallelStepAfterPG _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PG2ParallelStepAfterPG_1_1_binding = pattern_PG2ParallelStepAfterPG_1_1_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_PG2ParallelStepAfterPG_1_1_binding != null) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_PG2ParallelStepAfterPG_1_1_binding[0];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_PG2ParallelStepAfterPG_1_1_binding[1];
			UseCase useCase = (UseCase) result_pattern_PG2ParallelStepAfterPG_1_1_binding[2];
			P2UC p2uc = (P2UC) result_pattern_PG2ParallelStepAfterPG_1_1_binding[3];
			ParallelStep pstep = (ParallelStep) result_pattern_PG2ParallelStepAfterPG_1_1_binding[4];
			GW2S pgw2ps = (GW2S) result_pattern_PG2ParallelStepAfterPG_1_1_binding[5];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_PG2ParallelStepAfterPG_1_1_binding[6];
			ParallelGateway pgw = (ParallelGateway) result_pattern_PG2ParallelStepAfterPG_1_1_binding[7];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_PG2ParallelStepAfterPG_1_1_binding[8];

			Object[] result_pattern_PG2ParallelStepAfterPG_1_1_black = pattern_PG2ParallelStepAfterPG_1_1_blackBBBBBBBBBBFB(
					process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, pgw, pcgw, _this, isApplicableMatch);
			if (result_pattern_PG2ParallelStepAfterPG_1_1_black != null) {
				CSP csp = (CSP) result_pattern_PG2ParallelStepAfterPG_1_1_black[10];

				return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, pgw, pcgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_1_1_greenBBFFBFFBB(UseCase useCase, ParallelStep pstep,
			ParallelGateway pgw, ParallelGateway pcgw, CSP csp) {
		ParallelFlow flow = SimpleUseCaseFactory.eINSTANCE.createParallelFlow();
		ParallelStep step = SimpleUseCaseFactory.eINSTANCE.createParallelStep();
		FN2S pcgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("flow", "id");
		Object _localVariable_1 = csp.getValue("step", "id");
		useCase.getFlows().add(flow);
		pstep.getInvokedFlows().add(flow);
		flow.getSteps().add(step);
		pcgwToStep.setSource(pcgw);
		pcgwToStep.setTarget(step);
		pgwToStep.setSource(pgw);
		pgwToStep.setTarget(step);
		String flow_id_prime = (String) _localVariable_0;
		String step_id_prime = (String) _localVariable_1;
		flow.setId(flow_id_prime);
		step.setId(step_id_prime);
		return new Object[] { useCase, pstep, flow, step, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_1_2_blackBBBBBBB(SequenceFlow sf1, ParallelFlow flow,
			ParallelStep step, ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { sf1, flow, step, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_1_2_greenFBBBBBBB(SequenceFlow sf1, ParallelFlow flow,
			ParallelStep step, ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getCreatedElements().add(flow);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(pgw);
		ruleresult.getCreatedLinkElements().add(pcgwToStep);
		ruleresult.getCreatedLinkElements().add(pgwToStep);
		ruleresult.getTranslatedElements().add(pcgw);
		return new Object[] { ruleresult, sf1, flow, step, pgw, pcgwToStep, pgwToStep, pcgw };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_1_3_blackBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject prevNode, EObject useCase, EObject p2uc, EObject pstep, EObject pgw2ps,
			EObject sf1, EObject flow, EObject step, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
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
																	if (!p2uc.equals(step)) {
																		if (!p2uc.equals(pgw)) {
																			if (!p2uc.equals(pcgwToStep)) {
																				if (!p2uc.equals(pgwToStep)) {
																					if (!p2uc.equals(pcgw)) {
																						if (!pstep.equals(useCase)) {
																							if (!pstep.equals(sf1)) {
																								if (!pstep
																										.equals(step)) {
																									if (!pgw2ps.equals(
																											process)) {
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
																																											.equals(step)) {
																																										if (!flow
																																												.equals(pgw)) {
																																											if (!flow
																																													.equals(pcgwToStep)) {
																																												if (!flow
																																														.equals(pgwToStep)) {
																																													if (!flow
																																															.equals(pcgw)) {
																																														if (!step
																																																.equals(useCase)) {
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
																																																																																		flow,
																																																																																		step,
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
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject prevNode, EObject useCase, EObject pstep,
			EObject sf1, EObject flow, EObject step, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PG2ParallelStepAfterPG";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String useCase__flow____flows_name_prime = "flows";
		String pstep__flow____invokedFlows_name_prime = "invokedFlows";
		String flow__step____steps_name_prime = "steps";
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
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		ruleresult.getCreatedEdges().add(useCase__flow____flows);
		pstep__flow____invokedFlows.setSrc(pstep);
		pstep__flow____invokedFlows.setTrg(flow);
		ruleresult.getCreatedEdges().add(pstep__flow____invokedFlows);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
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
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		pstep__flow____invokedFlows.setName(pstep__flow____invokedFlows_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		pcgwToStep__pcgw____source.setName(pcgwToStep__pcgw____source_name_prime);
		pcgwToStep__step____target.setName(pcgwToStep__step____target_name_prime);
		pgwToStep__pgw____source.setName(pgwToStep__pgw____source_name_prime);
		pgwToStep__step____target.setName(pgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, process, prevNode, useCase, pstep, sf1, flow, step, pgw, pcgwToStep,
				pgwToStep, pcgw, process__sf1____flowElements, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				useCase__flow____flows, pstep__flow____invokedFlows, flow__step____steps, process__pgw____flowElements,
				process__pcgw____flowElements, sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv,
				pcgwToStep__pcgw____source, pcgwToStep__step____target, pgwToStep__pgw____source,
				pgwToStep__step____target };
	}

	public static final void pattern_PG2ParallelStepAfterPG_1_5_expressionBBBBBBBBBBBBBBB(PG2ParallelStepAfterPG _this,
			PerformRuleResult ruleresult, EObject process, EObject prevNode, EObject useCase, EObject p2uc,
			EObject pstep, EObject pgw2ps, EObject sf1, EObject flow, EObject step, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_FWD(ruleresult, process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, step, pgw,
				pcgwToStep, pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_PG2ParallelStepAfterPG_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_2_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_2_1_blackFBB(EClass eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_2_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_2_1_binding = pattern_PG2ParallelStepAfterPG_2_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_2_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_2_1_black = pattern_PG2ParallelStepAfterPG_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "PG2ParallelStepAfterPG";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_2_2_bindingFFFFFB(Match match) {
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
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_2_2_blackBBFFFFBBBB(
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw, Match match) {
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_2_3_blackBBBBBBBBB(SimpleBPMN.Process process,
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
																			_result.add(new Object[] { process,
																					prevNode, useCase, p2uc, pstep,
																					pgw2ps, sf1, pgw, pcgw });
																		}

																	}

																}

															}
														}
													}
												}
											}
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_2_3_greenBBBBBBBBBFFFFFFFFFFFFFF(
			SimpleBPMN.Process process, ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep,
			GW2S pgw2ps, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw2ps__pstep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String pgw2ps__prevNode____source_name_prime = "source";
		String pgw2ps__pstep____target_name_prime = "target";
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
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		pgw2ps__prevNode____source.setName(pgw2ps__prevNode____source_name_prime);
		pgw2ps__pstep____target.setName(pgw2ps__pstep____target_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, pgw, pcgw, isApplicableMatch,
				process__prevNode____flowElements, process__sf1____flowElements, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, p2uc__process____source, p2uc__useCase____target, pgw2ps__prevNode____source,
				pgw2ps__pstep____target, process__pgw____flowElements, process__pcgw____flowElements,
				sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_2_4_bindingFBBBBBBBBBBB(PG2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, ParallelGateway prevNode, UseCase useCase,
			P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, process, prevNode, useCase, p2uc,
				pstep, pgw2ps, sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1,
					pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_2_4_bindingAndBlackFBBBBBBBBBBB(
			PG2ParallelStepAfterPG _this, IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_PG2ParallelStepAfterPG_2_4_binding = pattern_PG2ParallelStepAfterPG_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, pgw, pcgw);
		if (result_pattern_PG2ParallelStepAfterPG_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepAfterPG_2_4_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_2_4_black = pattern_PG2ParallelStepAfterPG_2_4_blackB(csp);
			if (result_pattern_PG2ParallelStepAfterPG_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps,
						sf1, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_2_5_expressionFBB(PG2ParallelStepAfterPG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PG2ParallelStepAfterPG";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PG2ParallelStepAfterPG_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_10_1_blackBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, UseCase useCase, ParallelStep pstep, ParallelFlow flow, ParallelStep step) {
		if (!pstep.equals(step)) {
			return new Object[] { _this, match, useCase, pstep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_10_2_bindingFBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, UseCase useCase, ParallelStep pstep, ParallelFlow flow, ParallelStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, useCase, pstep, flow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCase, pstep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_10_2_bindingAndBlackFBBBBBB(
			PG2ParallelStepAfterPG _this, Match match, UseCase useCase, ParallelStep pstep, ParallelFlow flow,
			ParallelStep step) {
		Object[] result_pattern_PG2ParallelStepAfterPG_10_2_binding = pattern_PG2ParallelStepAfterPG_10_2_bindingFBBBBBB(
				_this, match, useCase, pstep, flow, step);
		if (result_pattern_PG2ParallelStepAfterPG_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepAfterPG_10_2_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_10_2_black = pattern_PG2ParallelStepAfterPG_10_2_blackB(csp);
			if (result_pattern_PG2ParallelStepAfterPG_10_2_black != null) {

				return new Object[] { csp, _this, match, useCase, pstep, flow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_10_3_expressionFBB(PG2ParallelStepAfterPG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_10_4_blackBBBBB(Match match, UseCase useCase,
			ParallelStep pstep, ParallelFlow flow, ParallelStep step) {
		if (!pstep.equals(step)) {
			return new Object[] { match, useCase, pstep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_10_4_greenBBBBBFFF(Match match, UseCase useCase,
			ParallelStep pstep, ParallelFlow flow, ParallelStep step) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(flow);
		match.getToBeTranslatedNodes().add(step);
		String useCase__flow____flows_name_prime = "flows";
		String pstep__flow____invokedFlows_name_prime = "invokedFlows";
		String flow__step____steps_name_prime = "steps";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getToBeTranslatedEdges().add(useCase__flow____flows);
		pstep__flow____invokedFlows.setSrc(pstep);
		pstep__flow____invokedFlows.setTrg(flow);
		match.getToBeTranslatedEdges().add(pstep__flow____invokedFlows);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		pstep__flow____invokedFlows.setName(pstep__flow____invokedFlows_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, useCase, pstep, flow, step, useCase__flow____flows, pstep__flow____invokedFlows,
				flow__step____steps };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_10_5_blackBBBBB(Match match, UseCase useCase,
			ParallelStep pstep, ParallelFlow flow, ParallelStep step) {
		if (!pstep.equals(step)) {
			return new Object[] { match, useCase, pstep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_10_5_greenBBB(Match match, UseCase useCase,
			ParallelStep pstep) {
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(pstep);
		return new Object[] { match, useCase, pstep };
	}

	public static final void pattern_PG2ParallelStepAfterPG_10_6_expressionBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, UseCase useCase, ParallelStep pstep, ParallelFlow flow, ParallelStep step) {
		_this.registerObjectsToMatch_BWD(match, useCase, pstep, flow, step);

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_11_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_3 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_4 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_5 = isApplicableMatch.getObject("pgw2ps");
		EObject _localVariable_6 = isApplicableMatch.getObject("flow");
		EObject _localVariable_7 = isApplicableMatch.getObject("step");
		EObject tmpProcess = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpP2uc = _localVariable_3;
		EObject tmpPstep = _localVariable_4;
		EObject tmpPgw2ps = _localVariable_5;
		EObject tmpFlow = _localVariable_6;
		EObject tmpStep = _localVariable_7;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
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
								if (tmpFlow instanceof ParallelFlow) {
									ParallelFlow flow = (ParallelFlow) tmpFlow;
									if (tmpStep instanceof ParallelStep) {
										ParallelStep step = (ParallelStep) tmpStep;
										return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, flow,
												step, isApplicableMatch };
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_11_1_blackBBBBBBBBBFB(SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ParallelFlow flow,
			ParallelStep step, PG2ParallelStepAfterPG _this, IsApplicableMatch isApplicableMatch) {
		if (!pstep.equals(step)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, flow, step, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_11_1_bindingAndBlackFFFFFFFFBFB(
			PG2ParallelStepAfterPG _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PG2ParallelStepAfterPG_11_1_binding = pattern_PG2ParallelStepAfterPG_11_1_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_PG2ParallelStepAfterPG_11_1_binding != null) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_PG2ParallelStepAfterPG_11_1_binding[0];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_PG2ParallelStepAfterPG_11_1_binding[1];
			UseCase useCase = (UseCase) result_pattern_PG2ParallelStepAfterPG_11_1_binding[2];
			P2UC p2uc = (P2UC) result_pattern_PG2ParallelStepAfterPG_11_1_binding[3];
			ParallelStep pstep = (ParallelStep) result_pattern_PG2ParallelStepAfterPG_11_1_binding[4];
			GW2S pgw2ps = (GW2S) result_pattern_PG2ParallelStepAfterPG_11_1_binding[5];
			ParallelFlow flow = (ParallelFlow) result_pattern_PG2ParallelStepAfterPG_11_1_binding[6];
			ParallelStep step = (ParallelStep) result_pattern_PG2ParallelStepAfterPG_11_1_binding[7];

			Object[] result_pattern_PG2ParallelStepAfterPG_11_1_black = pattern_PG2ParallelStepAfterPG_11_1_blackBBBBBBBBBFB(
					process, prevNode, useCase, p2uc, pstep, pgw2ps, flow, step, _this, isApplicableMatch);
			if (result_pattern_PG2ParallelStepAfterPG_11_1_black != null) {
				CSP csp = (CSP) result_pattern_PG2ParallelStepAfterPG_11_1_black[9];

				return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, flow, step, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_11_1_greenBBFBFFFFB(SimpleBPMN.Process process,
			ParallelGateway prevNode, ParallelStep step, CSP csp) {
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		ParallelGateway pgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		FN2S pcgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		ParallelGateway pcgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_11_2_blackBBBBBBB(SequenceFlow sf1, ParallelFlow flow,
			ParallelStep step, ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { sf1, flow, step, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_11_2_greenFBBBBBBB(SequenceFlow sf1, ParallelFlow flow,
			ParallelStep step, ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(flow);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(pgw);
		ruleresult.getCreatedLinkElements().add(pcgwToStep);
		ruleresult.getCreatedLinkElements().add(pgwToStep);
		ruleresult.getCreatedElements().add(pcgw);
		return new Object[] { ruleresult, sf1, flow, step, pgw, pcgwToStep, pgwToStep, pcgw };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_11_3_blackBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject prevNode, EObject useCase, EObject p2uc, EObject pstep, EObject pgw2ps,
			EObject sf1, EObject flow, EObject step, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
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
																	if (!p2uc.equals(step)) {
																		if (!p2uc.equals(pgw)) {
																			if (!p2uc.equals(pcgwToStep)) {
																				if (!p2uc.equals(pgwToStep)) {
																					if (!p2uc.equals(pcgw)) {
																						if (!pstep.equals(useCase)) {
																							if (!pstep.equals(sf1)) {
																								if (!pstep
																										.equals(step)) {
																									if (!pgw2ps.equals(
																											process)) {
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
																																											.equals(step)) {
																																										if (!flow
																																												.equals(pgw)) {
																																											if (!flow
																																													.equals(pcgwToStep)) {
																																												if (!flow
																																														.equals(pgwToStep)) {
																																													if (!flow
																																															.equals(pcgw)) {
																																														if (!step
																																																.equals(useCase)) {
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
																																																																																		flow,
																																																																																		step,
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
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject prevNode, EObject useCase, EObject pstep,
			EObject sf1, EObject flow, EObject step, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PG2ParallelStepAfterPG";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String useCase__flow____flows_name_prime = "flows";
		String pstep__flow____invokedFlows_name_prime = "invokedFlows";
		String flow__step____steps_name_prime = "steps";
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
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		ruleresult.getTranslatedEdges().add(useCase__flow____flows);
		pstep__flow____invokedFlows.setSrc(pstep);
		pstep__flow____invokedFlows.setTrg(flow);
		ruleresult.getTranslatedEdges().add(pstep__flow____invokedFlows);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
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
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		pstep__flow____invokedFlows.setName(pstep__flow____invokedFlows_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		pcgwToStep__pcgw____source.setName(pcgwToStep__pcgw____source_name_prime);
		pcgwToStep__step____target.setName(pcgwToStep__step____target_name_prime);
		pgwToStep__pgw____source.setName(pgwToStep__pgw____source_name_prime);
		pgwToStep__step____target.setName(pgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, process, prevNode, useCase, pstep, sf1, flow, step, pgw, pcgwToStep,
				pgwToStep, pcgw, process__sf1____flowElements, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				useCase__flow____flows, pstep__flow____invokedFlows, flow__step____steps, process__pgw____flowElements,
				process__pcgw____flowElements, sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv,
				pcgwToStep__pcgw____source, pcgwToStep__step____target, pgwToStep__pgw____source,
				pgwToStep__step____target };
	}

	public static final void pattern_PG2ParallelStepAfterPG_11_5_expressionBBBBBBBBBBBBBBB(PG2ParallelStepAfterPG _this,
			PerformRuleResult ruleresult, EObject process, EObject prevNode, EObject useCase, EObject p2uc,
			EObject pstep, EObject pgw2ps, EObject sf1, EObject flow, EObject step, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_BWD(ruleresult, process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, step, pgw,
				pcgwToStep, pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_PG2ParallelStepAfterPG_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_12_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_12_1_blackFBB(EClass eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_12_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_12_1_binding = pattern_PG2ParallelStepAfterPG_12_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_12_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_12_1_black = pattern_PG2ParallelStepAfterPG_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "PG2ParallelStepAfterPG";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_12_2_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("useCase");
		EObject _localVariable_1 = match.getObject("pstep");
		EObject _localVariable_2 = match.getObject("flow");
		EObject _localVariable_3 = match.getObject("step");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpPstep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpPstep instanceof ParallelStep) {
				ParallelStep pstep = (ParallelStep) tmpPstep;
				if (tmpFlow instanceof ParallelFlow) {
					ParallelFlow flow = (ParallelFlow) tmpFlow;
					if (tmpStep instanceof ParallelStep) {
						ParallelStep step = (ParallelStep) tmpStep;
						return new Object[] { useCase, pstep, flow, step, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_12_2_blackFFBFBFBBB(UseCase useCase,
			ParallelStep pstep, ParallelFlow flow, ParallelStep step, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pstep.equals(step)) {
			for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(useCase, P2UC.class,
					"target")) {
				SimpleBPMN.Process process = p2uc.getSource();
				if (process != null) {
					for (GW2S pgw2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pstep,
							GW2S.class, "target")) {
						Gateway tmpPrevNode = pgw2ps.getSource();
						if (tmpPrevNode instanceof ParallelGateway) {
							ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								_result.add(new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, flow, step,
										match });
							}

						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_12_3_blackBBBBBBBB(SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ParallelFlow flow,
			ParallelStep step) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pstep.equals(step)) {
			if (process.getFlowElements().contains(prevNode)) {
				if (useCase.getFlows().contains(flow)) {
					if (process.equals(p2uc.getSource())) {
						if (useCase.equals(p2uc.getTarget())) {
							if (pstep.getInvokedFlows().contains(flow)) {
								if (prevNode.equals(pgw2ps.getSource())) {
									if (pstep.equals(pgw2ps.getTarget())) {
										if (flow.getSteps().contains(step)) {
											boolean prevNodeisDiverging = prevNode.isIsDiverging();
											if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
												_result.add(new Object[] { process, prevNode, useCase, p2uc, pstep,
														pgw2ps, flow, step });
											}

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

	public static final Object[] pattern_PG2ParallelStepAfterPG_12_3_greenBBBBBBBBFFFFFFFFF(SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ParallelFlow flow,
			ParallelStep step) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw2ps__pstep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__prevNode____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String pstep__flow____invokedFlows_name_prime = "invokedFlows";
		String pgw2ps__prevNode____source_name_prime = "source";
		String pgw2ps__pstep____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(pgw2ps);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(step);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		pstep__flow____invokedFlows.setSrc(pstep);
		pstep__flow____invokedFlows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(pstep__flow____invokedFlows);
		pgw2ps__prevNode____source.setSrc(pgw2ps);
		pgw2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pgw2ps__prevNode____source);
		pgw2ps__pstep____target.setSrc(pgw2ps);
		pgw2ps__pstep____target.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(pgw2ps__pstep____target);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		pstep__flow____invokedFlows.setName(pstep__flow____invokedFlows_name_prime);
		pgw2ps__prevNode____source.setName(pgw2ps__prevNode____source_name_prime);
		pgw2ps__pstep____target.setName(pgw2ps__pstep____target_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, flow, step, isApplicableMatch,
				process__prevNode____flowElements, useCase__flow____flows, p2uc__process____source,
				p2uc__useCase____target, pstep__flow____invokedFlows, pgw2ps__prevNode____source,
				pgw2ps__pstep____target, flow__step____steps };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_12_4_bindingFBBBBBBBBBB(PG2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, ParallelGateway prevNode, UseCase useCase,
			P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ParallelFlow flow, ParallelStep step) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, process, prevNode, useCase, p2uc,
				pstep, pgw2ps, flow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps, flow,
					step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_12_4_bindingAndBlackFBBBBBBBBBB(
			PG2ParallelStepAfterPG _this, IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ParallelFlow flow,
			ParallelStep step) {
		Object[] result_pattern_PG2ParallelStepAfterPG_12_4_binding = pattern_PG2ParallelStepAfterPG_12_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps, flow, step);
		if (result_pattern_PG2ParallelStepAfterPG_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepAfterPG_12_4_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_12_4_black = pattern_PG2ParallelStepAfterPG_12_4_blackB(csp);
			if (result_pattern_PG2ParallelStepAfterPG_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps,
						flow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_12_5_expressionFBB(PG2ParallelStepAfterPG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PG2ParallelStepAfterPG";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PG2ParallelStepAfterPG_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_20_1_binding = pattern_PG2ParallelStepAfterPG_20_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_20_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_20_1_black = pattern_PG2ParallelStepAfterPG_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_353503 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_353503)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_494177 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_494177)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_2_black_nac_2BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_446042 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_446042)) {
							if (!prevNode.equals(__DEC_pgw___conv_446042)) {
								if (!pcgw.equals(__DEC_pgw___conv_446042)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_2_black_nac_3BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_737416 = pcgw.get__conv();
					if (__DEC_pcgw___conv_737416 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_737416)) {
							if (!prevNode.equals(__DEC_pcgw___conv_737416)) {
								if (!pgw.equals(__DEC_pcgw___conv_737416)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_45375 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_45375)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_2_black_nac_5BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_742056 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_742056)) {
							if (!prevNode.equals(__DEC_pcgw___conv_742056)) {
								if (!pgw.equals(__DEC_pcgw___conv_742056)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_2_black_nac_6BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_2_black_nac_7BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_20_2_blackFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
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
																	if (pattern_PG2ParallelStepAfterPG_20_2_black_nac_0BB(
																			sf1, process) == null) {
																		if (pattern_PG2ParallelStepAfterPG_20_2_black_nac_1BB(
																				pgw, process) == null) {
																			if (pattern_PG2ParallelStepAfterPG_20_2_black_nac_6BB(
																					prevNode, pgw) == null) {
																				if (pattern_PG2ParallelStepAfterPG_20_2_black_nac_2BBB(
																						pgw, prevNode, pcgw) == null) {
																					if (pattern_PG2ParallelStepAfterPG_20_2_black_nac_3BBB(
																							pcgw, prevNode,
																							pgw) == null) {
																						if (pattern_PG2ParallelStepAfterPG_20_2_black_nac_4BB(
																								pcgw,
																								process) == null) {
																							if (pattern_PG2ParallelStepAfterPG_20_2_black_nac_5BBB(
																									pcgw, prevNode,
																									pgw) == null) {
																								if (pattern_PG2ParallelStepAfterPG_20_2_black_nac_7BB(
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_20_3_expressionFBBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_20_4_expressionFBB(PG2ParallelStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterPG_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_21_1_binding = pattern_PG2ParallelStepAfterPG_21_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_21_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_21_1_black = pattern_PG2ParallelStepAfterPG_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_734773 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_734773)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_987678 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_987678)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_2_black_nac_2BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_953600 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_953600)) {
							if (!prevNode.equals(__DEC_pgw___conv_953600)) {
								if (!pcgw.equals(__DEC_pgw___conv_953600)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_2_black_nac_3BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_328884 = pcgw.get__conv();
					if (__DEC_pcgw___conv_328884 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_328884)) {
							if (!prevNode.equals(__DEC_pcgw___conv_328884)) {
								if (!pgw.equals(__DEC_pcgw___conv_328884)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_658749 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_658749)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_2_black_nac_5BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_656797 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_656797)) {
							if (!prevNode.equals(__DEC_pcgw___conv_656797)) {
								if (!pgw.equals(__DEC_pcgw___conv_656797)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_2_black_nac_6BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_2_black_nac_7BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_21_2_blackFFFFFB(
			EMoflonEdge _edge_sourceRef) {
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
													if (pattern_PG2ParallelStepAfterPG_21_2_black_nac_6BB(prevNode,
															pgw) == null) {
														if (pattern_PG2ParallelStepAfterPG_21_2_black_nac_2BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_PG2ParallelStepAfterPG_21_2_black_nac_3BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_PG2ParallelStepAfterPG_21_2_black_nac_5BBB(
																		pcgw, prevNode, pgw) == null) {
																	if (pattern_PG2ParallelStepAfterPG_21_2_black_nac_7BB(
																			pcgw, prevNode) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(sf1,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(prevNode)) {
																				if (process.getFlowElements()
																						.contains(pgw)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (pattern_PG2ParallelStepAfterPG_21_2_black_nac_0BB(
																								sf1, process) == null) {
																							if (pattern_PG2ParallelStepAfterPG_21_2_black_nac_1BB(
																									pgw,
																									process) == null) {
																								if (pattern_PG2ParallelStepAfterPG_21_2_black_nac_4BB(
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_21_3_expressionFBBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_21_4_expressionFBB(PG2ParallelStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterPG_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_22_1_binding = pattern_PG2ParallelStepAfterPG_22_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_22_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_22_1_black = pattern_PG2ParallelStepAfterPG_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_646306 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_646306)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_402166 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_402166)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_2_black_nac_2BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_827033 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_827033)) {
							if (!prevNode.equals(__DEC_pgw___conv_827033)) {
								if (!pcgw.equals(__DEC_pgw___conv_827033)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_2_black_nac_3BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_814757 = pcgw.get__conv();
					if (__DEC_pcgw___conv_814757 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_814757)) {
							if (!prevNode.equals(__DEC_pcgw___conv_814757)) {
								if (!pgw.equals(__DEC_pcgw___conv_814757)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_901343 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_901343)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_2_black_nac_5BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_228012 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_228012)) {
							if (!prevNode.equals(__DEC_pcgw___conv_228012)) {
								if (!pgw.equals(__DEC_pcgw___conv_228012)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_2_black_nac_6BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_2_black_nac_7BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_22_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
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
													if (pattern_PG2ParallelStepAfterPG_22_2_black_nac_6BB(prevNode,
															pgw) == null) {
														if (pattern_PG2ParallelStepAfterPG_22_2_black_nac_2BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_PG2ParallelStepAfterPG_22_2_black_nac_3BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_PG2ParallelStepAfterPG_22_2_black_nac_5BBB(
																		pcgw, prevNode, pgw) == null) {
																	if (pattern_PG2ParallelStepAfterPG_22_2_black_nac_7BB(
																			pcgw, prevNode) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(prevNode,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(sf1)) {
																				if (process.getFlowElements()
																						.contains(pgw)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (pattern_PG2ParallelStepAfterPG_22_2_black_nac_0BB(
																								sf1, process) == null) {
																							if (pattern_PG2ParallelStepAfterPG_22_2_black_nac_1BB(
																									pgw,
																									process) == null) {
																								if (pattern_PG2ParallelStepAfterPG_22_2_black_nac_4BB(
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_22_3_expressionFBBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_22_4_expressionFBB(PG2ParallelStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterPG_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_23_1_binding = pattern_PG2ParallelStepAfterPG_23_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_23_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_23_1_black = pattern_PG2ParallelStepAfterPG_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_2_black_nac_0BBB(ParallelFlow flow,
			ParallelStep pstep, ParallelStep step) {
		if (!pstep.equals(step)) {
			for (ParallelStep __DEC_flow_invokedFlows_877758 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
				if (!pstep.equals(__DEC_flow_invokedFlows_877758)) {
					if (!step.equals(__DEC_flow_invokedFlows_877758)) {
						return new Object[] { flow, pstep, step };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_2_black_nac_1BB(ParallelFlow flow, UseCase useCase) {
		for (UseCase __DEC_flow_flows_55025 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow,
				UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_flow_flows_55025)) {
				return new Object[] { flow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_2_black_nac_2BB(ParallelStep step,
			ParallelFlow flow) {
		for (Flow __DEC_step_steps_122840 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_122840)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_2_black_nac_3BB(ParallelStep step,
			ParallelStep pstep) {
		if (!pstep.equals(step)) {
			for (Step __DEC_step_next_500141 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_500141)) {
					if (!pstep.equals(__DEC_step_next_500141)) {
						return new Object[] { step, pstep };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_2_black_nac_4BB(ParallelStep step,
			ParallelFlow flow) {
		if (step.getInvokedFlows().contains(flow)) {
			return new Object[] { step, flow };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_2_black_nac_5BB(ParallelStep pstep,
			ParallelStep step) {
		if (step.equals(pstep.getNext())) {
			return new Object[] { pstep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_23_2_blackFFFFB(EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpFlow = _edge_flows.getTrg();
			if (tmpFlow instanceof ParallelFlow) {
				ParallelFlow flow = (ParallelFlow) tmpFlow;
				if (useCase.getFlows().contains(flow)) {
					if (pattern_PG2ParallelStepAfterPG_23_2_black_nac_1BB(flow, useCase) == null) {
						for (Step tmpStep : flow.getSteps()) {
							if (tmpStep instanceof ParallelStep) {
								ParallelStep step = (ParallelStep) tmpStep;
								if (pattern_PG2ParallelStepAfterPG_23_2_black_nac_2BB(step, flow) == null) {
									if (pattern_PG2ParallelStepAfterPG_23_2_black_nac_4BB(step, flow) == null) {
										for (ParallelStep pstep : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
											if (!pstep.equals(step)) {
												if (pattern_PG2ParallelStepAfterPG_23_2_black_nac_0BBB(flow, pstep,
														step) == null) {
													if (pattern_PG2ParallelStepAfterPG_23_2_black_nac_3BB(step,
															pstep) == null) {
														if (pattern_PG2ParallelStepAfterPG_23_2_black_nac_5BB(pstep,
																step) == null) {
															_result.add(new Object[] { useCase, pstep, flow, step,
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_23_3_expressionFBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, UseCase useCase, ParallelStep pstep, ParallelFlow flow, ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, pstep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_23_4_expressionFBB(PG2ParallelStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_23_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterPG_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_24_1_binding = pattern_PG2ParallelStepAfterPG_24_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_24_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_24_1_black = pattern_PG2ParallelStepAfterPG_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_2_black_nac_0BBB(ParallelFlow flow,
			ParallelStep pstep, ParallelStep step) {
		if (!pstep.equals(step)) {
			for (ParallelStep __DEC_flow_invokedFlows_660277 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
				if (!pstep.equals(__DEC_flow_invokedFlows_660277)) {
					if (!step.equals(__DEC_flow_invokedFlows_660277)) {
						return new Object[] { flow, pstep, step };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_2_black_nac_1BB(ParallelFlow flow, UseCase useCase) {
		for (UseCase __DEC_flow_flows_114128 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow,
				UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_flow_flows_114128)) {
				return new Object[] { flow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_2_black_nac_2BB(ParallelStep step,
			ParallelFlow flow) {
		for (Flow __DEC_step_steps_182877 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_182877)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_2_black_nac_3BB(ParallelStep step,
			ParallelStep pstep) {
		if (!pstep.equals(step)) {
			for (Step __DEC_step_next_589547 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_589547)) {
					if (!pstep.equals(__DEC_step_next_589547)) {
						return new Object[] { step, pstep };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_2_black_nac_4BB(ParallelStep step,
			ParallelFlow flow) {
		if (step.getInvokedFlows().contains(flow)) {
			return new Object[] { step, flow };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_2_black_nac_5BB(ParallelStep pstep,
			ParallelStep step) {
		if (step.equals(pstep.getNext())) {
			return new Object[] { pstep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_24_2_blackFFFFB(
			EMoflonEdge _edge_invokedFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPstep = _edge_invokedFlows.getSrc();
		if (tmpPstep instanceof ParallelStep) {
			ParallelStep pstep = (ParallelStep) tmpPstep;
			EObject tmpFlow = _edge_invokedFlows.getTrg();
			if (tmpFlow instanceof ParallelFlow) {
				ParallelFlow flow = (ParallelFlow) tmpFlow;
				if (pstep.getInvokedFlows().contains(flow)) {
					for (Step tmpStep : flow.getSteps()) {
						if (tmpStep instanceof ParallelStep) {
							ParallelStep step = (ParallelStep) tmpStep;
							if (!pstep.equals(step)) {
								if (pattern_PG2ParallelStepAfterPG_24_2_black_nac_0BBB(flow, pstep, step) == null) {
									if (pattern_PG2ParallelStepAfterPG_24_2_black_nac_2BB(step, flow) == null) {
										if (pattern_PG2ParallelStepAfterPG_24_2_black_nac_3BB(step, pstep) == null) {
											if (pattern_PG2ParallelStepAfterPG_24_2_black_nac_4BB(step, flow) == null) {
												if (pattern_PG2ParallelStepAfterPG_24_2_black_nac_5BB(pstep,
														step) == null) {
													for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(flow, UseCase.class, "flows")) {
														if (pattern_PG2ParallelStepAfterPG_24_2_black_nac_1BB(flow,
																useCase) == null) {
															_result.add(new Object[] { useCase, pstep, flow, step,
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_24_3_expressionFBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, UseCase useCase, ParallelStep pstep, ParallelFlow flow, ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, pstep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_24_4_expressionFBB(PG2ParallelStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_24_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterPG_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_25_1_binding = pattern_PG2ParallelStepAfterPG_25_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_25_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_25_1_black = pattern_PG2ParallelStepAfterPG_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_2_black_nac_0BBB(ParallelFlow flow,
			ParallelStep pstep, ParallelStep step) {
		if (!pstep.equals(step)) {
			for (ParallelStep __DEC_flow_invokedFlows_274944 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
				if (!pstep.equals(__DEC_flow_invokedFlows_274944)) {
					if (!step.equals(__DEC_flow_invokedFlows_274944)) {
						return new Object[] { flow, pstep, step };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_2_black_nac_1BB(ParallelFlow flow, UseCase useCase) {
		for (UseCase __DEC_flow_flows_72027 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow,
				UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_flow_flows_72027)) {
				return new Object[] { flow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_2_black_nac_2BB(ParallelStep step,
			ParallelFlow flow) {
		for (Flow __DEC_step_steps_125812 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_125812)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_2_black_nac_3BB(ParallelStep step,
			ParallelStep pstep) {
		if (!pstep.equals(step)) {
			for (Step __DEC_step_next_753647 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_753647)) {
					if (!pstep.equals(__DEC_step_next_753647)) {
						return new Object[] { step, pstep };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_2_black_nac_4BB(ParallelStep step,
			ParallelFlow flow) {
		if (step.getInvokedFlows().contains(flow)) {
			return new Object[] { step, flow };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_2_black_nac_5BB(ParallelStep pstep,
			ParallelStep step) {
		if (step.equals(pstep.getNext())) {
			return new Object[] { pstep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_25_2_blackFFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof ParallelFlow) {
			ParallelFlow flow = (ParallelFlow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_PG2ParallelStepAfterPG_25_2_black_nac_2BB(step, flow) == null) {
						if (pattern_PG2ParallelStepAfterPG_25_2_black_nac_4BB(step, flow) == null) {
							for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(flow, UseCase.class, "flows")) {
								if (pattern_PG2ParallelStepAfterPG_25_2_black_nac_1BB(flow, useCase) == null) {
									for (ParallelStep pstep : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
										if (!pstep.equals(step)) {
											if (pattern_PG2ParallelStepAfterPG_25_2_black_nac_0BBB(flow, pstep,
													step) == null) {
												if (pattern_PG2ParallelStepAfterPG_25_2_black_nac_3BB(step,
														pstep) == null) {
													if (pattern_PG2ParallelStepAfterPG_25_2_black_nac_5BB(pstep,
															step) == null) {
														_result.add(new Object[] { useCase, pstep, flow, step,
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_25_3_expressionFBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, UseCase useCase, ParallelStep pstep, ParallelFlow flow, ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, pstep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_25_4_expressionFBB(PG2ParallelStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_25_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterPG_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_26_1_binding = pattern_PG2ParallelStepAfterPG_26_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_26_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_26_1_black = pattern_PG2ParallelStepAfterPG_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_150727 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_150727)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_383100 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_383100)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_2_black_nac_2BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_415942 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_415942)) {
							if (!prevNode.equals(__DEC_pgw___conv_415942)) {
								if (!pcgw.equals(__DEC_pgw___conv_415942)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_2_black_nac_3BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_355983 = pcgw.get__conv();
					if (__DEC_pcgw___conv_355983 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_355983)) {
							if (!prevNode.equals(__DEC_pcgw___conv_355983)) {
								if (!pgw.equals(__DEC_pcgw___conv_355983)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_224655 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_224655)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_2_black_nac_5BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_285358 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_285358)) {
							if (!prevNode.equals(__DEC_pcgw___conv_285358)) {
								if (!pgw.equals(__DEC_pcgw___conv_285358)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_2_black_nac_6BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_2_black_nac_7BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_26_2_blackFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
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
										if (pattern_PG2ParallelStepAfterPG_26_2_black_nac_1BB(pgw, process) == null) {
											if (pattern_PG2ParallelStepAfterPG_26_2_black_nac_4BB(pcgw,
													process) == null) {
												for (FlowElement tmpPrevNode : process.getFlowElements()) {
													if (tmpPrevNode instanceof ParallelGateway) {
														ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
														if (!pgw.equals(prevNode)) {
															if (!pcgw.equals(prevNode)) {
																boolean prevNodeisDiverging = prevNode.isIsDiverging();
																if (Boolean.valueOf(prevNodeisDiverging)
																		.equals(Boolean.valueOf(true))) {
																	if (pattern_PG2ParallelStepAfterPG_26_2_black_nac_2BBB(
																			pgw, prevNode, pcgw) == null) {
																		if (pattern_PG2ParallelStepAfterPG_26_2_black_nac_3BBB(
																				pcgw, prevNode, pgw) == null) {
																			if (pattern_PG2ParallelStepAfterPG_26_2_black_nac_5BBB(
																					pcgw, prevNode, pgw) == null) {
																				if (pattern_PG2ParallelStepAfterPG_26_2_black_nac_6BB(
																						prevNode, pgw) == null) {
																					if (pattern_PG2ParallelStepAfterPG_26_2_black_nac_7BB(
																							pcgw, prevNode) == null) {
																						for (FlowElement tmpSf1 : process
																								.getFlowElements()) {
																							if (tmpSf1 instanceof SequenceFlow) {
																								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																								if (prevNode.equals(sf1
																										.getSourceRef())) {
																									if (pgw.equals(sf1
																											.getTargetRef())) {
																										if (pattern_PG2ParallelStepAfterPG_26_2_black_nac_0BB(
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_26_3_expressionFBBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_26_4_expressionFBB(PG2ParallelStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_26_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterPG_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_27_1_binding = pattern_PG2ParallelStepAfterPG_27_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_27_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_27_1_black = pattern_PG2ParallelStepAfterPG_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_183631 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_183631)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_960988 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_960988)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_2_black_nac_2BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_202128 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_202128)) {
							if (!prevNode.equals(__DEC_pgw___conv_202128)) {
								if (!pcgw.equals(__DEC_pgw___conv_202128)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_2_black_nac_3BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_714633 = pcgw.get__conv();
					if (__DEC_pcgw___conv_714633 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_714633)) {
							if (!prevNode.equals(__DEC_pcgw___conv_714633)) {
								if (!pgw.equals(__DEC_pcgw___conv_714633)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_230643 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_230643)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_2_black_nac_5BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_763106 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_763106)) {
							if (!prevNode.equals(__DEC_pcgw___conv_763106)) {
								if (!pgw.equals(__DEC_pcgw___conv_763106)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_2_black_nac_6BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_2_black_nac_7BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_27_2_blackFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpPcgw = _edge_flowElements.getTrg();
			if (tmpPcgw instanceof ParallelGateway) {
				ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
				if (process.getFlowElements().contains(pcgw)) {
					boolean pcgwisDiverging = pcgw.isIsDiverging();
					if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
						if (pattern_PG2ParallelStepAfterPG_27_2_black_nac_4BB(pcgw, process) == null) {
							for (FlowElement tmpPrevNode : process.getFlowElements()) {
								if (tmpPrevNode instanceof ParallelGateway) {
									ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
									if (!pcgw.equals(prevNode)) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											if (pattern_PG2ParallelStepAfterPG_27_2_black_nac_7BB(pcgw,
													prevNode) == null) {
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
																					if (pattern_PG2ParallelStepAfterPG_27_2_black_nac_0BB(
																							sf1, process) == null) {
																						if (pattern_PG2ParallelStepAfterPG_27_2_black_nac_1BB(
																								pgw, process) == null) {
																							if (pattern_PG2ParallelStepAfterPG_27_2_black_nac_2BBB(
																									pgw, prevNode,
																									pcgw) == null) {
																								if (pattern_PG2ParallelStepAfterPG_27_2_black_nac_3BBB(
																										pcgw, prevNode,
																										pgw) == null) {
																									if (pattern_PG2ParallelStepAfterPG_27_2_black_nac_5BBB(
																											pcgw,
																											prevNode,
																											pgw) == null) {
																										if (pattern_PG2ParallelStepAfterPG_27_2_black_nac_6BB(
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_27_3_expressionFBBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_27_4_expressionFBB(PG2ParallelStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_27_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterPG_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_28_1_binding = pattern_PG2ParallelStepAfterPG_28_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_28_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_28_1_black = pattern_PG2ParallelStepAfterPG_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_823414 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_823414)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_710838 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_710838)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_2_black_nac_2BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_392406 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_392406)) {
							if (!prevNode.equals(__DEC_pgw___conv_392406)) {
								if (!pcgw.equals(__DEC_pgw___conv_392406)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_2_black_nac_3BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_185466 = pcgw.get__conv();
					if (__DEC_pcgw___conv_185466 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_185466)) {
							if (!prevNode.equals(__DEC_pcgw___conv_185466)) {
								if (!pgw.equals(__DEC_pcgw___conv_185466)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_39201 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_39201)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_2_black_nac_5BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_444981 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_444981)) {
							if (!prevNode.equals(__DEC_pcgw___conv_444981)) {
								if (!pgw.equals(__DEC_pcgw___conv_444981)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_2_black_nac_6BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_2_black_nac_7BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_28_2_blackFFFFFB(
			EMoflonEdge _edge_targetRef) {
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
													if (pattern_PG2ParallelStepAfterPG_28_2_black_nac_6BB(prevNode,
															pgw) == null) {
														if (pattern_PG2ParallelStepAfterPG_28_2_black_nac_2BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_PG2ParallelStepAfterPG_28_2_black_nac_3BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_PG2ParallelStepAfterPG_28_2_black_nac_5BBB(
																		pcgw, prevNode, pgw) == null) {
																	if (pattern_PG2ParallelStepAfterPG_28_2_black_nac_7BB(
																			pcgw, prevNode) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(sf1,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(prevNode)) {
																				if (process.getFlowElements()
																						.contains(pgw)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (pattern_PG2ParallelStepAfterPG_28_2_black_nac_0BB(
																								sf1, process) == null) {
																							if (pattern_PG2ParallelStepAfterPG_28_2_black_nac_1BB(
																									pgw,
																									process) == null) {
																								if (pattern_PG2ParallelStepAfterPG_28_2_black_nac_4BB(
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_28_3_expressionFBBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_28_4_expressionFBB(PG2ParallelStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_28_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterPG_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_29_1_binding = pattern_PG2ParallelStepAfterPG_29_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_29_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_29_1_black = pattern_PG2ParallelStepAfterPG_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_223029 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_223029)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_640604 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_640604)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_2_black_nac_2BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_6847 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_6847)) {
							if (!prevNode.equals(__DEC_pgw___conv_6847)) {
								if (!pcgw.equals(__DEC_pgw___conv_6847)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_2_black_nac_3BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_418483 = pcgw.get__conv();
					if (__DEC_pcgw___conv_418483 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_418483)) {
							if (!prevNode.equals(__DEC_pcgw___conv_418483)) {
								if (!pgw.equals(__DEC_pcgw___conv_418483)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_868342 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_868342)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_2_black_nac_5BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_384148 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_384148)) {
							if (!prevNode.equals(__DEC_pcgw___conv_384148)) {
								if (!pgw.equals(__DEC_pcgw___conv_384148)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_2_black_nac_6BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_2_black_nac_7BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_29_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
													if (pattern_PG2ParallelStepAfterPG_29_2_black_nac_2BBB(pgw,
															prevNode, pcgw) == null) {
														if (pattern_PG2ParallelStepAfterPG_29_2_black_nac_3BBB(pcgw,
																prevNode, pgw) == null) {
															if (pattern_PG2ParallelStepAfterPG_29_2_black_nac_5BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_PG2ParallelStepAfterPG_29_2_black_nac_6BB(
																		prevNode, pgw) == null) {
																	if (pattern_PG2ParallelStepAfterPG_29_2_black_nac_7BB(
																			pcgw, prevNode) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(pgw,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(prevNode)) {
																				if (process.getFlowElements()
																						.contains(sf1)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (pattern_PG2ParallelStepAfterPG_29_2_black_nac_0BB(
																								sf1, process) == null) {
																							if (pattern_PG2ParallelStepAfterPG_29_2_black_nac_1BB(
																									pgw,
																									process) == null) {
																								if (pattern_PG2ParallelStepAfterPG_29_2_black_nac_4BB(
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_29_3_expressionFBBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_29_4_expressionFBB(PG2ParallelStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_29_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterPG_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_1_bindingFB(PG2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_1_bindingAndBlackFFB(PG2ParallelStepAfterPG _this) {
		Object[] result_pattern_PG2ParallelStepAfterPG_30_1_binding = pattern_PG2ParallelStepAfterPG_30_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterPG_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterPG_30_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_30_1_black = pattern_PG2ParallelStepAfterPG_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterPG_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterPG_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_859027 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_859027)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_90449 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_90449)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_2_black_nac_2BBB(ParallelGateway pgw,
			ParallelGateway prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_422905 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_422905)) {
							if (!prevNode.equals(__DEC_pgw___conv_422905)) {
								if (!pcgw.equals(__DEC_pgw___conv_422905)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_2_black_nac_3BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_112148 = pcgw.get__conv();
					if (__DEC_pcgw___conv_112148 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_112148)) {
							if (!prevNode.equals(__DEC_pcgw___conv_112148)) {
								if (!pgw.equals(__DEC_pcgw___conv_112148)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_267748 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_267748)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_2_black_nac_5BBB(ParallelGateway pcgw,
			ParallelGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_173880 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_173880)) {
							if (!prevNode.equals(__DEC_pcgw___conv_173880)) {
								if (!pgw.equals(__DEC_pcgw___conv_173880)) {
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_2_black_nac_6BB(ParallelGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_2_black_nac_7BB(ParallelGateway pcgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_30_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
													if (pattern_PG2ParallelStepAfterPG_30_2_black_nac_2BBB(pgw,
															prevNode, pcgw) == null) {
														if (pattern_PG2ParallelStepAfterPG_30_2_black_nac_3BBB(pcgw,
																prevNode, pgw) == null) {
															if (pattern_PG2ParallelStepAfterPG_30_2_black_nac_5BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_PG2ParallelStepAfterPG_30_2_black_nac_6BB(
																		prevNode, pgw) == null) {
																	if (pattern_PG2ParallelStepAfterPG_30_2_black_nac_7BB(
																			pcgw, prevNode) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(pgw,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(prevNode)) {
																				if (process.getFlowElements()
																						.contains(sf1)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (pattern_PG2ParallelStepAfterPG_30_2_black_nac_0BB(
																								sf1, process) == null) {
																							if (pattern_PG2ParallelStepAfterPG_30_2_black_nac_1BB(
																									pgw,
																									process) == null) {
																								if (pattern_PG2ParallelStepAfterPG_30_2_black_nac_4BB(
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterPG_30_3_expressionFBBBBBBB(PG2ParallelStepAfterPG _this,
			Match match, SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_30_4_expressionFBB(PG2ParallelStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_30_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterPG_30_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_33_1_blackB(PG2ParallelStepAfterPG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_33_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_33_2_bindingFFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("process");
		EObject _localVariable_1 = sourceMatch.getObject("prevNode");
		EObject _localVariable_2 = targetMatch.getObject("useCase");
		EObject _localVariable_3 = targetMatch.getObject("pstep");
		EObject _localVariable_4 = sourceMatch.getObject("sf1");
		EObject _localVariable_5 = targetMatch.getObject("flow");
		EObject _localVariable_6 = targetMatch.getObject("step");
		EObject _localVariable_7 = sourceMatch.getObject("pgw");
		EObject _localVariable_8 = sourceMatch.getObject("pcgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpPstep = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpStep = _localVariable_6;
		EObject tmpPgw = _localVariable_7;
		EObject tmpPcgw = _localVariable_8;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpPstep instanceof ParallelStep) {
						ParallelStep pstep = (ParallelStep) tmpPstep;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpFlow instanceof ParallelFlow) {
								ParallelFlow flow = (ParallelFlow) tmpFlow;
								if (tmpStep instanceof ParallelStep) {
									ParallelStep step = (ParallelStep) tmpStep;
									if (tmpPgw instanceof ParallelGateway) {
										ParallelGateway pgw = (ParallelGateway) tmpPgw;
										if (tmpPcgw instanceof ParallelGateway) {
											ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
											return new Object[] { process, prevNode, useCase, pstep, sf1, flow, step,
													pgw, pcgw, sourceMatch, targetMatch };
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_33_2_blackBBBFBFBBBBBBB(
			SimpleBPMN.Process process, ParallelGateway prevNode, UseCase useCase, ParallelStep pstep, SequenceFlow sf1,
			ParallelFlow flow, ParallelStep step, ParallelGateway pgw, ParallelGateway pcgw, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pstep.equals(step)) {
			if (!pgw.equals(prevNode)) {
				if (!pcgw.equals(prevNode)) {
					if (!pcgw.equals(pgw)) {
						if (!sourceMatch.equals(targetMatch)) {
							if (process.getFlowElements().contains(prevNode)) {
								if (process.getFlowElements().contains(sf1)) {
									if (prevNode.equals(sf1.getSourceRef())) {
										if (useCase.getFlows().contains(flow)) {
											if (pstep.getInvokedFlows().contains(flow)) {
												if (flow.getSteps().contains(step)) {
													if (process.getFlowElements().contains(pgw)) {
														if (process.getFlowElements().contains(pcgw)) {
															if (pgw.equals(sf1.getTargetRef())) {
																if (pcgw.equals(pgw.get__conv())) {
																	boolean prevNodeisDiverging = prevNode
																			.isIsDiverging();
																	if (Boolean.valueOf(prevNodeisDiverging)
																			.equals(Boolean.valueOf(true))) {
																		boolean pgwisDiverging = pgw.isIsDiverging();
																		if (Boolean.valueOf(pgwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			boolean pcgwisDiverging = pcgw
																					.isIsDiverging();
																			if (Boolean.valueOf(pcgwisDiverging)
																					.equals(false)) {
																				for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(
																								process, P2UC.class,
																								"source")) {
																					if (useCase
																							.equals(p2uc.getTarget())) {
																						for (GW2S pgw2ps : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										prevNode,
																										GW2S.class,
																										"source")) {
																							if (pstep.equals(pgw2ps
																									.getTarget())) {
																								_result.add(
																										new Object[] {
																												process,
																												prevNode,
																												useCase,
																												p2uc,
																												pstep,
																												pgw2ps,
																												sf1,
																												flow,
																												step,
																												pgw,
																												pcgw,
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
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_33_2_greenBBBBBBBBBBBBBF(SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1,
			ParallelFlow flow, ParallelStep step, ParallelGateway pgw, ParallelGateway pcgw, Match sourceMatch,
			Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "PG2ParallelStepAfterPG";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(pcgw);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(pgw2ps);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, step, pgw, pcgw, sourceMatch,
				targetMatch, isApplicableMatch };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_33_3_bindingFBBBBBBBBBBBBBBB(
			PG2ParallelStepAfterPG _this, IsApplicableMatchCC isApplicableMatch, SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1,
			ParallelFlow flow, ParallelStep step, ParallelGateway pgw, ParallelGateway pcgw, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, process, prevNode, useCase, p2uc,
				pstep, pgw2ps, sf1, flow, step, pgw, pcgw, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1,
					flow, step, pgw, pcgw, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_33_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_33_3_bindingAndBlackFBBBBBBBBBBBBBBB(
			PG2ParallelStepAfterPG _this, IsApplicableMatchCC isApplicableMatch, SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1,
			ParallelFlow flow, ParallelStep step, ParallelGateway pgw, ParallelGateway pcgw, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_PG2ParallelStepAfterPG_33_3_binding = pattern_PG2ParallelStepAfterPG_33_3_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, step, pgw, pcgw,
				sourceMatch, targetMatch);
		if (result_pattern_PG2ParallelStepAfterPG_33_3_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepAfterPG_33_3_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_33_3_black = pattern_PG2ParallelStepAfterPG_33_3_blackB(csp);
			if (result_pattern_PG2ParallelStepAfterPG_33_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps,
						sf1, flow, step, pgw, pcgw, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_33_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_33_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PG2ParallelStepAfterPG";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PG2ParallelStepAfterPG_33_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_36_1_blackB(PG2ParallelStepAfterPG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_36_2_bindingFFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_3 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_4 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_5 = isApplicableMatch.getObject("pgw2ps");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("step");
		EObject _localVariable_9 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_10 = isApplicableMatch.getObject("pcgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpP2uc = _localVariable_3;
		EObject tmpPstep = _localVariable_4;
		EObject tmpPgw2ps = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpStep = _localVariable_8;
		EObject tmpPgw = _localVariable_9;
		EObject tmpPcgw = _localVariable_10;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
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
									if (tmpFlow instanceof ParallelFlow) {
										ParallelFlow flow = (ParallelFlow) tmpFlow;
										if (tmpStep instanceof ParallelStep) {
											ParallelStep step = (ParallelStep) tmpStep;
											if (tmpPgw instanceof ParallelGateway) {
												ParallelGateway pgw = (ParallelGateway) tmpPgw;
												if (tmpPcgw instanceof ParallelGateway) {
													ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
													return new Object[] { process, prevNode, useCase, p2uc, pstep,
															pgw2ps, sf1, flow, step, pgw, pcgw, isApplicableMatch };
												}
											}
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_36_2_blackBBBBBBBBBBBB(SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, SequenceFlow sf1,
			ParallelFlow flow, ParallelStep step, ParallelGateway pgw, ParallelGateway pcgw,
			IsApplicableMatchCC isApplicableMatch) {
		if (!pstep.equals(step)) {
			if (!pgw.equals(prevNode)) {
				if (!pcgw.equals(prevNode)) {
					if (!pcgw.equals(pgw)) {
						if (process.getFlowElements().contains(prevNode)) {
							if (process.getFlowElements().contains(sf1)) {
								if (prevNode.equals(sf1.getSourceRef())) {
									if (useCase.getFlows().contains(flow)) {
										if (process.equals(p2uc.getSource())) {
											if (useCase.equals(p2uc.getTarget())) {
												if (pstep.getInvokedFlows().contains(flow)) {
													if (prevNode.equals(pgw2ps.getSource())) {
														if (pstep.equals(pgw2ps.getTarget())) {
															if (flow.getSteps().contains(step)) {
																if (process.getFlowElements().contains(pgw)) {
																	if (process.getFlowElements().contains(pcgw)) {
																		if (pgw.equals(sf1.getTargetRef())) {
																			if (pcgw.equals(pgw.get__conv())) {
																				boolean prevNodeisDiverging = prevNode
																						.isIsDiverging();
																				if (Boolean.valueOf(prevNodeisDiverging)
																						.equals(Boolean
																								.valueOf(true))) {
																					boolean pgwisDiverging = pgw
																							.isIsDiverging();
																					if (Boolean.valueOf(pgwisDiverging)
																							.equals(Boolean
																									.valueOf(true))) {
																						boolean pcgwisDiverging = pcgw
																								.isIsDiverging();
																						if (Boolean
																								.valueOf(
																										pcgwisDiverging)
																								.equals(false)) {
																							return new Object[] {
																									process, prevNode,
																									useCase, p2uc,
																									pstep, pgw2ps, sf1,
																									flow, step, pgw,
																									pcgw,
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
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_36_2_bindingAndBlackFFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_PG2ParallelStepAfterPG_36_2_binding = pattern_PG2ParallelStepAfterPG_36_2_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_PG2ParallelStepAfterPG_36_2_binding != null) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_PG2ParallelStepAfterPG_36_2_binding[0];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_PG2ParallelStepAfterPG_36_2_binding[1];
			UseCase useCase = (UseCase) result_pattern_PG2ParallelStepAfterPG_36_2_binding[2];
			P2UC p2uc = (P2UC) result_pattern_PG2ParallelStepAfterPG_36_2_binding[3];
			ParallelStep pstep = (ParallelStep) result_pattern_PG2ParallelStepAfterPG_36_2_binding[4];
			GW2S pgw2ps = (GW2S) result_pattern_PG2ParallelStepAfterPG_36_2_binding[5];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_PG2ParallelStepAfterPG_36_2_binding[6];
			ParallelFlow flow = (ParallelFlow) result_pattern_PG2ParallelStepAfterPG_36_2_binding[7];
			ParallelStep step = (ParallelStep) result_pattern_PG2ParallelStepAfterPG_36_2_binding[8];
			ParallelGateway pgw = (ParallelGateway) result_pattern_PG2ParallelStepAfterPG_36_2_binding[9];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_PG2ParallelStepAfterPG_36_2_binding[10];

			Object[] result_pattern_PG2ParallelStepAfterPG_36_2_black = pattern_PG2ParallelStepAfterPG_36_2_blackBBBBBBBBBBBB(
					process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, step, pgw, pcgw, isApplicableMatch);
			if (result_pattern_PG2ParallelStepAfterPG_36_2_black != null) {

				return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, sf1, flow, step, pgw, pcgw,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_36_2_greenBBBFFF(ParallelStep step, ParallelGateway pgw,
			ParallelGateway pcgw) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		FN2S pcgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		result.getCreatedElements().add(pcgwToStep);
		pcgwToStep.setSource(pcgw);
		pcgwToStep.setTarget(step);
		result.getCreatedElements().add(pgwToStep);
		pgwToStep.setSource(pgw);
		pgwToStep.setTarget(step);
		return new Object[] { step, pgw, pcgw, result, pcgwToStep, pgwToStep };
	}

	public static final PerformRuleResult pattern_PG2ParallelStepAfterPG_36_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_1_blackB(PG2ParallelStepAfterPG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_2_black_nac_0BB(ModelgeneratorRuleResult ruleResult,
			SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_2_black_nac_1BB(ModelgeneratorRuleResult ruleResult,
			ParallelGateway prevNode) {
		if (ruleResult.getSourceObjects().contains(prevNode)) {
			return new Object[] { ruleResult, prevNode };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_2_black_nac_2BB(ModelgeneratorRuleResult ruleResult,
			GW2S pgw2ps) {
		if (ruleResult.getCorrObjects().contains(pgw2ps)) {
			return new Object[] { ruleResult, pgw2ps };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_2_black_nac_3BB(ModelgeneratorRuleResult ruleResult,
			ParallelStep pstep) {
		if (ruleResult.getTargetObjects().contains(pstep)) {
			return new Object[] { ruleResult, pstep };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_2_black_nac_4BB(ModelgeneratorRuleResult ruleResult,
			P2UC p2uc) {
		if (ruleResult.getCorrObjects().contains(p2uc)) {
			return new Object[] { ruleResult, p2uc };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_2_black_nac_5BB(ModelgeneratorRuleResult ruleResult,
			UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterPG_37_2_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList pgw2psList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpPgw2ps : pgw2psList.getEntryObjects()) {
				if (tmpPgw2ps instanceof GW2S) {
					GW2S pgw2ps = (GW2S) tmpPgw2ps;
					Gateway tmpPrevNode = pgw2ps.getSource();
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						Step tmpPstep = pgw2ps.getTarget();
						if (tmpPstep instanceof ParallelStep) {
							ParallelStep pstep = (ParallelStep) tmpPstep;
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								if (pattern_PG2ParallelStepAfterPG_37_2_black_nac_2BB(ruleResult, pgw2ps) == null) {
									if (pattern_PG2ParallelStepAfterPG_37_2_black_nac_1BB(ruleResult,
											prevNode) == null) {
										if (pattern_PG2ParallelStepAfterPG_37_2_black_nac_3BB(ruleResult,
												pstep) == null) {
											for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
															"flowElements")) {
												if (pattern_PG2ParallelStepAfterPG_37_2_black_nac_0BB(ruleResult,
														process) == null) {
													for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(process, P2UC.class, "source")) {
														UseCase useCase = p2uc.getTarget();
														if (useCase != null) {
															if (pattern_PG2ParallelStepAfterPG_37_2_black_nac_4BB(
																	ruleResult, p2uc) == null) {
																if (pattern_PG2ParallelStepAfterPG_37_2_black_nac_5BB(
																		ruleResult, useCase) == null) {
																	_result.add(new Object[] { pgw2psList, process,
																			prevNode, pgw2ps, pstep, p2uc, useCase,
																			ruleEntryContainer, ruleResult });
																}
															}
														}

													}
												}
											}
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

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_3_bindingFBBBBBBBBB(PG2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, ParallelGateway prevNode, UseCase useCase,
			P2UC p2uc, ParallelStep pstep, GW2S pgw2ps, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, process, prevNode, useCase, p2uc,
				pstep, pgw2ps, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_3_bindingAndBlackFBBBBBBBBB(
			PG2ParallelStepAfterPG _this, IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_PG2ParallelStepAfterPG_37_3_binding = pattern_PG2ParallelStepAfterPG_37_3_bindingFBBBBBBBBB(
				_this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps, ruleResult);
		if (result_pattern_PG2ParallelStepAfterPG_37_3_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepAfterPG_37_3_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterPG_37_3_black = pattern_PG2ParallelStepAfterPG_37_3_blackB(csp);
			if (result_pattern_PG2ParallelStepAfterPG_37_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, prevNode, useCase, p2uc, pstep, pgw2ps,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepAfterPG_37_4_expressionFBB(PG2ParallelStepAfterPG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_5_blackBBBBBB(SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps) {
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
			return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps };
		}

		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_6_blackBBBBBBB(SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, P2UC p2uc, ParallelStep pstep, GW2S pgw2ps,
			ModelgeneratorRuleResult ruleResult) {
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
			return new Object[] { process, prevNode, useCase, p2uc, pstep, pgw2ps, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterPG_37_6_greenBBBBFFFFFFFBB(SimpleBPMN.Process process,
			ParallelGateway prevNode, UseCase useCase, ParallelStep pstep, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		ParallelFlow flow = SimpleUseCaseFactory.eINSTANCE.createParallelFlow();
		ParallelStep step = SimpleUseCaseFactory.eINSTANCE.createParallelStep();
		ParallelGateway pgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		FN2S pcgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		ParallelGateway pcgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		Object _localVariable_0 = csp.getValue("sf1", "id");
		Object _localVariable_1 = csp.getValue("flow", "id");
		Object _localVariable_2 = csp.getValue("step", "id");
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_3 = csp.getValue("pgw", "id");
		boolean pcgw_isDiverging_prime = false;
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(sf1);
		sf1.setSourceRef(prevNode);
		ruleResult.getSourceObjects().add(sf1);
		useCase.getFlows().add(flow);
		pstep.getInvokedFlows().add(flow);
		ruleResult.getTargetObjects().add(flow);
		flow.getSteps().add(step);
		ruleResult.getTargetObjects().add(step);
		process.getFlowElements().add(pgw);
		sf1.setTargetRef(pgw);
		ruleResult.getSourceObjects().add(pgw);
		pcgwToStep.setTarget(step);
		ruleResult.getCorrObjects().add(pcgwToStep);
		pgwToStep.setSource(pgw);
		pgwToStep.setTarget(step);
		ruleResult.getCorrObjects().add(pgwToStep);
		process.getFlowElements().add(pcgw);
		pgw.set__conv(pcgw);
		pcgwToStep.setSource(pcgw);
		ruleResult.getSourceObjects().add(pcgw);
		String sf1_id_prime = (String) _localVariable_0;
		String flow_id_prime = (String) _localVariable_1;
		String step_id_prime = (String) _localVariable_2;
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		String pgw_id_prime = (String) _localVariable_3;
		pcgw.setIsDiverging(Boolean.valueOf(pcgw_isDiverging_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		sf1.setId(sf1_id_prime);
		flow.setId(flow_id_prime);
		step.setId(step_id_prime);
		pgw.setId(pgw_id_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, prevNode, useCase, pstep, sf1, flow, step, pgw, pcgwToStep, pgwToStep, pcgw,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_PG2ParallelStepAfterPG_37_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PG2ParallelStepAfterPGImpl
