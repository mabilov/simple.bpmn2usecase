/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.FN2S;

import Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq;
import Bpmn2UseCase.Rules.RulesPackage;

import Bpmn2UseCase.SF2F;

import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;
import SimpleBPMN.Task;

import SimpleUseCase.Flow;
import SimpleUseCase.NormalStep;
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
 * An implementation of the model object '<em><b>Parallel Gateway2 Parallel Step Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelGateway2ParallelStepSeqImpl extends AbstractRuleImpl implements ParallelGateway2ParallelStepSeq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelGateway2ParallelStepSeqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParallelGateway2ParallelStepSeq();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		// initial bindings
		Object[] result1_black = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_0_1_blackBBBBBBBB(this, match, node, process, sf1, pgw, pcgw,
						sf2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[node] = " + node + ", "
					+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = "
					+ pcgw + ", " + "[sf2] = " + sf2 + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_0_2_bindingAndBlackFBBBBBBBB(this, match, node, process, sf1,
						pgw, pcgw, sf2);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[node] = " + node + ", " + "[process] = " + process
					+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ", " + "[sf2] = "
					+ sf2 + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_0_4_blackBBBBBBB(match, node, process, sf1, pgw, pcgw,
							sf2);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[node] = " + node + ", " + "[process] = "
						+ process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ", "
						+ "[sf2] = " + sf2 + ".");
			}
			ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_0_4_greenBBBBBBFFFFFFFF(match,
					process, sf1, pgw, pcgw, sf2);
					// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result4_green[7];
					// EMoflonEdge process__sf2____flowElements = (EMoflonEdge) result4_green[8];
					// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result4_green[9];
					// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result4_green[10];
					// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result4_green[11];
					// EMoflonEdge sf2__pcgw____sourceRef = (EMoflonEdge) result4_green[12];
					// EMoflonEdge pcgw__sf2____outgoing = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_0_5_blackBBBBBBB(match, node, process, sf1, pgw, pcgw,
							sf2);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[node] = " + node + ", " + "[process] = "
						+ process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ", "
						+ "[sf2] = " + sf2 + ".");
			}
			ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_0_5_greenBBBBFFFF(match, node,
					process, sf1);
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result5_green[4];
					// EMoflonEdge process__node____flowElements = (EMoflonEdge) result5_green[5];
					// EMoflonEdge sf1__node____sourceRef = (EMoflonEdge) result5_green[6];
					// EMoflonEdge node__sf1____outgoing = (EMoflonEdge) result5_green[7];

			// register objects to match
			ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_0_6_expressionBBBBBBBB(this,
					match, node, process, sf1, pgw, pcgw, sf2);
			return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_0_7_expressionF();
		} else {
			return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_1_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2S _t2ns = (FN2S) result1_bindingAndBlack[0];
		Task node = (Task) result1_bindingAndBlack[1];
		NormalStep prevStep = (NormalStep) result1_bindingAndBlack[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[5];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[6];
		SF2F _sf2f1 = (SF2F) result1_bindingAndBlack[7];
		ParallelGateway pcgw = (ParallelGateway) result1_bindingAndBlack[8];
		SequenceFlow sf2 = (SequenceFlow) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_1_1_greenBFFBBBFB(prevStep, flow, pgw, sf2, csp);
		ParallelStep step = (ParallelStep) result1_green[1];
		FN2S _pgw2s = (FN2S) result1_green[2];
		SF2F _sf22f2 = (SF2F) result1_green[6];

		// collect translated elements
		Object[] result2_black = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_1_2_blackBBBBBB(step, _pgw2s, pgw, pcgw, sf2, _sf22f2);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[_pgw2s] = " + _pgw2s + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = "
					+ pcgw + ", " + "[sf2] = " + sf2 + ", " + "[_sf22f2] = " + _sf22f2 + ".");
		}
		Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_1_2_greenFBBBBBB(step, _pgw2s, pgw, pcgw, sf2, _sf22f2);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_1_3_blackBBBBBBBBBBBBBB(ruleresult, _t2ns, node, prevStep,
						step, _pgw2s, process, flow, sf1, pgw, _sf2f1, pcgw, sf2, _sf22f2);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[_t2ns] = " + _t2ns + ", " + "[node] = " + node + ", "
					+ "[prevStep] = " + prevStep + ", " + "[step] = " + step + ", " + "[_pgw2s] = " + _pgw2s + ", "
					+ "[process] = " + process + ", " + "[flow] = " + flow + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = "
					+ pgw + ", " + "[_sf2f1] = " + _sf2f1 + ", " + "[pcgw] = " + pcgw + ", " + "[sf2] = " + sf2 + ", "
					+ "[_sf22f2] = " + _sf22f2 + ".");
		}
		ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, prevStep, step, _pgw2s, process, flow, sf1, pgw, pcgw, sf2, _sf22f2);
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _pgw2s__pgw____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge _pgw2s__step____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__sf2____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[19];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[20];
				// EMoflonEdge sf2__pcgw____sourceRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pcgw__sf2____outgoing = (EMoflonEdge) result3_green[22];
				// EMoflonEdge _sf22f2__sf2____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge _sf22f2__flow____target = (EMoflonEdge) result3_green[24];

		// perform postprocessing story node is empty
		// register objects
		ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_1_5_expressionBBBBBBBBBBBBBBB(this,
				ruleresult, _t2ns, node, prevStep, step, _pgw2s, process, flow, sf1, pgw, _sf2f1, pcgw, sf2, _sf22f2);
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_2_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Task node = (Task) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ParallelGateway pgw = (ParallelGateway) result2_binding[3];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[4];
		SequenceFlow sf2 = (SequenceFlow) result2_binding[5];
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_2_2_blackFBFBFBBFBBB(node, process, sf1, pgw, pcgw, sf2,
						match)) {
			FN2S _t2ns = (FN2S) result2_black[0];
			NormalStep prevStep = (NormalStep) result2_black[2];
			Flow flow = (Flow) result2_black[4];
			SF2F _sf2f1 = (SF2F) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_2_3_blackBBBBBBBBBB(_t2ns, node, prevStep, process, flow,
							sf1, pgw, _sf2f1, pcgw, sf2)) {
				Object[] result3_green = ParallelGateway2ParallelStepSeqImpl
						.pattern_ParallelGateway2ParallelStepSeq_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFFF(_t2ns, node,
								prevStep, process, flow, sf1, pgw, _sf2f1, pcgw, sf2);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge _t2ns__node____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _t2ns__prevStep____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__sf2____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[19];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[20];
				// EMoflonEdge _sf2f1__sf1____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge _sf2f1__flow____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge sf1__node____sourceRef = (EMoflonEdge) result3_green[23];
				// EMoflonEdge node__sf1____outgoing = (EMoflonEdge) result3_green[24];
				// EMoflonEdge sf2__pcgw____sourceRef = (EMoflonEdge) result3_green[25];
				// EMoflonEdge pcgw__sf2____outgoing = (EMoflonEdge) result3_green[26];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
						.pattern_ParallelGateway2ParallelStepSeq_2_4_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, _t2ns, node, prevStep, process, flow, sf1, pgw, _sf2f1, pcgw, sf2);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[_t2ns] = " + _t2ns + ", " + "[node] = " + node + ", " + "[prevStep] = " + prevStep
							+ ", " + "[process] = " + process + ", " + "[flow] = " + flow + ", " + "[sf1] = " + sf1
							+ ", " + "[pgw] = " + pgw + ", " + "[_sf2f1] = " + _sf2f1 + ", " + "[pcgw] = " + pcgw + ", "
							+ "[sf2] = " + sf2 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_2_5_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
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
	public CSP isAppropriate_solveCsp_FWD(Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, FN2S _t2ns, Task node,
			NormalStep prevStep, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, ParallelGateway pgw,
			SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2) {// Create CSP
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
		isApplicableMatch.registerObject("_t2ns", _t2ns);
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject _t2ns, EObject node, EObject prevStep,
			EObject step, EObject _pgw2s, EObject process, EObject flow, EObject sf1, EObject pgw, EObject _sf2f1,
			EObject pcgw, EObject sf2, EObject _sf22f2) {
		ruleresult.registerObject("_t2ns", _t2ns);
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("_pgw2s", _pgw2s);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pgw", pgw);
		ruleresult.registerObject("_sf2f1", _sf2f1);
		ruleresult.registerObject("pcgw", pcgw);
		ruleresult.registerObject("sf2", sf2);
		ruleresult.registerObject("_sf22f2", _sf22f2);

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
	public boolean isAppropriate_BWD(Match match, NormalStep prevStep, ParallelStep step, Flow flow) {
		// initial bindings
		Object[] result1_black = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_10_1_blackBBBBB(this, match, prevStep, step, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevStep] = " + prevStep + ", "
					+ "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_10_2_bindingAndBlackFBBBBB(this, match, prevStep, step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevStep] = " + prevStep + ", " + "[step] = " + step
					+ ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_10_4_blackBBBB(match, prevStep, step, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevStep] = " + prevStep + ", " + "[step] = "
						+ step + ", " + "[flow] = " + flow + ".");
			}
			ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_10_4_greenBBBBFF(match,
					prevStep, step, flow);
					// EMoflonEdge prevStep__step____next = (EMoflonEdge) result4_green[4];
					// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_10_5_blackBBBB(match, prevStep, step, flow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevStep] = " + prevStep + ", " + "[step] = "
						+ step + ", " + "[flow] = " + flow + ".");
			}
			ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_10_5_greenBBB(match, prevStep,
					flow);

			// register objects to match
			ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_10_6_expressionBBBBB(this,
					match, prevStep, step, flow);
			return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_10_7_expressionF();
		} else {
			return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_11_1_bindingAndBlackFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2S _t2ns = (FN2S) result1_bindingAndBlack[0];
		Task node = (Task) result1_bindingAndBlack[1];
		NormalStep prevStep = (NormalStep) result1_bindingAndBlack[2];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[4];
		Flow flow = (Flow) result1_bindingAndBlack[5];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[6];
		SF2F _sf2f1 = (SF2F) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_11_1_greenBFBBBFFFFB(step, process, flow, sf1, csp);
		FN2S _pgw2s = (FN2S) result1_green[1];
		ParallelGateway pgw = (ParallelGateway) result1_green[5];
		ParallelGateway pcgw = (ParallelGateway) result1_green[6];
		SequenceFlow sf2 = (SequenceFlow) result1_green[7];
		SF2F _sf22f2 = (SF2F) result1_green[8];

		// collect translated elements
		Object[] result2_black = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_11_2_blackBBBBBB(step, _pgw2s, pgw, pcgw, sf2, _sf22f2);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[_pgw2s] = " + _pgw2s + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = "
					+ pcgw + ", " + "[sf2] = " + sf2 + ", " + "[_sf22f2] = " + _sf22f2 + ".");
		}
		Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_11_2_greenFBBBBBB(step, _pgw2s, pgw, pcgw, sf2, _sf22f2);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_11_3_blackBBBBBBBBBBBBBB(ruleresult, _t2ns, node, prevStep,
						step, _pgw2s, process, flow, sf1, pgw, _sf2f1, pcgw, sf2, _sf22f2);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[_t2ns] = " + _t2ns + ", " + "[node] = " + node + ", "
					+ "[prevStep] = " + prevStep + ", " + "[step] = " + step + ", " + "[_pgw2s] = " + _pgw2s + ", "
					+ "[process] = " + process + ", " + "[flow] = " + flow + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = "
					+ pgw + ", " + "[_sf2f1] = " + _sf2f1 + ", " + "[pcgw] = " + pcgw + ", " + "[sf2] = " + sf2 + ", "
					+ "[_sf22f2] = " + _sf22f2 + ".");
		}
		ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, prevStep, step, _pgw2s, process, flow, sf1, pgw, pcgw, sf2, _sf22f2);
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _pgw2s__pgw____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge _pgw2s__step____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__sf2____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[19];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[20];
				// EMoflonEdge sf2__pcgw____sourceRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pcgw__sf2____outgoing = (EMoflonEdge) result3_green[22];
				// EMoflonEdge _sf22f2__sf2____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge _sf22f2__flow____target = (EMoflonEdge) result3_green[24];

		// perform postprocessing story node is empty
		// register objects
		ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_11_5_expressionBBBBBBBBBBBBBBB(this,
				ruleresult, _t2ns, node, prevStep, step, _pgw2s, process, flow, sf1, pgw, _sf2f1, pcgw, sf2, _sf22f2);
		return ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		NormalStep prevStep = (NormalStep) result2_binding[0];
		ParallelStep step = (ParallelStep) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_12_2_blackFFBBBFFB(prevStep, step, flow, match)) {
			FN2S _t2ns = (FN2S) result2_black[0];
			Task node = (Task) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[5];
			SF2F _sf2f1 = (SF2F) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_12_3_blackBBBBFBBB(_t2ns, node, prevStep, step, flow, sf1,
							_sf2f1)) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[4];
				Object[] result3_green = ParallelGateway2ParallelStepSeqImpl
						.pattern_ParallelGateway2ParallelStepSeq_12_3_greenBBBBBBBBFFFFFFFFFFF(_t2ns, node, prevStep,
								step, process, flow, sf1, _sf2f1);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge _t2ns__node____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge _t2ns__prevStep____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge _sf2f1__sf1____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge _sf2f1__flow____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf1__node____sourceRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge node__sf1____outgoing = (EMoflonEdge) result3_green[18];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
						.pattern_ParallelGateway2ParallelStepSeq_12_4_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, _t2ns, node, prevStep, step, process, flow, sf1, _sf2f1);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[_t2ns] = " + _t2ns + ", " + "[node] = " + node + ", " + "[prevStep] = " + prevStep
							+ ", " + "[step] = " + step + ", " + "[process] = " + process + ", " + "[flow] = " + flow
							+ ", " + "[sf1] = " + sf1 + ", " + "[_sf2f1] = " + _sf2f1 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_12_5_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, NormalStep prevStep, ParallelStep step, Flow flow) {
		match.registerObject("prevStep", prevStep);
		match.registerObject("step", step);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, NormalStep prevStep, ParallelStep step, Flow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FN2S _t2ns, Task node,
			NormalStep prevStep, ParallelStep step, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			SF2F _sf2f1) {// Create CSP
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
		isApplicableMatch.registerObject("_t2ns", _t2ns);
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject _t2ns, EObject node, EObject prevStep,
			EObject step, EObject _pgw2s, EObject process, EObject flow, EObject sf1, EObject pgw, EObject _sf2f1,
			EObject pcgw, EObject sf2, EObject _sf22f2) {
		ruleresult.registerObject("_t2ns", _t2ns);
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("_pgw2s", _pgw2s);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pgw", pgw);
		ruleresult.registerObject("_sf2f1", _sf2f1);
		ruleresult.registerObject("pcgw", pcgw);
		ruleresult.registerObject("sf2", sf2);
		ruleresult.registerObject("_sf22f2", _sf22f2);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_109(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_20_2_blackFFFB(_edge_next)) {
			NormalStep prevStep = (NormalStep) result2_black[0];
			ParallelStep step = (ParallelStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_20_3_expressionFBBBBB(this,
					match, prevStep, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_20_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_20_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_344(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_21_2_blackFFFFFFB(_edge_flowElements)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_21_3_expressionFBBBBBBBB(
					this, match, node, process, sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_21_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_21_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_345(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_22_2_blackFFFFFFB(_edge_flowElements)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_22_3_expressionFBBBBBBBB(
					this, match, node, process, sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_22_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_22_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_22_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_346(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_23_2_blackFFFFFFB(_edge_flowElements)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_23_3_expressionFBBBBBBBB(
					this, match, node, process, sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_23_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_23_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_23_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_110(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_24_2_blackFFFB(_edge_steps)) {
			NormalStep prevStep = (NormalStep) result2_black[0];
			ParallelStep step = (ParallelStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_24_3_expressionFBBBBB(this,
					match, prevStep, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_24_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_24_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_24_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_347(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_25_2_blackFFFFFFB(_edge_targetRef)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_25_3_expressionFBBBBBBBB(
					this, match, node, process, sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_25_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_25_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_25_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_348(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_26_2_blackFFFFFFB(_edge_incoming)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_26_3_expressionFBBBBBBBB(
					this, match, node, process, sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_26_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_26_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_26_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_349(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_27_2_blackFFFFFFB(_edge___conv)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_27_3_expressionFBBBBBBBB(
					this, match, node, process, sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_27_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_27_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_27_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_350(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_28_2_blackFFFFFFB(_edge_sourceRef)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_28_3_expressionFBBBBBBBB(
					this, match, node, process, sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_28_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_28_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_28_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_351(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_29_2_blackFFFFFFB(_edge_outgoing)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			SequenceFlow sf2 = (SequenceFlow) result2_black[5];
			Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_29_3_expressionFBBBBBBBB(
					this, match, node, process, sf1, pgw, pcgw, sf2)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_29_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_29_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_29_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ParallelGateway2ParallelStepSeq");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchFor_t2ns = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_t2ns")).findAny();
		Bpmn2UseCase.FN2S _t2ns = (Bpmn2UseCase.FN2S) matchFor_t2ns.get().getNode();

		Optional<TripleMatchNodeMapping> matchForNode = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("node")).findAny();
		SimpleBPMN.Task node = (SimpleBPMN.Task) matchForNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		SimpleUseCase.NormalStep prevStep = (SimpleUseCase.NormalStep) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ParallelStep step = (SimpleUseCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_pgw2s = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_pgw2s")).findAny();
		Bpmn2UseCase.FN2S _pgw2s = (Bpmn2UseCase.FN2S) matchFor_pgw2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

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

		eq0.setRuleName("ParallelGateway2ParallelStepSeq");
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
		ruleResult.setRule("ParallelGateway2ParallelStepSeq");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchFor_t2ns = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_t2ns")).findAny();
		Bpmn2UseCase.FN2S _t2ns = (Bpmn2UseCase.FN2S) matchFor_t2ns.get().getNode();

		Optional<TripleMatchNodeMapping> matchForNode = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("node")).findAny();
		SimpleBPMN.Task node = (SimpleBPMN.Task) matchForNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		SimpleUseCase.NormalStep prevStep = (SimpleUseCase.NormalStep) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ParallelStep step = (SimpleUseCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_pgw2s = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_pgw2s")).findAny();
		Bpmn2UseCase.FN2S _pgw2s = (Bpmn2UseCase.FN2S) matchFor_pgw2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

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

		eq0.setRuleName("ParallelGateway2ParallelStepSeq");
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
		Object[] result1_black = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_32_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_32_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_32_2_bindingFFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Task node = (Task) result2_binding[0];
		NormalStep prevStep = (NormalStep) result2_binding[1];
		ParallelStep step = (ParallelStep) result2_binding[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[3];
		Flow flow = (Flow) result2_binding[4];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[5];
		ParallelGateway pgw = (ParallelGateway) result2_binding[6];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[7];
		SequenceFlow sf2 = (SequenceFlow) result2_binding[8];
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_32_2_blackFBBBBBBBFBBBB(node, prevStep, step, process, flow,
						sf1, pgw, pcgw, sf2, sourceMatch, targetMatch)) {
			FN2S _t2ns = (FN2S) result2_black[0];
			SF2F _sf2f1 = (SF2F) result2_black[8];
			Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_32_2_greenBBBBBBBBBBBBFB(_t2ns, node, prevStep, step,
							process, flow, sf1, pgw, _sf2f1, pcgw, sf2, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[12];

			// check csp
			Object[] result3_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_32_3_bindingAndBlackFBBBBBBBBBBBBBBB(this,
							isApplicableMatch, _t2ns, node, prevStep, step, process, flow, sf1, pgw, _sf2f1, pcgw, sf2,
							sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = ParallelGateway2ParallelStepSeqImpl
						.pattern_ParallelGateway2ParallelStepSeq_32_4_blackBB(result, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_32_4_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_32_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, FN2S _t2ns, Task node,
			NormalStep prevStep, ParallelStep step, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			ParallelGateway pgw, SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
		isApplicableMatch.registerObject("_t2ns", _t2ns);
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
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
		Object[] result1_black = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_35_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_35_2_bindingAndBlackFFFFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// FN2S _t2ns = (FN2S) result2_bindingAndBlack[0];
		// Task node = (Task) result2_bindingAndBlack[1];
		// NormalStep prevStep = (NormalStep) result2_bindingAndBlack[2];
		ParallelStep step = (ParallelStep) result2_bindingAndBlack[3];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[4];
		Flow flow = (Flow) result2_bindingAndBlack[5];
		// SequenceFlow sf1 = (SequenceFlow) result2_bindingAndBlack[6];
		ParallelGateway pgw = (ParallelGateway) result2_bindingAndBlack[7];
		// SF2F _sf2f1 = (SF2F) result2_bindingAndBlack[8];
		// ParallelGateway pcgw = (ParallelGateway) result2_bindingAndBlack[9];
		SequenceFlow sf2 = (SequenceFlow) result2_bindingAndBlack[10];
		Object[] result2_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_35_2_greenBBBBFFF(step, flow, pgw, sf2);
		PerformRuleResult result = (PerformRuleResult) result2_green[4];
		// FN2S _pgw2s = (FN2S) result2_green[5];
		// SF2F _sf22f2 = (SF2F) result2_green[6];

		return ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_35_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, FN2S _t2nsParameter) {
		// create result
		Object[] result1_black = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_36_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_36_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_36_2_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList _t2nsList = (RuleEntryList) result2_black[0];
			FN2S _t2ns = (FN2S) result2_black[1];
			Task node = (Task) result2_black[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			SF2F _sf2f1 = (SF2F) result2_black[5];
			Flow flow = (Flow) result2_black[6];
			NormalStep prevStep = (NormalStep) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = ParallelGateway2ParallelStepSeqImpl
					.pattern_ParallelGateway2ParallelStepSeq_36_3_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							_t2ns, node, prevStep, process, flow, sf1, _sf2f1, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[_t2ns] = " + _t2ns
						+ ", " + "[node] = " + node + ", " + "[prevStep] = " + prevStep + ", " + "[process] = "
						+ process + ", " + "[flow] = " + flow + ", " + "[sf1] = " + sf1 + ", " + "[_sf2f1] = " + _sf2f1
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_36_4_expressionFBB(this,
					csp)) {
				// check nacs
				Object[] result5_black = ParallelGateway2ParallelStepSeqImpl
						.pattern_ParallelGateway2ParallelStepSeq_36_5_blackBBBBBBB(_t2ns, node, prevStep, process, flow,
								sf1, _sf2f1);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ParallelGateway2ParallelStepSeqImpl
							.pattern_ParallelGateway2ParallelStepSeq_36_6_blackBBBBBBBB(_t2ns, node, prevStep, process,
									flow, sf1, _sf2f1, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[_t2ns] = " + _t2ns + ", " + "[node] = " + node + ", " + "[prevStep] = " + prevStep
								+ ", " + "[process] = " + process + ", " + "[flow] = " + flow + ", " + "[sf1] = " + sf1
								+ ", " + "[_sf2f1] = " + _sf2f1 + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ParallelGateway2ParallelStepSeqImpl.pattern_ParallelGateway2ParallelStepSeq_36_6_greenBFFBBBFFFFBB(
							prevStep, process, flow, sf1, ruleResult, csp);
					// ParallelStep step = (ParallelStep) result6_green[1];
					// FN2S _pgw2s = (FN2S) result6_green[2];
					// ParallelGateway pgw = (ParallelGateway) result6_green[6];
					// ParallelGateway pcgw = (ParallelGateway) result6_green[7];
					// SequenceFlow sf2 = (SequenceFlow) result6_green[8];
					// SF2F _sf22f2 = (SF2F) result6_green[9];

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepSeqImpl
				.pattern_ParallelGateway2ParallelStepSeq_36_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FN2S _t2ns, Task node,
			NormalStep prevStep, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, SF2F _sf2f1,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("_t2ns", _t2ns);
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
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
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0), (Task) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5),
					(SequenceFlow) arguments.get(6));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Task) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5),
					(SequenceFlow) arguments.get(6));
			return null;
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Task) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5),
					(SequenceFlow) arguments.get(6));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2S_TASK_NORMALSTEP_PROCESS_FLOW_SEQUENCEFLOW_PARALLELGATEWAY_SF2F_PARALLELGATEWAY_SEQUENCEFLOW:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (FN2S) arguments.get(1),
					(Task) arguments.get(2), (NormalStep) arguments.get(3), (SimpleBPMN.Process) arguments.get(4),
					(Flow) arguments.get(5), (SequenceFlow) arguments.get(6), (ParallelGateway) arguments.get(7),
					(SF2F) arguments.get(8), (ParallelGateway) arguments.get(9), (SequenceFlow) arguments.get(10));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_PARALLELSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(ParallelStep) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_PARALLELSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(ParallelStep) arguments.get(2), (Flow) arguments.get(3));
			return null;
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_PARALLELSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(ParallelStep) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_TASK_NORMALSTEP_PARALLELSTEP_PROCESS_FLOW_SEQUENCEFLOW_SF2F:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FN2S) arguments.get(1),
					(Task) arguments.get(2), (NormalStep) arguments.get(3), (ParallelStep) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5), (Flow) arguments.get(6), (SequenceFlow) arguments.get(7),
					(SF2F) arguments.get(8));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_109__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_109((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_344__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_344((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_345__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_345((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_346__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_346((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_110__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_110((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_347__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_347((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_348__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_348((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_349__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_349((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_350__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_350((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_351__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_351((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FN2S_TASK_NORMALSTEP_PARALLELSTEP_PROCESS_FLOW_SEQUENCEFLOW_PARALLELGATEWAY_SF2F_PARALLELGATEWAY_SEQUENCEFLOW_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (FN2S) arguments.get(1),
					(Task) arguments.get(2), (NormalStep) arguments.get(3), (ParallelStep) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5), (Flow) arguments.get(6), (SequenceFlow) arguments.get(7),
					(ParallelGateway) arguments.get(8), (SF2F) arguments.get(9), (ParallelGateway) arguments.get(10),
					(SequenceFlow) arguments.get(11), (Match) arguments.get(12), (Match) arguments.get(13));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S:
			return generateModel((RuleEntryContainer) arguments.get(0), (FN2S) arguments.get(1));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_TASK_NORMALSTEP_PROCESS_FLOW_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FN2S) arguments.get(1),
					(Task) arguments.get(2), (NormalStep) arguments.get(3), (SimpleBPMN.Process) arguments.get(4),
					(Flow) arguments.get(5), (SequenceFlow) arguments.get(6), (SF2F) arguments.get(7),
					(ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_0_1_blackBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				return new Object[] { _this, match, node, process, sf1, pgw, pcgw, sf2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_0_2_bindingFBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, node, process, sf1, pgw, pcgw, sf2 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_0_2_bindingAndBlackFBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_0_2_binding = pattern_ParallelGateway2ParallelStepSeq_0_2_bindingFBBBBBBBB(
				_this, match, node, process, sf1, pgw, pcgw, sf2);
		if (result_pattern_ParallelGateway2ParallelStepSeq_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepSeq_0_2_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_0_2_black = pattern_ParallelGateway2ParallelStepSeq_0_2_blackB(
					csp);
			if (result_pattern_ParallelGateway2ParallelStepSeq_0_2_black != null) {

				return new Object[] { csp, _this, match, node, process, sf1, pgw, pcgw, sf2 };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_0_3_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_0_4_blackBBBBBBB(Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				return new Object[] { match, node, process, sf1, pgw, pcgw, sf2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_0_4_greenBBBBBBFFFFFFFF(Match match,
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_0_5_blackBBBBBBB(Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				return new Object[] { match, node, process, sf1, pgw, pcgw, sf2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_0_5_greenBBBBFFFF(Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1) {
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

	public static final void pattern_ParallelGateway2ParallelStepSeq_0_6_expressionBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		_this.registerObjectsToMatch_FWD(match, node, process, sf1, pgw, pcgw, sf2);

	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_1_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("_t2ns");
		EObject _localVariable_1 = isApplicableMatch.getObject("node");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_6 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_7 = isApplicableMatch.getObject("_sf2f1");
		EObject _localVariable_8 = isApplicableMatch.getObject("pcgw");
		EObject _localVariable_9 = isApplicableMatch.getObject("sf2");
		EObject tmp_t2ns = _localVariable_0;
		EObject tmpNode = _localVariable_1;
		EObject tmpPrevStep = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpSf1 = _localVariable_5;
		EObject tmpPgw = _localVariable_6;
		EObject tmp_sf2f1 = _localVariable_7;
		EObject tmpPcgw = _localVariable_8;
		EObject tmpSf2 = _localVariable_9;
		if (tmp_t2ns instanceof FN2S) {
			FN2S _t2ns = (FN2S) tmp_t2ns;
			if (tmpNode instanceof Task) {
				Task node = (Task) tmpNode;
				if (tmpPrevStep instanceof NormalStep) {
					NormalStep prevStep = (NormalStep) tmpPrevStep;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
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
												return new Object[] { _t2ns, node, prevStep, process, flow, sf1, pgw,
														_sf2f1, pcgw, sf2, isApplicableMatch };
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_1_1_blackBBBBBBBBBBBFB(FN2S _t2ns, Task node,
			NormalStep prevStep, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, ParallelGateway pgw,
			SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2, ParallelGateway2ParallelStepSeq _this,
			IsApplicableMatch isApplicableMatch) {
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { _t2ns, node, prevStep, process, flow, sf1, pgw, _sf2f1, pcgw, sf2, _this,
								csp, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_1_1_bindingAndBlackFFFFFFFFFFBFB(
			ParallelGateway2ParallelStepSeq _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_1_1_binding = pattern_ParallelGateway2ParallelStepSeq_1_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParallelGateway2ParallelStepSeq_1_1_binding != null) {
			FN2S _t2ns = (FN2S) result_pattern_ParallelGateway2ParallelStepSeq_1_1_binding[0];
			Task node = (Task) result_pattern_ParallelGateway2ParallelStepSeq_1_1_binding[1];
			NormalStep prevStep = (NormalStep) result_pattern_ParallelGateway2ParallelStepSeq_1_1_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_ParallelGateway2ParallelStepSeq_1_1_binding[3];
			Flow flow = (Flow) result_pattern_ParallelGateway2ParallelStepSeq_1_1_binding[4];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepSeq_1_1_binding[5];
			ParallelGateway pgw = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepSeq_1_1_binding[6];
			SF2F _sf2f1 = (SF2F) result_pattern_ParallelGateway2ParallelStepSeq_1_1_binding[7];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepSeq_1_1_binding[8];
			SequenceFlow sf2 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepSeq_1_1_binding[9];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_1_1_black = pattern_ParallelGateway2ParallelStepSeq_1_1_blackBBBBBBBBBBBFB(
					_t2ns, node, prevStep, process, flow, sf1, pgw, _sf2f1, pcgw, sf2, _this, isApplicableMatch);
			if (result_pattern_ParallelGateway2ParallelStepSeq_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepSeq_1_1_black[11];

				return new Object[] { _t2ns, node, prevStep, process, flow, sf1, pgw, _sf2f1, pcgw, sf2, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_1_1_greenBFFBBBFB(NormalStep prevStep,
			Flow flow, ParallelGateway pgw, SequenceFlow sf2, CSP csp) {
		ParallelStep step = SimpleUseCaseFactory.eINSTANCE.createParallelStep();
		FN2S _pgw2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		SF2F _sf22f2 = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		Object _localVariable_0 = csp.getValue("step", "id");
		prevStep.setNext(step);
		flow.getSteps().add(step);
		_pgw2s.setSource(pgw);
		_pgw2s.setTarget(step);
		_sf22f2.setSource(sf2);
		_sf22f2.setTarget(flow);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { prevStep, step, _pgw2s, flow, pgw, sf2, _sf22f2, csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_1_2_blackBBBBBB(ParallelStep step, FN2S _pgw2s,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2, SF2F _sf22f2) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { step, _pgw2s, pgw, pcgw, sf2, _sf22f2 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_1_2_greenFBBBBBB(ParallelStep step,
			FN2S _pgw2s, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2, SF2F _sf22f2) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(_pgw2s);
		ruleresult.getTranslatedElements().add(pgw);
		ruleresult.getTranslatedElements().add(pcgw);
		ruleresult.getTranslatedElements().add(sf2);
		ruleresult.getCreatedLinkElements().add(_sf22f2);
		return new Object[] { ruleresult, step, _pgw2s, pgw, pcgw, sf2, _sf22f2 };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_1_3_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject _t2ns, EObject node, EObject prevStep, EObject step, EObject _pgw2s,
			EObject process, EObject flow, EObject sf1, EObject pgw, EObject _sf2f1, EObject pcgw, EObject sf2,
			EObject _sf22f2) {
		if (!_t2ns.equals(node)) {
			if (!_t2ns.equals(prevStep)) {
				if (!_t2ns.equals(step)) {
					if (!_t2ns.equals(process)) {
						if (!_t2ns.equals(flow)) {
							if (!_t2ns.equals(sf1)) {
								if (!_t2ns.equals(pgw)) {
									if (!_t2ns.equals(pcgw)) {
										if (!_t2ns.equals(sf2)) {
											if (!node.equals(prevStep)) {
												if (!node.equals(step)) {
													if (!node.equals(process)) {
														if (!node.equals(sf1)) {
															if (!node.equals(pgw)) {
																if (!node.equals(pcgw)) {
																	if (!node.equals(sf2)) {
																		if (!prevStep.equals(step)) {
																			if (!prevStep.equals(process)) {
																				if (!prevStep.equals(sf1)) {
																					if (!prevStep.equals(sf2)) {
																						if (!_pgw2s.equals(_t2ns)) {
																							if (!_pgw2s.equals(node)) {
																								if (!_pgw2s.equals(
																										prevStep)) {
																									if (!_pgw2s.equals(
																											step)) {
																										if (!_pgw2s
																												.equals(process)) {
																											if (!_pgw2s
																													.equals(flow)) {
																												if (!_pgw2s
																														.equals(sf1)) {
																													if (!_pgw2s
																															.equals(pgw)) {
																														if (!_pgw2s
																																.equals(_sf2f1)) {
																															if (!_pgw2s
																																	.equals(pcgw)) {
																																if (!_pgw2s
																																		.equals(sf2)) {
																																	if (!_pgw2s
																																			.equals(_sf22f2)) {
																																		if (!process
																																				.equals(step)) {
																																			if (!process
																																					.equals(sf1)) {
																																				if (!process
																																						.equals(sf2)) {
																																					if (!flow
																																							.equals(node)) {
																																						if (!flow
																																								.equals(prevStep)) {
																																							if (!flow
																																									.equals(step)) {
																																								if (!flow
																																										.equals(process)) {
																																									if (!flow
																																											.equals(sf1)) {
																																										if (!flow
																																												.equals(pgw)) {
																																											if (!flow
																																													.equals(pcgw)) {
																																												if (!flow
																																														.equals(sf2)) {
																																													if (!sf1.equals(
																																															step)) {
																																														if (!sf1.equals(
																																																sf2)) {
																																															if (!pgw.equals(
																																																	prevStep)) {
																																																if (!pgw.equals(
																																																		step)) {
																																																	if (!pgw.equals(
																																																			process)) {
																																																		if (!pgw.equals(
																																																				sf1)) {
																																																			if (!pgw.equals(
																																																					sf2)) {
																																																				if (!_sf2f1
																																																						.equals(_t2ns)) {
																																																					if (!_sf2f1
																																																							.equals(node)) {
																																																						if (!_sf2f1
																																																								.equals(prevStep)) {
																																																							if (!_sf2f1
																																																									.equals(step)) {
																																																								if (!_sf2f1
																																																										.equals(process)) {
																																																									if (!_sf2f1
																																																											.equals(flow)) {
																																																										if (!_sf2f1
																																																												.equals(sf1)) {
																																																											if (!_sf2f1
																																																													.equals(pgw)) {
																																																												if (!_sf2f1
																																																														.equals(pcgw)) {
																																																													if (!_sf2f1
																																																															.equals(sf2)) {
																																																														if (!pcgw
																																																																.equals(prevStep)) {
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
																																																																							.equals(_t2ns)) {
																																																																						if (!_sf22f2
																																																																								.equals(node)) {
																																																																							if (!_sf22f2
																																																																									.equals(prevStep)) {
																																																																								if (!_sf22f2
																																																																										.equals(step)) {
																																																																									if (!_sf22f2
																																																																											.equals(process)) {
																																																																										if (!_sf22f2
																																																																												.equals(flow)) {
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
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		_t2ns,
																																																																																		node,
																																																																																		prevStep,
																																																																																		step,
																																																																																		_pgw2s,
																																																																																		process,
																																																																																		flow,
																																																																																		sf1,
																																																																																		pgw,
																																																																																		_sf2f1,
																																																																																		pcgw,
																																																																																		sf2,
																																																																																		_sf22f2 };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevStep, EObject step, EObject _pgw2s, EObject process, EObject flow,
			EObject sf1, EObject pgw, EObject pcgw, EObject sf2, EObject _sf22f2) {
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pgw2s__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pgw2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf2____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf2__pcgw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgw__sf2____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf22f2__sf2____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf22f2__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelGateway2ParallelStepSeq";
		String prevStep__step____next_name_prime = "next";
		String _pgw2s__pgw____source_name_prime = "source";
		String _pgw2s__step____target_name_prime = "target";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String process__sf2____flowElements_name_prime = "flowElements";
		String flow__step____steps_name_prime = "steps";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf2__pcgw____sourceRef_name_prime = "sourceRef";
		String pcgw__sf2____outgoing_name_prime = "outgoing";
		String _sf22f2__sf2____source_name_prime = "source";
		String _sf22f2__flow____target_name_prime = "target";
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getCreatedEdges().add(prevStep__step____next);
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
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
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
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		_pgw2s__pgw____source.setName(_pgw2s__pgw____source_name_prime);
		_pgw2s__step____target.setName(_pgw2s__step____target_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		process__sf2____flowElements.setName(process__sf2____flowElements_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf2__pcgw____sourceRef.setName(sf2__pcgw____sourceRef_name_prime);
		pcgw__sf2____outgoing.setName(pcgw__sf2____outgoing_name_prime);
		_sf22f2__sf2____source.setName(_sf22f2__sf2____source_name_prime);
		_sf22f2__flow____target.setName(_sf22f2__flow____target_name_prime);
		return new Object[] { ruleresult, prevStep, step, _pgw2s, process, flow, sf1, pgw, pcgw, sf2, _sf22f2,
				prevStep__step____next, _pgw2s__pgw____source, _pgw2s__step____target, process__pgw____flowElements,
				process__pcgw____flowElements, process__sf2____flowElements, flow__step____steps, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, sf2__pcgw____sourceRef, pcgw__sf2____outgoing,
				_sf22f2__sf2____source, _sf22f2__flow____target };
	}

	public static final void pattern_ParallelGateway2ParallelStepSeq_1_5_expressionBBBBBBBBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, PerformRuleResult ruleresult, EObject _t2ns, EObject node,
			EObject prevStep, EObject step, EObject _pgw2s, EObject process, EObject flow, EObject sf1, EObject pgw,
			EObject _sf2f1, EObject pcgw, EObject sf2, EObject _sf22f2) {
		_this.registerObjects_FWD(ruleresult, _t2ns, node, prevStep, step, _pgw2s, process, flow, sf1, pgw, _sf2f1,
				pcgw, sf2, _sf22f2);

	}

	public static final PerformRuleResult pattern_ParallelGateway2ParallelStepSeq_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_2_1_bindingFB(
			ParallelGateway2ParallelStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_2_1_blackFBB(EClass eClass,
			ParallelGateway2ParallelStepSeq _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_2_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepSeq _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_2_1_binding = pattern_ParallelGateway2ParallelStepSeq_2_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepSeq_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelGateway2ParallelStepSeq_2_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_2_1_black = pattern_ParallelGateway2ParallelStepSeq_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepSeq_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepSeq_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelGateway2ParallelStepSeq";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_2_2_bindingFFFFFFB(Match match) {
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
		if (tmpNode instanceof Task) {
			Task node = (Task) tmpNode;
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

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_2_2_blackFBFBFBBFBBB(Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				boolean pgwisDiverging = pgw.isIsDiverging();
				if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
					boolean pcgwisDiverging = pcgw.isIsDiverging();
					if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
						for (FN2S _t2ns : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(node,
								FN2S.class, "source")) {
							Step tmpPrevStep = _t2ns.getTarget();
							if (tmpPrevStep instanceof NormalStep) {
								NormalStep prevStep = (NormalStep) tmpPrevStep;
								for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, SF2F.class, "source")) {
									Flow flow = _sf2f1.getTarget();
									if (flow != null) {
										_result.add(new Object[] { _t2ns, node, prevStep, process, flow, sf1, pgw,
												_sf2f1, pcgw, sf2, match });
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

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_2_3_blackBBBBBBBBBB(FN2S _t2ns,
			Task node, NormalStep prevStep, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			ParallelGateway pgw, SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				if (node.equals(_t2ns.getSource())) {
					if (prevStep.equals(_t2ns.getTarget())) {
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
																			_result.add(new Object[] { _t2ns, node,
																					prevStep, process, flow, sf1, pgw,
																					_sf2f1, pcgw, sf2 });
																		}

																	}

																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFFF(
			FN2S _t2ns, Task node, NormalStep prevStep, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			ParallelGateway pgw, SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge _t2ns__node____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _t2ns__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String _t2ns__node____source_name_prime = "source";
		String _t2ns__prevStep____target_name_prime = "target";
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
		isApplicableMatch.getAllContextElements().add(_t2ns);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(_sf2f1);
		isApplicableMatch.getAllContextElements().add(pcgw);
		isApplicableMatch.getAllContextElements().add(sf2);
		_t2ns__node____source.setSrc(_t2ns);
		_t2ns__node____source.setTrg(node);
		isApplicableMatch.getAllContextElements().add(_t2ns__node____source);
		_t2ns__prevStep____target.setSrc(_t2ns);
		_t2ns__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(_t2ns__prevStep____target);
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
		_t2ns__node____source.setName(_t2ns__node____source_name_prime);
		_t2ns__prevStep____target.setName(_t2ns__prevStep____target_name_prime);
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
		return new Object[] { _t2ns, node, prevStep, process, flow, sf1, pgw, _sf2f1, pcgw, sf2, isApplicableMatch,
				_t2ns__node____source, _t2ns__prevStep____target, process__pgw____flowElements,
				process__sf1____flowElements, process__node____flowElements, process__pcgw____flowElements,
				process__sf2____flowElements, sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv,
				_sf2f1__sf1____source, _sf2f1__flow____target, sf1__node____sourceRef, node__sf1____outgoing,
				sf2__pcgw____sourceRef, pcgw__sf2____outgoing };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_2_4_bindingFBBBBBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, IsApplicableMatch isApplicableMatch, FN2S _t2ns, Task node,
			NormalStep prevStep, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, ParallelGateway pgw,
			SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, _t2ns, node, prevStep, process, flow,
				sf1, pgw, _sf2f1, pcgw, sf2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, _t2ns, node, prevStep, process, flow, sf1, pgw, _sf2f1,
					pcgw, sf2 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_2_4_bindingAndBlackFBBBBBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, IsApplicableMatch isApplicableMatch, FN2S _t2ns, Task node,
			NormalStep prevStep, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, ParallelGateway pgw,
			SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_2_4_binding = pattern_ParallelGateway2ParallelStepSeq_2_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, _t2ns, node, prevStep, process, flow, sf1, pgw, _sf2f1, pcgw, sf2);
		if (result_pattern_ParallelGateway2ParallelStepSeq_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepSeq_2_4_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_2_4_black = pattern_ParallelGateway2ParallelStepSeq_2_4_blackB(
					csp);
			if (result_pattern_ParallelGateway2ParallelStepSeq_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, _t2ns, node, prevStep, process, flow, sf1, pgw,
						_sf2f1, pcgw, sf2 };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_2_5_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelGateway2ParallelStepSeq";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelGateway2ParallelStepSeq_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_10_1_blackBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, NormalStep prevStep, ParallelStep step, Flow flow) {
		return new Object[] { _this, match, prevStep, step, flow };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_10_2_bindingFBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, NormalStep prevStep, ParallelStep step, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, prevStep, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_10_2_bindingAndBlackFBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, NormalStep prevStep, ParallelStep step, Flow flow) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_10_2_binding = pattern_ParallelGateway2ParallelStepSeq_10_2_bindingFBBBBB(
				_this, match, prevStep, step, flow);
		if (result_pattern_ParallelGateway2ParallelStepSeq_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepSeq_10_2_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_10_2_black = pattern_ParallelGateway2ParallelStepSeq_10_2_blackB(
					csp);
			if (result_pattern_ParallelGateway2ParallelStepSeq_10_2_black != null) {

				return new Object[] { csp, _this, match, prevStep, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_10_3_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_10_4_blackBBBB(Match match,
			NormalStep prevStep, ParallelStep step, Flow flow) {
		return new Object[] { match, prevStep, step, flow };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_10_4_greenBBBBFF(Match match,
			NormalStep prevStep, ParallelStep step, Flow flow) {
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_10_5_blackBBBB(Match match,
			NormalStep prevStep, ParallelStep step, Flow flow) {
		return new Object[] { match, prevStep, step, flow };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_10_5_greenBBB(Match match, NormalStep prevStep,
			Flow flow) {
		match.getContextNodes().add(prevStep);
		match.getContextNodes().add(flow);
		return new Object[] { match, prevStep, flow };
	}

	public static final void pattern_ParallelGateway2ParallelStepSeq_10_6_expressionBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, NormalStep prevStep, ParallelStep step, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, prevStep, step, flow);

	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_11_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("_t2ns");
		EObject _localVariable_1 = isApplicableMatch.getObject("node");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("step");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_7 = isApplicableMatch.getObject("_sf2f1");
		EObject tmp_t2ns = _localVariable_0;
		EObject tmpNode = _localVariable_1;
		EObject tmpPrevStep = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmp_sf2f1 = _localVariable_7;
		if (tmp_t2ns instanceof FN2S) {
			FN2S _t2ns = (FN2S) tmp_t2ns;
			if (tmpNode instanceof Task) {
				Task node = (Task) tmpNode;
				if (tmpPrevStep instanceof NormalStep) {
					NormalStep prevStep = (NormalStep) tmpPrevStep;
					if (tmpStep instanceof ParallelStep) {
						ParallelStep step = (ParallelStep) tmpStep;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								if (tmpSf1 instanceof SequenceFlow) {
									SequenceFlow sf1 = (SequenceFlow) tmpSf1;
									if (tmp_sf2f1 instanceof SF2F) {
										SF2F _sf2f1 = (SF2F) tmp_sf2f1;
										return new Object[] { _t2ns, node, prevStep, step, process, flow, sf1, _sf2f1,
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_11_1_blackBBBBBBBBBFB(FN2S _t2ns, Task node,
			NormalStep prevStep, ParallelStep step, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			SF2F _sf2f1, ParallelGateway2ParallelStepSeq _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { _t2ns, node, prevStep, step, process, flow, sf1, _sf2f1, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_11_1_bindingAndBlackFFFFFFFFBFB(
			ParallelGateway2ParallelStepSeq _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_11_1_binding = pattern_ParallelGateway2ParallelStepSeq_11_1_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParallelGateway2ParallelStepSeq_11_1_binding != null) {
			FN2S _t2ns = (FN2S) result_pattern_ParallelGateway2ParallelStepSeq_11_1_binding[0];
			Task node = (Task) result_pattern_ParallelGateway2ParallelStepSeq_11_1_binding[1];
			NormalStep prevStep = (NormalStep) result_pattern_ParallelGateway2ParallelStepSeq_11_1_binding[2];
			ParallelStep step = (ParallelStep) result_pattern_ParallelGateway2ParallelStepSeq_11_1_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_ParallelGateway2ParallelStepSeq_11_1_binding[4];
			Flow flow = (Flow) result_pattern_ParallelGateway2ParallelStepSeq_11_1_binding[5];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepSeq_11_1_binding[6];
			SF2F _sf2f1 = (SF2F) result_pattern_ParallelGateway2ParallelStepSeq_11_1_binding[7];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_11_1_black = pattern_ParallelGateway2ParallelStepSeq_11_1_blackBBBBBBBBBFB(
					_t2ns, node, prevStep, step, process, flow, sf1, _sf2f1, _this, isApplicableMatch);
			if (result_pattern_ParallelGateway2ParallelStepSeq_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepSeq_11_1_black[9];

				return new Object[] { _t2ns, node, prevStep, step, process, flow, sf1, _sf2f1, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_11_1_greenBFBBBFFFFB(ParallelStep step,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, CSP csp) {
		FN2S _pgw2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		ParallelGateway pgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		ParallelGateway pcgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		SequenceFlow sf2 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		SF2F _sf22f2 = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
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
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		String pgw_id_prime = (String) _localVariable_0;
		pcgw.setIsDiverging(Boolean.valueOf(pcgw_isDiverging_prime));
		pgw.setId(pgw_id_prime);
		return new Object[] { step, _pgw2s, process, flow, sf1, pgw, pcgw, sf2, _sf22f2, csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_11_2_blackBBBBBB(ParallelStep step,
			FN2S _pgw2s, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2, SF2F _sf22f2) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { step, _pgw2s, pgw, pcgw, sf2, _sf22f2 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_11_2_greenFBBBBBB(ParallelStep step,
			FN2S _pgw2s, ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2, SF2F _sf22f2) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(_pgw2s);
		ruleresult.getCreatedElements().add(pgw);
		ruleresult.getCreatedElements().add(pcgw);
		ruleresult.getCreatedElements().add(sf2);
		ruleresult.getCreatedLinkElements().add(_sf22f2);
		return new Object[] { ruleresult, step, _pgw2s, pgw, pcgw, sf2, _sf22f2 };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_11_3_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject _t2ns, EObject node, EObject prevStep, EObject step, EObject _pgw2s,
			EObject process, EObject flow, EObject sf1, EObject pgw, EObject _sf2f1, EObject pcgw, EObject sf2,
			EObject _sf22f2) {
		if (!_t2ns.equals(node)) {
			if (!_t2ns.equals(prevStep)) {
				if (!_t2ns.equals(step)) {
					if (!_t2ns.equals(process)) {
						if (!_t2ns.equals(flow)) {
							if (!_t2ns.equals(sf1)) {
								if (!_t2ns.equals(pgw)) {
									if (!_t2ns.equals(pcgw)) {
										if (!_t2ns.equals(sf2)) {
											if (!node.equals(prevStep)) {
												if (!node.equals(step)) {
													if (!node.equals(process)) {
														if (!node.equals(sf1)) {
															if (!node.equals(pgw)) {
																if (!node.equals(pcgw)) {
																	if (!node.equals(sf2)) {
																		if (!prevStep.equals(step)) {
																			if (!prevStep.equals(process)) {
																				if (!prevStep.equals(sf1)) {
																					if (!prevStep.equals(sf2)) {
																						if (!_pgw2s.equals(_t2ns)) {
																							if (!_pgw2s.equals(node)) {
																								if (!_pgw2s.equals(
																										prevStep)) {
																									if (!_pgw2s.equals(
																											step)) {
																										if (!_pgw2s
																												.equals(process)) {
																											if (!_pgw2s
																													.equals(flow)) {
																												if (!_pgw2s
																														.equals(sf1)) {
																													if (!_pgw2s
																															.equals(pgw)) {
																														if (!_pgw2s
																																.equals(_sf2f1)) {
																															if (!_pgw2s
																																	.equals(pcgw)) {
																																if (!_pgw2s
																																		.equals(sf2)) {
																																	if (!_pgw2s
																																			.equals(_sf22f2)) {
																																		if (!process
																																				.equals(step)) {
																																			if (!process
																																					.equals(sf1)) {
																																				if (!process
																																						.equals(sf2)) {
																																					if (!flow
																																							.equals(node)) {
																																						if (!flow
																																								.equals(prevStep)) {
																																							if (!flow
																																									.equals(step)) {
																																								if (!flow
																																										.equals(process)) {
																																									if (!flow
																																											.equals(sf1)) {
																																										if (!flow
																																												.equals(pgw)) {
																																											if (!flow
																																													.equals(pcgw)) {
																																												if (!flow
																																														.equals(sf2)) {
																																													if (!sf1.equals(
																																															step)) {
																																														if (!sf1.equals(
																																																sf2)) {
																																															if (!pgw.equals(
																																																	prevStep)) {
																																																if (!pgw.equals(
																																																		step)) {
																																																	if (!pgw.equals(
																																																			process)) {
																																																		if (!pgw.equals(
																																																				sf1)) {
																																																			if (!pgw.equals(
																																																					sf2)) {
																																																				if (!_sf2f1
																																																						.equals(_t2ns)) {
																																																					if (!_sf2f1
																																																							.equals(node)) {
																																																						if (!_sf2f1
																																																								.equals(prevStep)) {
																																																							if (!_sf2f1
																																																									.equals(step)) {
																																																								if (!_sf2f1
																																																										.equals(process)) {
																																																									if (!_sf2f1
																																																											.equals(flow)) {
																																																										if (!_sf2f1
																																																												.equals(sf1)) {
																																																											if (!_sf2f1
																																																													.equals(pgw)) {
																																																												if (!_sf2f1
																																																														.equals(pcgw)) {
																																																													if (!_sf2f1
																																																															.equals(sf2)) {
																																																														if (!pcgw
																																																																.equals(prevStep)) {
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
																																																																							.equals(_t2ns)) {
																																																																						if (!_sf22f2
																																																																								.equals(node)) {
																																																																							if (!_sf22f2
																																																																									.equals(prevStep)) {
																																																																								if (!_sf22f2
																																																																										.equals(step)) {
																																																																									if (!_sf22f2
																																																																											.equals(process)) {
																																																																										if (!_sf22f2
																																																																												.equals(flow)) {
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
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		_t2ns,
																																																																																		node,
																																																																																		prevStep,
																																																																																		step,
																																																																																		_pgw2s,
																																																																																		process,
																																																																																		flow,
																																																																																		sf1,
																																																																																		pgw,
																																																																																		_sf2f1,
																																																																																		pcgw,
																																																																																		sf2,
																																																																																		_sf22f2 };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevStep, EObject step, EObject _pgw2s, EObject process, EObject flow,
			EObject sf1, EObject pgw, EObject pcgw, EObject sf2, EObject _sf22f2) {
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pgw2s__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pgw2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf2____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf2__pcgw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgw__sf2____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf22f2__sf2____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf22f2__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelGateway2ParallelStepSeq";
		String prevStep__step____next_name_prime = "next";
		String _pgw2s__pgw____source_name_prime = "source";
		String _pgw2s__step____target_name_prime = "target";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String process__sf2____flowElements_name_prime = "flowElements";
		String flow__step____steps_name_prime = "steps";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf2__pcgw____sourceRef_name_prime = "sourceRef";
		String pcgw__sf2____outgoing_name_prime = "outgoing";
		String _sf22f2__sf2____source_name_prime = "source";
		String _sf22f2__flow____target_name_prime = "target";
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getTranslatedEdges().add(prevStep__step____next);
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
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
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
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		_pgw2s__pgw____source.setName(_pgw2s__pgw____source_name_prime);
		_pgw2s__step____target.setName(_pgw2s__step____target_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		process__sf2____flowElements.setName(process__sf2____flowElements_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf2__pcgw____sourceRef.setName(sf2__pcgw____sourceRef_name_prime);
		pcgw__sf2____outgoing.setName(pcgw__sf2____outgoing_name_prime);
		_sf22f2__sf2____source.setName(_sf22f2__sf2____source_name_prime);
		_sf22f2__flow____target.setName(_sf22f2__flow____target_name_prime);
		return new Object[] { ruleresult, prevStep, step, _pgw2s, process, flow, sf1, pgw, pcgw, sf2, _sf22f2,
				prevStep__step____next, _pgw2s__pgw____source, _pgw2s__step____target, process__pgw____flowElements,
				process__pcgw____flowElements, process__sf2____flowElements, flow__step____steps, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, sf2__pcgw____sourceRef, pcgw__sf2____outgoing,
				_sf22f2__sf2____source, _sf22f2__flow____target };
	}

	public static final void pattern_ParallelGateway2ParallelStepSeq_11_5_expressionBBBBBBBBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, PerformRuleResult ruleresult, EObject _t2ns, EObject node,
			EObject prevStep, EObject step, EObject _pgw2s, EObject process, EObject flow, EObject sf1, EObject pgw,
			EObject _sf2f1, EObject pcgw, EObject sf2, EObject _sf22f2) {
		_this.registerObjects_BWD(ruleresult, _t2ns, node, prevStep, step, _pgw2s, process, flow, sf1, pgw, _sf2f1,
				pcgw, sf2, _sf22f2);

	}

	public static final PerformRuleResult pattern_ParallelGateway2ParallelStepSeq_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_12_1_bindingFB(
			ParallelGateway2ParallelStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_12_1_blackFBB(EClass eClass,
			ParallelGateway2ParallelStepSeq _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_12_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepSeq _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_12_1_binding = pattern_ParallelGateway2ParallelStepSeq_12_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepSeq_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelGateway2ParallelStepSeq_12_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_12_1_black = pattern_ParallelGateway2ParallelStepSeq_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepSeq_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepSeq_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelGateway2ParallelStepSeq";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevStep");
		EObject _localVariable_1 = match.getObject("step");
		EObject _localVariable_2 = match.getObject("flow");
		EObject tmpPrevStep = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		if (tmpPrevStep instanceof NormalStep) {
			NormalStep prevStep = (NormalStep) tmpPrevStep;
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					return new Object[] { prevStep, step, flow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_12_2_blackFFBBBFFB(
			NormalStep prevStep, ParallelStep step, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (FN2S _t2ns : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevStep, FN2S.class,
				"target")) {
			FlowNode tmpNode = _t2ns.getSource();
			if (tmpNode instanceof Task) {
				Task node = (Task) tmpNode;
				for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow, SF2F.class,
						"target")) {
					SequenceFlow sf1 = _sf2f1.getSource();
					if (sf1 != null) {
						_result.add(new Object[] { _t2ns, node, prevStep, step, flow, sf1, _sf2f1, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_12_3_blackBBBBFBBB(FN2S _t2ns,
			Task node, NormalStep prevStep, ParallelStep step, Flow flow, SequenceFlow sf1, SF2F _sf2f1) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (node.equals(_t2ns.getSource())) {
			if (prevStep.equals(_t2ns.getTarget())) {
				if (step.equals(prevStep.getNext())) {
					if (flow.getSteps().contains(step)) {
						if (sf1.equals(_sf2f1.getSource())) {
							if (flow.equals(_sf2f1.getTarget())) {
								if (node.equals(sf1.getSourceRef())) {
									for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
										if (process.getFlowElements().contains(node)) {
											_result.add(new Object[] { _t2ns, node, prevStep, step, process, flow, sf1,
													_sf2f1 });
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_12_3_greenBBBBBBBBFFFFFFFFFFF(FN2S _t2ns,
			Task node, NormalStep prevStep, ParallelStep step, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			SF2F _sf2f1) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge _t2ns__node____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _t2ns__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2f1__sf1____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2f1__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String _t2ns__node____source_name_prime = "source";
		String _t2ns__prevStep____target_name_prime = "target";
		String prevStep__step____next_name_prime = "next";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String flow__step____steps_name_prime = "steps";
		String _sf2f1__sf1____source_name_prime = "source";
		String _sf2f1__flow____target_name_prime = "target";
		String sf1__node____sourceRef_name_prime = "sourceRef";
		String node__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(_t2ns);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(_sf2f1);
		_t2ns__node____source.setSrc(_t2ns);
		_t2ns__node____source.setTrg(node);
		isApplicableMatch.getAllContextElements().add(_t2ns__node____source);
		_t2ns__prevStep____target.setSrc(_t2ns);
		_t2ns__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(_t2ns__prevStep____target);
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		isApplicableMatch.getAllContextElements().add(prevStep__step____next);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(process__sf1____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		isApplicableMatch.getAllContextElements().add(process__node____flowElements);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
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
		_t2ns__node____source.setName(_t2ns__node____source_name_prime);
		_t2ns__prevStep____target.setName(_t2ns__prevStep____target_name_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__node____flowElements.setName(process__node____flowElements_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		_sf2f1__sf1____source.setName(_sf2f1__sf1____source_name_prime);
		_sf2f1__flow____target.setName(_sf2f1__flow____target_name_prime);
		sf1__node____sourceRef.setName(sf1__node____sourceRef_name_prime);
		node__sf1____outgoing.setName(node__sf1____outgoing_name_prime);
		return new Object[] { _t2ns, node, prevStep, step, process, flow, sf1, _sf2f1, isApplicableMatch,
				_t2ns__node____source, _t2ns__prevStep____target, prevStep__step____next, process__sf1____flowElements,
				process__node____flowElements, flow__step____steps, _sf2f1__sf1____source, _sf2f1__flow____target,
				sf1__node____sourceRef, node__sf1____outgoing };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_12_4_bindingFBBBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, IsApplicableMatch isApplicableMatch, FN2S _t2ns, Task node,
			NormalStep prevStep, ParallelStep step, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			SF2F _sf2f1) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, _t2ns, node, prevStep, step, process,
				flow, sf1, _sf2f1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, _t2ns, node, prevStep, step, process, flow, sf1,
					_sf2f1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_12_4_bindingAndBlackFBBBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, IsApplicableMatch isApplicableMatch, FN2S _t2ns, Task node,
			NormalStep prevStep, ParallelStep step, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			SF2F _sf2f1) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_12_4_binding = pattern_ParallelGateway2ParallelStepSeq_12_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, _t2ns, node, prevStep, step, process, flow, sf1, _sf2f1);
		if (result_pattern_ParallelGateway2ParallelStepSeq_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepSeq_12_4_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_12_4_black = pattern_ParallelGateway2ParallelStepSeq_12_4_blackB(
					csp);
			if (result_pattern_ParallelGateway2ParallelStepSeq_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, _t2ns, node, prevStep, step, process, flow, sf1,
						_sf2f1 };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_12_5_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelGateway2ParallelStepSeq";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelGateway2ParallelStepSeq_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_20_1_bindingFB(
			ParallelGateway2ParallelStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_20_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_20_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepSeq _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_20_1_binding = pattern_ParallelGateway2ParallelStepSeq_20_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepSeq_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepSeq_20_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_20_1_black = pattern_ParallelGateway2ParallelStepSeq_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepSeq_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepSeq_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_20_2_black_nac_0BB(Flow flow,
			ParallelStep step) {
		if (step.equals(flow.get__first())) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_20_2_blackFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevStep = _edge_next.getSrc();
		if (tmpPrevStep instanceof NormalStep) {
			NormalStep prevStep = (NormalStep) tmpPrevStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (step.equals(prevStep.getNext())) {
					for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
							Flow.class, "steps")) {
						if (pattern_ParallelGateway2ParallelStepSeq_20_2_black_nac_0BB(flow, step) == null) {
							_result.add(new Object[] { prevStep, step, flow, _edge_next });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_20_3_expressionFBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, NormalStep prevStep, ParallelStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_20_4_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepSeq_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_1_bindingFB(
			ParallelGateway2ParallelStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepSeq _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_21_1_binding = pattern_ParallelGateway2ParallelStepSeq_21_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepSeq_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepSeq_21_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_21_1_black = pattern_ParallelGateway2ParallelStepSeq_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepSeq_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepSeq_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_62693 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_62693)) {
					if (!pcgw.equals(__DEC_pgw___conv_62693)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_181752 = pcgw.get__conv();
			if (__DEC_pcgw___conv_181752 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_181752)) {
					if (!pgw.equals(__DEC_pcgw___conv_181752)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_186862 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_186862)) {
					if (!pgw.equals(__DEC_pcgw___conv_186862)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_21_2_blackFFFFFFB(
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
										if (pattern_ParallelGateway2ParallelStepSeq_21_2_black_nac_0BB(pgw,
												pcgw) == null) {
											if (pattern_ParallelGateway2ParallelStepSeq_21_2_black_nac_1BB(pcgw,
													pgw) == null) {
												if (pattern_ParallelGateway2ParallelStepSeq_21_2_black_nac_2BB(pcgw,
														pgw) == null) {
													for (FlowElement tmpSf1 : process.getFlowElements()) {
														if (tmpSf1 instanceof SequenceFlow) {
															SequenceFlow sf1 = (SequenceFlow) tmpSf1;
															if (pgw.equals(sf1.getTargetRef())) {
																FlowNode tmpNode = sf1.getSourceRef();
																if (tmpNode instanceof Task) {
																	Task node = (Task) tmpNode;
																	if (process.getFlowElements().contains(node)) {
																		if (pattern_ParallelGateway2ParallelStepSeq_21_2_black_nac_4BB(
																				sf1, pcgw) == null) {
																			for (FlowElement tmpSf2 : process
																					.getFlowElements()) {
																				if (tmpSf2 instanceof SequenceFlow) {
																					SequenceFlow sf2 = (SequenceFlow) tmpSf2;
																					if (!sf1.equals(sf2)) {
																						if (pcgw.equals(
																								sf2.getSourceRef())) {
																							if (pattern_ParallelGateway2ParallelStepSeq_21_2_black_nac_3BB(
																									sf2, pgw) == null) {
																								if (pattern_ParallelGateway2ParallelStepSeq_21_2_black_nac_5BB(
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_21_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_21_4_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepSeq_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_1_bindingFB(
			ParallelGateway2ParallelStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepSeq _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_22_1_binding = pattern_ParallelGateway2ParallelStepSeq_22_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepSeq_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepSeq_22_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_22_1_black = pattern_ParallelGateway2ParallelStepSeq_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepSeq_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepSeq_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_595833 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_595833)) {
					if (!pcgw.equals(__DEC_pgw___conv_595833)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_671536 = pcgw.get__conv();
			if (__DEC_pcgw___conv_671536 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_671536)) {
					if (!pgw.equals(__DEC_pcgw___conv_671536)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_899507 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_899507)) {
					if (!pgw.equals(__DEC_pcgw___conv_899507)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_22_2_blackFFFFFFB(
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
											if (pattern_ParallelGateway2ParallelStepSeq_22_2_black_nac_0BB(pgw,
													pcgw) == null) {
												if (pattern_ParallelGateway2ParallelStepSeq_22_2_black_nac_1BB(pcgw,
														pgw) == null) {
													if (pattern_ParallelGateway2ParallelStepSeq_22_2_black_nac_2BB(pcgw,
															pgw) == null) {
														for (FlowElement tmpSf1 : process.getFlowElements()) {
															if (tmpSf1 instanceof SequenceFlow) {
																SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																if (pgw.equals(sf1.getTargetRef())) {
																	FlowNode tmpNode = sf1.getSourceRef();
																	if (tmpNode instanceof Task) {
																		Task node = (Task) tmpNode;
																		if (process.getFlowElements().contains(node)) {
																			if (pattern_ParallelGateway2ParallelStepSeq_22_2_black_nac_4BB(
																					sf1, pcgw) == null) {
																				for (FlowElement tmpSf2 : process
																						.getFlowElements()) {
																					if (tmpSf2 instanceof SequenceFlow) {
																						SequenceFlow sf2 = (SequenceFlow) tmpSf2;
																						if (!sf1.equals(sf2)) {
																							if (pcgw.equals(sf2
																									.getSourceRef())) {
																								if (pattern_ParallelGateway2ParallelStepSeq_22_2_black_nac_3BB(
																										sf2,
																										pgw) == null) {
																									if (pattern_ParallelGateway2ParallelStepSeq_22_2_black_nac_5BB(
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_22_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_22_4_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepSeq_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_1_bindingFB(
			ParallelGateway2ParallelStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepSeq _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_23_1_binding = pattern_ParallelGateway2ParallelStepSeq_23_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepSeq_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepSeq_23_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_23_1_black = pattern_ParallelGateway2ParallelStepSeq_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepSeq_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepSeq_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_85820 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_85820)) {
					if (!pcgw.equals(__DEC_pgw___conv_85820)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_147717 = pcgw.get__conv();
			if (__DEC_pcgw___conv_147717 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_147717)) {
					if (!pgw.equals(__DEC_pcgw___conv_147717)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_871794 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_871794)) {
					if (!pgw.equals(__DEC_pcgw___conv_871794)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_23_2_blackFFFFFFB(
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
								if (pattern_ParallelGateway2ParallelStepSeq_23_2_black_nac_5BB(sf2, pcgw) == null) {
									for (FlowElement tmpPgw : process.getFlowElements()) {
										if (tmpPgw instanceof ParallelGateway) {
											ParallelGateway pgw = (ParallelGateway) tmpPgw;
											if (!pcgw.equals(pgw)) {
												if (pcgw.equals(pgw.get__conv())) {
													boolean pgwisDiverging = pgw.isIsDiverging();
													if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
														if (pattern_ParallelGateway2ParallelStepSeq_23_2_black_nac_0BB(
																pgw, pcgw) == null) {
															if (pattern_ParallelGateway2ParallelStepSeq_23_2_black_nac_1BB(
																	pcgw, pgw) == null) {
																if (pattern_ParallelGateway2ParallelStepSeq_23_2_black_nac_2BB(
																		pcgw, pgw) == null) {
																	if (pattern_ParallelGateway2ParallelStepSeq_23_2_black_nac_3BB(
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
																						if (tmpNode instanceof Task) {
																							Task node = (Task) tmpNode;
																							if (process
																									.getFlowElements()
																									.contains(node)) {
																								if (pattern_ParallelGateway2ParallelStepSeq_23_2_black_nac_4BB(
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_23_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_23_4_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_23_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepSeq_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_24_1_bindingFB(
			ParallelGateway2ParallelStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_24_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_24_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepSeq _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_24_1_binding = pattern_ParallelGateway2ParallelStepSeq_24_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepSeq_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepSeq_24_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_24_1_black = pattern_ParallelGateway2ParallelStepSeq_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepSeq_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepSeq_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_24_2_black_nac_0BB(Flow flow,
			ParallelStep step) {
		if (step.equals(flow.get__first())) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_24_2_blackFFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_ParallelGateway2ParallelStepSeq_24_2_black_nac_0BB(flow, step) == null) {
						for (Step tmpPrevStep : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
								Step.class, "next")) {
							if (tmpPrevStep instanceof NormalStep) {
								NormalStep prevStep = (NormalStep) tmpPrevStep;
								_result.add(new Object[] { prevStep, step, flow, _edge_steps });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_24_3_expressionFBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, NormalStep prevStep, ParallelStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_24_4_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_24_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_24_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepSeq_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_1_bindingFB(
			ParallelGateway2ParallelStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepSeq _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_25_1_binding = pattern_ParallelGateway2ParallelStepSeq_25_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepSeq_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepSeq_25_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_25_1_black = pattern_ParallelGateway2ParallelStepSeq_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepSeq_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepSeq_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_557733 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_557733)) {
					if (!pcgw.equals(__DEC_pgw___conv_557733)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_466346 = pcgw.get__conv();
			if (__DEC_pcgw___conv_466346 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_466346)) {
					if (!pgw.equals(__DEC_pcgw___conv_466346)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_810969 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_810969)) {
					if (!pgw.equals(__DEC_pcgw___conv_810969)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_25_2_blackFFFFFFB(
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
					if (tmpNode instanceof Task) {
						Task node = (Task) tmpNode;
						ParallelGateway pcgw = pgw.get__conv();
						if (pcgw != null) {
							if (!pcgw.equals(pgw)) {
								boolean pgwisDiverging = pgw.isIsDiverging();
								if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
									boolean pcgwisDiverging = pcgw.isIsDiverging();
									if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
										if (pattern_ParallelGateway2ParallelStepSeq_25_2_black_nac_0BB(pgw,
												pcgw) == null) {
											if (pattern_ParallelGateway2ParallelStepSeq_25_2_black_nac_1BB(pcgw,
													pgw) == null) {
												if (pattern_ParallelGateway2ParallelStepSeq_25_2_black_nac_2BB(pcgw,
														pgw) == null) {
													if (pattern_ParallelGateway2ParallelStepSeq_25_2_black_nac_4BB(sf1,
															pcgw) == null) {
														for (SequenceFlow sf2 : pcgw.getOutgoing()) {
															if (!sf1.equals(sf2)) {
																if (pattern_ParallelGateway2ParallelStepSeq_25_2_black_nac_3BB(
																		sf2, pgw) == null) {
																	if (pattern_ParallelGateway2ParallelStepSeq_25_2_black_nac_5BB(
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_25_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_25_4_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_25_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepSeq_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_1_bindingFB(
			ParallelGateway2ParallelStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepSeq _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_26_1_binding = pattern_ParallelGateway2ParallelStepSeq_26_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepSeq_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepSeq_26_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_26_1_black = pattern_ParallelGateway2ParallelStepSeq_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepSeq_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepSeq_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_480166 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_480166)) {
					if (!pcgw.equals(__DEC_pgw___conv_480166)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_95317 = pcgw.get__conv();
			if (__DEC_pcgw___conv_95317 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_95317)) {
					if (!pgw.equals(__DEC_pcgw___conv_95317)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_291746 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_291746)) {
					if (!pgw.equals(__DEC_pcgw___conv_291746)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_26_2_blackFFFFFFB(
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
								if (tmpNode instanceof Task) {
									Task node = (Task) tmpNode;
									boolean pcgwisDiverging = pcgw.isIsDiverging();
									if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
										if (pattern_ParallelGateway2ParallelStepSeq_26_2_black_nac_0BB(pgw,
												pcgw) == null) {
											if (pattern_ParallelGateway2ParallelStepSeq_26_2_black_nac_1BB(pcgw,
													pgw) == null) {
												if (pattern_ParallelGateway2ParallelStepSeq_26_2_black_nac_2BB(pcgw,
														pgw) == null) {
													if (pattern_ParallelGateway2ParallelStepSeq_26_2_black_nac_4BB(sf1,
															pcgw) == null) {
														for (SequenceFlow sf2 : pcgw.getOutgoing()) {
															if (!sf1.equals(sf2)) {
																if (pattern_ParallelGateway2ParallelStepSeq_26_2_black_nac_3BB(
																		sf2, pgw) == null) {
																	if (pattern_ParallelGateway2ParallelStepSeq_26_2_black_nac_5BB(
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_26_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_26_4_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_26_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepSeq_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_1_bindingFB(
			ParallelGateway2ParallelStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepSeq _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_27_1_binding = pattern_ParallelGateway2ParallelStepSeq_27_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepSeq_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepSeq_27_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_27_1_black = pattern_ParallelGateway2ParallelStepSeq_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepSeq_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepSeq_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_403105 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_403105)) {
					if (!pcgw.equals(__DEC_pgw___conv_403105)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_549155 = pcgw.get__conv();
			if (__DEC_pcgw___conv_549155 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_549155)) {
					if (!pgw.equals(__DEC_pcgw___conv_549155)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_361454 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_361454)) {
					if (!pgw.equals(__DEC_pcgw___conv_361454)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_27_2_blackFFFFFFB(
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
								if (pattern_ParallelGateway2ParallelStepSeq_27_2_black_nac_0BB(pgw, pcgw) == null) {
									if (pattern_ParallelGateway2ParallelStepSeq_27_2_black_nac_1BB(pcgw, pgw) == null) {
										if (pattern_ParallelGateway2ParallelStepSeq_27_2_black_nac_2BB(pcgw,
												pgw) == null) {
											for (SequenceFlow sf1 : pgw.getIncoming()) {
												FlowNode tmpNode = sf1.getSourceRef();
												if (tmpNode instanceof Task) {
													Task node = (Task) tmpNode;
													if (pattern_ParallelGateway2ParallelStepSeq_27_2_black_nac_4BB(sf1,
															pcgw) == null) {
														for (SequenceFlow sf2 : pcgw.getOutgoing()) {
															if (!sf1.equals(sf2)) {
																if (pattern_ParallelGateway2ParallelStepSeq_27_2_black_nac_3BB(
																		sf2, pgw) == null) {
																	if (pattern_ParallelGateway2ParallelStepSeq_27_2_black_nac_5BB(
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_27_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_27_4_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_27_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepSeq_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_1_bindingFB(
			ParallelGateway2ParallelStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepSeq _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_28_1_binding = pattern_ParallelGateway2ParallelStepSeq_28_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepSeq_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepSeq_28_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_28_1_black = pattern_ParallelGateway2ParallelStepSeq_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepSeq_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepSeq_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_587523 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_587523)) {
					if (!pcgw.equals(__DEC_pgw___conv_587523)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_945759 = pcgw.get__conv();
			if (__DEC_pcgw___conv_945759 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_945759)) {
					if (!pgw.equals(__DEC_pcgw___conv_945759)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_292598 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_292598)) {
					if (!pgw.equals(__DEC_pcgw___conv_292598)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_28_2_blackFFFFFFB(
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
						if (pattern_ParallelGateway2ParallelStepSeq_28_2_black_nac_5BB(sf2, pcgw) == null) {
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
														if (pattern_ParallelGateway2ParallelStepSeq_28_2_black_nac_0BB(
																pgw, pcgw) == null) {
															if (pattern_ParallelGateway2ParallelStepSeq_28_2_black_nac_1BB(
																	pcgw, pgw) == null) {
																if (pattern_ParallelGateway2ParallelStepSeq_28_2_black_nac_2BB(
																		pcgw, pgw) == null) {
																	if (pattern_ParallelGateway2ParallelStepSeq_28_2_black_nac_3BB(
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
																						if (tmpNode instanceof Task) {
																							Task node = (Task) tmpNode;
																							if (process
																									.getFlowElements()
																									.contains(node)) {
																								if (pattern_ParallelGateway2ParallelStepSeq_28_2_black_nac_4BB(
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_28_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_28_4_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_28_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepSeq_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_1_bindingFB(
			ParallelGateway2ParallelStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_1_blackFBB(EClass __eClass,
			ParallelGateway2ParallelStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepSeq _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_29_1_binding = pattern_ParallelGateway2ParallelStepSeq_29_1_bindingFB(
				_this);
		if (result_pattern_ParallelGateway2ParallelStepSeq_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepSeq_29_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_29_1_black = pattern_ParallelGateway2ParallelStepSeq_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepSeq_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepSeq_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_2_black_nac_0BB(ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pgw___conv_488344 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, ParallelGateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_488344)) {
					if (!pcgw.equals(__DEC_pgw___conv_488344)) {
						return new Object[] { pgw, pcgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_2_black_nac_1BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			ParallelGateway __DEC_pcgw___conv_331201 = pcgw.get__conv();
			if (__DEC_pcgw___conv_331201 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_331201)) {
					if (!pgw.equals(__DEC_pcgw___conv_331201)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_2_black_nac_2BB(ParallelGateway pcgw,
			ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (ParallelGateway __DEC_pcgw___conv_281105 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, ParallelGateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_281105)) {
					if (!pgw.equals(__DEC_pcgw___conv_281105)) {
						return new Object[] { pcgw, pgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_2_black_nac_3BB(SequenceFlow sf2,
			ParallelGateway pgw) {
		if (pgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_2_black_nac_4BB(SequenceFlow sf1,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf1.getTargetRef())) {
			return new Object[] { sf1, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_2_black_nac_5BB(SequenceFlow sf2,
			ParallelGateway pcgw) {
		if (pcgw.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, pcgw };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_29_2_blackFFFFFFB(
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
						if (pattern_ParallelGateway2ParallelStepSeq_29_2_black_nac_5BB(sf2, pcgw) == null) {
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
														if (pattern_ParallelGateway2ParallelStepSeq_29_2_black_nac_0BB(
																pgw, pcgw) == null) {
															if (pattern_ParallelGateway2ParallelStepSeq_29_2_black_nac_1BB(
																	pcgw, pgw) == null) {
																if (pattern_ParallelGateway2ParallelStepSeq_29_2_black_nac_2BB(
																		pcgw, pgw) == null) {
																	if (pattern_ParallelGateway2ParallelStepSeq_29_2_black_nac_3BB(
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
																						if (tmpNode instanceof Task) {
																							Task node = (Task) tmpNode;
																							if (process
																									.getFlowElements()
																									.contains(node)) {
																								if (pattern_ParallelGateway2ParallelStepSeq_29_2_black_nac_4BB(
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_29_3_expressionFBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, sf1, pgw, pcgw, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_29_4_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_29_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepSeq_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_32_1_blackB(
			ParallelGateway2ParallelStepSeq _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_32_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_32_2_bindingFFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("node");
		EObject _localVariable_1 = targetMatch.getObject("prevStep");
		EObject _localVariable_2 = targetMatch.getObject("step");
		EObject _localVariable_3 = sourceMatch.getObject("process");
		EObject _localVariable_4 = targetMatch.getObject("flow");
		EObject _localVariable_5 = sourceMatch.getObject("sf1");
		EObject _localVariable_6 = sourceMatch.getObject("pgw");
		EObject _localVariable_7 = sourceMatch.getObject("pcgw");
		EObject _localVariable_8 = sourceMatch.getObject("sf2");
		EObject tmpNode = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpSf1 = _localVariable_5;
		EObject tmpPgw = _localVariable_6;
		EObject tmpPcgw = _localVariable_7;
		EObject tmpSf2 = _localVariable_8;
		if (tmpNode instanceof Task) {
			Task node = (Task) tmpNode;
			if (tmpPrevStep instanceof NormalStep) {
				NormalStep prevStep = (NormalStep) tmpPrevStep;
				if (tmpStep instanceof ParallelStep) {
					ParallelStep step = (ParallelStep) tmpStep;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (tmpPgw instanceof ParallelGateway) {
									ParallelGateway pgw = (ParallelGateway) tmpPgw;
									if (tmpPcgw instanceof ParallelGateway) {
										ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
										if (tmpSf2 instanceof SequenceFlow) {
											SequenceFlow sf2 = (SequenceFlow) tmpSf2;
											return new Object[] { node, prevStep, step, process, flow, sf1, pgw, pcgw,
													sf2, sourceMatch, targetMatch };
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

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_32_2_blackFBBBBBBBFBBBB(Task node,
			NormalStep prevStep, ParallelStep step, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SequenceFlow sf2, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				if (!sourceMatch.equals(targetMatch)) {
					if (step.equals(prevStep.getNext())) {
						if (process.getFlowElements().contains(pgw)) {
							if (process.getFlowElements().contains(sf1)) {
								if (process.getFlowElements().contains(node)) {
									if (process.getFlowElements().contains(pcgw)) {
										if (process.getFlowElements().contains(sf2)) {
											if (flow.getSteps().contains(step)) {
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
																		for (FN2S _t2ns : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(node,
																						FN2S.class, "source")) {
																			if (prevStep.equals(_t2ns.getTarget())) {
																				for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(sf1,
																								SF2F.class, "source")) {
																					if (flow.equals(
																							_sf2f1.getTarget())) {
																						_result.add(new Object[] {
																								_t2ns, node, prevStep,
																								step, process, flow,
																								sf1, pgw, _sf2f1, pcgw,
																								sf2, sourceMatch,
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
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_32_2_greenBBBBBBBBBBBBFB(FN2S _t2ns, Task node,
			NormalStep prevStep, ParallelStep step, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			ParallelGateway pgw, SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2, Match sourceMatch,
			Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "ParallelGateway2ParallelStepSeq";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(pcgw);
		isApplicableMatch.getAllContextElements().add(sf2);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(_t2ns);
		isApplicableMatch.getAllContextElements().add(_sf2f1);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { _t2ns, node, prevStep, step, process, flow, sf1, pgw, _sf2f1, pcgw, sf2, sourceMatch,
				isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_32_3_bindingFBBBBBBBBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, IsApplicableMatchCC isApplicableMatch, FN2S _t2ns, Task node,
			NormalStep prevStep, ParallelStep step, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			ParallelGateway pgw, SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, _t2ns, node, prevStep, step, process,
				flow, sf1, pgw, _sf2f1, pcgw, sf2, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, _t2ns, node, prevStep, step, process, flow, sf1, pgw,
					_sf2f1, pcgw, sf2, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_32_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_32_3_bindingAndBlackFBBBBBBBBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, IsApplicableMatchCC isApplicableMatch, FN2S _t2ns, Task node,
			NormalStep prevStep, ParallelStep step, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			ParallelGateway pgw, SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_32_3_binding = pattern_ParallelGateway2ParallelStepSeq_32_3_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, _t2ns, node, prevStep, step, process, flow, sf1, pgw, _sf2f1, pcgw, sf2,
				sourceMatch, targetMatch);
		if (result_pattern_ParallelGateway2ParallelStepSeq_32_3_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepSeq_32_3_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_32_3_black = pattern_ParallelGateway2ParallelStepSeq_32_3_blackB(
					csp);
			if (result_pattern_ParallelGateway2ParallelStepSeq_32_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, _t2ns, node, prevStep, step, process, flow, sf1,
						pgw, _sf2f1, pcgw, sf2, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_32_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_32_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelGateway2ParallelStepSeq";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelGateway2ParallelStepSeq_32_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_35_1_blackB(
			ParallelGateway2ParallelStepSeq _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_35_2_bindingFFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("_t2ns");
		EObject _localVariable_1 = isApplicableMatch.getObject("node");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("step");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_7 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_8 = isApplicableMatch.getObject("_sf2f1");
		EObject _localVariable_9 = isApplicableMatch.getObject("pcgw");
		EObject _localVariable_10 = isApplicableMatch.getObject("sf2");
		EObject tmp_t2ns = _localVariable_0;
		EObject tmpNode = _localVariable_1;
		EObject tmpPrevStep = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmpPgw = _localVariable_7;
		EObject tmp_sf2f1 = _localVariable_8;
		EObject tmpPcgw = _localVariable_9;
		EObject tmpSf2 = _localVariable_10;
		if (tmp_t2ns instanceof FN2S) {
			FN2S _t2ns = (FN2S) tmp_t2ns;
			if (tmpNode instanceof Task) {
				Task node = (Task) tmpNode;
				if (tmpPrevStep instanceof NormalStep) {
					NormalStep prevStep = (NormalStep) tmpPrevStep;
					if (tmpStep instanceof ParallelStep) {
						ParallelStep step = (ParallelStep) tmpStep;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
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
													return new Object[] { _t2ns, node, prevStep, step, process, flow,
															sf1, pgw, _sf2f1, pcgw, sf2, isApplicableMatch };
												}
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_35_2_blackBBBBBBBBBBBB(FN2S _t2ns, Task node,
			NormalStep prevStep, ParallelStep step, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			ParallelGateway pgw, SF2F _sf2f1, ParallelGateway pcgw, SequenceFlow sf2,
			IsApplicableMatchCC isApplicableMatch) {
		if (!sf1.equals(sf2)) {
			if (!pcgw.equals(pgw)) {
				if (node.equals(_t2ns.getSource())) {
					if (prevStep.equals(_t2ns.getTarget())) {
						if (step.equals(prevStep.getNext())) {
							if (process.getFlowElements().contains(pgw)) {
								if (process.getFlowElements().contains(sf1)) {
									if (process.getFlowElements().contains(node)) {
										if (process.getFlowElements().contains(pcgw)) {
											if (process.getFlowElements().contains(sf2)) {
												if (flow.getSteps().contains(step)) {
													if (pgw.equals(sf1.getTargetRef())) {
														if (pcgw.equals(pgw.get__conv())) {
															if (sf1.equals(_sf2f1.getSource())) {
																if (flow.equals(_sf2f1.getTarget())) {
																	if (node.equals(sf1.getSourceRef())) {
																		if (pcgw.equals(sf2.getSourceRef())) {
																			boolean pgwisDiverging = pgw
																					.isIsDiverging();
																			if (Boolean.valueOf(pgwisDiverging)
																					.equals(Boolean.valueOf(true))) {
																				boolean pcgwisDiverging = pcgw
																						.isIsDiverging();
																				if (Boolean.valueOf(pcgwisDiverging)
																						.equals(false)) {
																					return new Object[] { _t2ns, node,
																							prevStep, step, process,
																							flow, sf1, pgw, _sf2f1,
																							pcgw, sf2,
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
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_35_2_bindingAndBlackFFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding = pattern_ParallelGateway2ParallelStepSeq_35_2_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding != null) {
			FN2S _t2ns = (FN2S) result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding[0];
			Task node = (Task) result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding[1];
			NormalStep prevStep = (NormalStep) result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding[2];
			ParallelStep step = (ParallelStep) result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding[4];
			Flow flow = (Flow) result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding[5];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding[6];
			ParallelGateway pgw = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding[7];
			SF2F _sf2f1 = (SF2F) result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding[8];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding[9];
			SequenceFlow sf2 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepSeq_35_2_binding[10];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_35_2_black = pattern_ParallelGateway2ParallelStepSeq_35_2_blackBBBBBBBBBBBB(
					_t2ns, node, prevStep, step, process, flow, sf1, pgw, _sf2f1, pcgw, sf2, isApplicableMatch);
			if (result_pattern_ParallelGateway2ParallelStepSeq_35_2_black != null) {

				return new Object[] { _t2ns, node, prevStep, step, process, flow, sf1, pgw, _sf2f1, pcgw, sf2,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_35_2_greenBBBBFFF(ParallelStep step, Flow flow,
			ParallelGateway pgw, SequenceFlow sf2) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		FN2S _pgw2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		SF2F _sf22f2 = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		result.getCreatedElements().add(_pgw2s);
		_pgw2s.setSource(pgw);
		_pgw2s.setTarget(step);
		result.getCreatedElements().add(_sf22f2);
		_sf22f2.setSource(sf2);
		_sf22f2.setTarget(flow);
		return new Object[] { step, flow, pgw, sf2, result, _pgw2s, _sf22f2 };
	}

	public static final PerformRuleResult pattern_ParallelGateway2ParallelStepSeq_35_3_expressionFB(
			PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_1_blackB(
			ParallelGateway2ParallelStepSeq _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, FN2S _t2ns) {
		if (ruleResult.getCorrObjects().contains(_t2ns)) {
			return new Object[] { ruleResult, _t2ns };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Task node) {
		if (ruleResult.getSourceObjects().contains(node)) {
			return new Object[] { ruleResult, node };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow sf1) {
		if (ruleResult.getSourceObjects().contains(sf1)) {
			return new Object[] { ruleResult, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, SF2F _sf2f1) {
		if (ruleResult.getCorrObjects().contains(_sf2f1)) {
			return new Object[] { ruleResult, _sf2f1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, NormalStep prevStep) {
		if (ruleResult.getTargetObjects().contains(prevStep)) {
			return new Object[] { ruleResult, prevStep };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepSeq_36_2_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList _t2nsList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmp_t2ns : _t2nsList.getEntryObjects()) {
				if (tmp_t2ns instanceof FN2S) {
					FN2S _t2ns = (FN2S) tmp_t2ns;
					FlowNode tmpNode = _t2ns.getSource();
					if (tmpNode instanceof Task) {
						Task node = (Task) tmpNode;
						Step tmpPrevStep = _t2ns.getTarget();
						if (tmpPrevStep instanceof NormalStep) {
							NormalStep prevStep = (NormalStep) tmpPrevStep;
							if (pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_0BB(ruleResult, _t2ns) == null) {
								if (pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_1BB(ruleResult,
										node) == null) {
									if (pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_6BB(ruleResult,
											prevStep) == null) {
										for (SequenceFlow sf1 : node.getOutgoing()) {
											if (pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_3BB(ruleResult,
													sf1) == null) {
												for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(node, SimpleBPMN.Process.class,
																"flowElements")) {
													if (process.getFlowElements().contains(sf1)) {
														if (pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_2BB(
																ruleResult, process) == null) {
															for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(sf1, SF2F.class,
																			"source")) {
																Flow flow = _sf2f1.getTarget();
																if (flow != null) {
																	if (pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_4BB(
																			ruleResult, _sf2f1) == null) {
																		if (pattern_ParallelGateway2ParallelStepSeq_36_2_black_nac_5BB(
																				ruleResult, flow) == null) {
																			_result.add(new Object[] { _t2nsList, _t2ns,
																					node, process, sf1, _sf2f1, flow,
																					prevStep, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_3_bindingFBBBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, IsApplicableMatch isApplicableMatch, FN2S _t2ns, Task node,
			NormalStep prevStep, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, SF2F _sf2f1,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, _t2ns, node, prevStep, process, flow,
				sf1, _sf2f1, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, _t2ns, node, prevStep, process, flow, sf1, _sf2f1,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_3_bindingAndBlackFBBBBBBBBBB(
			ParallelGateway2ParallelStepSeq _this, IsApplicableMatch isApplicableMatch, FN2S _t2ns, Task node,
			NormalStep prevStep, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, SF2F _sf2f1,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParallelGateway2ParallelStepSeq_36_3_binding = pattern_ParallelGateway2ParallelStepSeq_36_3_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, _t2ns, node, prevStep, process, flow, sf1, _sf2f1, ruleResult);
		if (result_pattern_ParallelGateway2ParallelStepSeq_36_3_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepSeq_36_3_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepSeq_36_3_black = pattern_ParallelGateway2ParallelStepSeq_36_3_blackB(
					csp);
			if (result_pattern_ParallelGateway2ParallelStepSeq_36_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, _t2ns, node, prevStep, process, flow, sf1, _sf2f1,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepSeq_36_4_expressionFBB(
			ParallelGateway2ParallelStepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_5_blackBBBBBBB(FN2S _t2ns, Task node,
			NormalStep prevStep, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, SF2F _sf2f1) {
		return new Object[] { _t2ns, node, prevStep, process, flow, sf1, _sf2f1 };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_6_blackBBBBBBBB(FN2S _t2ns, Task node,
			NormalStep prevStep, SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, SF2F _sf2f1,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { _t2ns, node, prevStep, process, flow, sf1, _sf2f1, ruleResult };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepSeq_36_6_greenBFFBBBFFFFBB(NormalStep prevStep,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ParallelStep step = SimpleUseCaseFactory.eINSTANCE.createParallelStep();
		FN2S _pgw2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		ParallelGateway pgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		ParallelGateway pcgw = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
		SequenceFlow sf2 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		SF2F _sf22f2 = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		Object _localVariable_0 = csp.getValue("step", "id");
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_1 = csp.getValue("pgw", "id");
		boolean pcgw_isDiverging_prime = false;
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		prevStep.setNext(step);
		flow.getSteps().add(step);
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
		String step_id_prime = (String) _localVariable_0;
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		String pgw_id_prime = (String) _localVariable_1;
		pcgw.setIsDiverging(Boolean.valueOf(pcgw_isDiverging_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		step.setId(step_id_prime);
		pgw.setId(pgw_id_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { prevStep, step, _pgw2s, process, flow, sf1, pgw, pcgw, sf2, _sf22f2, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ParallelGateway2ParallelStepSeq_36_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelGateway2ParallelStepSeqImpl
