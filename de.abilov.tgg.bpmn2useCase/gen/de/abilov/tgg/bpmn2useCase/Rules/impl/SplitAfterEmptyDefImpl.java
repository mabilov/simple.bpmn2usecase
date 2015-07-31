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
import de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef;

import de.abilov.useCase.ChoiceStep;
import de.abilov.useCase.Flow;
import de.abilov.useCase.NormalStep;
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
 * An implementation of the model object '<em><b>Split After Empty Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SplitAfterEmptyDefImpl extends AbstractRuleImpl implements SplitAfterEmptyDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitAfterEmptyDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSplitAfterEmptyDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExclusiveGateway prevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		// initial bindings
		Object[] result1_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_0_1_blackBBBBBBB(this, match,
				prevNode, process, sf1, pgw, pcgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process
							+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_0_2_bindingAndBlackFBBBBBBB(this, match, prevNode, process, sf1, pgw, pcgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = "
					+ process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_0_4_blackBBBBBB(match, prevNode,
					process, sf1, pgw, pcgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
						+ "[pcgw] = " + pcgw + ".");
			}
			SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_0_4_greenBBBBBBFFFFFFFF(match, prevNode, process, sf1,
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
			Object[] result5_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_0_5_blackBBBBBB(match, prevNode,
					process, sf1, pgw, pcgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process + ", "
								+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
			}
			SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_0_6_expressionBBBBBBB(this, match, prevNode, process, sf1,
					pgw, pcgw);
			return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_0_7_expressionF();
		} else {
			return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_1_1_bindingAndBlackFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep choiceStep = (ChoiceStep) result1_bindingAndBlack[1];
		GW2S pn2cs = (GW2S) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[4];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[5];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[6];
		ParallelGateway pcgw = (ParallelGateway) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_1_1_greenBFBBFFBB(choiceStep, flow,
				pgw, pcgw, csp);
		NormalStep step = (NormalStep) result1_green[1];
		FN2S pcgwToStep = (FN2S) result1_green[4];
		GW2S pgwToStep = (GW2S) result1_green[5];

		// collect translated elements
		Object[] result2_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_1_2_blackBBBBBB(step, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = "
					+ pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_1_2_greenFBBBBBB(step, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_1_3_blackBBBBBBBBBBBB(ruleresult,
				prevNode, choiceStep, pn2cs, step, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[choiceStep] = "
					+ choiceStep + ", " + "[pn2cs] = " + pn2cs + ", " + "[step] = " + step + ", " + "[flow] = " + flow
					+ ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
					+ "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw
					+ ".");
		}
		SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, prevNode,
				choiceStep, step, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge choiceStep__step____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[12];
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
		SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_1_5_expressionBBBBBBBBBBBBB(this, ruleresult, prevNode,
				choiceStep, pn2cs, step, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[0];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ParallelGateway pgw = (ParallelGateway) result2_binding[3];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[4];
		for (Object[] result2_black : SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_2_2_blackBFFBBBBB(prevNode,
				process, sf1, pgw, pcgw, match)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[1];
			GW2S pn2cs = (GW2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_2_3_blackBBBFBBBB(prevNode,
					choiceStep, pn2cs, process, sf1, pgw, pcgw)) {
				Flow flow = (Flow) result3_black[3];
				Object[] result3_green = SplitAfterEmptyDefImpl
						.pattern_SplitAfterEmptyDef_2_3_greenBBBBBBBBFFFFFFFFFFFFFF(prevNode, choiceStep, pn2cs, flow,
								process, sf1, pgw, pcgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge choiceStep__choiceStep______lastInDef = (EMoflonEdge) result3_green[9];
				// EMoflonEdge pn2cs__prevNode____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge pn2cs__choiceStep____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[18];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[19];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[20];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[21];

				// solve CSP
				Object[] result4_bindingAndBlack = SplitAfterEmptyDefImpl
						.pattern_SplitAfterEmptyDef_2_4_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, prevNode,
								choiceStep, pn2cs, flow, process, sf1, pgw, pcgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[choiceStep] = " + choiceStep + ", " + "[pn2cs] = "
							+ pn2cs + ", " + "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[sf1] = "
							+ sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ExclusiveGateway prevNode, de.abilov.bpmn.Process process,
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
	public CSP isAppropriate_solveCsp_FWD(Match match, ExclusiveGateway prevNode, de.abilov.bpmn.Process process,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Flow flow, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {// Create CSP
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
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("choiceStep", choiceStep);
		isApplicableMatch.registerObject("pn2cs", pn2cs);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs,
			EObject step, EObject flow, EObject process, EObject sf1, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("choiceStep", choiceStep);
		ruleresult.registerObject("pn2cs", pn2cs);
		ruleresult.registerObject("step", step);
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
	public boolean isAppropriate_BWD(Match match, ChoiceStep choiceStep, NormalStep step, Flow flow) {
		// initial bindings
		Object[] result1_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_10_1_blackBBBBB(this, match,
				choiceStep, step, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
					+ "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_10_2_bindingAndBlackFBBBBB(this, match, choiceStep, step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", " + "[step] = "
					+ step + ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_10_4_blackBBBB(match, choiceStep,
					step, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
						+ "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_10_4_greenBBBBFF(match, choiceStep, step, flow);
			// EMoflonEdge choiceStep__step____next = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_10_5_blackBBBB(match, choiceStep,
					step, flow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
						+ "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_10_5_greenBBBFF(match, choiceStep, flow);
			// EMoflonEdge choiceStep__choiceStep______lastInDef = (EMoflonEdge) result5_green[3];
			// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result5_green[4];

			// register objects to match
			SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_10_6_expressionBBBBB(this, match, choiceStep, step, flow);
			return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_10_7_expressionF();
		} else {
			return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_11_1_bindingAndBlackFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep choiceStep = (ChoiceStep) result1_bindingAndBlack[1];
		GW2S pn2cs = (GW2S) result1_bindingAndBlack[2];
		NormalStep step = (NormalStep) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_11_1_greenBBBFFFFFB(prevNode, step,
				process, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[3];
		ParallelGateway pgw = (ParallelGateway) result1_green[4];
		FN2S pcgwToStep = (FN2S) result1_green[5];
		GW2S pgwToStep = (GW2S) result1_green[6];
		ParallelGateway pcgw = (ParallelGateway) result1_green[7];

		// collect translated elements
		Object[] result2_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_11_2_blackBBBBBB(step, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = "
					+ pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_11_2_greenFBBBBBB(step, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_11_3_blackBBBBBBBBBBBB(ruleresult,
				prevNode, choiceStep, pn2cs, step, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[choiceStep] = "
					+ choiceStep + ", " + "[pn2cs] = " + pn2cs + ", " + "[step] = " + step + ", " + "[flow] = " + flow
					+ ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
					+ "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw
					+ ".");
		}
		SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, prevNode,
				choiceStep, step, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge choiceStep__step____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[12];
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
		SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_11_5_expressionBBBBBBBBBBBBB(this, ruleresult, prevNode,
				choiceStep, pn2cs, step, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ChoiceStep choiceStep = (ChoiceStep) result2_binding[0];
		NormalStep step = (NormalStep) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		for (Object[] result2_black : SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_12_2_blackFBFBBB(choiceStep,
				step, flow, match)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			GW2S pn2cs = (GW2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_12_3_blackBBBBBF(prevNode,
					choiceStep, pn2cs, step, flow)) {
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result3_black[5];
				Object[] result3_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_12_3_greenBBBBBBFFFFFFFF(
						prevNode, choiceStep, pn2cs, step, flow, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge choiceStep__step____next = (EMoflonEdge) result3_green[7];
				// EMoflonEdge choiceStep__choiceStep______lastInDef = (EMoflonEdge) result3_green[8];
				// EMoflonEdge pn2cs__prevNode____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge pn2cs__choiceStep____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[13];

				// solve CSP
				Object[] result4_bindingAndBlack = SplitAfterEmptyDefImpl
						.pattern_SplitAfterEmptyDef_12_4_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, prevNode,
								choiceStep, pn2cs, step, flow, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[choiceStep] = " + choiceStep + ", " + "[pn2cs] = "
							+ pn2cs + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", " + "[process] = "
							+ process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ChoiceStep choiceStep, NormalStep step, Flow flow) {
		match.registerObject("choiceStep", choiceStep);
		match.registerObject("step", step);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ChoiceStep choiceStep, NormalStep step, Flow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, NormalStep step, Flow flow, de.abilov.bpmn.Process process) {// Create CSP
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
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("choiceStep", choiceStep);
		isApplicableMatch.registerObject("pn2cs", pn2cs);
		isApplicableMatch.registerObject("step", step);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs,
			EObject step, EObject flow, EObject process, EObject sf1, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("choiceStep", choiceStep);
		ruleresult.registerObject("pn2cs", pn2cs);
		ruleresult.registerObject("step", step);
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
				.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_176(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_20_2_blackFFFB(_edge_next)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[0];
			NormalStep step = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_20_3_expressionFBBBBB(this, match, choiceStep, step,
					flow)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_20_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_177(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_21_2_blackFFFB(_edge_steps)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[0];
			NormalStep step = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_21_3_expressionFBBBBB(this, match, choiceStep, step,
					flow)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_21_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_575(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_22_2_blackFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_22_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_22_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_576(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_23_2_blackFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_23_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_23_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_577(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_24_2_blackFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_24_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_24_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_578(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_25_2_blackFFFFFB(_edge_targetRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_25_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_25_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_579(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_26_2_blackFFFFFB(_edge_incoming)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_26_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_26_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_580(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_27_2_blackFFFFFB(_edge___conv)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_27_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_27_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_581(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_28_2_blackFFFFFB(_edge_sourceRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_28_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_28_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_582(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterEmptyDefImpl
				.pattern_SplitAfterEmptyDef_29_2_blackFFFFFB(_edge_outgoing)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_29_3_expressionFBBBBBBB(this, match, prevNode,
					process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_29_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_29_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterEmptyDefImpl.pattern_SplitAfterEmptyDef_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SplitAfterEmptyDef");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForChoiceStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("choiceStep")).findAny();
		de.abilov.useCase.ChoiceStep choiceStep = (de.abilov.useCase.ChoiceStep) matchForChoiceStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pn2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPn2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

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

		if (!(prevNode.isIsDiverging() == false)) {
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

		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SplitAfterEmptyDef");
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
		ruleResult.setRule("SplitAfterEmptyDef");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForChoiceStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("choiceStep")).findAny();
		de.abilov.useCase.ChoiceStep choiceStep = (de.abilov.useCase.ChoiceStep) matchForChoiceStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pn2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPn2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

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

		if (!(prevNode.isIsDiverging() == false)) {
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

		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SplitAfterEmptyDef");
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
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(de.abilov.bpmn.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(de.abilov.bpmn.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
			return null;
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(de.abilov.bpmn.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_FLOW_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (Flow) arguments.get(4),
					(de.abilov.bpmn.Process) arguments.get(5), (SequenceFlow) arguments.get(6),
					(ParallelGateway) arguments.get(7), (ParallelGateway) arguments.get(8));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_NORMALSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(NormalStep) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_NORMALSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(NormalStep) arguments.get(2), (Flow) arguments.get(3));
			return null;
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_NORMALSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(NormalStep) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_NORMALSTEP_FLOW_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (NormalStep) arguments.get(4),
					(Flow) arguments.get(5), (de.abilov.bpmn.Process) arguments.get(6));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_176__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_176((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_177__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_177((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_575__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_575((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_576__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_576((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_577__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_577((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_578__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_578((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_579__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_579((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_580__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_580((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_581__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_581((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_582__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_582((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SplitAfterEmptyDef_0_1_blackBBBBBBB(SplitAfterEmptyDef _this, Match match,
			ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { _this, match, prevNode, process, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_0_2_bindingFBBBBBBB(SplitAfterEmptyDef _this, Match match,
			ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, process, sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, process, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_0_2_bindingAndBlackFBBBBBBB(SplitAfterEmptyDef _this,
			Match match, ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_SplitAfterEmptyDef_0_2_binding = pattern_SplitAfterEmptyDef_0_2_bindingFBBBBBBB(_this,
				match, prevNode, process, sf1, pgw, pcgw);
		if (result_pattern_SplitAfterEmptyDef_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterEmptyDef_0_2_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_0_2_black = pattern_SplitAfterEmptyDef_0_2_blackB(csp);
			if (result_pattern_SplitAfterEmptyDef_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, process, sf1, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterEmptyDef_0_3_expressionFBB(SplitAfterEmptyDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_0_4_blackBBBBBB(Match match, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { match, prevNode, process, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_0_4_greenBBBBBBFFFFFFFF(Match match,
			ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
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

	public static final Object[] pattern_SplitAfterEmptyDef_0_5_blackBBBBBB(Match match, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { match, prevNode, process, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_0_5_greenBBBF(Match match, ExclusiveGateway prevNode,
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

	public static final void pattern_SplitAfterEmptyDef_0_6_expressionBBBBBBB(SplitAfterEmptyDef _this, Match match,
			ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		_this.registerObjectsToMatch_FWD(match, prevNode, process, sf1, pgw, pcgw);

	}

	public static final boolean pattern_SplitAfterEmptyDef_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SplitAfterEmptyDef_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_1_1_bindingFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("choiceStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("pn2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_6 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_7 = isApplicableMatch.getObject("pcgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpChoiceStep = _localVariable_1;
		EObject tmpPn2cs = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpSf1 = _localVariable_5;
		EObject tmpPgw = _localVariable_6;
		EObject tmpPcgw = _localVariable_7;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpChoiceStep instanceof ChoiceStep) {
				ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
				if (tmpPn2cs instanceof GW2S) {
					GW2S pn2cs = (GW2S) tmpPn2cs;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpProcess instanceof de.abilov.bpmn.Process) {
							de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (tmpPgw instanceof ParallelGateway) {
									ParallelGateway pgw = (ParallelGateway) tmpPgw;
									if (tmpPcgw instanceof ParallelGateway) {
										ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
										return new Object[] { prevNode, choiceStep, pn2cs, flow, process, sf1, pgw,
												pcgw, isApplicableMatch };
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

	public static final Object[] pattern_SplitAfterEmptyDef_1_1_blackBBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Flow flow, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, SplitAfterEmptyDef _this, IsApplicableMatch isApplicableMatch) {
		if (!pcgw.equals(pgw)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { prevNode, choiceStep, pn2cs, flow, process, sf1, pgw, pcgw, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_1_1_bindingAndBlackFFFFFFFFBFB(SplitAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SplitAfterEmptyDef_1_1_binding = pattern_SplitAfterEmptyDef_1_1_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SplitAfterEmptyDef_1_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_SplitAfterEmptyDef_1_1_binding[0];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_SplitAfterEmptyDef_1_1_binding[1];
			GW2S pn2cs = (GW2S) result_pattern_SplitAfterEmptyDef_1_1_binding[2];
			Flow flow = (Flow) result_pattern_SplitAfterEmptyDef_1_1_binding[3];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_SplitAfterEmptyDef_1_1_binding[4];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_SplitAfterEmptyDef_1_1_binding[5];
			ParallelGateway pgw = (ParallelGateway) result_pattern_SplitAfterEmptyDef_1_1_binding[6];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_SplitAfterEmptyDef_1_1_binding[7];

			Object[] result_pattern_SplitAfterEmptyDef_1_1_black = pattern_SplitAfterEmptyDef_1_1_blackBBBBBBBBBFB(
					prevNode, choiceStep, pn2cs, flow, process, sf1, pgw, pcgw, _this, isApplicableMatch);
			if (result_pattern_SplitAfterEmptyDef_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SplitAfterEmptyDef_1_1_black[9];

				return new Object[] { prevNode, choiceStep, pn2cs, flow, process, sf1, pgw, pcgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_1_1_greenBFBBFFBB(ChoiceStep choiceStep, Flow flow,
			ParallelGateway pgw, ParallelGateway pcgw, CSP csp) {
		NormalStep step = UseCaseFactory.eINSTANCE.createNormalStep();
		FN2S pcgwToStep = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		choiceStep.setNext(step);
		flow.getSteps().add(step);
		pcgwToStep.setSource(pcgw);
		pcgwToStep.setTarget(step);
		pgwToStep.setSource(pgw);
		pgwToStep.setTarget(step);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { choiceStep, step, flow, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_1_2_blackBBBBBB(NormalStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_1_2_greenFBBBBBB(NormalStep step, SequenceFlow sf1,
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

	public static final Object[] pattern_SplitAfterEmptyDef_1_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject choiceStep, EObject pn2cs, EObject step, EObject flow, EObject process,
			EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		if (!prevNode.equals(step)) {
			if (!prevNode.equals(process)) {
				if (!prevNode.equals(sf1)) {
					if (!choiceStep.equals(prevNode)) {
						if (!choiceStep.equals(pn2cs)) {
							if (!choiceStep.equals(step)) {
								if (!choiceStep.equals(flow)) {
									if (!choiceStep.equals(process)) {
										if (!choiceStep.equals(sf1)) {
											if (!choiceStep.equals(pgw)) {
												if (!choiceStep.equals(pcgwToStep)) {
													if (!choiceStep.equals(pgwToStep)) {
														if (!choiceStep.equals(pcgw)) {
															if (!pn2cs.equals(prevNode)) {
																if (!pn2cs.equals(step)) {
																	if (!pn2cs.equals(process)) {
																		if (!pn2cs.equals(sf1)) {
																			if (!flow.equals(prevNode)) {
																				if (!flow.equals(pn2cs)) {
																					if (!flow.equals(step)) {
																						if (!flow.equals(process)) {
																							if (!flow.equals(sf1)) {
																								if (!flow.equals(pgw)) {
																									if (!flow.equals(
																											pcgwToStep)) {
																										if (!flow
																												.equals(pgwToStep)) {
																											if (!flow
																													.equals(pcgw)) {
																												if (!process
																														.equals(step)) {
																													if (!process
																															.equals(sf1)) {
																														if (!sf1.equals(
																																step)) {
																															if (!pgw.equals(
																																	prevNode)) {
																																if (!pgw.equals(
																																		pn2cs)) {
																																	if (!pgw.equals(
																																			step)) {
																																		if (!pgw.equals(
																																				process)) {
																																			if (!pgw.equals(
																																					sf1)) {
																																				if (!pgw.equals(
																																						pgwToStep)) {
																																					if (!pcgwToStep
																																							.equals(prevNode)) {
																																						if (!pcgwToStep
																																								.equals(pn2cs)) {
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
																																														.equals(prevNode)) {
																																													if (!pgwToStep
																																															.equals(pn2cs)) {
																																														if (!pgwToStep
																																																.equals(step)) {
																																															if (!pgwToStep
																																																	.equals(process)) {
																																																if (!pgwToStep
																																																		.equals(sf1)) {
																																																	if (!pcgw
																																																			.equals(prevNode)) {
																																																		if (!pcgw
																																																				.equals(pn2cs)) {
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
																																																											prevNode,
																																																											choiceStep,
																																																											pn2cs,
																																																											step,
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
											}
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

	public static final Object[] pattern_SplitAfterEmptyDef_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject step, EObject flow,
			EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		EMoflonEdge choiceStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String ruleresult_ruleName_prime = "SplitAfterEmptyDef";
		String choiceStep__step____next_name_prime = "next";
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
		choiceStep__step____next.setSrc(choiceStep);
		choiceStep__step____next.setTrg(step);
		ruleresult.getCreatedEdges().add(choiceStep__step____next);
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
		choiceStep__step____next.setName(choiceStep__step____next_name_prime);
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
		return new Object[] { ruleresult, prevNode, choiceStep, step, flow, process, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw, choiceStep__step____next, flow__step____steps, process__pgw____flowElements,
				process__sf1____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				pcgwToStep__pcgw____source, pcgwToStep__step____target, pgwToStep__pgw____source,
				pgwToStep__step____target };
	}

	public static final void pattern_SplitAfterEmptyDef_1_5_expressionBBBBBBBBBBBBB(SplitAfterEmptyDef _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs, EObject step,
			EObject flow, EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep,
			EObject pcgw) {
		_this.registerObjects_FWD(ruleresult, prevNode, choiceStep, pn2cs, step, flow, process, sf1, pgw, pcgwToStep,
				pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_SplitAfterEmptyDef_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_2_1_bindingFB(SplitAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_2_1_blackFBB(EClass eClass, SplitAfterEmptyDef _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_2_1_bindingAndBlackFFB(SplitAfterEmptyDef _this) {
		Object[] result_pattern_SplitAfterEmptyDef_2_1_binding = pattern_SplitAfterEmptyDef_2_1_bindingFB(_this);
		if (result_pattern_SplitAfterEmptyDef_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SplitAfterEmptyDef_2_1_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_2_1_black = pattern_SplitAfterEmptyDef_2_1_blackFBB(eClass,
					_this);
			if (result_pattern_SplitAfterEmptyDef_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SplitAfterEmptyDef_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SplitAfterEmptyDef";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_2_2_bindingFFFFFB(Match match) {
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
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
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

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_2_2_blackBFFBBBBB(ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pcgw.equals(pgw)) {
			boolean prevNodeisDiverging = prevNode.isIsDiverging();
			if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
				boolean pgwisDiverging = pgw.isIsDiverging();
				if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
					boolean pcgwisDiverging = pcgw.isIsDiverging();
					if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
						for (GW2S pn2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevNode,
								GW2S.class, "source")) {
							Step tmpChoiceStep = pn2cs.getTarget();
							if (tmpChoiceStep instanceof ChoiceStep) {
								ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
								_result.add(
										new Object[] { prevNode, choiceStep, pn2cs, process, sf1, pgw, pcgw, match });
							}

						}
					}

				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_2_3_blackBBBFBBBB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pcgw.equals(pgw)) {
			if (choiceStep.equals(choiceStep.get__lastInDef())) {
				if (prevNode.equals(pn2cs.getSource())) {
					if (choiceStep.equals(pn2cs.getTarget())) {
						if (process.getFlowElements().contains(pgw)) {
							if (process.getFlowElements().contains(sf1)) {
								if (process.getFlowElements().contains(prevNode)) {
									if (process.getFlowElements().contains(pcgw)) {
										if (pgw.equals(sf1.getTargetRef())) {
											if (pcgw.equals(pgw.get__conv())) {
												if (prevNode.equals(sf1.getSourceRef())) {
													boolean prevNodeisDiverging = prevNode.isIsDiverging();
													if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
														boolean pgwisDiverging = pgw.isIsDiverging();
														if (Boolean.valueOf(pgwisDiverging)
																.equals(Boolean.valueOf(true))) {
															boolean pcgwisDiverging = pcgw.isIsDiverging();
															if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
																for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(choiceStep,
																				Flow.class, "steps")) {
																	_result.add(new Object[] { prevNode, choiceStep,
																			pn2cs, flow, process, sf1, pgw, pcgw });
																}
															}

														}

													}

												}
											}
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

	public static final Object[] pattern_SplitAfterEmptyDef_2_3_greenBBBBBBBBFFFFFFFFFFFFFF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Flow flow, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge choiceStep__choiceStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__choiceStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String choiceStep__choiceStep______lastInDef_name_prime = "__lastInDef";
		String pn2cs__prevNode____source_name_prime = "source";
		String pn2cs__choiceStep____target_name_prime = "target";
		String flow__choiceStep____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(pcgw);
		choiceStep__choiceStep______lastInDef.setSrc(choiceStep);
		choiceStep__choiceStep______lastInDef.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(choiceStep__choiceStep______lastInDef);
		pn2cs__prevNode____source.setSrc(pn2cs);
		pn2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2cs__prevNode____source);
		pn2cs__choiceStep____target.setSrc(pn2cs);
		pn2cs__choiceStep____target.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs__choiceStep____target);
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(flow__choiceStep____steps);
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
		choiceStep__choiceStep______lastInDef.setName(choiceStep__choiceStep______lastInDef_name_prime);
		pn2cs__prevNode____source.setName(pn2cs__prevNode____source_name_prime);
		pn2cs__choiceStep____target.setName(pn2cs__choiceStep____target_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { prevNode, choiceStep, pn2cs, flow, process, sf1, pgw, pcgw, isApplicableMatch,
				choiceStep__choiceStep______lastInDef, pn2cs__prevNode____source, pn2cs__choiceStep____target,
				flow__choiceStep____steps, process__pgw____flowElements, process__sf1____flowElements,
				process__prevNode____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_2_4_bindingFBBBBBBBBBB(SplitAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Flow flow, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, prevNode, choiceStep, pn2cs, flow,
				process, sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, flow, process, sf1, pgw,
					pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_2_4_bindingAndBlackFBBBBBBBBBB(SplitAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Flow flow, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_SplitAfterEmptyDef_2_4_binding = pattern_SplitAfterEmptyDef_2_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, prevNode, choiceStep, pn2cs, flow, process, sf1, pgw, pcgw);
		if (result_pattern_SplitAfterEmptyDef_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterEmptyDef_2_4_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_2_4_black = pattern_SplitAfterEmptyDef_2_4_blackB(csp);
			if (result_pattern_SplitAfterEmptyDef_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, flow, process, sf1,
						pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterEmptyDef_2_5_expressionFBB(SplitAfterEmptyDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SplitAfterEmptyDef";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SplitAfterEmptyDef_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_10_1_blackBBBBB(SplitAfterEmptyDef _this, Match match,
			ChoiceStep choiceStep, NormalStep step, Flow flow) {
		return new Object[] { _this, match, choiceStep, step, flow };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_10_2_bindingFBBBBB(SplitAfterEmptyDef _this, Match match,
			ChoiceStep choiceStep, NormalStep step, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, choiceStep, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, choiceStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_10_2_bindingAndBlackFBBBBB(SplitAfterEmptyDef _this,
			Match match, ChoiceStep choiceStep, NormalStep step, Flow flow) {
		Object[] result_pattern_SplitAfterEmptyDef_10_2_binding = pattern_SplitAfterEmptyDef_10_2_bindingFBBBBB(_this,
				match, choiceStep, step, flow);
		if (result_pattern_SplitAfterEmptyDef_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterEmptyDef_10_2_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_10_2_black = pattern_SplitAfterEmptyDef_10_2_blackB(csp);
			if (result_pattern_SplitAfterEmptyDef_10_2_black != null) {

				return new Object[] { csp, _this, match, choiceStep, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterEmptyDef_10_3_expressionFBB(SplitAfterEmptyDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_10_4_blackBBBB(Match match, ChoiceStep choiceStep,
			NormalStep step, Flow flow) {
		return new Object[] { match, choiceStep, step, flow };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_10_4_greenBBBBFF(Match match, ChoiceStep choiceStep,
			NormalStep step, Flow flow) {
		EMoflonEdge choiceStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String choiceStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		choiceStep__step____next.setSrc(choiceStep);
		choiceStep__step____next.setTrg(step);
		match.getToBeTranslatedEdges().add(choiceStep__step____next);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		choiceStep__step____next.setName(choiceStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, choiceStep, step, flow, choiceStep__step____next, flow__step____steps };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_10_5_blackBBBB(Match match, ChoiceStep choiceStep,
			NormalStep step, Flow flow) {
		return new Object[] { match, choiceStep, step, flow };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_10_5_greenBBBFF(Match match, ChoiceStep choiceStep,
			Flow flow) {
		EMoflonEdge choiceStep__choiceStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(choiceStep);
		match.getContextNodes().add(flow);
		String choiceStep__choiceStep______lastInDef_name_prime = "__lastInDef";
		String flow__choiceStep____steps_name_prime = "steps";
		choiceStep__choiceStep______lastInDef.setSrc(choiceStep);
		choiceStep__choiceStep______lastInDef.setTrg(choiceStep);
		match.getContextEdges().add(choiceStep__choiceStep______lastInDef);
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		match.getContextEdges().add(flow__choiceStep____steps);
		choiceStep__choiceStep______lastInDef.setName(choiceStep__choiceStep______lastInDef_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		return new Object[] { match, choiceStep, flow, choiceStep__choiceStep______lastInDef,
				flow__choiceStep____steps };
	}

	public static final void pattern_SplitAfterEmptyDef_10_6_expressionBBBBB(SplitAfterEmptyDef _this, Match match,
			ChoiceStep choiceStep, NormalStep step, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, choiceStep, step, flow);

	}

	public static final boolean pattern_SplitAfterEmptyDef_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SplitAfterEmptyDef_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_11_1_bindingFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("choiceStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("pn2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("step");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpChoiceStep = _localVariable_1;
		EObject tmpPn2cs = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpChoiceStep instanceof ChoiceStep) {
				ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
				if (tmpPn2cs instanceof GW2S) {
					GW2S pn2cs = (GW2S) tmpPn2cs;
					if (tmpStep instanceof NormalStep) {
						NormalStep step = (NormalStep) tmpStep;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpProcess instanceof de.abilov.bpmn.Process) {
								de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
								return new Object[] { prevNode, choiceStep, pn2cs, step, flow, process,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_11_1_blackBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, NormalStep step, Flow flow, de.abilov.bpmn.Process process,
			SplitAfterEmptyDef _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { prevNode, choiceStep, pn2cs, step, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_11_1_bindingAndBlackFFFFFFBFB(SplitAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SplitAfterEmptyDef_11_1_binding = pattern_SplitAfterEmptyDef_11_1_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SplitAfterEmptyDef_11_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_SplitAfterEmptyDef_11_1_binding[0];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_SplitAfterEmptyDef_11_1_binding[1];
			GW2S pn2cs = (GW2S) result_pattern_SplitAfterEmptyDef_11_1_binding[2];
			NormalStep step = (NormalStep) result_pattern_SplitAfterEmptyDef_11_1_binding[3];
			Flow flow = (Flow) result_pattern_SplitAfterEmptyDef_11_1_binding[4];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_SplitAfterEmptyDef_11_1_binding[5];

			Object[] result_pattern_SplitAfterEmptyDef_11_1_black = pattern_SplitAfterEmptyDef_11_1_blackBBBBBBBFB(
					prevNode, choiceStep, pn2cs, step, flow, process, _this, isApplicableMatch);
			if (result_pattern_SplitAfterEmptyDef_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SplitAfterEmptyDef_11_1_black[7];

				return new Object[] { prevNode, choiceStep, pn2cs, step, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_11_1_greenBBBFFFFFB(ExclusiveGateway prevNode,
			NormalStep step, de.abilov.bpmn.Process process, CSP csp) {
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

	public static final Object[] pattern_SplitAfterEmptyDef_11_2_blackBBBBBB(NormalStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_11_2_greenFBBBBBB(NormalStep step, SequenceFlow sf1,
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

	public static final Object[] pattern_SplitAfterEmptyDef_11_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject choiceStep, EObject pn2cs, EObject step, EObject flow, EObject process,
			EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		if (!prevNode.equals(step)) {
			if (!prevNode.equals(process)) {
				if (!prevNode.equals(sf1)) {
					if (!choiceStep.equals(prevNode)) {
						if (!choiceStep.equals(pn2cs)) {
							if (!choiceStep.equals(step)) {
								if (!choiceStep.equals(flow)) {
									if (!choiceStep.equals(process)) {
										if (!choiceStep.equals(sf1)) {
											if (!choiceStep.equals(pgw)) {
												if (!choiceStep.equals(pcgwToStep)) {
													if (!choiceStep.equals(pgwToStep)) {
														if (!choiceStep.equals(pcgw)) {
															if (!pn2cs.equals(prevNode)) {
																if (!pn2cs.equals(step)) {
																	if (!pn2cs.equals(process)) {
																		if (!pn2cs.equals(sf1)) {
																			if (!flow.equals(prevNode)) {
																				if (!flow.equals(pn2cs)) {
																					if (!flow.equals(step)) {
																						if (!flow.equals(process)) {
																							if (!flow.equals(sf1)) {
																								if (!flow.equals(pgw)) {
																									if (!flow.equals(
																											pcgwToStep)) {
																										if (!flow
																												.equals(pgwToStep)) {
																											if (!flow
																													.equals(pcgw)) {
																												if (!process
																														.equals(step)) {
																													if (!process
																															.equals(sf1)) {
																														if (!sf1.equals(
																																step)) {
																															if (!pgw.equals(
																																	prevNode)) {
																																if (!pgw.equals(
																																		pn2cs)) {
																																	if (!pgw.equals(
																																			step)) {
																																		if (!pgw.equals(
																																				process)) {
																																			if (!pgw.equals(
																																					sf1)) {
																																				if (!pgw.equals(
																																						pgwToStep)) {
																																					if (!pcgwToStep
																																							.equals(prevNode)) {
																																						if (!pcgwToStep
																																								.equals(pn2cs)) {
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
																																														.equals(prevNode)) {
																																													if (!pgwToStep
																																															.equals(pn2cs)) {
																																														if (!pgwToStep
																																																.equals(step)) {
																																															if (!pgwToStep
																																																	.equals(process)) {
																																																if (!pgwToStep
																																																		.equals(sf1)) {
																																																	if (!pcgw
																																																			.equals(prevNode)) {
																																																		if (!pcgw
																																																				.equals(pn2cs)) {
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
																																																											prevNode,
																																																											choiceStep,
																																																											pn2cs,
																																																											step,
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
											}
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

	public static final Object[] pattern_SplitAfterEmptyDef_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject step, EObject flow,
			EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		EMoflonEdge choiceStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String ruleresult_ruleName_prime = "SplitAfterEmptyDef";
		String choiceStep__step____next_name_prime = "next";
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
		choiceStep__step____next.setSrc(choiceStep);
		choiceStep__step____next.setTrg(step);
		ruleresult.getTranslatedEdges().add(choiceStep__step____next);
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
		choiceStep__step____next.setName(choiceStep__step____next_name_prime);
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
		return new Object[] { ruleresult, prevNode, choiceStep, step, flow, process, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw, choiceStep__step____next, flow__step____steps, process__pgw____flowElements,
				process__sf1____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				pcgwToStep__pcgw____source, pcgwToStep__step____target, pgwToStep__pgw____source,
				pgwToStep__step____target };
	}

	public static final void pattern_SplitAfterEmptyDef_11_5_expressionBBBBBBBBBBBBB(SplitAfterEmptyDef _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs, EObject step,
			EObject flow, EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep,
			EObject pcgw) {
		_this.registerObjects_BWD(ruleresult, prevNode, choiceStep, pn2cs, step, flow, process, sf1, pgw, pcgwToStep,
				pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_SplitAfterEmptyDef_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_12_1_bindingFB(SplitAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_12_1_blackFBB(EClass eClass, SplitAfterEmptyDef _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_12_1_bindingAndBlackFFB(SplitAfterEmptyDef _this) {
		Object[] result_pattern_SplitAfterEmptyDef_12_1_binding = pattern_SplitAfterEmptyDef_12_1_bindingFB(_this);
		if (result_pattern_SplitAfterEmptyDef_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SplitAfterEmptyDef_12_1_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_12_1_black = pattern_SplitAfterEmptyDef_12_1_blackFBB(eClass,
					_this);
			if (result_pattern_SplitAfterEmptyDef_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SplitAfterEmptyDef_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SplitAfterEmptyDef";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("choiceStep");
		EObject _localVariable_1 = match.getObject("step");
		EObject _localVariable_2 = match.getObject("flow");
		EObject tmpChoiceStep = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		if (tmpChoiceStep instanceof ChoiceStep) {
			ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					return new Object[] { choiceStep, step, flow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_12_2_blackFBFBBB(ChoiceStep choiceStep,
			NormalStep step, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (GW2S pn2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(choiceStep, GW2S.class,
				"target")) {
			Gateway tmpPrevNode = pn2cs.getSource();
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				boolean prevNodeisDiverging = prevNode.isIsDiverging();
				if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
					_result.add(new Object[] { prevNode, choiceStep, pn2cs, step, flow, match });
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_12_3_blackBBBBBF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, NormalStep step, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (step.equals(choiceStep.getNext())) {
			if (choiceStep.equals(choiceStep.get__lastInDef())) {
				if (prevNode.equals(pn2cs.getSource())) {
					if (choiceStep.equals(pn2cs.getTarget())) {
						if (flow.getSteps().contains(choiceStep)) {
							if (flow.getSteps().contains(step)) {
								boolean prevNodeisDiverging = prevNode.isIsDiverging();
								if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
									for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(prevNode, de.abilov.bpmn.Process.class,
													"flowElements")) {
										_result.add(new Object[] { prevNode, choiceStep, pn2cs, step, flow, process });
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

	public static final Object[] pattern_SplitAfterEmptyDef_12_3_greenBBBBBBFFFFFFFF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, NormalStep step, Flow flow, de.abilov.bpmn.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge choiceStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge choiceStep__choiceStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__choiceStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String choiceStep__step____next_name_prime = "next";
		String choiceStep__choiceStep______lastInDef_name_prime = "__lastInDef";
		String pn2cs__prevNode____source_name_prime = "source";
		String pn2cs__choiceStep____target_name_prime = "target";
		String flow__choiceStep____steps_name_prime = "steps";
		String flow__step____steps_name_prime = "steps";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		choiceStep__step____next.setSrc(choiceStep);
		choiceStep__step____next.setTrg(step);
		isApplicableMatch.getAllContextElements().add(choiceStep__step____next);
		choiceStep__choiceStep______lastInDef.setSrc(choiceStep);
		choiceStep__choiceStep______lastInDef.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(choiceStep__choiceStep______lastInDef);
		pn2cs__prevNode____source.setSrc(pn2cs);
		pn2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2cs__prevNode____source);
		pn2cs__choiceStep____target.setSrc(pn2cs);
		pn2cs__choiceStep____target.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs__choiceStep____target);
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(flow__choiceStep____steps);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		choiceStep__step____next.setName(choiceStep__step____next_name_prime);
		choiceStep__choiceStep______lastInDef.setName(choiceStep__choiceStep______lastInDef_name_prime);
		pn2cs__prevNode____source.setName(pn2cs__prevNode____source_name_prime);
		pn2cs__choiceStep____target.setName(pn2cs__choiceStep____target_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { prevNode, choiceStep, pn2cs, step, flow, process, isApplicableMatch,
				choiceStep__step____next, choiceStep__choiceStep______lastInDef, pn2cs__prevNode____source,
				pn2cs__choiceStep____target, flow__choiceStep____steps, flow__step____steps,
				process__prevNode____flowElements };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_12_4_bindingFBBBBBBBB(SplitAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			NormalStep step, Flow flow, de.abilov.bpmn.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, prevNode, choiceStep, pn2cs, step,
				flow, process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, step, flow, process };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_12_4_bindingAndBlackFBBBBBBBB(SplitAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			NormalStep step, Flow flow, de.abilov.bpmn.Process process) {
		Object[] result_pattern_SplitAfterEmptyDef_12_4_binding = pattern_SplitAfterEmptyDef_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, prevNode, choiceStep, pn2cs, step, flow, process);
		if (result_pattern_SplitAfterEmptyDef_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterEmptyDef_12_4_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_12_4_black = pattern_SplitAfterEmptyDef_12_4_blackB(csp);
			if (result_pattern_SplitAfterEmptyDef_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, step, flow, process };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterEmptyDef_12_5_expressionFBB(SplitAfterEmptyDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SplitAfterEmptyDef";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SplitAfterEmptyDef_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_20_1_bindingFB(SplitAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_20_1_blackFBB(EClass __eClass, SplitAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_20_1_bindingAndBlackFFB(SplitAfterEmptyDef _this) {
		Object[] result_pattern_SplitAfterEmptyDef_20_1_binding = pattern_SplitAfterEmptyDef_20_1_bindingFB(_this);
		if (result_pattern_SplitAfterEmptyDef_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterEmptyDef_20_1_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_20_1_black = pattern_SplitAfterEmptyDef_20_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterEmptyDef_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterEmptyDef_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_20_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_426846 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_426846)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_20_2_black_nac_1BB(NormalStep step, ChoiceStep choiceStep) {
		for (Step __DEC_step_next_297022 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_297022)) {
				if (!choiceStep.equals(__DEC_step_next_297022)) {
					return new Object[] { step, choiceStep };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_20_2_blackFFFB(EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpChoiceStep = _edge_next.getSrc();
		if (tmpChoiceStep instanceof ChoiceStep) {
			ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
			if (choiceStep.equals(choiceStep.get__lastInDef())) {
				EObject tmpStep = _edge_next.getTrg();
				if (tmpStep instanceof NormalStep) {
					NormalStep step = (NormalStep) tmpStep;
					if (step.equals(choiceStep.getNext())) {
						if (pattern_SplitAfterEmptyDef_20_2_black_nac_1BB(step, choiceStep) == null) {
							for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(choiceStep, Flow.class, "steps")) {
								if (flow.getSteps().contains(step)) {
									if (pattern_SplitAfterEmptyDef_20_2_black_nac_0BB(step, flow) == null) {
										_result.add(new Object[] { choiceStep, step, flow, _edge_next });
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

	public static final Object[] pattern_SplitAfterEmptyDef_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterEmptyDef_20_3_expressionFBBBBB(SplitAfterEmptyDef _this, Match match,
			ChoiceStep choiceStep, NormalStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, choiceStep, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterEmptyDef_20_4_expressionFBB(SplitAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterEmptyDef_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_21_1_bindingFB(SplitAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_21_1_blackFBB(EClass __eClass, SplitAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_21_1_bindingAndBlackFFB(SplitAfterEmptyDef _this) {
		Object[] result_pattern_SplitAfterEmptyDef_21_1_binding = pattern_SplitAfterEmptyDef_21_1_bindingFB(_this);
		if (result_pattern_SplitAfterEmptyDef_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterEmptyDef_21_1_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_21_1_black = pattern_SplitAfterEmptyDef_21_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterEmptyDef_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterEmptyDef_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_21_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_242201 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_242201)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_21_2_black_nac_1BB(NormalStep step, ChoiceStep choiceStep) {
		for (Step __DEC_step_next_455677 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_455677)) {
				if (!choiceStep.equals(__DEC_step_next_455677)) {
					return new Object[] { step, choiceStep };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_21_2_blackFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_SplitAfterEmptyDef_21_2_black_nac_0BB(step, flow) == null) {
						for (Step tmpChoiceStep : flow.getSteps()) {
							if (tmpChoiceStep instanceof ChoiceStep) {
								ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
								if (step.equals(choiceStep.getNext())) {
									if (choiceStep.equals(choiceStep.get__lastInDef())) {
										if (pattern_SplitAfterEmptyDef_21_2_black_nac_1BB(step, choiceStep) == null) {
											_result.add(new Object[] { choiceStep, step, flow, _edge_steps });
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

	public static final Object[] pattern_SplitAfterEmptyDef_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterEmptyDef_21_3_expressionFBBBBB(SplitAfterEmptyDef _this, Match match,
			ChoiceStep choiceStep, NormalStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, choiceStep, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterEmptyDef_21_4_expressionFBB(SplitAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterEmptyDef_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_1_bindingFB(SplitAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_1_blackFBB(EClass __eClass, SplitAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_1_bindingAndBlackFFB(SplitAfterEmptyDef _this) {
		Object[] result_pattern_SplitAfterEmptyDef_22_1_binding = pattern_SplitAfterEmptyDef_22_1_bindingFB(_this);
		if (result_pattern_SplitAfterEmptyDef_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterEmptyDef_22_1_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_22_1_black = pattern_SplitAfterEmptyDef_22_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterEmptyDef_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterEmptyDef_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_497165 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_497165)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_173747 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_173747)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_96689 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_96689)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_752780 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_752780)) {
					if (!prevNode.equals(__DEC_pgw___conv_752780)) {
						if (!pcgw.equals(__DEC_pgw___conv_752780)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_782470 = pcgw.get__conv();
			if (__DEC_pcgw___conv_782470 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_782470)) {
					if (!prevNode.equals(__DEC_pcgw___conv_782470)) {
						if (!pgw.equals(__DEC_pcgw___conv_782470)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_869394 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_869394)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_570175 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_570175)) {
					if (!prevNode.equals(__DEC_pcgw___conv_570175)) {
						if (!pgw.equals(__DEC_pcgw___conv_570175)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_22_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
										if (pattern_SplitAfterEmptyDef_22_2_black_nac_2BB(pgw, process) == null) {
											if (pattern_SplitAfterEmptyDef_22_2_black_nac_5BB(pcgw, process) == null) {
												for (FlowElement tmpSf1 : process.getFlowElements()) {
													if (tmpSf1 instanceof SequenceFlow) {
														SequenceFlow sf1 = (SequenceFlow) tmpSf1;
														if (pgw.equals(sf1.getTargetRef())) {
															FlowNode tmpPrevNode = sf1.getSourceRef();
															if (tmpPrevNode instanceof ExclusiveGateway) {
																ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
																if (process.getFlowElements().contains(prevNode)) {
																	boolean prevNodeisDiverging = prevNode
																			.isIsDiverging();
																	if (Boolean.valueOf(prevNodeisDiverging)
																			.equals(false)) {
																		if (pattern_SplitAfterEmptyDef_22_2_black_nac_1BB(
																				sf1, process) == null) {
																			if (pattern_SplitAfterEmptyDef_22_2_black_nac_0BB(
																					sf1, prevNode) == null) {
																				if (pattern_SplitAfterEmptyDef_22_2_black_nac_3BBB(
																						pgw, prevNode, pcgw) == null) {
																					if (pattern_SplitAfterEmptyDef_22_2_black_nac_4BBB(
																							pcgw, prevNode,
																							pgw) == null) {
																						if (pattern_SplitAfterEmptyDef_22_2_black_nac_6BBB(
																								pcgw, prevNode,
																								pgw) == null) {
																							if (pattern_SplitAfterEmptyDef_22_2_black_nac_7BB(
																									prevNode,
																									sf1) == null) {
																								if (pattern_SplitAfterEmptyDef_22_2_black_nac_8BB(
																										prevNode,
																										pgw) == null) {
																									if (pattern_SplitAfterEmptyDef_22_2_black_nac_9BB(
																											pcgw,
																											prevNode) == null) {
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

		}

		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterEmptyDef_22_3_expressionFBBBBBBB(SplitAfterEmptyDef _this,
			Match match, ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterEmptyDef_22_4_expressionFBB(SplitAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterEmptyDef_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_1_bindingFB(SplitAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_1_blackFBB(EClass __eClass, SplitAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_1_bindingAndBlackFFB(SplitAfterEmptyDef _this) {
		Object[] result_pattern_SplitAfterEmptyDef_23_1_binding = pattern_SplitAfterEmptyDef_23_1_bindingFB(_this);
		if (result_pattern_SplitAfterEmptyDef_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterEmptyDef_23_1_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_23_1_black = pattern_SplitAfterEmptyDef_23_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterEmptyDef_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterEmptyDef_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_980005 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_980005)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_308481 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_308481)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_205922 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_205922)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_983115 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_983115)) {
					if (!prevNode.equals(__DEC_pgw___conv_983115)) {
						if (!pcgw.equals(__DEC_pgw___conv_983115)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_20913 = pcgw.get__conv();
			if (__DEC_pcgw___conv_20913 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_20913)) {
					if (!prevNode.equals(__DEC_pcgw___conv_20913)) {
						if (!pgw.equals(__DEC_pcgw___conv_20913)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_718139 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_718139)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_885216 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_885216)) {
					if (!prevNode.equals(__DEC_pcgw___conv_885216)) {
						if (!pgw.equals(__DEC_pcgw___conv_885216)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_23_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
							FlowNode tmpPrevNode = sf1.getSourceRef();
							if (tmpPrevNode instanceof ExclusiveGateway) {
								ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
								if (process.getFlowElements().contains(prevNode)) {
									Gateway tmpPcgw = pgw.get__conv();
									if (tmpPcgw instanceof ParallelGateway) {
										ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
										if (!pcgw.equals(pgw)) {
											if (process.getFlowElements().contains(pcgw)) {
												boolean pgwisDiverging = pgw.isIsDiverging();
												if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
													boolean prevNodeisDiverging = prevNode.isIsDiverging();
													if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
														boolean pcgwisDiverging = pcgw.isIsDiverging();
														if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
															if (pattern_SplitAfterEmptyDef_23_2_black_nac_1BB(sf1,
																	process) == null) {
																if (pattern_SplitAfterEmptyDef_23_2_black_nac_2BB(pgw,
																		process) == null) {
																	if (pattern_SplitAfterEmptyDef_23_2_black_nac_0BB(
																			sf1, prevNode) == null) {
																		if (pattern_SplitAfterEmptyDef_23_2_black_nac_7BB(
																				prevNode, sf1) == null) {
																			if (pattern_SplitAfterEmptyDef_23_2_black_nac_8BB(
																					prevNode, pgw) == null) {
																				if (pattern_SplitAfterEmptyDef_23_2_black_nac_3BBB(
																						pgw, prevNode, pcgw) == null) {
																					if (pattern_SplitAfterEmptyDef_23_2_black_nac_4BBB(
																							pcgw, prevNode,
																							pgw) == null) {
																						if (pattern_SplitAfterEmptyDef_23_2_black_nac_5BB(
																								pcgw,
																								process) == null) {
																							if (pattern_SplitAfterEmptyDef_23_2_black_nac_6BBB(
																									pcgw, prevNode,
																									pgw) == null) {
																								if (pattern_SplitAfterEmptyDef_23_2_black_nac_9BB(
																										pcgw,
																										prevNode) == null) {
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

	public static final Object[] pattern_SplitAfterEmptyDef_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterEmptyDef_23_3_expressionFBBBBBBB(SplitAfterEmptyDef _this,
			Match match, ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterEmptyDef_23_4_expressionFBB(SplitAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterEmptyDef_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_1_bindingFB(SplitAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_1_blackFBB(EClass __eClass, SplitAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_1_bindingAndBlackFFB(SplitAfterEmptyDef _this) {
		Object[] result_pattern_SplitAfterEmptyDef_24_1_binding = pattern_SplitAfterEmptyDef_24_1_bindingFB(_this);
		if (result_pattern_SplitAfterEmptyDef_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterEmptyDef_24_1_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_24_1_black = pattern_SplitAfterEmptyDef_24_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterEmptyDef_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterEmptyDef_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_636095 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_636095)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_143418 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_143418)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_24873 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_24873)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_139073 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_139073)) {
					if (!prevNode.equals(__DEC_pgw___conv_139073)) {
						if (!pcgw.equals(__DEC_pgw___conv_139073)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_708907 = pcgw.get__conv();
			if (__DEC_pcgw___conv_708907 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_708907)) {
					if (!prevNode.equals(__DEC_pcgw___conv_708907)) {
						if (!pgw.equals(__DEC_pcgw___conv_708907)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_222326 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_222326)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_363302 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_363302)) {
					if (!prevNode.equals(__DEC_pcgw___conv_363302)) {
						if (!pgw.equals(__DEC_pcgw___conv_363302)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_24_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
						if (pattern_SplitAfterEmptyDef_24_2_black_nac_5BB(pcgw, process) == null) {
							for (FlowElement tmpPgw : process.getFlowElements()) {
								if (tmpPgw instanceof ParallelGateway) {
									ParallelGateway pgw = (ParallelGateway) tmpPgw;
									if (!pcgw.equals(pgw)) {
										if (pcgw.equals(pgw.get__conv())) {
											boolean pgwisDiverging = pgw.isIsDiverging();
											if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
												if (pattern_SplitAfterEmptyDef_24_2_black_nac_2BB(pgw,
														process) == null) {
													for (FlowElement tmpSf1 : process.getFlowElements()) {
														if (tmpSf1 instanceof SequenceFlow) {
															SequenceFlow sf1 = (SequenceFlow) tmpSf1;
															if (pgw.equals(sf1.getTargetRef())) {
																FlowNode tmpPrevNode = sf1.getSourceRef();
																if (tmpPrevNode instanceof ExclusiveGateway) {
																	ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
																	if (process.getFlowElements().contains(prevNode)) {
																		boolean prevNodeisDiverging = prevNode
																				.isIsDiverging();
																		if (Boolean.valueOf(prevNodeisDiverging)
																				.equals(false)) {
																			if (pattern_SplitAfterEmptyDef_24_2_black_nac_1BB(
																					sf1, process) == null) {
																				if (pattern_SplitAfterEmptyDef_24_2_black_nac_0BB(
																						sf1, prevNode) == null) {
																					if (pattern_SplitAfterEmptyDef_24_2_black_nac_3BBB(
																							pgw, prevNode,
																							pcgw) == null) {
																						if (pattern_SplitAfterEmptyDef_24_2_black_nac_4BBB(
																								pcgw, prevNode,
																								pgw) == null) {
																							if (pattern_SplitAfterEmptyDef_24_2_black_nac_6BBB(
																									pcgw, prevNode,
																									pgw) == null) {
																								if (pattern_SplitAfterEmptyDef_24_2_black_nac_7BB(
																										prevNode,
																										sf1) == null) {
																									if (pattern_SplitAfterEmptyDef_24_2_black_nac_8BB(
																											prevNode,
																											pgw) == null) {
																										if (pattern_SplitAfterEmptyDef_24_2_black_nac_9BB(
																												pcgw,
																												prevNode) == null) {
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
			}

		}

		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterEmptyDef_24_3_expressionFBBBBBBB(SplitAfterEmptyDef _this,
			Match match, ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterEmptyDef_24_4_expressionFBB(SplitAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterEmptyDef_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_1_bindingFB(SplitAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_1_blackFBB(EClass __eClass, SplitAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_1_bindingAndBlackFFB(SplitAfterEmptyDef _this) {
		Object[] result_pattern_SplitAfterEmptyDef_25_1_binding = pattern_SplitAfterEmptyDef_25_1_bindingFB(_this);
		if (result_pattern_SplitAfterEmptyDef_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterEmptyDef_25_1_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_25_1_black = pattern_SplitAfterEmptyDef_25_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterEmptyDef_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterEmptyDef_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_529735 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_529735)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_359829 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_359829)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_505254 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_505254)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_852133 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_852133)) {
					if (!prevNode.equals(__DEC_pgw___conv_852133)) {
						if (!pcgw.equals(__DEC_pgw___conv_852133)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_780628 = pcgw.get__conv();
			if (__DEC_pcgw___conv_780628 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_780628)) {
					if (!prevNode.equals(__DEC_pcgw___conv_780628)) {
						if (!pgw.equals(__DEC_pcgw___conv_780628)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_343500 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_343500)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_430994 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_430994)) {
					if (!prevNode.equals(__DEC_pcgw___conv_430994)) {
						if (!pgw.equals(__DEC_pcgw___conv_430994)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_25_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
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
									if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
										boolean pcgwisDiverging = pcgw.isIsDiverging();
										if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
											if (pattern_SplitAfterEmptyDef_25_2_black_nac_0BB(sf1, prevNode) == null) {
												if (pattern_SplitAfterEmptyDef_25_2_black_nac_7BB(prevNode,
														sf1) == null) {
													if (pattern_SplitAfterEmptyDef_25_2_black_nac_8BB(prevNode,
															pgw) == null) {
														if (pattern_SplitAfterEmptyDef_25_2_black_nac_3BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_SplitAfterEmptyDef_25_2_black_nac_4BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_SplitAfterEmptyDef_25_2_black_nac_6BBB(pcgw,
																		prevNode, pgw) == null) {
																	if (pattern_SplitAfterEmptyDef_25_2_black_nac_9BB(
																			pcgw, prevNode) == null) {
																		for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(sf1,
																						de.abilov.bpmn.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(pgw)) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (pattern_SplitAfterEmptyDef_25_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_SplitAfterEmptyDef_25_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_SplitAfterEmptyDef_25_2_black_nac_5BB(
																										pcgw,
																										process) == null) {
																									_result.add(
																											new Object[] {
																													prevNode,
																													process,
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

	public static final Object[] pattern_SplitAfterEmptyDef_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterEmptyDef_25_3_expressionFBBBBBBB(SplitAfterEmptyDef _this,
			Match match, ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterEmptyDef_25_4_expressionFBB(SplitAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterEmptyDef_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_1_bindingFB(SplitAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_1_blackFBB(EClass __eClass, SplitAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_1_bindingAndBlackFFB(SplitAfterEmptyDef _this) {
		Object[] result_pattern_SplitAfterEmptyDef_26_1_binding = pattern_SplitAfterEmptyDef_26_1_bindingFB(_this);
		if (result_pattern_SplitAfterEmptyDef_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterEmptyDef_26_1_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_26_1_black = pattern_SplitAfterEmptyDef_26_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterEmptyDef_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterEmptyDef_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_224100 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_224100)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_721089 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_721089)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_396433 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_396433)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_229115 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_229115)) {
					if (!prevNode.equals(__DEC_pgw___conv_229115)) {
						if (!pcgw.equals(__DEC_pgw___conv_229115)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_449009 = pcgw.get__conv();
			if (__DEC_pcgw___conv_449009 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_449009)) {
					if (!prevNode.equals(__DEC_pcgw___conv_449009)) {
						if (!pgw.equals(__DEC_pcgw___conv_449009)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_914203 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_914203)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_101159 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_101159)) {
					if (!prevNode.equals(__DEC_pcgw___conv_101159)) {
						if (!pgw.equals(__DEC_pcgw___conv_101159)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_26_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
										if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
											if (pattern_SplitAfterEmptyDef_26_2_black_nac_0BB(sf1, prevNode) == null) {
												if (pattern_SplitAfterEmptyDef_26_2_black_nac_3BBB(pgw, prevNode,
														pcgw) == null) {
													if (pattern_SplitAfterEmptyDef_26_2_black_nac_4BBB(pcgw, prevNode,
															pgw) == null) {
														if (pattern_SplitAfterEmptyDef_26_2_black_nac_6BBB(pcgw,
																prevNode, pgw) == null) {
															if (pattern_SplitAfterEmptyDef_26_2_black_nac_7BB(prevNode,
																	sf1) == null) {
																if (pattern_SplitAfterEmptyDef_26_2_black_nac_8BB(
																		prevNode, pgw) == null) {
																	if (pattern_SplitAfterEmptyDef_26_2_black_nac_9BB(
																			pcgw, prevNode) == null) {
																		for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(pgw,
																						de.abilov.bpmn.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(sf1)) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (pattern_SplitAfterEmptyDef_26_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_SplitAfterEmptyDef_26_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_SplitAfterEmptyDef_26_2_black_nac_5BB(
																										pcgw,
																										process) == null) {
																									_result.add(
																											new Object[] {
																													prevNode,
																													process,
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

	public static final Object[] pattern_SplitAfterEmptyDef_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterEmptyDef_26_3_expressionFBBBBBBB(SplitAfterEmptyDef _this,
			Match match, ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterEmptyDef_26_4_expressionFBB(SplitAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterEmptyDef_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_1_bindingFB(SplitAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_1_blackFBB(EClass __eClass, SplitAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_1_bindingAndBlackFFB(SplitAfterEmptyDef _this) {
		Object[] result_pattern_SplitAfterEmptyDef_27_1_binding = pattern_SplitAfterEmptyDef_27_1_bindingFB(_this);
		if (result_pattern_SplitAfterEmptyDef_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterEmptyDef_27_1_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_27_1_black = pattern_SplitAfterEmptyDef_27_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterEmptyDef_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterEmptyDef_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_30564 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_30564)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_178566 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_178566)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_303465 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_303465)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_933107 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_933107)) {
					if (!prevNode.equals(__DEC_pgw___conv_933107)) {
						if (!pcgw.equals(__DEC_pgw___conv_933107)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_1269 = pcgw.get__conv();
			if (__DEC_pcgw___conv_1269 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_1269)) {
					if (!prevNode.equals(__DEC_pcgw___conv_1269)) {
						if (!pgw.equals(__DEC_pcgw___conv_1269)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_475409 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_475409)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_261851 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_261851)) {
					if (!prevNode.equals(__DEC_pcgw___conv_261851)) {
						if (!pgw.equals(__DEC_pcgw___conv_261851)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_27_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
										if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
											if (pattern_SplitAfterEmptyDef_27_2_black_nac_0BB(sf1, prevNode) == null) {
												if (pattern_SplitAfterEmptyDef_27_2_black_nac_3BBB(pgw, prevNode,
														pcgw) == null) {
													if (pattern_SplitAfterEmptyDef_27_2_black_nac_4BBB(pcgw, prevNode,
															pgw) == null) {
														if (pattern_SplitAfterEmptyDef_27_2_black_nac_6BBB(pcgw,
																prevNode, pgw) == null) {
															if (pattern_SplitAfterEmptyDef_27_2_black_nac_7BB(prevNode,
																	sf1) == null) {
																if (pattern_SplitAfterEmptyDef_27_2_black_nac_8BB(
																		prevNode, pgw) == null) {
																	if (pattern_SplitAfterEmptyDef_27_2_black_nac_9BB(
																			pcgw, prevNode) == null) {
																		for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(pgw,
																						de.abilov.bpmn.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(sf1)) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (pattern_SplitAfterEmptyDef_27_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_SplitAfterEmptyDef_27_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_SplitAfterEmptyDef_27_2_black_nac_5BB(
																										pcgw,
																										process) == null) {
																									_result.add(
																											new Object[] {
																													prevNode,
																													process,
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

	public static final Object[] pattern_SplitAfterEmptyDef_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterEmptyDef_27_3_expressionFBBBBBBB(SplitAfterEmptyDef _this,
			Match match, ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterEmptyDef_27_4_expressionFBB(SplitAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterEmptyDef_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_1_bindingFB(SplitAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_1_blackFBB(EClass __eClass, SplitAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_1_bindingAndBlackFFB(SplitAfterEmptyDef _this) {
		Object[] result_pattern_SplitAfterEmptyDef_28_1_binding = pattern_SplitAfterEmptyDef_28_1_bindingFB(_this);
		if (result_pattern_SplitAfterEmptyDef_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterEmptyDef_28_1_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_28_1_black = pattern_SplitAfterEmptyDef_28_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterEmptyDef_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterEmptyDef_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_718785 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_718785)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_574198 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_574198)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_953807 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_953807)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_755968 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_755968)) {
					if (!prevNode.equals(__DEC_pgw___conv_755968)) {
						if (!pcgw.equals(__DEC_pgw___conv_755968)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_789457 = pcgw.get__conv();
			if (__DEC_pcgw___conv_789457 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_789457)) {
					if (!prevNode.equals(__DEC_pcgw___conv_789457)) {
						if (!pgw.equals(__DEC_pcgw___conv_789457)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_200093 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_200093)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_155805 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_155805)) {
					if (!prevNode.equals(__DEC_pcgw___conv_155805)) {
						if (!pgw.equals(__DEC_pcgw___conv_155805)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_28_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
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
						if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
							Gateway tmpPcgw = pgw.get__conv();
							if (tmpPcgw instanceof ParallelGateway) {
								ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
								if (!pcgw.equals(pgw)) {
									boolean pgwisDiverging = pgw.isIsDiverging();
									if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
										boolean pcgwisDiverging = pcgw.isIsDiverging();
										if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
											if (pattern_SplitAfterEmptyDef_28_2_black_nac_0BB(sf1, prevNode) == null) {
												if (pattern_SplitAfterEmptyDef_28_2_black_nac_7BB(prevNode,
														sf1) == null) {
													if (pattern_SplitAfterEmptyDef_28_2_black_nac_8BB(prevNode,
															pgw) == null) {
														if (pattern_SplitAfterEmptyDef_28_2_black_nac_3BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_SplitAfterEmptyDef_28_2_black_nac_4BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_SplitAfterEmptyDef_28_2_black_nac_6BBB(pcgw,
																		prevNode, pgw) == null) {
																	if (pattern_SplitAfterEmptyDef_28_2_black_nac_9BB(
																			pcgw, prevNode) == null) {
																		for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(sf1,
																						de.abilov.bpmn.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(pgw)) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (pattern_SplitAfterEmptyDef_28_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_SplitAfterEmptyDef_28_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_SplitAfterEmptyDef_28_2_black_nac_5BB(
																										pcgw,
																										process) == null) {
																									_result.add(
																											new Object[] {
																													prevNode,
																													process,
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

	public static final Object[] pattern_SplitAfterEmptyDef_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterEmptyDef_28_3_expressionFBBBBBBB(SplitAfterEmptyDef _this,
			Match match, ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterEmptyDef_28_4_expressionFBB(SplitAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterEmptyDef_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_1_bindingFB(SplitAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_1_blackFBB(EClass __eClass, SplitAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_1_bindingAndBlackFFB(SplitAfterEmptyDef _this) {
		Object[] result_pattern_SplitAfterEmptyDef_29_1_binding = pattern_SplitAfterEmptyDef_29_1_bindingFB(_this);
		if (result_pattern_SplitAfterEmptyDef_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterEmptyDef_29_1_binding[0];

			Object[] result_pattern_SplitAfterEmptyDef_29_1_black = pattern_SplitAfterEmptyDef_29_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterEmptyDef_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterEmptyDef_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_948318 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_948318)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_701460 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_701460)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_163028 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_163028)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_714098 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_714098)) {
					if (!prevNode.equals(__DEC_pgw___conv_714098)) {
						if (!pcgw.equals(__DEC_pgw___conv_714098)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_452307 = pcgw.get__conv();
			if (__DEC_pcgw___conv_452307 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_452307)) {
					if (!prevNode.equals(__DEC_pcgw___conv_452307)) {
						if (!pgw.equals(__DEC_pcgw___conv_452307)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_512428 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_512428)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_914209 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_914209)) {
					if (!prevNode.equals(__DEC_pcgw___conv_914209)) {
						if (!pgw.equals(__DEC_pcgw___conv_914209)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterEmptyDef_29_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			EObject tmpSf1 = _edge_outgoing.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
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
											if (pattern_SplitAfterEmptyDef_29_2_black_nac_0BB(sf1, prevNode) == null) {
												if (pattern_SplitAfterEmptyDef_29_2_black_nac_7BB(prevNode,
														sf1) == null) {
													if (pattern_SplitAfterEmptyDef_29_2_black_nac_8BB(prevNode,
															pgw) == null) {
														if (pattern_SplitAfterEmptyDef_29_2_black_nac_3BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_SplitAfterEmptyDef_29_2_black_nac_4BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_SplitAfterEmptyDef_29_2_black_nac_6BBB(pcgw,
																		prevNode, pgw) == null) {
																	if (pattern_SplitAfterEmptyDef_29_2_black_nac_9BB(
																			pcgw, prevNode) == null) {
																		for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(prevNode,
																						de.abilov.bpmn.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(pgw)) {
																				if (process.getFlowElements()
																						.contains(sf1)) {
																					if (process.getFlowElements()
																							.contains(pcgw)) {
																						if (pattern_SplitAfterEmptyDef_29_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_SplitAfterEmptyDef_29_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_SplitAfterEmptyDef_29_2_black_nac_5BB(
																										pcgw,
																										process) == null) {
																									_result.add(
																											new Object[] {
																													prevNode,
																													process,
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

	public static final Object[] pattern_SplitAfterEmptyDef_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterEmptyDef_29_3_expressionFBBBBBBB(SplitAfterEmptyDef _this,
			Match match, ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterEmptyDef_29_4_expressionFBB(SplitAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterEmptyDef_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterEmptyDef_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SplitAfterEmptyDefImpl
