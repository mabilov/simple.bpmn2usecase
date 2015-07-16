/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.FN2S;

import Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE;
import Bpmn2UseCase.Rules.RulesPackage;

import Bpmn2UseCase.SF2F;

import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;
import SimpleBPMN.StartEvent;

import SimpleUseCase.BasicFlow;
import SimpleUseCase.Flow;
import SimpleUseCase.ParallelStep;
import SimpleUseCase.SimpleUseCaseFactory;

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
 * An implementation of the model object '<em><b>Parallel Gateway2 Parallel Step After SE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelGateway2ParallelStepAfterSEImpl extends AbstractRuleImpl
		implements ParallelGateway2ParallelStepAfterSE {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelGateway2ParallelStepAfterSEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParallelGateway2ParallelStepAfterSE();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, StartEvent node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		// initial bindings
		Object[] result1_black = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_0_1_blackBBBBBBBB(this, match, node, process, sf1, pgw,
						pcgw, sf2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[node] = " + node + ", "
					+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = "
					+ pcgw + ", " + "[sf2] = " + sf2 + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_0_2_bindingAndBlackFBBBBBBBB(this, match, node, process,
						sf1, pgw, pcgw, sf2);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[node] = " + node + ", " + "[process] = " + process
					+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ", " + "[sf2] = "
					+ sf2 + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_0_3_expressionFBB(this,
				csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_0_4_blackBBBBBBB(match, node, process, sf1, pgw, pcgw,
							sf2);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[node] = " + node + ", " + "[process] = "
						+ process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ", "
						+ "[sf2] = " + sf2 + ".");
			}
			ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_0_4_greenBBBBBBFFFFFFFF(
					match, process, sf1, pgw, pcgw, sf2);
					// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result4_green[7];
					// EMoflonEdge process__sf2____flowElements = (EMoflonEdge) result4_green[8];
					// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result4_green[9];
					// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result4_green[10];
					// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result4_green[11];
					// EMoflonEdge sf2__pcgw____sourceRef = (EMoflonEdge) result4_green[12];
					// EMoflonEdge pcgw__sf2____outgoing = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_0_5_blackBBBBBBB(match, node, process, sf1, pgw, pcgw,
							sf2);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[node] = " + node + ", " + "[process] = "
						+ process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ", "
						+ "[sf2] = " + sf2 + ".");
			}
			ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_0_5_greenBBBBFFFF(match,
					node, process, sf1);
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result5_green[4];
					// EMoflonEdge process__node____flowElements = (EMoflonEdge) result5_green[5];
					// EMoflonEdge sf1__node____sourceRef = (EMoflonEdge) result5_green[6];
					// EMoflonEdge node__sf1____outgoing = (EMoflonEdge) result5_green[7];

			// register objects to match
			ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_0_6_expressionBBBBBBBB(
					this, match, node, process, sf1, pgw, pcgw, sf2);
			return ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_0_7_expressionF();
		} else {
			return ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_1_1_bindingAndBlackFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		StartEvent node = (StartEvent) result1_bindingAndBlack[0];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[1];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[2];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[3];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[4];
		SF2F _sf2f1 = (SF2F) result1_bindingAndBlack[5];
		ParallelGateway pcgw = (ParallelGateway) result1_bindingAndBlack[6];
		SequenceFlow sf2 = (SequenceFlow) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_1_1_greenBFFBBBFFB(flow, pgw, pcgw, sf2, csp);
		ParallelStep step = (ParallelStep) result1_green[1];
		FN2S _pgw2s = (FN2S) result1_green[2];
		SF2F _sf22f2 = (SF2F) result1_green[6];
		FN2S _pcgw2s = (FN2S) result1_green[7];

		// collect translated elements
		Object[] result2_black = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_1_2_blackBBBBBBB(step, _pgw2s, pgw, pcgw, sf2, _sf22f2,
						_pcgw2s);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[_pgw2s] = " + _pgw2s + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = "
					+ pcgw + ", " + "[sf2] = " + sf2 + ", " + "[_sf22f2] = " + _sf22f2 + ", " + "[_pcgw2s] = " + _pcgw2s
					+ ".");
		}
		Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_1_2_greenFBBBBBBB(step, _pgw2s, pgw, pcgw, sf2, _sf22f2,
						_pcgw2s);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_1_3_blackBBBBBBBBBBBBB(ruleresult, node, flow, step,
						_pgw2s, process, sf1, pgw, _sf2f1, pcgw, sf2, _sf22f2, _pcgw2s);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[node] = " + node + ", " + "[flow] = " + flow + ", "
					+ "[step] = " + step + ", " + "[_pgw2s] = " + _pgw2s + ", " + "[process] = " + process + ", "
					+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[_sf2f1] = " + _sf2f1 + ", " + "[pcgw] = "
					+ pcgw + ", " + "[sf2] = " + sf2 + ", " + "[_sf22f2] = " + _sf22f2 + ", " + "[_pcgw2s] = " + _pcgw2s
					+ ".");
		}
		ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult, flow,
						step, _pgw2s, process, sf1, pgw, pcgw, sf2, _sf22f2, _pcgw2s);
						// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[11];
						// EMoflonEdge flow__step______first = (EMoflonEdge) result3_green[12];
						// EMoflonEdge _pgw2s__pgw____source = (EMoflonEdge) result3_green[13];
						// EMoflonEdge _pgw2s__step____target = (EMoflonEdge) result3_green[14];
						// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[15];
						// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[16];
						// EMoflonEdge process__sf2____flowElements = (EMoflonEdge) result3_green[17];
						// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[18];
						// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[19];
						// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[20];
						// EMoflonEdge sf2__pcgw____sourceRef = (EMoflonEdge) result3_green[21];
						// EMoflonEdge pcgw__sf2____outgoing = (EMoflonEdge) result3_green[22];
						// EMoflonEdge _sf22f2__sf2____source = (EMoflonEdge) result3_green[23];
						// EMoflonEdge _sf22f2__flow____target = (EMoflonEdge) result3_green[24];
						// EMoflonEdge _pcgw2s__pcgw____source = (EMoflonEdge) result3_green[25];
						// EMoflonEdge _pcgw2s__step____target = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_1_5_expressionBBBBBBBBBBBBBB(this, ruleresult, node, flow,
						step, _pgw2s, process, sf1, pgw, _sf2f1, pcgw, sf2, _sf22f2, _pcgw2s);
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_2_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		StartEvent node = (StartEvent) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ParallelGateway pgw = (ParallelGateway) result2_binding[3];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[4];
		SequenceFlow sf2 = (SequenceFlow) result2_binding[5];
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_2_2_blackBFBBBFBBB(node, process, sf1, pgw, pcgw, sf2,
						match)) {
			BasicFlow flow = (BasicFlow) result2_black[1];
			SF2F _sf2f1 = (SF2F) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_2_3_blackBBBBBBBB(node, flow, process, sf1, pgw,
							_sf2f1, pcgw, sf2)) {
				Object[] result3_green = ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_2_3_greenBBBBBBBBFFFFFFFFFFFFFFF(node, flow,
								process, sf1, pgw, _sf2f1, pcgw, sf2);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[9];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__sf2____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[16];
				// EMoflonEdge _sf2f1__sf1____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge _sf2f1__flow____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__node____sourceRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge node__sf1____outgoing = (EMoflonEdge) result3_green[20];
				// EMoflonEdge sf2__pcgw____sourceRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pcgw__sf2____outgoing = (EMoflonEdge) result3_green[22];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_2_4_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, node, flow, process, sf1, pgw, _sf2f1, pcgw, sf2);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[node] = " + node + ", " + "[flow] = " + flow + ", " + "[process] = " + process + ", "
							+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[_sf2f1] = " + _sf2f1 + ", "
							+ "[pcgw] = " + pcgw + ", " + "[sf2] = " + sf2 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, StartEvent node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		match.registerObject("node", node);
		match.registerObject("process", process);
		match.registerObject("sf1", sf1);
		match.registerObject("pgw", pgw);
		match.registerObject("pcgw", pcgw);
		match.registerObject("sf2", sf2);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, StartEvent node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, StartEvent node, BasicFlow flow,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, SF2F _sf2f1, ParallelGateway pcgw,
			SequenceFlow sf2) {// Create CSP
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
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("pgw", pgw);
		isApplicableMatch.registerObject("_sf2f1", _sf2f1);
		isApplicableMatch.registerObject("pcgw", pcgw);
		isApplicableMatch.registerObject("sf2", sf2);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject node, EObject flow, EObject step,
			EObject _pgw2s, EObject process, EObject sf1, EObject pgw, EObject _sf2f1, EObject pcgw, EObject sf2,
			EObject _sf22f2, EObject _pcgw2s) {
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("_pgw2s", _pgw2s);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pgw", pgw);
		ruleresult.registerObject("_sf2f1", _sf2f1);
		ruleresult.registerObject("pcgw", pcgw);
		ruleresult.registerObject("sf2", sf2);
		ruleresult.registerObject("_sf22f2", _sf22f2);
		ruleresult.registerObject("_pcgw2s", _pcgw2s);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("pgw").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getParallelGateway())
				&& match.getObject("pcgw").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getParallelGateway())
				&& match.getObject("sf2").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, BasicFlow flow, ParallelStep step) {
		// initial bindings
		Object[] result1_black = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_10_1_blackBBBB(this, match, flow, step);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_10_2_bindingAndBlackFBBBB(this, match, flow, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_10_3_expressionFBB(this,
				csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_10_4_blackBBB(match, flow, step);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed." + " Variables: "
								+ "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
			}
			ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_10_4_greenBBBFF(match,
					flow, step);
					// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[3];
					// EMoflonEdge flow__step______first = (EMoflonEdge) result4_green[4];

			// collect context elements
			Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_10_5_blackBBB(match, flow, step);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
			}
			ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_10_5_greenBB(match,
					flow);

			// register objects to match
			ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_10_6_expressionBBBB(this, match, flow, step);
			return ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_10_7_expressionF();
		} else {
			return ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_11_1_bindingAndBlackFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		StartEvent node = (StartEvent) result1_bindingAndBlack[0];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[1];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[3];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[4];
		SF2F _sf2f1 = (SF2F) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_11_1_greenBBFBBFFFFFB(flow, step, process, sf1, csp);
		FN2S _pgw2s = (FN2S) result1_green[2];
		ParallelGateway pgw = (ParallelGateway) result1_green[5];
		ParallelGateway pcgw = (ParallelGateway) result1_green[6];
		SequenceFlow sf2 = (SequenceFlow) result1_green[7];
		SF2F _sf22f2 = (SF2F) result1_green[8];
		FN2S _pcgw2s = (FN2S) result1_green[9];

		// collect translated elements
		Object[] result2_black = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_11_2_blackBBBBBBB(step, _pgw2s, pgw, pcgw, sf2, _sf22f2,
						_pcgw2s);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[_pgw2s] = " + _pgw2s + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = "
					+ pcgw + ", " + "[sf2] = " + sf2 + ", " + "[_sf22f2] = " + _sf22f2 + ", " + "[_pcgw2s] = " + _pcgw2s
					+ ".");
		}
		Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_11_2_greenFBBBBBBB(step, _pgw2s, pgw, pcgw, sf2, _sf22f2,
						_pcgw2s);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_11_3_blackBBBBBBBBBBBBB(ruleresult, node, flow, step,
						_pgw2s, process, sf1, pgw, _sf2f1, pcgw, sf2, _sf22f2, _pcgw2s);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[node] = " + node + ", " + "[flow] = " + flow + ", "
					+ "[step] = " + step + ", " + "[_pgw2s] = " + _pgw2s + ", " + "[process] = " + process + ", "
					+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[_sf2f1] = " + _sf2f1 + ", " + "[pcgw] = "
					+ pcgw + ", " + "[sf2] = " + sf2 + ", " + "[_sf22f2] = " + _sf22f2 + ", " + "[_pcgw2s] = " + _pcgw2s
					+ ".");
		}
		ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult, flow,
						step, _pgw2s, process, sf1, pgw, pcgw, sf2, _sf22f2, _pcgw2s);
						// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[11];
						// EMoflonEdge flow__step______first = (EMoflonEdge) result3_green[12];
						// EMoflonEdge _pgw2s__pgw____source = (EMoflonEdge) result3_green[13];
						// EMoflonEdge _pgw2s__step____target = (EMoflonEdge) result3_green[14];
						// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[15];
						// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[16];
						// EMoflonEdge process__sf2____flowElements = (EMoflonEdge) result3_green[17];
						// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[18];
						// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[19];
						// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[20];
						// EMoflonEdge sf2__pcgw____sourceRef = (EMoflonEdge) result3_green[21];
						// EMoflonEdge pcgw__sf2____outgoing = (EMoflonEdge) result3_green[22];
						// EMoflonEdge _sf22f2__sf2____source = (EMoflonEdge) result3_green[23];
						// EMoflonEdge _sf22f2__flow____target = (EMoflonEdge) result3_green[24];
						// EMoflonEdge _pcgw2s__pcgw____source = (EMoflonEdge) result3_green[25];
						// EMoflonEdge _pcgw2s__step____target = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_11_5_expressionBBBBBBBBBBBBBB(this, ruleresult, node, flow,
						step, _pgw2s, process, sf1, pgw, _sf2f1, pcgw, sf2, _sf22f2, _pcgw2s);
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		BasicFlow flow = (BasicFlow) result2_binding[0];
		ParallelStep step = (ParallelStep) result2_binding[1];
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_12_2_blackBBFFB(flow, step, match)) {
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			SF2F _sf2f1 = (SF2F) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_12_3_blackFBBFBB(flow, step, sf1, _sf2f1)) {
				StartEvent node = (StartEvent) result3_black[0];
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[3];
				Object[] result3_green = ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_12_3_greenBBBBBBFFFFFFFFF(node, flow, step,
								process, sf1, _sf2f1);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[7];
				// EMoflonEdge flow__step______first = (EMoflonEdge) result3_green[8];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[9];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _sf2f1__sf1____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _sf2f1__flow____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge sf1__node____sourceRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge node__sf1____outgoing = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_12_4_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, node, flow, step, process, sf1, _sf2f1);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[node] = " + node + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ", "
							+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[_sf2f1] = " + _sf2f1 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, BasicFlow flow, ParallelStep step) {
		match.registerObject("flow", flow);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, BasicFlow flow, ParallelStep step) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, StartEvent node, BasicFlow flow,
			ParallelStep step, SimpleBPMN.Process process, SequenceFlow sf1, SF2F _sf2f1) {// Create CSP
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
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("_sf2f1", _sf2f1);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject node, EObject flow, EObject step,
			EObject _pgw2s, EObject process, EObject sf1, EObject pgw, EObject _sf2f1, EObject pcgw, EObject sf2,
			EObject _sf22f2, EObject _pcgw2s) {
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("_pgw2s", _pgw2s);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pgw", pgw);
		ruleresult.registerObject("_sf2f1", _sf2f1);
		ruleresult.registerObject("pcgw", pcgw);
		ruleresult.registerObject("sf2", sf2);
		ruleresult.registerObject("_sf22f2", _sf22f2);
		ruleresult.registerObject("_pcgw2s", _pcgw2s);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_100(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_20_2_blackFFB(_edge_steps)) {
			BasicFlow flow = (BasicFlow) result2_black[0];
			ParallelStep step = (ParallelStep) result2_black[1];
			Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_20_3_expressionFBBBB(this, match, flow, step)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_20_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_20_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_101(EMoflonEdge _edge___first) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_21_2_blackFFB(_edge___first)) {
			BasicFlow flow = (BasicFlow) result2_black[0];
			ParallelStep step = (ParallelStep) result2_black[1];
			Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_21_3_expressionFBBBB(this, match, flow, step)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_21_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_21_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_305(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_22_2_blackFFFFFFB(_edge_flowElements)) {
			StartEvent node = (StartEvent) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_22_3_expressionFBBBBBBBB(this, match, node, process,
							sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_22_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_22_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_306(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_23_2_blackFFFFFFB(_edge_flowElements)) {
			StartEvent node = (StartEvent) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_23_3_expressionFBBBBBBBB(this, match, node, process,
							sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_23_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_23_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_307(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_24_2_blackFFFFFFB(_edge_flowElements)) {
			StartEvent node = (StartEvent) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_24_3_expressionFBBBBBBBB(this, match, node, process,
							sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_24_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_24_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_308(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_25_2_blackFFFFFFB(_edge_targetRef)) {
			StartEvent node = (StartEvent) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_25_3_expressionFBBBBBBBB(this, match, node, process,
							sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_25_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_25_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_309(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_26_2_blackFFFFFFB(_edge_incoming)) {
			StartEvent node = (StartEvent) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_26_3_expressionFBBBBBBBB(this, match, node, process,
							sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_26_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_26_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_310(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_27_2_blackFFFFFFB(_edge___conv)) {
			StartEvent node = (StartEvent) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_27_3_expressionFBBBBBBBB(this, match, node, process,
							sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_27_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_27_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_311(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_28_2_blackFFFFFFB(_edge_sourceRef)) {
			StartEvent node = (StartEvent) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_28_3_expressionFBBBBBBBB(this, match, node, process,
							sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_28_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_28_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_312(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_29_2_blackFFFFFFB(_edge_outgoing)) {
			StartEvent node = (StartEvent) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_29_3_expressionFBBBBBBBB(this, match, node, process,
							sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_29_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_29_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ParallelGateway2ParallelStepAfterSE");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForNode = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("node")).findAny();
		SimpleBPMN.StartEvent node = (SimpleBPMN.StartEvent) matchForNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.BasicFlow flow = (SimpleUseCase.BasicFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ParallelStep step = (SimpleUseCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_pgw2s = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_pgw2s")).findAny();
		Bpmn2UseCase.FN2S _pgw2s = (Bpmn2UseCase.FN2S) matchFor_pgw2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw")).findAny();
		SimpleBPMN.ParallelGateway pgw = (SimpleBPMN.ParallelGateway) matchForPgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf2f1 = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf2f1")).findAny();
		Bpmn2UseCase.SF2F _sf2f1 = (Bpmn2UseCase.SF2F) matchFor_sf2f1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPcgw = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pcgw")).findAny();
		SimpleBPMN.ParallelGateway pcgw = (SimpleBPMN.ParallelGateway) matchForPcgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf2 = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf2")).findAny();
		SimpleBPMN.SequenceFlow sf2 = (SimpleBPMN.SequenceFlow) matchForSf2.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf22f2 = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf22f2")).findAny();
		Bpmn2UseCase.SF2F _sf22f2 = (Bpmn2UseCase.SF2F) matchFor_sf22f2.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_pcgw2s = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_pcgw2s")).findAny();
		Bpmn2UseCase.FN2S _pcgw2s = (Bpmn2UseCase.FN2S) matchFor_pcgw2s.get().getNode();

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

		eq0.setRuleName("ParallelGateway2ParallelStepAfterSE");
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
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ParallelGateway2ParallelStepAfterSE");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForNode = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("node")).findAny();
		SimpleBPMN.StartEvent node = (SimpleBPMN.StartEvent) matchForNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.BasicFlow flow = (SimpleUseCase.BasicFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ParallelStep step = (SimpleUseCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_pgw2s = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_pgw2s")).findAny();
		Bpmn2UseCase.FN2S _pgw2s = (Bpmn2UseCase.FN2S) matchFor_pgw2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw")).findAny();
		SimpleBPMN.ParallelGateway pgw = (SimpleBPMN.ParallelGateway) matchForPgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf2f1 = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf2f1")).findAny();
		Bpmn2UseCase.SF2F _sf2f1 = (Bpmn2UseCase.SF2F) matchFor_sf2f1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPcgw = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pcgw")).findAny();
		SimpleBPMN.ParallelGateway pcgw = (SimpleBPMN.ParallelGateway) matchForPcgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf2 = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf2")).findAny();
		SimpleBPMN.SequenceFlow sf2 = (SimpleBPMN.SequenceFlow) matchForSf2.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf22f2 = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf22f2")).findAny();
		Bpmn2UseCase.SF2F _sf22f2 = (Bpmn2UseCase.SF2F) matchFor_sf22f2.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_pcgw2s = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_pcgw2s")).findAny();
		Bpmn2UseCase.FN2S _pcgw2s = (Bpmn2UseCase.FN2S) matchFor_pcgw2s.get().getNode();

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

		eq0.setRuleName("ParallelGateway2ParallelStepAfterSE");
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
		Object[] result1_black = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_32_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_32_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_32_2_bindingFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		StartEvent node = (StartEvent) result2_binding[0];
		BasicFlow flow = (BasicFlow) result2_binding[1];
		ParallelStep step = (ParallelStep) result2_binding[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[3];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[4];
		ParallelGateway pgw = (ParallelGateway) result2_binding[5];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[6];
		SequenceFlow sf2 = (SequenceFlow) result2_binding[7];
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_32_2_blackBBBBBBFBBBB(node, flow, step, process, sf1, pgw,
						pcgw, sf2, sourceMatch, targetMatch)) {
			SF2F _sf2f1 = (SF2F) result2_black[6];
			Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_32_2_greenBBBBBBBBBBFB(node, flow, step, process, sf1,
							pgw, _sf2f1, pcgw, sf2, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[10];

			// check csp
			Object[] result3_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_32_3_bindingAndBlackFBBBBBBBBBBBBB(this,
							isApplicableMatch, node, flow, step, process, sf1, pgw, _sf2f1, pcgw, sf2, sourceMatch,
							targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_32_4_blackBB(result, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ParallelGateway2ParallelStepAfterSEImpl.pattern_ParallelGateway2ParallelStepAfterSE_32_4_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_32_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, StartEvent node, BasicFlow flow,
			ParallelStep step, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, SF2F _sf2f1,
			ParallelGateway pcgw, SequenceFlow sf2, Match sourceMatch, Match targetMatch) {// Create CSP
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
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("pgw", pgw);
		isApplicableMatch.registerObject("_sf2f1", _sf2f1);
		isApplicableMatch.registerObject("pcgw", pcgw);
		isApplicableMatch.registerObject("sf2", sf2);
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
		Object[] result1_black = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_35_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_35_2_bindingAndBlackFFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// StartEvent node = (StartEvent) result2_bindingAndBlack[0];
		BasicFlow flow = (BasicFlow) result2_bindingAndBlack[1];
		ParallelStep step = (ParallelStep) result2_bindingAndBlack[2];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[3];
		// SequenceFlow sf1 = (SequenceFlow) result2_bindingAndBlack[4];
		ParallelGateway pgw = (ParallelGateway) result2_bindingAndBlack[5];
		// SF2F _sf2f1 = (SF2F) result2_bindingAndBlack[6];
		ParallelGateway pcgw = (ParallelGateway) result2_bindingAndBlack[7];
		SequenceFlow sf2 = (SequenceFlow) result2_bindingAndBlack[8];
		Object[] result2_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_35_2_greenBBBBBFFFF(flow, step, pgw, pcgw, sf2);
		PerformRuleResult result = (PerformRuleResult) result2_green[5];
		// FN2S _pgw2s = (FN2S) result2_green[6];
		// SF2F _sf22f2 = (SF2F) result2_green[7];
		// FN2S _pcgw2s = (FN2S) result2_green[8];

		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_35_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, SF2F _sf2f1Parameter) {
		// create result
		Object[] result1_black = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_36_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_36_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_36_2_blackFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList _sf2f1List = (RuleEntryList) result2_black[0];
			StartEvent node = (StartEvent) result2_black[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			SequenceFlow sf1 = (SequenceFlow) result2_black[3];
			SF2F _sf2f1 = (SF2F) result2_black[4];
			BasicFlow flow = (BasicFlow) result2_black[5];

			// solve CSP
			Object[] result3_bindingAndBlack = ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_36_3_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
							node, flow, process, sf1, _sf2f1, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[node] = " + node + ", "
						+ "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", "
						+ "[_sf2f1] = " + _sf2f1 + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ParallelGateway2ParallelStepAfterSEImpl
					.pattern_ParallelGateway2ParallelStepAfterSE_36_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = ParallelGateway2ParallelStepAfterSEImpl
						.pattern_ParallelGateway2ParallelStepAfterSE_36_5_blackBBBBB(node, flow, process, sf1, _sf2f1);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_36_6_blackBBBBBB(node, flow, process, sf1,
									_sf2f1, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[node] = " + node + ", " + "[flow] = " + flow + ", " + "[process] = " + process
								+ ", " + "[sf1] = " + sf1 + ", " + "[_sf2f1] = " + _sf2f1 + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					ParallelGateway2ParallelStepAfterSEImpl
							.pattern_ParallelGateway2ParallelStepAfterSE_36_6_greenBFFBBFFFFFBB(flow, process, sf1,
									ruleResult, csp);
					// ParallelStep step = (ParallelStep) result6_green[1];
					// FN2S _pgw2s = (FN2S) result6_green[2];
					// ParallelGateway pgw = (ParallelGateway) result6_green[5];
					// ParallelGateway pcgw = (ParallelGateway) result6_green[6];
					// SequenceFlow sf2 = (SequenceFlow) result6_green[7];
					// SF2F _sf22f2 = (SF2F) result6_green[8];
					// FN2S _pcgw2s = (FN2S) result6_green[9];

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterSEImpl
				.pattern_ParallelGateway2ParallelStepAfterSE_36_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, StartEvent node, BasicFlow flow,
			SimpleBPMN.Process process, SequenceFlow sf1, SF2F _sf2f1, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("_sf2f1", _sf2f1);
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
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0), (StartEvent) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5),
					(SequenceFlow) arguments.get(6));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (StartEvent) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5),
					(SequenceFlow) arguments.get(6));
			return null;
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (StartEvent) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5),
					(SequenceFlow) arguments.get(6));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STARTEVENT_BASICFLOW_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SF2F_PARALLELGATEWAY_SEQUENCEFLOW:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (StartEvent) arguments.get(1),
					(BasicFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4), (ParallelGateway) arguments.get(5), (SF2F) arguments.get(6),
					(ParallelGateway) arguments.get(7), (SequenceFlow) arguments.get(8));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_BWD__MATCH_BASICFLOW_PARALLELSTEP:
			return isAppropriate_BWD((Match) arguments.get(0), (BasicFlow) arguments.get(1),
					(ParallelStep) arguments.get(2));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BASICFLOW_PARALLELSTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (BasicFlow) arguments.get(1),
					(ParallelStep) arguments.get(2));
			return null;
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BASICFLOW_PARALLELSTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (BasicFlow) arguments.get(1),
					(ParallelStep) arguments.get(2));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STARTEVENT_BASICFLOW_PARALLELSTEP_PROCESS_SEQUENCEFLOW_SF2F:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (StartEvent) arguments.get(1),
					(BasicFlow) arguments.get(2), (ParallelStep) arguments.get(3),
					(SimpleBPMN.Process) arguments.get(4), (SequenceFlow) arguments.get(5), (SF2F) arguments.get(6));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_100__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_100((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_101__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_101((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_305__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_305((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_306__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_306((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_307__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_307((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_308__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_308((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_309__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_309((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_310__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_310((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_311__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_311((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_312__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_312((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_STARTEVENT_BASICFLOW_PARALLELSTEP_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SF2F_PARALLELGATEWAY_SEQUENCEFLOW_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (StartEvent) arguments.get(1),
					(BasicFlow) arguments.get(2), (ParallelStep) arguments.get(3),
					(SimpleBPMN.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(ParallelGateway) arguments.get(6), (SF2F) arguments.get(7), (ParallelGateway) arguments.get(8),
					(SequenceFlow) arguments.get(9), (Match) arguments.get(10), (Match) arguments.get(11));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___GENERATE_MODEL__RULEENTRYCONTAINER_SF2F:
			return generateModel((RuleEntryContainer) arguments.get(0), (SF2F) arguments.get(1));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STARTEVENT_BASICFLOW_PROCESS_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (StartEvent) arguments.get(1),
					(BasicFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4), (SF2F) arguments.get(5),
					(ModelgeneratorRuleResult) arguments.get(6));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_0_1_blackBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				return new Object[] { _this, match, node, process, sf1, pgw, pcgw, sf2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_0_2_bindingFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, node, process, sf1, pgw, pcgw, sf2 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_0_2_bindingAndBlackFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_0_2_binding = pattern_ParallelGateway2ParallelStepAfterSE_0_2_bindingFBBBBBBBB(
				_this, match, node, process, sf1, pgw, pcgw, sf2);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterSE_0_2_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_0_2_black = pattern_ParallelGateway2ParallelStepAfterSE_0_2_blackB(
					csp);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_0_2_black != null) {

				return new Object[] { csp, _this, match, node, process, sf1, pgw, pcgw, sf2 };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_0_3_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_0_4_blackBBBBBBB(Match match,
			StartEvent node, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw,
			SequenceFlow sf2) {
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				return new Object[] { match, node, process, sf1, pgw, pcgw, sf2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_0_4_greenBBBBBBFFFFFFFF(Match match,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf2____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf2__pcgw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgw__sf2____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(pgw);
		match.getToBeTranslatedNodes().add(pcgw);
		match.getToBeTranslatedNodes().add(sf2);
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String process__sf2____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf2__pcgw____sourceRef_name_prime = "sourceRef";
		String pcgw__sf2____outgoing_name_prime = "outgoing";
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		match.getToBeTranslatedEdges().add(process__pgw____flowElements);
		process__pcgw____flowElements.setSrc(process);
		process__pcgw____flowElements.setTrg(pcgw);
		match.getToBeTranslatedEdges().add(process__pcgw____flowElements);
		process__sf2____flowElements.setSrc(process);
		process__sf2____flowElements.setTrg(sf2);
		match.getToBeTranslatedEdges().add(process__sf2____flowElements);
		sf1__pgw____targetRef.setSrc(sf1);
		sf1__pgw____targetRef.setTrg(pgw);
		match.getToBeTranslatedEdges().add(sf1__pgw____targetRef);
		pgw__sf1____incoming.setSrc(pgw);
		pgw__sf1____incoming.setTrg(sf1);
		match.getToBeTranslatedEdges().add(pgw__sf1____incoming);
		pgw__pcgw______conv.setSrc(pgw);
		pgw__pcgw______conv.setTrg(pcgw);
		match.getToBeTranslatedEdges().add(pgw__pcgw______conv);
		sf2__pcgw____sourceRef.setSrc(sf2);
		sf2__pcgw____sourceRef.setTrg(pcgw);
		match.getToBeTranslatedEdges().add(sf2__pcgw____sourceRef);
		pcgw__sf2____outgoing.setSrc(pcgw);
		pcgw__sf2____outgoing.setTrg(sf2);
		match.getToBeTranslatedEdges().add(pcgw__sf2____outgoing);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		process__sf2____flowElements.setName(process__sf2____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf2__pcgw____sourceRef.setName(sf2__pcgw____sourceRef_name_prime);
		pcgw__sf2____outgoing.setName(pcgw__sf2____outgoing_name_prime);
		return new Object[] { match, process, sf1, pgw, pcgw, sf2, process__pgw____flowElements,
				process__pcgw____flowElements, process__sf2____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, sf2__pcgw____sourceRef, pcgw__sf2____outgoing };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_0_5_blackBBBBBBB(Match match,
			StartEvent node, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw,
			SequenceFlow sf2) {
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				return new Object[] { match, node, process, sf1, pgw, pcgw, sf2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_0_5_greenBBBBFFFF(Match match,
			StartEvent node, SimpleBPMN.Process process, SequenceFlow sf1) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(node);
		match.getContextNodes().add(process);
		match.getContextNodes().add(sf1);
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String sf1__node____sourceRef_name_prime = "sourceRef";
		String node__sf1____outgoing_name_prime = "outgoing";
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		match.getContextEdges().add(process__sf1____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		match.getContextEdges().add(process__node____flowElements);
		sf1__node____sourceRef.setSrc(sf1);
		sf1__node____sourceRef.setTrg(node);
		match.getContextEdges().add(sf1__node____sourceRef);
		node__sf1____outgoing.setSrc(node);
		node__sf1____outgoing.setTrg(sf1);
		match.getContextEdges().add(node__sf1____outgoing);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__node____flowElements.setName(process__node____flowElements_name_prime);
		sf1__node____sourceRef.setName(sf1__node____sourceRef_name_prime);
		node__sf1____outgoing.setName(node__sf1____outgoing_name_prime);
		return new Object[] { match, node, process, sf1, process__sf1____flowElements, process__node____flowElements,
				sf1__node____sourceRef, node__sf1____outgoing };
	}

	public static final void pattern_ParallelGateway2ParallelStepAfterSE_0_6_expressionBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		_this.registerObjectsToMatch_FWD(match, node, process, sf1, pgw, pcgw, sf2);

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_1_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("node");
		EObject _localVariable_1 = isApplicableMatch.getObject("flow");
		EObject _localVariable_2 = isApplicableMatch.getObject("process");
		EObject _localVariable_3 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_4 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_5 = isApplicableMatch.getObject("_sf2f1");
		EObject _localVariable_6 = isApplicableMatch.getObject("pcgw");
		EObject _localVariable_7 = isApplicableMatch.getObject("sf2");
		EObject tmpNode = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpSf1 = _localVariable_3;
		EObject tmpPgw = _localVariable_4;
		EObject tmp_sf2f1 = _localVariable_5;
		EObject tmpPcgw = _localVariable_6;
		EObject tmpSf2 = _localVariable_7;
		if (tmpNode instanceof StartEvent) {
			StartEvent node = (StartEvent) tmpNode;
			if (tmpFlow instanceof BasicFlow) {
				BasicFlow flow = (BasicFlow) tmpFlow;
				if (tmpProcess instanceof SimpleBPMN.Process) {
					SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
					if (tmpSf1 instanceof SequenceFlow) {
						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
						if (tmpPgw instanceof ParallelGateway) {
							ParallelGateway pgw = (ParallelGateway) tmpPgw;
							if (tmp_sf2f1 instanceof SF2F) {
								SF2F _sf2f1 = (SF2F) tmp_sf2f1;
								if (tmpPcgw instanceof ParallelGateway) {
									ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
									if (tmpSf2 instanceof SequenceFlow) {
										SequenceFlow sf2 = (SequenceFlow) tmpSf2;
										return new Object[] { node, flow, process, sf1, pgw, _sf2f1, pcgw, sf2,
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_1_1_blackBBBBBBBBBFB(StartEvent node,
			BasicFlow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, SF2F _sf2f1,
			ParallelGateway pcgw, SequenceFlow sf2, ParallelGateway2ParallelStepAfterSE _this,
			IsApplicableMatch isApplicableMatch) {
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { node, flow, process, sf1, pgw, _sf2f1, pcgw, sf2, _this, csp,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_1_1_bindingAndBlackFFFFFFFFBFB(
			ParallelGateway2ParallelStepAfterSE _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_1_1_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_binding != null) {
			StartEvent node = (StartEvent) result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_binding[0];
			BasicFlow flow = (BasicFlow) result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_binding[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_binding[2];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_binding[3];
			ParallelGateway pgw = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_binding[4];
			SF2F _sf2f1 = (SF2F) result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_binding[5];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_binding[6];
			SequenceFlow sf2 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_binding[7];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_black = pattern_ParallelGateway2ParallelStepAfterSE_1_1_blackBBBBBBBBBFB(
					node, flow, process, sf1, pgw, _sf2f1, pcgw, sf2, _this, isApplicableMatch);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterSE_1_1_black[9];

				return new Object[] { node, flow, process, sf1, pgw, _sf2f1, pcgw, sf2, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_1_1_greenBFFBBBFFB(BasicFlow flow,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2, CSP csp) {
		ParallelStep step = SimpleUseCaseFactory.eINSTANCE.createParallelStep();
		FN2S _pgw2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		SF2F _sf22f2 = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		FN2S _pcgw2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		flow.getSteps().add(step);
		flow.set__first(step);
		_pgw2s.setSource(pgw);
		_pgw2s.setTarget(step);
		_sf22f2.setSource(sf2);
		_sf22f2.setTarget(flow);
		_pcgw2s.setSource(pcgw);
		_pcgw2s.setTarget(step);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { flow, step, _pgw2s, pgw, pcgw, sf2, _sf22f2, _pcgw2s, csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_1_2_blackBBBBBBB(ParallelStep step,
			FN2S _pgw2s, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2, SF2F _sf22f2, FN2S _pcgw2s) {
		if (!pcgw.equals(pgw)) {
			if (!_pcgw2s.equals(_pgw2s)) {
				return new Object[] { step, _pgw2s, pgw, pcgw, sf2, _sf22f2, _pcgw2s };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_1_2_greenFBBBBBBB(ParallelStep step,
			FN2S _pgw2s, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2, SF2F _sf22f2, FN2S _pcgw2s) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(_pgw2s);
		ruleresult.getTranslatedElements().add(pgw);
		ruleresult.getTranslatedElements().add(pcgw);
		ruleresult.getTranslatedElements().add(sf2);
		ruleresult.getCreatedLinkElements().add(_sf22f2);
		ruleresult.getCreatedLinkElements().add(_pcgw2s);
		return new Object[] { ruleresult, step, _pgw2s, pgw, pcgw, sf2, _sf22f2, _pcgw2s };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_1_3_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject node, EObject flow, EObject step, EObject _pgw2s, EObject process,
			EObject sf1, EObject pgw, EObject _sf2f1, EObject pcgw, EObject sf2, EObject _sf22f2, EObject _pcgw2s) {
		if (!node.equals(step)) {
			if (!node.equals(process)) {
				if (!node.equals(sf1)) {
					if (!node.equals(pgw)) {
						if (!node.equals(pcgw)) {
							if (!node.equals(sf2)) {
								if (!flow.equals(node)) {
									if (!flow.equals(step)) {
										if (!flow.equals(process)) {
											if (!flow.equals(sf1)) {
												if (!flow.equals(pgw)) {
													if (!flow.equals(pcgw)) {
														if (!flow.equals(sf2)) {
															if (!_pgw2s.equals(node)) {
																if (!_pgw2s.equals(flow)) {
																	if (!_pgw2s.equals(step)) {
																		if (!_pgw2s.equals(process)) {
																			if (!_pgw2s.equals(sf1)) {
																				if (!_pgw2s.equals(pgw)) {
																					if (!_pgw2s.equals(_sf2f1)) {
																						if (!_pgw2s.equals(pcgw)) {
																							if (!_pgw2s.equals(sf2)) {
																								if (!_pgw2s.equals(
																										_sf22f2)) {
																									if (!process.equals(
																											step)) {
																										if (!process
																												.equals(sf1)) {
																											if (!process
																													.equals(sf2)) {
																												if (!sf1.equals(
																														step)) {
																													if (!sf1.equals(
																															sf2)) {
																														if (!pgw.equals(
																																step)) {
																															if (!pgw.equals(
																																	process)) {
																																if (!pgw.equals(
																																		sf1)) {
																																	if (!pgw.equals(
																																			sf2)) {
																																		if (!_sf2f1
																																				.equals(node)) {
																																			if (!_sf2f1
																																					.equals(flow)) {
																																				if (!_sf2f1
																																						.equals(step)) {
																																					if (!_sf2f1
																																							.equals(process)) {
																																						if (!_sf2f1
																																								.equals(sf1)) {
																																							if (!_sf2f1
																																									.equals(pgw)) {
																																								if (!_sf2f1
																																										.equals(pcgw)) {
																																									if (!_sf2f1
																																											.equals(sf2)) {
																																										if (!pcgw
																																												.equals(step)) {
																																											if (!pcgw
																																													.equals(process)) {
																																												if (!pcgw
																																														.equals(sf1)) {
																																													if (!pcgw
																																															.equals(pgw)) {
																																														if (!pcgw
																																																.equals(sf2)) {
																																															if (!sf2.equals(
																																																	step)) {
																																																if (!_sf22f2
																																																		.equals(node)) {
																																																	if (!_sf22f2
																																																			.equals(flow)) {
																																																		if (!_sf22f2
																																																				.equals(step)) {
																																																			if (!_sf22f2
																																																					.equals(process)) {
																																																				if (!_sf22f2
																																																						.equals(sf1)) {
																																																					if (!_sf22f2
																																																							.equals(pgw)) {
																																																						if (!_sf22f2
																																																								.equals(_sf2f1)) {
																																																							if (!_sf22f2
																																																									.equals(pcgw)) {
																																																								if (!_sf22f2
																																																										.equals(sf2)) {
																																																									if (!_pcgw2s
																																																											.equals(node)) {
																																																										if (!_pcgw2s
																																																												.equals(flow)) {
																																																											if (!_pcgw2s
																																																													.equals(step)) {
																																																												if (!_pcgw2s
																																																														.equals(_pgw2s)) {
																																																													if (!_pcgw2s
																																																															.equals(process)) {
																																																														if (!_pcgw2s
																																																																.equals(sf1)) {
																																																															if (!_pcgw2s
																																																																	.equals(pgw)) {
																																																																if (!_pcgw2s
																																																																		.equals(_sf2f1)) {
																																																																	if (!_pcgw2s
																																																																			.equals(pcgw)) {
																																																																		if (!_pcgw2s
																																																																				.equals(sf2)) {
																																																																			if (!_pcgw2s
																																																																					.equals(_sf22f2)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						node,
																																																																						flow,
																																																																						step,
																																																																						_pgw2s,
																																																																						process,
																																																																						sf1,
																																																																						pgw,
																																																																						_sf2f1,
																																																																						pcgw,
																																																																						sf2,
																																																																						_sf22f2,
																																																																						_pcgw2s };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject flow, EObject step, EObject _pgw2s, EObject process, EObject sf1,
			EObject pgw, EObject pcgw, EObject sf2, EObject _sf22f2, EObject _pcgw2s) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step______first = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pgw2s__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pgw2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf2____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf2__pcgw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgw__sf2____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf22f2__sf2____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf22f2__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pcgw2s__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pcgw2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelGateway2ParallelStepAfterSE";
		String flow__step____steps_name_prime = "steps";
		String flow__step______first_name_prime = "__first";
		String _pgw2s__pgw____source_name_prime = "source";
		String _pgw2s__step____target_name_prime = "target";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String process__sf2____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf2__pcgw____sourceRef_name_prime = "sourceRef";
		String pcgw__sf2____outgoing_name_prime = "outgoing";
		String _sf22f2__sf2____source_name_prime = "source";
		String _sf22f2__flow____target_name_prime = "target";
		String _pcgw2s__pcgw____source_name_prime = "source";
		String _pcgw2s__step____target_name_prime = "target";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		flow__step______first.setSrc(flow);
		flow__step______first.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step______first);
		_pgw2s__pgw____source.setSrc(_pgw2s);
		_pgw2s__pgw____source.setTrg(pgw);
		ruleresult.getCreatedEdges().add(_pgw2s__pgw____source);
		_pgw2s__step____target.setSrc(_pgw2s);
		_pgw2s__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(_pgw2s__step____target);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		ruleresult.getTranslatedEdges().add(process__pgw____flowElements);
		process__pcgw____flowElements.setSrc(process);
		process__pcgw____flowElements.setTrg(pcgw);
		ruleresult.getTranslatedEdges().add(process__pcgw____flowElements);
		process__sf2____flowElements.setSrc(process);
		process__sf2____flowElements.setTrg(sf2);
		ruleresult.getTranslatedEdges().add(process__sf2____flowElements);
		sf1__pgw____targetRef.setSrc(sf1);
		sf1__pgw____targetRef.setTrg(pgw);
		ruleresult.getTranslatedEdges().add(sf1__pgw____targetRef);
		pgw__sf1____incoming.setSrc(pgw);
		pgw__sf1____incoming.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(pgw__sf1____incoming);
		pgw__pcgw______conv.setSrc(pgw);
		pgw__pcgw______conv.setTrg(pcgw);
		ruleresult.getTranslatedEdges().add(pgw__pcgw______conv);
		sf2__pcgw____sourceRef.setSrc(sf2);
		sf2__pcgw____sourceRef.setTrg(pcgw);
		ruleresult.getTranslatedEdges().add(sf2__pcgw____sourceRef);
		pcgw__sf2____outgoing.setSrc(pcgw);
		pcgw__sf2____outgoing.setTrg(sf2);
		ruleresult.getTranslatedEdges().add(pcgw__sf2____outgoing);
		_sf22f2__sf2____source.setSrc(_sf22f2);
		_sf22f2__sf2____source.setTrg(sf2);
		ruleresult.getCreatedEdges().add(_sf22f2__sf2____source);
		_sf22f2__flow____target.setSrc(_sf22f2);
		_sf22f2__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(_sf22f2__flow____target);
		_pcgw2s__pcgw____source.setSrc(_pcgw2s);
		_pcgw2s__pcgw____source.setTrg(pcgw);
		ruleresult.getCreatedEdges().add(_pcgw2s__pcgw____source);
		_pcgw2s__step____target.setSrc(_pcgw2s);
		_pcgw2s__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(_pcgw2s__step____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		flow__step______first.setName(flow__step______first_name_prime);
		_pgw2s__pgw____source.setName(_pgw2s__pgw____source_name_prime);
		_pgw2s__step____target.setName(_pgw2s__step____target_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		process__sf2____flowElements.setName(process__sf2____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf2__pcgw____sourceRef.setName(sf2__pcgw____sourceRef_name_prime);
		pcgw__sf2____outgoing.setName(pcgw__sf2____outgoing_name_prime);
		_sf22f2__sf2____source.setName(_sf22f2__sf2____source_name_prime);
		_sf22f2__flow____target.setName(_sf22f2__flow____target_name_prime);
		_pcgw2s__pcgw____source.setName(_pcgw2s__pcgw____source_name_prime);
		_pcgw2s__step____target.setName(_pcgw2s__step____target_name_prime);
		return new Object[] { ruleresult, flow, step, _pgw2s, process, sf1, pgw, pcgw, sf2, _sf22f2, _pcgw2s,
				flow__step____steps, flow__step______first, _pgw2s__pgw____source, _pgw2s__step____target,
				process__pgw____flowElements, process__pcgw____flowElements, process__sf2____flowElements,
				sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv, sf2__pcgw____sourceRef,
				pcgw__sf2____outgoing, _sf22f2__sf2____source, _sf22f2__flow____target, _pcgw2s__pcgw____source,
				_pcgw2s__step____target };
	}

	public static final void pattern_ParallelGateway2ParallelStepAfterSE_1_5_expressionBBBBBBBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, PerformRuleResult ruleresult, EObject node, EObject flow,
			EObject step, EObject _pgw2s, EObject process, EObject sf1, EObject pgw, EObject _sf2f1, EObject pcgw,
			EObject sf2, EObject _sf22f2, EObject _pcgw2s) {
		_this.registerObjects_FWD(ruleresult, node, flow, step, _pgw2s, process, sf1, pgw, _sf2f1, pcgw, sf2, _sf22f2,
				_pcgw2s);

	}

	public static final PerformRuleResult pattern_ParallelGateway2ParallelStepAfterSE_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_2_1_bindingFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_2_1_blackFBB(EClass eClass,
			ParallelGateway2ParallelStepAfterSE _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_2_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_2_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_2_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterSE_2_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_2_1_black = pattern_ParallelGateway2ParallelStepAfterSE_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterSE_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelGateway2ParallelStepAfterSE";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_2_2_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("node");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("sf1");
		EObject _localVariable_3 = match.getObject("pgw");
		EObject _localVariable_4 = match.getObject("pcgw");
		EObject _localVariable_5 = match.getObject("sf2");
		EObject tmpNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpSf1 = _localVariable_2;
		EObject tmpPgw = _localVariable_3;
		EObject tmpPcgw = _localVariable_4;
		EObject tmpSf2 = _localVariable_5;
		if (tmpNode instanceof StartEvent) {
			StartEvent node = (StartEvent) tmpNode;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpSf1 instanceof SequenceFlow) {
					SequenceFlow sf1 = (SequenceFlow) tmpSf1;
					if (tmpPgw instanceof ParallelGateway) {
						ParallelGateway pgw = (ParallelGateway) tmpPgw;
						if (tmpPcgw instanceof ParallelGateway) {
							ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
							if (tmpSf2 instanceof SequenceFlow) {
								SequenceFlow sf2 = (SequenceFlow) tmpSf2;
								return new Object[] { node, process, sf1, pgw, pcgw, sf2, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_2_2_blackBFBBBFBBB(
			StartEvent node, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw,
			SequenceFlow sf2, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				boolean pgwisDiverging = pgw.isIsDiverging();
				if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
					boolean pcgwisDiverging = pcgw.isIsDiverging();
					if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
						for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(sf1,
								SF2F.class, "source")) {
							Flow tmpFlow = _sf2f1.getTarget();
							if (tmpFlow instanceof BasicFlow) {
								BasicFlow flow = (BasicFlow) tmpFlow;
								_result.add(new Object[] { node, flow, process, sf1, pgw, _sf2f1, pcgw, sf2, match });
							}

						}
					}

				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_2_3_blackBBBBBBBB(
			StartEvent node, BasicFlow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				if (process.getFlowElements().contains(pgw)) {
					if (process.getFlowElements().contains(sf1)) {
						if (process.getFlowElements().contains(node)) {
							if (process.getFlowElements().contains(pcgw)) {
								if (process.getFlowElements().contains(sf2)) {
									if (pgw.equals(sf1.getTargetRef())) {
										if (pcgw.equals(pgw.get__conv())) {
											if (sf1.equals(_sf2f1.getSource())) {
												if (flow.equals(_sf2f1.getTarget())) {
													if (node.equals(sf1.getSourceRef())) {
														if (pcgw.equals(sf2.getSourceRef())) {
															boolean pgwisDiverging = pgw.isIsDiverging();
															if (Boolean.valueOf(pgwisDiverging)
																	.equals(Boolean.valueOf(true))) {
																boolean pcgwisDiverging = pcgw.isIsDiverging();
																if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
																	_result.add(new Object[] { node, flow, process, sf1,
																			pgw, _sf2f1, pcgw, sf2 });
																}

															}

														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_2_3_greenBBBBBBBBFFFFFFFFFFFFFFF(
			StartEvent node, BasicFlow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf2____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2f1__sf1____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2f1__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf2__pcgw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgw__sf2____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String process__sf2____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String _sf2f1__sf1____source_name_prime = "source";
		String _sf2f1__flow____target_name_prime = "target";
		String sf1__node____sourceRef_name_prime = "sourceRef";
		String node__sf1____outgoing_name_prime = "outgoing";
		String sf2__pcgw____sourceRef_name_prime = "sourceRef";
		String pcgw__sf2____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(_sf2f1);
		isApplicableMatch.getAllContextElements().add(pcgw);
		isApplicableMatch.getAllContextElements().add(sf2);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(process__pgw____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(process__sf1____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		isApplicableMatch.getAllContextElements().add(process__node____flowElements);
		process__pcgw____flowElements.setSrc(process);
		process__pcgw____flowElements.setTrg(pcgw);
		isApplicableMatch.getAllContextElements().add(process__pcgw____flowElements);
		process__sf2____flowElements.setSrc(process);
		process__sf2____flowElements.setTrg(sf2);
		isApplicableMatch.getAllContextElements().add(process__sf2____flowElements);
		sf1__pgw____targetRef.setSrc(sf1);
		sf1__pgw____targetRef.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(sf1__pgw____targetRef);
		pgw__sf1____incoming.setSrc(pgw);
		pgw__sf1____incoming.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(pgw__sf1____incoming);
		pgw__pcgw______conv.setSrc(pgw);
		pgw__pcgw______conv.setTrg(pcgw);
		isApplicableMatch.getAllContextElements().add(pgw__pcgw______conv);
		_sf2f1__sf1____source.setSrc(_sf2f1);
		_sf2f1__sf1____source.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(_sf2f1__sf1____source);
		_sf2f1__flow____target.setSrc(_sf2f1);
		_sf2f1__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(_sf2f1__flow____target);
		sf1__node____sourceRef.setSrc(sf1);
		sf1__node____sourceRef.setTrg(node);
		isApplicableMatch.getAllContextElements().add(sf1__node____sourceRef);
		node__sf1____outgoing.setSrc(node);
		node__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(node__sf1____outgoing);
		sf2__pcgw____sourceRef.setSrc(sf2);
		sf2__pcgw____sourceRef.setTrg(pcgw);
		isApplicableMatch.getAllContextElements().add(sf2__pcgw____sourceRef);
		pcgw__sf2____outgoing.setSrc(pcgw);
		pcgw__sf2____outgoing.setTrg(sf2);
		isApplicableMatch.getAllContextElements().add(pcgw__sf2____outgoing);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__node____flowElements.setName(process__node____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		process__sf2____flowElements.setName(process__sf2____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		_sf2f1__sf1____source.setName(_sf2f1__sf1____source_name_prime);
		_sf2f1__flow____target.setName(_sf2f1__flow____target_name_prime);
		sf1__node____sourceRef.setName(sf1__node____sourceRef_name_prime);
		node__sf1____outgoing.setName(node__sf1____outgoing_name_prime);
		sf2__pcgw____sourceRef.setName(sf2__pcgw____sourceRef_name_prime);
		pcgw__sf2____outgoing.setName(pcgw__sf2____outgoing_name_prime);
		return new Object[] { node, flow, process, sf1, pgw, _sf2f1, pcgw, sf2, isApplicableMatch,
				process__pgw____flowElements, process__sf1____flowElements, process__node____flowElements,
				process__pcgw____flowElements, process__sf2____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, _sf2f1__sf1____source, _sf2f1__flow____target,
				sf1__node____sourceRef, node__sf1____outgoing, sf2__pcgw____sourceRef, pcgw__sf2____outgoing };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_2_4_bindingFBBBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, IsApplicableMatch isApplicableMatch, StartEvent node,
			BasicFlow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, SF2F _sf2f1,
			ParallelGateway pcgw, SequenceFlow sf2) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, node, flow, process, sf1, pgw, _sf2f1,
				pcgw, sf2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, node, flow, process, sf1, pgw, _sf2f1, pcgw, sf2 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_2_4_bindingAndBlackFBBBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, IsApplicableMatch isApplicableMatch, StartEvent node,
			BasicFlow flow, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, SF2F _sf2f1,
			ParallelGateway pcgw, SequenceFlow sf2) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_2_4_binding = pattern_ParallelGateway2ParallelStepAfterSE_2_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, node, flow, process, sf1, pgw, _sf2f1, pcgw, sf2);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterSE_2_4_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_2_4_black = pattern_ParallelGateway2ParallelStepAfterSE_2_4_blackB(
					csp);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, node, flow, process, sf1, pgw, _sf2f1, pcgw, sf2 };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_2_5_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_2_6_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_2_6_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelGateway2ParallelStepAfterSE";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelGateway2ParallelStepAfterSE_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_10_1_blackBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, BasicFlow flow, ParallelStep step) {
		return new Object[] { _this, match, flow, step };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_10_2_bindingFBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, BasicFlow flow, ParallelStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, flow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_10_2_bindingAndBlackFBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, BasicFlow flow, ParallelStep step) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_10_2_binding = pattern_ParallelGateway2ParallelStepAfterSE_10_2_bindingFBBBB(
				_this, match, flow, step);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterSE_10_2_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_10_2_black = pattern_ParallelGateway2ParallelStepAfterSE_10_2_blackB(
					csp);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_10_2_black != null) {

				return new Object[] { csp, _this, match, flow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_10_3_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_10_4_blackBBB(Match match, BasicFlow flow,
			ParallelStep step) {
		return new Object[] { match, flow, step };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_10_4_greenBBBFF(Match match,
			BasicFlow flow, ParallelStep step) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step______first = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String flow__step____steps_name_prime = "steps";
		String flow__step______first_name_prime = "__first";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		flow__step______first.setSrc(flow);
		flow__step______first.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step______first);
		flow__step____steps.setName(flow__step____steps_name_prime);
		flow__step______first.setName(flow__step______first_name_prime);
		return new Object[] { match, flow, step, flow__step____steps, flow__step______first };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_10_5_blackBBB(Match match, BasicFlow flow,
			ParallelStep step) {
		return new Object[] { match, flow, step };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_10_5_greenBB(Match match, BasicFlow flow) {
		match.getContextNodes().add(flow);
		return new Object[] { match, flow };
	}

	public static final void pattern_ParallelGateway2ParallelStepAfterSE_10_6_expressionBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, BasicFlow flow, ParallelStep step) {
		_this.registerObjectsToMatch_BWD(match, flow, step);

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_11_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("node");
		EObject _localVariable_1 = isApplicableMatch.getObject("flow");
		EObject _localVariable_2 = isApplicableMatch.getObject("step");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_5 = isApplicableMatch.getObject("_sf2f1");
		EObject tmpNode = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmp_sf2f1 = _localVariable_5;
		if (tmpNode instanceof StartEvent) {
			StartEvent node = (StartEvent) tmpNode;
			if (tmpFlow instanceof BasicFlow) {
				BasicFlow flow = (BasicFlow) tmpFlow;
				if (tmpStep instanceof ParallelStep) {
					ParallelStep step = (ParallelStep) tmpStep;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmp_sf2f1 instanceof SF2F) {
								SF2F _sf2f1 = (SF2F) tmp_sf2f1;
								return new Object[] { node, flow, step, process, sf1, _sf2f1, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_11_1_blackBBBBBBBFB(StartEvent node,
			BasicFlow flow, ParallelStep step, SimpleBPMN.Process process, SequenceFlow sf1, SF2F _sf2f1,
			ParallelGateway2ParallelStepAfterSE _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { node, flow, step, process, sf1, _sf2f1, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_11_1_bindingAndBlackFFFFFFBFB(
			ParallelGateway2ParallelStepAfterSE _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_11_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_11_1_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_11_1_binding != null) {
			StartEvent node = (StartEvent) result_pattern_ParallelGateway2ParallelStepAfterSE_11_1_binding[0];
			BasicFlow flow = (BasicFlow) result_pattern_ParallelGateway2ParallelStepAfterSE_11_1_binding[1];
			ParallelStep step = (ParallelStep) result_pattern_ParallelGateway2ParallelStepAfterSE_11_1_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_ParallelGateway2ParallelStepAfterSE_11_1_binding[3];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepAfterSE_11_1_binding[4];
			SF2F _sf2f1 = (SF2F) result_pattern_ParallelGateway2ParallelStepAfterSE_11_1_binding[5];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_11_1_black = pattern_ParallelGateway2ParallelStepAfterSE_11_1_blackBBBBBBBFB(
					node, flow, step, process, sf1, _sf2f1, _this, isApplicableMatch);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterSE_11_1_black[7];

				return new Object[] { node, flow, step, process, sf1, _sf2f1, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_11_1_greenBBFBBFFFFFB(BasicFlow flow,
			ParallelStep step, SimpleBPMN.Process process, SequenceFlow sf1, CSP csp) {
		FN2S _pgw2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		ParallelGateway pgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		ParallelGateway pcgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		SequenceFlow sf2 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		SF2F _sf22f2 = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		FN2S _pcgw2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("pgw", "id");
		boolean pcgw_isDiverging_prime = false;
		_pgw2s.setTarget(step);
		_pgw2s.setSource(pgw);
		process.getFlowElements().add(pgw);
		sf1.setTargetRef(pgw);
		process.getFlowElements().add(pcgw);
		pgw.set__conv(pcgw);
		process.getFlowElements().add(sf2);
		sf2.setSourceRef(pcgw);
		_sf22f2.setSource(sf2);
		_sf22f2.setTarget(flow);
		_pcgw2s.setSource(pcgw);
		_pcgw2s.setTarget(step);
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		String pgw_id_prime = (String) _localVariable_0;
		pcgw.setIsDiverging(Boolean.valueOf(pcgw_isDiverging_prime));
		pgw.setId(pgw_id_prime);
		return new Object[] { flow, step, _pgw2s, process, sf1, pgw, pcgw, sf2, _sf22f2, _pcgw2s, csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_11_2_blackBBBBBBB(ParallelStep step,
			FN2S _pgw2s, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2, SF2F _sf22f2, FN2S _pcgw2s) {
		if (!pcgw.equals(pgw)) {
			if (!_pcgw2s.equals(_pgw2s)) {
				return new Object[] { step, _pgw2s, pgw, pcgw, sf2, _sf22f2, _pcgw2s };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_11_2_greenFBBBBBBB(ParallelStep step,
			FN2S _pgw2s, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2, SF2F _sf22f2, FN2S _pcgw2s) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(_pgw2s);
		ruleresult.getCreatedElements().add(pgw);
		ruleresult.getCreatedElements().add(pcgw);
		ruleresult.getCreatedElements().add(sf2);
		ruleresult.getCreatedLinkElements().add(_sf22f2);
		ruleresult.getCreatedLinkElements().add(_pcgw2s);
		return new Object[] { ruleresult, step, _pgw2s, pgw, pcgw, sf2, _sf22f2, _pcgw2s };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_11_3_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject node, EObject flow, EObject step, EObject _pgw2s, EObject process,
			EObject sf1, EObject pgw, EObject _sf2f1, EObject pcgw, EObject sf2, EObject _sf22f2, EObject _pcgw2s) {
		if (!node.equals(step)) {
			if (!node.equals(process)) {
				if (!node.equals(sf1)) {
					if (!node.equals(pgw)) {
						if (!node.equals(pcgw)) {
							if (!node.equals(sf2)) {
								if (!flow.equals(node)) {
									if (!flow.equals(step)) {
										if (!flow.equals(process)) {
											if (!flow.equals(sf1)) {
												if (!flow.equals(pgw)) {
													if (!flow.equals(pcgw)) {
														if (!flow.equals(sf2)) {
															if (!_pgw2s.equals(node)) {
																if (!_pgw2s.equals(flow)) {
																	if (!_pgw2s.equals(step)) {
																		if (!_pgw2s.equals(process)) {
																			if (!_pgw2s.equals(sf1)) {
																				if (!_pgw2s.equals(pgw)) {
																					if (!_pgw2s.equals(_sf2f1)) {
																						if (!_pgw2s.equals(pcgw)) {
																							if (!_pgw2s.equals(sf2)) {
																								if (!_pgw2s.equals(
																										_sf22f2)) {
																									if (!process.equals(
																											step)) {
																										if (!process
																												.equals(sf1)) {
																											if (!process
																													.equals(sf2)) {
																												if (!sf1.equals(
																														step)) {
																													if (!sf1.equals(
																															sf2)) {
																														if (!pgw.equals(
																																step)) {
																															if (!pgw.equals(
																																	process)) {
																																if (!pgw.equals(
																																		sf1)) {
																																	if (!pgw.equals(
																																			sf2)) {
																																		if (!_sf2f1
																																				.equals(node)) {
																																			if (!_sf2f1
																																					.equals(flow)) {
																																				if (!_sf2f1
																																						.equals(step)) {
																																					if (!_sf2f1
																																							.equals(process)) {
																																						if (!_sf2f1
																																								.equals(sf1)) {
																																							if (!_sf2f1
																																									.equals(pgw)) {
																																								if (!_sf2f1
																																										.equals(pcgw)) {
																																									if (!_sf2f1
																																											.equals(sf2)) {
																																										if (!pcgw
																																												.equals(step)) {
																																											if (!pcgw
																																													.equals(process)) {
																																												if (!pcgw
																																														.equals(sf1)) {
																																													if (!pcgw
																																															.equals(pgw)) {
																																														if (!pcgw
																																																.equals(sf2)) {
																																															if (!sf2.equals(
																																																	step)) {
																																																if (!_sf22f2
																																																		.equals(node)) {
																																																	if (!_sf22f2
																																																			.equals(flow)) {
																																																		if (!_sf22f2
																																																				.equals(step)) {
																																																			if (!_sf22f2
																																																					.equals(process)) {
																																																				if (!_sf22f2
																																																						.equals(sf1)) {
																																																					if (!_sf22f2
																																																							.equals(pgw)) {
																																																						if (!_sf22f2
																																																								.equals(_sf2f1)) {
																																																							if (!_sf22f2
																																																									.equals(pcgw)) {
																																																								if (!_sf22f2
																																																										.equals(sf2)) {
																																																									if (!_pcgw2s
																																																											.equals(node)) {
																																																										if (!_pcgw2s
																																																												.equals(flow)) {
																																																											if (!_pcgw2s
																																																													.equals(step)) {
																																																												if (!_pcgw2s
																																																														.equals(_pgw2s)) {
																																																													if (!_pcgw2s
																																																															.equals(process)) {
																																																														if (!_pcgw2s
																																																																.equals(sf1)) {
																																																															if (!_pcgw2s
																																																																	.equals(pgw)) {
																																																																if (!_pcgw2s
																																																																		.equals(_sf2f1)) {
																																																																	if (!_pcgw2s
																																																																			.equals(pcgw)) {
																																																																		if (!_pcgw2s
																																																																				.equals(sf2)) {
																																																																			if (!_pcgw2s
																																																																					.equals(_sf22f2)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						node,
																																																																						flow,
																																																																						step,
																																																																						_pgw2s,
																																																																						process,
																																																																						sf1,
																																																																						pgw,
																																																																						_sf2f1,
																																																																						pcgw,
																																																																						sf2,
																																																																						_sf22f2,
																																																																						_pcgw2s };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject flow, EObject step, EObject _pgw2s, EObject process, EObject sf1,
			EObject pgw, EObject pcgw, EObject sf2, EObject _sf22f2, EObject _pcgw2s) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step______first = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pgw2s__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pgw2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf2____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf2__pcgw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgw__sf2____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf22f2__sf2____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf22f2__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pcgw2s__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pcgw2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelGateway2ParallelStepAfterSE";
		String flow__step____steps_name_prime = "steps";
		String flow__step______first_name_prime = "__first";
		String _pgw2s__pgw____source_name_prime = "source";
		String _pgw2s__step____target_name_prime = "target";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String process__sf2____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf2__pcgw____sourceRef_name_prime = "sourceRef";
		String pcgw__sf2____outgoing_name_prime = "outgoing";
		String _sf22f2__sf2____source_name_prime = "source";
		String _sf22f2__flow____target_name_prime = "target";
		String _pcgw2s__pcgw____source_name_prime = "source";
		String _pcgw2s__step____target_name_prime = "target";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		flow__step______first.setSrc(flow);
		flow__step______first.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step______first);
		_pgw2s__pgw____source.setSrc(_pgw2s);
		_pgw2s__pgw____source.setTrg(pgw);
		ruleresult.getCreatedEdges().add(_pgw2s__pgw____source);
		_pgw2s__step____target.setSrc(_pgw2s);
		_pgw2s__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(_pgw2s__step____target);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		ruleresult.getCreatedEdges().add(process__pgw____flowElements);
		process__pcgw____flowElements.setSrc(process);
		process__pcgw____flowElements.setTrg(pcgw);
		ruleresult.getCreatedEdges().add(process__pcgw____flowElements);
		process__sf2____flowElements.setSrc(process);
		process__sf2____flowElements.setTrg(sf2);
		ruleresult.getCreatedEdges().add(process__sf2____flowElements);
		sf1__pgw____targetRef.setSrc(sf1);
		sf1__pgw____targetRef.setTrg(pgw);
		ruleresult.getCreatedEdges().add(sf1__pgw____targetRef);
		pgw__sf1____incoming.setSrc(pgw);
		pgw__sf1____incoming.setTrg(sf1);
		ruleresult.getCreatedEdges().add(pgw__sf1____incoming);
		pgw__pcgw______conv.setSrc(pgw);
		pgw__pcgw______conv.setTrg(pcgw);
		ruleresult.getCreatedEdges().add(pgw__pcgw______conv);
		sf2__pcgw____sourceRef.setSrc(sf2);
		sf2__pcgw____sourceRef.setTrg(pcgw);
		ruleresult.getCreatedEdges().add(sf2__pcgw____sourceRef);
		pcgw__sf2____outgoing.setSrc(pcgw);
		pcgw__sf2____outgoing.setTrg(sf2);
		ruleresult.getCreatedEdges().add(pcgw__sf2____outgoing);
		_sf22f2__sf2____source.setSrc(_sf22f2);
		_sf22f2__sf2____source.setTrg(sf2);
		ruleresult.getCreatedEdges().add(_sf22f2__sf2____source);
		_sf22f2__flow____target.setSrc(_sf22f2);
		_sf22f2__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(_sf22f2__flow____target);
		_pcgw2s__pcgw____source.setSrc(_pcgw2s);
		_pcgw2s__pcgw____source.setTrg(pcgw);
		ruleresult.getCreatedEdges().add(_pcgw2s__pcgw____source);
		_pcgw2s__step____target.setSrc(_pcgw2s);
		_pcgw2s__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(_pcgw2s__step____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		flow__step______first.setName(flow__step______first_name_prime);
		_pgw2s__pgw____source.setName(_pgw2s__pgw____source_name_prime);
		_pgw2s__step____target.setName(_pgw2s__step____target_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		process__sf2____flowElements.setName(process__sf2____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf2__pcgw____sourceRef.setName(sf2__pcgw____sourceRef_name_prime);
		pcgw__sf2____outgoing.setName(pcgw__sf2____outgoing_name_prime);
		_sf22f2__sf2____source.setName(_sf22f2__sf2____source_name_prime);
		_sf22f2__flow____target.setName(_sf22f2__flow____target_name_prime);
		_pcgw2s__pcgw____source.setName(_pcgw2s__pcgw____source_name_prime);
		_pcgw2s__step____target.setName(_pcgw2s__step____target_name_prime);
		return new Object[] { ruleresult, flow, step, _pgw2s, process, sf1, pgw, pcgw, sf2, _sf22f2, _pcgw2s,
				flow__step____steps, flow__step______first, _pgw2s__pgw____source, _pgw2s__step____target,
				process__pgw____flowElements, process__pcgw____flowElements, process__sf2____flowElements,
				sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv, sf2__pcgw____sourceRef,
				pcgw__sf2____outgoing, _sf22f2__sf2____source, _sf22f2__flow____target, _pcgw2s__pcgw____source,
				_pcgw2s__step____target };
	}

	public static final void pattern_ParallelGateway2ParallelStepAfterSE_11_5_expressionBBBBBBBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, PerformRuleResult ruleresult, EObject node, EObject flow,
			EObject step, EObject _pgw2s, EObject process, EObject sf1, EObject pgw, EObject _sf2f1, EObject pcgw,
			EObject sf2, EObject _sf22f2, EObject _pcgw2s) {
		_this.registerObjects_BWD(ruleresult, node, flow, step, _pgw2s, process, sf1, pgw, _sf2f1, pcgw, sf2, _sf22f2,
				_pcgw2s);

	}

	public static final PerformRuleResult pattern_ParallelGateway2ParallelStepAfterSE_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_12_1_bindingFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_12_1_blackFBB(EClass eClass,
			ParallelGateway2ParallelStepAfterSE _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_12_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_12_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_12_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterSE_12_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_12_1_black = pattern_ParallelGateway2ParallelStepAfterSE_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterSE_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelGateway2ParallelStepAfterSE";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_12_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("flow");
		EObject _localVariable_1 = match.getObject("step");
		EObject tmpFlow = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		if (tmpFlow instanceof BasicFlow) {
			BasicFlow flow = (BasicFlow) tmpFlow;
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				return new Object[] { flow, step, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_12_2_blackBBFFB(BasicFlow flow,
			ParallelStep step, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow, SF2F.class,
				"target")) {
			SequenceFlow sf1 = _sf2f1.getSource();
			if (sf1 != null) {
				_result.add(new Object[] { flow, step, sf1, _sf2f1, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_12_3_blackFBBFBB(BasicFlow flow,
			ParallelStep step, SequenceFlow sf1, SF2F _sf2f1) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (flow.getSteps().contains(step)) {
			if (step.equals(flow.get__first())) {
				if (sf1.equals(_sf2f1.getSource())) {
					if (flow.equals(_sf2f1.getTarget())) {
						FlowNode tmpNode = sf1.getSourceRef();
						if (tmpNode instanceof StartEvent) {
							StartEvent node = (StartEvent) tmpNode;
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
								if (process.getFlowElements().contains(node)) {
									_result.add(new Object[] { node, flow, step, process, sf1, _sf2f1 });
								}
							}
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_12_3_greenBBBBBBFFFFFFFFF(StartEvent node,
			BasicFlow flow, ParallelStep step, SimpleBPMN.Process process, SequenceFlow sf1, SF2F _sf2f1) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step______first = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2f1__sf1____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2f1__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String flow__step____steps_name_prime = "steps";
		String flow__step______first_name_prime = "__first";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String _sf2f1__sf1____source_name_prime = "source";
		String _sf2f1__flow____target_name_prime = "target";
		String sf1__node____sourceRef_name_prime = "sourceRef";
		String node__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(_sf2f1);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		flow__step______first.setSrc(flow);
		flow__step______first.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step______first);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(process__sf1____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		isApplicableMatch.getAllContextElements().add(process__node____flowElements);
		_sf2f1__sf1____source.setSrc(_sf2f1);
		_sf2f1__sf1____source.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(_sf2f1__sf1____source);
		_sf2f1__flow____target.setSrc(_sf2f1);
		_sf2f1__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(_sf2f1__flow____target);
		sf1__node____sourceRef.setSrc(sf1);
		sf1__node____sourceRef.setTrg(node);
		isApplicableMatch.getAllContextElements().add(sf1__node____sourceRef);
		node__sf1____outgoing.setSrc(node);
		node__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(node__sf1____outgoing);
		flow__step____steps.setName(flow__step____steps_name_prime);
		flow__step______first.setName(flow__step______first_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__node____flowElements.setName(process__node____flowElements_name_prime);
		_sf2f1__sf1____source.setName(_sf2f1__sf1____source_name_prime);
		_sf2f1__flow____target.setName(_sf2f1__flow____target_name_prime);
		sf1__node____sourceRef.setName(sf1__node____sourceRef_name_prime);
		node__sf1____outgoing.setName(node__sf1____outgoing_name_prime);
		return new Object[] { node, flow, step, process, sf1, _sf2f1, isApplicableMatch, flow__step____steps,
				flow__step______first, process__sf1____flowElements, process__node____flowElements,
				_sf2f1__sf1____source, _sf2f1__flow____target, sf1__node____sourceRef, node__sf1____outgoing };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_12_4_bindingFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, IsApplicableMatch isApplicableMatch, StartEvent node,
			BasicFlow flow, ParallelStep step, SimpleBPMN.Process process, SequenceFlow sf1, SF2F _sf2f1) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, node, flow, step, process, sf1,
				_sf2f1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, node, flow, step, process, sf1, _sf2f1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_12_4_bindingAndBlackFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, IsApplicableMatch isApplicableMatch, StartEvent node,
			BasicFlow flow, ParallelStep step, SimpleBPMN.Process process, SequenceFlow sf1, SF2F _sf2f1) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_12_4_binding = pattern_ParallelGateway2ParallelStepAfterSE_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, node, flow, step, process, sf1, _sf2f1);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterSE_12_4_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_12_4_black = pattern_ParallelGateway2ParallelStepAfterSE_12_4_blackB(
					csp);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, node, flow, step, process, sf1, _sf2f1 };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_12_5_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_12_6_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_12_6_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelGateway2ParallelStepAfterSE";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelGateway2ParallelStepAfterSE_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_20_1_bindingFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_20_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepAfterSE _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_20_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_20_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_20_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterSE_20_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_20_1_black = pattern_ParallelGateway2ParallelStepAfterSE_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterSE_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_20_2_blackFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof BasicFlow) {
			BasicFlow flow = (BasicFlow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (step.equals(flow.get__first())) {
						_result.add(new Object[] { flow, step, _edge_steps });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_20_3_expressionFBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, BasicFlow flow, ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_20_4_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterSE_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_21_1_bindingFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_21_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepAfterSE _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_21_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_21_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_21_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterSE_21_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_21_1_black = pattern_ParallelGateway2ParallelStepAfterSE_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterSE_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_21_2_blackFFB(
			EMoflonEdge _edge___first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge___first.getSrc();
		if (tmpFlow instanceof BasicFlow) {
			BasicFlow flow = (BasicFlow) tmpFlow;
			EObject tmpStep = _edge___first.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (step.equals(flow.get__first())) {
						_result.add(new Object[] { flow, step, _edge___first });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_21_3_expressionFBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, BasicFlow flow, ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_21_4_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterSE_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_1_bindingFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepAfterSE _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_22_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_22_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterSE_22_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_22_1_black = pattern_ParallelGateway2ParallelStepAfterSE_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterSE_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_663867 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_663867)) {
					if (!pcgw.equals(__DEC_pgw___conv_663867)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_844185 = pcgw.get__conv();
			if (__DEC_pcgw___conv_844185 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_844185)) {
					if (!pgw.equals(__DEC_pcgw___conv_844185)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_454538 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_454538)) {
					if (!pgw.equals(__DEC_pcgw___conv_454538)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_22_2_blackFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpPgw = _edge_flowElements.getTrg();
			if (tmpPgw instanceof ParallelGateway) {
				ParallelGateway pgw = (ParallelGateway) tmpPgw;
				if (process.getFlowElements().contains(pgw)) {
					ParallelGateway pcgw = pgw.get__conv();
					if (pcgw != null) {
						if (!pcgw.equals(pgw)) {
							if (process.getFlowElements().contains(pcgw)) {
								boolean pgwisDiverging = pgw.isIsDiverging();
								if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
									boolean pcgwisDiverging = pcgw.isIsDiverging();
									if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
										if (pattern_ParallelGateway2ParallelStepAfterSE_22_2_black_nac_0BB(pgw,
												pcgw) == null) {
											if (pattern_ParallelGateway2ParallelStepAfterSE_22_2_black_nac_1BB(pcgw,
													pgw) == null) {
												if (pattern_ParallelGateway2ParallelStepAfterSE_22_2_black_nac_2BB(pcgw,
														pgw) == null) {
													for (FlowElement tmpSf1 : process.getFlowElements()) {
														if (tmpSf1 instanceof SequenceFlow) {
															SequenceFlow sf1 = (SequenceFlow) tmpSf1;
															if (pgw.equals(sf1.getTargetRef())) {
																FlowNode tmpNode = sf1.getSourceRef();
																if (tmpNode instanceof StartEvent) {
																	StartEvent node = (StartEvent) tmpNode;
																	if (process.getFlowElements().contains(node)) {
																		if (pattern_ParallelGateway2ParallelStepAfterSE_22_2_black_nac_4BB(
																				sf1, pcgw) == null) {
																			for (FlowElement tmpSf2 : process
																					.getFlowElements()) {
																				if (tmpSf2 instanceof SequenceFlow) {
																					SequenceFlow sf2 = (SequenceFlow) tmpSf2;
																					if (!sf1.equals(sf2)) {
																						if (pcgw.equals(
																								sf2.getSourceRef())) {
																							if (pattern_ParallelGateway2ParallelStepAfterSE_22_2_black_nac_3BB(
																									sf2, pgw) == null) {
																								if (pattern_ParallelGateway2ParallelStepAfterSE_22_2_black_nac_5BB(
																										sf2,
																										pcgw) == null) {
																									_result.add(
																											new Object[] {
																													node,
																													process,
																													sf1,
																													pgw,
																													pcgw,
																													sf2,
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_22_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_22_4_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterSE_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_1_bindingFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepAfterSE _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_23_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_23_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterSE_23_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_23_1_black = pattern_ParallelGateway2ParallelStepAfterSE_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterSE_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_518756 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_518756)) {
					if (!pcgw.equals(__DEC_pgw___conv_518756)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_210810 = pcgw.get__conv();
			if (__DEC_pcgw___conv_210810 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_210810)) {
					if (!pgw.equals(__DEC_pcgw___conv_210810)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_794107 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_794107)) {
					if (!pgw.equals(__DEC_pcgw___conv_794107)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_23_2_blackFFFFFFB(
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
						for (FlowElement tmpPgw : process.getFlowElements()) {
							if (tmpPgw instanceof ParallelGateway) {
								ParallelGateway pgw = (ParallelGateway) tmpPgw;
								if (!pcgw.equals(pgw)) {
									if (pcgw.equals(pgw.get__conv())) {
										boolean pgwisDiverging = pgw.isIsDiverging();
										if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
											if (pattern_ParallelGateway2ParallelStepAfterSE_23_2_black_nac_0BB(pgw,
													pcgw) == null) {
												if (pattern_ParallelGateway2ParallelStepAfterSE_23_2_black_nac_1BB(pcgw,
														pgw) == null) {
													if (pattern_ParallelGateway2ParallelStepAfterSE_23_2_black_nac_2BB(
															pcgw, pgw) == null) {
														for (FlowElement tmpSf1 : process.getFlowElements()) {
															if (tmpSf1 instanceof SequenceFlow) {
																SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																if (pgw.equals(sf1.getTargetRef())) {
																	FlowNode tmpNode = sf1.getSourceRef();
																	if (tmpNode instanceof StartEvent) {
																		StartEvent node = (StartEvent) tmpNode;
																		if (process.getFlowElements().contains(node)) {
																			if (pattern_ParallelGateway2ParallelStepAfterSE_23_2_black_nac_4BB(
																					sf1, pcgw) == null) {
																				for (FlowElement tmpSf2 : process
																						.getFlowElements()) {
																					if (tmpSf2 instanceof SequenceFlow) {
																						SequenceFlow sf2 = (SequenceFlow) tmpSf2;
																						if (!sf1.equals(sf2)) {
																							if (pcgw.equals(sf2
																									.getSourceRef())) {
																								if (pattern_ParallelGateway2ParallelStepAfterSE_23_2_black_nac_3BB(
																										sf2,
																										pgw) == null) {
																									if (pattern_ParallelGateway2ParallelStepAfterSE_23_2_black_nac_5BB(
																											sf2,
																											pcgw) == null) {
																										_result.add(
																												new Object[] {
																														node,
																														process,
																														sf1,
																														pgw,
																														pcgw,
																														sf2,
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_23_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_23_4_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_23_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterSE_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_1_bindingFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepAfterSE _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_24_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_24_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterSE_24_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_24_1_black = pattern_ParallelGateway2ParallelStepAfterSE_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterSE_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_996395 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_996395)) {
					if (!pcgw.equals(__DEC_pgw___conv_996395)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_890549 = pcgw.get__conv();
			if (__DEC_pcgw___conv_890549 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_890549)) {
					if (!pgw.equals(__DEC_pcgw___conv_890549)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_682275 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_682275)) {
					if (!pgw.equals(__DEC_pcgw___conv_682275)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_24_2_blackFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpSf2 = _edge_flowElements.getTrg();
			if (tmpSf2 instanceof SequenceFlow) {
				SequenceFlow sf2 = (SequenceFlow) tmpSf2;
				if (process.getFlowElements().contains(sf2)) {
					FlowNode tmpPcgw = sf2.getSourceRef();
					if (tmpPcgw instanceof ParallelGateway) {
						ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
						if (process.getFlowElements().contains(pcgw)) {
							boolean pcgwisDiverging = pcgw.isIsDiverging();
							if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
								if (pattern_ParallelGateway2ParallelStepAfterSE_24_2_black_nac_5BB(sf2, pcgw) == null) {
									for (FlowElement tmpPgw : process.getFlowElements()) {
										if (tmpPgw instanceof ParallelGateway) {
											ParallelGateway pgw = (ParallelGateway) tmpPgw;
											if (!pcgw.equals(pgw)) {
												if (pcgw.equals(pgw.get__conv())) {
													boolean pgwisDiverging = pgw.isIsDiverging();
													if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
														if (pattern_ParallelGateway2ParallelStepAfterSE_24_2_black_nac_0BB(
																pgw, pcgw) == null) {
															if (pattern_ParallelGateway2ParallelStepAfterSE_24_2_black_nac_1BB(
																	pcgw, pgw) == null) {
																if (pattern_ParallelGateway2ParallelStepAfterSE_24_2_black_nac_2BB(
																		pcgw, pgw) == null) {
																	if (pattern_ParallelGateway2ParallelStepAfterSE_24_2_black_nac_3BB(
																			sf2, pgw) == null) {
																		for (FlowElement tmpSf1 : process
																				.getFlowElements()) {
																			if (tmpSf1 instanceof SequenceFlow) {
																				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																				if (!sf1.equals(sf2)) {
																					if (pgw.equals(
																							sf1.getTargetRef())) {
																						FlowNode tmpNode = sf1
																								.getSourceRef();
																						if (tmpNode instanceof StartEvent) {
																							StartEvent node = (StartEvent) tmpNode;
																							if (process
																									.getFlowElements()
																									.contains(node)) {
																								if (pattern_ParallelGateway2ParallelStepAfterSE_24_2_black_nac_4BB(
																										sf1,
																										pcgw) == null) {
																									_result.add(
																											new Object[] {
																													node,
																													process,
																													sf1,
																													pgw,
																													pcgw,
																													sf2,
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_24_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_24_4_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_24_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterSE_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_1_bindingFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepAfterSE _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_25_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_25_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterSE_25_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_25_1_black = pattern_ParallelGateway2ParallelStepAfterSE_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterSE_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_611375 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_611375)) {
					if (!pcgw.equals(__DEC_pgw___conv_611375)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_307621 = pcgw.get__conv();
			if (__DEC_pcgw___conv_307621 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_307621)) {
					if (!pgw.equals(__DEC_pcgw___conv_307621)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_765983 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_765983)) {
					if (!pgw.equals(__DEC_pcgw___conv_765983)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_25_2_blackFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_targetRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPgw = _edge_targetRef.getTrg();
			if (tmpPgw instanceof ParallelGateway) {
				ParallelGateway pgw = (ParallelGateway) tmpPgw;
				if (pgw.equals(sf1.getTargetRef())) {
					FlowNode tmpNode = sf1.getSourceRef();
					if (tmpNode instanceof StartEvent) {
						StartEvent node = (StartEvent) tmpNode;
						ParallelGateway pcgw = pgw.get__conv();
						if (pcgw != null) {
							if (!pcgw.equals(pgw)) {
								boolean pgwisDiverging = pgw.isIsDiverging();
								if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
									boolean pcgwisDiverging = pcgw.isIsDiverging();
									if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
										if (pattern_ParallelGateway2ParallelStepAfterSE_25_2_black_nac_0BB(pgw,
												pcgw) == null) {
											if (pattern_ParallelGateway2ParallelStepAfterSE_25_2_black_nac_1BB(pcgw,
													pgw) == null) {
												if (pattern_ParallelGateway2ParallelStepAfterSE_25_2_black_nac_2BB(pcgw,
														pgw) == null) {
													if (pattern_ParallelGateway2ParallelStepAfterSE_25_2_black_nac_4BB(
															sf1, pcgw) == null) {
														for (SequenceFlow sf2 : pcgw.getOutgoing()) {
															if (!sf1.equals(sf2)) {
																if (pattern_ParallelGateway2ParallelStepAfterSE_25_2_black_nac_3BB(
																		sf2, pgw) == null) {
																	if (pattern_ParallelGateway2ParallelStepAfterSE_25_2_black_nac_5BB(
																			sf2, pcgw) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(sf1,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(pgw)) {
																				if (process.getFlowElements()
																						.contains(node)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (process.getFlowElements()
																								.contains(sf2)) {
																							_result.add(new Object[] {
																									node, process, sf1,
																									pgw, pcgw, sf2,
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

		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_25_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_25_4_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_25_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterSE_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_1_bindingFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepAfterSE _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_26_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_26_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterSE_26_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_26_1_black = pattern_ParallelGateway2ParallelStepAfterSE_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterSE_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_430296 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_430296)) {
					if (!pcgw.equals(__DEC_pgw___conv_430296)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_828373 = pcgw.get__conv();
			if (__DEC_pcgw___conv_828373 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_828373)) {
					if (!pgw.equals(__DEC_pcgw___conv_828373)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_931448 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_931448)) {
					if (!pgw.equals(__DEC_pcgw___conv_931448)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_26_2_blackFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPgw = _edge_incoming.getSrc();
		if (tmpPgw instanceof ParallelGateway) {
			ParallelGateway pgw = (ParallelGateway) tmpPgw;
			EObject tmpSf1 = _edge_incoming.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (pgw.equals(sf1.getTargetRef())) {
					ParallelGateway pcgw = pgw.get__conv();
					if (pcgw != null) {
						if (!pcgw.equals(pgw)) {
							boolean pgwisDiverging = pgw.isIsDiverging();
							if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
								FlowNode tmpNode = sf1.getSourceRef();
								if (tmpNode instanceof StartEvent) {
									StartEvent node = (StartEvent) tmpNode;
									boolean pcgwisDiverging = pcgw.isIsDiverging();
									if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
										if (pattern_ParallelGateway2ParallelStepAfterSE_26_2_black_nac_0BB(pgw,
												pcgw) == null) {
											if (pattern_ParallelGateway2ParallelStepAfterSE_26_2_black_nac_1BB(pcgw,
													pgw) == null) {
												if (pattern_ParallelGateway2ParallelStepAfterSE_26_2_black_nac_2BB(pcgw,
														pgw) == null) {
													if (pattern_ParallelGateway2ParallelStepAfterSE_26_2_black_nac_4BB(
															sf1, pcgw) == null) {
														for (SequenceFlow sf2 : pcgw.getOutgoing()) {
															if (!sf1.equals(sf2)) {
																if (pattern_ParallelGateway2ParallelStepAfterSE_26_2_black_nac_3BB(
																		sf2, pgw) == null) {
																	if (pattern_ParallelGateway2ParallelStepAfterSE_26_2_black_nac_5BB(
																			sf2, pcgw) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(pgw,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(sf1)) {
																				if (process.getFlowElements()
																						.contains(node)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (process.getFlowElements()
																								.contains(sf2)) {
																							_result.add(new Object[] {
																									node, process, sf1,
																									pgw, pcgw, sf2,
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

		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_26_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_26_4_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_26_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterSE_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_1_bindingFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepAfterSE _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_27_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_27_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterSE_27_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_27_1_black = pattern_ParallelGateway2ParallelStepAfterSE_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterSE_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_951 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_951)) {
					if (!pcgw.equals(__DEC_pgw___conv_951)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_618285 = pcgw.get__conv();
			if (__DEC_pcgw___conv_618285 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_618285)) {
					if (!pgw.equals(__DEC_pcgw___conv_618285)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_227900 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_227900)) {
					if (!pgw.equals(__DEC_pcgw___conv_227900)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_27_2_blackFFFFFFB(
			EMoflonEdge _edge___conv) {
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
								if (pattern_ParallelGateway2ParallelStepAfterSE_27_2_black_nac_0BB(pgw, pcgw) == null) {
									if (pattern_ParallelGateway2ParallelStepAfterSE_27_2_black_nac_1BB(pcgw,
											pgw) == null) {
										if (pattern_ParallelGateway2ParallelStepAfterSE_27_2_black_nac_2BB(pcgw,
												pgw) == null) {
											for (SequenceFlow sf1 : pgw.getIncoming()) {
												FlowNode tmpNode = sf1.getSourceRef();
												if (tmpNode instanceof StartEvent) {
													StartEvent node = (StartEvent) tmpNode;
													if (pattern_ParallelGateway2ParallelStepAfterSE_27_2_black_nac_4BB(
															sf1, pcgw) == null) {
														for (SequenceFlow sf2 : pcgw.getOutgoing()) {
															if (!sf1.equals(sf2)) {
																if (pattern_ParallelGateway2ParallelStepAfterSE_27_2_black_nac_3BB(
																		sf2, pgw) == null) {
																	if (pattern_ParallelGateway2ParallelStepAfterSE_27_2_black_nac_5BB(
																			sf2, pcgw) == null) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(pgw,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(sf1)) {
																				if (process.getFlowElements()
																						.contains(node)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (process.getFlowElements()
																								.contains(sf2)) {
																							_result.add(new Object[] {
																									node, process, sf1,
																									pgw, pcgw, sf2,
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

		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_27_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_27_4_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_27_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterSE_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_1_bindingFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepAfterSE _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_28_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_28_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterSE_28_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_28_1_black = pattern_ParallelGateway2ParallelStepAfterSE_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterSE_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_744232 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_744232)) {
					if (!pcgw.equals(__DEC_pgw___conv_744232)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_385028 = pcgw.get__conv();
			if (__DEC_pcgw___conv_385028 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_385028)) {
					if (!pgw.equals(__DEC_pcgw___conv_385028)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_107522 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_107522)) {
					if (!pgw.equals(__DEC_pcgw___conv_107522)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_28_2_blackFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf2 = _edge_sourceRef.getSrc();
		if (tmpSf2 instanceof SequenceFlow) {
			SequenceFlow sf2 = (SequenceFlow) tmpSf2;
			EObject tmpPcgw = _edge_sourceRef.getTrg();
			if (tmpPcgw instanceof ParallelGateway) {
				ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
				if (pcgw.equals(sf2.getSourceRef())) {
					boolean pcgwisDiverging = pcgw.isIsDiverging();
					if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
						if (pattern_ParallelGateway2ParallelStepAfterSE_28_2_black_nac_5BB(sf2, pcgw) == null) {
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(sf2, SimpleBPMN.Process.class, "flowElements")) {
								if (process.getFlowElements().contains(pcgw)) {
									for (FlowElement tmpPgw : process.getFlowElements()) {
										if (tmpPgw instanceof ParallelGateway) {
											ParallelGateway pgw = (ParallelGateway) tmpPgw;
											if (!pcgw.equals(pgw)) {
												if (pcgw.equals(pgw.get__conv())) {
													boolean pgwisDiverging = pgw.isIsDiverging();
													if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
														if (pattern_ParallelGateway2ParallelStepAfterSE_28_2_black_nac_0BB(
																pgw, pcgw) == null) {
															if (pattern_ParallelGateway2ParallelStepAfterSE_28_2_black_nac_1BB(
																	pcgw, pgw) == null) {
																if (pattern_ParallelGateway2ParallelStepAfterSE_28_2_black_nac_2BB(
																		pcgw, pgw) == null) {
																	if (pattern_ParallelGateway2ParallelStepAfterSE_28_2_black_nac_3BB(
																			sf2, pgw) == null) {
																		for (FlowElement tmpSf1 : process
																				.getFlowElements()) {
																			if (tmpSf1 instanceof SequenceFlow) {
																				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																				if (!sf1.equals(sf2)) {
																					if (pgw.equals(
																							sf1.getTargetRef())) {
																						FlowNode tmpNode = sf1
																								.getSourceRef();
																						if (tmpNode instanceof StartEvent) {
																							StartEvent node = (StartEvent) tmpNode;
																							if (process
																									.getFlowElements()
																									.contains(node)) {
																								if (pattern_ParallelGateway2ParallelStepAfterSE_28_2_black_nac_4BB(
																										sf1,
																										pcgw) == null) {
																									_result.add(
																											new Object[] {
																													node,
																													process,
																													sf1,
																													pgw,
																													pcgw,
																													sf2,
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_28_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_28_4_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_28_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterSE_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_1_bindingFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepAfterSE _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterSE _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_29_1_binding = pattern_ParallelGateway2ParallelStepAfterSE_29_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterSE_29_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_29_1_black = pattern_ParallelGateway2ParallelStepAfterSE_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterSE_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_328252 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_328252)) {
					if (!pcgw.equals(__DEC_pgw___conv_328252)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_370843 = pcgw.get__conv();
			if (__DEC_pcgw___conv_370843 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_370843)) {
					if (!pgw.equals(__DEC_pcgw___conv_370843)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_126159 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_126159)) {
					if (!pgw.equals(__DEC_pcgw___conv_126159)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_29_2_blackFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPcgw = _edge_outgoing.getSrc();
		if (tmpPcgw instanceof ParallelGateway) {
			ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
			EObject tmpSf2 = _edge_outgoing.getTrg();
			if (tmpSf2 instanceof SequenceFlow) {
				SequenceFlow sf2 = (SequenceFlow) tmpSf2;
				if (pcgw.equals(sf2.getSourceRef())) {
					boolean pcgwisDiverging = pcgw.isIsDiverging();
					if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
						if (pattern_ParallelGateway2ParallelStepAfterSE_29_2_black_nac_5BB(sf2, pcgw) == null) {
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(pcgw, SimpleBPMN.Process.class, "flowElements")) {
								if (process.getFlowElements().contains(sf2)) {
									for (FlowElement tmpPgw : process.getFlowElements()) {
										if (tmpPgw instanceof ParallelGateway) {
											ParallelGateway pgw = (ParallelGateway) tmpPgw;
											if (!pcgw.equals(pgw)) {
												if (pcgw.equals(pgw.get__conv())) {
													boolean pgwisDiverging = pgw.isIsDiverging();
													if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
														if (pattern_ParallelGateway2ParallelStepAfterSE_29_2_black_nac_0BB(
																pgw, pcgw) == null) {
															if (pattern_ParallelGateway2ParallelStepAfterSE_29_2_black_nac_1BB(
																	pcgw, pgw) == null) {
																if (pattern_ParallelGateway2ParallelStepAfterSE_29_2_black_nac_2BB(
																		pcgw, pgw) == null) {
																	if (pattern_ParallelGateway2ParallelStepAfterSE_29_2_black_nac_3BB(
																			sf2, pgw) == null) {
																		for (FlowElement tmpSf1 : process
																				.getFlowElements()) {
																			if (tmpSf1 instanceof SequenceFlow) {
																				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																				if (!sf1.equals(sf2)) {
																					if (pgw.equals(
																							sf1.getTargetRef())) {
																						FlowNode tmpNode = sf1
																								.getSourceRef();
																						if (tmpNode instanceof StartEvent) {
																							StartEvent node = (StartEvent) tmpNode;
																							if (process
																									.getFlowElements()
																									.contains(node)) {
																								if (pattern_ParallelGateway2ParallelStepAfterSE_29_2_black_nac_4BB(
																										sf1,
																										pcgw) == null) {
																									_result.add(
																											new Object[] {
																													node,
																													process,
																													sf1,
																													pgw,
																													pcgw,
																													sf2,
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_29_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_29_4_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_29_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterSE_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_32_1_blackB(
			ParallelGateway2ParallelStepAfterSE _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_32_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_32_2_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("node");
		EObject _localVariable_1 = targetMatch.getObject("flow");
		EObject _localVariable_2 = targetMatch.getObject("step");
		EObject _localVariable_3 = sourceMatch.getObject("process");
		EObject _localVariable_4 = sourceMatch.getObject("sf1");
		EObject _localVariable_5 = sourceMatch.getObject("pgw");
		EObject _localVariable_6 = sourceMatch.getObject("pcgw");
		EObject _localVariable_7 = sourceMatch.getObject("sf2");
		EObject tmpNode = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpPgw = _localVariable_5;
		EObject tmpPcgw = _localVariable_6;
		EObject tmpSf2 = _localVariable_7;
		if (tmpNode instanceof StartEvent) {
			StartEvent node = (StartEvent) tmpNode;
			if (tmpFlow instanceof BasicFlow) {
				BasicFlow flow = (BasicFlow) tmpFlow;
				if (tmpStep instanceof ParallelStep) {
					ParallelStep step = (ParallelStep) tmpStep;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpPgw instanceof ParallelGateway) {
								ParallelGateway pgw = (ParallelGateway) tmpPgw;
								if (tmpPcgw instanceof ParallelGateway) {
									ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
									if (tmpSf2 instanceof SequenceFlow) {
										SequenceFlow sf2 = (SequenceFlow) tmpSf2;
										return new Object[] { node, flow, step, process, sf1, pgw, pcgw, sf2,
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

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_32_2_blackBBBBBBFBBBB(
			StartEvent node, BasicFlow flow, ParallelStep step, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				if (!sourceMatch.equals(targetMatch)) {
					if (flow.getSteps().contains(step)) {
						if (step.equals(flow.get__first())) {
							if (process.getFlowElements().contains(pgw)) {
								if (process.getFlowElements().contains(sf1)) {
									if (process.getFlowElements().contains(node)) {
										if (process.getFlowElements().contains(pcgw)) {
											if (process.getFlowElements().contains(sf2)) {
												if (pgw.equals(sf1.getTargetRef())) {
													if (pcgw.equals(pgw.get__conv())) {
														if (node.equals(sf1.getSourceRef())) {
															if (pcgw.equals(sf2.getSourceRef())) {
																boolean pgwisDiverging = pgw.isIsDiverging();
																if (Boolean.valueOf(pgwisDiverging)
																		.equals(Boolean.valueOf(true))) {
																	boolean pcgwisDiverging = pcgw.isIsDiverging();
																	if (Boolean.valueOf(pcgwisDiverging)
																			.equals(false)) {
																		for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(sf1,
																						SF2F.class, "source")) {
																			if (flow.equals(_sf2f1.getTarget())) {
																				_result.add(new Object[] { node, flow,
																						step, process, sf1, pgw, _sf2f1,
																						pcgw, sf2, sourceMatch,
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
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_32_2_greenBBBBBBBBBBFB(StartEvent node,
			BasicFlow flow, ParallelStep step, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2, Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "ParallelGateway2ParallelStepAfterSE";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(pcgw);
		isApplicableMatch.getAllContextElements().add(sf2);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(_sf2f1);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { node, flow, step, process, sf1, pgw, _sf2f1, pcgw, sf2, sourceMatch, isApplicableMatch,
				targetMatch };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_32_3_bindingFBBBBBBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, IsApplicableMatchCC isApplicableMatch, StartEvent node,
			BasicFlow flow, ParallelStep step, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, node, flow, step, process, sf1, pgw,
				_sf2f1, pcgw, sf2, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, node, flow, step, process, sf1, pgw, _sf2f1, pcgw, sf2,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_32_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_32_3_bindingAndBlackFBBBBBBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, IsApplicableMatchCC isApplicableMatch, StartEvent node,
			BasicFlow flow, ParallelStep step, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_32_3_binding = pattern_ParallelGateway2ParallelStepAfterSE_32_3_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, node, flow, step, process, sf1, pgw, _sf2f1, pcgw, sf2, sourceMatch,
				targetMatch);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_32_3_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterSE_32_3_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_32_3_black = pattern_ParallelGateway2ParallelStepAfterSE_32_3_blackB(
					csp);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_32_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, node, flow, step, process, sf1, pgw, _sf2f1, pcgw,
						sf2, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_32_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_32_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelGateway2ParallelStepAfterSE";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelGateway2ParallelStepAfterSE_32_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_35_1_blackB(
			ParallelGateway2ParallelStepAfterSE _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_35_2_bindingFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("node");
		EObject _localVariable_1 = isApplicableMatch.getObject("flow");
		EObject _localVariable_2 = isApplicableMatch.getObject("step");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_5 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_6 = isApplicableMatch.getObject("_sf2f1");
		EObject _localVariable_7 = isApplicableMatch.getObject("pcgw");
		EObject _localVariable_8 = isApplicableMatch.getObject("sf2");
		EObject tmpNode = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpPgw = _localVariable_5;
		EObject tmp_sf2f1 = _localVariable_6;
		EObject tmpPcgw = _localVariable_7;
		EObject tmpSf2 = _localVariable_8;
		if (tmpNode instanceof StartEvent) {
			StartEvent node = (StartEvent) tmpNode;
			if (tmpFlow instanceof BasicFlow) {
				BasicFlow flow = (BasicFlow) tmpFlow;
				if (tmpStep instanceof ParallelStep) {
					ParallelStep step = (ParallelStep) tmpStep;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpPgw instanceof ParallelGateway) {
								ParallelGateway pgw = (ParallelGateway) tmpPgw;
								if (tmp_sf2f1 instanceof SF2F) {
									SF2F _sf2f1 = (SF2F) tmp_sf2f1;
									if (tmpPcgw instanceof ParallelGateway) {
										ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
										if (tmpSf2 instanceof SequenceFlow) {
											SequenceFlow sf2 = (SequenceFlow) tmpSf2;
											return new Object[] { node, flow, step, process, sf1, pgw, _sf2f1, pcgw,
													sf2, isApplicableMatch };
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_35_2_blackBBBBBBBBBB(StartEvent node,
			BasicFlow flow, ParallelStep step, SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw,
			SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2, IsApplicableMatchCC isApplicableMatch) {
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				if (flow.getSteps().contains(step)) {
					if (step.equals(flow.get__first())) {
						if (process.getFlowElements().contains(pgw)) {
							if (process.getFlowElements().contains(sf1)) {
								if (process.getFlowElements().contains(node)) {
									if (process.getFlowElements().contains(pcgw)) {
										if (process.getFlowElements().contains(sf2)) {
											if (pgw.equals(sf1.getTargetRef())) {
												if (pcgw.equals(pgw.get__conv())) {
													if (sf1.equals(_sf2f1.getSource())) {
														if (flow.equals(_sf2f1.getTarget())) {
															if (node.equals(sf1.getSourceRef())) {
																if (pcgw.equals(sf2.getSourceRef())) {
																	boolean pgwisDiverging = pgw.isIsDiverging();
																	if (Boolean.valueOf(pgwisDiverging)
																			.equals(Boolean.valueOf(true))) {
																		boolean pcgwisDiverging = pcgw.isIsDiverging();
																		if (Boolean.valueOf(pcgwisDiverging)
																				.equals(false)) {
																			return new Object[] { node, flow, step,
																					process, sf1, pgw, _sf2f1, pcgw,
																					sf2, isApplicableMatch };
																		}

																	}

																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_35_2_bindingAndBlackFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_binding = pattern_ParallelGateway2ParallelStepAfterSE_35_2_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_binding != null) {
			StartEvent node = (StartEvent) result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_binding[0];
			BasicFlow flow = (BasicFlow) result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_binding[1];
			ParallelStep step = (ParallelStep) result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_binding[3];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_binding[4];
			ParallelGateway pgw = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_binding[5];
			SF2F _sf2f1 = (SF2F) result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_binding[6];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_binding[7];
			SequenceFlow sf2 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_binding[8];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_black = pattern_ParallelGateway2ParallelStepAfterSE_35_2_blackBBBBBBBBBB(
					node, flow, step, process, sf1, pgw, _sf2f1, pcgw, sf2, isApplicableMatch);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_35_2_black != null) {

				return new Object[] { node, flow, step, process, sf1, pgw, _sf2f1, pcgw, sf2, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_35_2_greenBBBBBFFFF(BasicFlow flow,
			ParallelStep step, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		FN2S _pgw2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		SF2F _sf22f2 = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		FN2S _pcgw2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		result.getCreatedElements().add(_pgw2s);
		_pgw2s.setSource(pgw);
		_pgw2s.setTarget(step);
		result.getCreatedElements().add(_sf22f2);
		_sf22f2.setSource(sf2);
		_sf22f2.setTarget(flow);
		result.getCreatedElements().add(_pcgw2s);
		_pcgw2s.setSource(pcgw);
		_pcgw2s.setTarget(step);
		return new Object[] { flow, step, pgw, pcgw, sf2, result, _pgw2s, _sf22f2, _pcgw2s };
	}

	public static final PerformRuleResult pattern_ParallelGateway2ParallelStepAfterSE_35_3_expressionFB(
			PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_1_blackB(
			ParallelGateway2ParallelStepAfterSE _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, StartEvent node) {
		if (ruleResult.getSourceObjects().contains(node)) {
			return new Object[] { ruleResult, node };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow sf1) {
		if (ruleResult.getSourceObjects().contains(sf1)) {
			return new Object[] { ruleResult, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, SF2F _sf2f1) {
		if (ruleResult.getCorrObjects().contains(_sf2f1)) {
			return new Object[] { ruleResult, _sf2f1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, BasicFlow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterSE_36_2_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList _sf2f1List : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmp_sf2f1 : _sf2f1List.getEntryObjects()) {
				if (tmp_sf2f1 instanceof SF2F) {
					SF2F _sf2f1 = (SF2F) tmp_sf2f1;
					SequenceFlow sf1 = _sf2f1.getSource();
					if (sf1 != null) {
						Flow tmpFlow = _sf2f1.getTarget();
						if (tmpFlow instanceof BasicFlow) {
							BasicFlow flow = (BasicFlow) tmpFlow;
							FlowNode tmpNode = sf1.getSourceRef();
							if (tmpNode instanceof StartEvent) {
								StartEvent node = (StartEvent) tmpNode;
								if (pattern_ParallelGateway2ParallelStepAfterSE_36_2_black_nac_3BB(ruleResult,
										_sf2f1) == null) {
									if (pattern_ParallelGateway2ParallelStepAfterSE_36_2_black_nac_2BB(ruleResult,
											sf1) == null) {
										if (pattern_ParallelGateway2ParallelStepAfterSE_36_2_black_nac_4BB(ruleResult,
												flow) == null) {
											if (pattern_ParallelGateway2ParallelStepAfterSE_36_2_black_nac_0BB(
													ruleResult, node) == null) {
												for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class,
																"flowElements")) {
													if (process.getFlowElements().contains(node)) {
														if (pattern_ParallelGateway2ParallelStepAfterSE_36_2_black_nac_1BB(
																ruleResult, process) == null) {
															_result.add(new Object[] { _sf2f1List, node, process, sf1,
																	_sf2f1, flow, ruleEntryContainer, ruleResult });
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_3_bindingFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, IsApplicableMatch isApplicableMatch, StartEvent node,
			BasicFlow flow, SimpleBPMN.Process process, SequenceFlow sf1, SF2F _sf2f1,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, node, flow, process, sf1, _sf2f1,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, node, flow, process, sf1, _sf2f1, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_3_bindingAndBlackFBBBBBBBB(
			ParallelGateway2ParallelStepAfterSE _this, IsApplicableMatch isApplicableMatch, StartEvent node,
			BasicFlow flow, SimpleBPMN.Process process, SequenceFlow sf1, SF2F _sf2f1,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_36_3_binding = pattern_ParallelGateway2ParallelStepAfterSE_36_3_bindingFBBBBBBBB(
				_this, isApplicableMatch, node, flow, process, sf1, _sf2f1, ruleResult);
		if (result_pattern_ParallelGateway2ParallelStepAfterSE_36_3_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterSE_36_3_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterSE_36_3_black = pattern_ParallelGateway2ParallelStepAfterSE_36_3_blackB(
					csp);
			if (result_pattern_ParallelGateway2ParallelStepAfterSE_36_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, node, flow, process, sf1, _sf2f1, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterSE_36_4_expressionFBB(
			ParallelGateway2ParallelStepAfterSE _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_5_blackBBBBB(StartEvent node,
			BasicFlow flow, SimpleBPMN.Process process, SequenceFlow sf1, SF2F _sf2f1) {
		return new Object[] { node, flow, process, sf1, _sf2f1 };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_6_blackBBBBBB(StartEvent node,
			BasicFlow flow, SimpleBPMN.Process process, SequenceFlow sf1, SF2F _sf2f1,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { node, flow, process, sf1, _sf2f1, ruleResult };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterSE_36_6_greenBFFBBFFFFFBB(BasicFlow flow,
			SimpleBPMN.Process process, SequenceFlow sf1, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ParallelStep step = SimpleUseCaseFactory.eINSTANCE.createParallelStep();
		FN2S _pgw2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		ParallelGateway pgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		ParallelGateway pcgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		SequenceFlow sf2 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		SF2F _sf22f2 = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		FN2S _pcgw2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_1 = csp.getValue("pgw", "id");
		boolean pcgw_isDiverging_prime = false;
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		flow.getSteps().add(step);
		flow.set__first(step);
		ruleResult.getTargetObjects().add(step);
		_pgw2s.setTarget(step);
		ruleResult.getCorrObjects().add(_pgw2s);
		_pgw2s.setSource(pgw);
		process.getFlowElements().add(pgw);
		sf1.setTargetRef(pgw);
		ruleResult.getSourceObjects().add(pgw);
		process.getFlowElements().add(pcgw);
		pgw.set__conv(pcgw);
		ruleResult.getSourceObjects().add(pcgw);
		process.getFlowElements().add(sf2);
		sf2.setSourceRef(pcgw);
		ruleResult.getSourceObjects().add(sf2);
		_sf22f2.setSource(sf2);
		_sf22f2.setTarget(flow);
		ruleResult.getCorrObjects().add(_sf22f2);
		_pcgw2s.setSource(pcgw);
		_pcgw2s.setTarget(step);
		ruleResult.getCorrObjects().add(_pcgw2s);
		String step_id_prime = (String) _localVariable_0;
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		String pgw_id_prime = (String) _localVariable_1;
		pcgw.setIsDiverging(Boolean.valueOf(pcgw_isDiverging_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		step.setId(step_id_prime);
		pgw.setId(pgw_id_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { flow, step, _pgw2s, process, sf1, pgw, pcgw, sf2, _sf22f2, _pcgw2s, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ParallelGateway2ParallelStepAfterSE_36_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelGateway2ParallelStepAfterSEImpl
