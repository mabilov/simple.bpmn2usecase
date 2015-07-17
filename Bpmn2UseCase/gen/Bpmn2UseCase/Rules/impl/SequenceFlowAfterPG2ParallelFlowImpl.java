/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.FN2S;
import Bpmn2UseCase.P2UC;

import Bpmn2UseCase.Rules.RulesPackage;
import Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow;

import Bpmn2UseCase.SF2F;

import SimpleBPMN.FlowNode;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

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
 * An implementation of the model object '<em><b>Sequence Flow After PG2 Parallel Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SequenceFlowAfterPG2ParallelFlowImpl extends AbstractRuleImpl implements SequenceFlowAfterPG2ParallelFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceFlowAfterPG2ParallelFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSequenceFlowAfterPG2ParallelFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ParallelGateway pgw, SequenceFlow sf, SimpleBPMN.Process process) {
		// initial bindings
		Object[] result1_black = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_0_1_blackBBBBB(this, match, pgw, sf, process);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[pgw] = " + pgw + ", " + "[sf] = " + sf
					+ ", " + "[process] = " + process + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_0_2_bindingAndBlackFBBBBB(this, match, pgw, sf, process);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[pgw] = " + pgw + ", " + "[sf] = " + sf + ", "
					+ "[process] = " + process + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_0_3_expressionFBB(this,
				csp)) {

			// collect elements to be translated
			Object[] result4_black = SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_0_4_blackBBBB(match, pgw, sf, process);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[pgw] = " + pgw + ", " + "[sf] = " + sf + ", "
						+ "[process] = " + process + ".");
			}
			SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_0_4_greenBBBBFFF(match, pgw,
					sf, process);
					// EMoflonEdge sf__pgw____sourceRef = (EMoflonEdge) result4_green[4];
					// EMoflonEdge pgw__sf____outgoing = (EMoflonEdge) result4_green[5];
					// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_0_5_blackBBBB(match, pgw, sf, process);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[pgw] = " + pgw + ", " + "[sf] = " + sf + ", "
						+ "[process] = " + process + ".");
			}
			SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_0_5_greenBBBF(match, pgw,
					process);
					// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_0_6_expressionBBBBB(this,
					match, pgw, sf, process);
			return SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_0_7_expressionF();
		} else {
			return SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_1_1_bindingAndBlackFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2S _pg2ps = (FN2S) result1_bindingAndBlack[0];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[1];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[2];
		SequenceFlow sf = (SequenceFlow) result1_bindingAndBlack[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[4];
		UseCase useCase = (UseCase) result1_bindingAndBlack[5];
		P2UC _p2uc = (P2UC) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_1_1_greenBBBFFB(step, sf, useCase, csp);
		ParallelFlow flow = (ParallelFlow) result1_green[3];
		SF2F _sf2pf = (SF2F) result1_green[4];

		// collect translated elements
		Object[] result2_black = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_1_2_blackBBB(sf, flow, _sf2pf);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf] = " + sf + ", " + "[flow] = " + flow + ", " + "[_sf2pf] = " + _sf2pf + ".");
		}
		Object[] result2_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_1_2_greenFBBB(sf, flow, _sf2pf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_1_3_blackBBBBBBBBBB(ruleresult, _pg2ps, pgw, step, sf,
						process, useCase, _p2uc, flow, _sf2pf);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[_pg2ps] = " + _pg2ps + ", " + "[pgw] = " + pgw + ", "
					+ "[step] = " + step + ", " + "[sf] = " + sf + ", " + "[process] = " + process + ", "
					+ "[useCase] = " + useCase + ", " + "[_p2uc] = " + _p2uc + ", " + "[flow] = " + flow + ", "
					+ "[_sf2pf] = " + _sf2pf + ".");
		}
		SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_1_3_greenBBBBBBBBFFFFFFF(
				ruleresult, pgw, step, sf, process, useCase, flow, _sf2pf);
				// EMoflonEdge sf__pgw____sourceRef = (EMoflonEdge) result3_green[8];
				// EMoflonEdge pgw__sf____outgoing = (EMoflonEdge) result3_green[9];
				// EMoflonEdge step__flow____invokedFlows = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge _sf2pf__sf____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge _sf2pf__flow____target = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_1_5_expressionBBBBBBBBBBB(this,
				ruleresult, _pg2ps, pgw, step, sf, process, useCase, _p2uc, flow, _sf2pf);
		return SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_2_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ParallelGateway pgw = (ParallelGateway) result2_binding[0];
		SequenceFlow sf = (SequenceFlow) result2_binding[1];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[2];
		for (Object[] result2_black : SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_2_2_blackFBFBBFFB(pgw, sf, process, match)) {
			FN2S _pg2ps = (FN2S) result2_black[0];
			ParallelStep step = (ParallelStep) result2_black[2];
			UseCase useCase = (UseCase) result2_black[5];
			P2UC _p2uc = (P2UC) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_2_3_blackBBBBBBB(_pg2ps, pgw, step, sf, process, useCase,
							_p2uc)) {
				Object[] result3_green = SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_2_3_greenBBBBBBBFFFFFFFFF(_pg2ps, pgw, step, sf,
								process, useCase, _p2uc);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge _pg2ps__step____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge _pg2ps__pgw____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge sf__pgw____sourceRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge pgw__sf____outgoing = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge _p2uc__process____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge _p2uc__useCase____target = (EMoflonEdge) result3_green[15];

				// solve CSP
				Object[] result4_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_2_4_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								_pg2ps, pgw, step, sf, process, useCase, _p2uc);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[_pg2ps] = " + _pg2ps + ", " + "[pgw] = " + pgw + ", " + "[step] = " + step + ", "
							+ "[sf] = " + sf + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase + ", "
							+ "[_p2uc] = " + _p2uc + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SequenceFlowAfterPG2ParallelFlowImpl
							.pattern_SequenceFlowAfterPG2ParallelFlow_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SequenceFlowAfterPG2ParallelFlowImpl
							.pattern_SequenceFlowAfterPG2ParallelFlow_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ParallelGateway pgw, SequenceFlow sf,
			SimpleBPMN.Process process) {
		match.registerObject("pgw", pgw);
		match.registerObject("sf", sf);
		match.registerObject("process", process);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ParallelGateway pgw, SequenceFlow sf,
			SimpleBPMN.Process process) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, FN2S _pg2ps, ParallelGateway pgw,
			ParallelStep step, SequenceFlow sf, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sf_id = CSPFactoryHelper.eINSTANCE.createVariable("sf.id", true, csp);
		var_sf_id.setValue(sf.getId());
		var_sf_id.setType("String");

		// Create unbound variables
		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow.id", csp);
		var_flow_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf_id, var_flow_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("_pg2ps", _pg2ps);
		isApplicableMatch.registerObject("pgw", pgw);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("sf", sf);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("_p2uc", _p2uc);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject _pg2ps, EObject pgw, EObject step, EObject sf,
			EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject _sf2pf) {
		ruleresult.registerObject("_pg2ps", _pg2ps);
		ruleresult.registerObject("pgw", pgw);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("sf", sf);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("_p2uc", _p2uc);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("_sf2pf", _sf2pf);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("sf").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, ParallelStep step, UseCase useCase, ParallelFlow flow) {
		// initial bindings
		Object[] result1_black = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_10_1_blackBBBBB(this, match, step, useCase, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[step] = " + step + ", "
					+ "[useCase] = " + useCase + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_10_2_bindingAndBlackFBBBBB(this, match, step, useCase, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[useCase] = " + useCase
					+ ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_10_3_expressionFBB(this,
				csp)) {

			// collect elements to be translated
			Object[] result4_black = SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_10_4_blackBBBB(match, step, useCase, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[useCase] = "
						+ useCase + ", " + "[flow] = " + flow + ".");
			}
			SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_10_4_greenBBBBFF(match, step,
					useCase, flow);
					// EMoflonEdge step__flow____invokedFlows = (EMoflonEdge) result4_green[4];
					// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_10_5_blackBBBB(match, step, useCase, flow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[useCase] = "
						+ useCase + ", " + "[flow] = " + flow + ".");
			}
			SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_10_5_greenBBB(match, step,
					useCase);

			// register objects to match
			SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_10_6_expressionBBBBB(this,
					match, step, useCase, flow);
			return SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_10_7_expressionF();
		} else {
			return SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_11_1_bindingAndBlackFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2S _pg2ps = (FN2S) result1_bindingAndBlack[0];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[1];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[3];
		UseCase useCase = (UseCase) result1_bindingAndBlack[4];
		P2UC _p2uc = (P2UC) result1_bindingAndBlack[5];
		ParallelFlow flow = (ParallelFlow) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_11_1_greenBFBBFB(pgw, process, flow, csp);
		SequenceFlow sf = (SequenceFlow) result1_green[1];
		SF2F _sf2pf = (SF2F) result1_green[4];

		// collect translated elements
		Object[] result2_black = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_11_2_blackBBB(sf, flow, _sf2pf);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf] = " + sf + ", " + "[flow] = " + flow + ", " + "[_sf2pf] = " + _sf2pf + ".");
		}
		Object[] result2_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_11_2_greenFBBB(sf, flow, _sf2pf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_11_3_blackBBBBBBBBBB(ruleresult, _pg2ps, pgw, step, sf,
						process, useCase, _p2uc, flow, _sf2pf);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[_pg2ps] = " + _pg2ps + ", " + "[pgw] = " + pgw + ", "
					+ "[step] = " + step + ", " + "[sf] = " + sf + ", " + "[process] = " + process + ", "
					+ "[useCase] = " + useCase + ", " + "[_p2uc] = " + _p2uc + ", " + "[flow] = " + flow + ", "
					+ "[_sf2pf] = " + _sf2pf + ".");
		}
		SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_11_3_greenBBBBBBBBFFFFFFF(
				ruleresult, pgw, step, sf, process, useCase, flow, _sf2pf);
				// EMoflonEdge sf__pgw____sourceRef = (EMoflonEdge) result3_green[8];
				// EMoflonEdge pgw__sf____outgoing = (EMoflonEdge) result3_green[9];
				// EMoflonEdge step__flow____invokedFlows = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge _sf2pf__sf____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge _sf2pf__flow____target = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_11_5_expressionBBBBBBBBBBB(this,
				ruleresult, _pg2ps, pgw, step, sf, process, useCase, _p2uc, flow, _sf2pf);
		return SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ParallelStep step = (ParallelStep) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		ParallelFlow flow = (ParallelFlow) result2_binding[2];
		for (Object[] result2_black : SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_12_2_blackFFBFBFBB(step, useCase, flow, match)) {
			FN2S _pg2ps = (FN2S) result2_black[0];
			ParallelGateway pgw = (ParallelGateway) result2_black[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[3];
			P2UC _p2uc = (P2UC) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_12_3_blackBBBBBBB(_pg2ps, pgw, step, process, useCase,
							_p2uc, flow)) {
				Object[] result3_green = SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_12_3_greenBBBBBBBFFFFFFFF(_pg2ps, pgw, step, process,
								useCase, _p2uc, flow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge _pg2ps__step____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge _pg2ps__pgw____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge step__flow____invokedFlows = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge _p2uc__process____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge _p2uc__useCase____target = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_12_4_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, _pg2ps, pgw, step, process, useCase, _p2uc, flow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[_pg2ps] = " + _pg2ps + ", " + "[pgw] = " + pgw + ", " + "[step] = " + step + ", "
							+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[_p2uc] = " + _p2uc
							+ ", " + "[flow] = " + flow + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SequenceFlowAfterPG2ParallelFlowImpl
							.pattern_SequenceFlowAfterPG2ParallelFlow_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SequenceFlowAfterPG2ParallelFlowImpl
							.pattern_SequenceFlowAfterPG2ParallelFlow_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ParallelStep step, UseCase useCase, ParallelFlow flow) {
		match.registerObject("step", step);
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ParallelStep step, UseCase useCase, ParallelFlow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FN2S _pg2ps, ParallelGateway pgw,
			ParallelStep step, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc, ParallelFlow flow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow.id", true, csp);
		var_flow_id.setValue(flow.getId());
		var_flow_id.setType("String");

		// Create unbound variables
		Variable var_sf_id = CSPFactoryHelper.eINSTANCE.createVariable("sf.id", csp);
		var_sf_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf_id, var_flow_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("_pg2ps", _pg2ps);
		isApplicableMatch.registerObject("pgw", pgw);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("_p2uc", _p2uc);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject _pg2ps, EObject pgw, EObject step, EObject sf,
			EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject _sf2pf) {
		ruleresult.registerObject("_pg2ps", _pg2ps);
		ruleresult.registerObject("pgw", pgw);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("sf", sf);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("_p2uc", _p2uc);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("_sf2pf", _sf2pf);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("flow").eClass()
				.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getParallelFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_379(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_20_2_blackFFFB(_edge_sourceRef)) {
			ParallelGateway pgw = (ParallelGateway) result2_black[0];
			SequenceFlow sf = (SequenceFlow) result2_black[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			Object[] result2_green = SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_20_3_expressionFBBBBB(this, match, pgw, sf, process)) {
				// Ensure that the correct types of elements are matched
				if (SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SequenceFlowAfterPG2ParallelFlowImpl
							.pattern_SequenceFlowAfterPG2ParallelFlow_20_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_380(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_21_2_blackFFFB(_edge_outgoing)) {
			ParallelGateway pgw = (ParallelGateway) result2_black[0];
			SequenceFlow sf = (SequenceFlow) result2_black[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			Object[] result2_green = SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_21_3_expressionFBBBBB(this, match, pgw, sf, process)) {
				// Ensure that the correct types of elements are matched
				if (SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SequenceFlowAfterPG2ParallelFlowImpl
							.pattern_SequenceFlowAfterPG2ParallelFlow_21_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_123(EMoflonEdge _edge_invokedFlows) {
		// prepare return value
		Object[] result1_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_22_2_blackFFFB(_edge_invokedFlows)) {
			ParallelStep step = (ParallelStep) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			ParallelFlow flow = (ParallelFlow) result2_black[2];
			Object[] result2_green = SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_22_3_expressionFBBBBB(this, match, step, useCase, flow)) {
				// Ensure that the correct types of elements are matched
				if (SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SequenceFlowAfterPG2ParallelFlowImpl
							.pattern_SequenceFlowAfterPG2ParallelFlow_22_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_22_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_381(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_23_2_blackFFFB(_edge_flowElements)) {
			ParallelGateway pgw = (ParallelGateway) result2_black[0];
			SequenceFlow sf = (SequenceFlow) result2_black[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			Object[] result2_green = SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_23_3_expressionFBBBBB(this, match, pgw, sf, process)) {
				// Ensure that the correct types of elements are matched
				if (SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SequenceFlowAfterPG2ParallelFlowImpl
							.pattern_SequenceFlowAfterPG2ParallelFlow_23_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_23_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_124(EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_24_2_blackFFFB(_edge_flows)) {
			ParallelStep step = (ParallelStep) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			ParallelFlow flow = (ParallelFlow) result2_black[2];
			Object[] result2_green = SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_24_3_expressionFBBBBB(this, match, step, useCase, flow)) {
				// Ensure that the correct types of elements are matched
				if (SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SequenceFlowAfterPG2ParallelFlowImpl
							.pattern_SequenceFlowAfterPG2ParallelFlow_24_5_blackBBB(match, __performOperation,
									__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_24_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SequenceFlowAfterPG2ParallelFlow");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchFor_pg2ps = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_pg2ps")).findAny();
		Bpmn2UseCase.FN2S _pg2ps = (Bpmn2UseCase.FN2S) matchFor_pg2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw")).findAny();
		SimpleBPMN.ParallelGateway pgw = (SimpleBPMN.ParallelGateway) matchForPgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ParallelStep step = (SimpleUseCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf")).findAny();
		SimpleBPMN.SequenceFlow sf = (SimpleBPMN.SequenceFlow) matchForSf.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_p2uc = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_p2uc")).findAny();
		Bpmn2UseCase.P2UC _p2uc = (Bpmn2UseCase.P2UC) matchFor_p2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.ParallelFlow flow = (SimpleUseCase.ParallelFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf2pf = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf2pf")).findAny();
		Bpmn2UseCase.SF2F _sf2pf = (Bpmn2UseCase.SF2F) matchFor_sf2pf.get().getNode();

		if (!(pgw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_sf_id = CSPFactoryHelper.eINSTANCE.createVariable("sf", true, csp);
		var_sf_id.setValue(sf.getId());
		var_sf_id.setType("String");

		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow", true, csp);
		var_flow_id.setValue(flow.getId());
		var_flow_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SequenceFlowAfterPG2ParallelFlow");
		eq0.solve(var_sf_id, var_flow_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_flow_id.setBound(false);
			eq0.solve(var_sf_id, var_flow_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				flow.setId((String) var_flow_id.getValue());
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
		ruleResult.setRule("SequenceFlowAfterPG2ParallelFlow");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchFor_pg2ps = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_pg2ps")).findAny();
		Bpmn2UseCase.FN2S _pg2ps = (Bpmn2UseCase.FN2S) matchFor_pg2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw")).findAny();
		SimpleBPMN.ParallelGateway pgw = (SimpleBPMN.ParallelGateway) matchForPgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ParallelStep step = (SimpleUseCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf")).findAny();
		SimpleBPMN.SequenceFlow sf = (SimpleBPMN.SequenceFlow) matchForSf.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_p2uc = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_p2uc")).findAny();
		Bpmn2UseCase.P2UC _p2uc = (Bpmn2UseCase.P2UC) matchFor_p2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.ParallelFlow flow = (SimpleUseCase.ParallelFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf2pf = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf2pf")).findAny();
		Bpmn2UseCase.SF2F _sf2pf = (Bpmn2UseCase.SF2F) matchFor_sf2pf.get().getNode();

		if (!(pgw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_sf_id = CSPFactoryHelper.eINSTANCE.createVariable("sf", true, csp);
		var_sf_id.setValue(sf.getId());
		var_sf_id.setType("String");

		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow", true, csp);
		var_flow_id.setValue(flow.getId());
		var_flow_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SequenceFlowAfterPG2ParallelFlow");
		eq0.solve(var_sf_id, var_flow_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_sf_id.setBound(false);
			eq0.solve(var_sf_id, var_flow_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				sf.setId((String) var_sf_id.getValue());
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
		Object[] result1_black = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_27_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_27_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_27_2_bindingFFFFFFBB(sourceMatch, targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ParallelGateway pgw = (ParallelGateway) result2_binding[0];
		ParallelStep step = (ParallelStep) result2_binding[1];
		SequenceFlow sf = (SequenceFlow) result2_binding[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[3];
		UseCase useCase = (UseCase) result2_binding[4];
		ParallelFlow flow = (ParallelFlow) result2_binding[5];
		for (Object[] result2_black : SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_27_2_blackFBBBBBFBBB(pgw, step, sf, process, useCase, flow,
						sourceMatch, targetMatch)) {
			FN2S _pg2ps = (FN2S) result2_black[0];
			P2UC _p2uc = (P2UC) result2_black[6];
			Object[] result2_green = SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_27_2_greenBBBBBBBBBFB(_pg2ps, pgw, step, sf, process,
							useCase, _p2uc, flow, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[9];

			// check csp
			Object[] result3_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_27_3_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
							_pg2ps, pgw, step, sf, process, useCase, _p2uc, flow, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_27_4_blackBB(result, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_27_4_greenBB(result,
						isApplicableMatch);

			} else {
			}

		}
		return SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_27_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, FN2S _pg2ps, ParallelGateway pgw,
			ParallelStep step, SequenceFlow sf, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			ParallelFlow flow, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sf_id = CSPFactoryHelper.eINSTANCE.createVariable("sf.id", true, csp);
		var_sf_id.setValue(sf.getId());
		var_sf_id.setType("String");
		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow.id", true, csp);
		var_flow_id.setValue(flow.getId());
		var_flow_id.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf_id, var_flow_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("_pg2ps", _pg2ps);
		isApplicableMatch.registerObject("pgw", pgw);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("sf", sf);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("_p2uc", _p2uc);
		isApplicableMatch.registerObject("flow", flow);
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
		Object[] result1_black = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_30_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_30_2_bindingAndBlackFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// FN2S _pg2ps = (FN2S) result2_bindingAndBlack[0];
		// ParallelGateway pgw = (ParallelGateway) result2_bindingAndBlack[1];
		// ParallelStep step = (ParallelStep) result2_bindingAndBlack[2];
		SequenceFlow sf = (SequenceFlow) result2_bindingAndBlack[3];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[4];
		// UseCase useCase = (UseCase) result2_bindingAndBlack[5];
		// P2UC _p2uc = (P2UC) result2_bindingAndBlack[6];
		ParallelFlow flow = (ParallelFlow) result2_bindingAndBlack[7];
		Object[] result2_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_30_2_greenBBFF(sf, flow);
		PerformRuleResult result = (PerformRuleResult) result2_green[2];
		// SF2F _sf2pf = (SF2F) result2_green[3];

		return SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_30_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, FN2S _pg2psParameter) {
		// create result
		Object[] result1_black = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_31_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_31_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_31_2_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList _pg2psList = (RuleEntryList) result2_black[0];
			FN2S _pg2ps = (FN2S) result2_black[1];
			ParallelStep step = (ParallelStep) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[4];
			P2UC _p2uc = (P2UC) result2_black[5];
			UseCase useCase = (UseCase) result2_black[6];

			// solve CSP
			Object[] result3_bindingAndBlack = SequenceFlowAfterPG2ParallelFlowImpl
					.pattern_SequenceFlowAfterPG2ParallelFlow_31_3_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							_pg2ps, pgw, step, process, useCase, _p2uc, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[_pg2ps] = " + _pg2ps
						+ ", " + "[pgw] = " + pgw + ", " + "[step] = " + step + ", " + "[process] = " + process + ", "
						+ "[useCase] = " + useCase + ", " + "[_p2uc] = " + _p2uc + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_31_4_expressionFBB(this,
					csp)) {
				// check nacs
				Object[] result5_black = SequenceFlowAfterPG2ParallelFlowImpl
						.pattern_SequenceFlowAfterPG2ParallelFlow_31_5_blackBBBBBB(_pg2ps, pgw, step, process, useCase,
								_p2uc);
				if (result5_black != null) {

					// perform
					Object[] result6_black = SequenceFlowAfterPG2ParallelFlowImpl
							.pattern_SequenceFlowAfterPG2ParallelFlow_31_6_blackBBBBBBB(_pg2ps, pgw, step, process,
									useCase, _p2uc, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[_pg2ps] = " + _pg2ps + ", " + "[pgw] = " + pgw + ", " + "[step] = " + step + ", "
								+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[_p2uc] = "
								+ _p2uc + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					SequenceFlowAfterPG2ParallelFlowImpl.pattern_SequenceFlowAfterPG2ParallelFlow_31_6_greenBBFBBFFBB(
							pgw, step, process, useCase, ruleResult, csp);
					// SequenceFlow sf = (SequenceFlow) result6_green[2];
					// ParallelFlow flow = (ParallelFlow) result6_green[5];
					// SF2F _sf2pf = (SF2F) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return SequenceFlowAfterPG2ParallelFlowImpl
				.pattern_SequenceFlowAfterPG2ParallelFlow_31_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FN2S _pg2ps, ParallelGateway pgw,
			ParallelStep step, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_sf_id = CSPFactoryHelper.eINSTANCE.createVariable("sf.id", csp);
		var_sf_id.setType("String");
		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow.id", csp);
		var_flow_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf_id, var_flow_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("_pg2ps", _pg2ps);
		isApplicableMatch.registerObject("pgw", pgw);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("_p2uc", _p2uc);
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
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS:
			return isAppropriate_FWD((Match) arguments.get(0), (ParallelGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ParallelGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3));
			return null;
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ParallelGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2S_PARALLELGATEWAY_PARALLELSTEP_SEQUENCEFLOW_PROCESS_USECASE_P2UC:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (FN2S) arguments.get(1),
					(ParallelGateway) arguments.get(2), (ParallelStep) arguments.get(3),
					(SequenceFlow) arguments.get(4), (SimpleBPMN.Process) arguments.get(5), (UseCase) arguments.get(6),
					(P2UC) arguments.get(7));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_USECASE_PARALLELFLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(UseCase) arguments.get(2), (ParallelFlow) arguments.get(3));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_USECASE_PARALLELFLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(UseCase) arguments.get(2), (ParallelFlow) arguments.get(3));
			return null;
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_USECASE_PARALLELFLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(UseCase) arguments.get(2), (ParallelFlow) arguments.get(3));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_PARALLELGATEWAY_PARALLELSTEP_PROCESS_USECASE_P2UC_PARALLELFLOW:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FN2S) arguments.get(1),
					(ParallelGateway) arguments.get(2), (ParallelStep) arguments.get(3),
					(SimpleBPMN.Process) arguments.get(4), (UseCase) arguments.get(5), (P2UC) arguments.get(6),
					(ParallelFlow) arguments.get(7));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_379__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_379((EMoflonEdge) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_380__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_380((EMoflonEdge) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_123__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_123((EMoflonEdge) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_381__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_381((EMoflonEdge) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_124__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_124((EMoflonEdge) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FN2S_PARALLELGATEWAY_PARALLELSTEP_SEQUENCEFLOW_PROCESS_USECASE_P2UC_PARALLELFLOW_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (FN2S) arguments.get(1),
					(ParallelGateway) arguments.get(2), (ParallelStep) arguments.get(3),
					(SequenceFlow) arguments.get(4), (SimpleBPMN.Process) arguments.get(5), (UseCase) arguments.get(6),
					(P2UC) arguments.get(7), (ParallelFlow) arguments.get(8), (Match) arguments.get(9),
					(Match) arguments.get(10));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S:
			return generateModel((RuleEntryContainer) arguments.get(0), (FN2S) arguments.get(1));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_PARALLELGATEWAY_PARALLELSTEP_PROCESS_USECASE_P2UC_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FN2S) arguments.get(1),
					(ParallelGateway) arguments.get(2), (ParallelStep) arguments.get(3),
					(SimpleBPMN.Process) arguments.get(4), (UseCase) arguments.get(5), (P2UC) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_0_1_blackBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelGateway pgw, SequenceFlow sf,
			SimpleBPMN.Process process) {
		return new Object[] { _this, match, pgw, sf, process };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_0_2_bindingFBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelGateway pgw, SequenceFlow sf,
			SimpleBPMN.Process process) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, pgw, sf, process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pgw, sf, process };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_0_2_bindingAndBlackFBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelGateway pgw, SequenceFlow sf,
			SimpleBPMN.Process process) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_0_2_binding = pattern_SequenceFlowAfterPG2ParallelFlow_0_2_bindingFBBBBB(
				_this, match, pgw, sf, process);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SequenceFlowAfterPG2ParallelFlow_0_2_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_0_2_black = pattern_SequenceFlowAfterPG2ParallelFlow_0_2_blackB(
					csp);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_0_2_black != null) {

				return new Object[] { csp, _this, match, pgw, sf, process };
			}
		}
		return null;
	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_0_3_expressionFBB(
			SequenceFlowAfterPG2ParallelFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_0_4_blackBBBB(Match match,
			ParallelGateway pgw, SequenceFlow sf, SimpleBPMN.Process process) {
		return new Object[] { match, pgw, sf, process };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_0_4_greenBBBBFFF(Match match,
			ParallelGateway pgw, SequenceFlow sf, SimpleBPMN.Process process) {
		EMoflonEdge sf__pgw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf);
		String sf__pgw____sourceRef_name_prime = "sourceRef";
		String pgw__sf____outgoing_name_prime = "outgoing";
		String process__sf____flowElements_name_prime = "flowElements";
		sf__pgw____sourceRef.setSrc(sf);
		sf__pgw____sourceRef.setTrg(pgw);
		match.getToBeTranslatedEdges().add(sf__pgw____sourceRef);
		pgw__sf____outgoing.setSrc(pgw);
		pgw__sf____outgoing.setTrg(sf);
		match.getToBeTranslatedEdges().add(pgw__sf____outgoing);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		match.getToBeTranslatedEdges().add(process__sf____flowElements);
		sf__pgw____sourceRef.setName(sf__pgw____sourceRef_name_prime);
		pgw__sf____outgoing.setName(pgw__sf____outgoing_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		return new Object[] { match, pgw, sf, process, sf__pgw____sourceRef, pgw__sf____outgoing,
				process__sf____flowElements };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_0_5_blackBBBB(Match match,
			ParallelGateway pgw, SequenceFlow sf, SimpleBPMN.Process process) {
		return new Object[] { match, pgw, sf, process };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_0_5_greenBBBF(Match match,
			ParallelGateway pgw, SimpleBPMN.Process process) {
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(pgw);
		match.getContextNodes().add(process);
		String process__pgw____flowElements_name_prime = "flowElements";
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		match.getContextEdges().add(process__pgw____flowElements);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		return new Object[] { match, pgw, process, process__pgw____flowElements };
	}

	public static final void pattern_SequenceFlowAfterPG2ParallelFlow_0_6_expressionBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelGateway pgw, SequenceFlow sf,
			SimpleBPMN.Process process) {
		_this.registerObjectsToMatch_FWD(match, pgw, sf, process);

	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_1_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("_pg2ps");
		EObject _localVariable_1 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_2 = isApplicableMatch.getObject("step");
		EObject _localVariable_3 = isApplicableMatch.getObject("sf");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch.getObject("_p2uc");
		EObject tmp_pg2ps = _localVariable_0;
		EObject tmpPgw = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		EObject tmpSf = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmp_p2uc = _localVariable_6;
		if (tmp_pg2ps instanceof FN2S) {
			FN2S _pg2ps = (FN2S) tmp_pg2ps;
			if (tmpPgw instanceof ParallelGateway) {
				ParallelGateway pgw = (ParallelGateway) tmpPgw;
				if (tmpStep instanceof ParallelStep) {
					ParallelStep step = (ParallelStep) tmpStep;
					if (tmpSf instanceof SequenceFlow) {
						SequenceFlow sf = (SequenceFlow) tmpSf;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmp_p2uc instanceof P2UC) {
									P2UC _p2uc = (P2UC) tmp_p2uc;
									return new Object[] { _pg2ps, pgw, step, sf, process, useCase, _p2uc,
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

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_1_1_blackBBBBBBBBFB(FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SequenceFlow sf, SimpleBPMN.Process process, UseCase useCase,
			P2UC _p2uc, SequenceFlowAfterPG2ParallelFlow _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { _pg2ps, pgw, step, sf, process, useCase, _p2uc, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_1_1_bindingAndBlackFFFFFFFBFB(
			SequenceFlowAfterPG2ParallelFlow _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_1_1_binding = pattern_SequenceFlowAfterPG2ParallelFlow_1_1_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_1_1_binding != null) {
			FN2S _pg2ps = (FN2S) result_pattern_SequenceFlowAfterPG2ParallelFlow_1_1_binding[0];
			ParallelGateway pgw = (ParallelGateway) result_pattern_SequenceFlowAfterPG2ParallelFlow_1_1_binding[1];
			ParallelStep step = (ParallelStep) result_pattern_SequenceFlowAfterPG2ParallelFlow_1_1_binding[2];
			SequenceFlow sf = (SequenceFlow) result_pattern_SequenceFlowAfterPG2ParallelFlow_1_1_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_SequenceFlowAfterPG2ParallelFlow_1_1_binding[4];
			UseCase useCase = (UseCase) result_pattern_SequenceFlowAfterPG2ParallelFlow_1_1_binding[5];
			P2UC _p2uc = (P2UC) result_pattern_SequenceFlowAfterPG2ParallelFlow_1_1_binding[6];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_1_1_black = pattern_SequenceFlowAfterPG2ParallelFlow_1_1_blackBBBBBBBBFB(
					_pg2ps, pgw, step, sf, process, useCase, _p2uc, _this, isApplicableMatch);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SequenceFlowAfterPG2ParallelFlow_1_1_black[8];

				return new Object[] { _pg2ps, pgw, step, sf, process, useCase, _p2uc, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_1_1_greenBBBFFB(ParallelStep step,
			SequenceFlow sf, UseCase useCase, CSP csp) {
		ParallelFlow flow = SimpleUseCaseFactory.eINSTANCE.createParallelFlow();
		SF2F _sf2pf = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		Object _localVariable_0 = csp.getValue("flow", "id");
		step.getInvokedFlows().add(flow);
		useCase.getFlows().add(flow);
		_sf2pf.setSource(sf);
		_sf2pf.setTarget(flow);
		String flow_id_prime = (String) _localVariable_0;
		flow.setId(flow_id_prime);
		return new Object[] { step, sf, useCase, flow, _sf2pf, csp };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_1_2_blackBBB(SequenceFlow sf,
			ParallelFlow flow, SF2F _sf2pf) {
		return new Object[] { sf, flow, _sf2pf };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_1_2_greenFBBB(SequenceFlow sf,
			ParallelFlow flow, SF2F _sf2pf) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sf);
		ruleresult.getCreatedElements().add(flow);
		ruleresult.getCreatedLinkElements().add(_sf2pf);
		return new Object[] { ruleresult, sf, flow, _sf2pf };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_1_3_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject _pg2ps, EObject pgw, EObject step, EObject sf, EObject process,
			EObject useCase, EObject _p2uc, EObject flow, EObject _sf2pf) {
		if (!_pg2ps.equals(pgw)) {
			if (!_pg2ps.equals(step)) {
				if (!_pg2ps.equals(sf)) {
					if (!_pg2ps.equals(process)) {
						if (!_pg2ps.equals(useCase)) {
							if (!_pg2ps.equals(flow)) {
								if (!_pg2ps.equals(_sf2pf)) {
									if (!pgw.equals(step)) {
										if (!pgw.equals(sf)) {
											if (!pgw.equals(process)) {
												if (!pgw.equals(useCase)) {
													if (!step.equals(useCase)) {
														if (!sf.equals(step)) {
															if (!sf.equals(useCase)) {
																if (!process.equals(step)) {
																	if (!process.equals(sf)) {
																		if (!process.equals(useCase)) {
																			if (!_p2uc.equals(_pg2ps)) {
																				if (!_p2uc.equals(pgw)) {
																					if (!_p2uc.equals(step)) {
																						if (!_p2uc.equals(sf)) {
																							if (!_p2uc
																									.equals(process)) {
																								if (!_p2uc.equals(
																										useCase)) {
																									if (!_p2uc.equals(
																											flow)) {
																										if (!_p2uc
																												.equals(_sf2pf)) {
																											if (!flow
																													.equals(pgw)) {
																												if (!flow
																														.equals(step)) {
																													if (!flow
																															.equals(sf)) {
																														if (!flow
																																.equals(process)) {
																															if (!flow
																																	.equals(useCase)) {
																																if (!_sf2pf
																																		.equals(pgw)) {
																																	if (!_sf2pf
																																			.equals(step)) {
																																		if (!_sf2pf
																																				.equals(sf)) {
																																			if (!_sf2pf
																																					.equals(process)) {
																																				if (!_sf2pf
																																						.equals(useCase)) {
																																					if (!_sf2pf
																																							.equals(flow)) {
																																						return new Object[] {
																																								ruleresult,
																																								_pg2ps,
																																								pgw,
																																								step,
																																								sf,
																																								process,
																																								useCase,
																																								_p2uc,
																																								flow,
																																								_sf2pf };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_1_3_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject pgw, EObject step, EObject sf, EObject process, EObject useCase,
			EObject flow, EObject _sf2pf) {
		EMoflonEdge sf__pgw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge step__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2pf__sf____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2pf__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SequenceFlowAfterPG2ParallelFlow";
		String sf__pgw____sourceRef_name_prime = "sourceRef";
		String pgw__sf____outgoing_name_prime = "outgoing";
		String step__flow____invokedFlows_name_prime = "invokedFlows";
		String process__sf____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String _sf2pf__sf____source_name_prime = "source";
		String _sf2pf__flow____target_name_prime = "target";
		sf__pgw____sourceRef.setSrc(sf);
		sf__pgw____sourceRef.setTrg(pgw);
		ruleresult.getTranslatedEdges().add(sf__pgw____sourceRef);
		pgw__sf____outgoing.setSrc(pgw);
		pgw__sf____outgoing.setTrg(sf);
		ruleresult.getTranslatedEdges().add(pgw__sf____outgoing);
		step__flow____invokedFlows.setSrc(step);
		step__flow____invokedFlows.setTrg(flow);
		ruleresult.getCreatedEdges().add(step__flow____invokedFlows);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		ruleresult.getTranslatedEdges().add(process__sf____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		ruleresult.getCreatedEdges().add(useCase__flow____flows);
		_sf2pf__sf____source.setSrc(_sf2pf);
		_sf2pf__sf____source.setTrg(sf);
		ruleresult.getCreatedEdges().add(_sf2pf__sf____source);
		_sf2pf__flow____target.setSrc(_sf2pf);
		_sf2pf__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(_sf2pf__flow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sf__pgw____sourceRef.setName(sf__pgw____sourceRef_name_prime);
		pgw__sf____outgoing.setName(pgw__sf____outgoing_name_prime);
		step__flow____invokedFlows.setName(step__flow____invokedFlows_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		_sf2pf__sf____source.setName(_sf2pf__sf____source_name_prime);
		_sf2pf__flow____target.setName(_sf2pf__flow____target_name_prime);
		return new Object[] { ruleresult, pgw, step, sf, process, useCase, flow, _sf2pf, sf__pgw____sourceRef,
				pgw__sf____outgoing, step__flow____invokedFlows, process__sf____flowElements, useCase__flow____flows,
				_sf2pf__sf____source, _sf2pf__flow____target };
	}

	public static final void pattern_SequenceFlowAfterPG2ParallelFlow_1_5_expressionBBBBBBBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, PerformRuleResult ruleresult, EObject _pg2ps, EObject pgw,
			EObject step, EObject sf, EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject _sf2pf) {
		_this.registerObjects_FWD(ruleresult, _pg2ps, pgw, step, sf, process, useCase, _p2uc, flow, _sf2pf);

	}

	public static final PerformRuleResult pattern_SequenceFlowAfterPG2ParallelFlow_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_2_1_bindingFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_2_1_blackFBB(EClass eClass,
			SequenceFlowAfterPG2ParallelFlow _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_2_1_bindingAndBlackFFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_2_1_binding = pattern_SequenceFlowAfterPG2ParallelFlow_2_1_bindingFB(
				_this);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SequenceFlowAfterPG2ParallelFlow_2_1_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_2_1_black = pattern_SequenceFlowAfterPG2ParallelFlow_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SequenceFlowAfterPG2ParallelFlow_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SequenceFlowAfterPG2ParallelFlow";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_2_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("pgw");
		EObject _localVariable_1 = match.getObject("sf");
		EObject _localVariable_2 = match.getObject("process");
		EObject tmpPgw = _localVariable_0;
		EObject tmpSf = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		if (tmpPgw instanceof ParallelGateway) {
			ParallelGateway pgw = (ParallelGateway) tmpPgw;
			if (tmpSf instanceof SequenceFlow) {
				SequenceFlow sf = (SequenceFlow) tmpSf;
				if (tmpProcess instanceof SimpleBPMN.Process) {
					SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
					return new Object[] { pgw, sf, process, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SequenceFlowAfterPG2ParallelFlow_2_2_blackFBFBBFFB(
			ParallelGateway pgw, SequenceFlow sf, SimpleBPMN.Process process, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean pgwisDiverging = pgw.isIsDiverging();
		if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
			for (FN2S _pg2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pgw, FN2S.class,
					"source")) {
				Step tmpStep = _pg2ps.getTarget();
				if (tmpStep instanceof ParallelStep) {
					ParallelStep step = (ParallelStep) tmpStep;
					for (P2UC _p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(process,
							P2UC.class, "source")) {
						UseCase useCase = _p2uc.getTarget();
						if (useCase != null) {
							_result.add(new Object[] { _pg2ps, pgw, step, sf, process, useCase, _p2uc, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_SequenceFlowAfterPG2ParallelFlow_2_3_blackBBBBBBB(FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SequenceFlow sf, SimpleBPMN.Process process, UseCase useCase,
			P2UC _p2uc) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (step.equals(_pg2ps.getTarget())) {
			if (pgw.equals(_pg2ps.getSource())) {
				if (pgw.equals(sf.getSourceRef())) {
					if (process.getFlowElements().contains(pgw)) {
						if (process.getFlowElements().contains(sf)) {
							if (process.equals(_p2uc.getSource())) {
								if (useCase.equals(_p2uc.getTarget())) {
									boolean pgwisDiverging = pgw.isIsDiverging();
									if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
										_result.add(new Object[] { _pg2ps, pgw, step, sf, process, useCase, _p2uc });
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

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_2_3_greenBBBBBBBFFFFFFFFF(FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SequenceFlow sf, SimpleBPMN.Process process, UseCase useCase,
			P2UC _p2uc) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge _pg2ps__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pg2ps__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__pgw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String _pg2ps__step____target_name_prime = "target";
		String _pg2ps__pgw____source_name_prime = "source";
		String sf__pgw____sourceRef_name_prime = "sourceRef";
		String pgw__sf____outgoing_name_prime = "outgoing";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf____flowElements_name_prime = "flowElements";
		String _p2uc__process____source_name_prime = "source";
		String _p2uc__useCase____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(_pg2ps);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(sf);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(_p2uc);
		_pg2ps__step____target.setSrc(_pg2ps);
		_pg2ps__step____target.setTrg(step);
		isApplicableMatch.getAllContextElements().add(_pg2ps__step____target);
		_pg2ps__pgw____source.setSrc(_pg2ps);
		_pg2ps__pgw____source.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(_pg2ps__pgw____source);
		sf__pgw____sourceRef.setSrc(sf);
		sf__pgw____sourceRef.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(sf__pgw____sourceRef);
		pgw__sf____outgoing.setSrc(pgw);
		pgw__sf____outgoing.setTrg(sf);
		isApplicableMatch.getAllContextElements().add(pgw__sf____outgoing);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(process__pgw____flowElements);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		isApplicableMatch.getAllContextElements().add(process__sf____flowElements);
		_p2uc__process____source.setSrc(_p2uc);
		_p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(_p2uc__process____source);
		_p2uc__useCase____target.setSrc(_p2uc);
		_p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(_p2uc__useCase____target);
		_pg2ps__step____target.setName(_pg2ps__step____target_name_prime);
		_pg2ps__pgw____source.setName(_pg2ps__pgw____source_name_prime);
		sf__pgw____sourceRef.setName(sf__pgw____sourceRef_name_prime);
		pgw__sf____outgoing.setName(pgw__sf____outgoing_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		_p2uc__process____source.setName(_p2uc__process____source_name_prime);
		_p2uc__useCase____target.setName(_p2uc__useCase____target_name_prime);
		return new Object[] { _pg2ps, pgw, step, sf, process, useCase, _p2uc, isApplicableMatch, _pg2ps__step____target,
				_pg2ps__pgw____source, sf__pgw____sourceRef, pgw__sf____outgoing, process__pgw____flowElements,
				process__sf____flowElements, _p2uc__process____source, _p2uc__useCase____target };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_2_4_bindingFBBBBBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, IsApplicableMatch isApplicableMatch, FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SequenceFlow sf, SimpleBPMN.Process process, UseCase useCase,
			P2UC _p2uc) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, _pg2ps, pgw, step, sf, process,
				useCase, _p2uc);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, _pg2ps, pgw, step, sf, process, useCase, _p2uc };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_2_4_bindingAndBlackFBBBBBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, IsApplicableMatch isApplicableMatch, FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SequenceFlow sf, SimpleBPMN.Process process, UseCase useCase,
			P2UC _p2uc) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_2_4_binding = pattern_SequenceFlowAfterPG2ParallelFlow_2_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, _pg2ps, pgw, step, sf, process, useCase, _p2uc);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SequenceFlowAfterPG2ParallelFlow_2_4_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_2_4_black = pattern_SequenceFlowAfterPG2ParallelFlow_2_4_blackB(
					csp);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, _pg2ps, pgw, step, sf, process, useCase, _p2uc };
			}
		}
		return null;
	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_2_5_expressionFBB(
			SequenceFlowAfterPG2ParallelFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SequenceFlowAfterPG2ParallelFlow";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SequenceFlowAfterPG2ParallelFlow_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_10_1_blackBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelStep step, UseCase useCase,
			ParallelFlow flow) {
		return new Object[] { _this, match, step, useCase, flow };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_10_2_bindingFBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelStep step, UseCase useCase,
			ParallelFlow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, step, useCase, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, step, useCase, flow };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_10_2_bindingAndBlackFBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelStep step, UseCase useCase,
			ParallelFlow flow) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_10_2_binding = pattern_SequenceFlowAfterPG2ParallelFlow_10_2_bindingFBBBBB(
				_this, match, step, useCase, flow);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SequenceFlowAfterPG2ParallelFlow_10_2_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_10_2_black = pattern_SequenceFlowAfterPG2ParallelFlow_10_2_blackB(
					csp);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_10_2_black != null) {

				return new Object[] { csp, _this, match, step, useCase, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_10_3_expressionFBB(
			SequenceFlowAfterPG2ParallelFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_10_4_blackBBBB(Match match, ParallelStep step,
			UseCase useCase, ParallelFlow flow) {
		return new Object[] { match, step, useCase, flow };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_10_4_greenBBBBFF(Match match,
			ParallelStep step, UseCase useCase, ParallelFlow flow) {
		EMoflonEdge step__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(flow);
		String step__flow____invokedFlows_name_prime = "invokedFlows";
		String useCase__flow____flows_name_prime = "flows";
		step__flow____invokedFlows.setSrc(step);
		step__flow____invokedFlows.setTrg(flow);
		match.getToBeTranslatedEdges().add(step__flow____invokedFlows);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getToBeTranslatedEdges().add(useCase__flow____flows);
		step__flow____invokedFlows.setName(step__flow____invokedFlows_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		return new Object[] { match, step, useCase, flow, step__flow____invokedFlows, useCase__flow____flows };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_10_5_blackBBBB(Match match, ParallelStep step,
			UseCase useCase, ParallelFlow flow) {
		return new Object[] { match, step, useCase, flow };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_10_5_greenBBB(Match match, ParallelStep step,
			UseCase useCase) {
		match.getContextNodes().add(step);
		match.getContextNodes().add(useCase);
		return new Object[] { match, step, useCase };
	}

	public static final void pattern_SequenceFlowAfterPG2ParallelFlow_10_6_expressionBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelStep step, UseCase useCase,
			ParallelFlow flow) {
		_this.registerObjectsToMatch_BWD(match, step, useCase, flow);

	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_11_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("_pg2ps");
		EObject _localVariable_1 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_2 = isApplicableMatch.getObject("step");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_5 = isApplicableMatch.getObject("_p2uc");
		EObject _localVariable_6 = isApplicableMatch.getObject("flow");
		EObject tmp_pg2ps = _localVariable_0;
		EObject tmpPgw = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpUseCase = _localVariable_4;
		EObject tmp_p2uc = _localVariable_5;
		EObject tmpFlow = _localVariable_6;
		if (tmp_pg2ps instanceof FN2S) {
			FN2S _pg2ps = (FN2S) tmp_pg2ps;
			if (tmpPgw instanceof ParallelGateway) {
				ParallelGateway pgw = (ParallelGateway) tmpPgw;
				if (tmpStep instanceof ParallelStep) {
					ParallelStep step = (ParallelStep) tmpStep;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpUseCase instanceof UseCase) {
							UseCase useCase = (UseCase) tmpUseCase;
							if (tmp_p2uc instanceof P2UC) {
								P2UC _p2uc = (P2UC) tmp_p2uc;
								if (tmpFlow instanceof ParallelFlow) {
									ParallelFlow flow = (ParallelFlow) tmpFlow;
									return new Object[] { _pg2ps, pgw, step, process, useCase, _p2uc, flow,
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

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_11_1_blackBBBBBBBBFB(FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			ParallelFlow flow, SequenceFlowAfterPG2ParallelFlow _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { _pg2ps, pgw, step, process, useCase, _p2uc, flow, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_11_1_bindingAndBlackFFFFFFFBFB(
			SequenceFlowAfterPG2ParallelFlow _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_11_1_binding = pattern_SequenceFlowAfterPG2ParallelFlow_11_1_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_11_1_binding != null) {
			FN2S _pg2ps = (FN2S) result_pattern_SequenceFlowAfterPG2ParallelFlow_11_1_binding[0];
			ParallelGateway pgw = (ParallelGateway) result_pattern_SequenceFlowAfterPG2ParallelFlow_11_1_binding[1];
			ParallelStep step = (ParallelStep) result_pattern_SequenceFlowAfterPG2ParallelFlow_11_1_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_SequenceFlowAfterPG2ParallelFlow_11_1_binding[3];
			UseCase useCase = (UseCase) result_pattern_SequenceFlowAfterPG2ParallelFlow_11_1_binding[4];
			P2UC _p2uc = (P2UC) result_pattern_SequenceFlowAfterPG2ParallelFlow_11_1_binding[5];
			ParallelFlow flow = (ParallelFlow) result_pattern_SequenceFlowAfterPG2ParallelFlow_11_1_binding[6];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_11_1_black = pattern_SequenceFlowAfterPG2ParallelFlow_11_1_blackBBBBBBBBFB(
					_pg2ps, pgw, step, process, useCase, _p2uc, flow, _this, isApplicableMatch);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SequenceFlowAfterPG2ParallelFlow_11_1_black[8];

				return new Object[] { _pg2ps, pgw, step, process, useCase, _p2uc, flow, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_11_1_greenBFBBFB(ParallelGateway pgw,
			SimpleBPMN.Process process, ParallelFlow flow, CSP csp) {
		SequenceFlow sf = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		SF2F _sf2pf = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		Object _localVariable_0 = csp.getValue("sf", "id");
		sf.setSourceRef(pgw);
		process.getFlowElements().add(sf);
		_sf2pf.setSource(sf);
		_sf2pf.setTarget(flow);
		String sf_id_prime = (String) _localVariable_0;
		sf.setId(sf_id_prime);
		return new Object[] { pgw, sf, process, flow, _sf2pf, csp };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_11_2_blackBBB(SequenceFlow sf,
			ParallelFlow flow, SF2F _sf2pf) {
		return new Object[] { sf, flow, _sf2pf };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_11_2_greenFBBB(SequenceFlow sf,
			ParallelFlow flow, SF2F _sf2pf) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sf);
		ruleresult.getTranslatedElements().add(flow);
		ruleresult.getCreatedLinkElements().add(_sf2pf);
		return new Object[] { ruleresult, sf, flow, _sf2pf };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_11_3_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject _pg2ps, EObject pgw, EObject step, EObject sf, EObject process,
			EObject useCase, EObject _p2uc, EObject flow, EObject _sf2pf) {
		if (!_pg2ps.equals(pgw)) {
			if (!_pg2ps.equals(step)) {
				if (!_pg2ps.equals(sf)) {
					if (!_pg2ps.equals(process)) {
						if (!_pg2ps.equals(useCase)) {
							if (!_pg2ps.equals(flow)) {
								if (!_pg2ps.equals(_sf2pf)) {
									if (!pgw.equals(step)) {
										if (!pgw.equals(sf)) {
											if (!pgw.equals(process)) {
												if (!pgw.equals(useCase)) {
													if (!step.equals(useCase)) {
														if (!sf.equals(step)) {
															if (!sf.equals(useCase)) {
																if (!process.equals(step)) {
																	if (!process.equals(sf)) {
																		if (!process.equals(useCase)) {
																			if (!_p2uc.equals(_pg2ps)) {
																				if (!_p2uc.equals(pgw)) {
																					if (!_p2uc.equals(step)) {
																						if (!_p2uc.equals(sf)) {
																							if (!_p2uc
																									.equals(process)) {
																								if (!_p2uc.equals(
																										useCase)) {
																									if (!_p2uc.equals(
																											flow)) {
																										if (!_p2uc
																												.equals(_sf2pf)) {
																											if (!flow
																													.equals(pgw)) {
																												if (!flow
																														.equals(step)) {
																													if (!flow
																															.equals(sf)) {
																														if (!flow
																																.equals(process)) {
																															if (!flow
																																	.equals(useCase)) {
																																if (!_sf2pf
																																		.equals(pgw)) {
																																	if (!_sf2pf
																																			.equals(step)) {
																																		if (!_sf2pf
																																				.equals(sf)) {
																																			if (!_sf2pf
																																					.equals(process)) {
																																				if (!_sf2pf
																																						.equals(useCase)) {
																																					if (!_sf2pf
																																							.equals(flow)) {
																																						return new Object[] {
																																								ruleresult,
																																								_pg2ps,
																																								pgw,
																																								step,
																																								sf,
																																								process,
																																								useCase,
																																								_p2uc,
																																								flow,
																																								_sf2pf };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_11_3_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject pgw, EObject step, EObject sf, EObject process, EObject useCase,
			EObject flow, EObject _sf2pf) {
		EMoflonEdge sf__pgw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge step__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2pf__sf____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2pf__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SequenceFlowAfterPG2ParallelFlow";
		String sf__pgw____sourceRef_name_prime = "sourceRef";
		String pgw__sf____outgoing_name_prime = "outgoing";
		String step__flow____invokedFlows_name_prime = "invokedFlows";
		String process__sf____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String _sf2pf__sf____source_name_prime = "source";
		String _sf2pf__flow____target_name_prime = "target";
		sf__pgw____sourceRef.setSrc(sf);
		sf__pgw____sourceRef.setTrg(pgw);
		ruleresult.getCreatedEdges().add(sf__pgw____sourceRef);
		pgw__sf____outgoing.setSrc(pgw);
		pgw__sf____outgoing.setTrg(sf);
		ruleresult.getCreatedEdges().add(pgw__sf____outgoing);
		step__flow____invokedFlows.setSrc(step);
		step__flow____invokedFlows.setTrg(flow);
		ruleresult.getTranslatedEdges().add(step__flow____invokedFlows);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		ruleresult.getCreatedEdges().add(process__sf____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		ruleresult.getTranslatedEdges().add(useCase__flow____flows);
		_sf2pf__sf____source.setSrc(_sf2pf);
		_sf2pf__sf____source.setTrg(sf);
		ruleresult.getCreatedEdges().add(_sf2pf__sf____source);
		_sf2pf__flow____target.setSrc(_sf2pf);
		_sf2pf__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(_sf2pf__flow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sf__pgw____sourceRef.setName(sf__pgw____sourceRef_name_prime);
		pgw__sf____outgoing.setName(pgw__sf____outgoing_name_prime);
		step__flow____invokedFlows.setName(step__flow____invokedFlows_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		_sf2pf__sf____source.setName(_sf2pf__sf____source_name_prime);
		_sf2pf__flow____target.setName(_sf2pf__flow____target_name_prime);
		return new Object[] { ruleresult, pgw, step, sf, process, useCase, flow, _sf2pf, sf__pgw____sourceRef,
				pgw__sf____outgoing, step__flow____invokedFlows, process__sf____flowElements, useCase__flow____flows,
				_sf2pf__sf____source, _sf2pf__flow____target };
	}

	public static final void pattern_SequenceFlowAfterPG2ParallelFlow_11_5_expressionBBBBBBBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, PerformRuleResult ruleresult, EObject _pg2ps, EObject pgw,
			EObject step, EObject sf, EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject _sf2pf) {
		_this.registerObjects_BWD(ruleresult, _pg2ps, pgw, step, sf, process, useCase, _p2uc, flow, _sf2pf);

	}

	public static final PerformRuleResult pattern_SequenceFlowAfterPG2ParallelFlow_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_12_1_bindingFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_12_1_blackFBB(EClass eClass,
			SequenceFlowAfterPG2ParallelFlow _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_12_1_bindingAndBlackFFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_12_1_binding = pattern_SequenceFlowAfterPG2ParallelFlow_12_1_bindingFB(
				_this);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SequenceFlowAfterPG2ParallelFlow_12_1_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_12_1_black = pattern_SequenceFlowAfterPG2ParallelFlow_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SequenceFlowAfterPG2ParallelFlow_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SequenceFlowAfterPG2ParallelFlow";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("step");
		EObject _localVariable_1 = match.getObject("useCase");
		EObject _localVariable_2 = match.getObject("flow");
		EObject tmpStep = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		if (tmpStep instanceof ParallelStep) {
			ParallelStep step = (ParallelStep) tmpStep;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpFlow instanceof ParallelFlow) {
					ParallelFlow flow = (ParallelFlow) tmpFlow;
					return new Object[] { step, useCase, flow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SequenceFlowAfterPG2ParallelFlow_12_2_blackFFBFBFBB(
			ParallelStep step, UseCase useCase, ParallelFlow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (FN2S _pg2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step, FN2S.class,
				"target")) {
			FlowNode tmpPgw = _pg2ps.getSource();
			if (tmpPgw instanceof ParallelGateway) {
				ParallelGateway pgw = (ParallelGateway) tmpPgw;
				boolean pgwisDiverging = pgw.isIsDiverging();
				if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
					for (P2UC _p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(useCase,
							P2UC.class, "target")) {
						SimpleBPMN.Process process = _p2uc.getSource();
						if (process != null) {
							_result.add(new Object[] { _pg2ps, pgw, step, process, useCase, _p2uc, flow, match });
						}

					}
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SequenceFlowAfterPG2ParallelFlow_12_3_blackBBBBBBB(FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			ParallelFlow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (step.equals(_pg2ps.getTarget())) {
			if (pgw.equals(_pg2ps.getSource())) {
				if (step.getInvokedFlows().contains(flow)) {
					if (process.getFlowElements().contains(pgw)) {
						if (useCase.getFlows().contains(flow)) {
							if (process.equals(_p2uc.getSource())) {
								if (useCase.equals(_p2uc.getTarget())) {
									boolean pgwisDiverging = pgw.isIsDiverging();
									if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
										_result.add(new Object[] { _pg2ps, pgw, step, process, useCase, _p2uc, flow });
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

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_12_3_greenBBBBBBBFFFFFFFF(FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			ParallelFlow flow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge _pg2ps__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _pg2ps__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge step__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String _pg2ps__step____target_name_prime = "target";
		String _pg2ps__pgw____source_name_prime = "source";
		String step__flow____invokedFlows_name_prime = "invokedFlows";
		String process__pgw____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String _p2uc__process____source_name_prime = "source";
		String _p2uc__useCase____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(_pg2ps);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(_p2uc);
		isApplicableMatch.getAllContextElements().add(flow);
		_pg2ps__step____target.setSrc(_pg2ps);
		_pg2ps__step____target.setTrg(step);
		isApplicableMatch.getAllContextElements().add(_pg2ps__step____target);
		_pg2ps__pgw____source.setSrc(_pg2ps);
		_pg2ps__pgw____source.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(_pg2ps__pgw____source);
		step__flow____invokedFlows.setSrc(step);
		step__flow____invokedFlows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(step__flow____invokedFlows);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(process__pgw____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		_p2uc__process____source.setSrc(_p2uc);
		_p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(_p2uc__process____source);
		_p2uc__useCase____target.setSrc(_p2uc);
		_p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(_p2uc__useCase____target);
		_pg2ps__step____target.setName(_pg2ps__step____target_name_prime);
		_pg2ps__pgw____source.setName(_pg2ps__pgw____source_name_prime);
		step__flow____invokedFlows.setName(step__flow____invokedFlows_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		_p2uc__process____source.setName(_p2uc__process____source_name_prime);
		_p2uc__useCase____target.setName(_p2uc__useCase____target_name_prime);
		return new Object[] { _pg2ps, pgw, step, process, useCase, _p2uc, flow, isApplicableMatch,
				_pg2ps__step____target, _pg2ps__pgw____source, step__flow____invokedFlows, process__pgw____flowElements,
				useCase__flow____flows, _p2uc__process____source, _p2uc__useCase____target };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_12_4_bindingFBBBBBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, IsApplicableMatch isApplicableMatch, FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			ParallelFlow flow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, _pg2ps, pgw, step, process, useCase,
				_p2uc, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, _pg2ps, pgw, step, process, useCase, _p2uc, flow };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_12_4_bindingAndBlackFBBBBBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, IsApplicableMatch isApplicableMatch, FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			ParallelFlow flow) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_12_4_binding = pattern_SequenceFlowAfterPG2ParallelFlow_12_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, _pg2ps, pgw, step, process, useCase, _p2uc, flow);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SequenceFlowAfterPG2ParallelFlow_12_4_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_12_4_black = pattern_SequenceFlowAfterPG2ParallelFlow_12_4_blackB(
					csp);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, _pg2ps, pgw, step, process, useCase, _p2uc, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_12_5_expressionFBB(
			SequenceFlowAfterPG2ParallelFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_12_6_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_12_6_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SequenceFlowAfterPG2ParallelFlow";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SequenceFlowAfterPG2ParallelFlow_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_20_1_bindingFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_20_1_blackFBB(EClass __eClass,
			SequenceFlowAfterPG2ParallelFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_20_1_bindingAndBlackFFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_20_1_binding = pattern_SequenceFlowAfterPG2ParallelFlow_20_1_bindingFB(
				_this);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SequenceFlowAfterPG2ParallelFlow_20_1_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_20_1_black = pattern_SequenceFlowAfterPG2ParallelFlow_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SequenceFlowAfterPG2ParallelFlow_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SequenceFlowAfterPG2ParallelFlow_20_2_blackFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf = _edge_sourceRef.getSrc();
		if (tmpSf instanceof SequenceFlow) {
			SequenceFlow sf = (SequenceFlow) tmpSf;
			EObject tmpPgw = _edge_sourceRef.getTrg();
			if (tmpPgw instanceof ParallelGateway) {
				ParallelGateway pgw = (ParallelGateway) tmpPgw;
				if (pgw.equals(sf.getSourceRef())) {
					boolean pgwisDiverging = pgw.isIsDiverging();
					if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
						for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
							if (process.getFlowElements().contains(pgw)) {
								_result.add(new Object[] { pgw, sf, process, _edge_sourceRef });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_20_3_expressionFBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelGateway pgw, SequenceFlow sf,
			SimpleBPMN.Process process) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, pgw, sf, process);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_20_4_expressionFBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SequenceFlowAfterPG2ParallelFlow_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_21_1_bindingFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_21_1_blackFBB(EClass __eClass,
			SequenceFlowAfterPG2ParallelFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_21_1_bindingAndBlackFFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_21_1_binding = pattern_SequenceFlowAfterPG2ParallelFlow_21_1_bindingFB(
				_this);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SequenceFlowAfterPG2ParallelFlow_21_1_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_21_1_black = pattern_SequenceFlowAfterPG2ParallelFlow_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SequenceFlowAfterPG2ParallelFlow_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SequenceFlowAfterPG2ParallelFlow_21_2_blackFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPgw = _edge_outgoing.getSrc();
		if (tmpPgw instanceof ParallelGateway) {
			ParallelGateway pgw = (ParallelGateway) tmpPgw;
			EObject tmpSf = _edge_outgoing.getTrg();
			if (tmpSf instanceof SequenceFlow) {
				SequenceFlow sf = (SequenceFlow) tmpSf;
				if (pgw.equals(sf.getSourceRef())) {
					boolean pgwisDiverging = pgw.isIsDiverging();
					if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
						for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class, "flowElements")) {
							if (process.getFlowElements().contains(sf)) {
								_result.add(new Object[] { pgw, sf, process, _edge_outgoing });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_21_3_expressionFBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelGateway pgw, SequenceFlow sf,
			SimpleBPMN.Process process) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, pgw, sf, process);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_21_4_expressionFBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SequenceFlowAfterPG2ParallelFlow_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_22_1_bindingFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_22_1_blackFBB(EClass __eClass,
			SequenceFlowAfterPG2ParallelFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_22_1_bindingAndBlackFFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_22_1_binding = pattern_SequenceFlowAfterPG2ParallelFlow_22_1_bindingFB(
				_this);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SequenceFlowAfterPG2ParallelFlow_22_1_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_22_1_black = pattern_SequenceFlowAfterPG2ParallelFlow_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SequenceFlowAfterPG2ParallelFlow_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_22_2_black_nac_0BB(ParallelFlow flow,
			ParallelStep step) {
		for (ParallelStep __DEC_flow_invokedFlows_46254 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
			if (!step.equals(__DEC_flow_invokedFlows_46254)) {
				return new Object[] { flow, step };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SequenceFlowAfterPG2ParallelFlow_22_2_blackFFFB(
			EMoflonEdge _edge_invokedFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStep = _edge_invokedFlows.getSrc();
		if (tmpStep instanceof ParallelStep) {
			ParallelStep step = (ParallelStep) tmpStep;
			EObject tmpFlow = _edge_invokedFlows.getTrg();
			if (tmpFlow instanceof ParallelFlow) {
				ParallelFlow flow = (ParallelFlow) tmpFlow;
				if (step.getInvokedFlows().contains(flow)) {
					if (pattern_SequenceFlowAfterPG2ParallelFlow_22_2_black_nac_0BB(flow, step) == null) {
						for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow,
								UseCase.class, "flows")) {
							_result.add(new Object[] { step, useCase, flow, _edge_invokedFlows });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_22_3_expressionFBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelStep step, UseCase useCase,
			ParallelFlow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, useCase, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_22_4_expressionFBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SequenceFlowAfterPG2ParallelFlow_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_23_1_bindingFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_23_1_blackFBB(EClass __eClass,
			SequenceFlowAfterPG2ParallelFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_23_1_bindingAndBlackFFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_23_1_binding = pattern_SequenceFlowAfterPG2ParallelFlow_23_1_bindingFB(
				_this);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SequenceFlowAfterPG2ParallelFlow_23_1_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_23_1_black = pattern_SequenceFlowAfterPG2ParallelFlow_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SequenceFlowAfterPG2ParallelFlow_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SequenceFlowAfterPG2ParallelFlow_23_2_blackFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpSf = _edge_flowElements.getTrg();
			if (tmpSf instanceof SequenceFlow) {
				SequenceFlow sf = (SequenceFlow) tmpSf;
				if (process.getFlowElements().contains(sf)) {
					FlowNode tmpPgw = sf.getSourceRef();
					if (tmpPgw instanceof ParallelGateway) {
						ParallelGateway pgw = (ParallelGateway) tmpPgw;
						if (process.getFlowElements().contains(pgw)) {
							boolean pgwisDiverging = pgw.isIsDiverging();
							if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
								_result.add(new Object[] { pgw, sf, process, _edge_flowElements });
							}

						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_23_3_expressionFBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelGateway pgw, SequenceFlow sf,
			SimpleBPMN.Process process) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, pgw, sf, process);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_23_4_expressionFBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_23_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_23_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SequenceFlowAfterPG2ParallelFlow_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_24_1_bindingFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_24_1_blackFBB(EClass __eClass,
			SequenceFlowAfterPG2ParallelFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_24_1_bindingAndBlackFFB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_24_1_binding = pattern_SequenceFlowAfterPG2ParallelFlow_24_1_bindingFB(
				_this);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SequenceFlowAfterPG2ParallelFlow_24_1_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_24_1_black = pattern_SequenceFlowAfterPG2ParallelFlow_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SequenceFlowAfterPG2ParallelFlow_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_24_2_black_nac_0BB(ParallelFlow flow,
			ParallelStep step) {
		for (ParallelStep __DEC_flow_invokedFlows_362732 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
			if (!step.equals(__DEC_flow_invokedFlows_362732)) {
				return new Object[] { flow, step };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SequenceFlowAfterPG2ParallelFlow_24_2_blackFFFB(
			EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpFlow = _edge_flows.getTrg();
			if (tmpFlow instanceof ParallelFlow) {
				ParallelFlow flow = (ParallelFlow) tmpFlow;
				if (useCase.getFlows().contains(flow)) {
					for (ParallelStep step : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow,
							ParallelStep.class, "invokedFlows")) {
						if (pattern_SequenceFlowAfterPG2ParallelFlow_24_2_black_nac_0BB(flow, step) == null) {
							_result.add(new Object[] { step, useCase, flow, _edge_flows });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_24_3_expressionFBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match, ParallelStep step, UseCase useCase,
			ParallelFlow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, useCase, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_24_4_expressionFBB(
			SequenceFlowAfterPG2ParallelFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_24_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_24_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SequenceFlowAfterPG2ParallelFlow_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_27_1_blackB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_27_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_27_2_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("pgw");
		EObject _localVariable_1 = targetMatch.getObject("step");
		EObject _localVariable_2 = sourceMatch.getObject("sf");
		EObject _localVariable_3 = sourceMatch.getObject("process");
		EObject _localVariable_4 = targetMatch.getObject("useCase");
		EObject _localVariable_5 = targetMatch.getObject("flow");
		EObject tmpPgw = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpSf = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpUseCase = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		if (tmpPgw instanceof ParallelGateway) {
			ParallelGateway pgw = (ParallelGateway) tmpPgw;
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (tmpSf instanceof SequenceFlow) {
					SequenceFlow sf = (SequenceFlow) tmpSf;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpUseCase instanceof UseCase) {
							UseCase useCase = (UseCase) tmpUseCase;
							if (tmpFlow instanceof ParallelFlow) {
								ParallelFlow flow = (ParallelFlow) tmpFlow;
								return new Object[] { pgw, step, sf, process, useCase, flow, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SequenceFlowAfterPG2ParallelFlow_27_2_blackFBBBBBFBBB(
			ParallelGateway pgw, ParallelStep step, SequenceFlow sf, SimpleBPMN.Process process, UseCase useCase,
			ParallelFlow flow, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (pgw.equals(sf.getSourceRef())) {
				if (step.getInvokedFlows().contains(flow)) {
					if (process.getFlowElements().contains(pgw)) {
						if (process.getFlowElements().contains(sf)) {
							if (useCase.getFlows().contains(flow)) {
								boolean pgwisDiverging = pgw.isIsDiverging();
								if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
									for (FN2S _pg2ps : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(step, FN2S.class, "target")) {
										if (pgw.equals(_pg2ps.getSource())) {
											for (P2UC _p2uc : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(process, P2UC.class, "source")) {
												if (useCase.equals(_p2uc.getTarget())) {
													_result.add(new Object[] { _pg2ps, pgw, step, sf, process, useCase,
															_p2uc, flow, sourceMatch, targetMatch });
												}
											}
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

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_27_2_greenBBBBBBBBBFB(FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SequenceFlow sf, SimpleBPMN.Process process, UseCase useCase,
			P2UC _p2uc, ParallelFlow flow, Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "SequenceFlowAfterPG2ParallelFlow";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(sf);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(_pg2ps);
		isApplicableMatch.getAllContextElements().add(_p2uc);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { _pg2ps, pgw, step, sf, process, useCase, _p2uc, flow, sourceMatch, isApplicableMatch,
				targetMatch };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_27_3_bindingFBBBBBBBBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, IsApplicableMatchCC isApplicableMatch, FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SequenceFlow sf, SimpleBPMN.Process process, UseCase useCase,
			P2UC _p2uc, ParallelFlow flow, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, _pg2ps, pgw, step, sf, process,
				useCase, _p2uc, flow, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, _pg2ps, pgw, step, sf, process, useCase, _p2uc, flow,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_27_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_27_3_bindingAndBlackFBBBBBBBBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, IsApplicableMatchCC isApplicableMatch, FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SequenceFlow sf, SimpleBPMN.Process process, UseCase useCase,
			P2UC _p2uc, ParallelFlow flow, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_27_3_binding = pattern_SequenceFlowAfterPG2ParallelFlow_27_3_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, _pg2ps, pgw, step, sf, process, useCase, _p2uc, flow, sourceMatch,
				targetMatch);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_27_3_binding != null) {
			CSP csp = (CSP) result_pattern_SequenceFlowAfterPG2ParallelFlow_27_3_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_27_3_black = pattern_SequenceFlowAfterPG2ParallelFlow_27_3_blackB(
					csp);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_27_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, _pg2ps, pgw, step, sf, process, useCase, _p2uc,
						flow, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_27_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_27_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SequenceFlowAfterPG2ParallelFlow";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SequenceFlowAfterPG2ParallelFlow_27_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_30_1_blackB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_30_2_bindingFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("_pg2ps");
		EObject _localVariable_1 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_2 = isApplicableMatch.getObject("step");
		EObject _localVariable_3 = isApplicableMatch.getObject("sf");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch.getObject("_p2uc");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject tmp_pg2ps = _localVariable_0;
		EObject tmpPgw = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		EObject tmpSf = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmp_p2uc = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		if (tmp_pg2ps instanceof FN2S) {
			FN2S _pg2ps = (FN2S) tmp_pg2ps;
			if (tmpPgw instanceof ParallelGateway) {
				ParallelGateway pgw = (ParallelGateway) tmpPgw;
				if (tmpStep instanceof ParallelStep) {
					ParallelStep step = (ParallelStep) tmpStep;
					if (tmpSf instanceof SequenceFlow) {
						SequenceFlow sf = (SequenceFlow) tmpSf;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmp_p2uc instanceof P2UC) {
									P2UC _p2uc = (P2UC) tmp_p2uc;
									if (tmpFlow instanceof ParallelFlow) {
										ParallelFlow flow = (ParallelFlow) tmpFlow;
										return new Object[] { _pg2ps, pgw, step, sf, process, useCase, _p2uc, flow,
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

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_30_2_blackBBBBBBBBB(FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SequenceFlow sf, SimpleBPMN.Process process, UseCase useCase,
			P2UC _p2uc, ParallelFlow flow, IsApplicableMatchCC isApplicableMatch) {
		if (step.equals(_pg2ps.getTarget())) {
			if (pgw.equals(_pg2ps.getSource())) {
				if (pgw.equals(sf.getSourceRef())) {
					if (step.getInvokedFlows().contains(flow)) {
						if (process.getFlowElements().contains(pgw)) {
							if (process.getFlowElements().contains(sf)) {
								if (useCase.getFlows().contains(flow)) {
									if (process.equals(_p2uc.getSource())) {
										if (useCase.equals(_p2uc.getTarget())) {
											boolean pgwisDiverging = pgw.isIsDiverging();
											if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
												return new Object[] { _pg2ps, pgw, step, sf, process, useCase, _p2uc,
														flow, isApplicableMatch };
											}

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

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_30_2_bindingAndBlackFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_30_2_binding = pattern_SequenceFlowAfterPG2ParallelFlow_30_2_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_30_2_binding != null) {
			FN2S _pg2ps = (FN2S) result_pattern_SequenceFlowAfterPG2ParallelFlow_30_2_binding[0];
			ParallelGateway pgw = (ParallelGateway) result_pattern_SequenceFlowAfterPG2ParallelFlow_30_2_binding[1];
			ParallelStep step = (ParallelStep) result_pattern_SequenceFlowAfterPG2ParallelFlow_30_2_binding[2];
			SequenceFlow sf = (SequenceFlow) result_pattern_SequenceFlowAfterPG2ParallelFlow_30_2_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_SequenceFlowAfterPG2ParallelFlow_30_2_binding[4];
			UseCase useCase = (UseCase) result_pattern_SequenceFlowAfterPG2ParallelFlow_30_2_binding[5];
			P2UC _p2uc = (P2UC) result_pattern_SequenceFlowAfterPG2ParallelFlow_30_2_binding[6];
			ParallelFlow flow = (ParallelFlow) result_pattern_SequenceFlowAfterPG2ParallelFlow_30_2_binding[7];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_30_2_black = pattern_SequenceFlowAfterPG2ParallelFlow_30_2_blackBBBBBBBBB(
					_pg2ps, pgw, step, sf, process, useCase, _p2uc, flow, isApplicableMatch);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_30_2_black != null) {

				return new Object[] { _pg2ps, pgw, step, sf, process, useCase, _p2uc, flow, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_30_2_greenBBFF(SequenceFlow sf,
			ParallelFlow flow) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		SF2F _sf2pf = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		result.getCreatedElements().add(_sf2pf);
		_sf2pf.setSource(sf);
		_sf2pf.setTarget(flow);
		return new Object[] { sf, flow, result, _sf2pf };
	}

	public static final PerformRuleResult pattern_SequenceFlowAfterPG2ParallelFlow_30_3_expressionFB(
			PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_1_blackB(
			SequenceFlowAfterPG2ParallelFlow _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, FN2S _pg2ps) {
		if (ruleResult.getCorrObjects().contains(_pg2ps)) {
			return new Object[] { ruleResult, _pg2ps };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ParallelStep step) {
		if (ruleResult.getTargetObjects().contains(step)) {
			return new Object[] { ruleResult, step };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ParallelGateway pgw) {
		if (ruleResult.getSourceObjects().contains(pgw)) {
			return new Object[] { ruleResult, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, P2UC _p2uc) {
		if (ruleResult.getCorrObjects().contains(_p2uc)) {
			return new Object[] { ruleResult, _p2uc };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SequenceFlowAfterPG2ParallelFlow_31_2_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList _pg2psList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmp_pg2ps : _pg2psList.getEntryObjects()) {
				if (tmp_pg2ps instanceof FN2S) {
					FN2S _pg2ps = (FN2S) tmp_pg2ps;
					Step tmpStep = _pg2ps.getTarget();
					if (tmpStep instanceof ParallelStep) {
						ParallelStep step = (ParallelStep) tmpStep;
						FlowNode tmpPgw = _pg2ps.getSource();
						if (tmpPgw instanceof ParallelGateway) {
							ParallelGateway pgw = (ParallelGateway) tmpPgw;
							boolean pgwisDiverging = pgw.isIsDiverging();
							if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
								if (pattern_SequenceFlowAfterPG2ParallelFlow_31_2_black_nac_0BB(ruleResult,
										_pg2ps) == null) {
									if (pattern_SequenceFlowAfterPG2ParallelFlow_31_2_black_nac_1BB(ruleResult,
											step) == null) {
										if (pattern_SequenceFlowAfterPG2ParallelFlow_31_2_black_nac_2BB(ruleResult,
												pgw) == null) {
											for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(pgw, SimpleBPMN.Process.class,
															"flowElements")) {
												if (pattern_SequenceFlowAfterPG2ParallelFlow_31_2_black_nac_3BB(
														ruleResult, process) == null) {
													for (P2UC _p2uc : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(process, P2UC.class, "source")) {
														UseCase useCase = _p2uc.getTarget();
														if (useCase != null) {
															if (pattern_SequenceFlowAfterPG2ParallelFlow_31_2_black_nac_4BB(
																	ruleResult, _p2uc) == null) {
																if (pattern_SequenceFlowAfterPG2ParallelFlow_31_2_black_nac_5BB(
																		ruleResult, useCase) == null) {
																	_result.add(new Object[] { _pg2psList, _pg2ps, step,
																			pgw, process, _p2uc, useCase,
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

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_3_bindingFBBBBBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, IsApplicableMatch isApplicableMatch, FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, _pg2ps, pgw, step, process, useCase,
				_p2uc, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, _pg2ps, pgw, step, process, useCase, _p2uc,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_3_bindingAndBlackFBBBBBBBBB(
			SequenceFlowAfterPG2ParallelFlow _this, IsApplicableMatch isApplicableMatch, FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_31_3_binding = pattern_SequenceFlowAfterPG2ParallelFlow_31_3_bindingFBBBBBBBBB(
				_this, isApplicableMatch, _pg2ps, pgw, step, process, useCase, _p2uc, ruleResult);
		if (result_pattern_SequenceFlowAfterPG2ParallelFlow_31_3_binding != null) {
			CSP csp = (CSP) result_pattern_SequenceFlowAfterPG2ParallelFlow_31_3_binding[0];

			Object[] result_pattern_SequenceFlowAfterPG2ParallelFlow_31_3_black = pattern_SequenceFlowAfterPG2ParallelFlow_31_3_blackB(
					csp);
			if (result_pattern_SequenceFlowAfterPG2ParallelFlow_31_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, _pg2ps, pgw, step, process, useCase, _p2uc,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SequenceFlowAfterPG2ParallelFlow_31_4_expressionFBB(
			SequenceFlowAfterPG2ParallelFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_5_blackBBBBBB(FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc) {
		boolean pgwisDiverging = pgw.isIsDiverging();
		if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
			return new Object[] { _pg2ps, pgw, step, process, useCase, _p2uc };
		}

		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_6_blackBBBBBBB(FN2S _pg2ps,
			ParallelGateway pgw, ParallelStep step, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			ModelgeneratorRuleResult ruleResult) {
		boolean pgwisDiverging = pgw.isIsDiverging();
		if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
			return new Object[] { _pg2ps, pgw, step, process, useCase, _p2uc, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_SequenceFlowAfterPG2ParallelFlow_31_6_greenBBFBBFFBB(ParallelGateway pgw,
			ParallelStep step, SimpleBPMN.Process process, UseCase useCase, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		SequenceFlow sf = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		ParallelFlow flow = SimpleUseCaseFactory.eINSTANCE.createParallelFlow();
		SF2F _sf2pf = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		Object _localVariable_0 = csp.getValue("sf", "id");
		Object _localVariable_1 = csp.getValue("flow", "id");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		sf.setSourceRef(pgw);
		process.getFlowElements().add(sf);
		ruleResult.getSourceObjects().add(sf);
		step.getInvokedFlows().add(flow);
		useCase.getFlows().add(flow);
		ruleResult.getTargetObjects().add(flow);
		_sf2pf.setSource(sf);
		_sf2pf.setTarget(flow);
		ruleResult.getCorrObjects().add(_sf2pf);
		String sf_id_prime = (String) _localVariable_0;
		String flow_id_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		sf.setId(sf_id_prime);
		flow.setId(flow_id_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { pgw, step, sf, process, useCase, flow, _sf2pf, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SequenceFlowAfterPG2ParallelFlow_31_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SequenceFlowAfterPG2ParallelFlowImpl
