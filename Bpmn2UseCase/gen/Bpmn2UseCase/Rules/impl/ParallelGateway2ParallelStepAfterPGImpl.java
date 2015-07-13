/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.PG2PS;

import Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG;
import Bpmn2UseCase.Rules.RulesPackage;

import Bpmn2UseCase.SF2F;

import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

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
 * An implementation of the model object '<em><b>Parallel Gateway2 Parallel Step After PG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelGateway2ParallelStepAfterPGImpl extends AbstractRuleImpl
		implements ParallelGateway2ParallelStepAfterPG {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelGateway2ParallelStepAfterPGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParallelGateway2ParallelStepAfterPG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ParallelGateway node,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw) {
		// initial bindings
		Object[] result1_black = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_0_1_blackBBBBBB(
						this, match, node, process, sf1, pgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[node] = " + node
							+ ", " + "[process] = " + process + ", "
							+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_0_2_bindingAndBlackFBBBBBB(
						this, match, node, process, sf1, pgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[node] = " + node
							+ ", " + "[process] = " + process + ", "
							+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_0_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_0_4_blackBBBBB(
							match, node, process, sf1, pgw);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[node] = " + node + ", " + "[process] = "
								+ process + ", " + "[sf1] = " + sf1 + ", "
								+ "[pgw] = " + pgw + ".");
			}
			ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_0_4_greenBBBBFFF(
							match, process, sf1, pgw);
			// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result4_green[4];
			// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result4_green[5];
			// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_0_5_blackBBBBB(
							match, node, process, sf1, pgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[node] = " + node + ", " + "[process] = "
								+ process + ", " + "[sf1] = " + sf1 + ", "
								+ "[pgw] = " + pgw + ".");
			}
			ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_0_5_greenBBBBFFFF(
							match, node, process, sf1);
			// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result5_green[4];
			// EMoflonEdge process__node____flowElements = (EMoflonEdge) result5_green[5];
			// EMoflonEdge sf1__node____sourceRef = (EMoflonEdge) result5_green[6];
			// EMoflonEdge node__sf1____outgoing = (EMoflonEdge) result5_green[7];

			// register objects to match
			ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_0_6_expressionBBBBBB(
							this, match, node, process, sf1, pgw);
			return ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_0_7_expressionF();
		} else {
			return ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_1_1_bindingAndBlackFFFFFFBFB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		ParallelGateway node = (ParallelGateway) result1_bindingAndBlack[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[1];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[2];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[3];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[4];
		SF2F _sf2f1 = (SF2F) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_1_1_greenBBFF(
						flow, pgw);
		ParallelStep step = (ParallelStep) result1_green[2];
		PG2PS _pg2ps = (PG2PS) result1_green[3];

		// collect translated elements
		Object[] result2_black = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_1_2_blackBBB(pgw,
						step, _pg2ps);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[pgw] = " + pgw + ", "
							+ "[step] = " + step + ", " + "[_pg2ps] = "
							+ _pg2ps + ".");
		}
		Object[] result2_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_1_2_greenFBBB(pgw,
						step, _pg2ps);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_1_3_blackBBBBBBBBB(
						ruleresult, node, process, flow, sf1, pgw, step,
						_pg2ps, _sf2f1);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[node] = "
							+ node
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[sf1] = "
							+ sf1
							+ ", "
							+ "[pgw] = "
							+ pgw
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[_pg2ps] = "
							+ _pg2ps
							+ ", "
							+ "[_sf2f1] = " + _sf2f1 + ".");
		}
		ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_1_3_greenBBBBBBBFFFFFF(
						ruleresult, process, flow, sf1, pgw, step, _pg2ps);
		// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[7];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[8];
		// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[9];
		// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[10];
		// EMoflonEdge _pg2ps__pgw____source = (EMoflonEdge) result3_green[11];
		// EMoflonEdge _pg2ps__step____target = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_1_5_expressionBBBBBBBBBB(
						this, ruleresult, node, process, flow, sf1, pgw, step,
						_pg2ps, _sf2f1);
		return ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		ParallelGateway node = (ParallelGateway) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ParallelGateway pgw = (ParallelGateway) result2_binding[3];
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_2_2_blackBBFBBFB(
						node, process, sf1, pgw, match)) {
			BasicFlow flow = (BasicFlow) result2_black[2];
			SF2F _sf2f1 = (SF2F) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_2_3_blackBBBBBB(
							node, process, flow, sf1, pgw, _sf2f1)) {
				Object[] result3_green = ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_2_3_greenBBBBBBFFFFFFFFFF(
								node, process, flow, sf1, pgw, _sf2f1);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[9];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _sf2f1__sf1____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge _sf2f1__flow____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge sf1__node____sourceRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge node__sf1____outgoing = (EMoflonEdge) result3_green[15];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_2_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, node, process, flow,
								sf1, pgw, _sf2f1);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[node] = "
									+ node
									+ ", "
									+ "[process] = "
									+ process
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[sf1] = "
									+ sf1
									+ ", "
									+ "[pgw] = "
									+ pgw + ", " + "[_sf2f1] = " + _sf2f1 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ParallelGateway node,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw) {
		match.registerObject("node", node);
		match.registerObject("process", process);
		match.registerObject("sf1", sf1);
		match.registerObject("pgw", pgw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ParallelGateway node,
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelGateway pgw) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, ParallelGateway pgw, SF2F _sf2f1) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("pgw", pgw);
		isApplicableMatch.registerObject("_sf2f1", _sf2f1);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject node,
			EObject process, EObject flow, EObject sf1, EObject pgw,
			EObject step, EObject _pg2ps, EObject _sf2f1) {
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pgw", pgw);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("_pg2ps", _pg2ps);
		ruleresult.registerObject("_sf2f1", _sf2f1);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match
				.getObject("pgw")
				.eClass()
				.equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE
						.getParallelGateway());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, BasicFlow flow,
			ParallelStep step) {
		// initial bindings
		Object[] result1_black = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_10_1_blackBBBB(
						this, match, flow, step);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[flow] = " + flow
							+ ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_10_2_bindingAndBlackFBBBB(
						this, match, flow, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[flow] = " + flow
							+ ", " + "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_10_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_10_4_blackBBB(
							match, flow, step);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[flow] = " + flow + ", " + "[step] = "
								+ step + ".");
			}
			ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_10_4_greenBBBF(
							match, flow, step);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_10_5_blackBBB(
							match, flow, step);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[flow] = " + flow + ", " + "[step] = "
								+ step + ".");
			}
			ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_10_5_greenBB(
							match, flow);

			// register objects to match
			ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_10_6_expressionBBBB(
							this, match, flow, step);
			return ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_10_7_expressionF();
		} else {
			return ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_11_1_bindingAndBlackFFFFFFBFB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		ParallelGateway node = (ParallelGateway) result1_bindingAndBlack[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[1];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[2];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[3];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[4];
		SF2F _sf2f1 = (SF2F) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_11_1_greenBBFBF(
						process, sf1, step);
		ParallelGateway pgw = (ParallelGateway) result1_green[2];
		PG2PS _pg2ps = (PG2PS) result1_green[4];

		// collect translated elements
		Object[] result2_black = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_11_2_blackBBB(pgw,
						step, _pg2ps);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[pgw] = " + pgw + ", "
							+ "[step] = " + step + ", " + "[_pg2ps] = "
							+ _pg2ps + ".");
		}
		Object[] result2_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_11_2_greenFBBB(
						pgw, step, _pg2ps);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_11_3_blackBBBBBBBBB(
						ruleresult, node, process, flow, sf1, pgw, step,
						_pg2ps, _sf2f1);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[node] = "
							+ node
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[sf1] = "
							+ sf1
							+ ", "
							+ "[pgw] = "
							+ pgw
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[_pg2ps] = "
							+ _pg2ps
							+ ", "
							+ "[_sf2f1] = " + _sf2f1 + ".");
		}
		ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_11_3_greenBBBBBBBFFFFFF(
						ruleresult, process, flow, sf1, pgw, step, _pg2ps);
		// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[7];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[8];
		// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[9];
		// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[10];
		// EMoflonEdge _pg2ps__pgw____source = (EMoflonEdge) result3_green[11];
		// EMoflonEdge _pg2ps__step____target = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_11_5_expressionBBBBBBBBBB(
						this, ruleresult, node, process, flow, sf1, pgw, step,
						_pg2ps, _sf2f1);
		return ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		BasicFlow flow = (BasicFlow) result2_binding[0];
		ParallelStep step = (ParallelStep) result2_binding[1];
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_12_2_blackBFBFB(
						flow, step, match)) {
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			SF2F _sf2f1 = (SF2F) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_12_3_blackFFBBBB(
							flow, sf1, step, _sf2f1)) {
				ParallelGateway node = (ParallelGateway) result3_black[0];
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[1];
				Object[] result3_green = ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_12_3_greenBBBBBBFFFFFFFF(
								node, process, flow, sf1, step, _sf2f1);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[9];
				// EMoflonEdge _sf2f1__sf1____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _sf2f1__flow____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge sf1__node____sourceRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge node__sf1____outgoing = (EMoflonEdge) result3_green[13];

				// solve CSP
				Object[] result4_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_12_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, node, process, flow,
								sf1, step, _sf2f1);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[node] = "
									+ node
									+ ", "
									+ "[process] = "
									+ process
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[sf1] = "
									+ sf1
									+ ", "
									+ "[step] = "
									+ step
									+ ", "
									+ "[_sf2f1] = "
									+ _sf2f1
									+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_12_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, BasicFlow flow,
			ParallelStep step) {
		match.registerObject("flow", flow);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, BasicFlow flow,
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, ParallelStep step, SF2F _sf2f1) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("step", step);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject node,
			EObject process, EObject flow, EObject sf1, EObject pgw,
			EObject step, EObject _pg2ps, EObject _sf2f1) {
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pgw", pgw);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("_pg2ps", _pg2ps);
		ruleresult.registerObject("_sf2f1", _sf2f1);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("step")
				.eClass()
				.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE
						.getParallelStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_277(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_20_2_blackFFFFB(_edge_flowElements)) {
			ParallelGateway node = (ParallelGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			Object[] result2_green = ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_20_3_expressionFBBBBBB(
							this, match, node, process, sf1, pgw)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_20_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_20_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_20_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_83(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_21_2_blackFFB(_edge_steps)) {
			BasicFlow flow = (BasicFlow) result2_black[0];
			ParallelStep step = (ParallelStep) result2_black[1];
			Object[] result2_green = ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_21_3_expressionFBBBB(
							this, match, flow, step)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_21_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_21_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_21_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_278(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_22_2_blackFFFFB(_edge_targetRef)) {
			ParallelGateway node = (ParallelGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			Object[] result2_green = ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_22_3_expressionFBBBBBB(
							this, match, node, process, sf1, pgw)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_22_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_22_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_22_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_279(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_23_2_blackFFFFB(_edge_incoming)) {
			ParallelGateway node = (ParallelGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			Object[] result2_green = ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_23_3_expressionFBBBBBB(
							this, match, node, process, sf1, pgw)) {
				// Ensure that the correct types of elements are matched
				if (ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_23_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_23_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_23_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(
			TripleMatch tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ParallelGateway2ParallelStepAfterPG");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForNode = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("node")).findAny();
		SimpleBPMN.ParallelGateway node = (SimpleBPMN.ParallelGateway) matchForNode
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.BasicFlow flow = (SimpleUseCase.BasicFlow) matchForFlow
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw")).findAny();
		SimpleBPMN.ParallelGateway pgw = (SimpleBPMN.ParallelGateway) matchForPgw
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ParallelStep step = (SimpleUseCase.ParallelStep) matchForStep
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_pg2ps = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_pg2ps")).findAny();
		Bpmn2UseCase.PG2PS _pg2ps = (Bpmn2UseCase.PG2PS) matchFor_pg2ps.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf2f1 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf2f1")).findAny();
		Bpmn2UseCase.SF2F _sf2f1 = (Bpmn2UseCase.SF2F) matchFor_sf2f1.get()
				.getNode();

		if (!(node.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(pgw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
	public AttributeConstraintsRuleResult checkAttributes_BWD(
			TripleMatch tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ParallelGateway2ParallelStepAfterPG");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForNode = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("node")).findAny();
		SimpleBPMN.ParallelGateway node = (SimpleBPMN.ParallelGateway) matchForNode
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.BasicFlow flow = (SimpleUseCase.BasicFlow) matchForFlow
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw")).findAny();
		SimpleBPMN.ParallelGateway pgw = (SimpleBPMN.ParallelGateway) matchForPgw
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ParallelStep step = (SimpleUseCase.ParallelStep) matchForStep
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_pg2ps = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_pg2ps")).findAny();
		Bpmn2UseCase.PG2PS _pg2ps = (Bpmn2UseCase.PG2PS) matchFor_pg2ps.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf2f1 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf2f1")).findAny();
		Bpmn2UseCase.SF2F _sf2f1 = (Bpmn2UseCase.SF2F) matchFor_sf2f1.get()
				.getNode();

		if (!(node.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(pgw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch,
			Match targetMatch) {
		// prepare
		Object[] result1_black = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_26_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_26_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_26_2_bindingFFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed."
					+ " Variables: " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		ParallelGateway node = (ParallelGateway) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		BasicFlow flow = (BasicFlow) result2_binding[2];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[3];
		ParallelGateway pgw = (ParallelGateway) result2_binding[4];
		ParallelStep step = (ParallelStep) result2_binding[5];
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_26_2_blackBBBBBBFBB(
						node, process, flow, sf1, pgw, step, sourceMatch,
						targetMatch)) {
			SF2F _sf2f1 = (SF2F) result2_black[6];
			Object[] result2_green = ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_26_2_greenBBBBBBBBFB(
							node, process, flow, sf1, pgw, step, _sf2f1,
							sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[8];

			// check csp
			Object[] result3_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_26_3_bindingAndBlackFBBBBBBBBBBB(
							this, isApplicableMatch, node, process, flow, sf1,
							pgw, step, _sf2f1, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_26_4_blackBB(
								result, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed."
									+ " Variables: " + "[result] = " + result
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ".");
				}
				ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_26_4_greenBB(
								result, isApplicableMatch);

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_26_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch,
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, ParallelGateway pgw, ParallelStep step,
			SF2F _sf2f1, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("pgw", pgw);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("_sf2f1", _sf2f1);
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
		Object[] result1_black = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_29_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_29_2_bindingAndBlackFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [create correspondence links] failed."
							+ " Variables: " + "[isApplicableMatch] = "
							+ isApplicableMatch + ".");
		}
		// ParallelGateway node = (ParallelGateway) result2_bindingAndBlack[0];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[1];
		// BasicFlow flow = (BasicFlow) result2_bindingAndBlack[2];
		// SequenceFlow sf1 = (SequenceFlow) result2_bindingAndBlack[3];
		ParallelGateway pgw = (ParallelGateway) result2_bindingAndBlack[4];
		ParallelStep step = (ParallelStep) result2_bindingAndBlack[5];
		// SF2F _sf2f1 = (SF2F) result2_bindingAndBlack[6];
		Object[] result2_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_29_2_greenBBFF(
						pgw, step);
		PerformRuleResult result = (PerformRuleResult) result2_green[2];
		// PG2PS _pg2ps = (PG2PS) result2_green[3];

		return ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_29_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer, SF2F _sf2f1Parameter) {
		// create result
		Object[] result1_black = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_30_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_30_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_30_2_blackFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList _sf2f1List = (RuleEntryList) result2_black[0];
			ParallelGateway node = (ParallelGateway) result2_black[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			SequenceFlow sf1 = (SequenceFlow) result2_black[3];
			SF2F _sf2f1 = (SF2F) result2_black[4];
			BasicFlow flow = (BasicFlow) result2_black[5];

			// solve CSP
			Object[] result3_bindingAndBlack = ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_30_3_bindingAndBlackFBBBBBBBB(
							this, isApplicableMatch, node, process, flow, sf1,
							_sf2f1, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = "
								+ this
								+ ", "
								+ "[isApplicableMatch] = "
								+ isApplicableMatch
								+ ", "
								+ "[node] = "
								+ node
								+ ", "
								+ "[process] = "
								+ process
								+ ", "
								+ "[flow] = "
								+ flow
								+ ", "
								+ "[sf1] = "
								+ sf1
								+ ", "
								+ "[_sf2f1] = "
								+ _sf2f1
								+ ", "
								+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ParallelGateway2ParallelStepAfterPGImpl
					.pattern_ParallelGateway2ParallelStepAfterPG_30_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = ParallelGateway2ParallelStepAfterPGImpl
						.pattern_ParallelGateway2ParallelStepAfterPG_30_5_blackBBBBB(
								node, process, flow, sf1, _sf2f1);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_30_6_blackBBBBBB(
									node, process, flow, sf1, _sf2f1,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[node] = " + node
										+ ", " + "[process] = " + process
										+ ", " + "[flow] = " + flow + ", "
										+ "[sf1] = " + sf1 + ", "
										+ "[_sf2f1] = " + _sf2f1 + ", "
										+ "[ruleResult] = " + ruleResult + ".");
					}
					ParallelGateway2ParallelStepAfterPGImpl
							.pattern_ParallelGateway2ParallelStepAfterPG_30_6_greenBBBFFFB(
									process, flow, sf1, ruleResult);
					// ParallelGateway pgw = (ParallelGateway) result6_green[3];
					// ParallelStep step = (ParallelStep) result6_green[4];
					// PG2PS _pg2ps = (PG2PS) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return ParallelGateway2ParallelStepAfterPGImpl
				.pattern_ParallelGateway2ParallelStepAfterPG_30_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, SF2F _sf2f1, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("node", node);
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
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD__MATCH_PARALLELGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0),
					(ParallelGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(ParallelGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4));
			return null;
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(ParallelGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_PROCESS_BASICFLOW_SEQUENCEFLOW_PARALLELGATEWAY_SF2F:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(ParallelGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2),
					(BasicFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(ParallelGateway) arguments.get(5), (SF2F) arguments.get(6));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8));
			return null;
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD__MATCH_BASICFLOW_PARALLELSTEP:
			return isAppropriate_BWD((Match) arguments.get(0),
					(BasicFlow) arguments.get(1),
					(ParallelStep) arguments.get(2));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BASICFLOW_PARALLELSTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(BasicFlow) arguments.get(1),
					(ParallelStep) arguments.get(2));
			return null;
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BASICFLOW_PARALLELSTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(BasicFlow) arguments.get(1),
					(ParallelStep) arguments.get(2));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_PROCESS_BASICFLOW_SEQUENCEFLOW_PARALLELSTEP_SF2F:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ParallelGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2),
					(BasicFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(ParallelStep) arguments.get(5), (SF2F) arguments.get(6));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8));
			return null;
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_277__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_277((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_83__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_83((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_278__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_278((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_279__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_279((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0),
					(Match) arguments.get(1));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PARALLELGATEWAY_PROCESS_BASICFLOW_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELSTEP_SF2F_MATCH_MATCH:
			return isApplicable_solveCsp_CC(
					(IsApplicableMatchCC) arguments.get(0),
					(ParallelGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2),
					(BasicFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4),
					(ParallelGateway) arguments.get(5),
					(ParallelStep) arguments.get(6), (SF2F) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___GENERATE_MODEL__RULEENTRYCONTAINER_SF2F:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SF2F) arguments.get(1));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_PROCESS_BASICFLOW_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ParallelGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2),
					(BasicFlow) arguments.get(3),
					(SequenceFlow) arguments.get(4), (SF2F) arguments.get(5),
					(ModelgeneratorRuleResult) arguments.get(6));
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_0_1_blackBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match,
			ParallelGateway node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw) {
		if (!node.equals(pgw)) {
			return new Object[] { _this, match, node, process, sf1, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_0_2_bindingFBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match,
			ParallelGateway node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, node,
				process, sf1, pgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, node, process, sf1, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_0_2_bindingAndBlackFBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match,
			ParallelGateway node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_0_2_binding = pattern_ParallelGateway2ParallelStepAfterPG_0_2_bindingFBBBBBB(
				_this, match, node, process, sf1, pgw);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterPG_0_2_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_0_2_black = pattern_ParallelGateway2ParallelStepAfterPG_0_2_blackB(csp);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_0_2_black != null) {

				return new Object[] { csp, _this, match, node, process, sf1,
						pgw };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_0_3_expressionFBB(
			ParallelGateway2ParallelStepAfterPG _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_0_4_blackBBBBB(
			Match match, ParallelGateway node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw) {
		if (!node.equals(pgw)) {
			return new Object[] { match, node, process, sf1, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_0_4_greenBBBBFFF(
			Match match, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw) {
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(pgw);
		String process__pgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		match.getToBeTranslatedEdges().add(process__pgw____flowElements);
		sf1__pgw____targetRef.setSrc(sf1);
		sf1__pgw____targetRef.setTrg(pgw);
		match.getToBeTranslatedEdges().add(sf1__pgw____targetRef);
		pgw__sf1____incoming.setSrc(pgw);
		pgw__sf1____incoming.setTrg(sf1);
		match.getToBeTranslatedEdges().add(pgw__sf1____incoming);
		process__pgw____flowElements
				.setName(process__pgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		return new Object[] { match, process, sf1, pgw,
				process__pgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_0_5_blackBBBBB(
			Match match, ParallelGateway node, SimpleBPMN.Process process,
			SequenceFlow sf1, ParallelGateway pgw) {
		if (!node.equals(pgw)) {
			return new Object[] { match, node, process, sf1, pgw };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_0_5_greenBBBBFFFF(
			Match match, ParallelGateway node, SimpleBPMN.Process process,
			SequenceFlow sf1) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__node____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge node__sf1____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
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
		process__sf1____flowElements
				.setName(process__sf1____flowElements_name_prime);
		process__node____flowElements
				.setName(process__node____flowElements_name_prime);
		sf1__node____sourceRef.setName(sf1__node____sourceRef_name_prime);
		node__sf1____outgoing.setName(node__sf1____outgoing_name_prime);
		return new Object[] { match, node, process, sf1,
				process__sf1____flowElements, process__node____flowElements,
				sf1__node____sourceRef, node__sf1____outgoing };
	}

	public static final void pattern_ParallelGateway2ParallelStepAfterPG_0_6_expressionBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match,
			ParallelGateway node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw) {
		_this.registerObjectsToMatch_FWD(match, node, process, sf1, pgw);

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_1_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("node");
		EObject _localVariable_1 = isApplicableMatch.getObject("process");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_4 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_5 = isApplicableMatch.getObject("_sf2f1");
		EObject tmpNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpSf1 = _localVariable_3;
		EObject tmpPgw = _localVariable_4;
		EObject tmp_sf2f1 = _localVariable_5;
		if (tmpNode instanceof ParallelGateway) {
			ParallelGateway node = (ParallelGateway) tmpNode;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpFlow instanceof BasicFlow) {
					BasicFlow flow = (BasicFlow) tmpFlow;
					if (tmpSf1 instanceof SequenceFlow) {
						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
						if (tmpPgw instanceof ParallelGateway) {
							ParallelGateway pgw = (ParallelGateway) tmpPgw;
							if (tmp_sf2f1 instanceof SF2F) {
								SF2F _sf2f1 = (SF2F) tmp_sf2f1;
								return new Object[] { node, process, flow, sf1,
										pgw, _sf2f1, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_1_1_blackBBBBBBBFB(
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, ParallelGateway pgw, SF2F _sf2f1,
			ParallelGateway2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch) {
		if (!node.equals(pgw)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { node, process, flow, sf1, pgw,
							_sf2f1, _this, csp, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_1_1_bindingAndBlackFFFFFFBFB(
			ParallelGateway2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_1_1_binding = pattern_ParallelGateway2ParallelStepAfterPG_1_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_1_1_binding != null) {
			ParallelGateway node = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepAfterPG_1_1_binding[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_ParallelGateway2ParallelStepAfterPG_1_1_binding[1];
			BasicFlow flow = (BasicFlow) result_pattern_ParallelGateway2ParallelStepAfterPG_1_1_binding[2];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepAfterPG_1_1_binding[3];
			ParallelGateway pgw = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepAfterPG_1_1_binding[4];
			SF2F _sf2f1 = (SF2F) result_pattern_ParallelGateway2ParallelStepAfterPG_1_1_binding[5];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_1_1_black = pattern_ParallelGateway2ParallelStepAfterPG_1_1_blackBBBBBBBFB(
					node, process, flow, sf1, pgw, _sf2f1, _this,
					isApplicableMatch);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterPG_1_1_black[7];

				return new Object[] { node, process, flow, sf1, pgw, _sf2f1,
						_this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_1_1_greenBBFF(
			BasicFlow flow, ParallelGateway pgw) {
		ParallelStep step = SimpleUseCaseFactory.eINSTANCE.createParallelStep();
		PG2PS _pg2ps = Bpmn2UseCaseFactory.eINSTANCE.createPG2PS();
		flow.getSteps().add(step);
		_pg2ps.setSource(pgw);
		_pg2ps.setTarget(step);
		return new Object[] { flow, pgw, step, _pg2ps };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_1_2_blackBBB(
			ParallelGateway pgw, ParallelStep step, PG2PS _pg2ps) {
		return new Object[] { pgw, step, _pg2ps };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_1_2_greenFBBB(
			ParallelGateway pgw, ParallelStep step, PG2PS _pg2ps) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(pgw);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(_pg2ps);
		return new Object[] { ruleresult, pgw, step, _pg2ps };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_1_3_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject node, EObject process,
			EObject flow, EObject sf1, EObject pgw, EObject step,
			EObject _pg2ps, EObject _sf2f1) {
		if (!node.equals(process)) {
			if (!node.equals(sf1)) {
				if (!node.equals(pgw)) {
					if (!node.equals(step)) {
						if (!process.equals(sf1)) {
							if (!process.equals(step)) {
								if (!flow.equals(node)) {
									if (!flow.equals(process)) {
										if (!flow.equals(sf1)) {
											if (!flow.equals(pgw)) {
												if (!flow.equals(step)) {
													if (!sf1.equals(step)) {
														if (!pgw.equals(process)) {
															if (!pgw.equals(sf1)) {
																if (!pgw.equals(step)) {
																	if (!_pg2ps
																			.equals(node)) {
																		if (!_pg2ps
																				.equals(process)) {
																			if (!_pg2ps
																					.equals(flow)) {
																				if (!_pg2ps
																						.equals(sf1)) {
																					if (!_pg2ps
																							.equals(pgw)) {
																						if (!_pg2ps
																								.equals(step)) {
																							if (!_pg2ps
																									.equals(_sf2f1)) {
																								if (!_sf2f1
																										.equals(node)) {
																									if (!_sf2f1
																											.equals(process)) {
																										if (!_sf2f1
																												.equals(flow)) {
																											if (!_sf2f1
																													.equals(sf1)) {
																												if (!_sf2f1
																														.equals(pgw)) {
																													if (!_sf2f1
																															.equals(step)) {
																														return new Object[] {
																																ruleresult,
																																node,
																																process,
																																flow,
																																sf1,
																																pgw,
																																step,
																																_pg2ps,
																																_sf2f1 };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_1_3_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject flow,
			EObject sf1, EObject pgw, EObject step, EObject _pg2ps) {
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _pg2ps__pgw____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _pg2ps__step____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelGateway2ParallelStepAfterPG";
		String process__pgw____flowElements_name_prime = "flowElements";
		String flow__step____steps_name_prime = "steps";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String _pg2ps__pgw____source_name_prime = "source";
		String _pg2ps__step____target_name_prime = "target";
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		ruleresult.getTranslatedEdges().add(process__pgw____flowElements);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		sf1__pgw____targetRef.setSrc(sf1);
		sf1__pgw____targetRef.setTrg(pgw);
		ruleresult.getTranslatedEdges().add(sf1__pgw____targetRef);
		pgw__sf1____incoming.setSrc(pgw);
		pgw__sf1____incoming.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(pgw__sf1____incoming);
		_pg2ps__pgw____source.setSrc(_pg2ps);
		_pg2ps__pgw____source.setTrg(pgw);
		ruleresult.getCreatedEdges().add(_pg2ps__pgw____source);
		_pg2ps__step____target.setSrc(_pg2ps);
		_pg2ps__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(_pg2ps__step____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__pgw____flowElements
				.setName(process__pgw____flowElements_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		_pg2ps__pgw____source.setName(_pg2ps__pgw____source_name_prime);
		_pg2ps__step____target.setName(_pg2ps__step____target_name_prime);
		return new Object[] { ruleresult, process, flow, sf1, pgw, step,
				_pg2ps, process__pgw____flowElements, flow__step____steps,
				sf1__pgw____targetRef, pgw__sf1____incoming,
				_pg2ps__pgw____source, _pg2ps__step____target };
	}

	public static final void pattern_ParallelGateway2ParallelStepAfterPG_1_5_expressionBBBBBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this,
			PerformRuleResult ruleresult, EObject node, EObject process,
			EObject flow, EObject sf1, EObject pgw, EObject step,
			EObject _pg2ps, EObject _sf2f1) {
		_this.registerObjects_FWD(ruleresult, node, process, flow, sf1, pgw,
				step, _pg2ps, _sf2f1);

	}

	public static final PerformRuleResult pattern_ParallelGateway2ParallelStepAfterPG_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_2_1_bindingFB(
			ParallelGateway2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_2_1_blackFBB(
			EClass eClass, ParallelGateway2ParallelStepAfterPG _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_2_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterPG _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_2_1_binding = pattern_ParallelGateway2ParallelStepAfterPG_2_1_bindingFB(_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterPG_2_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_2_1_black = pattern_ParallelGateway2ParallelStepAfterPG_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterPG_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelGateway2ParallelStepAfterPG";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_2_2_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("node");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("sf1");
		EObject _localVariable_3 = match.getObject("pgw");
		EObject tmpNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpSf1 = _localVariable_2;
		EObject tmpPgw = _localVariable_3;
		if (tmpNode instanceof ParallelGateway) {
			ParallelGateway node = (ParallelGateway) tmpNode;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpSf1 instanceof SequenceFlow) {
					SequenceFlow sf1 = (SequenceFlow) tmpSf1;
					if (tmpPgw instanceof ParallelGateway) {
						ParallelGateway pgw = (ParallelGateway) tmpPgw;
						return new Object[] { node, process, sf1, pgw, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterPG_2_2_blackBBFBBFB(
			ParallelGateway node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!node.equals(pgw)) {
			boolean nodeisDiverging = node.isIsDiverging();
			if (Boolean.valueOf(nodeisDiverging).equals(Boolean.valueOf(true))) {
				boolean pgwisDiverging = pgw.isIsDiverging();
				if (Boolean.valueOf(pgwisDiverging).equals(
						Boolean.valueOf(true))) {
					for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, SF2F.class,
									"source")) {
						Flow tmpFlow = _sf2f1.getTarget();
						if (tmpFlow instanceof BasicFlow) {
							BasicFlow flow = (BasicFlow) tmpFlow;
							_result.add(new Object[] { node, process, flow,
									sf1, pgw, _sf2f1, match });
						}

					}
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterPG_2_3_blackBBBBBB(
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, ParallelGateway pgw, SF2F _sf2f1) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!node.equals(pgw)) {
			if (process.getFlowElements().contains(pgw)) {
				if (process.getFlowElements().contains(sf1)) {
					if (process.getFlowElements().contains(node)) {
						if (pgw.equals(sf1.getTargetRef())) {
							if (sf1.equals(_sf2f1.getSource())) {
								if (flow.equals(_sf2f1.getTarget())) {
									if (node.equals(sf1.getSourceRef())) {
										boolean nodeisDiverging = node
												.isIsDiverging();
										if (Boolean.valueOf(nodeisDiverging)
												.equals(Boolean.valueOf(true))) {
											boolean pgwisDiverging = pgw
													.isIsDiverging();
											if (Boolean.valueOf(pgwisDiverging)
													.equals(Boolean
															.valueOf(true))) {
												_result.add(new Object[] {
														node, process, flow,
														sf1, pgw, _sf2f1 });
											}

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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_2_3_greenBBBBBBFFFFFFFFFF(
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, ParallelGateway pgw, SF2F _sf2f1) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _sf2f1__sf1____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _sf2f1__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__node____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge node__sf1____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String _sf2f1__sf1____source_name_prime = "source";
		String _sf2f1__flow____target_name_prime = "target";
		String sf1__node____sourceRef_name_prime = "sourceRef";
		String node__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(_sf2f1);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(
				process__pgw____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(
				process__sf1____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		isApplicableMatch.getAllContextElements().add(
				process__node____flowElements);
		sf1__pgw____targetRef.setSrc(sf1);
		sf1__pgw____targetRef.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(sf1__pgw____targetRef);
		pgw__sf1____incoming.setSrc(pgw);
		pgw__sf1____incoming.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(pgw__sf1____incoming);
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
		process__pgw____flowElements
				.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements
				.setName(process__sf1____flowElements_name_prime);
		process__node____flowElements
				.setName(process__node____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		_sf2f1__sf1____source.setName(_sf2f1__sf1____source_name_prime);
		_sf2f1__flow____target.setName(_sf2f1__flow____target_name_prime);
		sf1__node____sourceRef.setName(sf1__node____sourceRef_name_prime);
		node__sf1____outgoing.setName(node__sf1____outgoing_name_prime);
		return new Object[] { node, process, flow, sf1, pgw, _sf2f1,
				isApplicableMatch, process__pgw____flowElements,
				process__sf1____flowElements, process__node____flowElements,
				sf1__pgw____targetRef, pgw__sf1____incoming,
				_sf2f1__sf1____source, _sf2f1__flow____target,
				sf1__node____sourceRef, node__sf1____outgoing };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_2_4_bindingFBBBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch, ParallelGateway node,
			SimpleBPMN.Process process, BasicFlow flow, SequenceFlow sf1,
			ParallelGateway pgw, SF2F _sf2f1) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, node, process, flow, sf1, pgw, _sf2f1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, node, process,
					flow, sf1, pgw, _sf2f1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_2_4_bindingAndBlackFBBBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch, ParallelGateway node,
			SimpleBPMN.Process process, BasicFlow flow, SequenceFlow sf1,
			ParallelGateway pgw, SF2F _sf2f1) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_2_4_binding = pattern_ParallelGateway2ParallelStepAfterPG_2_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, node, process, flow, sf1, pgw, _sf2f1);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterPG_2_4_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_2_4_black = pattern_ParallelGateway2ParallelStepAfterPG_2_4_blackB(csp);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, node,
						process, flow, sf1, pgw, _sf2f1 };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_2_5_expressionFBB(
			ParallelGateway2ParallelStepAfterPG _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelGateway2ParallelStepAfterPG";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelGateway2ParallelStepAfterPG_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_10_1_blackBBBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match,
			BasicFlow flow, ParallelStep step) {
		return new Object[] { _this, match, flow, step };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_10_2_bindingFBBBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match,
			BasicFlow flow, ParallelStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, flow,
				step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_10_2_bindingAndBlackFBBBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match,
			BasicFlow flow, ParallelStep step) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_10_2_binding = pattern_ParallelGateway2ParallelStepAfterPG_10_2_bindingFBBBB(
				_this, match, flow, step);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterPG_10_2_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_10_2_black = pattern_ParallelGateway2ParallelStepAfterPG_10_2_blackB(csp);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_10_2_black != null) {

				return new Object[] { csp, _this, match, flow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_10_3_expressionFBB(
			ParallelGateway2ParallelStepAfterPG _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_10_4_blackBBB(
			Match match, BasicFlow flow, ParallelStep step) {
		return new Object[] { match, flow, step };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_10_4_greenBBBF(
			Match match, BasicFlow flow, ParallelStep step) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String flow__step____steps_name_prime = "steps";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, flow, step, flow__step____steps };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_10_5_blackBBB(
			Match match, BasicFlow flow, ParallelStep step) {
		return new Object[] { match, flow, step };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_10_5_greenBB(
			Match match, BasicFlow flow) {
		match.getContextNodes().add(flow);
		return new Object[] { match, flow };
	}

	public static final void pattern_ParallelGateway2ParallelStepAfterPG_10_6_expressionBBBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match,
			BasicFlow flow, ParallelStep step) {
		_this.registerObjectsToMatch_BWD(match, flow, step);

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_11_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("node");
		EObject _localVariable_1 = isApplicableMatch.getObject("process");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_4 = isApplicableMatch.getObject("step");
		EObject _localVariable_5 = isApplicableMatch.getObject("_sf2f1");
		EObject tmpNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpSf1 = _localVariable_3;
		EObject tmpStep = _localVariable_4;
		EObject tmp_sf2f1 = _localVariable_5;
		if (tmpNode instanceof ParallelGateway) {
			ParallelGateway node = (ParallelGateway) tmpNode;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpFlow instanceof BasicFlow) {
					BasicFlow flow = (BasicFlow) tmpFlow;
					if (tmpSf1 instanceof SequenceFlow) {
						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
						if (tmpStep instanceof ParallelStep) {
							ParallelStep step = (ParallelStep) tmpStep;
							if (tmp_sf2f1 instanceof SF2F) {
								SF2F _sf2f1 = (SF2F) tmp_sf2f1;
								return new Object[] { node, process, flow, sf1,
										step, _sf2f1, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_11_1_blackBBBBBBBFB(
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, ParallelStep step, SF2F _sf2f1,
			ParallelGateway2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { node, process, flow, sf1, step, _sf2f1,
						_this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_11_1_bindingAndBlackFFFFFFBFB(
			ParallelGateway2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_11_1_binding = pattern_ParallelGateway2ParallelStepAfterPG_11_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_11_1_binding != null) {
			ParallelGateway node = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepAfterPG_11_1_binding[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_ParallelGateway2ParallelStepAfterPG_11_1_binding[1];
			BasicFlow flow = (BasicFlow) result_pattern_ParallelGateway2ParallelStepAfterPG_11_1_binding[2];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepAfterPG_11_1_binding[3];
			ParallelStep step = (ParallelStep) result_pattern_ParallelGateway2ParallelStepAfterPG_11_1_binding[4];
			SF2F _sf2f1 = (SF2F) result_pattern_ParallelGateway2ParallelStepAfterPG_11_1_binding[5];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_11_1_black = pattern_ParallelGateway2ParallelStepAfterPG_11_1_blackBBBBBBBFB(
					node, process, flow, sf1, step, _sf2f1, _this,
					isApplicableMatch);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterPG_11_1_black[7];

				return new Object[] { node, process, flow, sf1, step, _sf2f1,
						_this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_11_1_greenBBFBF(
			SimpleBPMN.Process process, SequenceFlow sf1, ParallelStep step) {
		ParallelGateway pgw = SimpleBPMNFactory.eINSTANCE
				.createParallelGateway();
		PG2PS _pg2ps = Bpmn2UseCaseFactory.eINSTANCE.createPG2PS();
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		process.getFlowElements().add(pgw);
		sf1.setTargetRef(pgw);
		_pg2ps.setSource(pgw);
		_pg2ps.setTarget(step);
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		return new Object[] { process, sf1, pgw, step, _pg2ps };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_11_2_blackBBB(
			ParallelGateway pgw, ParallelStep step, PG2PS _pg2ps) {
		return new Object[] { pgw, step, _pg2ps };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_11_2_greenFBBB(
			ParallelGateway pgw, ParallelStep step, PG2PS _pg2ps) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(pgw);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(_pg2ps);
		return new Object[] { ruleresult, pgw, step, _pg2ps };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_11_3_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject node, EObject process,
			EObject flow, EObject sf1, EObject pgw, EObject step,
			EObject _pg2ps, EObject _sf2f1) {
		if (!node.equals(process)) {
			if (!node.equals(sf1)) {
				if (!node.equals(pgw)) {
					if (!node.equals(step)) {
						if (!process.equals(sf1)) {
							if (!process.equals(step)) {
								if (!flow.equals(node)) {
									if (!flow.equals(process)) {
										if (!flow.equals(sf1)) {
											if (!flow.equals(pgw)) {
												if (!flow.equals(step)) {
													if (!sf1.equals(step)) {
														if (!pgw.equals(process)) {
															if (!pgw.equals(sf1)) {
																if (!pgw.equals(step)) {
																	if (!_pg2ps
																			.equals(node)) {
																		if (!_pg2ps
																				.equals(process)) {
																			if (!_pg2ps
																					.equals(flow)) {
																				if (!_pg2ps
																						.equals(sf1)) {
																					if (!_pg2ps
																							.equals(pgw)) {
																						if (!_pg2ps
																								.equals(step)) {
																							if (!_pg2ps
																									.equals(_sf2f1)) {
																								if (!_sf2f1
																										.equals(node)) {
																									if (!_sf2f1
																											.equals(process)) {
																										if (!_sf2f1
																												.equals(flow)) {
																											if (!_sf2f1
																													.equals(sf1)) {
																												if (!_sf2f1
																														.equals(pgw)) {
																													if (!_sf2f1
																															.equals(step)) {
																														return new Object[] {
																																ruleresult,
																																node,
																																process,
																																flow,
																																sf1,
																																pgw,
																																step,
																																_pg2ps,
																																_sf2f1 };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_11_3_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject flow,
			EObject sf1, EObject pgw, EObject step, EObject _pg2ps) {
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _pg2ps__pgw____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _pg2ps__step____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParallelGateway2ParallelStepAfterPG";
		String process__pgw____flowElements_name_prime = "flowElements";
		String flow__step____steps_name_prime = "steps";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String _pg2ps__pgw____source_name_prime = "source";
		String _pg2ps__step____target_name_prime = "target";
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		ruleresult.getCreatedEdges().add(process__pgw____flowElements);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		sf1__pgw____targetRef.setSrc(sf1);
		sf1__pgw____targetRef.setTrg(pgw);
		ruleresult.getCreatedEdges().add(sf1__pgw____targetRef);
		pgw__sf1____incoming.setSrc(pgw);
		pgw__sf1____incoming.setTrg(sf1);
		ruleresult.getCreatedEdges().add(pgw__sf1____incoming);
		_pg2ps__pgw____source.setSrc(_pg2ps);
		_pg2ps__pgw____source.setTrg(pgw);
		ruleresult.getCreatedEdges().add(_pg2ps__pgw____source);
		_pg2ps__step____target.setSrc(_pg2ps);
		_pg2ps__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(_pg2ps__step____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__pgw____flowElements
				.setName(process__pgw____flowElements_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		_pg2ps__pgw____source.setName(_pg2ps__pgw____source_name_prime);
		_pg2ps__step____target.setName(_pg2ps__step____target_name_prime);
		return new Object[] { ruleresult, process, flow, sf1, pgw, step,
				_pg2ps, process__pgw____flowElements, flow__step____steps,
				sf1__pgw____targetRef, pgw__sf1____incoming,
				_pg2ps__pgw____source, _pg2ps__step____target };
	}

	public static final void pattern_ParallelGateway2ParallelStepAfterPG_11_5_expressionBBBBBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this,
			PerformRuleResult ruleresult, EObject node, EObject process,
			EObject flow, EObject sf1, EObject pgw, EObject step,
			EObject _pg2ps, EObject _sf2f1) {
		_this.registerObjects_BWD(ruleresult, node, process, flow, sf1, pgw,
				step, _pg2ps, _sf2f1);

	}

	public static final PerformRuleResult pattern_ParallelGateway2ParallelStepAfterPG_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_12_1_bindingFB(
			ParallelGateway2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_12_1_blackFBB(
			EClass eClass, ParallelGateway2ParallelStepAfterPG _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_12_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterPG _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_12_1_binding = pattern_ParallelGateway2ParallelStepAfterPG_12_1_bindingFB(_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterPG_12_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_12_1_black = pattern_ParallelGateway2ParallelStepAfterPG_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterPG_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ParallelGateway2ParallelStepAfterPG";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_12_2_bindingFFB(
			Match match) {
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

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterPG_12_2_blackBFBFB(
			BasicFlow flow, ParallelStep step, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(flow, SF2F.class, "target")) {
			SequenceFlow sf1 = _sf2f1.getSource();
			if (sf1 != null) {
				_result.add(new Object[] { flow, sf1, step, _sf2f1, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterPG_12_3_blackFFBBBB(
			BasicFlow flow, SequenceFlow sf1, ParallelStep step, SF2F _sf2f1) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (flow.getSteps().contains(step)) {
			if (sf1.equals(_sf2f1.getSource())) {
				if (flow.equals(_sf2f1.getTarget())) {
					FlowNode tmpNode = sf1.getSourceRef();
					if (tmpNode instanceof ParallelGateway) {
						ParallelGateway node = (ParallelGateway) tmpNode;
						boolean nodeisDiverging = node.isIsDiverging();
						if (Boolean.valueOf(nodeisDiverging).equals(
								Boolean.valueOf(true))) {
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(sf1,
											SimpleBPMN.Process.class,
											"flowElements")) {
								if (process.getFlowElements().contains(node)) {
									_result.add(new Object[] { node, process,
											flow, sf1, step, _sf2f1 });
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_12_3_greenBBBBBBFFFFFFFF(
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, ParallelStep step, SF2F _sf2f1) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _sf2f1__sf1____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _sf2f1__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__node____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge node__sf1____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String flow__step____steps_name_prime = "steps";
		String _sf2f1__sf1____source_name_prime = "source";
		String _sf2f1__flow____target_name_prime = "target";
		String sf1__node____sourceRef_name_prime = "sourceRef";
		String node__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(_sf2f1);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(
				process__sf1____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		isApplicableMatch.getAllContextElements().add(
				process__node____flowElements);
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
		process__sf1____flowElements
				.setName(process__sf1____flowElements_name_prime);
		process__node____flowElements
				.setName(process__node____flowElements_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		_sf2f1__sf1____source.setName(_sf2f1__sf1____source_name_prime);
		_sf2f1__flow____target.setName(_sf2f1__flow____target_name_prime);
		sf1__node____sourceRef.setName(sf1__node____sourceRef_name_prime);
		node__sf1____outgoing.setName(node__sf1____outgoing_name_prime);
		return new Object[] { node, process, flow, sf1, step, _sf2f1,
				isApplicableMatch, process__sf1____flowElements,
				process__node____flowElements, flow__step____steps,
				_sf2f1__sf1____source, _sf2f1__flow____target,
				sf1__node____sourceRef, node__sf1____outgoing };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_12_4_bindingFBBBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch, ParallelGateway node,
			SimpleBPMN.Process process, BasicFlow flow, SequenceFlow sf1,
			ParallelStep step, SF2F _sf2f1) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, node, process, flow, sf1, step, _sf2f1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, node, process,
					flow, sf1, step, _sf2f1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_12_4_bindingAndBlackFBBBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch, ParallelGateway node,
			SimpleBPMN.Process process, BasicFlow flow, SequenceFlow sf1,
			ParallelStep step, SF2F _sf2f1) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_12_4_binding = pattern_ParallelGateway2ParallelStepAfterPG_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, node, process, flow, sf1, step,
				_sf2f1);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterPG_12_4_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_12_4_black = pattern_ParallelGateway2ParallelStepAfterPG_12_4_blackB(csp);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, node,
						process, flow, sf1, step, _sf2f1 };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_12_5_expressionFBB(
			ParallelGateway2ParallelStepAfterPG _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelGateway2ParallelStepAfterPG";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelGateway2ParallelStepAfterPG_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_20_1_bindingFB(
			ParallelGateway2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_20_1_blackFBB(
			EClass __eClass, ParallelGateway2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_20_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterPG _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_20_1_binding = pattern_ParallelGateway2ParallelStepAfterPG_20_1_bindingFB(_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterPG_20_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_20_1_black = pattern_ParallelGateway2ParallelStepAfterPG_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterPG_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterPG_20_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpPgw = _edge_flowElements.getTrg();
			if (tmpPgw instanceof ParallelGateway) {
				ParallelGateway pgw = (ParallelGateway) tmpPgw;
				if (process.getFlowElements().contains(pgw)) {
					boolean pgwisDiverging = pgw.isIsDiverging();
					if (Boolean.valueOf(pgwisDiverging).equals(
							Boolean.valueOf(true))) {
						for (FlowElement tmpSf1 : process.getFlowElements()) {
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (pgw.equals(sf1.getTargetRef())) {
									FlowNode tmpNode = sf1.getSourceRef();
									if (tmpNode instanceof ParallelGateway) {
										ParallelGateway node = (ParallelGateway) tmpNode;
										if (!node.equals(pgw)) {
											if (process.getFlowElements()
													.contains(node)) {
												boolean nodeisDiverging = node
														.isIsDiverging();
												if (Boolean.valueOf(
														nodeisDiverging)
														.equals(Boolean
																.valueOf(true))) {
													_result.add(new Object[] {
															node, process, sf1,
															pgw,
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

		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_20_3_expressionFBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match,
			ParallelGateway node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node,
				process, sf1, pgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_20_4_expressionFBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterPG_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_21_1_bindingFB(
			ParallelGateway2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_21_1_blackFBB(
			EClass __eClass, ParallelGateway2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_21_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterPG _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_21_1_binding = pattern_ParallelGateway2ParallelStepAfterPG_21_1_bindingFB(_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterPG_21_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_21_1_black = pattern_ParallelGateway2ParallelStepAfterPG_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterPG_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterPG_21_2_blackFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof BasicFlow) {
			BasicFlow flow = (BasicFlow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					_result.add(new Object[] { flow, step, _edge_steps });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_21_3_expressionFBBBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match,
			BasicFlow flow, ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_21_4_expressionFBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterPG_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_22_1_bindingFB(
			ParallelGateway2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_22_1_blackFBB(
			EClass __eClass, ParallelGateway2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_22_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterPG _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_22_1_binding = pattern_ParallelGateway2ParallelStepAfterPG_22_1_bindingFB(_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterPG_22_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_22_1_black = pattern_ParallelGateway2ParallelStepAfterPG_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterPG_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterPG_22_2_blackFFFFB(
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
					if (tmpNode instanceof ParallelGateway) {
						ParallelGateway node = (ParallelGateway) tmpNode;
						if (!node.equals(pgw)) {
							boolean pgwisDiverging = pgw.isIsDiverging();
							if (Boolean.valueOf(pgwisDiverging).equals(
									Boolean.valueOf(true))) {
								boolean nodeisDiverging = node.isIsDiverging();
								if (Boolean.valueOf(nodeisDiverging).equals(
										Boolean.valueOf(true))) {
									for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(sf1,
													SimpleBPMN.Process.class,
													"flowElements")) {
										if (process.getFlowElements().contains(
												pgw)) {
											if (process.getFlowElements()
													.contains(node)) {
												_result.add(new Object[] {
														node, process, sf1,
														pgw, _edge_targetRef });
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_22_3_expressionFBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match,
			ParallelGateway node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node,
				process, sf1, pgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_22_4_expressionFBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterPG_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_23_1_bindingFB(
			ParallelGateway2ParallelStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_23_1_blackFBB(
			EClass __eClass, ParallelGateway2ParallelStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_23_1_bindingAndBlackFFB(
			ParallelGateway2ParallelStepAfterPG _this) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_23_1_binding = pattern_ParallelGateway2ParallelStepAfterPG_23_1_bindingFB(_this);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParallelGateway2ParallelStepAfterPG_23_1_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_23_1_black = pattern_ParallelGateway2ParallelStepAfterPG_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParallelGateway2ParallelStepAfterPG_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterPG_23_2_blackFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPgw = _edge_incoming.getSrc();
		if (tmpPgw instanceof ParallelGateway) {
			ParallelGateway pgw = (ParallelGateway) tmpPgw;
			EObject tmpSf1 = _edge_incoming.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (pgw.equals(sf1.getTargetRef())) {
					boolean pgwisDiverging = pgw.isIsDiverging();
					if (Boolean.valueOf(pgwisDiverging).equals(
							Boolean.valueOf(true))) {
						FlowNode tmpNode = sf1.getSourceRef();
						if (tmpNode instanceof ParallelGateway) {
							ParallelGateway node = (ParallelGateway) tmpNode;
							if (!node.equals(pgw)) {
								boolean nodeisDiverging = node.isIsDiverging();
								if (Boolean.valueOf(nodeisDiverging).equals(
										Boolean.valueOf(true))) {
									for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(pgw,
													SimpleBPMN.Process.class,
													"flowElements")) {
										if (process.getFlowElements().contains(
												sf1)) {
											if (process.getFlowElements()
													.contains(node)) {
												_result.add(new Object[] {
														node, process, sf1,
														pgw, _edge_incoming });
											}
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_23_3_expressionFBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match,
			ParallelGateway node, SimpleBPMN.Process process, SequenceFlow sf1,
			ParallelGateway pgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node,
				process, sf1, pgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_23_4_expressionFBB(
			ParallelGateway2ParallelStepAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ParallelGateway2ParallelStepAfterPG_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_26_1_blackB(
			ParallelGateway2ParallelStepAfterPG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_26_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_26_2_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("node");
		EObject _localVariable_1 = sourceMatch.getObject("process");
		EObject _localVariable_2 = targetMatch.getObject("flow");
		EObject _localVariable_3 = sourceMatch.getObject("sf1");
		EObject _localVariable_4 = sourceMatch.getObject("pgw");
		EObject _localVariable_5 = targetMatch.getObject("step");
		EObject tmpNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpSf1 = _localVariable_3;
		EObject tmpPgw = _localVariable_4;
		EObject tmpStep = _localVariable_5;
		if (tmpNode instanceof ParallelGateway) {
			ParallelGateway node = (ParallelGateway) tmpNode;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpFlow instanceof BasicFlow) {
					BasicFlow flow = (BasicFlow) tmpFlow;
					if (tmpSf1 instanceof SequenceFlow) {
						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
						if (tmpPgw instanceof ParallelGateway) {
							ParallelGateway pgw = (ParallelGateway) tmpPgw;
							if (tmpStep instanceof ParallelStep) {
								ParallelStep step = (ParallelStep) tmpStep;
								return new Object[] { node, process, flow, sf1,
										pgw, step, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterPG_26_2_blackBBBBBBFBB(
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, ParallelGateway pgw, ParallelStep step,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!node.equals(pgw)) {
			if (!sourceMatch.equals(targetMatch)) {
				if (process.getFlowElements().contains(pgw)) {
					if (process.getFlowElements().contains(sf1)) {
						if (process.getFlowElements().contains(node)) {
							if (flow.getSteps().contains(step)) {
								if (pgw.equals(sf1.getTargetRef())) {
									if (node.equals(sf1.getSourceRef())) {
										boolean nodeisDiverging = node
												.isIsDiverging();
										if (Boolean.valueOf(nodeisDiverging)
												.equals(Boolean.valueOf(true))) {
											boolean pgwisDiverging = pgw
													.isIsDiverging();
											if (Boolean.valueOf(pgwisDiverging)
													.equals(Boolean
															.valueOf(true))) {
												for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																sf1,
																SF2F.class,
																"source")) {
													if (flow.equals(_sf2f1
															.getTarget())) {
														_result.add(new Object[] {
																node, process,
																flow, sf1, pgw,
																step, _sf2f1,
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
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_26_2_greenBBBBBBBBFB(
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, ParallelGateway pgw, ParallelStep step,
			SF2F _sf2f1, Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "ParallelGateway2ParallelStepAfterPG";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(_sf2f1);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { node, process, flow, sf1, pgw, step, _sf2f1,
				sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_26_3_bindingFBBBBBBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this,
			IsApplicableMatchCC isApplicableMatch, ParallelGateway node,
			SimpleBPMN.Process process, BasicFlow flow, SequenceFlow sf1,
			ParallelGateway pgw, ParallelStep step, SF2F _sf2f1,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(
				isApplicableMatch, node, process, flow, sf1, pgw, step, _sf2f1,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, node, process,
					flow, sf1, pgw, step, _sf2f1, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_26_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_26_3_bindingAndBlackFBBBBBBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this,
			IsApplicableMatchCC isApplicableMatch, ParallelGateway node,
			SimpleBPMN.Process process, BasicFlow flow, SequenceFlow sf1,
			ParallelGateway pgw, ParallelStep step, SF2F _sf2f1,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_26_3_binding = pattern_ParallelGateway2ParallelStepAfterPG_26_3_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, node, process, flow, sf1, pgw, step,
				_sf2f1, sourceMatch, targetMatch);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_26_3_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterPG_26_3_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_26_3_black = pattern_ParallelGateway2ParallelStepAfterPG_26_3_blackB(csp);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_26_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, node,
						process, flow, sf1, pgw, step, _sf2f1, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_26_4_blackBB(
			IsApplicableRuleResult result, IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_26_4_greenBB(
			IsApplicableRuleResult result, IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParallelGateway2ParallelStepAfterPG";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParallelGateway2ParallelStepAfterPG_26_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_29_1_blackB(
			ParallelGateway2ParallelStepAfterPG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_29_2_bindingFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("node");
		EObject _localVariable_1 = isApplicableMatch.getObject("process");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_4 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_5 = isApplicableMatch.getObject("step");
		EObject _localVariable_6 = isApplicableMatch.getObject("_sf2f1");
		EObject tmpNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpSf1 = _localVariable_3;
		EObject tmpPgw = _localVariable_4;
		EObject tmpStep = _localVariable_5;
		EObject tmp_sf2f1 = _localVariable_6;
		if (tmpNode instanceof ParallelGateway) {
			ParallelGateway node = (ParallelGateway) tmpNode;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpFlow instanceof BasicFlow) {
					BasicFlow flow = (BasicFlow) tmpFlow;
					if (tmpSf1 instanceof SequenceFlow) {
						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
						if (tmpPgw instanceof ParallelGateway) {
							ParallelGateway pgw = (ParallelGateway) tmpPgw;
							if (tmpStep instanceof ParallelStep) {
								ParallelStep step = (ParallelStep) tmpStep;
								if (tmp_sf2f1 instanceof SF2F) {
									SF2F _sf2f1 = (SF2F) tmp_sf2f1;
									return new Object[] { node, process, flow,
											sf1, pgw, step, _sf2f1,
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

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_29_2_blackBBBBBBBB(
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, ParallelGateway pgw, ParallelStep step,
			SF2F _sf2f1, IsApplicableMatchCC isApplicableMatch) {
		if (!node.equals(pgw)) {
			if (process.getFlowElements().contains(pgw)) {
				if (process.getFlowElements().contains(sf1)) {
					if (process.getFlowElements().contains(node)) {
						if (flow.getSteps().contains(step)) {
							if (pgw.equals(sf1.getTargetRef())) {
								if (sf1.equals(_sf2f1.getSource())) {
									if (flow.equals(_sf2f1.getTarget())) {
										if (node.equals(sf1.getSourceRef())) {
											boolean nodeisDiverging = node
													.isIsDiverging();
											if (Boolean
													.valueOf(nodeisDiverging)
													.equals(Boolean
															.valueOf(true))) {
												boolean pgwisDiverging = pgw
														.isIsDiverging();
												if (Boolean.valueOf(
														pgwisDiverging).equals(
														Boolean.valueOf(true))) {
													return new Object[] { node,
															process, flow, sf1,
															pgw, step, _sf2f1,
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
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_29_2_bindingAndBlackFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_29_2_binding = pattern_ParallelGateway2ParallelStepAfterPG_29_2_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_29_2_binding != null) {
			ParallelGateway node = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepAfterPG_29_2_binding[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_ParallelGateway2ParallelStepAfterPG_29_2_binding[1];
			BasicFlow flow = (BasicFlow) result_pattern_ParallelGateway2ParallelStepAfterPG_29_2_binding[2];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ParallelGateway2ParallelStepAfterPG_29_2_binding[3];
			ParallelGateway pgw = (ParallelGateway) result_pattern_ParallelGateway2ParallelStepAfterPG_29_2_binding[4];
			ParallelStep step = (ParallelStep) result_pattern_ParallelGateway2ParallelStepAfterPG_29_2_binding[5];
			SF2F _sf2f1 = (SF2F) result_pattern_ParallelGateway2ParallelStepAfterPG_29_2_binding[6];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_29_2_black = pattern_ParallelGateway2ParallelStepAfterPG_29_2_blackBBBBBBBB(
					node, process, flow, sf1, pgw, step, _sf2f1,
					isApplicableMatch);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_29_2_black != null) {

				return new Object[] { node, process, flow, sf1, pgw, step,
						_sf2f1, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_29_2_greenBBFF(
			ParallelGateway pgw, ParallelStep step) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		PG2PS _pg2ps = Bpmn2UseCaseFactory.eINSTANCE.createPG2PS();
		result.getCreatedElements().add(_pg2ps);
		_pg2ps.setSource(pgw);
		_pg2ps.setTarget(step);
		return new Object[] { pgw, step, result, _pg2ps };
	}

	public static final PerformRuleResult pattern_ParallelGateway2ParallelStepAfterPG_29_3_expressionFB(
			PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_1_blackB(
			ParallelGateway2ParallelStepAfterPG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ParallelGateway node) {
		if (ruleResult.getSourceObjects().contains(node)) {
			return new Object[] { ruleResult, node };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow sf1) {
		if (ruleResult.getSourceObjects().contains(sf1)) {
			return new Object[] { ruleResult, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, SF2F _sf2f1) {
		if (ruleResult.getCorrObjects().contains(_sf2f1)) {
			return new Object[] { ruleResult, _sf2f1 };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, BasicFlow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParallelGateway2ParallelStepAfterPG_30_2_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
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
							if (tmpNode instanceof ParallelGateway) {
								ParallelGateway node = (ParallelGateway) tmpNode;
								boolean nodeisDiverging = node.isIsDiverging();
								if (Boolean.valueOf(nodeisDiverging).equals(
										Boolean.valueOf(true))) {
									if (pattern_ParallelGateway2ParallelStepAfterPG_30_2_black_nac_3BB(
											ruleResult, _sf2f1) == null) {
										if (pattern_ParallelGateway2ParallelStepAfterPG_30_2_black_nac_2BB(
												ruleResult, sf1) == null) {
											if (pattern_ParallelGateway2ParallelStepAfterPG_30_2_black_nac_4BB(
													ruleResult, flow) == null) {
												if (pattern_ParallelGateway2ParallelStepAfterPG_30_2_black_nac_0BB(
														ruleResult, node) == null) {
													for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(
																	sf1,
																	SimpleBPMN.Process.class,
																	"flowElements")) {
														if (process
																.getFlowElements()
																.contains(node)) {
															if (pattern_ParallelGateway2ParallelStepAfterPG_30_2_black_nac_1BB(
																	ruleResult,
																	process) == null) {
																_result.add(new Object[] {
																		_sf2f1List,
																		node,
																		process,
																		sf1,
																		_sf2f1,
																		flow,
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
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_3_bindingFBBBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch, ParallelGateway node,
			SimpleBPMN.Process process, BasicFlow flow, SequenceFlow sf1,
			SF2F _sf2f1, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this
				.generateModel_solveCsp_BWD(isApplicableMatch, node, process,
						flow, sf1, _sf2f1, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, node, process,
					flow, sf1, _sf2f1, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_3_bindingAndBlackFBBBBBBBB(
			ParallelGateway2ParallelStepAfterPG _this,
			IsApplicableMatch isApplicableMatch, ParallelGateway node,
			SimpleBPMN.Process process, BasicFlow flow, SequenceFlow sf1,
			SF2F _sf2f1, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_30_3_binding = pattern_ParallelGateway2ParallelStepAfterPG_30_3_bindingFBBBBBBBB(
				_this, isApplicableMatch, node, process, flow, sf1, _sf2f1,
				ruleResult);
		if (result_pattern_ParallelGateway2ParallelStepAfterPG_30_3_binding != null) {
			CSP csp = (CSP) result_pattern_ParallelGateway2ParallelStepAfterPG_30_3_binding[0];

			Object[] result_pattern_ParallelGateway2ParallelStepAfterPG_30_3_black = pattern_ParallelGateway2ParallelStepAfterPG_30_3_blackB(csp);
			if (result_pattern_ParallelGateway2ParallelStepAfterPG_30_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, node,
						process, flow, sf1, _sf2f1, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParallelGateway2ParallelStepAfterPG_30_4_expressionFBB(
			ParallelGateway2ParallelStepAfterPG _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_5_blackBBBBB(
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, SF2F _sf2f1) {
		boolean nodeisDiverging = node.isIsDiverging();
		if (Boolean.valueOf(nodeisDiverging).equals(Boolean.valueOf(true))) {
			return new Object[] { node, process, flow, sf1, _sf2f1 };
		}

		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_6_blackBBBBBB(
			ParallelGateway node, SimpleBPMN.Process process, BasicFlow flow,
			SequenceFlow sf1, SF2F _sf2f1, ModelgeneratorRuleResult ruleResult) {
		boolean nodeisDiverging = node.isIsDiverging();
		if (Boolean.valueOf(nodeisDiverging).equals(Boolean.valueOf(true))) {
			return new Object[] { node, process, flow, sf1, _sf2f1, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_ParallelGateway2ParallelStepAfterPG_30_6_greenBBBFFFB(
			SimpleBPMN.Process process, BasicFlow flow, SequenceFlow sf1,
			ModelgeneratorRuleResult ruleResult) {
		ParallelGateway pgw = SimpleBPMNFactory.eINSTANCE
				.createParallelGateway();
		ParallelStep step = SimpleUseCaseFactory.eINSTANCE.createParallelStep();
		PG2PS _pg2ps = Bpmn2UseCaseFactory.eINSTANCE.createPG2PS();
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(pgw);
		sf1.setTargetRef(pgw);
		ruleResult.getSourceObjects().add(pgw);
		flow.getSteps().add(step);
		ruleResult.getTargetObjects().add(step);
		_pg2ps.setSource(pgw);
		_pg2ps.setTarget(step);
		ruleResult.getCorrObjects().add(_pg2ps);
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, flow, sf1, pgw, step, _pg2ps, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ParallelGateway2ParallelStepAfterPG_30_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelGateway2ParallelStepAfterPGImpl
