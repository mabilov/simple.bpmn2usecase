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
import de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef;

import de.abilov.useCase.ChoiceStep;
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
 * An implementation of the model object '<em><b>Split After Choice Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SplitAfterChoiceDefImpl extends AbstractRuleImpl implements SplitAfterChoiceDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitAfterChoiceDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSplitAfterChoiceDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow sf1,
			de.abilov.bpmn.Process process, ParallelGateway pgw, ParallelGateway pcgw) {
		// initial bindings
		Object[] result1_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_0_1_blackBBBBBBB(this, match,
				prevNode, sf1, process, pgw, pcgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1 + ", "
							+ "[process] = " + process + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_0_2_bindingAndBlackFBBBBBBB(this, match, prevNode, sf1, process, pgw,
						pcgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1
					+ ", " + "[process] = " + process + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_0_4_blackBBBBBB(match,
					prevNode, sf1, process, pgw, pcgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = "
						+ sf1 + ", " + "[process] = " + process + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw
						+ ".");
			}
			SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_0_4_greenBBBBBBFFFFFFFFF(match, prevNode, sf1, process,
					pgw, pcgw);
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[6];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[7];
					// EMoflonEdge prevNode__sf1____default = (EMoflonEdge) result4_green[8];
					// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result4_green[9];
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[10];
					// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result4_green[11];
					// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result4_green[12];
					// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result4_green[13];
					// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result4_green[14];

			// collect context elements
			Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_0_5_blackBBBBBB(match,
					prevNode, sf1, process, pgw, pcgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1 + ", "
								+ "[process] = " + process + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
			}
			SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_0_6_expressionBBBBBBB(this, match, prevNode, sf1,
					process, pgw, pcgw);
			return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_0_7_expressionF();
		} else {
			return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_1_1_bindingAndBlackFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep cStep = (ChoiceStep) result1_bindingAndBlack[1];
		GW2S eg2cs = (GW2S) result1_bindingAndBlack[2];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[5];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[6];
		ParallelGateway pcgw = (ParallelGateway) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_1_1_greenBFBBFFBB(cStep, flow, pgw,
				pcgw, csp);
		ParallelStep step = (ParallelStep) result1_green[1];
		FN2S pcgwToStep = (FN2S) result1_green[4];
		GW2S pgwToStep = (GW2S) result1_green[5];

		// collect translated elements
		Object[] result2_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_1_2_blackBBBBBB(sf1, step, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[step] = " + step + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = "
					+ pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_1_2_greenFBBBBBB(sf1, step, pgw,
				pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_1_3_blackBBBBBBBBBBBB(ruleresult,
				prevNode, cStep, eg2cs, sf1, step, flow, process, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[cStep] = " + cStep
					+ ", " + "[eg2cs] = " + eg2cs + ", " + "[sf1] = " + sf1 + ", " + "[step] = " + step + ", "
					+ "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[pgw] = " + pgw + ", "
					+ "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw
					+ ".");
		}
		SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult, prevNode,
				cStep, sf1, step, flow, process, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[11];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[12];
				// EMoflonEdge prevNode__sf1____default = (EMoflonEdge) result3_green[13];
				// EMoflonEdge cStep__step____next = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[20];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pcgwToStep__pcgw____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge pcgwToStep__step____target = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pgwToStep__pgw____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge pgwToStep__step____target = (EMoflonEdge) result3_green[25];

		// perform postprocessing story node is empty
		// register objects
		SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_1_5_expressionBBBBBBBBBBBBB(this, ruleresult, prevNode,
				cStep, eg2cs, sf1, step, flow, process, pgw, pcgwToStep, pgwToStep, pcgw);
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[0];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[1];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[2];
		ParallelGateway pgw = (ParallelGateway) result2_binding[3];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[4];
		for (Object[] result2_black : SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_2_2_blackBFFBBBBB(prevNode,
				sf1, process, pgw, pcgw, match)) {
			ChoiceStep cStep = (ChoiceStep) result2_black[1];
			GW2S eg2cs = (GW2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : SplitAfterChoiceDefImpl
					.pattern_SplitAfterChoiceDef_2_3_blackBBBBFBBB(prevNode, cStep, eg2cs, sf1, process, pgw, pcgw)) {
				Flow flow = (Flow) result3_black[4];
				Object[] result3_green = SplitAfterChoiceDefImpl
						.pattern_SplitAfterChoiceDef_2_3_greenBBBBBBBBFFFFFFFFFFFFFF(prevNode, cStep, eg2cs, sf1, flow,
								process, pgw, pcgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[9];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevNode__sf1____default = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eg2cs__prevNode____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eg2cs__cStep____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[20];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[21];

				// solve CSP
				Object[] result4_bindingAndBlack = SplitAfterChoiceDefImpl
						.pattern_SplitAfterChoiceDef_2_4_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, prevNode,
								cStep, eg2cs, sf1, flow, process, pgw, pcgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[cStep] = " + cStep + ", " + "[eg2cs] = " + eg2cs
							+ ", " + "[sf1] = " + sf1 + ", " + "[flow] = " + flow + ", " + "[process] = " + process
							+ ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow sf1,
			de.abilov.bpmn.Process process, ParallelGateway pgw, ParallelGateway pcgw) {
		match.registerObject("prevNode", prevNode);
		match.registerObject("sf1", sf1);
		match.registerObject("process", process);
		match.registerObject("pgw", pgw);
		match.registerObject("pcgw", pcgw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow sf1,
			de.abilov.bpmn.Process process, ParallelGateway pgw, ParallelGateway pcgw) {// Create CSP
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
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, Flow flow, de.abilov.bpmn.Process process,
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
		isApplicableMatch.registerObject("cStep", cStep);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject prevNode, EObject cStep, EObject eg2cs,
			EObject sf1, EObject step, EObject flow, EObject process, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("cStep", cStep);
		ruleresult.registerObject("eg2cs", eg2cs);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("process", process);
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
	public boolean isAppropriate_BWD(Match match, ChoiceStep cStep, ParallelStep step, Flow flow) {
		// initial bindings
		Object[] result1_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_10_1_blackBBBBB(this, match, cStep,
				step, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[cStep] = " + cStep + ", "
					+ "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_10_2_bindingAndBlackFBBBBB(this, match, cStep, step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[cStep] = " + cStep + ", " + "[step] = " + step
					+ ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_10_4_blackBBBB(match, cStep,
					step, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[cStep] = " + cStep + ", " + "[step] = "
						+ step + ", " + "[flow] = " + flow + ".");
			}
			SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_10_4_greenBBBBFF(match, cStep, step, flow);
			// EMoflonEdge cStep__step____next = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_10_5_blackBBBB(match, cStep,
					step, flow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[cStep] = " + cStep + ", " + "[step] = "
						+ step + ", " + "[flow] = " + flow + ".");
			}
			SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_10_5_greenBBBF(match, cStep, flow);
			// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result5_green[3];

			// register objects to match
			SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_10_6_expressionBBBBB(this, match, cStep, step, flow);
			return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_10_7_expressionF();
		} else {
			return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_11_1_bindingAndBlackFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep cStep = (ChoiceStep) result1_bindingAndBlack[1];
		GW2S eg2cs = (GW2S) result1_bindingAndBlack[2];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_11_1_greenBFBBFFFFB(prevNode, step,
				process, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[1];
		ParallelGateway pgw = (ParallelGateway) result1_green[4];
		FN2S pcgwToStep = (FN2S) result1_green[5];
		GW2S pgwToStep = (GW2S) result1_green[6];
		ParallelGateway pcgw = (ParallelGateway) result1_green[7];

		// collect translated elements
		Object[] result2_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_11_2_blackBBBBBB(sf1, step, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[step] = " + step + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = "
					+ pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_11_2_greenFBBBBBB(sf1, step, pgw,
				pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_11_3_blackBBBBBBBBBBBB(ruleresult,
				prevNode, cStep, eg2cs, sf1, step, flow, process, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[cStep] = " + cStep
					+ ", " + "[eg2cs] = " + eg2cs + ", " + "[sf1] = " + sf1 + ", " + "[step] = " + step + ", "
					+ "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[pgw] = " + pgw + ", "
					+ "[pcgwToStep] = " + pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw
					+ ".");
		}
		SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult, prevNode,
				cStep, sf1, step, flow, process, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[11];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[12];
				// EMoflonEdge prevNode__sf1____default = (EMoflonEdge) result3_green[13];
				// EMoflonEdge cStep__step____next = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[20];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pcgwToStep__pcgw____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge pcgwToStep__step____target = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pgwToStep__pgw____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge pgwToStep__step____target = (EMoflonEdge) result3_green[25];

		// perform postprocessing story node is empty
		// register objects
		SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_11_5_expressionBBBBBBBBBBBBB(this, ruleresult, prevNode,
				cStep, eg2cs, sf1, step, flow, process, pgw, pcgwToStep, pgwToStep, pcgw);
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ChoiceStep cStep = (ChoiceStep) result2_binding[0];
		ParallelStep step = (ParallelStep) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		for (Object[] result2_black : SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_12_2_blackFBFBBB(cStep, step,
				flow, match)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			GW2S eg2cs = (GW2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_12_3_blackBBBBBF(prevNode,
					cStep, eg2cs, step, flow)) {
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result3_black[5];
				Object[] result3_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_12_3_greenBBBBBBFFFFFFF(
						prevNode, cStep, eg2cs, step, flow, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge cStep__step____next = (EMoflonEdge) result3_green[7];
				// EMoflonEdge eg2cs__prevNode____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge eg2cs__cStep____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result3_green[10];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = SplitAfterChoiceDefImpl
						.pattern_SplitAfterChoiceDef_12_4_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, prevNode,
								cStep, eg2cs, step, flow, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
									+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[prevNode] = " + prevNode
									+ ", " + "[cStep] = " + cStep + ", " + "[eg2cs] = " + eg2cs + ", " + "[step] = "
									+ step + ", " + "[flow] = " + flow + ", " + "[process] = " + process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SplitAfterChoiceDefImpl
							.pattern_SplitAfterChoiceDef_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ChoiceStep cStep, ParallelStep step, Flow flow) {
		match.registerObject("cStep", cStep);
		match.registerObject("step", step);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ChoiceStep cStep, ParallelStep step, Flow flow) {// Create CSP
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
			ChoiceStep cStep, GW2S eg2cs, ParallelStep step, Flow flow, de.abilov.bpmn.Process process) {// Create CSP
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
		isApplicableMatch.registerObject("cStep", cStep);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject prevNode, EObject cStep, EObject eg2cs,
			EObject sf1, EObject step, EObject flow, EObject process, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("cStep", cStep);
		ruleresult.registerObject("eg2cs", eg2cs);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("process", process);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_923(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_20_2_blackFFFFFB(_edge_sourceRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_20_3_expressionFBBBBBBB(this, match, prevNode, sf1,
					process, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_20_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_924(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_21_2_blackFFFFFB(_edge_outgoing)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_21_3_expressionFBBBBBBB(this, match, prevNode, sf1,
					process, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_21_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_925(EMoflonEdge _edge_default) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_22_2_blackFFFFFB(_edge_default)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_22_3_expressionFBBBBBBB(this, match, prevNode, sf1,
					process, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_22_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_282(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_23_2_blackFFFB(_edge_next)) {
			ChoiceStep cStep = (ChoiceStep) result2_black[0];
			ParallelStep step = (ParallelStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_23_3_expressionFBBBBB(this, match, cStep, step,
					flow)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_23_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_283(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_24_2_blackFFFB(_edge_steps)) {
			ChoiceStep cStep = (ChoiceStep) result2_black[0];
			ParallelStep step = (ParallelStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_24_3_expressionFBBBBB(this, match, cStep, step,
					flow)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_24_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_926(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_25_2_blackFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_25_3_expressionFBBBBBBB(this, match, prevNode, sf1,
					process, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_25_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_927(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_26_2_blackFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_26_3_expressionFBBBBBBB(this, match, prevNode, sf1,
					process, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_26_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_928(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_27_2_blackFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_27_3_expressionFBBBBBBB(this, match, prevNode, sf1,
					process, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_27_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_929(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_28_2_blackFFFFFB(_edge_targetRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_28_3_expressionFBBBBBBB(this, match, prevNode, sf1,
					process, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_28_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_930(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_29_2_blackFFFFFB(_edge_incoming)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_29_3_expressionFBBBBBBB(this, match, prevNode, sf1,
					process, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_29_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_29_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_931(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterChoiceDefImpl
				.pattern_SplitAfterChoiceDef_30_2_blackFFFFFB(_edge___conv)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_30_3_expressionFBBBBBBB(this, match, prevNode, sf1,
					process, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_30_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_30_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_30_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterChoiceDefImpl.pattern_SplitAfterChoiceDef_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SplitAfterChoiceDef");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForCStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("cStep")).findAny();
		de.abilov.useCase.ChoiceStep cStep = (de.abilov.useCase.ChoiceStep) matchForCStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S eg2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForEg2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ParallelStep step = (de.abilov.useCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

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

		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SplitAfterChoiceDef");
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
		ruleResult.setRule("SplitAfterChoiceDef");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForCStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("cStep")).findAny();
		de.abilov.useCase.ChoiceStep cStep = (de.abilov.useCase.ChoiceStep) matchForCStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S eg2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForEg2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ParallelStep step = (de.abilov.useCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

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

		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SplitAfterChoiceDef");
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
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
			return null;
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_FLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (SequenceFlow) arguments.get(4),
					(Flow) arguments.get(5), (de.abilov.bpmn.Process) arguments.get(6),
					(ParallelGateway) arguments.get(7), (ParallelGateway) arguments.get(8));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_PARALLELSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(ParallelStep) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_PARALLELSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(ParallelStep) arguments.get(2), (Flow) arguments.get(3));
			return null;
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_PARALLELSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(ParallelStep) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_PARALLELSTEP_FLOW_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (ParallelStep) arguments.get(4),
					(Flow) arguments.get(5), (de.abilov.bpmn.Process) arguments.get(6));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_923__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_923((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_924__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_924((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_925__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_925((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_282__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_282((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_283__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_283((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_926__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_926((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_927__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_927((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_928__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_928((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_929__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_929((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_930__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_930((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_931__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_931((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SplitAfterChoiceDef_0_1_blackBBBBBBB(SplitAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, ParallelGateway pgw,
			ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { _this, match, prevNode, sf1, process, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_0_2_bindingFBBBBBBB(SplitAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, ParallelGateway pgw,
			ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, sf1, process, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, sf1, process, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_0_2_bindingAndBlackFBBBBBBB(SplitAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_SplitAfterChoiceDef_0_2_binding = pattern_SplitAfterChoiceDef_0_2_bindingFBBBBBBB(_this,
				match, prevNode, sf1, process, pgw, pcgw);
		if (result_pattern_SplitAfterChoiceDef_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterChoiceDef_0_2_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_0_2_black = pattern_SplitAfterChoiceDef_0_2_blackB(csp);
			if (result_pattern_SplitAfterChoiceDef_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, sf1, process, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterChoiceDef_0_3_expressionFBB(SplitAfterChoiceDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_0_4_blackBBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { match, prevNode, sf1, process, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_0_4_greenBBBBBBFFFFFFFFF(Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, ParallelGateway pgw,
			ParallelGateway pcgw) {
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf1);
		match.getToBeTranslatedNodes().add(pgw);
		match.getToBeTranslatedNodes().add(pcgw);
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String prevNode__sf1____default_name_prime = "default";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		match.getToBeTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____outgoing);
		prevNode__sf1____default.setSrc(prevNode);
		prevNode__sf1____default.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____default);
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
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		prevNode__sf1____default.setName(prevNode__sf1____default_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		return new Object[] { match, prevNode, sf1, process, pgw, pcgw, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, prevNode__sf1____default, process__pgw____flowElements,
				process__sf1____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_0_5_blackBBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { match, prevNode, sf1, process, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_0_5_greenBBBF(Match match, ExclusiveGateway prevNode,
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

	public static final void pattern_SplitAfterChoiceDef_0_6_expressionBBBBBBB(SplitAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, ParallelGateway pgw,
			ParallelGateway pcgw) {
		_this.registerObjectsToMatch_FWD(match, prevNode, sf1, process, pgw, pcgw);

	}

	public static final boolean pattern_SplitAfterChoiceDef_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_1_1_bindingFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("cStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject _localVariable_6 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_7 = isApplicableMatch.getObject("pcgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpCStep = _localVariable_1;
		EObject tmpEg2cs = _localVariable_2;
		EObject tmpSf1 = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		EObject tmpPgw = _localVariable_6;
		EObject tmpPcgw = _localVariable_7;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpCStep instanceof ChoiceStep) {
				ChoiceStep cStep = (ChoiceStep) tmpCStep;
				if (tmpEg2cs instanceof GW2S) {
					GW2S eg2cs = (GW2S) tmpEg2cs;
					if (tmpSf1 instanceof SequenceFlow) {
						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpProcess instanceof de.abilov.bpmn.Process) {
								de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
								if (tmpPgw instanceof ParallelGateway) {
									ParallelGateway pgw = (ParallelGateway) tmpPgw;
									if (tmpPcgw instanceof ParallelGateway) {
										ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
										return new Object[] { prevNode, cStep, eg2cs, sf1, flow, process, pgw, pcgw,
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

	public static final Object[] pattern_SplitAfterChoiceDef_1_1_blackBBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, Flow flow, de.abilov.bpmn.Process process,
			ParallelGateway pgw, ParallelGateway pcgw, SplitAfterChoiceDef _this, IsApplicableMatch isApplicableMatch) {
		if (!pcgw.equals(pgw)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { prevNode, cStep, eg2cs, sf1, flow, process, pgw, pcgw, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_1_1_bindingAndBlackFFFFFFFFBFB(SplitAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SplitAfterChoiceDef_1_1_binding = pattern_SplitAfterChoiceDef_1_1_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SplitAfterChoiceDef_1_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_SplitAfterChoiceDef_1_1_binding[0];
			ChoiceStep cStep = (ChoiceStep) result_pattern_SplitAfterChoiceDef_1_1_binding[1];
			GW2S eg2cs = (GW2S) result_pattern_SplitAfterChoiceDef_1_1_binding[2];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_SplitAfterChoiceDef_1_1_binding[3];
			Flow flow = (Flow) result_pattern_SplitAfterChoiceDef_1_1_binding[4];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_SplitAfterChoiceDef_1_1_binding[5];
			ParallelGateway pgw = (ParallelGateway) result_pattern_SplitAfterChoiceDef_1_1_binding[6];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_SplitAfterChoiceDef_1_1_binding[7];

			Object[] result_pattern_SplitAfterChoiceDef_1_1_black = pattern_SplitAfterChoiceDef_1_1_blackBBBBBBBBBFB(
					prevNode, cStep, eg2cs, sf1, flow, process, pgw, pcgw, _this, isApplicableMatch);
			if (result_pattern_SplitAfterChoiceDef_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SplitAfterChoiceDef_1_1_black[9];

				return new Object[] { prevNode, cStep, eg2cs, sf1, flow, process, pgw, pcgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_1_1_greenBFBBFFBB(ChoiceStep cStep, Flow flow,
			ParallelGateway pgw, ParallelGateway pcgw, CSP csp) {
		ParallelStep step = UseCaseFactory.eINSTANCE.createParallelStep();
		FN2S pcgwToStep = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		cStep.setNext(step);
		flow.getSteps().add(step);
		pcgwToStep.setSource(pcgw);
		pcgwToStep.setTarget(step);
		pgwToStep.setSource(pgw);
		pgwToStep.setTarget(step);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { cStep, step, flow, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_1_2_blackBBBBBB(SequenceFlow sf1, ParallelStep step,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { sf1, step, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_1_2_greenFBBBBBB(SequenceFlow sf1, ParallelStep step,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(pgw);
		ruleresult.getCreatedLinkElements().add(pcgwToStep);
		ruleresult.getCreatedLinkElements().add(pgwToStep);
		ruleresult.getTranslatedElements().add(pcgw);
		return new Object[] { ruleresult, sf1, step, pgw, pcgwToStep, pgwToStep, pcgw };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_1_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject step, EObject flow, EObject process,
			EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		if (!prevNode.equals(sf1)) {
			if (!prevNode.equals(step)) {
				if (!prevNode.equals(process)) {
					if (!cStep.equals(prevNode)) {
						if (!cStep.equals(eg2cs)) {
							if (!cStep.equals(sf1)) {
								if (!cStep.equals(step)) {
									if (!cStep.equals(flow)) {
										if (!cStep.equals(process)) {
											if (!cStep.equals(pgw)) {
												if (!cStep.equals(pcgwToStep)) {
													if (!cStep.equals(pgwToStep)) {
														if (!cStep.equals(pcgw)) {
															if (!eg2cs.equals(prevNode)) {
																if (!eg2cs.equals(sf1)) {
																	if (!eg2cs.equals(step)) {
																		if (!eg2cs.equals(flow)) {
																			if (!eg2cs.equals(process)) {
																				if (!eg2cs.equals(pgw)) {
																					if (!eg2cs.equals(pcgwToStep)) {
																						if (!eg2cs.equals(pgwToStep)) {
																							if (!eg2cs.equals(pcgw)) {
																								if (!sf1.equals(step)) {
																									if (!flow.equals(
																											prevNode)) {
																										if (!flow
																												.equals(sf1)) {
																											if (!flow
																													.equals(step)) {
																												if (!flow
																														.equals(process)) {
																													if (!flow
																															.equals(pgw)) {
																														if (!flow
																																.equals(pcgwToStep)) {
																															if (!flow
																																	.equals(pgwToStep)) {
																																if (!flow
																																		.equals(pcgw)) {
																																	if (!process
																																			.equals(sf1)) {
																																		if (!process
																																				.equals(step)) {
																																			if (!pgw.equals(
																																					prevNode)) {
																																				if (!pgw.equals(
																																						sf1)) {
																																					if (!pgw.equals(
																																							step)) {
																																						if (!pgw.equals(
																																								process)) {
																																							if (!pgw.equals(
																																									pgwToStep)) {
																																								if (!pcgwToStep
																																										.equals(prevNode)) {
																																									if (!pcgwToStep
																																											.equals(sf1)) {
																																										if (!pcgwToStep
																																												.equals(step)) {
																																											if (!pcgwToStep
																																													.equals(process)) {
																																												if (!pcgwToStep
																																														.equals(pgw)) {
																																													if (!pcgwToStep
																																															.equals(pgwToStep)) {
																																														if (!pgwToStep
																																																.equals(prevNode)) {
																																															if (!pgwToStep
																																																	.equals(sf1)) {
																																																if (!pgwToStep
																																																		.equals(step)) {
																																																	if (!pgwToStep
																																																			.equals(process)) {
																																																		if (!pcgw
																																																				.equals(prevNode)) {
																																																			if (!pcgw
																																																					.equals(sf1)) {
																																																				if (!pcgw
																																																						.equals(step)) {
																																																					if (!pcgw
																																																							.equals(process)) {
																																																						if (!pcgw
																																																								.equals(pgw)) {
																																																							if (!pcgw
																																																									.equals(pcgwToStep)) {
																																																								if (!pcgw
																																																										.equals(pgwToStep)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											prevNode,
																																																											cStep,
																																																											eg2cs,
																																																											sf1,
																																																											step,
																																																											flow,
																																																											process,
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

	public static final Object[] pattern_SplitAfterChoiceDef_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject cStep, EObject sf1, EObject step, EObject flow,
			EObject process, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SplitAfterChoiceDef";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String prevNode__sf1____default_name_prime = "default";
		String cStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String pcgwToStep__pcgw____source_name_prime = "source";
		String pcgwToStep__step____target_name_prime = "target";
		String pgwToStep__pgw____source_name_prime = "source";
		String pgwToStep__step____target_name_prime = "target";
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
		prevNode__sf1____default.setSrc(prevNode);
		prevNode__sf1____default.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____default);
		cStep__step____next.setSrc(cStep);
		cStep__step____next.setTrg(step);
		ruleresult.getCreatedEdges().add(cStep__step____next);
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
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		prevNode__sf1____default.setName(prevNode__sf1____default_name_prime);
		cStep__step____next.setName(cStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		pcgwToStep__pcgw____source.setName(pcgwToStep__pcgw____source_name_prime);
		pcgwToStep__step____target.setName(pcgwToStep__step____target_name_prime);
		pgwToStep__pgw____source.setName(pgwToStep__pgw____source_name_prime);
		pgwToStep__step____target.setName(pgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, prevNode, cStep, sf1, step, flow, process, pgw, pcgwToStep, pgwToStep, pcgw,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, prevNode__sf1____default, cStep__step____next,
				flow__step____steps, process__pgw____flowElements, process__sf1____flowElements,
				process__pcgw____flowElements, sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv,
				pcgwToStep__pcgw____source, pcgwToStep__step____target, pgwToStep__pgw____source,
				pgwToStep__step____target };
	}

	public static final void pattern_SplitAfterChoiceDef_1_5_expressionBBBBBBBBBBBBB(SplitAfterChoiceDef _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject step,
			EObject flow, EObject process, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_FWD(ruleresult, prevNode, cStep, eg2cs, sf1, step, flow, process, pgw, pcgwToStep,
				pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_SplitAfterChoiceDef_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_2_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_2_1_blackFBB(EClass eClass, SplitAfterChoiceDef _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_2_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_2_1_binding = pattern_SplitAfterChoiceDef_2_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SplitAfterChoiceDef_2_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_2_1_black = pattern_SplitAfterChoiceDef_2_1_blackFBB(eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SplitAfterChoiceDef";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_2_2_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevNode");
		EObject _localVariable_1 = match.getObject("sf1");
		EObject _localVariable_2 = match.getObject("process");
		EObject _localVariable_3 = match.getObject("pgw");
		EObject _localVariable_4 = match.getObject("pcgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpSf1 = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpPgw = _localVariable_3;
		EObject tmpPcgw = _localVariable_4;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (tmpProcess instanceof de.abilov.bpmn.Process) {
					de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
					if (tmpPgw instanceof ParallelGateway) {
						ParallelGateway pgw = (ParallelGateway) tmpPgw;
						if (tmpPcgw instanceof ParallelGateway) {
							ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
							return new Object[] { prevNode, sf1, process, pgw, pcgw, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_2_2_blackBFFBBBBB(ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, ParallelGateway pgw, ParallelGateway pcgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pcgw.equals(pgw)) {
			boolean prevNodeisDiverging = prevNode.isIsDiverging();
			if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
				boolean pgwisDiverging = pgw.isIsDiverging();
				if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
					boolean pcgwisDiverging = pcgw.isIsDiverging();
					if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
						for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevNode,
								GW2S.class, "source")) {
							Step tmpCStep = eg2cs.getTarget();
							if (tmpCStep instanceof ChoiceStep) {
								ChoiceStep cStep = (ChoiceStep) tmpCStep;
								_result.add(new Object[] { prevNode, cStep, eg2cs, sf1, process, pgw, pcgw, match });
							}

						}
					}

				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_2_3_blackBBBBFBBB(ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, de.abilov.bpmn.Process process, ParallelGateway pgw,
			ParallelGateway pcgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!pcgw.equals(pgw)) {
			if (prevNode.equals(sf1.getSourceRef())) {
				if (sf1.equals(prevNode.getDefault())) {
					if (prevNode.equals(eg2cs.getSource())) {
						if (cStep.equals(eg2cs.getTarget())) {
							if (process.getFlowElements().contains(pgw)) {
								if (process.getFlowElements().contains(sf1)) {
									if (process.getFlowElements().contains(prevNode)) {
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
																for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(cStep, Flow.class,
																				"steps")) {
																	_result.add(new Object[] { prevNode, cStep, eg2cs,
																			sf1, flow, process, pgw, pcgw });
																}
															}

														}

													}

												}
											}
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

	public static final Object[] pattern_SplitAfterChoiceDef_2_3_greenBBBBBBBBFFFFFFFFFFFFFF(ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, Flow flow, de.abilov.bpmn.Process process,
			ParallelGateway pgw, ParallelGateway pcgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__cStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__cStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String prevNode__sf1____default_name_prime = "default";
		String eg2cs__prevNode____source_name_prime = "source";
		String eg2cs__cStep____target_name_prime = "target";
		String flow__cStep____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(pcgw);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____outgoing);
		prevNode__sf1____default.setSrc(prevNode);
		prevNode__sf1____default.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____default);
		eg2cs__prevNode____source.setSrc(eg2cs);
		eg2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(eg2cs__prevNode____source);
		eg2cs__cStep____target.setSrc(eg2cs);
		eg2cs__cStep____target.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs__cStep____target);
		flow__cStep____steps.setSrc(flow);
		flow__cStep____steps.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(flow__cStep____steps);
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
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		prevNode__sf1____default.setName(prevNode__sf1____default_name_prime);
		eg2cs__prevNode____source.setName(eg2cs__prevNode____source_name_prime);
		eg2cs__cStep____target.setName(eg2cs__cStep____target_name_prime);
		flow__cStep____steps.setName(flow__cStep____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		return new Object[] { prevNode, cStep, eg2cs, sf1, flow, process, pgw, pcgw, isApplicableMatch,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, prevNode__sf1____default,
				eg2cs__prevNode____source, eg2cs__cStep____target, flow__cStep____steps, process__pgw____flowElements,
				process__sf1____flowElements, process__prevNode____flowElements, process__pcgw____flowElements,
				sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_2_4_bindingFBBBBBBBBBB(SplitAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			SequenceFlow sf1, Flow flow, de.abilov.bpmn.Process process, ParallelGateway pgw, ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, prevNode, cStep, eg2cs, sf1, flow,
				process, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, cStep, eg2cs, sf1, flow, process, pgw,
					pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_2_4_bindingAndBlackFBBBBBBBBBB(SplitAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			SequenceFlow sf1, Flow flow, de.abilov.bpmn.Process process, ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_SplitAfterChoiceDef_2_4_binding = pattern_SplitAfterChoiceDef_2_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, prevNode, cStep, eg2cs, sf1, flow, process, pgw, pcgw);
		if (result_pattern_SplitAfterChoiceDef_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterChoiceDef_2_4_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_2_4_black = pattern_SplitAfterChoiceDef_2_4_blackB(csp);
			if (result_pattern_SplitAfterChoiceDef_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, cStep, eg2cs, sf1, flow, process, pgw,
						pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterChoiceDef_2_5_expressionFBB(SplitAfterChoiceDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SplitAfterChoiceDef";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SplitAfterChoiceDef_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_10_1_blackBBBBB(SplitAfterChoiceDef _this, Match match,
			ChoiceStep cStep, ParallelStep step, Flow flow) {
		return new Object[] { _this, match, cStep, step, flow };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_10_2_bindingFBBBBB(SplitAfterChoiceDef _this, Match match,
			ChoiceStep cStep, ParallelStep step, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, cStep, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_10_2_bindingAndBlackFBBBBB(SplitAfterChoiceDef _this,
			Match match, ChoiceStep cStep, ParallelStep step, Flow flow) {
		Object[] result_pattern_SplitAfterChoiceDef_10_2_binding = pattern_SplitAfterChoiceDef_10_2_bindingFBBBBB(_this,
				match, cStep, step, flow);
		if (result_pattern_SplitAfterChoiceDef_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterChoiceDef_10_2_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_10_2_black = pattern_SplitAfterChoiceDef_10_2_blackB(csp);
			if (result_pattern_SplitAfterChoiceDef_10_2_black != null) {

				return new Object[] { csp, _this, match, cStep, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterChoiceDef_10_3_expressionFBB(SplitAfterChoiceDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_10_4_blackBBBB(Match match, ChoiceStep cStep,
			ParallelStep step, Flow flow) {
		return new Object[] { match, cStep, step, flow };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_10_4_greenBBBBFF(Match match, ChoiceStep cStep,
			ParallelStep step, Flow flow) {
		EMoflonEdge cStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String cStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		cStep__step____next.setSrc(cStep);
		cStep__step____next.setTrg(step);
		match.getToBeTranslatedEdges().add(cStep__step____next);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		cStep__step____next.setName(cStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, cStep, step, flow, cStep__step____next, flow__step____steps };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_10_5_blackBBBB(Match match, ChoiceStep cStep,
			ParallelStep step, Flow flow) {
		return new Object[] { match, cStep, step, flow };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_10_5_greenBBBF(Match match, ChoiceStep cStep, Flow flow) {
		EMoflonEdge flow__cStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(cStep);
		match.getContextNodes().add(flow);
		String flow__cStep____steps_name_prime = "steps";
		flow__cStep____steps.setSrc(flow);
		flow__cStep____steps.setTrg(cStep);
		match.getContextEdges().add(flow__cStep____steps);
		flow__cStep____steps.setName(flow__cStep____steps_name_prime);
		return new Object[] { match, cStep, flow, flow__cStep____steps };
	}

	public static final void pattern_SplitAfterChoiceDef_10_6_expressionBBBBB(SplitAfterChoiceDef _this, Match match,
			ChoiceStep cStep, ParallelStep step, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, cStep, step, flow);

	}

	public static final boolean pattern_SplitAfterChoiceDef_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_11_1_bindingFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("cStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("step");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpCStep = _localVariable_1;
		EObject tmpEg2cs = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpCStep instanceof ChoiceStep) {
				ChoiceStep cStep = (ChoiceStep) tmpCStep;
				if (tmpEg2cs instanceof GW2S) {
					GW2S eg2cs = (GW2S) tmpEg2cs;
					if (tmpStep instanceof ParallelStep) {
						ParallelStep step = (ParallelStep) tmpStep;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpProcess instanceof de.abilov.bpmn.Process) {
								de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
								return new Object[] { prevNode, cStep, eg2cs, step, flow, process, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_11_1_blackBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, ParallelStep step, Flow flow, de.abilov.bpmn.Process process,
			SplitAfterChoiceDef _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { prevNode, cStep, eg2cs, step, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_11_1_bindingAndBlackFFFFFFBFB(SplitAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SplitAfterChoiceDef_11_1_binding = pattern_SplitAfterChoiceDef_11_1_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SplitAfterChoiceDef_11_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_SplitAfterChoiceDef_11_1_binding[0];
			ChoiceStep cStep = (ChoiceStep) result_pattern_SplitAfterChoiceDef_11_1_binding[1];
			GW2S eg2cs = (GW2S) result_pattern_SplitAfterChoiceDef_11_1_binding[2];
			ParallelStep step = (ParallelStep) result_pattern_SplitAfterChoiceDef_11_1_binding[3];
			Flow flow = (Flow) result_pattern_SplitAfterChoiceDef_11_1_binding[4];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_SplitAfterChoiceDef_11_1_binding[5];

			Object[] result_pattern_SplitAfterChoiceDef_11_1_black = pattern_SplitAfterChoiceDef_11_1_blackBBBBBBBFB(
					prevNode, cStep, eg2cs, step, flow, process, _this, isApplicableMatch);
			if (result_pattern_SplitAfterChoiceDef_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SplitAfterChoiceDef_11_1_black[7];

				return new Object[] { prevNode, cStep, eg2cs, step, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_11_1_greenBFBBFFFFB(ExclusiveGateway prevNode,
			ParallelStep step, de.abilov.bpmn.Process process, CSP csp) {
		SequenceFlow sf1 = BpmnFactory.eINSTANCE.createSequenceFlow();
		ParallelGateway pgw = BpmnFactory.eINSTANCE.createParallelGateway();
		FN2S pcgwToStep = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		ParallelGateway pcgw = BpmnFactory.eINSTANCE.createParallelGateway();
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("pgw", "id");
		boolean pcgw_isDiverging_prime = false;
		sf1.setSourceRef(prevNode);
		prevNode.setDefault(sf1);
		process.getFlowElements().add(sf1);
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
		return new Object[] { prevNode, sf1, step, process, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_11_2_blackBBBBBB(SequenceFlow sf1, ParallelStep step,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { sf1, step, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_11_2_greenFBBBBBB(SequenceFlow sf1, ParallelStep step,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(pgw);
		ruleresult.getCreatedLinkElements().add(pcgwToStep);
		ruleresult.getCreatedLinkElements().add(pgwToStep);
		ruleresult.getCreatedElements().add(pcgw);
		return new Object[] { ruleresult, sf1, step, pgw, pcgwToStep, pgwToStep, pcgw };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_11_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject step, EObject flow, EObject process,
			EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		if (!prevNode.equals(sf1)) {
			if (!prevNode.equals(step)) {
				if (!prevNode.equals(process)) {
					if (!cStep.equals(prevNode)) {
						if (!cStep.equals(eg2cs)) {
							if (!cStep.equals(sf1)) {
								if (!cStep.equals(step)) {
									if (!cStep.equals(flow)) {
										if (!cStep.equals(process)) {
											if (!cStep.equals(pgw)) {
												if (!cStep.equals(pcgwToStep)) {
													if (!cStep.equals(pgwToStep)) {
														if (!cStep.equals(pcgw)) {
															if (!eg2cs.equals(prevNode)) {
																if (!eg2cs.equals(sf1)) {
																	if (!eg2cs.equals(step)) {
																		if (!eg2cs.equals(flow)) {
																			if (!eg2cs.equals(process)) {
																				if (!eg2cs.equals(pgw)) {
																					if (!eg2cs.equals(pcgwToStep)) {
																						if (!eg2cs.equals(pgwToStep)) {
																							if (!eg2cs.equals(pcgw)) {
																								if (!sf1.equals(step)) {
																									if (!flow.equals(
																											prevNode)) {
																										if (!flow
																												.equals(sf1)) {
																											if (!flow
																													.equals(step)) {
																												if (!flow
																														.equals(process)) {
																													if (!flow
																															.equals(pgw)) {
																														if (!flow
																																.equals(pcgwToStep)) {
																															if (!flow
																																	.equals(pgwToStep)) {
																																if (!flow
																																		.equals(pcgw)) {
																																	if (!process
																																			.equals(sf1)) {
																																		if (!process
																																				.equals(step)) {
																																			if (!pgw.equals(
																																					prevNode)) {
																																				if (!pgw.equals(
																																						sf1)) {
																																					if (!pgw.equals(
																																							step)) {
																																						if (!pgw.equals(
																																								process)) {
																																							if (!pgw.equals(
																																									pgwToStep)) {
																																								if (!pcgwToStep
																																										.equals(prevNode)) {
																																									if (!pcgwToStep
																																											.equals(sf1)) {
																																										if (!pcgwToStep
																																												.equals(step)) {
																																											if (!pcgwToStep
																																													.equals(process)) {
																																												if (!pcgwToStep
																																														.equals(pgw)) {
																																													if (!pcgwToStep
																																															.equals(pgwToStep)) {
																																														if (!pgwToStep
																																																.equals(prevNode)) {
																																															if (!pgwToStep
																																																	.equals(sf1)) {
																																																if (!pgwToStep
																																																		.equals(step)) {
																																																	if (!pgwToStep
																																																			.equals(process)) {
																																																		if (!pcgw
																																																				.equals(prevNode)) {
																																																			if (!pcgw
																																																					.equals(sf1)) {
																																																				if (!pcgw
																																																						.equals(step)) {
																																																					if (!pcgw
																																																							.equals(process)) {
																																																						if (!pcgw
																																																								.equals(pgw)) {
																																																							if (!pcgw
																																																									.equals(pcgwToStep)) {
																																																								if (!pcgw
																																																										.equals(pgwToStep)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											prevNode,
																																																											cStep,
																																																											eg2cs,
																																																											sf1,
																																																											step,
																																																											flow,
																																																											process,
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

	public static final Object[] pattern_SplitAfterChoiceDef_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject cStep, EObject sf1, EObject step, EObject flow,
			EObject process, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SplitAfterChoiceDef";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String prevNode__sf1____default_name_prime = "default";
		String cStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String pcgwToStep__pcgw____source_name_prime = "source";
		String pcgwToStep__step____target_name_prime = "target";
		String pgwToStep__pgw____source_name_prime = "source";
		String pgwToStep__step____target_name_prime = "target";
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
		prevNode__sf1____default.setSrc(prevNode);
		prevNode__sf1____default.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____default);
		cStep__step____next.setSrc(cStep);
		cStep__step____next.setTrg(step);
		ruleresult.getTranslatedEdges().add(cStep__step____next);
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
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		prevNode__sf1____default.setName(prevNode__sf1____default_name_prime);
		cStep__step____next.setName(cStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		pcgwToStep__pcgw____source.setName(pcgwToStep__pcgw____source_name_prime);
		pcgwToStep__step____target.setName(pcgwToStep__step____target_name_prime);
		pgwToStep__pgw____source.setName(pgwToStep__pgw____source_name_prime);
		pgwToStep__step____target.setName(pgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, prevNode, cStep, sf1, step, flow, process, pgw, pcgwToStep, pgwToStep, pcgw,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, prevNode__sf1____default, cStep__step____next,
				flow__step____steps, process__pgw____flowElements, process__sf1____flowElements,
				process__pcgw____flowElements, sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv,
				pcgwToStep__pcgw____source, pcgwToStep__step____target, pgwToStep__pgw____source,
				pgwToStep__step____target };
	}

	public static final void pattern_SplitAfterChoiceDef_11_5_expressionBBBBBBBBBBBBB(SplitAfterChoiceDef _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject step,
			EObject flow, EObject process, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_BWD(ruleresult, prevNode, cStep, eg2cs, sf1, step, flow, process, pgw, pcgwToStep,
				pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_SplitAfterChoiceDef_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_12_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_12_1_blackFBB(EClass eClass, SplitAfterChoiceDef _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_12_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_12_1_binding = pattern_SplitAfterChoiceDef_12_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SplitAfterChoiceDef_12_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_12_1_black = pattern_SplitAfterChoiceDef_12_1_blackFBB(eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SplitAfterChoiceDef";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("cStep");
		EObject _localVariable_1 = match.getObject("step");
		EObject _localVariable_2 = match.getObject("flow");
		EObject tmpCStep = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		if (tmpCStep instanceof ChoiceStep) {
			ChoiceStep cStep = (ChoiceStep) tmpCStep;
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					return new Object[] { cStep, step, flow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_12_2_blackFBFBBB(ChoiceStep cStep,
			ParallelStep step, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cStep, GW2S.class,
				"target")) {
			Gateway tmpPrevNode = eg2cs.getSource();
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				boolean prevNodeisDiverging = prevNode.isIsDiverging();
				if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
					_result.add(new Object[] { prevNode, cStep, eg2cs, step, flow, match });
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_12_3_blackBBBBBF(ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, ParallelStep step, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (step.equals(cStep.getNext())) {
			if (prevNode.equals(eg2cs.getSource())) {
				if (cStep.equals(eg2cs.getTarget())) {
					if (flow.getSteps().contains(cStep)) {
						if (flow.getSteps().contains(step)) {
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, de.abilov.bpmn.Process.class,
												"flowElements")) {
									_result.add(new Object[] { prevNode, cStep, eg2cs, step, flow, process });
								}
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_12_3_greenBBBBBBFFFFFFF(ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, ParallelStep step, Flow flow, de.abilov.bpmn.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__cStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__cStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cStep__step____next_name_prime = "next";
		String eg2cs__prevNode____source_name_prime = "source";
		String eg2cs__cStep____target_name_prime = "target";
		String flow__cStep____steps_name_prime = "steps";
		String flow__step____steps_name_prime = "steps";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		cStep__step____next.setSrc(cStep);
		cStep__step____next.setTrg(step);
		isApplicableMatch.getAllContextElements().add(cStep__step____next);
		eg2cs__prevNode____source.setSrc(eg2cs);
		eg2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(eg2cs__prevNode____source);
		eg2cs__cStep____target.setSrc(eg2cs);
		eg2cs__cStep____target.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs__cStep____target);
		flow__cStep____steps.setSrc(flow);
		flow__cStep____steps.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(flow__cStep____steps);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		cStep__step____next.setName(cStep__step____next_name_prime);
		eg2cs__prevNode____source.setName(eg2cs__prevNode____source_name_prime);
		eg2cs__cStep____target.setName(eg2cs__cStep____target_name_prime);
		flow__cStep____steps.setName(flow__cStep____steps_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { prevNode, cStep, eg2cs, step, flow, process, isApplicableMatch, cStep__step____next,
				eg2cs__prevNode____source, eg2cs__cStep____target, flow__cStep____steps, flow__step____steps,
				process__prevNode____flowElements };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_12_4_bindingFBBBBBBBB(SplitAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			ParallelStep step, Flow flow, de.abilov.bpmn.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, prevNode, cStep, eg2cs, step, flow,
				process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, cStep, eg2cs, step, flow, process };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_12_4_bindingAndBlackFBBBBBBBB(SplitAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			ParallelStep step, Flow flow, de.abilov.bpmn.Process process) {
		Object[] result_pattern_SplitAfterChoiceDef_12_4_binding = pattern_SplitAfterChoiceDef_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, prevNode, cStep, eg2cs, step, flow, process);
		if (result_pattern_SplitAfterChoiceDef_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterChoiceDef_12_4_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_12_4_black = pattern_SplitAfterChoiceDef_12_4_blackB(csp);
			if (result_pattern_SplitAfterChoiceDef_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, cStep, eg2cs, step, flow, process };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterChoiceDef_12_5_expressionFBB(SplitAfterChoiceDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SplitAfterChoiceDef";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SplitAfterChoiceDef_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_1_blackFBB(EClass __eClass, SplitAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_20_1_binding = pattern_SplitAfterChoiceDef_20_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterChoiceDef_20_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_20_1_black = pattern_SplitAfterChoiceDef_20_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_807368 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_807368)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_774272 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_774272)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_182474 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_182474)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_559559 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_559559)) {
					if (!prevNode.equals(__DEC_pgw___conv_559559)) {
						if (!pcgw.equals(__DEC_pgw___conv_559559)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_928078 = pcgw.get__conv();
			if (__DEC_pcgw___conv_928078 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_928078)) {
					if (!prevNode.equals(__DEC_pcgw___conv_928078)) {
						if (!pgw.equals(__DEC_pcgw___conv_928078)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_231017 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_231017)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_554385 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_554385)) {
					if (!prevNode.equals(__DEC_pcgw___conv_554385)) {
						if (!pgw.equals(__DEC_pcgw___conv_554385)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_2_black_nac_7BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_2_black_nac_8BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_20_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				if (prevNode.equals(sf1.getSourceRef())) {
					if (sf1.equals(prevNode.getDefault())) {
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
												if (pattern_SplitAfterChoiceDef_20_2_black_nac_0BB(sf1,
														prevNode) == null) {
													if (pattern_SplitAfterChoiceDef_20_2_black_nac_7BB(prevNode,
															pgw) == null) {
														if (pattern_SplitAfterChoiceDef_20_2_black_nac_3BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_SplitAfterChoiceDef_20_2_black_nac_4BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_SplitAfterChoiceDef_20_2_black_nac_6BBB(
																		pcgw, prevNode, pgw) == null) {
																	if (pattern_SplitAfterChoiceDef_20_2_black_nac_8BB(
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
																						if (pattern_SplitAfterChoiceDef_20_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_SplitAfterChoiceDef_20_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_SplitAfterChoiceDef_20_2_black_nac_5BB(
																										pcgw,
																										process) == null) {
																									_result.add(
																											new Object[] {
																													prevNode,
																													sf1,
																													process,
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

	public static final Object[] pattern_SplitAfterChoiceDef_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterChoiceDef_20_3_expressionFBBBBBBB(SplitAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_20_4_expressionFBB(SplitAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterChoiceDef_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_1_blackFBB(EClass __eClass, SplitAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_21_1_binding = pattern_SplitAfterChoiceDef_21_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterChoiceDef_21_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_21_1_black = pattern_SplitAfterChoiceDef_21_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_834704 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_834704)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_619797 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_619797)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_559344 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_559344)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_471653 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_471653)) {
					if (!prevNode.equals(__DEC_pgw___conv_471653)) {
						if (!pcgw.equals(__DEC_pgw___conv_471653)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_611741 = pcgw.get__conv();
			if (__DEC_pcgw___conv_611741 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_611741)) {
					if (!prevNode.equals(__DEC_pcgw___conv_611741)) {
						if (!pgw.equals(__DEC_pcgw___conv_611741)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_516652 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_516652)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_39895 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_39895)) {
					if (!prevNode.equals(__DEC_pcgw___conv_39895)) {
						if (!pgw.equals(__DEC_pcgw___conv_39895)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_2_black_nac_7BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_2_black_nac_8BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_21_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			EObject tmpSf1 = _edge_outgoing.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
					if (sf1.equals(prevNode.getDefault())) {
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
												if (pattern_SplitAfterChoiceDef_21_2_black_nac_0BB(sf1,
														prevNode) == null) {
													if (pattern_SplitAfterChoiceDef_21_2_black_nac_7BB(prevNode,
															pgw) == null) {
														if (pattern_SplitAfterChoiceDef_21_2_black_nac_3BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_SplitAfterChoiceDef_21_2_black_nac_4BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_SplitAfterChoiceDef_21_2_black_nac_6BBB(
																		pcgw, prevNode, pgw) == null) {
																	if (pattern_SplitAfterChoiceDef_21_2_black_nac_8BB(
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
																						if (pattern_SplitAfterChoiceDef_21_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_SplitAfterChoiceDef_21_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_SplitAfterChoiceDef_21_2_black_nac_5BB(
																										pcgw,
																										process) == null) {
																									_result.add(
																											new Object[] {
																													prevNode,
																													sf1,
																													process,
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

	public static final Object[] pattern_SplitAfterChoiceDef_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterChoiceDef_21_3_expressionFBBBBBBB(SplitAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_21_4_expressionFBB(SplitAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterChoiceDef_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_1_blackFBB(EClass __eClass, SplitAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_22_1_binding = pattern_SplitAfterChoiceDef_22_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterChoiceDef_22_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_22_1_black = pattern_SplitAfterChoiceDef_22_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_199277 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_199277)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_216896 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_216896)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_560836 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_560836)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_32802 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_32802)) {
					if (!prevNode.equals(__DEC_pgw___conv_32802)) {
						if (!pcgw.equals(__DEC_pgw___conv_32802)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_655607 = pcgw.get__conv();
			if (__DEC_pcgw___conv_655607 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_655607)) {
					if (!prevNode.equals(__DEC_pcgw___conv_655607)) {
						if (!pgw.equals(__DEC_pcgw___conv_655607)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_83082 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_83082)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_425826 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_425826)) {
					if (!prevNode.equals(__DEC_pcgw___conv_425826)) {
						if (!pgw.equals(__DEC_pcgw___conv_425826)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_2_black_nac_7BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_2_black_nac_8BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_22_2_blackFFFFFB(EMoflonEdge _edge_default) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_default.getSrc();
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			EObject tmpSf1 = _edge_default.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
					if (sf1.equals(prevNode.getDefault())) {
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
												if (pattern_SplitAfterChoiceDef_22_2_black_nac_0BB(sf1,
														prevNode) == null) {
													if (pattern_SplitAfterChoiceDef_22_2_black_nac_7BB(prevNode,
															pgw) == null) {
														if (pattern_SplitAfterChoiceDef_22_2_black_nac_3BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_SplitAfterChoiceDef_22_2_black_nac_4BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_SplitAfterChoiceDef_22_2_black_nac_6BBB(
																		pcgw, prevNode, pgw) == null) {
																	if (pattern_SplitAfterChoiceDef_22_2_black_nac_8BB(
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
																						if (pattern_SplitAfterChoiceDef_22_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_SplitAfterChoiceDef_22_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_SplitAfterChoiceDef_22_2_black_nac_5BB(
																										pcgw,
																										process) == null) {
																									_result.add(
																											new Object[] {
																													prevNode,
																													sf1,
																													process,
																													pgw,
																													pcgw,
																													_edge_default });
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}

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

	public static final Object[] pattern_SplitAfterChoiceDef_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterChoiceDef_22_3_expressionFBBBBBBB(SplitAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_22_4_expressionFBB(SplitAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterChoiceDef_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_23_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_23_1_blackFBB(EClass __eClass, SplitAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_23_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_23_1_binding = pattern_SplitAfterChoiceDef_23_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterChoiceDef_23_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_23_1_black = pattern_SplitAfterChoiceDef_23_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_23_2_black_nac_0BB(ParallelStep step, Flow flow) {
		for (Flow __DEC_step_steps_41898 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_41898)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_23_2_black_nac_1BB(ParallelStep step, ChoiceStep cStep) {
		for (Step __DEC_step_next_236566 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_236566)) {
				if (!cStep.equals(__DEC_step_next_236566)) {
					return new Object[] { step, cStep };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_23_2_blackFFFB(EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCStep = _edge_next.getSrc();
		if (tmpCStep instanceof ChoiceStep) {
			ChoiceStep cStep = (ChoiceStep) tmpCStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (step.equals(cStep.getNext())) {
					if (pattern_SplitAfterChoiceDef_23_2_black_nac_1BB(step, cStep) == null) {
						for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cStep,
								Flow.class, "steps")) {
							if (flow.getSteps().contains(step)) {
								if (pattern_SplitAfterChoiceDef_23_2_black_nac_0BB(step, flow) == null) {
									_result.add(new Object[] { cStep, step, flow, _edge_next });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterChoiceDef_23_3_expressionFBBBBB(SplitAfterChoiceDef _this,
			Match match, ChoiceStep cStep, ParallelStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, cStep, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_23_4_expressionFBB(SplitAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterChoiceDef_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_24_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_24_1_blackFBB(EClass __eClass, SplitAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_24_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_24_1_binding = pattern_SplitAfterChoiceDef_24_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterChoiceDef_24_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_24_1_black = pattern_SplitAfterChoiceDef_24_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_24_2_black_nac_0BB(ParallelStep step, Flow flow) {
		for (Flow __DEC_step_steps_482987 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_482987)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_24_2_black_nac_1BB(ParallelStep step, ChoiceStep cStep) {
		for (Step __DEC_step_next_887974 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_887974)) {
				if (!cStep.equals(__DEC_step_next_887974)) {
					return new Object[] { step, cStep };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_24_2_blackFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_SplitAfterChoiceDef_24_2_black_nac_0BB(step, flow) == null) {
						for (Step tmpCStep : flow.getSteps()) {
							if (tmpCStep instanceof ChoiceStep) {
								ChoiceStep cStep = (ChoiceStep) tmpCStep;
								if (step.equals(cStep.getNext())) {
									if (pattern_SplitAfterChoiceDef_24_2_black_nac_1BB(step, cStep) == null) {
										_result.add(new Object[] { cStep, step, flow, _edge_steps });
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

	public static final Object[] pattern_SplitAfterChoiceDef_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterChoiceDef_24_3_expressionFBBBBB(SplitAfterChoiceDef _this,
			Match match, ChoiceStep cStep, ParallelStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, cStep, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_24_4_expressionFBB(SplitAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterChoiceDef_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_1_blackFBB(EClass __eClass, SplitAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_25_1_binding = pattern_SplitAfterChoiceDef_25_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterChoiceDef_25_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_25_1_black = pattern_SplitAfterChoiceDef_25_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_192562 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_192562)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_939692 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_939692)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_305196 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_305196)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_875018 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_875018)) {
					if (!prevNode.equals(__DEC_pgw___conv_875018)) {
						if (!pcgw.equals(__DEC_pgw___conv_875018)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_698639 = pcgw.get__conv();
			if (__DEC_pcgw___conv_698639 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_698639)) {
					if (!prevNode.equals(__DEC_pcgw___conv_698639)) {
						if (!pgw.equals(__DEC_pcgw___conv_698639)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_415490 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_415490)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_86020 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_86020)) {
					if (!prevNode.equals(__DEC_pcgw___conv_86020)) {
						if (!pgw.equals(__DEC_pcgw___conv_86020)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_2_black_nac_7BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_2_black_nac_8BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_25_2_blackFFFFFB(
			EMoflonEdge _edge_flowElements) {
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
										if (pattern_SplitAfterChoiceDef_25_2_black_nac_2BB(pgw, process) == null) {
											if (pattern_SplitAfterChoiceDef_25_2_black_nac_5BB(pcgw, process) == null) {
												for (FlowElement tmpSf1 : process.getFlowElements()) {
													if (tmpSf1 instanceof SequenceFlow) {
														SequenceFlow sf1 = (SequenceFlow) tmpSf1;
														if (pgw.equals(sf1.getTargetRef())) {
															FlowNode tmpPrevNode = sf1.getSourceRef();
															if (tmpPrevNode instanceof ExclusiveGateway) {
																ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
																if (sf1.equals(prevNode.getDefault())) {
																	if (process.getFlowElements().contains(prevNode)) {
																		boolean prevNodeisDiverging = prevNode
																				.isIsDiverging();
																		if (Boolean.valueOf(prevNodeisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			if (pattern_SplitAfterChoiceDef_25_2_black_nac_1BB(
																					sf1, process) == null) {
																				if (pattern_SplitAfterChoiceDef_25_2_black_nac_0BB(
																						sf1, prevNode) == null) {
																					if (pattern_SplitAfterChoiceDef_25_2_black_nac_3BBB(
																							pgw, prevNode,
																							pcgw) == null) {
																						if (pattern_SplitAfterChoiceDef_25_2_black_nac_4BBB(
																								pcgw, prevNode,
																								pgw) == null) {
																							if (pattern_SplitAfterChoiceDef_25_2_black_nac_6BBB(
																									pcgw, prevNode,
																									pgw) == null) {
																								if (pattern_SplitAfterChoiceDef_25_2_black_nac_7BB(
																										prevNode,
																										pgw) == null) {
																									if (pattern_SplitAfterChoiceDef_25_2_black_nac_8BB(
																											pcgw,
																											prevNode) == null) {
																										_result.add(
																												new Object[] {
																														prevNode,
																														sf1,
																														process,
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

	public static final Object[] pattern_SplitAfterChoiceDef_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterChoiceDef_25_3_expressionFBBBBBBB(SplitAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_25_4_expressionFBB(SplitAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterChoiceDef_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_1_blackFBB(EClass __eClass, SplitAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_26_1_binding = pattern_SplitAfterChoiceDef_26_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterChoiceDef_26_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_26_1_black = pattern_SplitAfterChoiceDef_26_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_975720 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_975720)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_238661 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_238661)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_269846 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_269846)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_120056 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_120056)) {
					if (!prevNode.equals(__DEC_pgw___conv_120056)) {
						if (!pcgw.equals(__DEC_pgw___conv_120056)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_781759 = pcgw.get__conv();
			if (__DEC_pcgw___conv_781759 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_781759)) {
					if (!prevNode.equals(__DEC_pcgw___conv_781759)) {
						if (!pgw.equals(__DEC_pcgw___conv_781759)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_287522 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_287522)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_668792 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_668792)) {
					if (!prevNode.equals(__DEC_pcgw___conv_668792)) {
						if (!pgw.equals(__DEC_pcgw___conv_668792)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_2_black_nac_7BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_2_black_nac_8BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_26_2_blackFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpSf1 = _edge_flowElements.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (process.getFlowElements().contains(sf1)) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ExclusiveGateway) {
						ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
						if (sf1.equals(prevNode.getDefault())) {
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
														if (Boolean.valueOf(pgwisDiverging)
																.equals(Boolean.valueOf(true))) {
															boolean pcgwisDiverging = pcgw.isIsDiverging();
															if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
																if (pattern_SplitAfterChoiceDef_26_2_black_nac_1BB(sf1,
																		process) == null) {
																	if (pattern_SplitAfterChoiceDef_26_2_black_nac_0BB(
																			sf1, prevNode) == null) {
																		if (pattern_SplitAfterChoiceDef_26_2_black_nac_2BB(
																				pgw, process) == null) {
																			if (pattern_SplitAfterChoiceDef_26_2_black_nac_7BB(
																					prevNode, pgw) == null) {
																				if (pattern_SplitAfterChoiceDef_26_2_black_nac_3BBB(
																						pgw, prevNode, pcgw) == null) {
																					if (pattern_SplitAfterChoiceDef_26_2_black_nac_4BBB(
																							pcgw, prevNode,
																							pgw) == null) {
																						if (pattern_SplitAfterChoiceDef_26_2_black_nac_5BB(
																								pcgw,
																								process) == null) {
																							if (pattern_SplitAfterChoiceDef_26_2_black_nac_6BBB(
																									pcgw, prevNode,
																									pgw) == null) {
																								if (pattern_SplitAfterChoiceDef_26_2_black_nac_8BB(
																										pcgw,
																										prevNode) == null) {
																									_result.add(
																											new Object[] {
																													prevNode,
																													sf1,
																													process,
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

	public static final Object[] pattern_SplitAfterChoiceDef_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterChoiceDef_26_3_expressionFBBBBBBB(SplitAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_26_4_expressionFBB(SplitAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterChoiceDef_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_1_blackFBB(EClass __eClass, SplitAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_27_1_binding = pattern_SplitAfterChoiceDef_27_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterChoiceDef_27_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_27_1_black = pattern_SplitAfterChoiceDef_27_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_364126 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_364126)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_551168 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_551168)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_357015 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_357015)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_55732 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_55732)) {
					if (!prevNode.equals(__DEC_pgw___conv_55732)) {
						if (!pcgw.equals(__DEC_pgw___conv_55732)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_22046 = pcgw.get__conv();
			if (__DEC_pcgw___conv_22046 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_22046)) {
					if (!prevNode.equals(__DEC_pcgw___conv_22046)) {
						if (!pgw.equals(__DEC_pcgw___conv_22046)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_332008 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_332008)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_787102 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_787102)) {
					if (!prevNode.equals(__DEC_pcgw___conv_787102)) {
						if (!pgw.equals(__DEC_pcgw___conv_787102)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_2_black_nac_7BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_2_black_nac_8BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_27_2_blackFFFFFB(
			EMoflonEdge _edge_flowElements) {
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
						if (pattern_SplitAfterChoiceDef_27_2_black_nac_5BB(pcgw, process) == null) {
							for (FlowElement tmpPgw : process.getFlowElements()) {
								if (tmpPgw instanceof ParallelGateway) {
									ParallelGateway pgw = (ParallelGateway) tmpPgw;
									if (!pcgw.equals(pgw)) {
										if (pcgw.equals(pgw.get__conv())) {
											boolean pgwisDiverging = pgw.isIsDiverging();
											if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
												if (pattern_SplitAfterChoiceDef_27_2_black_nac_2BB(pgw,
														process) == null) {
													for (FlowElement tmpSf1 : process.getFlowElements()) {
														if (tmpSf1 instanceof SequenceFlow) {
															SequenceFlow sf1 = (SequenceFlow) tmpSf1;
															if (pgw.equals(sf1.getTargetRef())) {
																FlowNode tmpPrevNode = sf1.getSourceRef();
																if (tmpPrevNode instanceof ExclusiveGateway) {
																	ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
																	if (sf1.equals(prevNode.getDefault())) {
																		if (process.getFlowElements()
																				.contains(prevNode)) {
																			boolean prevNodeisDiverging = prevNode
																					.isIsDiverging();
																			if (Boolean.valueOf(prevNodeisDiverging)
																					.equals(Boolean.valueOf(true))) {
																				if (pattern_SplitAfterChoiceDef_27_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitAfterChoiceDef_27_2_black_nac_0BB(
																							sf1, prevNode) == null) {
																						if (pattern_SplitAfterChoiceDef_27_2_black_nac_3BBB(
																								pgw, prevNode,
																								pcgw) == null) {
																							if (pattern_SplitAfterChoiceDef_27_2_black_nac_4BBB(
																									pcgw, prevNode,
																									pgw) == null) {
																								if (pattern_SplitAfterChoiceDef_27_2_black_nac_6BBB(
																										pcgw, prevNode,
																										pgw) == null) {
																									if (pattern_SplitAfterChoiceDef_27_2_black_nac_7BB(
																											prevNode,
																											pgw) == null) {
																										if (pattern_SplitAfterChoiceDef_27_2_black_nac_8BB(
																												pcgw,
																												prevNode) == null) {
																											_result.add(
																													new Object[] {
																															prevNode,
																															sf1,
																															process,
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

	public static final Object[] pattern_SplitAfterChoiceDef_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterChoiceDef_27_3_expressionFBBBBBBB(SplitAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_27_4_expressionFBB(SplitAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterChoiceDef_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_1_blackFBB(EClass __eClass, SplitAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_28_1_binding = pattern_SplitAfterChoiceDef_28_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterChoiceDef_28_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_28_1_black = pattern_SplitAfterChoiceDef_28_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_581241 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_581241)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_151845 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_151845)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_865662 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_865662)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_199531 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_199531)) {
					if (!prevNode.equals(__DEC_pgw___conv_199531)) {
						if (!pcgw.equals(__DEC_pgw___conv_199531)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_666866 = pcgw.get__conv();
			if (__DEC_pcgw___conv_666866 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_666866)) {
					if (!prevNode.equals(__DEC_pcgw___conv_666866)) {
						if (!pgw.equals(__DEC_pcgw___conv_666866)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_372339 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_372339)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_301012 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_301012)) {
					if (!prevNode.equals(__DEC_pcgw___conv_301012)) {
						if (!pgw.equals(__DEC_pcgw___conv_301012)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_2_black_nac_7BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_2_black_nac_8BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_28_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
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
						if (sf1.equals(prevNode.getDefault())) {
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
												if (pattern_SplitAfterChoiceDef_28_2_black_nac_0BB(sf1,
														prevNode) == null) {
													if (pattern_SplitAfterChoiceDef_28_2_black_nac_7BB(prevNode,
															pgw) == null) {
														if (pattern_SplitAfterChoiceDef_28_2_black_nac_3BBB(pgw,
																prevNode, pcgw) == null) {
															if (pattern_SplitAfterChoiceDef_28_2_black_nac_4BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_SplitAfterChoiceDef_28_2_black_nac_6BBB(
																		pcgw, prevNode, pgw) == null) {
																	if (pattern_SplitAfterChoiceDef_28_2_black_nac_8BB(
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
																						if (pattern_SplitAfterChoiceDef_28_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_SplitAfterChoiceDef_28_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_SplitAfterChoiceDef_28_2_black_nac_5BB(
																										pcgw,
																										process) == null) {
																									_result.add(
																											new Object[] {
																													prevNode,
																													sf1,
																													process,
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

	public static final Object[] pattern_SplitAfterChoiceDef_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterChoiceDef_28_3_expressionFBBBBBBB(SplitAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_28_4_expressionFBB(SplitAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterChoiceDef_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_1_blackFBB(EClass __eClass, SplitAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_29_1_binding = pattern_SplitAfterChoiceDef_29_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterChoiceDef_29_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_29_1_black = pattern_SplitAfterChoiceDef_29_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_976362 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_976362)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_976870 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_976870)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_762606 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_762606)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_993958 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_993958)) {
					if (!prevNode.equals(__DEC_pgw___conv_993958)) {
						if (!pcgw.equals(__DEC_pgw___conv_993958)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_158226 = pcgw.get__conv();
			if (__DEC_pcgw___conv_158226 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_158226)) {
					if (!prevNode.equals(__DEC_pcgw___conv_158226)) {
						if (!pgw.equals(__DEC_pcgw___conv_158226)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_955683 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_955683)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_345761 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_345761)) {
					if (!prevNode.equals(__DEC_pcgw___conv_345761)) {
						if (!pgw.equals(__DEC_pcgw___conv_345761)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_2_black_nac_7BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_2_black_nac_8BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_29_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
									if (sf1.equals(prevNode.getDefault())) {
										boolean pcgwisDiverging = pcgw.isIsDiverging();
										if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
											boolean prevNodeisDiverging = prevNode.isIsDiverging();
											if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
												if (pattern_SplitAfterChoiceDef_29_2_black_nac_0BB(sf1,
														prevNode) == null) {
													if (pattern_SplitAfterChoiceDef_29_2_black_nac_3BBB(pgw, prevNode,
															pcgw) == null) {
														if (pattern_SplitAfterChoiceDef_29_2_black_nac_4BBB(pcgw,
																prevNode, pgw) == null) {
															if (pattern_SplitAfterChoiceDef_29_2_black_nac_6BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_SplitAfterChoiceDef_29_2_black_nac_7BB(
																		prevNode, pgw) == null) {
																	if (pattern_SplitAfterChoiceDef_29_2_black_nac_8BB(
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
																						if (pattern_SplitAfterChoiceDef_29_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_SplitAfterChoiceDef_29_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_SplitAfterChoiceDef_29_2_black_nac_5BB(
																										pcgw,
																										process) == null) {
																									_result.add(
																											new Object[] {
																													prevNode,
																													sf1,
																													process,
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

	public static final Object[] pattern_SplitAfterChoiceDef_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterChoiceDef_29_3_expressionFBBBBBBB(SplitAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_29_4_expressionFBB(SplitAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterChoiceDef_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_1_bindingFB(SplitAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_1_blackFBB(EClass __eClass, SplitAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_1_bindingAndBlackFFB(SplitAfterChoiceDef _this) {
		Object[] result_pattern_SplitAfterChoiceDef_30_1_binding = pattern_SplitAfterChoiceDef_30_1_bindingFB(_this);
		if (result_pattern_SplitAfterChoiceDef_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterChoiceDef_30_1_binding[0];

			Object[] result_pattern_SplitAfterChoiceDef_30_1_black = pattern_SplitAfterChoiceDef_30_1_blackFBB(__eClass,
					_this);
			if (result_pattern_SplitAfterChoiceDef_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterChoiceDef_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_441127 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_441127)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_970582 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_970582)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_3828 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_3828)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_2_black_nac_3BBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pgw___conv_127504 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
				if (!pgw.equals(__DEC_pgw___conv_127504)) {
					if (!prevNode.equals(__DEC_pgw___conv_127504)) {
						if (!pcgw.equals(__DEC_pgw___conv_127504)) {
							return new Object[] { pgw, prevNode, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_2_black_nac_4BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			Gateway __DEC_pcgw___conv_702300 = pcgw.get__conv();
			if (__DEC_pcgw___conv_702300 != null) {
				if (!pcgw.equals(__DEC_pcgw___conv_702300)) {
					if (!prevNode.equals(__DEC_pcgw___conv_702300)) {
						if (!pgw.equals(__DEC_pcgw___conv_702300)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_781003 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_781003)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_2_black_nac_6BBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, ParallelGateway pgw) {
		if (!pcgw.equals(pgw)) {
			for (Gateway __DEC_pcgw___conv_311411 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
				if (!pcgw.equals(__DEC_pcgw___conv_311411)) {
					if (!prevNode.equals(__DEC_pcgw___conv_311411)) {
						if (!pgw.equals(__DEC_pcgw___conv_311411)) {
							return new Object[] { pcgw, prevNode, pgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_2_black_nac_7BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_2_black_nac_8BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterChoiceDef_30_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
										if (sf1.equals(prevNode.getDefault())) {
											boolean prevNodeisDiverging = prevNode.isIsDiverging();
											if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
												if (pattern_SplitAfterChoiceDef_30_2_black_nac_0BB(sf1,
														prevNode) == null) {
													if (pattern_SplitAfterChoiceDef_30_2_black_nac_3BBB(pgw, prevNode,
															pcgw) == null) {
														if (pattern_SplitAfterChoiceDef_30_2_black_nac_4BBB(pcgw,
																prevNode, pgw) == null) {
															if (pattern_SplitAfterChoiceDef_30_2_black_nac_6BBB(pcgw,
																	prevNode, pgw) == null) {
																if (pattern_SplitAfterChoiceDef_30_2_black_nac_7BB(
																		prevNode, pgw) == null) {
																	if (pattern_SplitAfterChoiceDef_30_2_black_nac_8BB(
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
																						if (pattern_SplitAfterChoiceDef_30_2_black_nac_1BB(
																								sf1, process) == null) {
																							if (pattern_SplitAfterChoiceDef_30_2_black_nac_2BB(
																									pgw,
																									process) == null) {
																								if (pattern_SplitAfterChoiceDef_30_2_black_nac_5BB(
																										pcgw,
																										process) == null) {
																									_result.add(
																											new Object[] {
																													prevNode,
																													sf1,
																													process,
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

	public static final Object[] pattern_SplitAfterChoiceDef_30_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterChoiceDef_30_3_expressionFBBBBBBB(SplitAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterChoiceDef_30_4_expressionFBB(SplitAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterChoiceDef_30_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterChoiceDef_30_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SplitAfterChoiceDefImpl
