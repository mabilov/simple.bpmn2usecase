/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.FN2F;
import Bpmn2UseCase.FN2S;
import Bpmn2UseCase.GW2S;

import Bpmn2UseCase.Rules.PG2ParallelStepFirst;
import Bpmn2UseCase.Rules.RulesPackage;

import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.Flow;
import SimpleUseCase.ParallelStep;
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
 * An implementation of the model object '<em><b>PG2 Parallel Step First</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PG2ParallelStepFirstImpl extends AbstractRuleImpl implements PG2ParallelStepFirst {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PG2ParallelStepFirstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPG2ParallelStepFirst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		// initial bindings
		Object[] result1_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_0_1_blackBBBBBBB(this, match,
				prevNode, process, sf1, pgw, pcgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process
							+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_0_2_bindingAndBlackFBBBBBBB(this, match, prevNode, process, sf1, pgw,
						pcgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = "
					+ process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_0_4_blackBBBBBB(match,
					prevNode, process, sf1, pgw, pcgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
						+ "[pcgw] = " + pcgw + ".");
			}
			PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_0_4_greenBBBBBBFFFFFFFF(match, prevNode, process, sf1,
					pgw, pcgw);
					// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[7];
					// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result4_green[8];
					// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result4_green[9];
					// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result4_green[10];
					// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result4_green[11];
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[12];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_0_5_blackBBBBBB(match,
					prevNode, process, sf1, pgw, pcgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process + ", "
								+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
			}
			PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_0_6_expressionBBBBBBB(this, match, prevNode, process,
					sf1, pgw, pcgw);
			return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_0_7_expressionF();
		} else {
			return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_1_1_bindingAndBlackFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2F pnToFlow = (FN2F) result1_bindingAndBlack[0];
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[1];
		Flow flow = (Flow) result1_bindingAndBlack[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[3];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[4];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[5];
		ParallelGateway pcgw = (ParallelGateway) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_1_1_greenFBBFFBB(flow, pgw, pcgw,
				csp);
		ParallelStep step = (ParallelStep) result1_green[0];
		FN2S pcgwToStep = (FN2S) result1_green[3];
		GW2S pgwToStep = (GW2S) result1_green[4];

		// collect translated elements
		Object[] result2_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_1_2_blackBBBBBB(step, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = "
					+ pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_1_2_greenFBBBBBB(step, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_1_3_blackBBBBBBBBBBB(ruleresult,
				pnToFlow, step, prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pnToFlow] = " + pnToFlow + ", " + "[step] = " + step
					+ ", " + "[prevNode] = " + prevNode + ", " + "[flow] = " + flow + ", " + "[process] = " + process
					+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", "
					+ "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_1_3_greenBBBBBBBBBBFFFFFFFFFFFFF(ruleresult, step,
				prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[18];
				// EMoflonEdge pcgwToStep__pcgw____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge pcgwToStep__step____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge pgwToStep__pgw____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pgwToStep__step____target = (EMoflonEdge) result3_green[22];

		// perform postprocessing story node is empty
		// register objects
		PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_1_5_expressionBBBBBBBBBBBB(this, ruleresult, pnToFlow,
				step, prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		FlowNode prevNode = (FlowNode) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ParallelGateway pgw = (ParallelGateway) result2_binding[3];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[4];
		for (Object[] result2_black : PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_2_2_blackFBFBBBBB(prevNode,
				process, sf1, pgw, pcgw, match)) {
			FN2F pnToFlow = (FN2F) result2_black[0];
			Flow flow = (Flow) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : PG2ParallelStepFirstImpl
					.pattern_PG2ParallelStepFirst_2_3_blackBBBBBBB(pnToFlow, prevNode, flow, process, sf1, pgw, pcgw)) {
				Object[] result3_green = PG2ParallelStepFirstImpl
						.pattern_PG2ParallelStepFirst_2_3_greenBBBBBBBFFFFFFFFFFFF(pnToFlow, prevNode, flow, process,
								sf1, pgw, pcgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge pnToFlow__prevNode____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge pnToFlow__flow____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[18];

				// solve CSP
				Object[] result4_bindingAndBlack = PG2ParallelStepFirstImpl
						.pattern_PG2ParallelStepFirst_2_4_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, pnToFlow,
								prevNode, flow, process, sf1, pgw, pcgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pnToFlow] = " + pnToFlow + ", " + "[prevNode] = " + prevNode + ", " + "[flow] = " + flow
							+ ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
							+ "[pcgw] = " + pcgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PG2ParallelStepFirstImpl
							.pattern_PG2ParallelStepFirst_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		match.registerObject("prevNode", prevNode);
		match.registerObject("process", process);
		match.registerObject("sf1", sf1);
		match.registerObject("pgw", pgw);
		match.registerObject("pcgw", pcgw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode,
			Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

		// Create unbound variables
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_pgw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pnToFlow", pnToFlow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject pnToFlow, EObject step, EObject prevNode,
			EObject flow, EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep,
			EObject pcgw) {
		ruleresult.registerObject("pnToFlow", pnToFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("sf1", sf1);
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
	public boolean isAppropriate_BWD(Match match, ParallelStep step, Flow flow) {
		// initial bindings
		Object[] result1_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_10_1_blackBBBB(this, match, step,
				flow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_10_2_bindingAndBlackFBBBB(this, match, step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_10_4_blackBBB(match, step,
					flow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed." + " Variables: "
								+ "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_10_4_greenBBBF(match, step, flow);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_10_5_blackBBB(match, step,
					flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_10_5_greenBB(match, flow);

			// register objects to match
			PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_10_6_expressionBBBB(this, match, step, flow);
			return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_10_7_expressionF();
		} else {
			return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_11_1_bindingAndBlackFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2F pnToFlow = (FN2F) result1_bindingAndBlack[0];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[1];
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_11_1_greenBBBFFFFFB(step,
				prevNode, process, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[3];
		ParallelGateway pgw = (ParallelGateway) result1_green[4];
		FN2S pcgwToStep = (FN2S) result1_green[5];
		GW2S pgwToStep = (GW2S) result1_green[6];
		ParallelGateway pcgw = (ParallelGateway) result1_green[7];

		// collect translated elements
		Object[] result2_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_11_2_blackBBBBBB(step, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = "
					+ pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_11_2_greenFBBBBBB(step, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_11_3_blackBBBBBBBBBBB(ruleresult,
				pnToFlow, step, prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pnToFlow] = " + pnToFlow + ", " + "[step] = " + step
					+ ", " + "[prevNode] = " + prevNode + ", " + "[flow] = " + flow + ", " + "[process] = " + process
					+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", "
					+ "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_11_3_greenBBBBBBBBBBFFFFFFFFFFFFF(ruleresult, step,
				prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[18];
				// EMoflonEdge pcgwToStep__pcgw____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge pcgwToStep__step____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge pgwToStep__pgw____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pgwToStep__step____target = (EMoflonEdge) result3_green[22];

		// perform postprocessing story node is empty
		// register objects
		PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_11_5_expressionBBBBBBBBBBBB(this, ruleresult, pnToFlow,
				step, prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ParallelStep step = (ParallelStep) result2_binding[0];
		Flow flow = (Flow) result2_binding[1];
		for (Object[] result2_black : PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_12_2_blackFBFBB(step, flow,
				match)) {
			FN2F pnToFlow = (FN2F) result2_black[0];
			FlowNode prevNode = (FlowNode) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : PG2ParallelStepFirstImpl
					.pattern_PG2ParallelStepFirst_12_3_blackBBBBF(pnToFlow, step, prevNode, flow)) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[4];
				Object[] result3_green = PG2ParallelStepFirstImpl
						.pattern_PG2ParallelStepFirst_12_3_greenBBBBBFFFFF(pnToFlow, step, prevNode, flow, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge pnToFlow__prevNode____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge pnToFlow__flow____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[8];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = PG2ParallelStepFirstImpl
						.pattern_PG2ParallelStepFirst_12_4_bindingAndBlackFBBBBBBB(this, isApplicableMatch, pnToFlow,
								step, prevNode, flow, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pnToFlow] = " + pnToFlow + ", " + "[step] = " + step + ", " + "[prevNode] = " + prevNode
							+ ", " + "[flow] = " + flow + ", " + "[process] = " + process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = PG2ParallelStepFirstImpl
							.pattern_PG2ParallelStepFirst_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ParallelStep step, Flow flow) {
		match.registerObject("step", step);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ParallelStep step, Flow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FN2F pnToFlow, ParallelStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", csp);
		var_pgw_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_pgw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pnToFlow", pnToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("prevNode", prevNode);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject pnToFlow, EObject step, EObject prevNode,
			EObject flow, EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep,
			EObject pcgw) {
		ruleresult.registerObject("pnToFlow", pnToFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("sf1", sf1);
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
		return true && match.getObject("step").eClass()
				.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getParallelStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_28(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_20_2_blackFFB(_edge_steps)) {
			ParallelStep step = (ParallelStep) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_20_3_expressionFBBBB(this, match, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_20_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_89(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_21_2_blackFFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_21_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_21_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_90(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_22_2_blackFFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_22_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_22_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_91(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_23_2_blackFFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_23_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_23_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_92(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_24_2_blackFFFFFB(_edge_targetRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_24_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_24_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_93(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_25_2_blackFFFFFB(_edge_incoming)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_25_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_25_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_94(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_26_2_blackFFFFFB(_edge___conv)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_26_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_26_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_95(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_27_2_blackFFFFFB(_edge_sourceRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_27_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_27_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_96(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_28_2_blackFFFFFB(_edge_outgoing)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_28_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_28_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PG2ParallelStepFirst");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPnToFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pnToFlow")).findAny();
		Bpmn2UseCase.FN2F pnToFlow = (Bpmn2UseCase.FN2F) matchForPnToFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ParallelStep step = (SimpleUseCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.FlowNode prevNode = (SimpleBPMN.FlowNode) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

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

		if (!(pgw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(pcgw.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("PG2ParallelStepFirst");
		eq0.solve(var_pgw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_step_id.setBound(false);
			eq0.solve(var_pgw_id, var_step_id);
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
		ruleResult.setRule("PG2ParallelStepFirst");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPnToFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pnToFlow")).findAny();
		Bpmn2UseCase.FN2F pnToFlow = (Bpmn2UseCase.FN2F) matchForPnToFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ParallelStep step = (SimpleUseCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.FlowNode prevNode = (SimpleBPMN.FlowNode) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

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

		if (!(pgw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(pcgw.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("PG2ParallelStepFirst");
		eq0.solve(var_pgw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_pgw_id.setBound(false);
			eq0.solve(var_pgw_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
		Object[] result1_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_31_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_31_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_31_2_bindingFFFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		ParallelStep step = (ParallelStep) result2_binding[0];
		FlowNode prevNode = (FlowNode) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[3];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[4];
		ParallelGateway pgw = (ParallelGateway) result2_binding[5];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[6];
		for (Object[] result2_black : PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_31_2_blackFBBBBBBBBB(step,
				prevNode, flow, process, sf1, pgw, pcgw, sourceMatch, targetMatch)) {
			FN2F pnToFlow = (FN2F) result2_black[0];
			Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_31_2_greenBBBBBBBBBBF(
					pnToFlow, step, prevNode, flow, process, sf1, pgw, pcgw, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[10];

			// check csp
			Object[] result3_bindingAndBlack = PG2ParallelStepFirstImpl
					.pattern_PG2ParallelStepFirst_31_3_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, pnToFlow,
							step, prevNode, flow, process, sf1, pgw, pcgw, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_31_4_blackBB(result,
						isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_31_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_31_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, FN2F pnToFlow, ParallelStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_pgw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pnToFlow", pnToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
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
		Object[] result1_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_34_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_34_2_bindingAndBlackFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// FN2F pnToFlow = (FN2F) result2_bindingAndBlack[0];
		ParallelStep step = (ParallelStep) result2_bindingAndBlack[1];
		// FlowNode prevNode = (FlowNode) result2_bindingAndBlack[2];
		// Flow flow = (Flow) result2_bindingAndBlack[3];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[4];
		// SequenceFlow sf1 = (SequenceFlow) result2_bindingAndBlack[5];
		ParallelGateway pgw = (ParallelGateway) result2_bindingAndBlack[6];
		ParallelGateway pcgw = (ParallelGateway) result2_bindingAndBlack[7];
		Object[] result2_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_34_2_greenBBBFFF(step, pgw,
				pcgw);
		PerformRuleResult result = (PerformRuleResult) result2_green[3];
		// FN2S pcgwToStep = (FN2S) result2_green[4];
		// GW2S pgwToStep = (GW2S) result2_green[5];

		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_34_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, FN2F pnToFlowParameter) {
		// create result
		Object[] result1_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_35_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_35_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : PG2ParallelStepFirstImpl
				.pattern_PG2ParallelStepFirst_35_2_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList pnToFlowList = (RuleEntryList) result2_black[0];
			FN2F pnToFlow = (FN2F) result2_black[1];
			FlowNode prevNode = (FlowNode) result2_black[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[3];
			Flow flow = (Flow) result2_black[4];

			// solve CSP
			Object[] result3_bindingAndBlack = PG2ParallelStepFirstImpl
					.pattern_PG2ParallelStepFirst_35_3_bindingAndBlackFBBBBBBB(this, isApplicableMatch, pnToFlow,
							prevNode, flow, process, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pnToFlow] = " + pnToFlow
						+ ", " + "[prevNode] = " + prevNode + ", " + "[flow] = " + flow + ", " + "[process] = "
						+ process + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_35_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_35_5_blackBBBB(flow,
						pnToFlow, prevNode, process);
				if (result5_black != null) {

					// perform
					Object[] result6_black = PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_35_6_blackBBBBB(
							pnToFlow, prevNode, flow, process, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[pnToFlow] = " + pnToFlow + ", " + "[prevNode] = " + prevNode + ", " + "[flow] = "
								+ flow + ", " + "[process] = " + process + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_35_6_greenFBBBFFFFFBB(prevNode, flow, process,
							ruleResult, csp);
					// ParallelStep step = (ParallelStep) result6_green[0];
					// SequenceFlow sf1 = (SequenceFlow) result6_green[4];
					// ParallelGateway pgw = (ParallelGateway) result6_green[5];
					// FN2S pcgwToStep = (FN2S) result6_green[6];
					// GW2S pgwToStep = (GW2S) result6_green[7];
					// ParallelGateway pcgw = (ParallelGateway) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return PG2ParallelStepFirstImpl.pattern_PG2ParallelStepFirst_35_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode,
			Flow flow, SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", csp);
		var_pgw_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_pgw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pnToFlow", pnToFlow);
		isApplicableMatch.registerObject("prevNode", prevNode);
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
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
			return null;
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2F_FLOWNODE_FLOW_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (FN2F) arguments.get(1),
					(FlowNode) arguments.get(2), (Flow) arguments.get(3), (SimpleBPMN.Process) arguments.get(4),
					(SequenceFlow) arguments.get(5), (ParallelGateway) arguments.get(6),
					(ParallelGateway) arguments.get(7));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(Flow) arguments.get(2));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(Flow) arguments.get(2));
			return null;
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(Flow) arguments.get(2));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_PARALLELSTEP_FLOWNODE_FLOW_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FN2F) arguments.get(1),
					(ParallelStep) arguments.get(2), (FlowNode) arguments.get(3), (Flow) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_28((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_89__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_89((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_90__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_90((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_91__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_91((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_92__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_92((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_93__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_93((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_94__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_94((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_95__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_95((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_96__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_96((EMoflonEdge) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FN2F_PARALLELSTEP_FLOWNODE_FLOW_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (FN2F) arguments.get(1),
					(ParallelStep) arguments.get(2), (FlowNode) arguments.get(3), (Flow) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5), (SequenceFlow) arguments.get(6),
					(ParallelGateway) arguments.get(7), (ParallelGateway) arguments.get(8), (Match) arguments.get(9),
					(Match) arguments.get(10));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___GENERATE_MODEL__RULEENTRYCONTAINER_FN2F:
			return generateModel((RuleEntryContainer) arguments.get(0), (FN2F) arguments.get(1));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_FLOWNODE_FLOW_PROCESS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FN2F) arguments.get(1),
					(FlowNode) arguments.get(2), (Flow) arguments.get(3), (SimpleBPMN.Process) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.PG2_PARALLEL_STEP_FIRST___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PG2ParallelStepFirst_0_1_blackBBBBBBB(PG2ParallelStepFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					return new Object[] { _this, match, prevNode, process, sf1, pgw, pcgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_0_2_bindingFBBBBBBB(PG2ParallelStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, process, sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, process, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_0_2_bindingAndBlackFBBBBBBB(PG2ParallelStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		Object[] result_pattern_PG2ParallelStepFirst_0_2_binding = pattern_PG2ParallelStepFirst_0_2_bindingFBBBBBBB(
				_this, match, prevNode, process, sf1, pgw, pcgw);
		if (result_pattern_PG2ParallelStepFirst_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepFirst_0_2_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_0_2_black = pattern_PG2ParallelStepFirst_0_2_blackB(csp);
			if (result_pattern_PG2ParallelStepFirst_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, process, sf1, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepFirst_0_3_expressionFBB(PG2ParallelStepFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_0_4_blackBBBBBB(Match match, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					return new Object[] { match, prevNode, process, sf1, pgw, pcgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_0_4_greenBBBBBBFFFFFFFF(Match match, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf1);
		match.getToBeTranslatedNodes().add(pgw);
		match.getToBeTranslatedNodes().add(pcgw);
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		match.getToBeTranslatedEdges().add(process__pgw____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		match.getToBeTranslatedEdges().add(process__sf1____flowElements);
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
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		match.getToBeTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____outgoing);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { match, prevNode, process, sf1, pgw, pcgw, process__pgw____flowElements,
				process__sf1____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_0_5_blackBBBBBB(Match match, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					return new Object[] { match, prevNode, process, sf1, pgw, pcgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_0_5_greenBBBF(Match match, FlowNode prevNode,
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

	public static final void pattern_PG2ParallelStepFirst_0_6_expressionBBBBBBB(PG2ParallelStepFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		_this.registerObjectsToMatch_FWD(match, prevNode, process, sf1, pgw, pcgw);

	}

	public static final boolean pattern_PG2ParallelStepFirst_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepFirst_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_1_1_bindingFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pnToFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_5 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_6 = isApplicableMatch.getObject("pcgw");
		EObject tmpPnToFlow = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpPgw = _localVariable_5;
		EObject tmpPcgw = _localVariable_6;
		if (tmpPnToFlow instanceof FN2F) {
			FN2F pnToFlow = (FN2F) tmpPnToFlow;
			if (tmpPrevNode instanceof FlowNode) {
				FlowNode prevNode = (FlowNode) tmpPrevNode;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpPgw instanceof ParallelGateway) {
								ParallelGateway pgw = (ParallelGateway) tmpPgw;
								if (tmpPcgw instanceof ParallelGateway) {
									ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
									return new Object[] { pnToFlow, prevNode, flow, process, sf1, pgw, pcgw,
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

	public static final Object[] pattern_PG2ParallelStepFirst_1_1_blackBBBBBBBBFB(FN2F pnToFlow, FlowNode prevNode,
			Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw,
			PG2ParallelStepFirst _this, IsApplicableMatch isApplicableMatch) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { pnToFlow, prevNode, flow, process, sf1, pgw, pcgw, _this, csp,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_1_1_bindingAndBlackFFFFFFFBFB(PG2ParallelStepFirst _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PG2ParallelStepFirst_1_1_binding = pattern_PG2ParallelStepFirst_1_1_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_PG2ParallelStepFirst_1_1_binding != null) {
			FN2F pnToFlow = (FN2F) result_pattern_PG2ParallelStepFirst_1_1_binding[0];
			FlowNode prevNode = (FlowNode) result_pattern_PG2ParallelStepFirst_1_1_binding[1];
			Flow flow = (Flow) result_pattern_PG2ParallelStepFirst_1_1_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_PG2ParallelStepFirst_1_1_binding[3];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_PG2ParallelStepFirst_1_1_binding[4];
			ParallelGateway pgw = (ParallelGateway) result_pattern_PG2ParallelStepFirst_1_1_binding[5];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_PG2ParallelStepFirst_1_1_binding[6];

			Object[] result_pattern_PG2ParallelStepFirst_1_1_black = pattern_PG2ParallelStepFirst_1_1_blackBBBBBBBBFB(
					pnToFlow, prevNode, flow, process, sf1, pgw, pcgw, _this, isApplicableMatch);
			if (result_pattern_PG2ParallelStepFirst_1_1_black != null) {
				CSP csp = (CSP) result_pattern_PG2ParallelStepFirst_1_1_black[8];

				return new Object[] { pnToFlow, prevNode, flow, process, sf1, pgw, pcgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_1_1_greenFBBFFBB(Flow flow, ParallelGateway pgw,
			ParallelGateway pcgw, CSP csp) {
		ParallelStep step = SimpleUseCaseFactory.eINSTANCE.createParallelStep();
		FN2S pcgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		flow.getSteps().add(step);
		pcgwToStep.setSource(pcgw);
		pcgwToStep.setTarget(step);
		pgwToStep.setSource(pgw);
		pgwToStep.setTarget(step);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { step, flow, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_1_2_blackBBBBBB(ParallelStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_1_2_greenFBBBBBB(ParallelStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(pgw);
		ruleresult.getCreatedLinkElements().add(pcgwToStep);
		ruleresult.getCreatedLinkElements().add(pgwToStep);
		ruleresult.getTranslatedElements().add(pcgw);
		return new Object[] { ruleresult, step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_1_3_blackBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject pnToFlow, EObject step, EObject prevNode, EObject flow, EObject process, EObject sf1, EObject pgw,
			EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		if (!pnToFlow.equals(step)) {
			if (!pnToFlow.equals(prevNode)) {
				if (!pnToFlow.equals(process)) {
					if (!pnToFlow.equals(sf1)) {
						if (!prevNode.equals(step)) {
							if (!prevNode.equals(process)) {
								if (!prevNode.equals(sf1)) {
									if (!flow.equals(pnToFlow)) {
										if (!flow.equals(step)) {
											if (!flow.equals(prevNode)) {
												if (!flow.equals(process)) {
													if (!flow.equals(sf1)) {
														if (!flow.equals(pgw)) {
															if (!flow.equals(pcgwToStep)) {
																if (!flow.equals(pgwToStep)) {
																	if (!flow.equals(pcgw)) {
																		if (!process.equals(step)) {
																			if (!process.equals(sf1)) {
																				if (!sf1.equals(step)) {
																					if (!pgw.equals(pnToFlow)) {
																						if (!pgw.equals(step)) {
																							if (!pgw.equals(prevNode)) {
																								if (!pgw.equals(
																										process)) {
																									if (!pgw.equals(
																											sf1)) {
																										if (!pgw.equals(
																												pgwToStep)) {
																											if (!pcgwToStep
																													.equals(pnToFlow)) {
																												if (!pcgwToStep
																														.equals(step)) {
																													if (!pcgwToStep
																															.equals(prevNode)) {
																														if (!pcgwToStep
																																.equals(process)) {
																															if (!pcgwToStep
																																	.equals(sf1)) {
																																if (!pcgwToStep
																																		.equals(pgw)) {
																																	if (!pcgwToStep
																																			.equals(pgwToStep)) {
																																		if (!pgwToStep
																																				.equals(pnToFlow)) {
																																			if (!pgwToStep
																																					.equals(step)) {
																																				if (!pgwToStep
																																						.equals(prevNode)) {
																																					if (!pgwToStep
																																							.equals(process)) {
																																						if (!pgwToStep
																																								.equals(sf1)) {
																																							if (!pcgw
																																									.equals(pnToFlow)) {
																																								if (!pcgw
																																										.equals(step)) {
																																									if (!pcgw
																																											.equals(prevNode)) {
																																										if (!pcgw
																																												.equals(process)) {
																																											if (!pcgw
																																													.equals(sf1)) {
																																												if (!pcgw
																																														.equals(pgw)) {
																																													if (!pcgw
																																															.equals(pcgwToStep)) {
																																														if (!pcgw
																																																.equals(pgwToStep)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	pnToFlow,
																																																	step,
																																																	prevNode,
																																																	flow,
																																																	process,
																																																	sf1,
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
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_1_3_greenBBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject step, EObject prevNode, EObject flow, EObject process, EObject sf1,
			EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PG2ParallelStepFirst";
		String flow__step____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pcgwToStep__pcgw____source_name_prime = "source";
		String pcgwToStep__step____target_name_prime = "target";
		String pgwToStep__pgw____source_name_prime = "source";
		String pgwToStep__step____target_name_prime = "target";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		ruleresult.getTranslatedEdges().add(process__pgw____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(process__sf1____flowElements);
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
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
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
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		pcgwToStep__pcgw____source.setName(pcgwToStep__pcgw____source_name_prime);
		pcgwToStep__step____target.setName(pcgwToStep__step____target_name_prime);
		pgwToStep__pgw____source.setName(pgwToStep__pgw____source_name_prime);
		pgwToStep__step____target.setName(pgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, step, prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw,
				flow__step____steps, process__pgw____flowElements, process__sf1____flowElements,
				process__pcgw____flowElements, sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, pcgwToStep__pcgw____source,
				pcgwToStep__step____target, pgwToStep__pgw____source, pgwToStep__step____target };
	}

	public static final void pattern_PG2ParallelStepFirst_1_5_expressionBBBBBBBBBBBB(PG2ParallelStepFirst _this,
			PerformRuleResult ruleresult, EObject pnToFlow, EObject step, EObject prevNode, EObject flow,
			EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_FWD(ruleresult, pnToFlow, step, prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw);

	}

	public static final PerformRuleResult pattern_PG2ParallelStepFirst_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_2_1_bindingFB(PG2ParallelStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_2_1_blackFBB(EClass eClass, PG2ParallelStepFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_2_1_bindingAndBlackFFB(PG2ParallelStepFirst _this) {
		Object[] result_pattern_PG2ParallelStepFirst_2_1_binding = pattern_PG2ParallelStepFirst_2_1_bindingFB(_this);
		if (result_pattern_PG2ParallelStepFirst_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_PG2ParallelStepFirst_2_1_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_2_1_black = pattern_PG2ParallelStepFirst_2_1_blackFBB(eClass,
					_this);
			if (result_pattern_PG2ParallelStepFirst_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PG2ParallelStepFirst_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "PG2ParallelStepFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_2_2_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevNode");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("sf1");
		EObject _localVariable_3 = match.getObject("pgw");
		EObject _localVariable_4 = match.getObject("pcgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpSf1 = _localVariable_2;
		EObject tmpPgw = _localVariable_3;
		EObject tmpPcgw = _localVariable_4;
		if (tmpPrevNode instanceof FlowNode) {
			FlowNode prevNode = (FlowNode) tmpPrevNode;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpSf1 instanceof SequenceFlow) {
					SequenceFlow sf1 = (SequenceFlow) tmpSf1;
					if (tmpPgw instanceof ParallelGateway) {
						ParallelGateway pgw = (ParallelGateway) tmpPgw;
						if (tmpPcgw instanceof ParallelGateway) {
							ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
							return new Object[] { prevNode, process, sf1, pgw, pcgw, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_2_2_blackFBFBBBBB(FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					boolean pgwisDiverging = pgw.isIsDiverging();
					if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
						boolean pcgwisDiverging = pcgw.isIsDiverging();
						if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
							for (FN2F pnToFlow : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(prevNode, FN2F.class, "source")) {
								Flow flow = pnToFlow.getTarget();
								if (flow != null) {
									_result.add(
											new Object[] { pnToFlow, prevNode, flow, process, sf1, pgw, pcgw, match });
								}

							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_2_3_black_nac_0B(Flow flow) {
		for (Step otherSteps : flow.getSteps()) {
			return new Object[] { flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_2_3_blackBBBBBBB(FN2F pnToFlow,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					if (prevNode.equals(pnToFlow.getSource())) {
						if (flow.equals(pnToFlow.getTarget())) {
							if (process.getFlowElements().contains(pgw)) {
								if (process.getFlowElements().contains(sf1)) {
									if (process.getFlowElements().contains(prevNode)) {
										if (process.getFlowElements().contains(pcgw)) {
											if (pgw.equals(sf1.getTargetRef())) {
												if (pcgw.equals(pgw.get__conv())) {
													if (prevNode.equals(sf1.getSourceRef())) {
														boolean pgwisDiverging = pgw.isIsDiverging();
														if (Boolean.valueOf(pgwisDiverging)
																.equals(Boolean.valueOf(true))) {
															boolean pcgwisDiverging = pcgw.isIsDiverging();
															if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
																if (pattern_PG2ParallelStepFirst_2_3_black_nac_0B(
																		flow) == null) {
																	_result.add(new Object[] { pnToFlow, prevNode, flow,
																			process, sf1, pgw, pcgw });
																}
															}

														}

													}
												}
											}
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

	public static final Object[] pattern_PG2ParallelStepFirst_2_3_greenBBBBBBBFFFFFFFFFFFF(FN2F pnToFlow,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pnToFlow__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pnToFlow__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pnToFlow__prevNode____source_name_prime = "source";
		String pnToFlow__flow____target_name_prime = "target";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(pnToFlow);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(pcgw);
		pnToFlow__prevNode____source.setSrc(pnToFlow);
		pnToFlow__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pnToFlow__prevNode____source);
		pnToFlow__flow____target.setSrc(pnToFlow);
		pnToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(pnToFlow__flow____target);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(process__pgw____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(process__sf1____flowElements);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
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
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____outgoing);
		pnToFlow__prevNode____source.setName(pnToFlow__prevNode____source_name_prime);
		pnToFlow__flow____target.setName(pnToFlow__flow____target_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { pnToFlow, prevNode, flow, process, sf1, pgw, pcgw, isApplicableMatch,
				pnToFlow__prevNode____source, pnToFlow__flow____target, process__pgw____flowElements,
				process__sf1____flowElements, process__prevNode____flowElements, process__pcgw____flowElements,
				sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_2_4_bindingFBBBBBBBBB(PG2ParallelStepFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pnToFlow, prevNode, flow, process,
				sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pnToFlow, prevNode, flow, process, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_2_4_bindingAndBlackFBBBBBBBBB(PG2ParallelStepFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_PG2ParallelStepFirst_2_4_binding = pattern_PG2ParallelStepFirst_2_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, pnToFlow, prevNode, flow, process, sf1, pgw, pcgw);
		if (result_pattern_PG2ParallelStepFirst_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepFirst_2_4_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_2_4_black = pattern_PG2ParallelStepFirst_2_4_blackB(csp);
			if (result_pattern_PG2ParallelStepFirst_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pnToFlow, prevNode, flow, process, sf1, pgw,
						pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepFirst_2_5_expressionFBB(PG2ParallelStepFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PG2ParallelStepFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PG2ParallelStepFirst_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_10_1_blackBBBB(PG2ParallelStepFirst _this, Match match,
			ParallelStep step, Flow flow) {
		return new Object[] { _this, match, step, flow };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_10_2_bindingFBBBB(PG2ParallelStepFirst _this, Match match,
			ParallelStep step, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_10_2_bindingAndBlackFBBBB(PG2ParallelStepFirst _this,
			Match match, ParallelStep step, Flow flow) {
		Object[] result_pattern_PG2ParallelStepFirst_10_2_binding = pattern_PG2ParallelStepFirst_10_2_bindingFBBBB(
				_this, match, step, flow);
		if (result_pattern_PG2ParallelStepFirst_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepFirst_10_2_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_10_2_black = pattern_PG2ParallelStepFirst_10_2_blackB(csp);
			if (result_pattern_PG2ParallelStepFirst_10_2_black != null) {

				return new Object[] { csp, _this, match, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepFirst_10_3_expressionFBB(PG2ParallelStepFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_10_4_blackBBB(Match match, ParallelStep step, Flow flow) {
		return new Object[] { match, step, flow };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_10_4_greenBBBF(Match match, ParallelStep step,
			Flow flow) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String flow__step____steps_name_prime = "steps";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, step, flow, flow__step____steps };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_10_5_blackBBB(Match match, ParallelStep step, Flow flow) {
		return new Object[] { match, step, flow };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_10_5_greenBB(Match match, Flow flow) {
		match.getContextNodes().add(flow);
		return new Object[] { match, flow };
	}

	public static final void pattern_PG2ParallelStepFirst_10_6_expressionBBBB(PG2ParallelStepFirst _this, Match match,
			ParallelStep step, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, step, flow);

	}

	public static final boolean pattern_PG2ParallelStepFirst_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepFirst_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_11_1_bindingFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pnToFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("step");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject tmpPnToFlow = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		if (tmpPnToFlow instanceof FN2F) {
			FN2F pnToFlow = (FN2F) tmpPnToFlow;
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (tmpPrevNode instanceof FlowNode) {
					FlowNode prevNode = (FlowNode) tmpPrevNode;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							return new Object[] { pnToFlow, step, prevNode, flow, process, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_11_1_blackBBBBBBFB(FN2F pnToFlow, ParallelStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, PG2ParallelStepFirst _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pnToFlow, step, prevNode, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_11_1_bindingAndBlackFFFFFBFB(PG2ParallelStepFirst _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PG2ParallelStepFirst_11_1_binding = pattern_PG2ParallelStepFirst_11_1_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_PG2ParallelStepFirst_11_1_binding != null) {
			FN2F pnToFlow = (FN2F) result_pattern_PG2ParallelStepFirst_11_1_binding[0];
			ParallelStep step = (ParallelStep) result_pattern_PG2ParallelStepFirst_11_1_binding[1];
			FlowNode prevNode = (FlowNode) result_pattern_PG2ParallelStepFirst_11_1_binding[2];
			Flow flow = (Flow) result_pattern_PG2ParallelStepFirst_11_1_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_PG2ParallelStepFirst_11_1_binding[4];

			Object[] result_pattern_PG2ParallelStepFirst_11_1_black = pattern_PG2ParallelStepFirst_11_1_blackBBBBBBFB(
					pnToFlow, step, prevNode, flow, process, _this, isApplicableMatch);
			if (result_pattern_PG2ParallelStepFirst_11_1_black != null) {
				CSP csp = (CSP) result_pattern_PG2ParallelStepFirst_11_1_black[6];

				return new Object[] { pnToFlow, step, prevNode, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_11_1_greenBBBFFFFFB(ParallelStep step, FlowNode prevNode,
			SimpleBPMN.Process process, CSP csp) {
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		ParallelGateway pgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		FN2S pcgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		ParallelGateway pcgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("pgw", "id");
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
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		String pgw_id_prime = (String) _localVariable_0;
		pcgw.setIsDiverging(Boolean.valueOf(pcgw_isDiverging_prime));
		pgw.setId(pgw_id_prime);
		return new Object[] { step, prevNode, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_11_2_blackBBBBBB(ParallelStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_11_2_greenFBBBBBB(ParallelStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getCreatedElements().add(pgw);
		ruleresult.getCreatedLinkElements().add(pcgwToStep);
		ruleresult.getCreatedLinkElements().add(pgwToStep);
		ruleresult.getCreatedElements().add(pcgw);
		return new Object[] { ruleresult, step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_11_3_blackBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject pnToFlow, EObject step, EObject prevNode, EObject flow, EObject process, EObject sf1, EObject pgw,
			EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		if (!pnToFlow.equals(step)) {
			if (!pnToFlow.equals(prevNode)) {
				if (!pnToFlow.equals(process)) {
					if (!pnToFlow.equals(sf1)) {
						if (!prevNode.equals(step)) {
							if (!prevNode.equals(process)) {
								if (!prevNode.equals(sf1)) {
									if (!flow.equals(pnToFlow)) {
										if (!flow.equals(step)) {
											if (!flow.equals(prevNode)) {
												if (!flow.equals(process)) {
													if (!flow.equals(sf1)) {
														if (!flow.equals(pgw)) {
															if (!flow.equals(pcgwToStep)) {
																if (!flow.equals(pgwToStep)) {
																	if (!flow.equals(pcgw)) {
																		if (!process.equals(step)) {
																			if (!process.equals(sf1)) {
																				if (!sf1.equals(step)) {
																					if (!pgw.equals(pnToFlow)) {
																						if (!pgw.equals(step)) {
																							if (!pgw.equals(prevNode)) {
																								if (!pgw.equals(
																										process)) {
																									if (!pgw.equals(
																											sf1)) {
																										if (!pgw.equals(
																												pgwToStep)) {
																											if (!pcgwToStep
																													.equals(pnToFlow)) {
																												if (!pcgwToStep
																														.equals(step)) {
																													if (!pcgwToStep
																															.equals(prevNode)) {
																														if (!pcgwToStep
																																.equals(process)) {
																															if (!pcgwToStep
																																	.equals(sf1)) {
																																if (!pcgwToStep
																																		.equals(pgw)) {
																																	if (!pcgwToStep
																																			.equals(pgwToStep)) {
																																		if (!pgwToStep
																																				.equals(pnToFlow)) {
																																			if (!pgwToStep
																																					.equals(step)) {
																																				if (!pgwToStep
																																						.equals(prevNode)) {
																																					if (!pgwToStep
																																							.equals(process)) {
																																						if (!pgwToStep
																																								.equals(sf1)) {
																																							if (!pcgw
																																									.equals(pnToFlow)) {
																																								if (!pcgw
																																										.equals(step)) {
																																									if (!pcgw
																																											.equals(prevNode)) {
																																										if (!pcgw
																																												.equals(process)) {
																																											if (!pcgw
																																													.equals(sf1)) {
																																												if (!pcgw
																																														.equals(pgw)) {
																																													if (!pcgw
																																															.equals(pcgwToStep)) {
																																														if (!pcgw
																																																.equals(pgwToStep)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	pnToFlow,
																																																	step,
																																																	prevNode,
																																																	flow,
																																																	process,
																																																	sf1,
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
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_11_3_greenBBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject step, EObject prevNode, EObject flow, EObject process, EObject sf1,
			EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PG2ParallelStepFirst";
		String flow__step____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pcgwToStep__pcgw____source_name_prime = "source";
		String pcgwToStep__step____target_name_prime = "target";
		String pgwToStep__pgw____source_name_prime = "source";
		String pgwToStep__step____target_name_prime = "target";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		ruleresult.getCreatedEdges().add(process__pgw____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getCreatedEdges().add(process__sf1____flowElements);
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
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
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
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		pcgwToStep__pcgw____source.setName(pcgwToStep__pcgw____source_name_prime);
		pcgwToStep__step____target.setName(pcgwToStep__step____target_name_prime);
		pgwToStep__pgw____source.setName(pgwToStep__pgw____source_name_prime);
		pgwToStep__step____target.setName(pgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, step, prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw,
				flow__step____steps, process__pgw____flowElements, process__sf1____flowElements,
				process__pcgw____flowElements, sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, pcgwToStep__pcgw____source,
				pcgwToStep__step____target, pgwToStep__pgw____source, pgwToStep__step____target };
	}

	public static final void pattern_PG2ParallelStepFirst_11_5_expressionBBBBBBBBBBBB(PG2ParallelStepFirst _this,
			PerformRuleResult ruleresult, EObject pnToFlow, EObject step, EObject prevNode, EObject flow,
			EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_BWD(ruleresult, pnToFlow, step, prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw);

	}

	public static final PerformRuleResult pattern_PG2ParallelStepFirst_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_12_1_bindingFB(PG2ParallelStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_12_1_blackFBB(EClass eClass, PG2ParallelStepFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_12_1_bindingAndBlackFFB(PG2ParallelStepFirst _this) {
		Object[] result_pattern_PG2ParallelStepFirst_12_1_binding = pattern_PG2ParallelStepFirst_12_1_bindingFB(_this);
		if (result_pattern_PG2ParallelStepFirst_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_PG2ParallelStepFirst_12_1_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_12_1_black = pattern_PG2ParallelStepFirst_12_1_blackFBB(eClass,
					_this);
			if (result_pattern_PG2ParallelStepFirst_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PG2ParallelStepFirst_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "PG2ParallelStepFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_12_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("step");
		EObject _localVariable_1 = match.getObject("flow");
		EObject tmpStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		if (tmpStep instanceof ParallelStep) {
			ParallelStep step = (ParallelStep) tmpStep;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				return new Object[] { step, flow, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_12_2_blackFBFBB(ParallelStep step, Flow flow,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (FN2F pnToFlow : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow, FN2F.class,
				"target")) {
			FlowNode prevNode = pnToFlow.getSource();
			if (prevNode != null) {
				_result.add(new Object[] { pnToFlow, step, prevNode, flow, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_12_3_blackBBBBF(FN2F pnToFlow,
			ParallelStep step, FlowNode prevNode, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (prevNode.equals(pnToFlow.getSource())) {
			if (flow.equals(pnToFlow.getTarget())) {
				if (flow.getSteps().contains(step)) {
					for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class, "flowElements")) {
						_result.add(new Object[] { pnToFlow, step, prevNode, flow, process });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_12_3_greenBBBBBFFFFF(FN2F pnToFlow, ParallelStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pnToFlow__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pnToFlow__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pnToFlow__prevNode____source_name_prime = "source";
		String pnToFlow__flow____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(pnToFlow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		pnToFlow__prevNode____source.setSrc(pnToFlow);
		pnToFlow__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pnToFlow__prevNode____source);
		pnToFlow__flow____target.setSrc(pnToFlow);
		pnToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(pnToFlow__flow____target);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		pnToFlow__prevNode____source.setName(pnToFlow__prevNode____source_name_prime);
		pnToFlow__flow____target.setName(pnToFlow__flow____target_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { pnToFlow, step, prevNode, flow, process, isApplicableMatch, pnToFlow__prevNode____source,
				pnToFlow__flow____target, flow__step____steps, process__prevNode____flowElements };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_12_4_bindingFBBBBBBB(PG2ParallelStepFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, ParallelStep step, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, pnToFlow, step, prevNode, flow,
				process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pnToFlow, step, prevNode, flow, process };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_12_4_bindingAndBlackFBBBBBBB(PG2ParallelStepFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, ParallelStep step, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process) {
		Object[] result_pattern_PG2ParallelStepFirst_12_4_binding = pattern_PG2ParallelStepFirst_12_4_bindingFBBBBBBB(
				_this, isApplicableMatch, pnToFlow, step, prevNode, flow, process);
		if (result_pattern_PG2ParallelStepFirst_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepFirst_12_4_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_12_4_black = pattern_PG2ParallelStepFirst_12_4_blackB(csp);
			if (result_pattern_PG2ParallelStepFirst_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pnToFlow, step, prevNode, flow, process };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepFirst_12_5_expressionFBB(PG2ParallelStepFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PG2ParallelStepFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PG2ParallelStepFirst_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_20_1_bindingFB(PG2ParallelStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_20_1_blackFBB(EClass __eClass,
			PG2ParallelStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_20_1_bindingAndBlackFFB(PG2ParallelStepFirst _this) {
		Object[] result_pattern_PG2ParallelStepFirst_20_1_binding = pattern_PG2ParallelStepFirst_20_1_bindingFB(_this);
		if (result_pattern_PG2ParallelStepFirst_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepFirst_20_1_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_20_1_black = pattern_PG2ParallelStepFirst_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepFirst_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepFirst_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_20_2_black_nac_0BB(ParallelStep step, Flow flow) {
		for (Flow __DEC_step_steps_11285 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_11285)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_20_2_black_nac_1B(ParallelStep step) {
		for (Step __DEC_step_next_311032 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_311032)) {
				return new Object[] { step };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_20_2_blackFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_PG2ParallelStepFirst_20_2_black_nac_0BB(step, flow) == null) {
						if (pattern_PG2ParallelStepFirst_20_2_black_nac_1B(step) == null) {
							_result.add(new Object[] { step, flow, _edge_steps });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepFirst_20_3_expressionFBBBB(PG2ParallelStepFirst _this,
			Match match, ParallelStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepFirst_20_4_expressionFBB(PG2ParallelStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepFirst_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_21_1_bindingFB(PG2ParallelStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_21_1_blackFBB(EClass __eClass,
			PG2ParallelStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_21_1_bindingAndBlackFFB(PG2ParallelStepFirst _this) {
		Object[] result_pattern_PG2ParallelStepFirst_21_1_binding = pattern_PG2ParallelStepFirst_21_1_bindingFB(_this);
		if (result_pattern_PG2ParallelStepFirst_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepFirst_21_1_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_21_1_black = pattern_PG2ParallelStepFirst_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepFirst_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepFirst_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_21_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_615030 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_615030)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_21_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_275142 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_275142)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_21_2_black_nac_2BBB(ParallelGateway pgw,
			FlowNode prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_331562 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_331562)) {
							if (!prevNode.equals(__DEC_pgw___conv_331562)) {
								if (!pcgw.equals(__DEC_pgw___conv_331562)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_21_2_black_nac_3BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_511859 = pcgw.get__conv();
					if (__DEC_pcgw___conv_511859 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_511859)) {
							if (!prevNode.equals(__DEC_pcgw___conv_511859)) {
								if (!pgw.equals(__DEC_pcgw___conv_511859)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_21_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_854822 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_854822)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_21_2_black_nac_5BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_187927 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_187927)) {
							if (!prevNode.equals(__DEC_pcgw___conv_187927)) {
								if (!pgw.equals(__DEC_pcgw___conv_187927)) {
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_21_2_blackFFFFFB(
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
										if (pattern_PG2ParallelStepFirst_21_2_black_nac_1BB(pgw, process) == null) {
											if (pattern_PG2ParallelStepFirst_21_2_black_nac_4BB(pcgw,
													process) == null) {
												for (FlowElement tmpSf1 : process.getFlowElements()) {
													if (tmpSf1 instanceof SequenceFlow) {
														SequenceFlow sf1 = (SequenceFlow) tmpSf1;
														if (pgw.equals(sf1.getTargetRef())) {
															FlowNode prevNode = sf1.getSourceRef();
															if (prevNode != null) {
																if (!pgw.equals(prevNode)) {
																	if (!pcgw.equals(prevNode)) {
																		if (process.getFlowElements()
																				.contains(prevNode)) {
																			if (pattern_PG2ParallelStepFirst_21_2_black_nac_0BB(
																					sf1, process) == null) {
																				if (pattern_PG2ParallelStepFirst_21_2_black_nac_2BBB(
																						pgw, prevNode, pcgw) == null) {
																					if (pattern_PG2ParallelStepFirst_21_2_black_nac_3BBB(
																							pcgw, prevNode,
																							pgw) == null) {
																						if (pattern_PG2ParallelStepFirst_21_2_black_nac_5BBB(
																								pcgw, prevNode,
																								pgw) == null) {
																							_result.add(new Object[] {
																									prevNode, process,
																									sf1, pgw, pcgw,
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepFirst_21_3_expressionFBBBBBBB(PG2ParallelStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepFirst_21_4_expressionFBB(PG2ParallelStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepFirst_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_22_1_bindingFB(PG2ParallelStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_22_1_blackFBB(EClass __eClass,
			PG2ParallelStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_22_1_bindingAndBlackFFB(PG2ParallelStepFirst _this) {
		Object[] result_pattern_PG2ParallelStepFirst_22_1_binding = pattern_PG2ParallelStepFirst_22_1_bindingFB(_this);
		if (result_pattern_PG2ParallelStepFirst_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepFirst_22_1_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_22_1_black = pattern_PG2ParallelStepFirst_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepFirst_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepFirst_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_22_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_871667 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_871667)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_22_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_721106 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_721106)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_22_2_black_nac_2BBB(ParallelGateway pgw,
			FlowNode prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_719242 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_719242)) {
							if (!prevNode.equals(__DEC_pgw___conv_719242)) {
								if (!pcgw.equals(__DEC_pgw___conv_719242)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_22_2_black_nac_3BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_508807 = pcgw.get__conv();
					if (__DEC_pcgw___conv_508807 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_508807)) {
							if (!prevNode.equals(__DEC_pcgw___conv_508807)) {
								if (!pgw.equals(__DEC_pcgw___conv_508807)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_22_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_398547 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_398547)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_22_2_black_nac_5BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_43151 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_43151)) {
							if (!prevNode.equals(__DEC_pcgw___conv_43151)) {
								if (!pgw.equals(__DEC_pcgw___conv_43151)) {
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_22_2_blackFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpSf1 = _edge_flowElements.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (process.getFlowElements().contains(sf1)) {
					FlowNode tmpPgw = sf1.getTargetRef();
					if (tmpPgw instanceof ParallelGateway) {
						ParallelGateway pgw = (ParallelGateway) tmpPgw;
						if (process.getFlowElements().contains(pgw)) {
							FlowNode prevNode = sf1.getSourceRef();
							if (prevNode != null) {
								if (!pgw.equals(prevNode)) {
									if (process.getFlowElements().contains(prevNode)) {
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
																if (pattern_PG2ParallelStepFirst_22_2_black_nac_0BB(sf1,
																		process) == null) {
																	if (pattern_PG2ParallelStepFirst_22_2_black_nac_1BB(
																			pgw, process) == null) {
																		if (pattern_PG2ParallelStepFirst_22_2_black_nac_2BBB(
																				pgw, prevNode, pcgw) == null) {
																			if (pattern_PG2ParallelStepFirst_22_2_black_nac_3BBB(
																					pcgw, prevNode, pgw) == null) {
																				if (pattern_PG2ParallelStepFirst_22_2_black_nac_4BB(
																						pcgw, process) == null) {
																					if (pattern_PG2ParallelStepFirst_22_2_black_nac_5BBB(
																							pcgw, prevNode,
																							pgw) == null) {
																						_result.add(new Object[] {
																								prevNode, process, sf1,
																								pgw, pcgw,
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepFirst_22_3_expressionFBBBBBBB(PG2ParallelStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepFirst_22_4_expressionFBB(PG2ParallelStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepFirst_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_23_1_bindingFB(PG2ParallelStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_23_1_blackFBB(EClass __eClass,
			PG2ParallelStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_23_1_bindingAndBlackFFB(PG2ParallelStepFirst _this) {
		Object[] result_pattern_PG2ParallelStepFirst_23_1_binding = pattern_PG2ParallelStepFirst_23_1_bindingFB(_this);
		if (result_pattern_PG2ParallelStepFirst_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepFirst_23_1_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_23_1_black = pattern_PG2ParallelStepFirst_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepFirst_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepFirst_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_23_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_275126 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_275126)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_23_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_777372 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_777372)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_23_2_black_nac_2BBB(ParallelGateway pgw,
			FlowNode prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_417406 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_417406)) {
							if (!prevNode.equals(__DEC_pgw___conv_417406)) {
								if (!pcgw.equals(__DEC_pgw___conv_417406)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_23_2_black_nac_3BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_429632 = pcgw.get__conv();
					if (__DEC_pcgw___conv_429632 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_429632)) {
							if (!prevNode.equals(__DEC_pcgw___conv_429632)) {
								if (!pgw.equals(__DEC_pcgw___conv_429632)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_23_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_524758 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_524758)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_23_2_black_nac_5BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_487007 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_487007)) {
							if (!prevNode.equals(__DEC_pcgw___conv_487007)) {
								if (!pgw.equals(__DEC_pcgw___conv_487007)) {
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_23_2_blackFFFFFB(
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
						if (pattern_PG2ParallelStepFirst_23_2_black_nac_4BB(pcgw, process) == null) {
							for (FlowElement tmpPgw : process.getFlowElements()) {
								if (tmpPgw instanceof ParallelGateway) {
									ParallelGateway pgw = (ParallelGateway) tmpPgw;
									if (!pcgw.equals(pgw)) {
										if (pcgw.equals(pgw.get__conv())) {
											boolean pgwisDiverging = pgw.isIsDiverging();
											if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
												if (pattern_PG2ParallelStepFirst_23_2_black_nac_1BB(pgw,
														process) == null) {
													for (FlowElement tmpSf1 : process.getFlowElements()) {
														if (tmpSf1 instanceof SequenceFlow) {
															SequenceFlow sf1 = (SequenceFlow) tmpSf1;
															if (pgw.equals(sf1.getTargetRef())) {
																FlowNode prevNode = sf1.getSourceRef();
																if (prevNode != null) {
																	if (!pgw.equals(prevNode)) {
																		if (!pcgw.equals(prevNode)) {
																			if (process.getFlowElements()
																					.contains(prevNode)) {
																				if (pattern_PG2ParallelStepFirst_23_2_black_nac_0BB(
																						sf1, process) == null) {
																					if (pattern_PG2ParallelStepFirst_23_2_black_nac_2BBB(
																							pgw, prevNode,
																							pcgw) == null) {
																						if (pattern_PG2ParallelStepFirst_23_2_black_nac_3BBB(
																								pcgw, prevNode,
																								pgw) == null) {
																							if (pattern_PG2ParallelStepFirst_23_2_black_nac_5BBB(
																									pcgw, prevNode,
																									pgw) == null) {
																								_result.add(
																										new Object[] {
																												prevNode,
																												process,
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepFirst_23_3_expressionFBBBBBBB(PG2ParallelStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepFirst_23_4_expressionFBB(PG2ParallelStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepFirst_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_24_1_bindingFB(PG2ParallelStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_24_1_blackFBB(EClass __eClass,
			PG2ParallelStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_24_1_bindingAndBlackFFB(PG2ParallelStepFirst _this) {
		Object[] result_pattern_PG2ParallelStepFirst_24_1_binding = pattern_PG2ParallelStepFirst_24_1_bindingFB(_this);
		if (result_pattern_PG2ParallelStepFirst_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepFirst_24_1_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_24_1_black = pattern_PG2ParallelStepFirst_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepFirst_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepFirst_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_24_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_625496 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_625496)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_24_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_700718 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_700718)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_24_2_black_nac_2BBB(ParallelGateway pgw,
			FlowNode prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_290176 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_290176)) {
							if (!prevNode.equals(__DEC_pgw___conv_290176)) {
								if (!pcgw.equals(__DEC_pgw___conv_290176)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_24_2_black_nac_3BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_430680 = pcgw.get__conv();
					if (__DEC_pcgw___conv_430680 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_430680)) {
							if (!prevNode.equals(__DEC_pcgw___conv_430680)) {
								if (!pgw.equals(__DEC_pcgw___conv_430680)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_24_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_633613 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_633613)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_24_2_black_nac_5BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_30616 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_30616)) {
							if (!prevNode.equals(__DEC_pcgw___conv_30616)) {
								if (!pgw.equals(__DEC_pcgw___conv_30616)) {
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_24_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_targetRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPgw = _edge_targetRef.getTrg();
			if (tmpPgw instanceof ParallelGateway) {
				ParallelGateway pgw = (ParallelGateway) tmpPgw;
				if (pgw.equals(sf1.getTargetRef())) {
					FlowNode prevNode = sf1.getSourceRef();
					if (prevNode != null) {
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
												if (pattern_PG2ParallelStepFirst_24_2_black_nac_2BBB(pgw, prevNode,
														pcgw) == null) {
													if (pattern_PG2ParallelStepFirst_24_2_black_nac_3BBB(pcgw, prevNode,
															pgw) == null) {
														if (pattern_PG2ParallelStepFirst_24_2_black_nac_5BBB(pcgw,
																prevNode, pgw) == null) {
															for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(sf1,
																			SimpleBPMN.Process.class, "flowElements")) {
																if (process.getFlowElements().contains(pgw)) {
																	if (process.getFlowElements().contains(prevNode)) {
																		if (process.getFlowElements().contains(pcgw)) {
																			if (pattern_PG2ParallelStepFirst_24_2_black_nac_0BB(
																					sf1, process) == null) {
																				if (pattern_PG2ParallelStepFirst_24_2_black_nac_1BB(
																						pgw, process) == null) {
																					if (pattern_PG2ParallelStepFirst_24_2_black_nac_4BB(
																							pcgw, process) == null) {
																						_result.add(new Object[] {
																								prevNode, process, sf1,
																								pgw, pcgw,
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepFirst_24_3_expressionFBBBBBBB(PG2ParallelStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepFirst_24_4_expressionFBB(PG2ParallelStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepFirst_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_25_1_bindingFB(PG2ParallelStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_25_1_blackFBB(EClass __eClass,
			PG2ParallelStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_25_1_bindingAndBlackFFB(PG2ParallelStepFirst _this) {
		Object[] result_pattern_PG2ParallelStepFirst_25_1_binding = pattern_PG2ParallelStepFirst_25_1_bindingFB(_this);
		if (result_pattern_PG2ParallelStepFirst_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepFirst_25_1_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_25_1_black = pattern_PG2ParallelStepFirst_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepFirst_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepFirst_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_25_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_261685 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_261685)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_25_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_682483 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_682483)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_25_2_black_nac_2BBB(ParallelGateway pgw,
			FlowNode prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_963402 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_963402)) {
							if (!prevNode.equals(__DEC_pgw___conv_963402)) {
								if (!pcgw.equals(__DEC_pgw___conv_963402)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_25_2_black_nac_3BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_449569 = pcgw.get__conv();
					if (__DEC_pcgw___conv_449569 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_449569)) {
							if (!prevNode.equals(__DEC_pcgw___conv_449569)) {
								if (!pgw.equals(__DEC_pcgw___conv_449569)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_25_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_27757 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_27757)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_25_2_black_nac_5BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_970821 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_970821)) {
							if (!prevNode.equals(__DEC_pcgw___conv_970821)) {
								if (!pgw.equals(__DEC_pcgw___conv_970821)) {
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_25_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
								FlowNode prevNode = sf1.getSourceRef();
								if (prevNode != null) {
									if (!pgw.equals(prevNode)) {
										if (!pcgw.equals(prevNode)) {
											boolean pcgwisDiverging = pcgw.isIsDiverging();
											if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
												if (pattern_PG2ParallelStepFirst_25_2_black_nac_2BBB(pgw, prevNode,
														pcgw) == null) {
													if (pattern_PG2ParallelStepFirst_25_2_black_nac_3BBB(pcgw, prevNode,
															pgw) == null) {
														if (pattern_PG2ParallelStepFirst_25_2_black_nac_5BBB(pcgw,
																prevNode, pgw) == null) {
															for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(pgw,
																			SimpleBPMN.Process.class, "flowElements")) {
																if (process.getFlowElements().contains(sf1)) {
																	if (process.getFlowElements().contains(prevNode)) {
																		if (process.getFlowElements().contains(pcgw)) {
																			if (pattern_PG2ParallelStepFirst_25_2_black_nac_0BB(
																					sf1, process) == null) {
																				if (pattern_PG2ParallelStepFirst_25_2_black_nac_1BB(
																						pgw, process) == null) {
																					if (pattern_PG2ParallelStepFirst_25_2_black_nac_4BB(
																							pcgw, process) == null) {
																						_result.add(new Object[] {
																								prevNode, process, sf1,
																								pgw, pcgw,
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepFirst_25_3_expressionFBBBBBBB(PG2ParallelStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepFirst_25_4_expressionFBB(PG2ParallelStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepFirst_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_26_1_bindingFB(PG2ParallelStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_26_1_blackFBB(EClass __eClass,
			PG2ParallelStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_26_1_bindingAndBlackFFB(PG2ParallelStepFirst _this) {
		Object[] result_pattern_PG2ParallelStepFirst_26_1_binding = pattern_PG2ParallelStepFirst_26_1_bindingFB(_this);
		if (result_pattern_PG2ParallelStepFirst_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepFirst_26_1_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_26_1_black = pattern_PG2ParallelStepFirst_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepFirst_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepFirst_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_26_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_767029 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_767029)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_26_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_454687 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_454687)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_26_2_black_nac_2BBB(ParallelGateway pgw,
			FlowNode prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_107588 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_107588)) {
							if (!prevNode.equals(__DEC_pgw___conv_107588)) {
								if (!pcgw.equals(__DEC_pgw___conv_107588)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_26_2_black_nac_3BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_129784 = pcgw.get__conv();
					if (__DEC_pcgw___conv_129784 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_129784)) {
							if (!prevNode.equals(__DEC_pcgw___conv_129784)) {
								if (!pgw.equals(__DEC_pcgw___conv_129784)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_26_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_935509 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_935509)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_26_2_black_nac_5BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_393189 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_393189)) {
							if (!prevNode.equals(__DEC_pcgw___conv_393189)) {
								if (!pgw.equals(__DEC_pcgw___conv_393189)) {
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_26_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
									FlowNode prevNode = sf1.getSourceRef();
									if (prevNode != null) {
										if (!pgw.equals(prevNode)) {
											if (!pcgw.equals(prevNode)) {
												if (pattern_PG2ParallelStepFirst_26_2_black_nac_2BBB(pgw, prevNode,
														pcgw) == null) {
													if (pattern_PG2ParallelStepFirst_26_2_black_nac_3BBB(pcgw, prevNode,
															pgw) == null) {
														if (pattern_PG2ParallelStepFirst_26_2_black_nac_5BBB(pcgw,
																prevNode, pgw) == null) {
															for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(pgw,
																			SimpleBPMN.Process.class, "flowElements")) {
																if (process.getFlowElements().contains(sf1)) {
																	if (process.getFlowElements().contains(prevNode)) {
																		if (process.getFlowElements().contains(pcgw)) {
																			if (pattern_PG2ParallelStepFirst_26_2_black_nac_0BB(
																					sf1, process) == null) {
																				if (pattern_PG2ParallelStepFirst_26_2_black_nac_1BB(
																						pgw, process) == null) {
																					if (pattern_PG2ParallelStepFirst_26_2_black_nac_4BB(
																							pcgw, process) == null) {
																						_result.add(new Object[] {
																								prevNode, process, sf1,
																								pgw, pcgw,
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepFirst_26_3_expressionFBBBBBBB(PG2ParallelStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepFirst_26_4_expressionFBB(PG2ParallelStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepFirst_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_27_1_bindingFB(PG2ParallelStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_27_1_blackFBB(EClass __eClass,
			PG2ParallelStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_27_1_bindingAndBlackFFB(PG2ParallelStepFirst _this) {
		Object[] result_pattern_PG2ParallelStepFirst_27_1_binding = pattern_PG2ParallelStepFirst_27_1_bindingFB(_this);
		if (result_pattern_PG2ParallelStepFirst_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepFirst_27_1_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_27_1_black = pattern_PG2ParallelStepFirst_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepFirst_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepFirst_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_27_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_492936 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_492936)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_27_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_777187 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_777187)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_27_2_black_nac_2BBB(ParallelGateway pgw,
			FlowNode prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_262956 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_262956)) {
							if (!prevNode.equals(__DEC_pgw___conv_262956)) {
								if (!pcgw.equals(__DEC_pgw___conv_262956)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_27_2_black_nac_3BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_884218 = pcgw.get__conv();
					if (__DEC_pcgw___conv_884218 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_884218)) {
							if (!prevNode.equals(__DEC_pcgw___conv_884218)) {
								if (!pgw.equals(__DEC_pcgw___conv_884218)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_27_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_972454 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_972454)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_27_2_black_nac_5BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_360911 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_360911)) {
							if (!prevNode.equals(__DEC_pcgw___conv_360911)) {
								if (!pgw.equals(__DEC_pcgw___conv_360911)) {
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_27_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof FlowNode) {
				FlowNode prevNode = (FlowNode) tmpPrevNode;
				if (prevNode.equals(sf1.getSourceRef())) {
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
												if (pattern_PG2ParallelStepFirst_27_2_black_nac_2BBB(pgw, prevNode,
														pcgw) == null) {
													if (pattern_PG2ParallelStepFirst_27_2_black_nac_3BBB(pcgw, prevNode,
															pgw) == null) {
														if (pattern_PG2ParallelStepFirst_27_2_black_nac_5BBB(pcgw,
																prevNode, pgw) == null) {
															for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(sf1,
																			SimpleBPMN.Process.class, "flowElements")) {
																if (process.getFlowElements().contains(pgw)) {
																	if (process.getFlowElements().contains(prevNode)) {
																		if (process.getFlowElements().contains(pcgw)) {
																			if (pattern_PG2ParallelStepFirst_27_2_black_nac_0BB(
																					sf1, process) == null) {
																				if (pattern_PG2ParallelStepFirst_27_2_black_nac_1BB(
																						pgw, process) == null) {
																					if (pattern_PG2ParallelStepFirst_27_2_black_nac_4BB(
																							pcgw, process) == null) {
																						_result.add(new Object[] {
																								prevNode, process, sf1,
																								pgw, pcgw,
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepFirst_27_3_expressionFBBBBBBB(PG2ParallelStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepFirst_27_4_expressionFBB(PG2ParallelStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepFirst_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_28_1_bindingFB(PG2ParallelStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_28_1_blackFBB(EClass __eClass,
			PG2ParallelStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_28_1_bindingAndBlackFFB(PG2ParallelStepFirst _this) {
		Object[] result_pattern_PG2ParallelStepFirst_28_1_binding = pattern_PG2ParallelStepFirst_28_1_bindingFB(_this);
		if (result_pattern_PG2ParallelStepFirst_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_PG2ParallelStepFirst_28_1_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_28_1_black = pattern_PG2ParallelStepFirst_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_PG2ParallelStepFirst_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PG2ParallelStepFirst_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_28_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_116259 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_116259)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_28_2_black_nac_1BB(ParallelGateway pgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pgw_flowElements_179160 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_179160)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_28_2_black_nac_2BBB(ParallelGateway pgw,
			FlowNode prevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_559606 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_559606)) {
							if (!prevNode.equals(__DEC_pgw___conv_559606)) {
								if (!pcgw.equals(__DEC_pgw___conv_559606)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_28_2_black_nac_3BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_239569 = pcgw.get__conv();
					if (__DEC_pcgw___conv_239569 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_239569)) {
							if (!prevNode.equals(__DEC_pcgw___conv_239569)) {
								if (!pgw.equals(__DEC_pcgw___conv_239569)) {
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

	public static final Object[] pattern_PG2ParallelStepFirst_28_2_black_nac_4BB(ParallelGateway pcgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_pcgw_flowElements_623138 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_623138)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_28_2_black_nac_5BBB(ParallelGateway pcgw,
			FlowNode prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_25429 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_25429)) {
							if (!prevNode.equals(__DEC_pcgw___conv_25429)) {
								if (!pgw.equals(__DEC_pcgw___conv_25429)) {
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

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_28_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof FlowNode) {
			FlowNode prevNode = (FlowNode) tmpPrevNode;
			EObject tmpSf1 = _edge_outgoing.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
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
												if (pattern_PG2ParallelStepFirst_28_2_black_nac_2BBB(pgw, prevNode,
														pcgw) == null) {
													if (pattern_PG2ParallelStepFirst_28_2_black_nac_3BBB(pcgw, prevNode,
															pgw) == null) {
														if (pattern_PG2ParallelStepFirst_28_2_black_nac_5BBB(pcgw,
																prevNode, pgw) == null) {
															for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(prevNode,
																			SimpleBPMN.Process.class, "flowElements")) {
																if (process.getFlowElements().contains(pgw)) {
																	if (process.getFlowElements().contains(sf1)) {
																		if (process.getFlowElements().contains(pcgw)) {
																			if (pattern_PG2ParallelStepFirst_28_2_black_nac_0BB(
																					sf1, process) == null) {
																				if (pattern_PG2ParallelStepFirst_28_2_black_nac_1BB(
																						pgw, process) == null) {
																					if (pattern_PG2ParallelStepFirst_28_2_black_nac_4BB(
																							pcgw, process) == null) {
																						_result.add(new Object[] {
																								prevNode, process, sf1,
																								pgw, pcgw,
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

		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PG2ParallelStepFirst_28_3_expressionFBBBBBBB(PG2ParallelStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PG2ParallelStepFirst_28_4_expressionFBB(PG2ParallelStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_PG2ParallelStepFirst_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_31_1_blackB(PG2ParallelStepFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_31_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_31_2_bindingFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("step");
		EObject _localVariable_1 = sourceMatch.getObject("prevNode");
		EObject _localVariable_2 = targetMatch.getObject("flow");
		EObject _localVariable_3 = sourceMatch.getObject("process");
		EObject _localVariable_4 = sourceMatch.getObject("sf1");
		EObject _localVariable_5 = sourceMatch.getObject("pgw");
		EObject _localVariable_6 = sourceMatch.getObject("pcgw");
		EObject tmpStep = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpPgw = _localVariable_5;
		EObject tmpPcgw = _localVariable_6;
		if (tmpStep instanceof ParallelStep) {
			ParallelStep step = (ParallelStep) tmpStep;
			if (tmpPrevNode instanceof FlowNode) {
				FlowNode prevNode = (FlowNode) tmpPrevNode;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpPgw instanceof ParallelGateway) {
								ParallelGateway pgw = (ParallelGateway) tmpPgw;
								if (tmpPcgw instanceof ParallelGateway) {
									ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
									return new Object[] { step, prevNode, flow, process, sf1, pgw, pcgw, targetMatch,
											sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_31_2_blackFBBBBBBBBB(ParallelStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					if (!sourceMatch.equals(targetMatch)) {
						if (flow.getSteps().contains(step)) {
							if (process.getFlowElements().contains(pgw)) {
								if (process.getFlowElements().contains(sf1)) {
									if (process.getFlowElements().contains(prevNode)) {
										if (process.getFlowElements().contains(pcgw)) {
											if (pgw.equals(sf1.getTargetRef())) {
												if (pcgw.equals(pgw.get__conv())) {
													if (prevNode.equals(sf1.getSourceRef())) {
														boolean pgwisDiverging = pgw.isIsDiverging();
														if (Boolean.valueOf(pgwisDiverging)
																.equals(Boolean.valueOf(true))) {
															boolean pcgwisDiverging = pcgw.isIsDiverging();
															if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
																for (FN2F pnToFlow : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(prevNode, FN2F.class,
																				"source")) {
																	if (flow.equals(pnToFlow.getTarget())) {
																		_result.add(new Object[] { pnToFlow, step,
																				prevNode, flow, process, sf1, pgw, pcgw,
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
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_31_2_greenBBBBBBBBBBF(FN2F pnToFlow, ParallelStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw, Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "PG2ParallelStepFirst";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(pcgw);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(pnToFlow);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { pnToFlow, step, prevNode, flow, process, sf1, pgw, pcgw, sourceMatch, targetMatch,
				isApplicableMatch };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_31_3_bindingFBBBBBBBBBBBB(PG2ParallelStepFirst _this,
			IsApplicableMatchCC isApplicableMatch, FN2F pnToFlow, ParallelStep step, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, pnToFlow, step, prevNode, flow,
				process, sf1, pgw, pcgw, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pnToFlow, step, prevNode, flow, process, sf1, pgw,
					pcgw, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_31_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_31_3_bindingAndBlackFBBBBBBBBBBBB(
			PG2ParallelStepFirst _this, IsApplicableMatchCC isApplicableMatch, FN2F pnToFlow, ParallelStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PG2ParallelStepFirst_31_3_binding = pattern_PG2ParallelStepFirst_31_3_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, pnToFlow, step, prevNode, flow, process, sf1, pgw, pcgw, sourceMatch,
				targetMatch);
		if (result_pattern_PG2ParallelStepFirst_31_3_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepFirst_31_3_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_31_3_black = pattern_PG2ParallelStepFirst_31_3_blackB(csp);
			if (result_pattern_PG2ParallelStepFirst_31_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pnToFlow, step, prevNode, flow, process, sf1, pgw,
						pcgw, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_31_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_31_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PG2ParallelStepFirst";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PG2ParallelStepFirst_31_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_34_1_blackB(PG2ParallelStepFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_34_2_bindingFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pnToFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("step");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_6 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_7 = isApplicableMatch.getObject("pcgw");
		EObject tmpPnToFlow = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpSf1 = _localVariable_5;
		EObject tmpPgw = _localVariable_6;
		EObject tmpPcgw = _localVariable_7;
		if (tmpPnToFlow instanceof FN2F) {
			FN2F pnToFlow = (FN2F) tmpPnToFlow;
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (tmpPrevNode instanceof FlowNode) {
					FlowNode prevNode = (FlowNode) tmpPrevNode;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (tmpPgw instanceof ParallelGateway) {
									ParallelGateway pgw = (ParallelGateway) tmpPgw;
									if (tmpPcgw instanceof ParallelGateway) {
										ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
										return new Object[] { pnToFlow, step, prevNode, flow, process, sf1, pgw, pcgw,
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

	public static final Object[] pattern_PG2ParallelStepFirst_34_2_blackBBBBBBBBB(FN2F pnToFlow, ParallelStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw, IsApplicableMatchCC isApplicableMatch) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					if (prevNode.equals(pnToFlow.getSource())) {
						if (flow.equals(pnToFlow.getTarget())) {
							if (flow.getSteps().contains(step)) {
								if (process.getFlowElements().contains(pgw)) {
									if (process.getFlowElements().contains(sf1)) {
										if (process.getFlowElements().contains(prevNode)) {
											if (process.getFlowElements().contains(pcgw)) {
												if (pgw.equals(sf1.getTargetRef())) {
													if (pcgw.equals(pgw.get__conv())) {
														if (prevNode.equals(sf1.getSourceRef())) {
															boolean pgwisDiverging = pgw.isIsDiverging();
															if (Boolean.valueOf(pgwisDiverging)
																	.equals(Boolean.valueOf(true))) {
																boolean pcgwisDiverging = pcgw.isIsDiverging();
																if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
																	return new Object[] { pnToFlow, step, prevNode,
																			flow, process, sf1, pgw, pcgw,
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
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_34_2_bindingAndBlackFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_PG2ParallelStepFirst_34_2_binding = pattern_PG2ParallelStepFirst_34_2_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_PG2ParallelStepFirst_34_2_binding != null) {
			FN2F pnToFlow = (FN2F) result_pattern_PG2ParallelStepFirst_34_2_binding[0];
			ParallelStep step = (ParallelStep) result_pattern_PG2ParallelStepFirst_34_2_binding[1];
			FlowNode prevNode = (FlowNode) result_pattern_PG2ParallelStepFirst_34_2_binding[2];
			Flow flow = (Flow) result_pattern_PG2ParallelStepFirst_34_2_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_PG2ParallelStepFirst_34_2_binding[4];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_PG2ParallelStepFirst_34_2_binding[5];
			ParallelGateway pgw = (ParallelGateway) result_pattern_PG2ParallelStepFirst_34_2_binding[6];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_PG2ParallelStepFirst_34_2_binding[7];

			Object[] result_pattern_PG2ParallelStepFirst_34_2_black = pattern_PG2ParallelStepFirst_34_2_blackBBBBBBBBB(
					pnToFlow, step, prevNode, flow, process, sf1, pgw, pcgw, isApplicableMatch);
			if (result_pattern_PG2ParallelStepFirst_34_2_black != null) {

				return new Object[] { pnToFlow, step, prevNode, flow, process, sf1, pgw, pcgw, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_34_2_greenBBBFFF(ParallelStep step, ParallelGateway pgw,
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

	public static final PerformRuleResult pattern_PG2ParallelStepFirst_34_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_35_1_blackB(PG2ParallelStepFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_35_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_35_2_black_nac_0BB(ModelgeneratorRuleResult ruleResult,
			FN2F pnToFlow) {
		if (ruleResult.getCorrObjects().contains(pnToFlow)) {
			return new Object[] { ruleResult, pnToFlow };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_35_2_black_nac_1BB(ModelgeneratorRuleResult ruleResult,
			FlowNode prevNode) {
		if (ruleResult.getSourceObjects().contains(prevNode)) {
			return new Object[] { ruleResult, prevNode };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_35_2_black_nac_2BB(ModelgeneratorRuleResult ruleResult,
			SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_35_2_black_nac_3BB(ModelgeneratorRuleResult ruleResult,
			Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PG2ParallelStepFirst_35_2_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList pnToFlowList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpPnToFlow : pnToFlowList.getEntryObjects()) {
				if (tmpPnToFlow instanceof FN2F) {
					FN2F pnToFlow = (FN2F) tmpPnToFlow;
					FlowNode prevNode = pnToFlow.getSource();
					if (prevNode != null) {
						Flow flow = pnToFlow.getTarget();
						if (flow != null) {
							if (pattern_PG2ParallelStepFirst_35_2_black_nac_0BB(ruleResult, pnToFlow) == null) {
								if (pattern_PG2ParallelStepFirst_35_2_black_nac_1BB(ruleResult, prevNode) == null) {
									if (pattern_PG2ParallelStepFirst_35_2_black_nac_3BB(ruleResult, flow) == null) {
										for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
														"flowElements")) {
											if (pattern_PG2ParallelStepFirst_35_2_black_nac_2BB(ruleResult,
													process) == null) {
												_result.add(new Object[] { pnToFlowList, pnToFlow, prevNode, process,
														flow, ruleEntryContainer, ruleResult });
											}
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

	public static final Object[] pattern_PG2ParallelStepFirst_35_3_bindingFBBBBBBB(PG2ParallelStepFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, pnToFlow, prevNode, flow, process,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pnToFlow, prevNode, flow, process, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_35_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_35_3_bindingAndBlackFBBBBBBB(PG2ParallelStepFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_PG2ParallelStepFirst_35_3_binding = pattern_PG2ParallelStepFirst_35_3_bindingFBBBBBBB(
				_this, isApplicableMatch, pnToFlow, prevNode, flow, process, ruleResult);
		if (result_pattern_PG2ParallelStepFirst_35_3_binding != null) {
			CSP csp = (CSP) result_pattern_PG2ParallelStepFirst_35_3_binding[0];

			Object[] result_pattern_PG2ParallelStepFirst_35_3_black = pattern_PG2ParallelStepFirst_35_3_blackB(csp);
			if (result_pattern_PG2ParallelStepFirst_35_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pnToFlow, prevNode, flow, process, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_PG2ParallelStepFirst_35_4_expressionFBB(PG2ParallelStepFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_35_5_black_nac_0B(Flow flow) {
		for (Step otherSteps : flow.getSteps()) {
			return new Object[] { flow };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_35_5_blackBBBB(Flow flow, FN2F pnToFlow,
			FlowNode prevNode, SimpleBPMN.Process process) {
		if (pattern_PG2ParallelStepFirst_35_5_black_nac_0B(flow) == null) {
			return new Object[] { flow, pnToFlow, prevNode, process };
		}
		return null;
	}

	public static final Object[] pattern_PG2ParallelStepFirst_35_6_blackBBBBB(FN2F pnToFlow, FlowNode prevNode,
			Flow flow, SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { pnToFlow, prevNode, flow, process, ruleResult };
	}

	public static final Object[] pattern_PG2ParallelStepFirst_35_6_greenFBBBFFFFFBB(FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ParallelStep step = SimpleUseCaseFactory.eINSTANCE.createParallelStep();
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		ParallelGateway pgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		FN2S pcgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		ParallelGateway pcgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		Object _localVariable_0 = csp.getValue("step", "id");
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_1 = csp.getValue("pgw", "id");
		boolean pcgw_isDiverging_prime = false;
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		flow.getSteps().add(step);
		ruleResult.getTargetObjects().add(step);
		process.getFlowElements().add(sf1);
		sf1.setSourceRef(prevNode);
		ruleResult.getSourceObjects().add(sf1);
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
		String step_id_prime = (String) _localVariable_0;
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		String pgw_id_prime = (String) _localVariable_1;
		pcgw.setIsDiverging(Boolean.valueOf(pcgw_isDiverging_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		step.setId(step_id_prime);
		pgw.setId(pgw_id_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { step, prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_PG2ParallelStepFirst_35_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PG2ParallelStepFirstImpl
