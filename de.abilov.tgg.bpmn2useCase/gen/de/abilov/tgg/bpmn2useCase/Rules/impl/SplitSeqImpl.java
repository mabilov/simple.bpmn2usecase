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

import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;
import de.abilov.tgg.bpmn2useCase.Rules.SplitSeq;

import de.abilov.useCase.Flow;
import de.abilov.useCase.ParallelStep;
import de.abilov.useCase.Step;
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
 * An implementation of the model object '<em><b>Split Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SplitSeqImpl extends AbstractRuleImpl implements SplitSeq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitSeqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSplitSeq();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		// initial bindings
		Object[] result1_black = SplitSeqImpl.pattern_SplitSeq_0_1_blackBBBBBBB(this, match, prevNode, process, sf1,
				pgw, pcgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process
							+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_0_2_bindingAndBlackFBBBBBBB(this, match,
				prevNode, process, sf1, pgw, pcgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = "
					+ process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SplitSeqImpl.pattern_SplitSeq_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SplitSeqImpl.pattern_SplitSeq_0_4_blackBBBBBB(match, prevNode, process, sf1, pgw,
					pcgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
						+ "[pcgw] = " + pcgw + ".");
			}
			SplitSeqImpl.pattern_SplitSeq_0_4_greenBBBBBBFFFFFFFF(match, prevNode, process, sf1, pgw, pcgw);
			// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result4_green[8];
			// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result4_green[9];
			// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result4_green[10];
			// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result4_green[11];
			// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[12];
			// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = SplitSeqImpl.pattern_SplitSeq_0_5_blackBBBBBB(match, prevNode, process, sf1, pgw,
					pcgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process + ", "
								+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
			}
			SplitSeqImpl.pattern_SplitSeq_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			SplitSeqImpl.pattern_SplitSeq_0_6_expressionBBBBBBB(this, match, prevNode, process, sf1, pgw, pcgw);
			return SplitSeqImpl.pattern_SplitSeq_0_7_expressionF();
		} else {
			return SplitSeqImpl.pattern_SplitSeq_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_1_1_bindingAndBlackFFFFFFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2S pn2ps = (FN2S) result1_bindingAndBlack[0];
		Flow flow = (Flow) result1_bindingAndBlack[1];
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[2];
		Step prevStep = (Step) result1_bindingAndBlack[3];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[4];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[5];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[6];
		ParallelGateway pcgw = (ParallelGateway) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_1_1_greenBBFBFFBB(flow, prevStep, pgw, pcgw, csp);
		ParallelStep step = (ParallelStep) result1_green[2];
		FN2S pcgwToStep = (FN2S) result1_green[4];
		GW2S pgwToStep = (GW2S) result1_green[5];

		// collect translated elements
		Object[] result2_black = SplitSeqImpl.pattern_SplitSeq_1_2_blackBBBBBB(step, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = "
					+ pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = SplitSeqImpl.pattern_SplitSeq_1_2_greenFBBBBBB(step, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SplitSeqImpl.pattern_SplitSeq_1_3_blackBBBBBBBBBBBB(ruleresult, pn2ps, flow, prevNode,
				prevStep, step, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pn2ps] = " + pn2ps + ", " + "[flow] = " + flow + ", "
					+ "[prevNode] = " + prevNode + ", " + "[prevStep] = " + prevStep + ", " + "[step] = " + step + ", "
					+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
					+ "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw
					+ ".");
		}
		SplitSeqImpl.pattern_SplitSeq_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, flow, prevNode, prevStep, step,
				process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[11];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[20];
				// EMoflonEdge pcgwToStep__pcgw____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pcgwToStep__step____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge pgwToStep__pgw____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pgwToStep__step____target = (EMoflonEdge) result3_green[24];

		// perform postprocessing story node is empty
		// register objects
		SplitSeqImpl.pattern_SplitSeq_1_5_expressionBBBBBBBBBBBBB(this, ruleresult, pn2ps, flow, prevNode, prevStep,
				step, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		return SplitSeqImpl.pattern_SplitSeq_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SplitSeqImpl.pattern_SplitSeq_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		FlowNode prevNode = (FlowNode) result2_binding[0];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ParallelGateway pgw = (ParallelGateway) result2_binding[3];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[4];
		for (Object[] result2_black : SplitSeqImpl.pattern_SplitSeq_2_2_blackFBFBBBBB(prevNode, process, sf1, pgw, pcgw,
				match)) {
			FN2S pn2ps = (FN2S) result2_black[0];
			Step prevStep = (Step) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : SplitSeqImpl.pattern_SplitSeq_2_3_blackBFBBBBBB(pn2ps, prevNode, prevStep,
					process, sf1, pgw, pcgw)) {
				Flow flow = (Flow) result3_black[1];
				Object[] result3_green = SplitSeqImpl.pattern_SplitSeq_2_3_greenBBBBBBBBFFFFFFFFFFFFF(pn2ps, flow,
						prevNode, prevStep, process, sf1, pgw, pcgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge pn2ps__prevNode____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge pn2ps__prevStep____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_2_4_bindingAndBlackFBBBBBBBBBB(this,
						isApplicableMatch, pn2ps, flow, prevNode, prevStep, process, sf1, pgw, pcgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pn2ps] = " + pn2ps + ", " + "[flow] = " + flow + ", " + "[prevNode] = " + prevNode
							+ ", " + "[prevStep] = " + prevStep + ", " + "[process] = " + process + ", " + "[sf1] = "
							+ sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SplitSeqImpl.pattern_SplitSeq_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SplitSeqImpl.pattern_SplitSeq_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SplitSeqImpl.pattern_SplitSeq_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SplitSeqImpl.pattern_SplitSeq_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, FlowNode prevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
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
	public CSP isAppropriate_solveCsp_FWD(Match match, FlowNode prevNode, de.abilov.bpmn.Process process,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, FN2S pn2ps, Flow flow, FlowNode prevNode,
			Step prevStep, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {// Create CSP
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
		isApplicableMatch.registerObject("pn2ps", pn2ps);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("prevStep", prevStep);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject pn2ps, EObject flow, EObject prevNode,
			EObject prevStep, EObject step, EObject process, EObject sf1, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("pn2ps", pn2ps);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("step", step);
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
	public boolean isAppropriate_BWD(Match match, Flow flow, Step prevStep, ParallelStep step) {
		// initial bindings
		Object[] result1_black = SplitSeqImpl.pattern_SplitSeq_10_1_blackBBBBB(this, match, flow, prevStep, step);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[flow] = " + flow + ", "
					+ "[prevStep] = " + prevStep + ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_10_2_bindingAndBlackFBBBBB(this, match, flow,
				prevStep, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[prevStep] = " + prevStep
					+ ", " + "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SplitSeqImpl.pattern_SplitSeq_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SplitSeqImpl.pattern_SplitSeq_10_4_blackBBBB(match, flow, prevStep, step);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[prevStep] = "
						+ prevStep + ", " + "[step] = " + step + ".");
			}
			SplitSeqImpl.pattern_SplitSeq_10_4_greenBBBBFF(match, flow, prevStep, step);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[4];
			// EMoflonEdge prevStep__step____next = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = SplitSeqImpl.pattern_SplitSeq_10_5_blackBBBB(match, flow, prevStep, step);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[prevStep] = "
						+ prevStep + ", " + "[step] = " + step + ".");
			}
			SplitSeqImpl.pattern_SplitSeq_10_5_greenBBBF(match, flow, prevStep);
			// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result5_green[3];

			// register objects to match
			SplitSeqImpl.pattern_SplitSeq_10_6_expressionBBBBB(this, match, flow, prevStep, step);
			return SplitSeqImpl.pattern_SplitSeq_10_7_expressionF();
		} else {
			return SplitSeqImpl.pattern_SplitSeq_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_11_1_bindingAndBlackFFFFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2S pn2ps = (FN2S) result1_bindingAndBlack[0];
		Flow flow = (Flow) result1_bindingAndBlack[1];
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[2];
		Step prevStep = (Step) result1_bindingAndBlack[3];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[4];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_11_1_greenBBBFFFFFB(prevNode, step, process, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[3];
		ParallelGateway pgw = (ParallelGateway) result1_green[4];
		FN2S pcgwToStep = (FN2S) result1_green[5];
		GW2S pgwToStep = (GW2S) result1_green[6];
		ParallelGateway pcgw = (ParallelGateway) result1_green[7];

		// collect translated elements
		Object[] result2_black = SplitSeqImpl.pattern_SplitSeq_11_2_blackBBBBBB(step, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = "
					+ pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = SplitSeqImpl.pattern_SplitSeq_11_2_greenFBBBBBB(step, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SplitSeqImpl.pattern_SplitSeq_11_3_blackBBBBBBBBBBBB(ruleresult, pn2ps, flow, prevNode,
				prevStep, step, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pn2ps] = " + pn2ps + ", " + "[flow] = " + flow + ", "
					+ "[prevNode] = " + prevNode + ", " + "[prevStep] = " + prevStep + ", " + "[step] = " + step + ", "
					+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
					+ "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw
					+ ".");
		}
		SplitSeqImpl.pattern_SplitSeq_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, flow, prevNode, prevStep, step,
				process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[11];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[20];
				// EMoflonEdge pcgwToStep__pcgw____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pcgwToStep__step____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge pgwToStep__pgw____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pgwToStep__step____target = (EMoflonEdge) result3_green[24];

		// perform postprocessing story node is empty
		// register objects
		SplitSeqImpl.pattern_SplitSeq_11_5_expressionBBBBBBBBBBBBB(this, ruleresult, pn2ps, flow, prevNode, prevStep,
				step, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		return SplitSeqImpl.pattern_SplitSeq_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SplitSeqImpl.pattern_SplitSeq_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Flow flow = (Flow) result2_binding[0];
		Step prevStep = (Step) result2_binding[1];
		ParallelStep step = (ParallelStep) result2_binding[2];
		for (Object[] result2_black : SplitSeqImpl.pattern_SplitSeq_12_2_blackFBFBBB(flow, prevStep, step, match)) {
			FN2S pn2ps = (FN2S) result2_black[0];
			FlowNode prevNode = (FlowNode) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : SplitSeqImpl.pattern_SplitSeq_12_3_blackBBBBBF(pn2ps, flow, prevNode,
					prevStep, step)) {
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result3_black[5];
				Object[] result3_green = SplitSeqImpl.pattern_SplitSeq_12_3_greenBBBBBBFFFFFFF(pn2ps, flow, prevNode,
						prevStep, step, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge pn2ps__prevNode____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge pn2ps__prevStep____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_12_4_bindingAndBlackFBBBBBBBB(this,
						isApplicableMatch, pn2ps, flow, prevNode, prevStep, step, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
									+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pn2ps] = " + pn2ps + ", "
									+ "[flow] = " + flow + ", " + "[prevNode] = " + prevNode + ", " + "[prevStep] = "
									+ prevStep + ", " + "[step] = " + step + ", " + "[process] = " + process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SplitSeqImpl.pattern_SplitSeq_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SplitSeqImpl.pattern_SplitSeq_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SplitSeqImpl.pattern_SplitSeq_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SplitSeqImpl.pattern_SplitSeq_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Flow flow, Step prevStep, ParallelStep step) {
		match.registerObject("flow", flow);
		match.registerObject("prevStep", prevStep);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Flow flow, Step prevStep, ParallelStep step) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FN2S pn2ps, Flow flow, FlowNode prevNode,
			Step prevStep, ParallelStep step, de.abilov.bpmn.Process process) {// Create CSP
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
		isApplicableMatch.registerObject("pn2ps", pn2ps);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("prevStep", prevStep);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject pn2ps, EObject flow, EObject prevNode,
			EObject prevStep, EObject step, EObject process, EObject sf1, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("pn2ps", pn2ps);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("step", step);
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
				.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getParallelStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_128(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitSeqImpl.pattern_SplitSeq_20_2_blackFFFB(_edge_steps)) {
			Flow flow = (Flow) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			ParallelStep step = (ParallelStep) result2_black[2];
			Object[] result2_green = SplitSeqImpl.pattern_SplitSeq_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitSeqImpl.pattern_SplitSeq_20_3_expressionFBBBBB(this, match, flow, prevStep, step)) {
				// Ensure that the correct types of elements are matched
				if (SplitSeqImpl.pattern_SplitSeq_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitSeqImpl.pattern_SplitSeq_20_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitSeqImpl.pattern_SplitSeq_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitSeqImpl.pattern_SplitSeq_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_129(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitSeqImpl.pattern_SplitSeq_21_2_blackFFFB(_edge_next)) {
			Flow flow = (Flow) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			ParallelStep step = (ParallelStep) result2_black[2];
			Object[] result2_green = SplitSeqImpl.pattern_SplitSeq_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitSeqImpl.pattern_SplitSeq_21_3_expressionFBBBBB(this, match, flow, prevStep, step)) {
				// Ensure that the correct types of elements are matched
				if (SplitSeqImpl.pattern_SplitSeq_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitSeqImpl.pattern_SplitSeq_21_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitSeqImpl.pattern_SplitSeq_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitSeqImpl.pattern_SplitSeq_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_415(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitSeqImpl.pattern_SplitSeq_22_2_blackFFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitSeqImpl.pattern_SplitSeq_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitSeqImpl.pattern_SplitSeq_22_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitSeqImpl.pattern_SplitSeq_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitSeqImpl.pattern_SplitSeq_22_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitSeqImpl.pattern_SplitSeq_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitSeqImpl.pattern_SplitSeq_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_416(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitSeqImpl.pattern_SplitSeq_23_2_blackFFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitSeqImpl.pattern_SplitSeq_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitSeqImpl.pattern_SplitSeq_23_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitSeqImpl.pattern_SplitSeq_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitSeqImpl.pattern_SplitSeq_23_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitSeqImpl.pattern_SplitSeq_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitSeqImpl.pattern_SplitSeq_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_417(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitSeqImpl.pattern_SplitSeq_24_2_blackFFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitSeqImpl.pattern_SplitSeq_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitSeqImpl.pattern_SplitSeq_24_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitSeqImpl.pattern_SplitSeq_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitSeqImpl.pattern_SplitSeq_24_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitSeqImpl.pattern_SplitSeq_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitSeqImpl.pattern_SplitSeq_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_418(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitSeqImpl.pattern_SplitSeq_25_2_blackFFFFFB(_edge_targetRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitSeqImpl.pattern_SplitSeq_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitSeqImpl.pattern_SplitSeq_25_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitSeqImpl.pattern_SplitSeq_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitSeqImpl.pattern_SplitSeq_25_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitSeqImpl.pattern_SplitSeq_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitSeqImpl.pattern_SplitSeq_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_419(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitSeqImpl.pattern_SplitSeq_26_2_blackFFFFFB(_edge_incoming)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitSeqImpl.pattern_SplitSeq_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitSeqImpl.pattern_SplitSeq_26_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitSeqImpl.pattern_SplitSeq_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitSeqImpl.pattern_SplitSeq_26_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitSeqImpl.pattern_SplitSeq_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitSeqImpl.pattern_SplitSeq_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_420(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitSeqImpl.pattern_SplitSeq_27_2_blackFFFFFB(_edge___conv)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitSeqImpl.pattern_SplitSeq_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitSeqImpl.pattern_SplitSeq_27_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitSeqImpl.pattern_SplitSeq_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitSeqImpl.pattern_SplitSeq_27_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitSeqImpl.pattern_SplitSeq_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitSeqImpl.pattern_SplitSeq_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_421(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitSeqImpl.pattern_SplitSeq_28_2_blackFFFFFB(_edge_sourceRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitSeqImpl.pattern_SplitSeq_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitSeqImpl.pattern_SplitSeq_28_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitSeqImpl.pattern_SplitSeq_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitSeqImpl.pattern_SplitSeq_28_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitSeqImpl.pattern_SplitSeq_28_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitSeqImpl.pattern_SplitSeq_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_422(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitSeqImpl.pattern_SplitSeq_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitSeqImpl.pattern_SplitSeq_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitSeqImpl.pattern_SplitSeq_29_2_blackFFFFFB(_edge_outgoing)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitSeqImpl.pattern_SplitSeq_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitSeqImpl.pattern_SplitSeq_29_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitSeqImpl.pattern_SplitSeq_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitSeqImpl.pattern_SplitSeq_29_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitSeqImpl.pattern_SplitSeq_29_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitSeqImpl.pattern_SplitSeq_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SplitSeq");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPn2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2ps")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S pn2ps = (de.abilov.tgg.bpmn2useCase.FN2S) matchForPn2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.FlowNode prevNode = (de.abilov.bpmn.FlowNode) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		de.abilov.useCase.Step prevStep = (de.abilov.useCase.Step) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ParallelStep step = (de.abilov.useCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

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

		eq0.setRuleName("SplitSeq");
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
		ruleResult.setRule("SplitSeq");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPn2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2ps")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S pn2ps = (de.abilov.tgg.bpmn2useCase.FN2S) matchForPn2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.FlowNode prevNode = (de.abilov.bpmn.FlowNode) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		de.abilov.useCase.Step prevStep = (de.abilov.useCase.Step) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ParallelStep step = (de.abilov.useCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

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

		eq0.setRuleName("SplitSeq");
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(de.abilov.bpmn.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.SPLIT_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(de.abilov.bpmn.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
			return null;
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(de.abilov.bpmn.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2S_FLOW_FLOWNODE_STEP_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (FN2S) arguments.get(1),
					(Flow) arguments.get(2), (FlowNode) arguments.get(3), (Step) arguments.get(4),
					(de.abilov.bpmn.Process) arguments.get(5), (SequenceFlow) arguments.get(6),
					(ParallelGateway) arguments.get(7), (ParallelGateway) arguments.get(8));
		case RulesPackage.SPLIT_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.SPLIT_SEQ___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_BWD__MATCH_FLOW_STEP_PARALLELSTEP:
			return isAppropriate_BWD((Match) arguments.get(0), (Flow) arguments.get(1), (Step) arguments.get(2),
					(ParallelStep) arguments.get(3));
		case RulesPackage.SPLIT_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_STEP_PARALLELSTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Flow) arguments.get(1), (Step) arguments.get(2),
					(ParallelStep) arguments.get(3));
			return null;
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_STEP_PARALLELSTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Flow) arguments.get(1),
					(Step) arguments.get(2), (ParallelStep) arguments.get(3));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_FLOW_FLOWNODE_STEP_PARALLELSTEP_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FN2S) arguments.get(1),
					(Flow) arguments.get(2), (FlowNode) arguments.get(3), (Step) arguments.get(4),
					(ParallelStep) arguments.get(5), (de.abilov.bpmn.Process) arguments.get(6));
		case RulesPackage.SPLIT_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.SPLIT_SEQ___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_128__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_128((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_129__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_129((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_415__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_415((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_416__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_416((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_417__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_417((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_418__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_418((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_419__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_419((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_420__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_420((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_421__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_421((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_422__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_422((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SPLIT_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SplitSeq_0_1_blackBBBBBBB(SplitSeq _this, Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					return new Object[] { _this, match, prevNode, process, sf1, pgw, pcgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_0_2_bindingFBBBBBBB(SplitSeq _this, Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, process, sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, process, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitSeq_0_2_bindingAndBlackFBBBBBBB(SplitSeq _this, Match match,
			FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		Object[] result_pattern_SplitSeq_0_2_binding = pattern_SplitSeq_0_2_bindingFBBBBBBB(_this, match, prevNode,
				process, sf1, pgw, pcgw);
		if (result_pattern_SplitSeq_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SplitSeq_0_2_binding[0];

			Object[] result_pattern_SplitSeq_0_2_black = pattern_SplitSeq_0_2_blackB(csp);
			if (result_pattern_SplitSeq_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, process, sf1, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitSeq_0_3_expressionFBB(SplitSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_0_4_blackBBBBBB(Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					return new Object[] { match, prevNode, process, sf1, pgw, pcgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_0_4_greenBBBBBBFFFFFFFF(Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
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

	public static final Object[] pattern_SplitSeq_0_5_blackBBBBBB(Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					return new Object[] { match, prevNode, process, sf1, pgw, pcgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_0_5_greenBBBF(Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process) {
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

	public static final void pattern_SplitSeq_0_6_expressionBBBBBBB(SplitSeq _this, Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		_this.registerObjectsToMatch_FWD(match, prevNode, process, sf1, pgw, pcgw);

	}

	public static final boolean pattern_SplitSeq_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SplitSeq_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_1_1_bindingFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pn2ps");
		EObject _localVariable_1 = isApplicableMatch.getObject("flow");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_6 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_7 = isApplicableMatch.getObject("pcgw");
		EObject tmpPn2ps = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpPrevStep = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpSf1 = _localVariable_5;
		EObject tmpPgw = _localVariable_6;
		EObject tmpPcgw = _localVariable_7;
		if (tmpPn2ps instanceof FN2S) {
			FN2S pn2ps = (FN2S) tmpPn2ps;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpPrevNode instanceof FlowNode) {
					FlowNode prevNode = (FlowNode) tmpPrevNode;
					if (tmpPrevStep instanceof Step) {
						Step prevStep = (Step) tmpPrevStep;
						if (tmpProcess instanceof de.abilov.bpmn.Process) {
							de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (tmpPgw instanceof ParallelGateway) {
									ParallelGateway pgw = (ParallelGateway) tmpPgw;
									if (tmpPcgw instanceof ParallelGateway) {
										ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
										return new Object[] { pn2ps, flow, prevNode, prevStep, process, sf1, pgw, pcgw,
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

	public static final Object[] pattern_SplitSeq_1_1_blackBBBBBBBBBFB(FN2S pn2ps, Flow flow, FlowNode prevNode,
			Step prevStep, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw,
			SplitSeq _this, IsApplicableMatch isApplicableMatch) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { pn2ps, flow, prevNode, prevStep, process, sf1, pgw, pcgw, _this, csp,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_1_1_bindingAndBlackFFFFFFFFBFB(SplitSeq _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SplitSeq_1_1_binding = pattern_SplitSeq_1_1_bindingFFFFFFFFB(isApplicableMatch);
		if (result_pattern_SplitSeq_1_1_binding != null) {
			FN2S pn2ps = (FN2S) result_pattern_SplitSeq_1_1_binding[0];
			Flow flow = (Flow) result_pattern_SplitSeq_1_1_binding[1];
			FlowNode prevNode = (FlowNode) result_pattern_SplitSeq_1_1_binding[2];
			Step prevStep = (Step) result_pattern_SplitSeq_1_1_binding[3];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_SplitSeq_1_1_binding[4];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_SplitSeq_1_1_binding[5];
			ParallelGateway pgw = (ParallelGateway) result_pattern_SplitSeq_1_1_binding[6];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_SplitSeq_1_1_binding[7];

			Object[] result_pattern_SplitSeq_1_1_black = pattern_SplitSeq_1_1_blackBBBBBBBBBFB(pn2ps, flow, prevNode,
					prevStep, process, sf1, pgw, pcgw, _this, isApplicableMatch);
			if (result_pattern_SplitSeq_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SplitSeq_1_1_black[9];

				return new Object[] { pn2ps, flow, prevNode, prevStep, process, sf1, pgw, pcgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_1_1_greenBBFBFFBB(Flow flow, Step prevStep, ParallelGateway pgw,
			ParallelGateway pcgw, CSP csp) {
		ParallelStep step = UseCaseFactory.eINSTANCE.createParallelStep();
		FN2S pcgwToStep = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		flow.getSteps().add(step);
		prevStep.setNext(step);
		pcgwToStep.setSource(pcgw);
		pcgwToStep.setTarget(step);
		pgwToStep.setSource(pgw);
		pgwToStep.setTarget(step);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { flow, prevStep, step, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_SplitSeq_1_2_blackBBBBBB(ParallelStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_1_2_greenFBBBBBB(ParallelStep step, SequenceFlow sf1,
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

	public static final Object[] pattern_SplitSeq_1_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult, EObject pn2ps,
			EObject flow, EObject prevNode, EObject prevStep, EObject step, EObject process, EObject sf1, EObject pgw,
			EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		if (!pn2ps.equals(prevNode)) {
			if (!pn2ps.equals(prevStep)) {
				if (!pn2ps.equals(step)) {
					if (!pn2ps.equals(process)) {
						if (!pn2ps.equals(sf1)) {
							if (!flow.equals(pn2ps)) {
								if (!flow.equals(prevNode)) {
									if (!flow.equals(prevStep)) {
										if (!flow.equals(step)) {
											if (!flow.equals(process)) {
												if (!flow.equals(sf1)) {
													if (!flow.equals(pgw)) {
														if (!flow.equals(pcgwToStep)) {
															if (!flow.equals(pgwToStep)) {
																if (!flow.equals(pcgw)) {
																	if (!prevNode.equals(prevStep)) {
																		if (!prevNode.equals(step)) {
																			if (!prevNode.equals(process)) {
																				if (!prevNode.equals(sf1)) {
																					if (!prevStep.equals(step)) {
																						if (!prevStep.equals(process)) {
																							if (!prevStep.equals(sf1)) {
																								if (!process
																										.equals(step)) {
																									if (!process.equals(
																											sf1)) {
																										if (!sf1.equals(
																												step)) {
																											if (!pgw.equals(
																													pn2ps)) {
																												if (!pgw.equals(
																														prevNode)) {
																													if (!pgw.equals(
																															prevStep)) {
																														if (!pgw.equals(
																																step)) {
																															if (!pgw.equals(
																																	process)) {
																																if (!pgw.equals(
																																		sf1)) {
																																	if (!pgw.equals(
																																			pgwToStep)) {
																																		if (!pcgwToStep
																																				.equals(pn2ps)) {
																																			if (!pcgwToStep
																																					.equals(prevNode)) {
																																				if (!pcgwToStep
																																						.equals(prevStep)) {
																																					if (!pcgwToStep
																																							.equals(step)) {
																																						if (!pcgwToStep
																																								.equals(process)) {
																																							if (!pcgwToStep
																																									.equals(sf1)) {
																																								if (!pcgwToStep
																																										.equals(pgw)) {
																																									if (!pcgwToStep
																																											.equals(pgwToStep)) {
																																										if (!pgwToStep
																																												.equals(pn2ps)) {
																																											if (!pgwToStep
																																													.equals(prevNode)) {
																																												if (!pgwToStep
																																														.equals(prevStep)) {
																																													if (!pgwToStep
																																															.equals(step)) {
																																														if (!pgwToStep
																																																.equals(process)) {
																																															if (!pgwToStep
																																																	.equals(sf1)) {
																																																if (!pcgw
																																																		.equals(pn2ps)) {
																																																	if (!pcgw
																																																			.equals(prevNode)) {
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
																																																									.equals(pcgwToStep)) {
																																																								if (!pcgw
																																																										.equals(pgwToStep)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											pn2ps,
																																																											flow,
																																																											prevNode,
																																																											prevStep,
																																																											step,
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
											}
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

	public static final Object[] pattern_SplitSeq_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject flow, EObject prevNode, EObject prevStep, EObject step, EObject process, EObject sf1, EObject pgw,
			EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String ruleresult_ruleName_prime = "SplitSeq";
		String flow__step____steps_name_prime = "steps";
		String prevStep__step____next_name_prime = "next";
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
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getCreatedEdges().add(prevStep__step____next);
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
		prevStep__step____next.setName(prevStep__step____next_name_prime);
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
		return new Object[] { ruleresult, flow, prevNode, prevStep, step, process, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw, flow__step____steps, prevStep__step____next, process__pgw____flowElements,
				process__sf1____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				pcgwToStep__pcgw____source, pcgwToStep__step____target, pgwToStep__pgw____source,
				pgwToStep__step____target };
	}

	public static final void pattern_SplitSeq_1_5_expressionBBBBBBBBBBBBB(SplitSeq _this, PerformRuleResult ruleresult,
			EObject pn2ps, EObject flow, EObject prevNode, EObject prevStep, EObject step, EObject process, EObject sf1,
			EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_FWD(ruleresult, pn2ps, flow, prevNode, prevStep, step, process, sf1, pgw, pcgwToStep,
				pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_SplitSeq_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_2_1_bindingFB(SplitSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_2_1_blackFBB(EClass eClass, SplitSeq _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_2_1_bindingAndBlackFFB(SplitSeq _this) {
		Object[] result_pattern_SplitSeq_2_1_binding = pattern_SplitSeq_2_1_bindingFB(_this);
		if (result_pattern_SplitSeq_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SplitSeq_2_1_binding[0];

			Object[] result_pattern_SplitSeq_2_1_black = pattern_SplitSeq_2_1_blackFBB(eClass, _this);
			if (result_pattern_SplitSeq_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SplitSeq_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SplitSeq";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SplitSeq_2_2_bindingFFFFFB(Match match) {
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
			if (tmpProcess instanceof de.abilov.bpmn.Process) {
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
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

	public static final Iterable<Object[]> pattern_SplitSeq_2_2_blackFBFBBBBB(FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					boolean pgwisDiverging = pgw.isIsDiverging();
					if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
						boolean pcgwisDiverging = pcgw.isIsDiverging();
						if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
							for (FN2S pn2ps : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(prevNode, FN2S.class, "source")) {
								Step prevStep = pn2ps.getTarget();
								if (prevStep != null) {
									_result.add(
											new Object[] { pn2ps, prevNode, prevStep, process, sf1, pgw, pcgw, match });
								}

							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SplitSeq_2_3_blackBFBBBBBB(FN2S pn2ps, FlowNode prevNode,
			Step prevStep, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(prevNode)) {
				if (!pcgw.equals(pgw)) {
					if (prevNode.equals(pn2ps.getSource())) {
						if (prevStep.equals(pn2ps.getTarget())) {
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
																for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(prevStep, Flow.class,
																				"steps")) {
																	_result.add(new Object[] { pn2ps, flow, prevNode,
																			prevStep, process, sf1, pgw, pcgw });
																}
															}

														}

													}
												}
											}
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

	public static final Object[] pattern_SplitSeq_2_3_greenBBBBBBBBFFFFFFFFFFFFF(FN2S pn2ps, Flow flow,
			FlowNode prevNode, Step prevStep, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pn2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2ps__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pn2ps__prevNode____source_name_prime = "source";
		String pn2ps__prevStep____target_name_prime = "target";
		String flow__prevStep____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(pn2ps);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(pcgw);
		pn2ps__prevNode____source.setSrc(pn2ps);
		pn2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2ps__prevNode____source);
		pn2ps__prevStep____target.setSrc(pn2ps);
		pn2ps__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(pn2ps__prevStep____target);
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(flow__prevStep____steps);
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
		pn2ps__prevNode____source.setName(pn2ps__prevNode____source_name_prime);
		pn2ps__prevStep____target.setName(pn2ps__prevStep____target_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { pn2ps, flow, prevNode, prevStep, process, sf1, pgw, pcgw, isApplicableMatch,
				pn2ps__prevNode____source, pn2ps__prevStep____target, flow__prevStep____steps,
				process__pgw____flowElements, process__sf1____flowElements, process__prevNode____flowElements,
				process__pcgw____flowElements, sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final Object[] pattern_SplitSeq_2_4_bindingFBBBBBBBBBB(SplitSeq _this,
			IsApplicableMatch isApplicableMatch, FN2S pn2ps, Flow flow, FlowNode prevNode, Step prevStep,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pn2ps, flow, prevNode, prevStep,
				process, sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pn2ps, flow, prevNode, prevStep, process, sf1, pgw,
					pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitSeq_2_4_bindingAndBlackFBBBBBBBBBB(SplitSeq _this,
			IsApplicableMatch isApplicableMatch, FN2S pn2ps, Flow flow, FlowNode prevNode, Step prevStep,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_SplitSeq_2_4_binding = pattern_SplitSeq_2_4_bindingFBBBBBBBBBB(_this, isApplicableMatch,
				pn2ps, flow, prevNode, prevStep, process, sf1, pgw, pcgw);
		if (result_pattern_SplitSeq_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SplitSeq_2_4_binding[0];

			Object[] result_pattern_SplitSeq_2_4_black = pattern_SplitSeq_2_4_blackB(csp);
			if (result_pattern_SplitSeq_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pn2ps, flow, prevNode, prevStep, process, sf1, pgw,
						pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitSeq_2_5_expressionFBB(SplitSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SplitSeq_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SplitSeq";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SplitSeq_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_10_1_blackBBBBB(SplitSeq _this, Match match, Flow flow, Step prevStep,
			ParallelStep step) {
		if (!prevStep.equals(step)) {
			return new Object[] { _this, match, flow, prevStep, step };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_10_2_bindingFBBBBB(SplitSeq _this, Match match, Flow flow,
			Step prevStep, ParallelStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, flow, prevStep, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, flow, prevStep, step };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitSeq_10_2_bindingAndBlackFBBBBB(SplitSeq _this, Match match, Flow flow,
			Step prevStep, ParallelStep step) {
		Object[] result_pattern_SplitSeq_10_2_binding = pattern_SplitSeq_10_2_bindingFBBBBB(_this, match, flow,
				prevStep, step);
		if (result_pattern_SplitSeq_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SplitSeq_10_2_binding[0];

			Object[] result_pattern_SplitSeq_10_2_black = pattern_SplitSeq_10_2_blackB(csp);
			if (result_pattern_SplitSeq_10_2_black != null) {

				return new Object[] { csp, _this, match, flow, prevStep, step };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitSeq_10_3_expressionFBB(SplitSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_10_4_blackBBBB(Match match, Flow flow, Step prevStep,
			ParallelStep step) {
		if (!prevStep.equals(step)) {
			return new Object[] { match, flow, prevStep, step };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_10_4_greenBBBBFF(Match match, Flow flow, Step prevStep,
			ParallelStep step) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String flow__step____steps_name_prime = "steps";
		String prevStep__step____next_name_prime = "next";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		match.getToBeTranslatedEdges().add(prevStep__step____next);
		flow__step____steps.setName(flow__step____steps_name_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		return new Object[] { match, flow, prevStep, step, flow__step____steps, prevStep__step____next };
	}

	public static final Object[] pattern_SplitSeq_10_5_blackBBBB(Match match, Flow flow, Step prevStep,
			ParallelStep step) {
		if (!prevStep.equals(step)) {
			return new Object[] { match, flow, prevStep, step };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_10_5_greenBBBF(Match match, Flow flow, Step prevStep) {
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(flow);
		match.getContextNodes().add(prevStep);
		String flow__prevStep____steps_name_prime = "steps";
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		match.getContextEdges().add(flow__prevStep____steps);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		return new Object[] { match, flow, prevStep, flow__prevStep____steps };
	}

	public static final void pattern_SplitSeq_10_6_expressionBBBBB(SplitSeq _this, Match match, Flow flow,
			Step prevStep, ParallelStep step) {
		_this.registerObjectsToMatch_BWD(match, flow, prevStep, step);

	}

	public static final boolean pattern_SplitSeq_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SplitSeq_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_11_1_bindingFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pn2ps");
		EObject _localVariable_1 = isApplicableMatch.getObject("flow");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("step");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject tmpPn2ps = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpPrevStep = _localVariable_3;
		EObject tmpStep = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		if (tmpPn2ps instanceof FN2S) {
			FN2S pn2ps = (FN2S) tmpPn2ps;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpPrevNode instanceof FlowNode) {
					FlowNode prevNode = (FlowNode) tmpPrevNode;
					if (tmpPrevStep instanceof Step) {
						Step prevStep = (Step) tmpPrevStep;
						if (tmpStep instanceof ParallelStep) {
							ParallelStep step = (ParallelStep) tmpStep;
							if (tmpProcess instanceof de.abilov.bpmn.Process) {
								de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
								return new Object[] { pn2ps, flow, prevNode, prevStep, step, process,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_11_1_blackBBBBBBBFB(FN2S pn2ps, Flow flow, FlowNode prevNode,
			Step prevStep, ParallelStep step, de.abilov.bpmn.Process process, SplitSeq _this,
			IsApplicableMatch isApplicableMatch) {
		if (!prevStep.equals(step)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { pn2ps, flow, prevNode, prevStep, step, process, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_11_1_bindingAndBlackFFFFFFBFB(SplitSeq _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SplitSeq_11_1_binding = pattern_SplitSeq_11_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_SplitSeq_11_1_binding != null) {
			FN2S pn2ps = (FN2S) result_pattern_SplitSeq_11_1_binding[0];
			Flow flow = (Flow) result_pattern_SplitSeq_11_1_binding[1];
			FlowNode prevNode = (FlowNode) result_pattern_SplitSeq_11_1_binding[2];
			Step prevStep = (Step) result_pattern_SplitSeq_11_1_binding[3];
			ParallelStep step = (ParallelStep) result_pattern_SplitSeq_11_1_binding[4];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_SplitSeq_11_1_binding[5];

			Object[] result_pattern_SplitSeq_11_1_black = pattern_SplitSeq_11_1_blackBBBBBBBFB(pn2ps, flow, prevNode,
					prevStep, step, process, _this, isApplicableMatch);
			if (result_pattern_SplitSeq_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SplitSeq_11_1_black[7];

				return new Object[] { pn2ps, flow, prevNode, prevStep, step, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_11_1_greenBBBFFFFFB(FlowNode prevNode, ParallelStep step,
			de.abilov.bpmn.Process process, CSP csp) {
		SequenceFlow sf1 = BpmnFactory.eINSTANCE.createSequenceFlow();
		ParallelGateway pgw = BpmnFactory.eINSTANCE.createParallelGateway();
		FN2S pcgwToStep = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		ParallelGateway pcgw = BpmnFactory.eINSTANCE.createParallelGateway();
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
		return new Object[] { prevNode, step, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_SplitSeq_11_2_blackBBBBBB(ParallelStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_11_2_greenFBBBBBB(ParallelStep step, SequenceFlow sf1,
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

	public static final Object[] pattern_SplitSeq_11_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult, EObject pn2ps,
			EObject flow, EObject prevNode, EObject prevStep, EObject step, EObject process, EObject sf1, EObject pgw,
			EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		if (!pn2ps.equals(prevNode)) {
			if (!pn2ps.equals(prevStep)) {
				if (!pn2ps.equals(step)) {
					if (!pn2ps.equals(process)) {
						if (!pn2ps.equals(sf1)) {
							if (!flow.equals(pn2ps)) {
								if (!flow.equals(prevNode)) {
									if (!flow.equals(prevStep)) {
										if (!flow.equals(step)) {
											if (!flow.equals(process)) {
												if (!flow.equals(sf1)) {
													if (!flow.equals(pgw)) {
														if (!flow.equals(pcgwToStep)) {
															if (!flow.equals(pgwToStep)) {
																if (!flow.equals(pcgw)) {
																	if (!prevNode.equals(prevStep)) {
																		if (!prevNode.equals(step)) {
																			if (!prevNode.equals(process)) {
																				if (!prevNode.equals(sf1)) {
																					if (!prevStep.equals(step)) {
																						if (!prevStep.equals(process)) {
																							if (!prevStep.equals(sf1)) {
																								if (!process
																										.equals(step)) {
																									if (!process.equals(
																											sf1)) {
																										if (!sf1.equals(
																												step)) {
																											if (!pgw.equals(
																													pn2ps)) {
																												if (!pgw.equals(
																														prevNode)) {
																													if (!pgw.equals(
																															prevStep)) {
																														if (!pgw.equals(
																																step)) {
																															if (!pgw.equals(
																																	process)) {
																																if (!pgw.equals(
																																		sf1)) {
																																	if (!pgw.equals(
																																			pgwToStep)) {
																																		if (!pcgwToStep
																																				.equals(pn2ps)) {
																																			if (!pcgwToStep
																																					.equals(prevNode)) {
																																				if (!pcgwToStep
																																						.equals(prevStep)) {
																																					if (!pcgwToStep
																																							.equals(step)) {
																																						if (!pcgwToStep
																																								.equals(process)) {
																																							if (!pcgwToStep
																																									.equals(sf1)) {
																																								if (!pcgwToStep
																																										.equals(pgw)) {
																																									if (!pcgwToStep
																																											.equals(pgwToStep)) {
																																										if (!pgwToStep
																																												.equals(pn2ps)) {
																																											if (!pgwToStep
																																													.equals(prevNode)) {
																																												if (!pgwToStep
																																														.equals(prevStep)) {
																																													if (!pgwToStep
																																															.equals(step)) {
																																														if (!pgwToStep
																																																.equals(process)) {
																																															if (!pgwToStep
																																																	.equals(sf1)) {
																																																if (!pcgw
																																																		.equals(pn2ps)) {
																																																	if (!pcgw
																																																			.equals(prevNode)) {
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
																																																									.equals(pcgwToStep)) {
																																																								if (!pcgw
																																																										.equals(pgwToStep)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											pn2ps,
																																																											flow,
																																																											prevNode,
																																																											prevStep,
																																																											step,
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
											}
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

	public static final Object[] pattern_SplitSeq_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject flow, EObject prevNode, EObject prevStep, EObject step, EObject process, EObject sf1, EObject pgw,
			EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String ruleresult_ruleName_prime = "SplitSeq";
		String flow__step____steps_name_prime = "steps";
		String prevStep__step____next_name_prime = "next";
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
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getTranslatedEdges().add(prevStep__step____next);
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
		prevStep__step____next.setName(prevStep__step____next_name_prime);
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
		return new Object[] { ruleresult, flow, prevNode, prevStep, step, process, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw, flow__step____steps, prevStep__step____next, process__pgw____flowElements,
				process__sf1____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				pcgwToStep__pcgw____source, pcgwToStep__step____target, pgwToStep__pgw____source,
				pgwToStep__step____target };
	}

	public static final void pattern_SplitSeq_11_5_expressionBBBBBBBBBBBBB(SplitSeq _this, PerformRuleResult ruleresult,
			EObject pn2ps, EObject flow, EObject prevNode, EObject prevStep, EObject step, EObject process, EObject sf1,
			EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_BWD(ruleresult, pn2ps, flow, prevNode, prevStep, step, process, sf1, pgw, pcgwToStep,
				pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_SplitSeq_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_12_1_bindingFB(SplitSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_12_1_blackFBB(EClass eClass, SplitSeq _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_12_1_bindingAndBlackFFB(SplitSeq _this) {
		Object[] result_pattern_SplitSeq_12_1_binding = pattern_SplitSeq_12_1_bindingFB(_this);
		if (result_pattern_SplitSeq_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SplitSeq_12_1_binding[0];

			Object[] result_pattern_SplitSeq_12_1_black = pattern_SplitSeq_12_1_blackFBB(eClass, _this);
			if (result_pattern_SplitSeq_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SplitSeq_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SplitSeq";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SplitSeq_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("flow");
		EObject _localVariable_1 = match.getObject("prevStep");
		EObject _localVariable_2 = match.getObject("step");
		EObject tmpFlow = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			if (tmpPrevStep instanceof Step) {
				Step prevStep = (Step) tmpPrevStep;
				if (tmpStep instanceof ParallelStep) {
					ParallelStep step = (ParallelStep) tmpStep;
					return new Object[] { flow, prevStep, step, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitSeq_12_2_blackFBFBBB(Flow flow, Step prevStep,
			ParallelStep step, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevStep.equals(step)) {
			for (FN2S pn2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevStep, FN2S.class,
					"target")) {
				FlowNode prevNode = pn2ps.getSource();
				if (prevNode != null) {
					_result.add(new Object[] { pn2ps, flow, prevNode, prevStep, step, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SplitSeq_12_3_blackBBBBBF(FN2S pn2ps, Flow flow, FlowNode prevNode,
			Step prevStep, ParallelStep step) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevStep.equals(step)) {
			if (prevNode.equals(pn2ps.getSource())) {
				if (prevStep.equals(pn2ps.getTarget())) {
					if (flow.getSteps().contains(prevStep)) {
						if (flow.getSteps().contains(step)) {
							if (step.equals(prevStep.getNext())) {
								for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, de.abilov.bpmn.Process.class,
												"flowElements")) {
									_result.add(new Object[] { pn2ps, flow, prevNode, prevStep, step, process });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SplitSeq_12_3_greenBBBBBBFFFFFFF(FN2S pn2ps, Flow flow, FlowNode prevNode,
			Step prevStep, ParallelStep step, de.abilov.bpmn.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pn2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2ps__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pn2ps__prevNode____source_name_prime = "source";
		String pn2ps__prevStep____target_name_prime = "target";
		String flow__prevStep____steps_name_prime = "steps";
		String flow__step____steps_name_prime = "steps";
		String prevStep__step____next_name_prime = "next";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(pn2ps);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(process);
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
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		isApplicableMatch.getAllContextElements().add(prevStep__step____next);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		pn2ps__prevNode____source.setName(pn2ps__prevNode____source_name_prime);
		pn2ps__prevStep____target.setName(pn2ps__prevStep____target_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { pn2ps, flow, prevNode, prevStep, step, process, isApplicableMatch,
				pn2ps__prevNode____source, pn2ps__prevStep____target, flow__prevStep____steps, flow__step____steps,
				prevStep__step____next, process__prevNode____flowElements };
	}

	public static final Object[] pattern_SplitSeq_12_4_bindingFBBBBBBBB(SplitSeq _this,
			IsApplicableMatch isApplicableMatch, FN2S pn2ps, Flow flow, FlowNode prevNode, Step prevStep,
			ParallelStep step, de.abilov.bpmn.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, pn2ps, flow, prevNode, prevStep, step,
				process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pn2ps, flow, prevNode, prevStep, step, process };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitSeq_12_4_bindingAndBlackFBBBBBBBB(SplitSeq _this,
			IsApplicableMatch isApplicableMatch, FN2S pn2ps, Flow flow, FlowNode prevNode, Step prevStep,
			ParallelStep step, de.abilov.bpmn.Process process) {
		Object[] result_pattern_SplitSeq_12_4_binding = pattern_SplitSeq_12_4_bindingFBBBBBBBB(_this, isApplicableMatch,
				pn2ps, flow, prevNode, prevStep, step, process);
		if (result_pattern_SplitSeq_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SplitSeq_12_4_binding[0];

			Object[] result_pattern_SplitSeq_12_4_black = pattern_SplitSeq_12_4_blackB(csp);
			if (result_pattern_SplitSeq_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pn2ps, flow, prevNode, prevStep, step, process };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitSeq_12_5_expressionFBB(SplitSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SplitSeq_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SplitSeq";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SplitSeq_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_20_1_bindingFB(SplitSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_20_1_blackFBB(EClass __eClass, SplitSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_20_1_bindingAndBlackFFB(SplitSeq _this) {
		Object[] result_pattern_SplitSeq_20_1_binding = pattern_SplitSeq_20_1_bindingFB(_this);
		if (result_pattern_SplitSeq_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitSeq_20_1_binding[0];

			Object[] result_pattern_SplitSeq_20_1_black = pattern_SplitSeq_20_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitSeq_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitSeq_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitSeq_20_2_black_nac_0BB(ParallelStep step, Flow flow) {
		for (Flow __DEC_step_steps_370353 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_370353)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_20_2_black_nac_1BB(ParallelStep step, Step prevStep) {
		if (!prevStep.equals(step)) {
			for (Step __DEC_step_next_71061 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_71061)) {
					if (!prevStep.equals(__DEC_step_next_71061)) {
						return new Object[] { step, prevStep };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitSeq_20_2_blackFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_SplitSeq_20_2_black_nac_0BB(step, flow) == null) {
						for (Step prevStep : flow.getSteps()) {
							if (!prevStep.equals(step)) {
								if (step.equals(prevStep.getNext())) {
									if (pattern_SplitSeq_20_2_black_nac_1BB(step, prevStep) == null) {
										_result.add(new Object[] { flow, prevStep, step, _edge_steps });
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

	public static final Object[] pattern_SplitSeq_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitSeq_20_3_expressionFBBBBB(SplitSeq _this, Match match, Flow flow,
			Step prevStep, ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, flow, prevStep, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitSeq_20_4_expressionFBB(SplitSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitSeq_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitSeq_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_21_1_bindingFB(SplitSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_21_1_blackFBB(EClass __eClass, SplitSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_21_1_bindingAndBlackFFB(SplitSeq _this) {
		Object[] result_pattern_SplitSeq_21_1_binding = pattern_SplitSeq_21_1_bindingFB(_this);
		if (result_pattern_SplitSeq_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitSeq_21_1_binding[0];

			Object[] result_pattern_SplitSeq_21_1_black = pattern_SplitSeq_21_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitSeq_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitSeq_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitSeq_21_2_black_nac_0BB(ParallelStep step, Flow flow) {
		for (Flow __DEC_step_steps_186178 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_186178)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_21_2_black_nac_1BB(ParallelStep step, Step prevStep) {
		if (!prevStep.equals(step)) {
			for (Step __DEC_step_next_272879 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_272879)) {
					if (!prevStep.equals(__DEC_step_next_272879)) {
						return new Object[] { step, prevStep };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitSeq_21_2_blackFFFB(EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevStep = _edge_next.getSrc();
		if (tmpPrevStep instanceof Step) {
			Step prevStep = (Step) tmpPrevStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (!prevStep.equals(step)) {
					if (step.equals(prevStep.getNext())) {
						if (pattern_SplitSeq_21_2_black_nac_1BB(step, prevStep) == null) {
							for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(prevStep, Flow.class, "steps")) {
								if (flow.getSteps().contains(step)) {
									if (pattern_SplitSeq_21_2_black_nac_0BB(step, flow) == null) {
										_result.add(new Object[] { flow, prevStep, step, _edge_next });
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

	public static final Object[] pattern_SplitSeq_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitSeq_21_3_expressionFBBBBB(SplitSeq _this, Match match, Flow flow,
			Step prevStep, ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, flow, prevStep, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitSeq_21_4_expressionFBB(SplitSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitSeq_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitSeq_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_22_1_bindingFB(SplitSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_22_1_blackFBB(EClass __eClass, SplitSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_22_1_bindingAndBlackFFB(SplitSeq _this) {
		Object[] result_pattern_SplitSeq_22_1_binding = pattern_SplitSeq_22_1_bindingFB(_this);
		if (result_pattern_SplitSeq_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitSeq_22_1_binding[0];

			Object[] result_pattern_SplitSeq_22_1_black = pattern_SplitSeq_22_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitSeq_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitSeq_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitSeq_22_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_252135 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_252135)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_22_2_black_nac_1BB(SequenceFlow sf1, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_306657 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_306657)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_22_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_273855 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_273855)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_22_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_497715 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_497715)) {
							if (!prevNode.equals(__DEC_pgw___conv_497715)) {
								if (!pcgw.equals(__DEC_pgw___conv_497715)) {
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

	public static final Object[] pattern_SplitSeq_22_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_44773 = pcgw.get__conv();
					if (__DEC_pcgw___conv_44773 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_44773)) {
							if (!prevNode.equals(__DEC_pcgw___conv_44773)) {
								if (!pgw.equals(__DEC_pcgw___conv_44773)) {
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

	public static final Object[] pattern_SplitSeq_22_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_995435 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_995435)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_22_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_831238 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_831238)) {
							if (!prevNode.equals(__DEC_pcgw___conv_831238)) {
								if (!pgw.equals(__DEC_pcgw___conv_831238)) {
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

	public static final Iterable<Object[]> pattern_SplitSeq_22_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
										if (pattern_SplitSeq_22_2_black_nac_2BB(pgw, process) == null) {
											if (pattern_SplitSeq_22_2_black_nac_5BB(pcgw, process) == null) {
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
																			if (pattern_SplitSeq_22_2_black_nac_1BB(sf1,
																					process) == null) {
																				if (pattern_SplitSeq_22_2_black_nac_0BB(
																						sf1, prevNode) == null) {
																					if (pattern_SplitSeq_22_2_black_nac_3BBB(
																							pgw, prevNode,
																							pcgw) == null) {
																						if (pattern_SplitSeq_22_2_black_nac_4BBB(
																								pcgw, prevNode,
																								pgw) == null) {
																							if (pattern_SplitSeq_22_2_black_nac_6BBB(
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

	public static final Object[] pattern_SplitSeq_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitSeq_22_3_expressionFBBBBBBB(SplitSeq _this, Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitSeq_22_4_expressionFBB(SplitSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitSeq_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitSeq_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_23_1_bindingFB(SplitSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_23_1_blackFBB(EClass __eClass, SplitSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_23_1_bindingAndBlackFFB(SplitSeq _this) {
		Object[] result_pattern_SplitSeq_23_1_binding = pattern_SplitSeq_23_1_bindingFB(_this);
		if (result_pattern_SplitSeq_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitSeq_23_1_binding[0];

			Object[] result_pattern_SplitSeq_23_1_black = pattern_SplitSeq_23_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitSeq_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitSeq_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitSeq_23_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_163678 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_163678)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_23_2_black_nac_1BB(SequenceFlow sf1, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_379974 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_379974)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_23_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_850048 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_850048)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_23_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_129117 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_129117)) {
							if (!prevNode.equals(__DEC_pgw___conv_129117)) {
								if (!pcgw.equals(__DEC_pgw___conv_129117)) {
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

	public static final Object[] pattern_SplitSeq_23_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_38429 = pcgw.get__conv();
					if (__DEC_pcgw___conv_38429 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_38429)) {
							if (!prevNode.equals(__DEC_pcgw___conv_38429)) {
								if (!pgw.equals(__DEC_pcgw___conv_38429)) {
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

	public static final Object[] pattern_SplitSeq_23_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_446717 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_446717)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_23_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_49029 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_49029)) {
							if (!prevNode.equals(__DEC_pcgw___conv_49029)) {
								if (!pgw.equals(__DEC_pcgw___conv_49029)) {
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

	public static final Iterable<Object[]> pattern_SplitSeq_23_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
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
																if (pattern_SplitSeq_23_2_black_nac_1BB(sf1,
																		process) == null) {
																	if (pattern_SplitSeq_23_2_black_nac_2BB(pgw,
																			process) == null) {
																		if (pattern_SplitSeq_23_2_black_nac_0BB(sf1,
																				prevNode) == null) {
																			if (pattern_SplitSeq_23_2_black_nac_3BBB(
																					pgw, prevNode, pcgw) == null) {
																				if (pattern_SplitSeq_23_2_black_nac_4BBB(
																						pcgw, prevNode, pgw) == null) {
																					if (pattern_SplitSeq_23_2_black_nac_5BB(
																							pcgw, process) == null) {
																						if (pattern_SplitSeq_23_2_black_nac_6BBB(
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

	public static final Object[] pattern_SplitSeq_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitSeq_23_3_expressionFBBBBBBB(SplitSeq _this, Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitSeq_23_4_expressionFBB(SplitSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitSeq_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitSeq_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_24_1_bindingFB(SplitSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_24_1_blackFBB(EClass __eClass, SplitSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_24_1_bindingAndBlackFFB(SplitSeq _this) {
		Object[] result_pattern_SplitSeq_24_1_binding = pattern_SplitSeq_24_1_bindingFB(_this);
		if (result_pattern_SplitSeq_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitSeq_24_1_binding[0];

			Object[] result_pattern_SplitSeq_24_1_black = pattern_SplitSeq_24_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitSeq_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitSeq_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitSeq_24_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_71224 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_71224)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_24_2_black_nac_1BB(SequenceFlow sf1, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_853187 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_853187)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_24_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_973962 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_973962)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_24_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_342398 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_342398)) {
							if (!prevNode.equals(__DEC_pgw___conv_342398)) {
								if (!pcgw.equals(__DEC_pgw___conv_342398)) {
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

	public static final Object[] pattern_SplitSeq_24_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_331542 = pcgw.get__conv();
					if (__DEC_pcgw___conv_331542 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_331542)) {
							if (!prevNode.equals(__DEC_pcgw___conv_331542)) {
								if (!pgw.equals(__DEC_pcgw___conv_331542)) {
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

	public static final Object[] pattern_SplitSeq_24_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_424071 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_424071)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_24_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_304676 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_304676)) {
							if (!prevNode.equals(__DEC_pcgw___conv_304676)) {
								if (!pgw.equals(__DEC_pcgw___conv_304676)) {
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

	public static final Iterable<Object[]> pattern_SplitSeq_24_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
						if (pattern_SplitSeq_24_2_black_nac_5BB(pcgw, process) == null) {
							for (FlowElement tmpPgw : process.getFlowElements()) {
								if (tmpPgw instanceof ParallelGateway) {
									ParallelGateway pgw = (ParallelGateway) tmpPgw;
									if (!pcgw.equals(pgw)) {
										if (pcgw.equals(pgw.get__conv())) {
											boolean pgwisDiverging = pgw.isIsDiverging();
											if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
												if (pattern_SplitSeq_24_2_black_nac_2BB(pgw, process) == null) {
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
																				if (pattern_SplitSeq_24_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitSeq_24_2_black_nac_0BB(
																							sf1, prevNode) == null) {
																						if (pattern_SplitSeq_24_2_black_nac_3BBB(
																								pgw, prevNode,
																								pcgw) == null) {
																							if (pattern_SplitSeq_24_2_black_nac_4BBB(
																									pcgw, prevNode,
																									pgw) == null) {
																								if (pattern_SplitSeq_24_2_black_nac_6BBB(
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

		}

		return _result;
	}

	public static final Object[] pattern_SplitSeq_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitSeq_24_3_expressionFBBBBBBB(SplitSeq _this, Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitSeq_24_4_expressionFBB(SplitSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitSeq_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitSeq_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_25_1_bindingFB(SplitSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_25_1_blackFBB(EClass __eClass, SplitSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_25_1_bindingAndBlackFFB(SplitSeq _this) {
		Object[] result_pattern_SplitSeq_25_1_binding = pattern_SplitSeq_25_1_bindingFB(_this);
		if (result_pattern_SplitSeq_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitSeq_25_1_binding[0];

			Object[] result_pattern_SplitSeq_25_1_black = pattern_SplitSeq_25_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitSeq_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitSeq_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitSeq_25_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_517548 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_517548)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_25_2_black_nac_1BB(SequenceFlow sf1, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_627749 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_627749)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_25_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_565873 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_565873)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_25_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_270192 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_270192)) {
							if (!prevNode.equals(__DEC_pgw___conv_270192)) {
								if (!pcgw.equals(__DEC_pgw___conv_270192)) {
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

	public static final Object[] pattern_SplitSeq_25_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_750097 = pcgw.get__conv();
					if (__DEC_pcgw___conv_750097 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_750097)) {
							if (!prevNode.equals(__DEC_pcgw___conv_750097)) {
								if (!pgw.equals(__DEC_pcgw___conv_750097)) {
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

	public static final Object[] pattern_SplitSeq_25_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_426232 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_426232)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_25_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_147630 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_147630)) {
							if (!prevNode.equals(__DEC_pcgw___conv_147630)) {
								if (!pgw.equals(__DEC_pcgw___conv_147630)) {
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

	public static final Iterable<Object[]> pattern_SplitSeq_25_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
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
												if (pattern_SplitSeq_25_2_black_nac_0BB(sf1, prevNode) == null) {
													if (pattern_SplitSeq_25_2_black_nac_3BBB(pgw, prevNode,
															pcgw) == null) {
														if (pattern_SplitSeq_25_2_black_nac_4BBB(pcgw, prevNode,
																pgw) == null) {
															if (pattern_SplitSeq_25_2_black_nac_6BBB(pcgw, prevNode,
																	pgw) == null) {
																for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(sf1,
																				de.abilov.bpmn.Process.class,
																				"flowElements")) {
																	if (process.getFlowElements().contains(pgw)) {
																		if (process.getFlowElements()
																				.contains(prevNode)) {
																			if (process.getFlowElements()
																					.contains(pcgw)) {
																				if (pattern_SplitSeq_25_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitSeq_25_2_black_nac_2BB(
																							pgw, process) == null) {
																						if (pattern_SplitSeq_25_2_black_nac_5BB(
																								pcgw,
																								process) == null) {
																							_result.add(new Object[] {
																									prevNode, process,
																									sf1, pgw, pcgw,
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

	public static final Object[] pattern_SplitSeq_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitSeq_25_3_expressionFBBBBBBB(SplitSeq _this, Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitSeq_25_4_expressionFBB(SplitSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitSeq_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitSeq_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_26_1_bindingFB(SplitSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_26_1_blackFBB(EClass __eClass, SplitSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_26_1_bindingAndBlackFFB(SplitSeq _this) {
		Object[] result_pattern_SplitSeq_26_1_binding = pattern_SplitSeq_26_1_bindingFB(_this);
		if (result_pattern_SplitSeq_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitSeq_26_1_binding[0];

			Object[] result_pattern_SplitSeq_26_1_black = pattern_SplitSeq_26_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitSeq_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitSeq_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitSeq_26_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_4575 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_4575)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_26_2_black_nac_1BB(SequenceFlow sf1, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_84118 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_84118)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_26_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_445411 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_445411)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_26_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_624780 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_624780)) {
							if (!prevNode.equals(__DEC_pgw___conv_624780)) {
								if (!pcgw.equals(__DEC_pgw___conv_624780)) {
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

	public static final Object[] pattern_SplitSeq_26_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_800597 = pcgw.get__conv();
					if (__DEC_pcgw___conv_800597 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_800597)) {
							if (!prevNode.equals(__DEC_pcgw___conv_800597)) {
								if (!pgw.equals(__DEC_pcgw___conv_800597)) {
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

	public static final Object[] pattern_SplitSeq_26_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_787143 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_787143)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_26_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_426621 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_426621)) {
							if (!prevNode.equals(__DEC_pcgw___conv_426621)) {
								if (!pgw.equals(__DEC_pcgw___conv_426621)) {
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

	public static final Iterable<Object[]> pattern_SplitSeq_26_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
												if (pattern_SplitSeq_26_2_black_nac_0BB(sf1, prevNode) == null) {
													if (pattern_SplitSeq_26_2_black_nac_3BBB(pgw, prevNode,
															pcgw) == null) {
														if (pattern_SplitSeq_26_2_black_nac_4BBB(pcgw, prevNode,
																pgw) == null) {
															if (pattern_SplitSeq_26_2_black_nac_6BBB(pcgw, prevNode,
																	pgw) == null) {
																for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(pgw,
																				de.abilov.bpmn.Process.class,
																				"flowElements")) {
																	if (process.getFlowElements().contains(sf1)) {
																		if (process.getFlowElements()
																				.contains(prevNode)) {
																			if (process.getFlowElements()
																					.contains(pcgw)) {
																				if (pattern_SplitSeq_26_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitSeq_26_2_black_nac_2BB(
																							pgw, process) == null) {
																						if (pattern_SplitSeq_26_2_black_nac_5BB(
																								pcgw,
																								process) == null) {
																							_result.add(new Object[] {
																									prevNode, process,
																									sf1, pgw, pcgw,
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

	public static final Object[] pattern_SplitSeq_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitSeq_26_3_expressionFBBBBBBB(SplitSeq _this, Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitSeq_26_4_expressionFBB(SplitSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitSeq_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitSeq_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_27_1_bindingFB(SplitSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_27_1_blackFBB(EClass __eClass, SplitSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_27_1_bindingAndBlackFFB(SplitSeq _this) {
		Object[] result_pattern_SplitSeq_27_1_binding = pattern_SplitSeq_27_1_bindingFB(_this);
		if (result_pattern_SplitSeq_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitSeq_27_1_binding[0];

			Object[] result_pattern_SplitSeq_27_1_black = pattern_SplitSeq_27_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitSeq_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitSeq_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitSeq_27_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_649213 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_649213)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_27_2_black_nac_1BB(SequenceFlow sf1, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_602068 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_602068)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_27_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_607556 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_607556)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_27_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_775640 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_775640)) {
							if (!prevNode.equals(__DEC_pgw___conv_775640)) {
								if (!pcgw.equals(__DEC_pgw___conv_775640)) {
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

	public static final Object[] pattern_SplitSeq_27_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_906444 = pcgw.get__conv();
					if (__DEC_pcgw___conv_906444 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_906444)) {
							if (!prevNode.equals(__DEC_pcgw___conv_906444)) {
								if (!pgw.equals(__DEC_pcgw___conv_906444)) {
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

	public static final Object[] pattern_SplitSeq_27_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_751708 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_751708)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_27_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_25473 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_25473)) {
							if (!prevNode.equals(__DEC_pcgw___conv_25473)) {
								if (!pgw.equals(__DEC_pcgw___conv_25473)) {
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

	public static final Iterable<Object[]> pattern_SplitSeq_27_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
												if (pattern_SplitSeq_27_2_black_nac_0BB(sf1, prevNode) == null) {
													if (pattern_SplitSeq_27_2_black_nac_3BBB(pgw, prevNode,
															pcgw) == null) {
														if (pattern_SplitSeq_27_2_black_nac_4BBB(pcgw, prevNode,
																pgw) == null) {
															if (pattern_SplitSeq_27_2_black_nac_6BBB(pcgw, prevNode,
																	pgw) == null) {
																for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(pgw,
																				de.abilov.bpmn.Process.class,
																				"flowElements")) {
																	if (process.getFlowElements().contains(sf1)) {
																		if (process.getFlowElements()
																				.contains(prevNode)) {
																			if (process.getFlowElements()
																					.contains(pcgw)) {
																				if (pattern_SplitSeq_27_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitSeq_27_2_black_nac_2BB(
																							pgw, process) == null) {
																						if (pattern_SplitSeq_27_2_black_nac_5BB(
																								pcgw,
																								process) == null) {
																							_result.add(new Object[] {
																									prevNode, process,
																									sf1, pgw, pcgw,
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

	public static final Object[] pattern_SplitSeq_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitSeq_27_3_expressionFBBBBBBB(SplitSeq _this, Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitSeq_27_4_expressionFBB(SplitSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitSeq_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitSeq_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_28_1_bindingFB(SplitSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_28_1_blackFBB(EClass __eClass, SplitSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_28_1_bindingAndBlackFFB(SplitSeq _this) {
		Object[] result_pattern_SplitSeq_28_1_binding = pattern_SplitSeq_28_1_bindingFB(_this);
		if (result_pattern_SplitSeq_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitSeq_28_1_binding[0];

			Object[] result_pattern_SplitSeq_28_1_black = pattern_SplitSeq_28_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitSeq_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitSeq_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitSeq_28_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_842930 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_842930)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_28_2_black_nac_1BB(SequenceFlow sf1, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_158203 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_158203)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_28_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_169373 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_169373)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_28_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_432924 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_432924)) {
							if (!prevNode.equals(__DEC_pgw___conv_432924)) {
								if (!pcgw.equals(__DEC_pgw___conv_432924)) {
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

	public static final Object[] pattern_SplitSeq_28_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_806997 = pcgw.get__conv();
					if (__DEC_pcgw___conv_806997 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_806997)) {
							if (!prevNode.equals(__DEC_pcgw___conv_806997)) {
								if (!pgw.equals(__DEC_pcgw___conv_806997)) {
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

	public static final Object[] pattern_SplitSeq_28_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_579080 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_579080)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_28_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_222412 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_222412)) {
							if (!prevNode.equals(__DEC_pcgw___conv_222412)) {
								if (!pgw.equals(__DEC_pcgw___conv_222412)) {
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

	public static final Iterable<Object[]> pattern_SplitSeq_28_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
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
												if (pattern_SplitSeq_28_2_black_nac_0BB(sf1, prevNode) == null) {
													if (pattern_SplitSeq_28_2_black_nac_3BBB(pgw, prevNode,
															pcgw) == null) {
														if (pattern_SplitSeq_28_2_black_nac_4BBB(pcgw, prevNode,
																pgw) == null) {
															if (pattern_SplitSeq_28_2_black_nac_6BBB(pcgw, prevNode,
																	pgw) == null) {
																for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(sf1,
																				de.abilov.bpmn.Process.class,
																				"flowElements")) {
																	if (process.getFlowElements().contains(pgw)) {
																		if (process.getFlowElements()
																				.contains(prevNode)) {
																			if (process.getFlowElements()
																					.contains(pcgw)) {
																				if (pattern_SplitSeq_28_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitSeq_28_2_black_nac_2BB(
																							pgw, process) == null) {
																						if (pattern_SplitSeq_28_2_black_nac_5BB(
																								pcgw,
																								process) == null) {
																							_result.add(new Object[] {
																									prevNode, process,
																									sf1, pgw, pcgw,
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

		return _result;
	}

	public static final Object[] pattern_SplitSeq_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitSeq_28_3_expressionFBBBBBBB(SplitSeq _this, Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitSeq_28_4_expressionFBB(SplitSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitSeq_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitSeq_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitSeq_29_1_bindingFB(SplitSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_29_1_blackFBB(EClass __eClass, SplitSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_29_1_bindingAndBlackFFB(SplitSeq _this) {
		Object[] result_pattern_SplitSeq_29_1_binding = pattern_SplitSeq_29_1_bindingFB(_this);
		if (result_pattern_SplitSeq_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitSeq_29_1_binding[0];

			Object[] result_pattern_SplitSeq_29_1_black = pattern_SplitSeq_29_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitSeq_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitSeq_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitSeq_29_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_805153 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_805153)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_29_2_black_nac_1BB(SequenceFlow sf1, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_352783 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_352783)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_29_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_867510 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_867510)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_29_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_168044 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_168044)) {
							if (!prevNode.equals(__DEC_pgw___conv_168044)) {
								if (!pcgw.equals(__DEC_pgw___conv_168044)) {
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

	public static final Object[] pattern_SplitSeq_29_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_832028 = pcgw.get__conv();
					if (__DEC_pcgw___conv_832028 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_832028)) {
							if (!prevNode.equals(__DEC_pcgw___conv_832028)) {
								if (!pgw.equals(__DEC_pcgw___conv_832028)) {
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

	public static final Object[] pattern_SplitSeq_29_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_595818 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_595818)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitSeq_29_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_284180 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_284180)) {
							if (!prevNode.equals(__DEC_pcgw___conv_284180)) {
								if (!pgw.equals(__DEC_pcgw___conv_284180)) {
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

	public static final Iterable<Object[]> pattern_SplitSeq_29_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
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
												if (pattern_SplitSeq_29_2_black_nac_0BB(sf1, prevNode) == null) {
													if (pattern_SplitSeq_29_2_black_nac_3BBB(pgw, prevNode,
															pcgw) == null) {
														if (pattern_SplitSeq_29_2_black_nac_4BBB(pcgw, prevNode,
																pgw) == null) {
															if (pattern_SplitSeq_29_2_black_nac_6BBB(pcgw, prevNode,
																	pgw) == null) {
																for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(prevNode,
																				de.abilov.bpmn.Process.class,
																				"flowElements")) {
																	if (process.getFlowElements().contains(pgw)) {
																		if (process.getFlowElements().contains(sf1)) {
																			if (process.getFlowElements()
																					.contains(pcgw)) {
																				if (pattern_SplitSeq_29_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitSeq_29_2_black_nac_2BB(
																							pgw, process) == null) {
																						if (pattern_SplitSeq_29_2_black_nac_5BB(
																								pcgw,
																								process) == null) {
																							_result.add(new Object[] {
																									prevNode, process,
																									sf1, pgw, pcgw,
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

		return _result;
	}

	public static final Object[] pattern_SplitSeq_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitSeq_29_3_expressionFBBBBBBB(SplitSeq _this, Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitSeq_29_4_expressionFBB(SplitSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitSeq_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitSeq_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitSeq_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SplitSeqImpl