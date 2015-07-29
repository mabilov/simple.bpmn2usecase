/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.FN2S;
import Bpmn2UseCase.GW2S;
import Bpmn2UseCase.P2UC;

import Bpmn2UseCase.Rules.PG2ParallelStepAfterEG;
import Bpmn2UseCase.Rules.RulesPackage;

import SimpleBPMN.ExclusiveGateway;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.AlternativeFlow;
import SimpleUseCase.ChoiceStep;
import SimpleUseCase.Flow;
import SimpleUseCase.ParallelStep;
import SimpleUseCase.SimpleUseCaseFactory;
import SimpleUseCase.Step;
import SimpleUseCase.StepAlternative;
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
 * An implementation of the model object '<em><b>PG2 Parallel Step After EG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PG2ParallelStepAfterEGImpl extends AbstractRuleImpl implements PG2ParallelStepAfterEG {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PG2ParallelStepAfterEGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPG2ParallelStepAfterEG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		// initial bindings
		Object[] result1_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_0_1_blackBBBBBBB(this, match,
				process, prevNode, sf1, pgw, pcgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[process] = " + process + ", " + "[prevNode] = " + prevNode
							+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_0_2_bindingAndBlackFBBBBBBB(this, match, process, prevNode, sf1, pgw,
						pcgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[prevNode] = "
					+ prevNode + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_0_4_blackBBBBBB(match,
					process, prevNode, sf1, pgw, pcgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", "
						+ "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
						+ "[pcgw] = " + pcgw + ".");
			}
			PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_0_4_greenBBBBBBFFFFFFFF(match, process, prevNode,
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
			Object[] result5_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_0_5_blackBBBBBB(match,
					process, prevNode, sf1, pgw, pcgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[process] = " + process + ", " + "[prevNode] = " + prevNode + ", "
								+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
			}
			PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_0_5_greenBBBF(match, process, prevNode);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_0_6_expressionBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw);
			return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_0_7_expressionF();
		} else {
			return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_1_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[4];
		ChoiceStep cStep = (ChoiceStep) result1_bindingAndBlack[5];
		GW2S eg2cs = (GW2S) result1_bindingAndBlack[6];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[7];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[8];
		ParallelGateway pcgw = (ParallelGateway) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_1_1_greenFBBFFBFFBB(useCase,
				cStep, pgw, pcgw, csp);
		StepAlternative alt = (StepAlternative) result1_green[0];
		AlternativeFlow altFlow = (AlternativeFlow) result1_green[3];
		ParallelStep step = (ParallelStep) result1_green[4];
		FN2S pcgwToStep = (FN2S) result1_green[6];
		GW2S pgwToStep = (GW2S) result1_green[7];

		// collect translated elements
		Object[] result2_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_1_2_blackBBBBBBBB(alt, sf1,
				altFlow, step, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[alt] = " + alt + ", " + "[sf1] = " + sf1 + ", " + "[altFlow] = " + altFlow + ", " + "[step] = "
					+ step + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = "
					+ pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_1_2_greenFBBBBBBBB(alt, sf1,
				altFlow, step, pgw, pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_1_3_blackBBBBBBBBBBBBBBBB(
				ruleresult, alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, altFlow, step, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[alt] = " + alt + ", " + "[process] = " + process + ", "
					+ "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[flow] = " + flow + ", "
					+ "[prevNode] = " + prevNode + ", " + "[cStep] = " + cStep + ", " + "[eg2cs] = " + eg2cs + ", "
					+ "[sf1] = " + sf1 + ", " + "[altFlow] = " + altFlow + ", " + "[step] = " + step + ", " + "[pgw] = "
					+ pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", "
					+ "[pcgw] = " + pcgw + ".");
		}
		PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_1_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult,
				alt, process, useCase, prevNode, cStep, sf1, altFlow, step, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[17];
				// EMoflonEdge cStep__alt____stepAlternatives = (EMoflonEdge) result3_green[18];
				// EMoflonEdge altFlow__step____steps = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[22];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[24];
				// EMoflonEdge pcgwToStep__pcgw____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge pcgwToStep__step____target = (EMoflonEdge) result3_green[26];
				// EMoflonEdge pgwToStep__pgw____source = (EMoflonEdge) result3_green[27];
				// EMoflonEdge pgwToStep__step____target = (EMoflonEdge) result3_green[28];

		// perform postprocessing story node is empty
		// register objects
		PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_1_5_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, alt,
				process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, altFlow, step, pgw, pcgwToStep, pgwToStep,
				pcgw);
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[0];
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ParallelGateway pgw = (ParallelGateway) result2_binding[3];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[4];
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_2_2_blackBFFBFFBBBB(process, prevNode, sf1, pgw, pcgw, match)) {
			UseCase useCase = (UseCase) result2_black[1];
			P2UC p2uc = (P2UC) result2_black[2];
			ChoiceStep cStep = (ChoiceStep) result2_black[4];
			GW2S eg2cs = (GW2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_2_3_blackBBBFBBBBBB(
					process, useCase, p2uc, prevNode, cStep, eg2cs, sf1, pgw, pcgw)) {
				Flow flow = (Flow) result3_black[3];
				Object[] result3_green = PG2ParallelStepAfterEGImpl
						.pattern_PG2ParallelStepAfterEG_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(process, useCase, p2uc,
								flow, prevNode, cStep, eg2cs, sf1, pgw, pcgw);
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
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[22];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[24];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = PG2ParallelStepAfterEGImpl
						.pattern_PG2ParallelStepAfterEG_2_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
								process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, pgw, pcgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc
							+ ", " + "[flow] = " + flow + ", " + "[prevNode] = " + prevNode + ", " + "[cStep] = "
							+ cStep + ", " + "[eg2cs] = " + eg2cs + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw
							+ ", " + "[pcgw] = " + pcgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode,
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
	public CSP isAppropriate_solveCsp_FWD(Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode,
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
			UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {// Create CSP
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
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

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
		eq_1.solve(var_pgw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("cStep", cStep);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject alt, EObject process, EObject useCase,
			EObject p2uc, EObject flow, EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject altFlow,
			EObject step, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("cStep", cStep);
		ruleresult.registerObject("eg2cs", eg2cs);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("altFlow", altFlow);
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
	public boolean isAppropriate_BWD(Match match, StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep,
			AlternativeFlow altFlow, ParallelStep step) {
		// initial bindings
		Object[] result1_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_10_1_blackBBBBBBBB(this,
				match, alt, useCase, flow, cStep, altFlow, step);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[alt] = " + alt + ", " + "[useCase] = "
					+ useCase + ", " + "[flow] = " + flow + ", " + "[cStep] = " + cStep + ", " + "[altFlow] = "
					+ altFlow + ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_10_2_bindingAndBlackFBBBBBBBB(this, match, alt, useCase, flow, cStep,
						altFlow, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[alt] = " + alt + ", " + "[useCase] = " + useCase
					+ ", " + "[flow] = " + flow + ", " + "[cStep] = " + cStep + ", " + "[altFlow] = " + altFlow + ", "
					+ "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_10_4_blackBBBBBBB(match,
					alt, useCase, flow, cStep, altFlow, step);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[alt] = " + alt + ", " + "[useCase] = "
						+ useCase + ", " + "[flow] = " + flow + ", " + "[cStep] = " + cStep + ", " + "[altFlow] = "
						+ altFlow + ", " + "[step] = " + step + ".");
			}
			PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_10_4_greenBBBBBBFFFF(match, alt, useCase, cStep,
					altFlow, step);
					// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result4_green[6];
					// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result4_green[7];
					// EMoflonEdge cStep__alt____stepAlternatives = (EMoflonEdge) result4_green[8];
					// EMoflonEdge altFlow__step____steps = (EMoflonEdge) result4_green[9];

			// collect context elements
			Object[] result5_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_10_5_blackBBBBBBB(match,
					alt, useCase, flow, cStep, altFlow, step);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[alt] = " + alt + ", " + "[useCase] = "
						+ useCase + ", " + "[flow] = " + flow + ", " + "[cStep] = " + cStep + ", " + "[altFlow] = "
						+ altFlow + ", " + "[step] = " + step + ".");
			}
			PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_10_5_greenBBBBFF(match, useCase, flow, cStep);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_10_6_expressionBBBBBBBB(this, match, alt, useCase,
					flow, cStep, altFlow, step);
			return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_10_7_expressionF();
		} else {
			return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_11_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		StepAlternative alt = (StepAlternative) result1_bindingAndBlack[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[1];
		UseCase useCase = (UseCase) result1_bindingAndBlack[2];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[5];
		ChoiceStep cStep = (ChoiceStep) result1_bindingAndBlack[6];
		GW2S eg2cs = (GW2S) result1_bindingAndBlack[7];
		AlternativeFlow altFlow = (AlternativeFlow) result1_bindingAndBlack[8];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_11_1_greenBBFBFFFFB(process,
				prevNode, step, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[2];
		ParallelGateway pgw = (ParallelGateway) result1_green[4];
		FN2S pcgwToStep = (FN2S) result1_green[5];
		GW2S pgwToStep = (GW2S) result1_green[6];
		ParallelGateway pcgw = (ParallelGateway) result1_green[7];

		// collect translated elements
		Object[] result2_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_11_2_blackBBBBBBBB(alt, sf1,
				altFlow, step, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[alt] = " + alt + ", " + "[sf1] = " + sf1 + ", " + "[altFlow] = " + altFlow + ", " + "[step] = "
					+ step + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = "
					+ pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_11_2_greenFBBBBBBBB(alt, sf1,
				altFlow, step, pgw, pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_11_3_blackBBBBBBBBBBBBBBBB(
				ruleresult, alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, altFlow, step, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[alt] = " + alt + ", " + "[process] = " + process + ", "
					+ "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[flow] = " + flow + ", "
					+ "[prevNode] = " + prevNode + ", " + "[cStep] = " + cStep + ", " + "[eg2cs] = " + eg2cs + ", "
					+ "[sf1] = " + sf1 + ", " + "[altFlow] = " + altFlow + ", " + "[step] = " + step + ", " + "[pgw] = "
					+ pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", "
					+ "[pcgw] = " + pcgw + ".");
		}
		PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_11_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult,
				alt, process, useCase, prevNode, cStep, sf1, altFlow, step, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[17];
				// EMoflonEdge cStep__alt____stepAlternatives = (EMoflonEdge) result3_green[18];
				// EMoflonEdge altFlow__step____steps = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[22];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[24];
				// EMoflonEdge pcgwToStep__pcgw____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge pcgwToStep__step____target = (EMoflonEdge) result3_green[26];
				// EMoflonEdge pgwToStep__pgw____source = (EMoflonEdge) result3_green[27];
				// EMoflonEdge pgwToStep__step____target = (EMoflonEdge) result3_green[28];

		// perform postprocessing story node is empty
		// register objects
		PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_11_5_expressionBBBBBBBBBBBBBBBBB(this, ruleresult,
				alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, altFlow, step, pgw, pcgwToStep,
				pgwToStep, pcgw);
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_12_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		StepAlternative alt = (StepAlternative) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		ChoiceStep cStep = (ChoiceStep) result2_binding[3];
		AlternativeFlow altFlow = (AlternativeFlow) result2_binding[4];
		ParallelStep step = (ParallelStep) result2_binding[5];
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_12_2_blackBFBFBFBFBBB(
				alt, useCase, flow, cStep, altFlow, step, match)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			P2UC p2uc = (P2UC) result2_black[3];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[5];
			GW2S eg2cs = (GW2S) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : PG2ParallelStepAfterEGImpl
					.pattern_PG2ParallelStepAfterEG_12_3_blackBBBBBBBBBB(alt, process, useCase, p2uc, flow, prevNode,
							cStep, eg2cs, altFlow, step)) {
				Object[] result3_green = PG2ParallelStepAfterEGImpl
						.pattern_PG2ParallelStepAfterEG_12_3_greenBBBBBBBBBBFFFFFFFFFFFF(alt, process, useCase, p2uc,
								flow, prevNode, cStep, eg2cs, altFlow, step);
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
				Object[] result4_bindingAndBlack = PG2ParallelStepAfterEGImpl
						.pattern_PG2ParallelStepAfterEG_12_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, alt,
								process, useCase, p2uc, flow, prevNode, cStep, eg2cs, altFlow, step);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[alt] = " + alt + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
							+ ", " + "[p2uc] = " + p2uc + ", " + "[flow] = " + flow + ", " + "[prevNode] = " + prevNode
							+ ", " + "[cStep] = " + cStep + ", " + "[eg2cs] = " + eg2cs + ", " + "[altFlow] = "
							+ altFlow + ", " + "[step] = " + step + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, StepAlternative alt, UseCase useCase, Flow flow,
			ChoiceStep cStep, AlternativeFlow altFlow, ParallelStep step) {
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
			ChoiceStep cStep, AlternativeFlow altFlow, ParallelStep step) {// Create CSP
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
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, AlternativeFlow altFlow, ParallelStep step) {// Create CSP
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
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", csp);
		var_pgw_id.setType("String");

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
		eq_1.solve(var_pgw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("cStep", cStep);
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
			EObject p2uc, EObject flow, EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject altFlow,
			EObject step, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("cStep", cStep);
		ruleresult.registerObject("eg2cs", eg2cs);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("altFlow", altFlow);
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
				&& match.getObject("alt").eClass()
						.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getStepAlternative())
				&& match.getObject("altFlow").eClass()
						.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getAlternativeFlow())
				&& match.getObject("step").eClass()
						.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getParallelStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_417(EMoflonEdge _edge_ref) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_20_2_blackFFFFFFB(_edge_ref)) {
			StepAlternative alt = (StepAlternative) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			ChoiceStep cStep = (ChoiceStep) result2_black[3];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[4];
			ParallelStep step = (ParallelStep) result2_black[5];
			Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_20_3_expressionFBBBBBBBB(this, match, alt,
					useCase, flow, cStep, altFlow, step)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_20_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_20_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1312(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_21_2_blackFFFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_21_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_21_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_21_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_418(EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_22_2_blackFFFFFFB(_edge_flows)) {
			StepAlternative alt = (StepAlternative) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			ChoiceStep cStep = (ChoiceStep) result2_black[3];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[4];
			ParallelStep step = (ParallelStep) result2_black[5];
			Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_22_3_expressionFBBBBBBBB(this, match, alt,
					useCase, flow, cStep, altFlow, step)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_22_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_22_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1313(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_23_2_blackFFFFFB(_edge_sourceRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_23_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_23_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_23_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1314(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_24_2_blackFFFFFB(_edge_outgoing)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_24_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_24_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_24_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_419(EMoflonEdge _edge_stepAlternatives) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_25_2_blackFFFFFFB(_edge_stepAlternatives)) {
			StepAlternative alt = (StepAlternative) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			ChoiceStep cStep = (ChoiceStep) result2_black[3];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[4];
			ParallelStep step = (ParallelStep) result2_black[5];
			Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_25_3_expressionFBBBBBBBB(this, match, alt,
					useCase, flow, cStep, altFlow, step)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_25_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_25_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_420(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_26_2_blackFFFFFFB(_edge_steps)) {
			StepAlternative alt = (StepAlternative) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			ChoiceStep cStep = (ChoiceStep) result2_black[3];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[4];
			ParallelStep step = (ParallelStep) result2_black[5];
			Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_26_3_expressionFBBBBBBBB(this, match, alt,
					useCase, flow, cStep, altFlow, step)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_26_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_26_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1315(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_27_2_blackFFFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_27_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_27_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_27_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1316(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_28_2_blackFFFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_28_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_28_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_28_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1317(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_29_2_blackFFFFFB(_edge_targetRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_29_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_29_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_29_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1318(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_30_2_blackFFFFFB(_edge_incoming)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_30_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_30_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_30_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_30_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1319(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_31_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_31_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_31_2_blackFFFFFB(_edge___conv)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_31_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_31_3_expressionFBBBBBBB(this, match, process,
					prevNode, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_31_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_31_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_31_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_31_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PG2ParallelStepAfterEG");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForAlt = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("alt")).findAny();
		SimpleUseCase.StepAlternative alt = (SimpleUseCase.StepAlternative) matchForAlt.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		Bpmn2UseCase.P2UC p2uc = (Bpmn2UseCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.ExclusiveGateway prevNode = (SimpleBPMN.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForCStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("cStep")).findAny();
		SimpleUseCase.ChoiceStep cStep = (SimpleUseCase.ChoiceStep) matchForCStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg2cs")).findAny();
		Bpmn2UseCase.GW2S eg2cs = (Bpmn2UseCase.GW2S) matchForEg2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForAltFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("altFlow")).findAny();
		SimpleUseCase.AlternativeFlow altFlow = (SimpleUseCase.AlternativeFlow) matchForAltFlow.get().getNode();

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

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		eq0.setRuleName("PG2ParallelStepAfterEG");
		eq0.solve(var_sf1_conditionExpression, var_alt_condition);

		eq1.setRuleName("PG2ParallelStepAfterEG");
		eq1.solve(var_sf1_id, var_altFlow_id);

		eq2.setRuleName("PG2ParallelStepAfterEG");
		eq2.solve(var_pgw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_alt_condition.setBound(false);
			var_altFlow_id.setBound(false);
			var_step_id.setBound(false);
			eq0.solve(var_sf1_conditionExpression, var_alt_condition);
			eq1.solve(var_sf1_id, var_altFlow_id);
			eq2.solve(var_pgw_id, var_step_id);
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
		ruleResult.setRule("PG2ParallelStepAfterEG");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForAlt = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("alt")).findAny();
		SimpleUseCase.StepAlternative alt = (SimpleUseCase.StepAlternative) matchForAlt.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		Bpmn2UseCase.P2UC p2uc = (Bpmn2UseCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.ExclusiveGateway prevNode = (SimpleBPMN.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForCStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("cStep")).findAny();
		SimpleUseCase.ChoiceStep cStep = (SimpleUseCase.ChoiceStep) matchForCStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg2cs")).findAny();
		Bpmn2UseCase.GW2S eg2cs = (Bpmn2UseCase.GW2S) matchForEg2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForAltFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("altFlow")).findAny();
		SimpleUseCase.AlternativeFlow altFlow = (SimpleUseCase.AlternativeFlow) matchForAltFlow.get().getNode();

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

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		eq0.setRuleName("PG2ParallelStepAfterEG");
		eq0.solve(var_sf1_conditionExpression, var_alt_condition);

		eq1.setRuleName("PG2ParallelStepAfterEG");
		eq1.solve(var_sf1_id, var_altFlow_id);

		eq2.setRuleName("PG2ParallelStepAfterEG");
		eq2.solve(var_pgw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_sf1_conditionExpression.setBound(false);
			var_sf1_id.setBound(false);
			var_pgw_id.setBound(false);
			eq0.solve(var_sf1_conditionExpression, var_alt_condition);
			eq1.solve(var_sf1_id, var_altFlow_id);
			eq2.solve(var_pgw_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				sf1.setConditionExpression((String) var_sf1_conditionExpression.getValue());
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
		Object[] result1_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_34_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_34_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_34_2_bindingFFFFFFFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		StepAlternative alt = (StepAlternative) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		UseCase useCase = (UseCase) result2_binding[2];
		Flow flow = (Flow) result2_binding[3];
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[4];
		ChoiceStep cStep = (ChoiceStep) result2_binding[5];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[6];
		AlternativeFlow altFlow = (AlternativeFlow) result2_binding[7];
		ParallelStep step = (ParallelStep) result2_binding[8];
		ParallelGateway pgw = (ParallelGateway) result2_binding[9];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[10];
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_34_2_blackBBBFBBBFBBBBBBB(alt, process, useCase, flow, prevNode, cStep,
						sf1, altFlow, step, pgw, pcgw, sourceMatch, targetMatch)) {
			P2UC p2uc = (P2UC) result2_black[3];
			GW2S eg2cs = (GW2S) result2_black[7];
			Object[] result2_green = PG2ParallelStepAfterEGImpl
					.pattern_PG2ParallelStepAfterEG_34_2_greenBBBBBBBBBBBBBBBF(alt, process, useCase, p2uc, flow,
							prevNode, cStep, eg2cs, sf1, altFlow, step, pgw, pcgw, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[15];

			// check csp
			Object[] result3_bindingAndBlack = PG2ParallelStepAfterEGImpl
					.pattern_PG2ParallelStepAfterEG_34_3_bindingAndBlackFBBBBBBBBBBBBBBBBB(this, isApplicableMatch, alt,
							process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, altFlow, step, pgw, pcgw,
							sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_34_4_blackBB(result,
						isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_34_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_34_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, StepAlternative alt,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, AlternativeFlow altFlow, ParallelStep step,
			ParallelGateway pgw, ParallelGateway pcgw, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sf1_conditionExpression = CSPFactoryHelper.eINSTANCE.createVariable("sf1.conditionExpression",
				true, csp);
		var_sf1_conditionExpression.setValue(sf1.getConditionExpression());
		var_sf1_conditionExpression.setType("String");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable("alt.condition", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		var_alt_condition.setType("String");
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");
		Variable var_altFlow_id = CSPFactoryHelper.eINSTANCE.createVariable("altFlow.id", true, csp);
		var_altFlow_id.setValue(altFlow.getId());
		var_altFlow_id.setType("String");
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
		eq_1.solve(var_pgw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("cStep", cStep);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("altFlow", altFlow);
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
		Object[] result1_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_37_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_37_2_bindingAndBlackFFFFFFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// StepAlternative alt = (StepAlternative) result2_bindingAndBlack[0];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[1];
		// UseCase useCase = (UseCase) result2_bindingAndBlack[2];
		// P2UC p2uc = (P2UC) result2_bindingAndBlack[3];
		// Flow flow = (Flow) result2_bindingAndBlack[4];
		// ExclusiveGateway prevNode = (ExclusiveGateway) result2_bindingAndBlack[5];
		// ChoiceStep cStep = (ChoiceStep) result2_bindingAndBlack[6];
		// GW2S eg2cs = (GW2S) result2_bindingAndBlack[7];
		// SequenceFlow sf1 = (SequenceFlow) result2_bindingAndBlack[8];
		// AlternativeFlow altFlow = (AlternativeFlow) result2_bindingAndBlack[9];
		ParallelStep step = (ParallelStep) result2_bindingAndBlack[10];
		ParallelGateway pgw = (ParallelGateway) result2_bindingAndBlack[11];
		ParallelGateway pcgw = (ParallelGateway) result2_bindingAndBlack[12];
		Object[] result2_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_37_2_greenBBBFFF(step, pgw,
				pcgw);
		PerformRuleResult result = (PerformRuleResult) result2_green[3];
		// FN2S pcgwToStep = (FN2S) result2_green[4];
		// GW2S pgwToStep = (GW2S) result2_green[5];

		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_37_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, GW2S eg2csParameter) {
		// create result
		Object[] result1_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_38_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_38_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : PG2ParallelStepAfterEGImpl
				.pattern_PG2ParallelStepAfterEG_38_2_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList eg2csList = (RuleEntryList) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[2];
			GW2S eg2cs = (GW2S) result2_black[3];
			ChoiceStep cStep = (ChoiceStep) result2_black[4];
			Flow flow = (Flow) result2_black[5];
			UseCase useCase = (UseCase) result2_black[6];
			P2UC p2uc = (P2UC) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = PG2ParallelStepAfterEGImpl
					.pattern_PG2ParallelStepAfterEG_38_3_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, process,
							useCase, p2uc, flow, prevNode, cStep, eg2cs, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[process] = " + process
						+ ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[flow] = " + flow + ", "
						+ "[prevNode] = " + prevNode + ", " + "[cStep] = " + cStep + ", " + "[eg2cs] = " + eg2cs + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_38_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_38_5_blackBBBBBBB(
						process, useCase, p2uc, flow, prevNode, cStep, eg2cs);
				if (result5_black != null) {

					// perform
					Object[] result6_black = PG2ParallelStepAfterEGImpl
							.pattern_PG2ParallelStepAfterEG_38_6_blackBBBBBBBB(process, useCase, p2uc, flow, prevNode,
									cStep, eg2cs, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc
								+ ", " + "[flow] = " + flow + ", " + "[prevNode] = " + prevNode + ", " + "[cStep] = "
								+ cStep + ", " + "[eg2cs] = " + eg2cs + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_38_6_greenFBBBBFFFFFFFBB(process, useCase,
							prevNode, cStep, ruleResult, csp);
					// StepAlternative alt = (StepAlternative) result6_green[0];
					// SequenceFlow sf1 = (SequenceFlow) result6_green[5];
					// AlternativeFlow altFlow = (AlternativeFlow) result6_green[6];
					// ParallelStep step = (ParallelStep) result6_green[7];
					// ParallelGateway pgw = (ParallelGateway) result6_green[8];
					// FN2S pcgwToStep = (FN2S) result6_green[9];
					// GW2S pgwToStep = (GW2S) result6_green[10];
					// ParallelGateway pcgw = (ParallelGateway) result6_green[11];

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepAfterEGImpl.pattern_PG2ParallelStepAfterEG_38_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_sf1_conditionExpression = CSPFactoryHelper.eINSTANCE.createVariable("sf1.conditionExpression",
				csp);
		var_sf1_conditionExpression.setType("String");
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable("alt.condition", csp);
		var_alt_condition.setType("String");
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", csp);
		var_sf1_id.setType("String");
		Variable var_altFlow_id = CSPFactoryHelper.eINSTANCE.createVariable("altFlow.id", csp);
		var_altFlow_id.setType("String");
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", csp);
		var_pgw_id.setType("String");
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
		eq_1.solve(var_pgw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("cStep", cStep);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
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
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
			return null;
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(Flow) arguments.get(4), (ExclusiveGateway) arguments.get(5), (ChoiceStep) arguments.get(6),
					(GW2S) arguments.get(7), (SequenceFlow) arguments.get(8), (ParallelGateway) arguments.get(9),
					(ParallelGateway) arguments.get(10));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_PARALLELSTEP:
			return isAppropriate_BWD((Match) arguments.get(0), (StepAlternative) arguments.get(1),
					(UseCase) arguments.get(2), (Flow) arguments.get(3), (ChoiceStep) arguments.get(4),
					(AlternativeFlow) arguments.get(5), (ParallelStep) arguments.get(6));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_PARALLELSTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (StepAlternative) arguments.get(1),
					(UseCase) arguments.get(2), (Flow) arguments.get(3), (ChoiceStep) arguments.get(4),
					(AlternativeFlow) arguments.get(5), (ParallelStep) arguments.get(6));
			return null;
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_PARALLELSTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (StepAlternative) arguments.get(1),
					(UseCase) arguments.get(2), (Flow) arguments.get(3), (ChoiceStep) arguments.get(4),
					(AlternativeFlow) arguments.get(5), (ParallelStep) arguments.get(6));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_ALTERNATIVEFLOW_PARALLELSTEP:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (StepAlternative) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (UseCase) arguments.get(3), (P2UC) arguments.get(4),
					(Flow) arguments.get(5), (ExclusiveGateway) arguments.get(6), (ChoiceStep) arguments.get(7),
					(GW2S) arguments.get(8), (AlternativeFlow) arguments.get(9), (ParallelStep) arguments.get(10));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_417__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_417((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1312__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1312((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_418__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_418((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1313__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1313((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1314__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1314((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_419__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_419((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_420__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_420((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1315__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1315((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1316__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1316((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1317__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1317((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1318__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1318((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1319__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1319((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_ALTERNATIVEFLOW_PARALLELSTEP_PARALLELGATEWAY_PARALLELGATEWAY_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (StepAlternative) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (UseCase) arguments.get(3), (P2UC) arguments.get(4),
					(Flow) arguments.get(5), (ExclusiveGateway) arguments.get(6), (ChoiceStep) arguments.get(7),
					(GW2S) arguments.get(8), (SequenceFlow) arguments.get(9), (AlternativeFlow) arguments.get(10),
					(ParallelStep) arguments.get(11), (ParallelGateway) arguments.get(12),
					(ParallelGateway) arguments.get(13), (Match) arguments.get(14), (Match) arguments.get(15));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S:
			return generateModel((RuleEntryContainer) arguments.get(0), (GW2S) arguments.get(1));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(Flow) arguments.get(4), (ExclusiveGateway) arguments.get(5), (ChoiceStep) arguments.get(6),
					(GW2S) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_0_1_blackBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { _this, match, process, prevNode, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_0_2_bindingFBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process, prevNode, sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, prevNode, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_0_2_bindingAndBlackFBBBBBBB(
			PG2ParallelStepAfterEG _this, Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_PG2ParallelStepAfterEG_0_2_binding = pattern_PG2ParallelStepAfterEG_0_2_bindingFBBBBBBB(
				_this, match, process, prevNode, sf1, pgw, pcgw);
		if (result_pattern_PG2ParallelStepAfterEG_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepAfterEG_0_2_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_0_2_black = pattern_PG2ParallelStepAfterEG_0_2_blackB(csp);
			if (result_pattern_PG2ParallelStepAfterEG_0_2_black != null) {

				return new Object[] { csp, _this, match, process, prevNode, sf1, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_0_3_expressionFBB(PG2ParallelStepAfterEG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_0_4_blackBBBBBB(Match match, SimpleBPMN.Process process,
			ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { match, process, prevNode, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_0_4_greenBBBBBBFFFFFFFF(Match match,
			SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_0_5_blackBBBBBB(Match match, SimpleBPMN.Process process,
			ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { match, process, prevNode, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_0_5_greenBBBF(Match match, SimpleBPMN.Process process,
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

	public static final void pattern_PG2ParallelStepAfterEG_0_6_expressionBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		_this.registerObjectsToMatch_FWD(match, process, prevNode, sf1, pgw, pcgw);

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_1_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_5 = isApplicableMatch.getObject("cStep");
		EObject _localVariable_6 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_7 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_8 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_9 = isApplicableMatch.getObject("pcgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpP2uc = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpPrevNode = _localVariable_4;
		EObject tmpCStep = _localVariable_5;
		EObject tmpEg2cs = _localVariable_6;
		EObject tmpSf1 = _localVariable_7;
		EObject tmpPgw = _localVariable_8;
		EObject tmpPcgw = _localVariable_9;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpP2uc instanceof P2UC) {
					P2UC p2uc = (P2UC) tmpP2uc;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpPrevNode instanceof ExclusiveGateway) {
							ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
							if (tmpCStep instanceof ChoiceStep) {
								ChoiceStep cStep = (ChoiceStep) tmpCStep;
								if (tmpEg2cs instanceof GW2S) {
									GW2S eg2cs = (GW2S) tmpEg2cs;
									if (tmpSf1 instanceof SequenceFlow) {
										SequenceFlow sf1 = (SequenceFlow) tmpSf1;
										if (tmpPgw instanceof ParallelGateway) {
											ParallelGateway pgw = (ParallelGateway) tmpPgw;
											if (tmpPcgw instanceof ParallelGateway) {
												ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
												return new Object[] { process, useCase, p2uc, flow, prevNode, cStep,
														eg2cs, sf1, pgw, pcgw, isApplicableMatch };
											}
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_1_1_blackBBBBBBBBBBBFB(SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, PG2ParallelStepAfterEG _this,
			IsApplicableMatch isApplicableMatch) {
		if (!pcgw.equals(pgw)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, pgw, pcgw, _this,
							csp, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_1_1_bindingAndBlackFFFFFFFFFFBFB(
			PG2ParallelStepAfterEG _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PG2ParallelStepAfterEG_1_1_binding = pattern_PG2ParallelStepAfterEG_1_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_PG2ParallelStepAfterEG_1_1_binding != null) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_PG2ParallelStepAfterEG_1_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_PG2ParallelStepAfterEG_1_1_binding[1];
			P2UC p2uc = (P2UC) result_pattern_PG2ParallelStepAfterEG_1_1_binding[2];
			Flow flow = (Flow) result_pattern_PG2ParallelStepAfterEG_1_1_binding[3];
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_PG2ParallelStepAfterEG_1_1_binding[4];
			ChoiceStep cStep = (ChoiceStep) result_pattern_PG2ParallelStepAfterEG_1_1_binding[5];
			GW2S eg2cs = (GW2S) result_pattern_PG2ParallelStepAfterEG_1_1_binding[6];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_PG2ParallelStepAfterEG_1_1_binding[7];
			ParallelGateway pgw = (ParallelGateway) result_pattern_PG2ParallelStepAfterEG_1_1_binding[8];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_PG2ParallelStepAfterEG_1_1_binding[9];

			Object[] result_pattern_PG2ParallelStepAfterEG_1_1_black = pattern_PG2ParallelStepAfterEG_1_1_blackBBBBBBBBBBBFB(
					process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, pgw, pcgw, _this, isApplicableMatch);
			if (result_pattern_PG2ParallelStepAfterEG_1_1_black != null) {
				CSP csp = (CSP) result_pattern_PG2ParallelStepAfterEG_1_1_black[11];

				return new Object[] { process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, pgw, pcgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_1_1_greenFBBFFBFFBB(UseCase useCase, ChoiceStep cStep,
			ParallelGateway pgw, ParallelGateway pcgw, CSP csp) {
		StepAlternative alt = SimpleUseCaseFactory.eINSTANCE.createStepAlternative();
		AlternativeFlow altFlow = SimpleUseCaseFactory.eINSTANCE.createAlternativeFlow();
		ParallelStep step = SimpleUseCaseFactory.eINSTANCE.createParallelStep();
		FN2S pcgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("alt", "condition");
		Object _localVariable_1 = csp.getValue("altFlow", "id");
		Object _localVariable_2 = csp.getValue("step", "id");
		cStep.getStepAlternatives().add(alt);
		alt.setRef(altFlow);
		useCase.getFlows().add(altFlow);
		altFlow.getSteps().add(step);
		pcgwToStep.setSource(pcgw);
		pcgwToStep.setTarget(step);
		pgwToStep.setSource(pgw);
		pgwToStep.setTarget(step);
		String alt_condition_prime = (String) _localVariable_0;
		String altFlow_id_prime = (String) _localVariable_1;
		String step_id_prime = (String) _localVariable_2;
		alt.setCondition(alt_condition_prime);
		altFlow.setId(altFlow_id_prime);
		step.setId(step_id_prime);
		return new Object[] { alt, useCase, cStep, altFlow, step, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_1_2_blackBBBBBBBB(StepAlternative alt, SequenceFlow sf1,
			AlternativeFlow altFlow, ParallelStep step, ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { alt, sf1, altFlow, step, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_1_2_greenFBBBBBBBB(StepAlternative alt,
			SequenceFlow sf1, AlternativeFlow altFlow, ParallelStep step, ParallelGateway pgw, FN2S pcgwToStep,
			GW2S pgwToStep, ParallelGateway pcgw) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(alt);
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getCreatedElements().add(altFlow);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(pgw);
		ruleresult.getCreatedLinkElements().add(pcgwToStep);
		ruleresult.getCreatedLinkElements().add(pgwToStep);
		ruleresult.getTranslatedElements().add(pcgw);
		return new Object[] { ruleresult, alt, sf1, altFlow, step, pgw, pcgwToStep, pgwToStep, pcgw };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_1_3_blackBBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject alt, EObject process, EObject useCase, EObject p2uc, EObject flow, EObject prevNode, EObject cStep,
			EObject eg2cs, EObject sf1, EObject altFlow, EObject step, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
		if (!alt.equals(process)) {
			if (!alt.equals(useCase)) {
				if (!alt.equals(p2uc)) {
					if (!alt.equals(flow)) {
						if (!alt.equals(prevNode)) {
							if (!alt.equals(cStep)) {
								if (!alt.equals(eg2cs)) {
									if (!alt.equals(sf1)) {
										if (!alt.equals(altFlow)) {
											if (!alt.equals(step)) {
												if (!alt.equals(pgw)) {
													if (!alt.equals(pcgwToStep)) {
														if (!alt.equals(pgwToStep)) {
															if (!alt.equals(pcgw)) {
																if (!process.equals(useCase)) {
																	if (!process.equals(sf1)) {
																		if (!process.equals(step)) {
																			if (!p2uc.equals(process)) {
																				if (!p2uc.equals(useCase)) {
																					if (!p2uc.equals(prevNode)) {
																						if (!p2uc.equals(sf1)) {
																							if (!p2uc.equals(step)) {
																								if (!p2uc.equals(pgw)) {
																									if (!p2uc.equals(
																											pcgwToStep)) {
																										if (!p2uc
																												.equals(pgwToStep)) {
																											if (!p2uc
																													.equals(pcgw)) {
																												if (!flow
																														.equals(process)) {
																													if (!flow
																															.equals(useCase)) {
																														if (!flow
																																.equals(p2uc)) {
																															if (!flow
																																	.equals(prevNode)) {
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
																																						if (!prevNode
																																								.equals(process)) {
																																							if (!prevNode
																																									.equals(useCase)) {
																																								if (!prevNode
																																										.equals(sf1)) {
																																									if (!prevNode
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
																																																				.equals(pgw)) {
																																																			if (!cStep
																																																					.equals(pcgwToStep)) {
																																																				if (!cStep
																																																						.equals(pgwToStep)) {
																																																					if (!cStep
																																																							.equals(pcgw)) {
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
																																																															.equals(pgw)) {
																																																														if (!eg2cs
																																																																.equals(pcgwToStep)) {
																																																															if (!eg2cs
																																																																	.equals(pgwToStep)) {
																																																																if (!eg2cs
																																																																		.equals(pcgw)) {
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
																																																																									.equals(prevNode)) {
																																																																								if (!altFlow
																																																																										.equals(cStep)) {
																																																																									if (!altFlow
																																																																											.equals(eg2cs)) {
																																																																										if (!altFlow
																																																																												.equals(sf1)) {
																																																																											if (!altFlow
																																																																													.equals(step)) {
																																																																												if (!altFlow
																																																																														.equals(pgw)) {
																																																																													if (!altFlow
																																																																															.equals(pcgwToStep)) {
																																																																														if (!altFlow
																																																																																.equals(pgwToStep)) {
																																																																															if (!altFlow
																																																																																	.equals(pcgw)) {
																																																																																if (!step
																																																																																		.equals(useCase)) {
																																																																																	if (!pgw.equals(
																																																																																			process)) {
																																																																																		if (!pgw.equals(
																																																																																				useCase)) {
																																																																																			if (!pgw.equals(
																																																																																					prevNode)) {
																																																																																				if (!pgw.equals(
																																																																																						sf1)) {
																																																																																					if (!pgw.equals(
																																																																																							step)) {
																																																																																						if (!pgw.equals(
																																																																																								pgwToStep)) {
																																																																																							if (!pcgwToStep
																																																																																									.equals(process)) {
																																																																																								if (!pcgwToStep
																																																																																										.equals(useCase)) {
																																																																																									if (!pcgwToStep
																																																																																											.equals(prevNode)) {
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
																																																																																																	.equals(useCase)) {
																																																																																																if (!pgwToStep
																																																																																																		.equals(prevNode)) {
																																																																																																	if (!pgwToStep
																																																																																																			.equals(sf1)) {
																																																																																																		if (!pgwToStep
																																																																																																				.equals(step)) {
																																																																																																			if (!pcgw
																																																																																																					.equals(process)) {
																																																																																																				if (!pcgw
																																																																																																						.equals(useCase)) {
																																																																																																					if (!pcgw
																																																																																																							.equals(prevNode)) {
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
																																																																																																													alt,
																																																																																																													process,
																																																																																																													useCase,
																																																																																																													p2uc,
																																																																																																													flow,
																																																																																																													prevNode,
																																																																																																													cStep,
																																																																																																													eg2cs,
																																																																																																													sf1,
																																																																																																													altFlow,
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
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_1_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject alt, EObject process, EObject useCase, EObject prevNode,
			EObject cStep, EObject sf1, EObject altFlow, EObject step, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge altFlow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PG2ParallelStepAfterEG";
		String alt__altFlow____ref_name_prime = "ref";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__altFlow____flows_name_prime = "flows";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String cStep__alt____stepAlternatives_name_prime = "stepAlternatives";
		String altFlow__step____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String pcgwToStep__pcgw____source_name_prime = "source";
		String pcgwToStep__step____target_name_prime = "target";
		String pgwToStep__pgw____source_name_prime = "source";
		String pgwToStep__step____target_name_prime = "target";
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(alt__altFlow____ref);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(process__sf1____flowElements);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(useCase__altFlow____flows);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
		cStep__alt____stepAlternatives.setSrc(cStep);
		cStep__alt____stepAlternatives.setTrg(alt);
		ruleresult.getCreatedEdges().add(cStep__alt____stepAlternatives);
		altFlow__step____steps.setSrc(altFlow);
		altFlow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(altFlow__step____steps);
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
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		cStep__alt____stepAlternatives.setName(cStep__alt____stepAlternatives_name_prime);
		altFlow__step____steps.setName(altFlow__step____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		pcgwToStep__pcgw____source.setName(pcgwToStep__pcgw____source_name_prime);
		pcgwToStep__step____target.setName(pcgwToStep__step____target_name_prime);
		pgwToStep__pgw____source.setName(pgwToStep__pgw____source_name_prime);
		pgwToStep__step____target.setName(pgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, alt, process, useCase, prevNode, cStep, sf1, altFlow, step, pgw, pcgwToStep,
				pgwToStep, pcgw, alt__altFlow____ref, process__sf1____flowElements, useCase__altFlow____flows,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, cStep__alt____stepAlternatives,
				altFlow__step____steps, process__pgw____flowElements, process__pcgw____flowElements,
				sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv, pcgwToStep__pcgw____source,
				pcgwToStep__step____target, pgwToStep__pgw____source, pgwToStep__step____target };
	}

	public static final void pattern_PG2ParallelStepAfterEG_1_5_expressionBBBBBBBBBBBBBBBBB(
			PG2ParallelStepAfterEG _this, PerformRuleResult ruleresult, EObject alt, EObject process, EObject useCase,
			EObject p2uc, EObject flow, EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject altFlow,
			EObject step, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_FWD(ruleresult, alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, altFlow,
				step, pgw, pcgwToStep, pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_PG2ParallelStepAfterEG_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_2_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_2_1_blackFBB(EClass eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_2_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_2_1_binding = pattern_PG2ParallelStepAfterEG_2_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_2_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_2_1_black = pattern_PG2ParallelStepAfterEG_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "PG2ParallelStepAfterEG";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_2_2_bindingFFFFFB(Match match) {
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
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_2_2_blackBFFBFFBBBB(
			SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pcgw.equals(pgw)) {
			boolean prevNodeisDiverging = prevNode.isIsDiverging();
			if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
				boolean pgwisDiverging = pgw.isIsDiverging();
				if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
					boolean pcgwisDiverging = pcgw.isIsDiverging();
					if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
						for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(process,
								P2UC.class, "source")) {
							UseCase useCase = p2uc.getTarget();
							if (useCase != null) {
								for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, GW2S.class, "source")) {
									Step tmpCStep = eg2cs.getTarget();
									if (tmpCStep instanceof ChoiceStep) {
										ChoiceStep cStep = (ChoiceStep) tmpCStep;
										_result.add(new Object[] { process, useCase, p2uc, prevNode, cStep, eg2cs, sf1,
												pgw, pcgw, match });
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_2_3_blackBBBFBBBBBB(
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, ExclusiveGateway prevNode, ChoiceStep cStep,
			GW2S eg2cs, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pcgw.equals(pgw)) {
			if (process.getFlowElements().contains(prevNode)) {
				if (process.getFlowElements().contains(sf1)) {
					if (process.equals(p2uc.getSource())) {
						if (useCase.equals(p2uc.getTarget())) {
							if (prevNode.equals(sf1.getSourceRef())) {
								if (prevNode.equals(eg2cs.getSource())) {
									if (cStep.equals(eg2cs.getTarget())) {
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
																if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
																	for (Flow flow : useCase.getFlows()) {
																		if (flow.getSteps().contains(cStep)) {
																			_result.add(new Object[] { process, useCase,
																					p2uc, flow, prevNode, cStep, eg2cs,
																					sf1, pgw, pcgw });
																		}
																	}
																}

															}

														}

													}
												}
											}
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
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
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(pcgw);
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
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		flow__cStep____steps.setName(flow__cStep____steps_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		eg2cs__prevNode____source.setName(eg2cs__prevNode____source_name_prime);
		eg2cs__cStep____target.setName(eg2cs__cStep____target_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		return new Object[] { process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, pgw, pcgw, isApplicableMatch,
				process__prevNode____flowElements, process__sf1____flowElements, useCase__flow____flows,
				p2uc__process____source, p2uc__useCase____target, flow__cStep____steps, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, eg2cs__prevNode____source, eg2cs__cStep____target,
				process__pgw____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_2_4_bindingFBBBBBBBBBBBB(PG2ParallelStepAfterEG _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow,
			ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, process, useCase, p2uc, flow,
				prevNode, cStep, eg2cs, sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, flow, prevNode, cStep, eg2cs,
					sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_2_4_bindingAndBlackFBBBBBBBBBBBB(
			PG2ParallelStepAfterEG _this, IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_PG2ParallelStepAfterEG_2_4_binding = pattern_PG2ParallelStepAfterEG_2_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, pgw, pcgw);
		if (result_pattern_PG2ParallelStepAfterEG_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepAfterEG_2_4_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_2_4_black = pattern_PG2ParallelStepAfterEG_2_4_blackB(csp);
			if (result_pattern_PG2ParallelStepAfterEG_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, flow, prevNode, cStep,
						eg2cs, sf1, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_2_5_expressionFBB(PG2ParallelStepAfterEG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PG2ParallelStepAfterEG";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PG2ParallelStepAfterEG_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_10_1_blackBBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ParallelStep step) {
		if (!altFlow.equals(flow)) {
			return new Object[] { _this, match, alt, useCase, flow, cStep, altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_10_2_bindingFBBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ParallelStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, alt, useCase, flow, cStep, altFlow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, alt, useCase, flow, cStep, altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_10_2_bindingAndBlackFBBBBBBBB(
			PG2ParallelStepAfterEG _this, Match match, StepAlternative alt, UseCase useCase, Flow flow,
			ChoiceStep cStep, AlternativeFlow altFlow, ParallelStep step) {
		Object[] result_pattern_PG2ParallelStepAfterEG_10_2_binding = pattern_PG2ParallelStepAfterEG_10_2_bindingFBBBBBBBB(
				_this, match, alt, useCase, flow, cStep, altFlow, step);
		if (result_pattern_PG2ParallelStepAfterEG_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepAfterEG_10_2_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_10_2_black = pattern_PG2ParallelStepAfterEG_10_2_blackB(csp);
			if (result_pattern_PG2ParallelStepAfterEG_10_2_black != null) {

				return new Object[] { csp, _this, match, alt, useCase, flow, cStep, altFlow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_10_3_expressionFBB(PG2ParallelStepAfterEG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_10_4_blackBBBBBBB(Match match, StepAlternative alt,
			UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow, ParallelStep step) {
		if (!altFlow.equals(flow)) {
			return new Object[] { match, alt, useCase, flow, cStep, altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_10_4_greenBBBBBBFFFF(Match match, StepAlternative alt,
			UseCase useCase, ChoiceStep cStep, AlternativeFlow altFlow, ParallelStep step) {
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_10_5_blackBBBBBBB(Match match, StepAlternative alt,
			UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow, ParallelStep step) {
		if (!altFlow.equals(flow)) {
			return new Object[] { match, alt, useCase, flow, cStep, altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_10_5_greenBBBBFF(Match match, UseCase useCase,
			Flow flow, ChoiceStep cStep) {
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

	public static final void pattern_PG2ParallelStepAfterEG_10_6_expressionBBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ParallelStep step) {
		_this.registerObjectsToMatch_BWD(match, alt, useCase, flow, cStep, altFlow, step);

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_11_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("alt");
		EObject _localVariable_1 = isApplicableMatch.getObject("process");
		EObject _localVariable_2 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_3 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_6 = isApplicableMatch.getObject("cStep");
		EObject _localVariable_7 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_8 = isApplicableMatch.getObject("altFlow");
		EObject _localVariable_9 = isApplicableMatch.getObject("step");
		EObject tmpAlt = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpP2uc = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpPrevNode = _localVariable_5;
		EObject tmpCStep = _localVariable_6;
		EObject tmpEg2cs = _localVariable_7;
		EObject tmpAltFlow = _localVariable_8;
		EObject tmpStep = _localVariable_9;
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpP2uc instanceof P2UC) {
						P2UC p2uc = (P2UC) tmpP2uc;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpPrevNode instanceof ExclusiveGateway) {
								ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
								if (tmpCStep instanceof ChoiceStep) {
									ChoiceStep cStep = (ChoiceStep) tmpCStep;
									if (tmpEg2cs instanceof GW2S) {
										GW2S eg2cs = (GW2S) tmpEg2cs;
										if (tmpAltFlow instanceof AlternativeFlow) {
											AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
											if (tmpStep instanceof ParallelStep) {
												ParallelStep step = (ParallelStep) tmpStep;
												return new Object[] { alt, process, useCase, p2uc, flow, prevNode,
														cStep, eg2cs, altFlow, step, isApplicableMatch };
											}
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_11_1_blackBBBBBBBBBBBFB(StepAlternative alt,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, AlternativeFlow altFlow, ParallelStep step, PG2ParallelStepAfterEG _this,
			IsApplicableMatch isApplicableMatch) {
		if (!altFlow.equals(flow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, altFlow, step,
							_this, csp, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_11_1_bindingAndBlackFFFFFFFFFFBFB(
			PG2ParallelStepAfterEG _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PG2ParallelStepAfterEG_11_1_binding = pattern_PG2ParallelStepAfterEG_11_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_PG2ParallelStepAfterEG_11_1_binding != null) {
			StepAlternative alt = (StepAlternative) result_pattern_PG2ParallelStepAfterEG_11_1_binding[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_PG2ParallelStepAfterEG_11_1_binding[1];
			UseCase useCase = (UseCase) result_pattern_PG2ParallelStepAfterEG_11_1_binding[2];
			P2UC p2uc = (P2UC) result_pattern_PG2ParallelStepAfterEG_11_1_binding[3];
			Flow flow = (Flow) result_pattern_PG2ParallelStepAfterEG_11_1_binding[4];
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_PG2ParallelStepAfterEG_11_1_binding[5];
			ChoiceStep cStep = (ChoiceStep) result_pattern_PG2ParallelStepAfterEG_11_1_binding[6];
			GW2S eg2cs = (GW2S) result_pattern_PG2ParallelStepAfterEG_11_1_binding[7];
			AlternativeFlow altFlow = (AlternativeFlow) result_pattern_PG2ParallelStepAfterEG_11_1_binding[8];
			ParallelStep step = (ParallelStep) result_pattern_PG2ParallelStepAfterEG_11_1_binding[9];

			Object[] result_pattern_PG2ParallelStepAfterEG_11_1_black = pattern_PG2ParallelStepAfterEG_11_1_blackBBBBBBBBBBBFB(
					alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, altFlow, step, _this, isApplicableMatch);
			if (result_pattern_PG2ParallelStepAfterEG_11_1_black != null) {
				CSP csp = (CSP) result_pattern_PG2ParallelStepAfterEG_11_1_black[11];

				return new Object[] { alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, altFlow, step, _this,
						csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_11_1_greenBBFBFFFFB(SimpleBPMN.Process process,
			ExclusiveGateway prevNode, ParallelStep step, CSP csp) {
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		ParallelGateway pgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		FN2S pcgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		ParallelGateway pcgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		Object _localVariable_0 = csp.getValue("sf1", "conditionExpression");
		Object _localVariable_1 = csp.getValue("sf1", "id");
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_2 = csp.getValue("pgw", "id");
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
		String sf1_conditionExpression_prime = (String) _localVariable_0;
		String sf1_id_prime = (String) _localVariable_1;
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		String pgw_id_prime = (String) _localVariable_2;
		pcgw.setIsDiverging(Boolean.valueOf(pcgw_isDiverging_prime));
		sf1.setConditionExpression(sf1_conditionExpression_prime);
		sf1.setId(sf1_id_prime);
		pgw.setId(pgw_id_prime);
		return new Object[] { process, prevNode, sf1, step, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_11_2_blackBBBBBBBB(StepAlternative alt,
			SequenceFlow sf1, AlternativeFlow altFlow, ParallelStep step, ParallelGateway pgw, FN2S pcgwToStep,
			GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { alt, sf1, altFlow, step, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_11_2_greenFBBBBBBBB(StepAlternative alt,
			SequenceFlow sf1, AlternativeFlow altFlow, ParallelStep step, ParallelGateway pgw, FN2S pcgwToStep,
			GW2S pgwToStep, ParallelGateway pcgw) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(alt);
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(altFlow);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(pgw);
		ruleresult.getCreatedLinkElements().add(pcgwToStep);
		ruleresult.getCreatedLinkElements().add(pgwToStep);
		ruleresult.getCreatedElements().add(pcgw);
		return new Object[] { ruleresult, alt, sf1, altFlow, step, pgw, pcgwToStep, pgwToStep, pcgw };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_11_3_blackBBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject alt, EObject process, EObject useCase, EObject p2uc, EObject flow, EObject prevNode, EObject cStep,
			EObject eg2cs, EObject sf1, EObject altFlow, EObject step, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
		if (!alt.equals(process)) {
			if (!alt.equals(useCase)) {
				if (!alt.equals(p2uc)) {
					if (!alt.equals(flow)) {
						if (!alt.equals(prevNode)) {
							if (!alt.equals(cStep)) {
								if (!alt.equals(eg2cs)) {
									if (!alt.equals(sf1)) {
										if (!alt.equals(altFlow)) {
											if (!alt.equals(step)) {
												if (!alt.equals(pgw)) {
													if (!alt.equals(pcgwToStep)) {
														if (!alt.equals(pgwToStep)) {
															if (!alt.equals(pcgw)) {
																if (!process.equals(useCase)) {
																	if (!process.equals(sf1)) {
																		if (!process.equals(step)) {
																			if (!p2uc.equals(process)) {
																				if (!p2uc.equals(useCase)) {
																					if (!p2uc.equals(prevNode)) {
																						if (!p2uc.equals(sf1)) {
																							if (!p2uc.equals(step)) {
																								if (!p2uc.equals(pgw)) {
																									if (!p2uc.equals(
																											pcgwToStep)) {
																										if (!p2uc
																												.equals(pgwToStep)) {
																											if (!p2uc
																													.equals(pcgw)) {
																												if (!flow
																														.equals(process)) {
																													if (!flow
																															.equals(useCase)) {
																														if (!flow
																																.equals(p2uc)) {
																															if (!flow
																																	.equals(prevNode)) {
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
																																						if (!prevNode
																																								.equals(process)) {
																																							if (!prevNode
																																									.equals(useCase)) {
																																								if (!prevNode
																																										.equals(sf1)) {
																																									if (!prevNode
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
																																																				.equals(pgw)) {
																																																			if (!cStep
																																																					.equals(pcgwToStep)) {
																																																				if (!cStep
																																																						.equals(pgwToStep)) {
																																																					if (!cStep
																																																							.equals(pcgw)) {
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
																																																															.equals(pgw)) {
																																																														if (!eg2cs
																																																																.equals(pcgwToStep)) {
																																																															if (!eg2cs
																																																																	.equals(pgwToStep)) {
																																																																if (!eg2cs
																																																																		.equals(pcgw)) {
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
																																																																									.equals(prevNode)) {
																																																																								if (!altFlow
																																																																										.equals(cStep)) {
																																																																									if (!altFlow
																																																																											.equals(eg2cs)) {
																																																																										if (!altFlow
																																																																												.equals(sf1)) {
																																																																											if (!altFlow
																																																																													.equals(step)) {
																																																																												if (!altFlow
																																																																														.equals(pgw)) {
																																																																													if (!altFlow
																																																																															.equals(pcgwToStep)) {
																																																																														if (!altFlow
																																																																																.equals(pgwToStep)) {
																																																																															if (!altFlow
																																																																																	.equals(pcgw)) {
																																																																																if (!step
																																																																																		.equals(useCase)) {
																																																																																	if (!pgw.equals(
																																																																																			process)) {
																																																																																		if (!pgw.equals(
																																																																																				useCase)) {
																																																																																			if (!pgw.equals(
																																																																																					prevNode)) {
																																																																																				if (!pgw.equals(
																																																																																						sf1)) {
																																																																																					if (!pgw.equals(
																																																																																							step)) {
																																																																																						if (!pgw.equals(
																																																																																								pgwToStep)) {
																																																																																							if (!pcgwToStep
																																																																																									.equals(process)) {
																																																																																								if (!pcgwToStep
																																																																																										.equals(useCase)) {
																																																																																									if (!pcgwToStep
																																																																																											.equals(prevNode)) {
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
																																																																																																	.equals(useCase)) {
																																																																																																if (!pgwToStep
																																																																																																		.equals(prevNode)) {
																																																																																																	if (!pgwToStep
																																																																																																			.equals(sf1)) {
																																																																																																		if (!pgwToStep
																																																																																																				.equals(step)) {
																																																																																																			if (!pcgw
																																																																																																					.equals(process)) {
																																																																																																				if (!pcgw
																																																																																																						.equals(useCase)) {
																																																																																																					if (!pcgw
																																																																																																							.equals(prevNode)) {
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
																																																																																																													alt,
																																																																																																													process,
																																																																																																													useCase,
																																																																																																													p2uc,
																																																																																																													flow,
																																																																																																													prevNode,
																																																																																																													cStep,
																																																																																																													eg2cs,
																																																																																																													sf1,
																																																																																																													altFlow,
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
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_11_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject alt, EObject process, EObject useCase, EObject prevNode,
			EObject cStep, EObject sf1, EObject altFlow, EObject step, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge altFlow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PG2ParallelStepAfterEG";
		String alt__altFlow____ref_name_prime = "ref";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__altFlow____flows_name_prime = "flows";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String cStep__alt____stepAlternatives_name_prime = "stepAlternatives";
		String altFlow__step____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String pcgwToStep__pcgw____source_name_prime = "source";
		String pcgwToStep__step____target_name_prime = "target";
		String pgwToStep__pgw____source_name_prime = "source";
		String pgwToStep__step____target_name_prime = "target";
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		ruleresult.getTranslatedEdges().add(alt__altFlow____ref);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getCreatedEdges().add(process__sf1____flowElements);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		ruleresult.getTranslatedEdges().add(useCase__altFlow____flows);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
		cStep__alt____stepAlternatives.setSrc(cStep);
		cStep__alt____stepAlternatives.setTrg(alt);
		ruleresult.getTranslatedEdges().add(cStep__alt____stepAlternatives);
		altFlow__step____steps.setSrc(altFlow);
		altFlow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(altFlow__step____steps);
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
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		cStep__alt____stepAlternatives.setName(cStep__alt____stepAlternatives_name_prime);
		altFlow__step____steps.setName(altFlow__step____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		pcgwToStep__pcgw____source.setName(pcgwToStep__pcgw____source_name_prime);
		pcgwToStep__step____target.setName(pcgwToStep__step____target_name_prime);
		pgwToStep__pgw____source.setName(pgwToStep__pgw____source_name_prime);
		pgwToStep__step____target.setName(pgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, alt, process, useCase, prevNode, cStep, sf1, altFlow, step, pgw, pcgwToStep,
				pgwToStep, pcgw, alt__altFlow____ref, process__sf1____flowElements, useCase__altFlow____flows,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, cStep__alt____stepAlternatives,
				altFlow__step____steps, process__pgw____flowElements, process__pcgw____flowElements,
				sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv, pcgwToStep__pcgw____source,
				pcgwToStep__step____target, pgwToStep__pgw____source, pgwToStep__step____target };
	}

	public static final void pattern_PG2ParallelStepAfterEG_11_5_expressionBBBBBBBBBBBBBBBBB(
			PG2ParallelStepAfterEG _this, PerformRuleResult ruleresult, EObject alt, EObject process, EObject useCase,
			EObject p2uc, EObject flow, EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject altFlow,
			EObject step, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_BWD(ruleresult, alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, altFlow,
				step, pgw, pcgwToStep, pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_PG2ParallelStepAfterEG_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_12_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_12_1_blackFBB(EClass eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_12_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_12_1_binding = pattern_PG2ParallelStepAfterEG_12_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_12_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_12_1_black = pattern_PG2ParallelStepAfterEG_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "PG2ParallelStepAfterEG";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_12_2_bindingFFFFFFB(Match match) {
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
							if (tmpStep instanceof ParallelStep) {
								ParallelStep step = (ParallelStep) tmpStep;
								return new Object[] { alt, useCase, flow, cStep, altFlow, step, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_12_2_blackBFBFBFBFBBB(StepAlternative alt,
			UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow, ParallelStep step, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!altFlow.equals(flow)) {
			for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(useCase, P2UC.class,
					"target")) {
				SimpleBPMN.Process process = p2uc.getSource();
				if (process != null) {
					for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cStep,
							GW2S.class, "target")) {
						Gateway tmpPrevNode = eg2cs.getSource();
						if (tmpPrevNode instanceof ExclusiveGateway) {
							ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								_result.add(new Object[] { alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs,
										altFlow, step, match });
							}

						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_12_3_blackBBBBBBBBBB(StepAlternative alt,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, AlternativeFlow altFlow, ParallelStep step) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
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
																	flow, prevNode, cStep, eg2cs, altFlow, step });
														}

													}
												}
											}
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_12_3_greenBBBBBBBBBBFFFFFFFFFFFF(StepAlternative alt,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, AlternativeFlow altFlow, ParallelStep step) {
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
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(cStep);
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
		return new Object[] { alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, altFlow, step,
				isApplicableMatch, alt__altFlow____ref, process__prevNode____flowElements, useCase__flow____flows,
				useCase__altFlow____flows, p2uc__process____source, p2uc__useCase____target, flow__cStep____steps,
				cStep__alt____stepAlternatives, eg2cs__prevNode____source, eg2cs__cStep____target,
				altFlow__step____steps };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_12_4_bindingFBBBBBBBBBBBB(PG2ParallelStepAfterEG _this,
			IsApplicableMatch isApplicableMatch, StepAlternative alt, SimpleBPMN.Process process, UseCase useCase,
			P2UC p2uc, Flow flow, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs, AlternativeFlow altFlow,
			ParallelStep step) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, alt, process, useCase, p2uc, flow,
				prevNode, cStep, eg2cs, altFlow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, alt, process, useCase, p2uc, flow, prevNode, cStep,
					eg2cs, altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_12_4_bindingAndBlackFBBBBBBBBBBBB(
			PG2ParallelStepAfterEG _this, IsApplicableMatch isApplicableMatch, StepAlternative alt,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, AlternativeFlow altFlow, ParallelStep step) {
		Object[] result_pattern_PG2ParallelStepAfterEG_12_4_binding = pattern_PG2ParallelStepAfterEG_12_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, altFlow, step);
		if (result_pattern_PG2ParallelStepAfterEG_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepAfterEG_12_4_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_12_4_black = pattern_PG2ParallelStepAfterEG_12_4_blackB(csp);
			if (result_pattern_PG2ParallelStepAfterEG_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, alt, process, useCase, p2uc, flow, prevNode, cStep,
						eg2cs, altFlow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_12_5_expressionFBB(PG2ParallelStepAfterEG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PG2ParallelStepAfterEG";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PG2ParallelStepAfterEG_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_20_1_binding = pattern_PG2ParallelStepAfterEG_20_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_20_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_20_1_black = pattern_PG2ParallelStepAfterEG_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_2_black_nac_0BB(StepAlternative alt,
			ChoiceStep cStep) {
		for (ChoiceStep __DEC_alt_stepAlternatives_465405 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
			if (!cStep.equals(__DEC_alt_stepAlternatives_465405)) {
				return new Object[] { alt, cStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_2_black_nac_1BB(AlternativeFlow altFlow,
			StepAlternative alt) {
		for (StepAlternative __DEC_altFlow_ref_998463 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
			if (!alt.equals(__DEC_altFlow_ref_998463)) {
				return new Object[] { altFlow, alt };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_2_black_nac_2BB(AlternativeFlow altFlow,
			UseCase useCase) {
		for (UseCase __DEC_altFlow_flows_867772 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_altFlow_flows_867772)) {
				return new Object[] { altFlow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_2_black_nac_3BBB(ParallelStep step, Flow flow,
			AlternativeFlow altFlow) {
		if (!altFlow.equals(flow)) {
			for (Flow __DEC_step_steps_233259 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!flow.equals(__DEC_step_steps_233259)) {
					if (!altFlow.equals(__DEC_step_steps_233259)) {
						return new Object[] { step, flow, altFlow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_2_black_nac_4BB(ParallelStep step,
			ChoiceStep cStep) {
		for (Step __DEC_step_next_415289 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_415289)) {
				if (!cStep.equals(__DEC_step_next_415289)) {
					return new Object[] { step, cStep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_2_black_nac_5BB(Flow flow, ParallelStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_2_black_nac_6BB(ChoiceStep cStep,
			ParallelStep step) {
		if (step.equals(cStep.getNext())) {
			return new Object[] { cStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_20_2_blackFFFFFFB(EMoflonEdge _edge_ref) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAlt = _edge_ref.getSrc();
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			EObject tmpAltFlow = _edge_ref.getTrg();
			if (tmpAltFlow instanceof AlternativeFlow) {
				AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
				if (altFlow.equals(alt.getRef())) {
					if (pattern_PG2ParallelStepAfterEG_20_2_black_nac_1BB(altFlow, alt) == null) {
						for (Step tmpStep : altFlow.getSteps()) {
							if (tmpStep instanceof ParallelStep) {
								ParallelStep step = (ParallelStep) tmpStep;
								for (ChoiceStep cStep : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
									if (pattern_PG2ParallelStepAfterEG_20_2_black_nac_0BB(alt, cStep) == null) {
										if (pattern_PG2ParallelStepAfterEG_20_2_black_nac_4BB(step, cStep) == null) {
											if (pattern_PG2ParallelStepAfterEG_20_2_black_nac_6BB(cStep,
													step) == null) {
												for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
													if (pattern_PG2ParallelStepAfterEG_20_2_black_nac_2BB(altFlow,
															useCase) == null) {
														for (Flow flow : useCase.getFlows()) {
															if (!altFlow.equals(flow)) {
																if (flow.getSteps().contains(cStep)) {
																	if (pattern_PG2ParallelStepAfterEG_20_2_black_nac_3BBB(
																			step, flow, altFlow) == null) {
																		if (pattern_PG2ParallelStepAfterEG_20_2_black_nac_5BB(
																				flow, step) == null) {
																			_result.add(new Object[] { alt, useCase,
																					flow, cStep, altFlow, step,
																					_edge_ref });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_20_3_expressionFBBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, alt, useCase, flow, cStep, altFlow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_20_4_expressionFBB(PG2ParallelStepAfterEG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterEG_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_21_1_binding = pattern_PG2ParallelStepAfterEG_21_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_21_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_21_1_black = pattern_PG2ParallelStepAfterEG_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_210842 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_210842)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_153253 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_153253)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_2_black_nac_2BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_290314 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_290314)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_456221 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_456221)) {
					if (!prevNode.equals(__DEC_pgw___conv_456221)) {
						if (!pcgw.equals(__DEC_pgw___conv_456221)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_389512 = pcgw.get__conv();
			if (__DEC_pcgw___conv_389512 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_389512)) {
					if (!prevNode.equals(__DEC_pcgw___conv_389512)) {
						if (!pgw.equals(__DEC_pcgw___conv_389512)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_2_black_nac_5BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_986893 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_986893)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_86300 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_86300)) {
					if (!prevNode.equals(__DEC_pcgw___conv_86300)) {
						if (!pgw.equals(__DEC_pcgw___conv_86300)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_21_2_blackFFFFFB(
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
					if (tmpPrevNode instanceof ExclusiveGateway) {
						ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
						if (process.getFlowElements().contains(prevNode)) {
							FlowNode tmpPgw = sf1.getTargetRef();
							if (tmpPgw instanceof ParallelGateway) {
								ParallelGateway pgw = (ParallelGateway) tmpPgw;
								if (process.getFlowElements().contains(pgw)) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
										Gateway tmpPcgw = pgw.get__conv();
										if (tmpPcgw instanceof ParallelGateway) {
											ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
											if (!pcgw.equals(pgw)) {
												if (process.getFlowElements().contains(pcgw)) {
													boolean pgwisDiverging = pgw.isIsDiverging();
													if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
														boolean pcgwisDiverging = pcgw.isIsDiverging();
														if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
															if (pattern_PG2ParallelStepAfterEG_21_2_black_nac_1BB(sf1,
																	process) == null) {
																if (pattern_PG2ParallelStepAfterEG_21_2_black_nac_0BB(
																		sf1, prevNode) == null) {
																	if (pattern_PG2ParallelStepAfterEG_21_2_black_nac_7BB(
																			prevNode, sf1) == null) {
																		if (pattern_PG2ParallelStepAfterEG_21_2_black_nac_2BB(
																				pgw, process) == null) {
																			if (pattern_PG2ParallelStepAfterEG_21_2_black_nac_8BB(
																					prevNode, pgw) == null) {
																				if (pattern_PG2ParallelStepAfterEG_21_2_black_nac_3BBB(
																						pgw, prevNode, pcgw) == null) {
																					if (pattern_PG2ParallelStepAfterEG_21_2_black_nac_4BBB(
																							pcgw, prevNode,
																							pgw) == null) {
																						if (pattern_PG2ParallelStepAfterEG_21_2_black_nac_5BB(
																								pcgw,
																								process) == null) {
																							if (pattern_PG2ParallelStepAfterEG_21_2_black_nac_6BBB(
																									pcgw, prevNode,
																									pgw) == null) {
																								if (pattern_PG2ParallelStepAfterEG_21_2_black_nac_9BB(
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_21_3_expressionFBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_21_4_expressionFBB(PG2ParallelStepAfterEG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterEG_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_22_1_binding = pattern_PG2ParallelStepAfterEG_22_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_22_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_22_1_black = pattern_PG2ParallelStepAfterEG_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_2_black_nac_0BB(StepAlternative alt,
			ChoiceStep cStep) {
		for (ChoiceStep __DEC_alt_stepAlternatives_629452 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
			if (!cStep.equals(__DEC_alt_stepAlternatives_629452)) {
				return new Object[] { alt, cStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_2_black_nac_1BB(AlternativeFlow altFlow,
			StepAlternative alt) {
		for (StepAlternative __DEC_altFlow_ref_113612 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
			if (!alt.equals(__DEC_altFlow_ref_113612)) {
				return new Object[] { altFlow, alt };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_2_black_nac_2BB(AlternativeFlow altFlow,
			UseCase useCase) {
		for (UseCase __DEC_altFlow_flows_971168 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_altFlow_flows_971168)) {
				return new Object[] { altFlow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_2_black_nac_3BBB(ParallelStep step, Flow flow,
			AlternativeFlow altFlow) {
		if (!altFlow.equals(flow)) {
			for (Flow __DEC_step_steps_976930 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!flow.equals(__DEC_step_steps_976930)) {
					if (!altFlow.equals(__DEC_step_steps_976930)) {
						return new Object[] { step, flow, altFlow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_2_black_nac_4BB(ParallelStep step,
			ChoiceStep cStep) {
		for (Step __DEC_step_next_812503 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_812503)) {
				if (!cStep.equals(__DEC_step_next_812503)) {
					return new Object[] { step, cStep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_2_black_nac_5BB(Flow flow, ParallelStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_2_black_nac_6BB(ChoiceStep cStep,
			ParallelStep step) {
		if (step.equals(cStep.getNext())) {
			return new Object[] { cStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_22_2_blackFFFFFFB(EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpAltFlow = _edge_flows.getTrg();
			if (tmpAltFlow instanceof AlternativeFlow) {
				AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
				if (useCase.getFlows().contains(altFlow)) {
					if (pattern_PG2ParallelStepAfterEG_22_2_black_nac_2BB(altFlow, useCase) == null) {
						for (Flow flow : useCase.getFlows()) {
							if (!altFlow.equals(flow)) {
								for (Step tmpStep : altFlow.getSteps()) {
									if (tmpStep instanceof ParallelStep) {
										ParallelStep step = (ParallelStep) tmpStep;
										if (pattern_PG2ParallelStepAfterEG_22_2_black_nac_3BBB(step, flow,
												altFlow) == null) {
											if (pattern_PG2ParallelStepAfterEG_22_2_black_nac_5BB(flow, step) == null) {
												for (Step tmpCStep : flow.getSteps()) {
													if (tmpCStep instanceof ChoiceStep) {
														ChoiceStep cStep = (ChoiceStep) tmpCStep;
														if (pattern_PG2ParallelStepAfterEG_22_2_black_nac_4BB(step,
																cStep) == null) {
															if (pattern_PG2ParallelStepAfterEG_22_2_black_nac_6BB(cStep,
																	step) == null) {
																for (StepAlternative alt : cStep
																		.getStepAlternatives()) {
																	if (altFlow.equals(alt.getRef())) {
																		if (pattern_PG2ParallelStepAfterEG_22_2_black_nac_0BB(
																				alt, cStep) == null) {
																			if (pattern_PG2ParallelStepAfterEG_22_2_black_nac_1BB(
																					altFlow, alt) == null) {
																				_result.add(new Object[] { alt, useCase,
																						flow, cStep, altFlow, step,
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_22_3_expressionFBBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, alt, useCase, flow, cStep, altFlow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_22_4_expressionFBB(PG2ParallelStepAfterEG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterEG_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_23_1_binding = pattern_PG2ParallelStepAfterEG_23_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_23_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_23_1_black = pattern_PG2ParallelStepAfterEG_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_955311 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_955311)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_27165 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_27165)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_2_black_nac_2BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_722612 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_722612)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_999637 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_999637)) {
					if (!prevNode.equals(__DEC_pgw___conv_999637)) {
						if (!pcgw.equals(__DEC_pgw___conv_999637)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_382050 = pcgw.get__conv();
			if (__DEC_pcgw___conv_382050 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_382050)) {
					if (!prevNode.equals(__DEC_pcgw___conv_382050)) {
						if (!pgw.equals(__DEC_pcgw___conv_382050)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_2_black_nac_5BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_796458 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_796458)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_935341 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_935341)) {
					if (!prevNode.equals(__DEC_pcgw___conv_935341)) {
						if (!pgw.equals(__DEC_pcgw___conv_935341)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_23_2_blackFFFFFB(
			EMoflonEdge _edge_sourceRef) {
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
						if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
							Gateway tmpPcgw = pgw.get__conv();
							if (tmpPcgw instanceof ParallelGateway) {
								ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
								if (!pcgw.equals(pgw)) {
									boolean pgwisDiverging = pgw.isIsDiverging();
									if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
										boolean pcgwisDiverging = pcgw.isIsDiverging();
										if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
											if (pattern_PG2ParallelStepAfterEG_23_2_black_nac_0BB(sf1,
													prevNode) == null) {
												if (pattern_PG2ParallelStepAfterEG_23_2_black_nac_7BB(prevNode,
														sf1) == null) {
													if (pattern_PG2ParallelStepAfterEG_23_2_black_nac_8BB(prevNode,
															pgw) == null) {
														if (pattern_PG2ParallelStepAfterEG_23_2_black_nac_3BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_PG2ParallelStepAfterEG_23_2_black_nac_4BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_PG2ParallelStepAfterEG_23_2_black_nac_6BBB(
																		pcgw, prevNode, pgw) == null) {
																	if (pattern_PG2ParallelStepAfterEG_23_2_black_nac_9BB(
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
																						if (pattern_PG2ParallelStepAfterEG_23_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_PG2ParallelStepAfterEG_23_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_PG2ParallelStepAfterEG_23_2_black_nac_5BB(
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_23_3_expressionFBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_23_4_expressionFBB(PG2ParallelStepAfterEG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_23_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterEG_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_24_1_binding = pattern_PG2ParallelStepAfterEG_24_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_24_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_24_1_black = pattern_PG2ParallelStepAfterEG_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_215254 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_215254)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_401450 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_401450)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_2_black_nac_2BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_266325 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_266325)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_706460 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_706460)) {
					if (!prevNode.equals(__DEC_pgw___conv_706460)) {
						if (!pcgw.equals(__DEC_pgw___conv_706460)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_418037 = pcgw.get__conv();
			if (__DEC_pcgw___conv_418037 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_418037)) {
					if (!prevNode.equals(__DEC_pcgw___conv_418037)) {
						if (!pgw.equals(__DEC_pcgw___conv_418037)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_2_black_nac_5BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_535474 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_535474)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_849640 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_849640)) {
					if (!prevNode.equals(__DEC_pcgw___conv_849640)) {
						if (!pgw.equals(__DEC_pcgw___conv_849640)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_24_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
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
											if (pattern_PG2ParallelStepAfterEG_24_2_black_nac_0BB(sf1,
													prevNode) == null) {
												if (pattern_PG2ParallelStepAfterEG_24_2_black_nac_7BB(prevNode,
														sf1) == null) {
													if (pattern_PG2ParallelStepAfterEG_24_2_black_nac_8BB(prevNode,
															pgw) == null) {
														if (pattern_PG2ParallelStepAfterEG_24_2_black_nac_3BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_PG2ParallelStepAfterEG_24_2_black_nac_4BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_PG2ParallelStepAfterEG_24_2_black_nac_6BBB(
																		pcgw, prevNode, pgw) == null) {
																	if (pattern_PG2ParallelStepAfterEG_24_2_black_nac_9BB(
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
																						if (pattern_PG2ParallelStepAfterEG_24_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_PG2ParallelStepAfterEG_24_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_PG2ParallelStepAfterEG_24_2_black_nac_5BB(
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_24_3_expressionFBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_24_4_expressionFBB(PG2ParallelStepAfterEG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_24_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterEG_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_25_1_binding = pattern_PG2ParallelStepAfterEG_25_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_25_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_25_1_black = pattern_PG2ParallelStepAfterEG_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_2_black_nac_0BB(StepAlternative alt,
			ChoiceStep cStep) {
		for (ChoiceStep __DEC_alt_stepAlternatives_973035 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
			if (!cStep.equals(__DEC_alt_stepAlternatives_973035)) {
				return new Object[] { alt, cStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_2_black_nac_1BB(AlternativeFlow altFlow,
			StepAlternative alt) {
		for (StepAlternative __DEC_altFlow_ref_852288 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
			if (!alt.equals(__DEC_altFlow_ref_852288)) {
				return new Object[] { altFlow, alt };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_2_black_nac_2BB(AlternativeFlow altFlow,
			UseCase useCase) {
		for (UseCase __DEC_altFlow_flows_566867 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_altFlow_flows_566867)) {
				return new Object[] { altFlow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_2_black_nac_3BBB(ParallelStep step, Flow flow,
			AlternativeFlow altFlow) {
		if (!altFlow.equals(flow)) {
			for (Flow __DEC_step_steps_577577 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!flow.equals(__DEC_step_steps_577577)) {
					if (!altFlow.equals(__DEC_step_steps_577577)) {
						return new Object[] { step, flow, altFlow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_2_black_nac_4BB(ParallelStep step,
			ChoiceStep cStep) {
		for (Step __DEC_step_next_490219 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_490219)) {
				if (!cStep.equals(__DEC_step_next_490219)) {
					return new Object[] { step, cStep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_2_black_nac_5BB(Flow flow, ParallelStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_2_black_nac_6BB(ChoiceStep cStep,
			ParallelStep step) {
		if (step.equals(cStep.getNext())) {
			return new Object[] { cStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_25_2_blackFFFFFFB(
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
						if (pattern_PG2ParallelStepAfterEG_25_2_black_nac_0BB(alt, cStep) == null) {
							if (pattern_PG2ParallelStepAfterEG_25_2_black_nac_1BB(altFlow, alt) == null) {
								for (Step tmpStep : altFlow.getSteps()) {
									if (tmpStep instanceof ParallelStep) {
										ParallelStep step = (ParallelStep) tmpStep;
										if (pattern_PG2ParallelStepAfterEG_25_2_black_nac_4BB(step, cStep) == null) {
											if (pattern_PG2ParallelStepAfterEG_25_2_black_nac_6BB(cStep,
													step) == null) {
												for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(cStep, Flow.class, "steps")) {
													if (!altFlow.equals(flow)) {
														if (pattern_PG2ParallelStepAfterEG_25_2_black_nac_3BBB(step,
																flow, altFlow) == null) {
															if (pattern_PG2ParallelStepAfterEG_25_2_black_nac_5BB(flow,
																	step) == null) {
																for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(altFlow,
																				UseCase.class, "flows")) {
																	if (useCase.getFlows().contains(flow)) {
																		if (pattern_PG2ParallelStepAfterEG_25_2_black_nac_2BB(
																				altFlow, useCase) == null) {
																			_result.add(new Object[] { alt, useCase,
																					flow, cStep, altFlow, step,
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_25_3_expressionFBBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, alt, useCase, flow, cStep, altFlow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_25_4_expressionFBB(PG2ParallelStepAfterEG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_25_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterEG_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_26_1_binding = pattern_PG2ParallelStepAfterEG_26_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_26_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_26_1_black = pattern_PG2ParallelStepAfterEG_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_2_black_nac_0BB(StepAlternative alt,
			ChoiceStep cStep) {
		for (ChoiceStep __DEC_alt_stepAlternatives_307786 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
			if (!cStep.equals(__DEC_alt_stepAlternatives_307786)) {
				return new Object[] { alt, cStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_2_black_nac_1BB(AlternativeFlow altFlow,
			StepAlternative alt) {
		for (StepAlternative __DEC_altFlow_ref_513584 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
			if (!alt.equals(__DEC_altFlow_ref_513584)) {
				return new Object[] { altFlow, alt };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_2_black_nac_2BB(AlternativeFlow altFlow,
			UseCase useCase) {
		for (UseCase __DEC_altFlow_flows_896214 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_altFlow_flows_896214)) {
				return new Object[] { altFlow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_2_black_nac_3BBB(ParallelStep step, Flow flow,
			AlternativeFlow altFlow) {
		if (!altFlow.equals(flow)) {
			for (Flow __DEC_step_steps_242726 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!flow.equals(__DEC_step_steps_242726)) {
					if (!altFlow.equals(__DEC_step_steps_242726)) {
						return new Object[] { step, flow, altFlow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_2_black_nac_4BB(ParallelStep step,
			ChoiceStep cStep) {
		for (Step __DEC_step_next_660653 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_660653)) {
				if (!cStep.equals(__DEC_step_next_660653)) {
					return new Object[] { step, cStep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_2_black_nac_5BB(Flow flow, ParallelStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_2_black_nac_6BB(ChoiceStep cStep,
			ParallelStep step) {
		if (step.equals(cStep.getNext())) {
			return new Object[] { cStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_26_2_blackFFFFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAltFlow = _edge_steps.getSrc();
		if (tmpAltFlow instanceof AlternativeFlow) {
			AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (altFlow.getSteps().contains(step)) {
					for (StepAlternative alt : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
						if (pattern_PG2ParallelStepAfterEG_26_2_black_nac_1BB(altFlow, alt) == null) {
							for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
								if (pattern_PG2ParallelStepAfterEG_26_2_black_nac_2BB(altFlow, useCase) == null) {
									for (Flow flow : useCase.getFlows()) {
										if (!altFlow.equals(flow)) {
											if (pattern_PG2ParallelStepAfterEG_26_2_black_nac_3BBB(step, flow,
													altFlow) == null) {
												if (pattern_PG2ParallelStepAfterEG_26_2_black_nac_5BB(flow,
														step) == null) {
													for (Step tmpCStep : flow.getSteps()) {
														if (tmpCStep instanceof ChoiceStep) {
															ChoiceStep cStep = (ChoiceStep) tmpCStep;
															if (cStep.getStepAlternatives().contains(alt)) {
																if (pattern_PG2ParallelStepAfterEG_26_2_black_nac_0BB(
																		alt, cStep) == null) {
																	if (pattern_PG2ParallelStepAfterEG_26_2_black_nac_4BB(
																			step, cStep) == null) {
																		if (pattern_PG2ParallelStepAfterEG_26_2_black_nac_6BB(
																				cStep, step) == null) {
																			_result.add(new Object[] { alt, useCase,
																					flow, cStep, altFlow, step,
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_26_3_expressionFBBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, alt, useCase, flow, cStep, altFlow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_26_4_expressionFBB(PG2ParallelStepAfterEG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_26_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterEG_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_27_1_binding = pattern_PG2ParallelStepAfterEG_27_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_27_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_27_1_black = pattern_PG2ParallelStepAfterEG_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_455884 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_455884)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_797448 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_797448)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_2_black_nac_2BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_750683 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_750683)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_885052 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_885052)) {
					if (!prevNode.equals(__DEC_pgw___conv_885052)) {
						if (!pcgw.equals(__DEC_pgw___conv_885052)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_165930 = pcgw.get__conv();
			if (__DEC_pcgw___conv_165930 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_165930)) {
					if (!prevNode.equals(__DEC_pcgw___conv_165930)) {
						if (!pgw.equals(__DEC_pcgw___conv_165930)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_2_black_nac_5BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_660079 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_660079)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_3378 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_3378)) {
					if (!prevNode.equals(__DEC_pcgw___conv_3378)) {
						if (!pgw.equals(__DEC_pcgw___conv_3378)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_27_2_blackFFFFFB(
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
										if (pattern_PG2ParallelStepAfterEG_27_2_black_nac_2BB(pgw, process) == null) {
											if (pattern_PG2ParallelStepAfterEG_27_2_black_nac_5BB(pcgw,
													process) == null) {
												for (FlowElement tmpPrevNode : process.getFlowElements()) {
													if (tmpPrevNode instanceof ExclusiveGateway) {
														ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
														boolean prevNodeisDiverging = prevNode.isIsDiverging();
														if (Boolean.valueOf(prevNodeisDiverging)
																.equals(Boolean.valueOf(true))) {
															if (pattern_PG2ParallelStepAfterEG_27_2_black_nac_3BBB(pgw,
																	prevNode, pcgw) == null) {
																if (pattern_PG2ParallelStepAfterEG_27_2_black_nac_4BBB(
																		pcgw, prevNode, pgw) == null) {
																	if (pattern_PG2ParallelStepAfterEG_27_2_black_nac_6BBB(
																			pcgw, prevNode, pgw) == null) {
																		if (pattern_PG2ParallelStepAfterEG_27_2_black_nac_8BB(
																				prevNode, pgw) == null) {
																			if (pattern_PG2ParallelStepAfterEG_27_2_black_nac_9BB(
																					pcgw, prevNode) == null) {
																				for (FlowElement tmpSf1 : process
																						.getFlowElements()) {
																					if (tmpSf1 instanceof SequenceFlow) {
																						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																						if (prevNode.equals(
																								sf1.getSourceRef())) {
																							if (pgw.equals(sf1
																									.getTargetRef())) {
																								if (pattern_PG2ParallelStepAfterEG_27_2_black_nac_0BB(
																										sf1,
																										prevNode) == null) {
																									if (pattern_PG2ParallelStepAfterEG_27_2_black_nac_1BB(
																											sf1,
																											process) == null) {
																										if (pattern_PG2ParallelStepAfterEG_27_2_black_nac_7BB(
																												prevNode,
																												sf1) == null) {
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_27_3_expressionFBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_27_4_expressionFBB(PG2ParallelStepAfterEG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_27_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterEG_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_28_1_binding = pattern_PG2ParallelStepAfterEG_28_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_28_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_28_1_black = pattern_PG2ParallelStepAfterEG_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_449224 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_449224)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_971226 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_971226)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_2_black_nac_2BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_228716 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_228716)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_689055 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_689055)) {
					if (!prevNode.equals(__DEC_pgw___conv_689055)) {
						if (!pcgw.equals(__DEC_pgw___conv_689055)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_639214 = pcgw.get__conv();
			if (__DEC_pcgw___conv_639214 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_639214)) {
					if (!prevNode.equals(__DEC_pcgw___conv_639214)) {
						if (!pgw.equals(__DEC_pcgw___conv_639214)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_2_black_nac_5BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_920869 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_920869)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_616166 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_616166)) {
					if (!prevNode.equals(__DEC_pcgw___conv_616166)) {
						if (!pgw.equals(__DEC_pcgw___conv_616166)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_28_2_blackFFFFFB(
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
						if (pattern_PG2ParallelStepAfterEG_28_2_black_nac_5BB(pcgw, process) == null) {
							for (FlowElement tmpPrevNode : process.getFlowElements()) {
								if (tmpPrevNode instanceof ExclusiveGateway) {
									ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
										if (pattern_PG2ParallelStepAfterEG_28_2_black_nac_9BB(pcgw, prevNode) == null) {
											for (FlowElement tmpSf1 : process.getFlowElements()) {
												if (tmpSf1 instanceof SequenceFlow) {
													SequenceFlow sf1 = (SequenceFlow) tmpSf1;
													if (prevNode.equals(sf1.getSourceRef())) {
														FlowNode tmpPgw = sf1.getTargetRef();
														if (tmpPgw instanceof ParallelGateway) {
															ParallelGateway pgw = (ParallelGateway) tmpPgw;
															if (!pcgw.equals(pgw)) {
																if (process.getFlowElements().contains(pgw)) {
																	if (pcgw.equals(pgw.get__conv())) {
																		boolean pgwisDiverging = pgw.isIsDiverging();
																		if (Boolean.valueOf(pgwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			if (pattern_PG2ParallelStepAfterEG_28_2_black_nac_0BB(
																					sf1, prevNode) == null) {
																				if (pattern_PG2ParallelStepAfterEG_28_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_PG2ParallelStepAfterEG_28_2_black_nac_7BB(
																							prevNode, sf1) == null) {
																						if (pattern_PG2ParallelStepAfterEG_28_2_black_nac_2BB(
																								pgw, process) == null) {
																							if (pattern_PG2ParallelStepAfterEG_28_2_black_nac_3BBB(
																									pgw, prevNode,
																									pcgw) == null) {
																								if (pattern_PG2ParallelStepAfterEG_28_2_black_nac_4BBB(
																										pcgw, prevNode,
																										pgw) == null) {
																									if (pattern_PG2ParallelStepAfterEG_28_2_black_nac_6BBB(
																											pcgw,
																											prevNode,
																											pgw) == null) {
																										if (pattern_PG2ParallelStepAfterEG_28_2_black_nac_8BB(
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_28_3_expressionFBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_28_4_expressionFBB(PG2ParallelStepAfterEG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_28_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterEG_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_29_1_binding = pattern_PG2ParallelStepAfterEG_29_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_29_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_29_1_black = pattern_PG2ParallelStepAfterEG_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_979674 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_979674)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_889782 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_889782)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_2_black_nac_2BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_117567 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_117567)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_79187 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_79187)) {
					if (!prevNode.equals(__DEC_pgw___conv_79187)) {
						if (!pcgw.equals(__DEC_pgw___conv_79187)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_376659 = pcgw.get__conv();
			if (__DEC_pcgw___conv_376659 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_376659)) {
					if (!prevNode.equals(__DEC_pcgw___conv_376659)) {
						if (!pgw.equals(__DEC_pcgw___conv_376659)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_2_black_nac_5BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_644401 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_644401)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_28573 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_28573)) {
					if (!prevNode.equals(__DEC_pcgw___conv_28573)) {
						if (!pgw.equals(__DEC_pcgw___conv_28573)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_29_2_blackFFFFFB(
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
					if (tmpPrevNode instanceof ExclusiveGateway) {
						ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
						Gateway tmpPcgw = pgw.get__conv();
						if (tmpPcgw instanceof ParallelGateway) {
							ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
							if (!pcgw.equals(pgw)) {
								boolean pgwisDiverging = pgw.isIsDiverging();
								if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
										boolean pcgwisDiverging = pcgw.isIsDiverging();
										if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
											if (pattern_PG2ParallelStepAfterEG_29_2_black_nac_0BB(sf1,
													prevNode) == null) {
												if (pattern_PG2ParallelStepAfterEG_29_2_black_nac_7BB(prevNode,
														sf1) == null) {
													if (pattern_PG2ParallelStepAfterEG_29_2_black_nac_8BB(prevNode,
															pgw) == null) {
														if (pattern_PG2ParallelStepAfterEG_29_2_black_nac_3BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_PG2ParallelStepAfterEG_29_2_black_nac_4BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_PG2ParallelStepAfterEG_29_2_black_nac_6BBB(
																		pcgw, prevNode, pgw) == null) {
																	if (pattern_PG2ParallelStepAfterEG_29_2_black_nac_9BB(
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
																						if (pattern_PG2ParallelStepAfterEG_29_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_PG2ParallelStepAfterEG_29_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_PG2ParallelStepAfterEG_29_2_black_nac_5BB(
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_29_3_expressionFBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_29_4_expressionFBB(PG2ParallelStepAfterEG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_29_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterEG_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_30_1_binding = pattern_PG2ParallelStepAfterEG_30_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_30_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_30_1_black = pattern_PG2ParallelStepAfterEG_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_588058 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_588058)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_26970 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_26970)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_2_black_nac_2BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_614827 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_614827)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_695115 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_695115)) {
					if (!prevNode.equals(__DEC_pgw___conv_695115)) {
						if (!pcgw.equals(__DEC_pgw___conv_695115)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_887106 = pcgw.get__conv();
			if (__DEC_pcgw___conv_887106 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_887106)) {
					if (!prevNode.equals(__DEC_pcgw___conv_887106)) {
						if (!pgw.equals(__DEC_pcgw___conv_887106)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_2_black_nac_5BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_478390 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_478390)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_565665 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_565665)) {
					if (!prevNode.equals(__DEC_pcgw___conv_565665)) {
						if (!pgw.equals(__DEC_pcgw___conv_565665)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_30_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											if (pattern_PG2ParallelStepAfterEG_30_2_black_nac_0BB(sf1,
													prevNode) == null) {
												if (pattern_PG2ParallelStepAfterEG_30_2_black_nac_3BBB(pgw, prevNode,
														pcgw) == null) {
													if (pattern_PG2ParallelStepAfterEG_30_2_black_nac_4BBB(pcgw,
															prevNode, pgw) == null) {
														if (pattern_PG2ParallelStepAfterEG_30_2_black_nac_6BBB(pcgw,
																prevNode, pgw) == null) {
															if (pattern_PG2ParallelStepAfterEG_30_2_black_nac_7BB(
																	prevNode, sf1) == null) {
																if (pattern_PG2ParallelStepAfterEG_30_2_black_nac_8BB(
																		prevNode, pgw) == null) {
																	if (pattern_PG2ParallelStepAfterEG_30_2_black_nac_9BB(
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
																						if (pattern_PG2ParallelStepAfterEG_30_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_PG2ParallelStepAfterEG_30_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_PG2ParallelStepAfterEG_30_2_black_nac_5BB(
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_30_3_expressionFBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_30_4_expressionFBB(PG2ParallelStepAfterEG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_30_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterEG_30_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_1_bindingFB(PG2ParallelStepAfterEG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_1_blackFBB(EClass __eClass,
			PG2ParallelStepAfterEG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_1_bindingAndBlackFFB(PG2ParallelStepAfterEG _this) {
		Object[] result_pattern_PG2ParallelStepAfterEG_31_1_binding = pattern_PG2ParallelStepAfterEG_31_1_bindingFB(
				_this);
		if (result_pattern_PG2ParallelStepAfterEG_31_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepAfterEG_31_1_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_31_1_black = pattern_PG2ParallelStepAfterEG_31_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepAfterEG_31_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepAfterEG_31_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_22595 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_22595)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_826392 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_826392)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_2_black_nac_2BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_58759 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_58759)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_910437 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_910437)) {
					if (!prevNode.equals(__DEC_pgw___conv_910437)) {
						if (!pcgw.equals(__DEC_pgw___conv_910437)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_752798 = pcgw.get__conv();
			if (__DEC_pcgw___conv_752798 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_752798)) {
					if (!prevNode.equals(__DEC_pcgw___conv_752798)) {
						if (!pgw.equals(__DEC_pcgw___conv_752798)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_2_black_nac_5BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_233988 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_233988)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_935948 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_935948)) {
					if (!prevNode.equals(__DEC_pcgw___conv_935948)) {
						if (!pgw.equals(__DEC_pcgw___conv_935948)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_31_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											if (pattern_PG2ParallelStepAfterEG_31_2_black_nac_0BB(sf1,
													prevNode) == null) {
												if (pattern_PG2ParallelStepAfterEG_31_2_black_nac_3BBB(pgw, prevNode,
														pcgw) == null) {
													if (pattern_PG2ParallelStepAfterEG_31_2_black_nac_4BBB(pcgw,
															prevNode, pgw) == null) {
														if (pattern_PG2ParallelStepAfterEG_31_2_black_nac_6BBB(pcgw,
																prevNode, pgw) == null) {
															if (pattern_PG2ParallelStepAfterEG_31_2_black_nac_7BB(
																	prevNode, sf1) == null) {
																if (pattern_PG2ParallelStepAfterEG_31_2_black_nac_8BB(
																		prevNode, pgw) == null) {
																	if (pattern_PG2ParallelStepAfterEG_31_2_black_nac_9BB(
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
																						if (pattern_PG2ParallelStepAfterEG_31_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_PG2ParallelStepAfterEG_31_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_PG2ParallelStepAfterEG_31_2_black_nac_5BB(
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepAfterEG_31_3_expressionFBBBBBBB(PG2ParallelStepAfterEG _this,
			Match match, SimpleBPMN.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_31_4_expressionFBB(PG2ParallelStepAfterEG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_31_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepAfterEG_31_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_34_1_blackB(PG2ParallelStepAfterEG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_34_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_34_2_bindingFFFFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("alt");
		EObject _localVariable_1 = sourceMatch.getObject("process");
		EObject _localVariable_2 = targetMatch.getObject("useCase");
		EObject _localVariable_3 = targetMatch.getObject("flow");
		EObject _localVariable_4 = sourceMatch.getObject("prevNode");
		EObject _localVariable_5 = targetMatch.getObject("cStep");
		EObject _localVariable_6 = sourceMatch.getObject("sf1");
		EObject _localVariable_7 = targetMatch.getObject("altFlow");
		EObject _localVariable_8 = targetMatch.getObject("step");
		EObject _localVariable_9 = sourceMatch.getObject("pgw");
		EObject _localVariable_10 = sourceMatch.getObject("pcgw");
		EObject tmpAlt = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpPrevNode = _localVariable_4;
		EObject tmpCStep = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmpAltFlow = _localVariable_7;
		EObject tmpStep = _localVariable_8;
		EObject tmpPgw = _localVariable_9;
		EObject tmpPcgw = _localVariable_10;
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpPrevNode instanceof ExclusiveGateway) {
							ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
							if (tmpCStep instanceof ChoiceStep) {
								ChoiceStep cStep = (ChoiceStep) tmpCStep;
								if (tmpSf1 instanceof SequenceFlow) {
									SequenceFlow sf1 = (SequenceFlow) tmpSf1;
									if (tmpAltFlow instanceof AlternativeFlow) {
										AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
										if (tmpStep instanceof ParallelStep) {
											ParallelStep step = (ParallelStep) tmpStep;
											if (tmpPgw instanceof ParallelGateway) {
												ParallelGateway pgw = (ParallelGateway) tmpPgw;
												if (tmpPcgw instanceof ParallelGateway) {
													ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
													return new Object[] { alt, process, useCase, flow, prevNode, cStep,
															sf1, altFlow, step, pgw, pcgw, targetMatch, sourceMatch };
												}
											}
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_34_2_blackBBBFBBBFBBBBBBB(StepAlternative alt,
			SimpleBPMN.Process process, UseCase useCase, Flow flow, ExclusiveGateway prevNode, ChoiceStep cStep,
			SequenceFlow sf1, AlternativeFlow altFlow, ParallelStep step, ParallelGateway pgw, ParallelGateway pcgw,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!altFlow.equals(flow)) {
			if (!pcgw.equals(pgw)) {
				if (!sourceMatch.equals(targetMatch)) {
					if (altFlow.equals(alt.getRef())) {
						if (process.getFlowElements().contains(prevNode)) {
							if (process.getFlowElements().contains(sf1)) {
								if (useCase.getFlows().contains(flow)) {
									if (useCase.getFlows().contains(altFlow)) {
										if (flow.getSteps().contains(cStep)) {
											if (prevNode.equals(sf1.getSourceRef())) {
												if (cStep.getStepAlternatives().contains(alt)) {
													if (altFlow.getSteps().contains(step)) {
														if (process.getFlowElements().contains(pgw)) {
															if (process.getFlowElements().contains(pcgw)) {
																if (pgw.equals(sf1.getTargetRef())) {
																	if (pcgw.equals(pgw.get__conv())) {
																		boolean prevNodeisDiverging = prevNode
																				.isIsDiverging();
																		if (Boolean.valueOf(prevNodeisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			boolean pgwisDiverging = pgw
																					.isIsDiverging();
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
																						if (useCase.equals(
																								p2uc.getTarget())) {
																							for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil
																									.getOppositeReferenceTyped(
																											prevNode,
																											GW2S.class,
																											"source")) {
																								if (cStep.equals(eg2cs
																										.getTarget())) {
																									_result.add(
																											new Object[] {
																													alt,
																													process,
																													useCase,
																													p2uc,
																													flow,
																													prevNode,
																													cStep,
																													eg2cs,
																													sf1,
																													altFlow,
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
		}
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_34_2_greenBBBBBBBBBBBBBBBF(StepAlternative alt,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, AlternativeFlow altFlow, ParallelStep step,
			ParallelGateway pgw, ParallelGateway pcgw, Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "PG2ParallelStepAfterEG";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(pcgw);
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(cStep);
		isApplicableMatch.getAllContextElements().add(altFlow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(eg2cs);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, altFlow, step, pgw, pcgw,
				sourceMatch, targetMatch, isApplicableMatch };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_34_3_bindingFBBBBBBBBBBBBBBBBB(
			PG2ParallelStepAfterEG _this, IsApplicableMatchCC isApplicableMatch, StepAlternative alt,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, AlternativeFlow altFlow, ParallelStep step,
			ParallelGateway pgw, ParallelGateway pcgw, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, alt, process, useCase, p2uc, flow,
				prevNode, cStep, eg2cs, sf1, altFlow, step, pgw, pcgw, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, alt, process, useCase, p2uc, flow, prevNode, cStep,
					eg2cs, sf1, altFlow, step, pgw, pcgw, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_34_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_34_3_bindingAndBlackFBBBBBBBBBBBBBBBBB(
			PG2ParallelStepAfterEG _this, IsApplicableMatchCC isApplicableMatch, StepAlternative alt,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, AlternativeFlow altFlow, ParallelStep step,
			ParallelGateway pgw, ParallelGateway pcgw, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PG2ParallelStepAfterEG_34_3_binding = pattern_PG2ParallelStepAfterEG_34_3_bindingFBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, altFlow, step,
				pgw, pcgw, sourceMatch, targetMatch);
		if (result_pattern_PG2ParallelStepAfterEG_34_3_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepAfterEG_34_3_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_34_3_black = pattern_PG2ParallelStepAfterEG_34_3_blackB(csp);
			if (result_pattern_PG2ParallelStepAfterEG_34_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, alt, process, useCase, p2uc, flow, prevNode, cStep,
						eg2cs, sf1, altFlow, step, pgw, pcgw, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_34_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_34_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PG2ParallelStepAfterEG";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PG2ParallelStepAfterEG_34_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_37_1_blackB(PG2ParallelStepAfterEG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_37_2_bindingFFFFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("alt");
		EObject _localVariable_1 = isApplicableMatch.getObject("process");
		EObject _localVariable_2 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_3 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_6 = isApplicableMatch.getObject("cStep");
		EObject _localVariable_7 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_8 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_9 = isApplicableMatch.getObject("altFlow");
		EObject _localVariable_10 = isApplicableMatch.getObject("step");
		EObject _localVariable_11 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_12 = isApplicableMatch.getObject("pcgw");
		EObject tmpAlt = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpP2uc = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpPrevNode = _localVariable_5;
		EObject tmpCStep = _localVariable_6;
		EObject tmpEg2cs = _localVariable_7;
		EObject tmpSf1 = _localVariable_8;
		EObject tmpAltFlow = _localVariable_9;
		EObject tmpStep = _localVariable_10;
		EObject tmpPgw = _localVariable_11;
		EObject tmpPcgw = _localVariable_12;
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpP2uc instanceof P2UC) {
						P2UC p2uc = (P2UC) tmpP2uc;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpPrevNode instanceof ExclusiveGateway) {
								ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
								if (tmpCStep instanceof ChoiceStep) {
									ChoiceStep cStep = (ChoiceStep) tmpCStep;
									if (tmpEg2cs instanceof GW2S) {
										GW2S eg2cs = (GW2S) tmpEg2cs;
										if (tmpSf1 instanceof SequenceFlow) {
											SequenceFlow sf1 = (SequenceFlow) tmpSf1;
											if (tmpAltFlow instanceof AlternativeFlow) {
												AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
												if (tmpStep instanceof ParallelStep) {
													ParallelStep step = (ParallelStep) tmpStep;
													if (tmpPgw instanceof ParallelGateway) {
														ParallelGateway pgw = (ParallelGateway) tmpPgw;
														if (tmpPcgw instanceof ParallelGateway) {
															ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
															return new Object[] { alt, process, useCase, p2uc, flow,
																	prevNode, cStep, eg2cs, sf1, altFlow, step, pgw,
																	pcgw, isApplicableMatch };
														}
													}
												}
											}
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_37_2_blackBBBBBBBBBBBBBB(StepAlternative alt,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, AlternativeFlow altFlow, ParallelStep step,
			ParallelGateway pgw, ParallelGateway pcgw, IsApplicableMatchCC isApplicableMatch) {
		if (!altFlow.equals(flow)) {
			if (!pcgw.equals(pgw)) {
				if (altFlow.equals(alt.getRef())) {
					if (process.getFlowElements().contains(prevNode)) {
						if (process.getFlowElements().contains(sf1)) {
							if (useCase.getFlows().contains(flow)) {
								if (useCase.getFlows().contains(altFlow)) {
									if (process.equals(p2uc.getSource())) {
										if (useCase.equals(p2uc.getTarget())) {
											if (flow.getSteps().contains(cStep)) {
												if (prevNode.equals(sf1.getSourceRef())) {
													if (cStep.getStepAlternatives().contains(alt)) {
														if (prevNode.equals(eg2cs.getSource())) {
															if (cStep.equals(eg2cs.getTarget())) {
																if (altFlow.getSteps().contains(step)) {
																	if (process.getFlowElements().contains(pgw)) {
																		if (process.getFlowElements().contains(pcgw)) {
																			if (pgw.equals(sf1.getTargetRef())) {
																				if (pcgw.equals(pgw.get__conv())) {
																					boolean prevNodeisDiverging = prevNode
																							.isIsDiverging();
																					if (Boolean
																							.valueOf(
																									prevNodeisDiverging)
																							.equals(Boolean
																									.valueOf(true))) {
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
																								return new Object[] {
																										alt, process,
																										useCase, p2uc,
																										flow, prevNode,
																										cStep, eg2cs,
																										sf1, altFlow,
																										step, pgw, pcgw,
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
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_37_2_bindingAndBlackFFFFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_PG2ParallelStepAfterEG_37_2_binding = pattern_PG2ParallelStepAfterEG_37_2_bindingFFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_PG2ParallelStepAfterEG_37_2_binding != null) {
			StepAlternative alt = (StepAlternative) result_pattern_PG2ParallelStepAfterEG_37_2_binding[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_PG2ParallelStepAfterEG_37_2_binding[1];
			UseCase useCase = (UseCase) result_pattern_PG2ParallelStepAfterEG_37_2_binding[2];
			P2UC p2uc = (P2UC) result_pattern_PG2ParallelStepAfterEG_37_2_binding[3];
			Flow flow = (Flow) result_pattern_PG2ParallelStepAfterEG_37_2_binding[4];
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_PG2ParallelStepAfterEG_37_2_binding[5];
			ChoiceStep cStep = (ChoiceStep) result_pattern_PG2ParallelStepAfterEG_37_2_binding[6];
			GW2S eg2cs = (GW2S) result_pattern_PG2ParallelStepAfterEG_37_2_binding[7];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_PG2ParallelStepAfterEG_37_2_binding[8];
			AlternativeFlow altFlow = (AlternativeFlow) result_pattern_PG2ParallelStepAfterEG_37_2_binding[9];
			ParallelStep step = (ParallelStep) result_pattern_PG2ParallelStepAfterEG_37_2_binding[10];
			ParallelGateway pgw = (ParallelGateway) result_pattern_PG2ParallelStepAfterEG_37_2_binding[11];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_PG2ParallelStepAfterEG_37_2_binding[12];

			Object[] result_pattern_PG2ParallelStepAfterEG_37_2_black = pattern_PG2ParallelStepAfterEG_37_2_blackBBBBBBBBBBBBBB(
					alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, altFlow, step, pgw, pcgw,
					isApplicableMatch);
			if (result_pattern_PG2ParallelStepAfterEG_37_2_black != null) {

				return new Object[] { alt, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, sf1, altFlow, step,
						pgw, pcgw, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_37_2_greenBBBFFF(ParallelStep step, ParallelGateway pgw,
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

	public static final PerformRuleResult pattern_PG2ParallelStepAfterEG_37_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_1_blackB(PG2ParallelStepAfterEG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_2_black_nac_0BB(ModelgeneratorRuleResult ruleResult,
			SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_2_black_nac_1BB(ModelgeneratorRuleResult ruleResult,
			ExclusiveGateway prevNode) {
		if (ruleResult.getSourceObjects().contains(prevNode)) {
			return new Object[] { ruleResult, prevNode };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_2_black_nac_2BB(ModelgeneratorRuleResult ruleResult,
			GW2S eg2cs) {
		if (ruleResult.getCorrObjects().contains(eg2cs)) {
			return new Object[] { ruleResult, eg2cs };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_2_black_nac_3BB(ModelgeneratorRuleResult ruleResult,
			ChoiceStep cStep) {
		if (ruleResult.getTargetObjects().contains(cStep)) {
			return new Object[] { ruleResult, cStep };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_2_black_nac_4BB(ModelgeneratorRuleResult ruleResult,
			Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_2_black_nac_5BB(ModelgeneratorRuleResult ruleResult,
			UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_2_black_nac_6BB(ModelgeneratorRuleResult ruleResult,
			P2UC p2uc) {
		if (ruleResult.getCorrObjects().contains(p2uc)) {
			return new Object[] { ruleResult, p2uc };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepAfterEG_38_2_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eg2csList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEg2cs : eg2csList.getEntryObjects()) {
				if (tmpEg2cs instanceof GW2S) {
					GW2S eg2cs = (GW2S) tmpEg2cs;
					Gateway tmpPrevNode = eg2cs.getSource();
					if (tmpPrevNode instanceof ExclusiveGateway) {
						ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
						Step tmpCStep = eg2cs.getTarget();
						if (tmpCStep instanceof ChoiceStep) {
							ChoiceStep cStep = (ChoiceStep) tmpCStep;
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								if (pattern_PG2ParallelStepAfterEG_38_2_black_nac_2BB(ruleResult, eg2cs) == null) {
									if (pattern_PG2ParallelStepAfterEG_38_2_black_nac_1BB(ruleResult,
											prevNode) == null) {
										if (pattern_PG2ParallelStepAfterEG_38_2_black_nac_3BB(ruleResult,
												cStep) == null) {
											for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
															"flowElements")) {
												if (pattern_PG2ParallelStepAfterEG_38_2_black_nac_0BB(ruleResult,
														process) == null) {
													for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(cStep, Flow.class, "steps")) {
														if (pattern_PG2ParallelStepAfterEG_38_2_black_nac_4BB(
																ruleResult, flow) == null) {
															for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(process, P2UC.class,
																			"source")) {
																UseCase useCase = p2uc.getTarget();
																if (useCase != null) {
																	if (useCase.getFlows().contains(flow)) {
																		if (pattern_PG2ParallelStepAfterEG_38_2_black_nac_6BB(
																				ruleResult, p2uc) == null) {
																			if (pattern_PG2ParallelStepAfterEG_38_2_black_nac_5BB(
																					ruleResult, useCase) == null) {
																				_result.add(new Object[] { eg2csList,
																						process, prevNode, eg2cs, cStep,
																						flow, useCase, p2uc,
																						ruleEntryContainer,
																						ruleResult });
																			}
																		}
																	}
																}

															}
														}
													}
												}
											}
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

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_3_bindingFBBBBBBBBBB(PG2ParallelStepAfterEG _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow,
			ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, process, useCase, p2uc, flow,
				prevNode, cStep, eg2cs, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, flow, prevNode, cStep, eg2cs,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_3_bindingAndBlackFBBBBBBBBBB(
			PG2ParallelStepAfterEG _this, IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_PG2ParallelStepAfterEG_38_3_binding = pattern_PG2ParallelStepAfterEG_38_3_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, process, useCase, p2uc, flow, prevNode, cStep, eg2cs, ruleResult);
		if (result_pattern_PG2ParallelStepAfterEG_38_3_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepAfterEG_38_3_binding[0];

			Object[] result_pattern_PG2ParallelStepAfterEG_38_3_black = pattern_PG2ParallelStepAfterEG_38_3_blackB(csp);
			if (result_pattern_PG2ParallelStepAfterEG_38_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, flow, prevNode, cStep,
						eg2cs, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepAfterEG_38_4_expressionFBB(PG2ParallelStepAfterEG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_5_blackBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs) {
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
			return new Object[] { process, useCase, p2uc, flow, prevNode, cStep, eg2cs };
		}

		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_6_blackBBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			ModelgeneratorRuleResult ruleResult) {
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
			return new Object[] { process, useCase, p2uc, flow, prevNode, cStep, eg2cs, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_PG2ParallelStepAfterEG_38_6_greenFBBBBFFFFFFFBB(SimpleBPMN.Process process,
			UseCase useCase, ExclusiveGateway prevNode, ChoiceStep cStep, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		StepAlternative alt = SimpleUseCaseFactory.eINSTANCE.createStepAlternative();
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		AlternativeFlow altFlow = SimpleUseCaseFactory.eINSTANCE.createAlternativeFlow();
		ParallelStep step = SimpleUseCaseFactory.eINSTANCE.createParallelStep();
		ParallelGateway pgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		FN2S pcgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		ParallelGateway pcgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		Object _localVariable_0 = csp.getValue("alt", "condition");
		Object _localVariable_1 = csp.getValue("sf1", "conditionExpression");
		Object _localVariable_2 = csp.getValue("sf1", "id");
		Object _localVariable_3 = csp.getValue("altFlow", "id");
		Object _localVariable_4 = csp.getValue("step", "id");
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_5 = csp.getValue("pgw", "id");
		boolean pcgw_isDiverging_prime = false;
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_6 = ruleResult.getIncrementedPerformCount();
		cStep.getStepAlternatives().add(alt);
		ruleResult.getTargetObjects().add(alt);
		process.getFlowElements().add(sf1);
		sf1.setSourceRef(prevNode);
		ruleResult.getSourceObjects().add(sf1);
		alt.setRef(altFlow);
		useCase.getFlows().add(altFlow);
		ruleResult.getTargetObjects().add(altFlow);
		altFlow.getSteps().add(step);
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
		String alt_condition_prime = (String) _localVariable_0;
		String sf1_conditionExpression_prime = (String) _localVariable_1;
		String sf1_id_prime = (String) _localVariable_2;
		String altFlow_id_prime = (String) _localVariable_3;
		String step_id_prime = (String) _localVariable_4;
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		String pgw_id_prime = (String) _localVariable_5;
		pcgw.setIsDiverging(Boolean.valueOf(pcgw_isDiverging_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_6);
		alt.setCondition(alt_condition_prime);
		sf1.setConditionExpression(sf1_conditionExpression_prime);
		sf1.setId(sf1_id_prime);
		altFlow.setId(altFlow_id_prime);
		step.setId(step_id_prime);
		pgw.setId(pgw_id_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { alt, process, useCase, prevNode, cStep, sf1, altFlow, step, pgw, pcgwToStep, pgwToStep,
				pcgw, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_PG2ParallelStepAfterEG_38_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PG2ParallelStepAfterEGImpl
