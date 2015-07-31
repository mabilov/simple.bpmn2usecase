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
import de.abilov.tgg.bpmn2useCase.FN2F;
import de.abilov.tgg.bpmn2useCase.FN2S;
import de.abilov.tgg.bpmn2useCase.GW2S;

import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;
import de.abilov.tgg.bpmn2useCase.Rules.SplitFirst;

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
 * An implementation of the model object '<em><b>Split First</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SplitFirstImpl extends AbstractRuleImpl implements SplitFirst {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitFirstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSplitFirst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		// initial bindings
		Object[] result1_black = SplitFirstImpl.pattern_SplitFirst_0_1_blackBBBBBBB(this, match, prevNode, process, sf1,
				pgw, pcgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process
							+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_0_2_bindingAndBlackFBBBBBBB(this, match,
				prevNode, process, sf1, pgw, pcgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = "
					+ process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SplitFirstImpl.pattern_SplitFirst_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SplitFirstImpl.pattern_SplitFirst_0_4_blackBBBBBB(match, prevNode, process, sf1,
					pgw, pcgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
						+ "[pcgw] = " + pcgw + ".");
			}
			SplitFirstImpl.pattern_SplitFirst_0_4_greenBBBBBBFFFFFFFF(match, prevNode, process, sf1, pgw, pcgw);
			// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result4_green[8];
			// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result4_green[9];
			// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result4_green[10];
			// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result4_green[11];
			// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[12];
			// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = SplitFirstImpl.pattern_SplitFirst_0_5_blackBBBBBB(match, prevNode, process, sf1,
					pgw, pcgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process + ", "
								+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
			}
			SplitFirstImpl.pattern_SplitFirst_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			SplitFirstImpl.pattern_SplitFirst_0_6_expressionBBBBBBB(this, match, prevNode, process, sf1, pgw, pcgw);
			return SplitFirstImpl.pattern_SplitFirst_0_7_expressionF();
		} else {
			return SplitFirstImpl.pattern_SplitFirst_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_1_1_bindingAndBlackFFFFFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2F pnToFlow = (FN2F) result1_bindingAndBlack[0];
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[1];
		Flow flow = (Flow) result1_bindingAndBlack[2];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[3];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[4];
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[5];
		ParallelGateway pcgw = (ParallelGateway) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_1_1_greenFBBFFBB(flow, pgw, pcgw, csp);
		ParallelStep step = (ParallelStep) result1_green[0];
		FN2S pcgwToStep = (FN2S) result1_green[3];
		GW2S pgwToStep = (GW2S) result1_green[4];

		// collect translated elements
		Object[] result2_black = SplitFirstImpl.pattern_SplitFirst_1_2_blackBBBBBB(step, sf1, pgw, pcgwToStep,
				pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = "
					+ pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = SplitFirstImpl.pattern_SplitFirst_1_2_greenFBBBBBB(step, sf1, pgw, pcgwToStep,
				pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SplitFirstImpl.pattern_SplitFirst_1_3_blackBBBBBBBBBBB(ruleresult, pnToFlow, step,
				prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pnToFlow] = " + pnToFlow + ", " + "[step] = " + step
					+ ", " + "[prevNode] = " + prevNode + ", " + "[flow] = " + flow + ", " + "[process] = " + process
					+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", "
					+ "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		SplitFirstImpl.pattern_SplitFirst_1_3_greenBBBBBBBBBBFFFFFFFFFFFFF(ruleresult, step, prevNode, flow, process,
				sf1, pgw, pcgwToStep, pgwToStep, pcgw);
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
		SplitFirstImpl.pattern_SplitFirst_1_5_expressionBBBBBBBBBBBB(this, ruleresult, pnToFlow, step, prevNode, flow,
				process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		return SplitFirstImpl.pattern_SplitFirst_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SplitFirstImpl.pattern_SplitFirst_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		FlowNode prevNode = (FlowNode) result2_binding[0];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ParallelGateway pgw = (ParallelGateway) result2_binding[3];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[4];
		for (Object[] result2_black : SplitFirstImpl.pattern_SplitFirst_2_2_blackFBFBBBBB(prevNode, process, sf1, pgw,
				pcgw, match)) {
			FN2F pnToFlow = (FN2F) result2_black[0];
			Flow flow = (Flow) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : SplitFirstImpl.pattern_SplitFirst_2_3_blackBBBBBBB(pnToFlow, prevNode, flow,
					process, sf1, pgw, pcgw)) {
				Object[] result3_green = SplitFirstImpl.pattern_SplitFirst_2_3_greenBBBBBBBFFFFFFFFFFFF(pnToFlow,
						prevNode, flow, process, sf1, pgw, pcgw);
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
				Object[] result4_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_2_4_bindingAndBlackFBBBBBBBBB(this,
						isApplicableMatch, pnToFlow, prevNode, flow, process, sf1, pgw, pcgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pnToFlow] = " + pnToFlow + ", " + "[prevNode] = " + prevNode + ", " + "[flow] = " + flow
							+ ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
							+ "[pcgw] = " + pcgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SplitFirstImpl.pattern_SplitFirst_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SplitFirstImpl.pattern_SplitFirst_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SplitFirstImpl.pattern_SplitFirst_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SplitFirstImpl.pattern_SplitFirst_2_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode,
			Flow flow, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {// Create CSP
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
	public boolean isAppropriate_BWD(Match match, ParallelStep step, Flow flow) {
		// initial bindings
		Object[] result1_black = SplitFirstImpl.pattern_SplitFirst_10_1_blackBBBB(this, match, step, flow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_10_2_bindingAndBlackFBBBB(this, match,
				step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SplitFirstImpl.pattern_SplitFirst_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SplitFirstImpl.pattern_SplitFirst_10_4_blackBBB(match, step, flow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed." + " Variables: "
								+ "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			SplitFirstImpl.pattern_SplitFirst_10_4_greenBBBF(match, step, flow);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = SplitFirstImpl.pattern_SplitFirst_10_5_blackBBB(match, step, flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			SplitFirstImpl.pattern_SplitFirst_10_5_greenBB(match, flow);

			// register objects to match
			SplitFirstImpl.pattern_SplitFirst_10_6_expressionBBBB(this, match, step, flow);
			return SplitFirstImpl.pattern_SplitFirst_10_7_expressionF();
		} else {
			return SplitFirstImpl.pattern_SplitFirst_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_11_1_bindingAndBlackFFFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2F pnToFlow = (FN2F) result1_bindingAndBlack[0];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[1];
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_11_1_greenBBBFFFFFB(step, prevNode, process, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[3];
		ParallelGateway pgw = (ParallelGateway) result1_green[4];
		FN2S pcgwToStep = (FN2S) result1_green[5];
		GW2S pgwToStep = (GW2S) result1_green[6];
		ParallelGateway pcgw = (ParallelGateway) result1_green[7];

		// collect translated elements
		Object[] result2_black = SplitFirstImpl.pattern_SplitFirst_11_2_blackBBBBBB(step, sf1, pgw, pcgwToStep,
				pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = "
					+ pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = SplitFirstImpl.pattern_SplitFirst_11_2_greenFBBBBBB(step, sf1, pgw, pcgwToStep,
				pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SplitFirstImpl.pattern_SplitFirst_11_3_blackBBBBBBBBBBB(ruleresult, pnToFlow, step,
				prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pnToFlow] = " + pnToFlow + ", " + "[step] = " + step
					+ ", " + "[prevNode] = " + prevNode + ", " + "[flow] = " + flow + ", " + "[process] = " + process
					+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", "
					+ "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		SplitFirstImpl.pattern_SplitFirst_11_3_greenBBBBBBBBBBFFFFFFFFFFFFF(ruleresult, step, prevNode, flow, process,
				sf1, pgw, pcgwToStep, pgwToStep, pcgw);
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
		SplitFirstImpl.pattern_SplitFirst_11_5_expressionBBBBBBBBBBBB(this, ruleresult, pnToFlow, step, prevNode, flow,
				process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
		return SplitFirstImpl.pattern_SplitFirst_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SplitFirstImpl.pattern_SplitFirst_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ParallelStep step = (ParallelStep) result2_binding[0];
		Flow flow = (Flow) result2_binding[1];
		for (Object[] result2_black : SplitFirstImpl.pattern_SplitFirst_12_2_blackFBFBB(step, flow, match)) {
			FN2F pnToFlow = (FN2F) result2_black[0];
			FlowNode prevNode = (FlowNode) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : SplitFirstImpl.pattern_SplitFirst_12_3_blackBBBBF(pnToFlow, step, prevNode,
					flow)) {
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result3_black[4];
				Object[] result3_green = SplitFirstImpl.pattern_SplitFirst_12_3_greenBBBBBFFFFF(pnToFlow, step,
						prevNode, flow, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge pnToFlow__prevNode____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge pnToFlow__flow____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[8];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_12_4_bindingAndBlackFBBBBBBB(this,
						isApplicableMatch, pnToFlow, step, prevNode, flow, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pnToFlow] = " + pnToFlow + ", " + "[step] = " + step + ", " + "[prevNode] = " + prevNode
							+ ", " + "[flow] = " + flow + ", " + "[process] = " + process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SplitFirstImpl.pattern_SplitFirst_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SplitFirstImpl.pattern_SplitFirst_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SplitFirstImpl.pattern_SplitFirst_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SplitFirstImpl.pattern_SplitFirst_12_7_expressionFB(ruleresult);
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
			FlowNode prevNode, Flow flow, de.abilov.bpmn.Process process) {// Create CSP
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
				.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getParallelStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_130(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitFirstImpl.pattern_SplitFirst_20_2_blackFFB(_edge_steps)) {
			ParallelStep step = (ParallelStep) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			Object[] result2_green = SplitFirstImpl.pattern_SplitFirst_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitFirstImpl.pattern_SplitFirst_20_3_expressionFBBBB(this, match, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (SplitFirstImpl.pattern_SplitFirst_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitFirstImpl.pattern_SplitFirst_20_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitFirstImpl.pattern_SplitFirst_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitFirstImpl.pattern_SplitFirst_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_423(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitFirstImpl.pattern_SplitFirst_21_2_blackFFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitFirstImpl.pattern_SplitFirst_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitFirstImpl.pattern_SplitFirst_21_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw,
					pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitFirstImpl.pattern_SplitFirst_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitFirstImpl.pattern_SplitFirst_21_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitFirstImpl.pattern_SplitFirst_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitFirstImpl.pattern_SplitFirst_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_424(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitFirstImpl.pattern_SplitFirst_22_2_blackFFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitFirstImpl.pattern_SplitFirst_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitFirstImpl.pattern_SplitFirst_22_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw,
					pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitFirstImpl.pattern_SplitFirst_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitFirstImpl.pattern_SplitFirst_22_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitFirstImpl.pattern_SplitFirst_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitFirstImpl.pattern_SplitFirst_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_425(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitFirstImpl.pattern_SplitFirst_23_2_blackFFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitFirstImpl.pattern_SplitFirst_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitFirstImpl.pattern_SplitFirst_23_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw,
					pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitFirstImpl.pattern_SplitFirst_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitFirstImpl.pattern_SplitFirst_23_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitFirstImpl.pattern_SplitFirst_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitFirstImpl.pattern_SplitFirst_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_426(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitFirstImpl.pattern_SplitFirst_24_2_blackFFFFFB(_edge_targetRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitFirstImpl.pattern_SplitFirst_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitFirstImpl.pattern_SplitFirst_24_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw,
					pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitFirstImpl.pattern_SplitFirst_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitFirstImpl.pattern_SplitFirst_24_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitFirstImpl.pattern_SplitFirst_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitFirstImpl.pattern_SplitFirst_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_427(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitFirstImpl.pattern_SplitFirst_25_2_blackFFFFFB(_edge_incoming)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitFirstImpl.pattern_SplitFirst_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitFirstImpl.pattern_SplitFirst_25_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw,
					pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitFirstImpl.pattern_SplitFirst_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitFirstImpl.pattern_SplitFirst_25_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitFirstImpl.pattern_SplitFirst_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitFirstImpl.pattern_SplitFirst_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_428(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitFirstImpl.pattern_SplitFirst_26_2_blackFFFFFB(_edge___conv)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitFirstImpl.pattern_SplitFirst_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitFirstImpl.pattern_SplitFirst_26_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw,
					pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitFirstImpl.pattern_SplitFirst_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitFirstImpl.pattern_SplitFirst_26_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitFirstImpl.pattern_SplitFirst_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitFirstImpl.pattern_SplitFirst_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_429(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitFirstImpl.pattern_SplitFirst_27_2_blackFFFFFB(_edge_sourceRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitFirstImpl.pattern_SplitFirst_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitFirstImpl.pattern_SplitFirst_27_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw,
					pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitFirstImpl.pattern_SplitFirst_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitFirstImpl.pattern_SplitFirst_27_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitFirstImpl.pattern_SplitFirst_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitFirstImpl.pattern_SplitFirst_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_430(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitFirstImpl.pattern_SplitFirst_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitFirstImpl.pattern_SplitFirst_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitFirstImpl.pattern_SplitFirst_28_2_blackFFFFFB(_edge_outgoing)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ParallelGateway pgw = (ParallelGateway) result2_black[3];
			ParallelGateway pcgw = (ParallelGateway) result2_black[4];
			Object[] result2_green = SplitFirstImpl.pattern_SplitFirst_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitFirstImpl.pattern_SplitFirst_28_3_expressionFBBBBBBB(this, match, prevNode, process, sf1, pgw,
					pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitFirstImpl.pattern_SplitFirst_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitFirstImpl.pattern_SplitFirst_28_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitFirstImpl.pattern_SplitFirst_28_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitFirstImpl.pattern_SplitFirst_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SplitFirst");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPnToFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pnToFlow")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2F pnToFlow = (de.abilov.tgg.bpmn2useCase.FN2F) matchForPnToFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ParallelStep step = (de.abilov.useCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.FlowNode prevNode = (de.abilov.bpmn.FlowNode) matchForPrevNode.get().getNode();

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

		eq0.setRuleName("SplitFirst");
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
		ruleResult.setRule("SplitFirst");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPnToFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pnToFlow")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2F pnToFlow = (de.abilov.tgg.bpmn2useCase.FN2F) matchForPnToFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ParallelStep step = (de.abilov.useCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.FlowNode prevNode = (de.abilov.bpmn.FlowNode) matchForPrevNode.get().getNode();

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

		eq0.setRuleName("SplitFirst");
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
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(de.abilov.bpmn.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.SPLIT_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(de.abilov.bpmn.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
			return null;
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(de.abilov.bpmn.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelGateway) arguments.get(5));
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2F_FLOWNODE_FLOW_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (FN2F) arguments.get(1),
					(FlowNode) arguments.get(2), (Flow) arguments.get(3), (de.abilov.bpmn.Process) arguments.get(4),
					(SequenceFlow) arguments.get(5), (ParallelGateway) arguments.get(6),
					(ParallelGateway) arguments.get(7));
		case RulesPackage.SPLIT_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.SPLIT_FIRST___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(Flow) arguments.get(2));
		case RulesPackage.SPLIT_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(Flow) arguments.get(2));
			return null;
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(Flow) arguments.get(2));
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_PARALLELSTEP_FLOWNODE_FLOW_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FN2F) arguments.get(1),
					(ParallelStep) arguments.get(2), (FlowNode) arguments.get(3), (Flow) arguments.get(4),
					(de.abilov.bpmn.Process) arguments.get(5));
		case RulesPackage.SPLIT_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.SPLIT_FIRST___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_130__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_130((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_423__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_423((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_424__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_424((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_425__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_425((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_426__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_426((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_427__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_427((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_428__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_428((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_429__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_429((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_430__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_430((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SPLIT_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SplitFirst_0_1_blackBBBBBBB(SplitFirst _this, Match match, FlowNode prevNode,
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

	public static final Object[] pattern_SplitFirst_0_2_bindingFBBBBBBB(SplitFirst _this, Match match,
			FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, process, sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, process, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitFirst_0_2_bindingAndBlackFBBBBBBB(SplitFirst _this, Match match,
			FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		Object[] result_pattern_SplitFirst_0_2_binding = pattern_SplitFirst_0_2_bindingFBBBBBBB(_this, match, prevNode,
				process, sf1, pgw, pcgw);
		if (result_pattern_SplitFirst_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SplitFirst_0_2_binding[0];

			Object[] result_pattern_SplitFirst_0_2_black = pattern_SplitFirst_0_2_blackB(csp);
			if (result_pattern_SplitFirst_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, process, sf1, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitFirst_0_3_expressionFBB(SplitFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_0_4_blackBBBBBB(Match match, FlowNode prevNode,
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

	public static final Object[] pattern_SplitFirst_0_4_greenBBBBBBFFFFFFFF(Match match, FlowNode prevNode,
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

	public static final Object[] pattern_SplitFirst_0_5_blackBBBBBB(Match match, FlowNode prevNode,
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

	public static final Object[] pattern_SplitFirst_0_5_greenBBBF(Match match, FlowNode prevNode,
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

	public static final void pattern_SplitFirst_0_6_expressionBBBBBBB(SplitFirst _this, Match match, FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		_this.registerObjectsToMatch_FWD(match, prevNode, process, sf1, pgw, pcgw);

	}

	public static final boolean pattern_SplitFirst_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SplitFirst_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_1_1_bindingFFFFFFFB(IsApplicableMatch isApplicableMatch) {
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
					if (tmpProcess instanceof de.abilov.bpmn.Process) {
						de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
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

	public static final Object[] pattern_SplitFirst_1_1_blackBBBBBBBBFB(FN2F pnToFlow, FlowNode prevNode, Flow flow,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw,
			SplitFirst _this, IsApplicableMatch isApplicableMatch) {
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

	public static final Object[] pattern_SplitFirst_1_1_bindingAndBlackFFFFFFFBFB(SplitFirst _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SplitFirst_1_1_binding = pattern_SplitFirst_1_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_SplitFirst_1_1_binding != null) {
			FN2F pnToFlow = (FN2F) result_pattern_SplitFirst_1_1_binding[0];
			FlowNode prevNode = (FlowNode) result_pattern_SplitFirst_1_1_binding[1];
			Flow flow = (Flow) result_pattern_SplitFirst_1_1_binding[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_SplitFirst_1_1_binding[3];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_SplitFirst_1_1_binding[4];
			ParallelGateway pgw = (ParallelGateway) result_pattern_SplitFirst_1_1_binding[5];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_SplitFirst_1_1_binding[6];

			Object[] result_pattern_SplitFirst_1_1_black = pattern_SplitFirst_1_1_blackBBBBBBBBFB(pnToFlow, prevNode,
					flow, process, sf1, pgw, pcgw, _this, isApplicableMatch);
			if (result_pattern_SplitFirst_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SplitFirst_1_1_black[8];

				return new Object[] { pnToFlow, prevNode, flow, process, sf1, pgw, pcgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_1_1_greenFBBFFBB(Flow flow, ParallelGateway pgw,
			ParallelGateway pcgw, CSP csp) {
		ParallelStep step = UseCaseFactory.eINSTANCE.createParallelStep();
		FN2S pcgwToStep = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
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

	public static final Object[] pattern_SplitFirst_1_2_blackBBBBBB(ParallelStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_1_2_greenFBBBBBB(ParallelStep step, SequenceFlow sf1,
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

	public static final Object[] pattern_SplitFirst_1_3_blackBBBBBBBBBBB(PerformRuleResult ruleresult, EObject pnToFlow,
			EObject step, EObject prevNode, EObject flow, EObject process, EObject sf1, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
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

	public static final Object[] pattern_SplitFirst_1_3_greenBBBBBBBBBBFFFFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject step, EObject prevNode, EObject flow, EObject process, EObject sf1, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
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
		String ruleresult_ruleName_prime = "SplitFirst";
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

	public static final void pattern_SplitFirst_1_5_expressionBBBBBBBBBBBB(SplitFirst _this,
			PerformRuleResult ruleresult, EObject pnToFlow, EObject step, EObject prevNode, EObject flow,
			EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_FWD(ruleresult, pnToFlow, step, prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw);

	}

	public static final PerformRuleResult pattern_SplitFirst_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_2_1_bindingFB(SplitFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_2_1_blackFBB(EClass eClass, SplitFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_2_1_bindingAndBlackFFB(SplitFirst _this) {
		Object[] result_pattern_SplitFirst_2_1_binding = pattern_SplitFirst_2_1_bindingFB(_this);
		if (result_pattern_SplitFirst_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SplitFirst_2_1_binding[0];

			Object[] result_pattern_SplitFirst_2_1_black = pattern_SplitFirst_2_1_blackFBB(eClass, _this);
			if (result_pattern_SplitFirst_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SplitFirst_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SplitFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SplitFirst_2_2_bindingFFFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_SplitFirst_2_2_blackFBFBBBBB(FlowNode prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw, Match match) {
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

	public static final Object[] pattern_SplitFirst_2_3_black_nac_0B(Flow flow) {
		for (Step otherSteps : flow.getSteps()) {
			return new Object[] { flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitFirst_2_3_blackBBBBBBB(FN2F pnToFlow, FlowNode prevNode,
			Flow flow, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
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
																if (pattern_SplitFirst_2_3_black_nac_0B(flow) == null) {
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

	public static final Object[] pattern_SplitFirst_2_3_greenBBBBBBBFFFFFFFFFFFF(FN2F pnToFlow, FlowNode prevNode,
			Flow flow, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
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

	public static final Object[] pattern_SplitFirst_2_4_bindingFBBBBBBBBB(SplitFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode, Flow flow,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pnToFlow, prevNode, flow, process,
				sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pnToFlow, prevNode, flow, process, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitFirst_2_4_bindingAndBlackFBBBBBBBBB(SplitFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode, Flow flow,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_SplitFirst_2_4_binding = pattern_SplitFirst_2_4_bindingFBBBBBBBBB(_this,
				isApplicableMatch, pnToFlow, prevNode, flow, process, sf1, pgw, pcgw);
		if (result_pattern_SplitFirst_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SplitFirst_2_4_binding[0];

			Object[] result_pattern_SplitFirst_2_4_black = pattern_SplitFirst_2_4_blackB(csp);
			if (result_pattern_SplitFirst_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pnToFlow, prevNode, flow, process, sf1, pgw,
						pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitFirst_2_5_expressionFBB(SplitFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SplitFirst_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SplitFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SplitFirst_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_10_1_blackBBBB(SplitFirst _this, Match match, ParallelStep step,
			Flow flow) {
		return new Object[] { _this, match, step, flow };
	}

	public static final Object[] pattern_SplitFirst_10_2_bindingFBBBB(SplitFirst _this, Match match, ParallelStep step,
			Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitFirst_10_2_bindingAndBlackFBBBB(SplitFirst _this, Match match,
			ParallelStep step, Flow flow) {
		Object[] result_pattern_SplitFirst_10_2_binding = pattern_SplitFirst_10_2_bindingFBBBB(_this, match, step,
				flow);
		if (result_pattern_SplitFirst_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SplitFirst_10_2_binding[0];

			Object[] result_pattern_SplitFirst_10_2_black = pattern_SplitFirst_10_2_blackB(csp);
			if (result_pattern_SplitFirst_10_2_black != null) {

				return new Object[] { csp, _this, match, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitFirst_10_3_expressionFBB(SplitFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_10_4_blackBBB(Match match, ParallelStep step, Flow flow) {
		return new Object[] { match, step, flow };
	}

	public static final Object[] pattern_SplitFirst_10_4_greenBBBF(Match match, ParallelStep step, Flow flow) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String flow__step____steps_name_prime = "steps";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, step, flow, flow__step____steps };
	}

	public static final Object[] pattern_SplitFirst_10_5_blackBBB(Match match, ParallelStep step, Flow flow) {
		return new Object[] { match, step, flow };
	}

	public static final Object[] pattern_SplitFirst_10_5_greenBB(Match match, Flow flow) {
		match.getContextNodes().add(flow);
		return new Object[] { match, flow };
	}

	public static final void pattern_SplitFirst_10_6_expressionBBBB(SplitFirst _this, Match match, ParallelStep step,
			Flow flow) {
		_this.registerObjectsToMatch_BWD(match, step, flow);

	}

	public static final boolean pattern_SplitFirst_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SplitFirst_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_11_1_bindingFFFFFB(IsApplicableMatch isApplicableMatch) {
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
						if (tmpProcess instanceof de.abilov.bpmn.Process) {
							de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
							return new Object[] { pnToFlow, step, prevNode, flow, process, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_11_1_blackBBBBBBFB(FN2F pnToFlow, ParallelStep step,
			FlowNode prevNode, Flow flow, de.abilov.bpmn.Process process, SplitFirst _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pnToFlow, step, prevNode, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_11_1_bindingAndBlackFFFFFBFB(SplitFirst _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SplitFirst_11_1_binding = pattern_SplitFirst_11_1_bindingFFFFFB(isApplicableMatch);
		if (result_pattern_SplitFirst_11_1_binding != null) {
			FN2F pnToFlow = (FN2F) result_pattern_SplitFirst_11_1_binding[0];
			ParallelStep step = (ParallelStep) result_pattern_SplitFirst_11_1_binding[1];
			FlowNode prevNode = (FlowNode) result_pattern_SplitFirst_11_1_binding[2];
			Flow flow = (Flow) result_pattern_SplitFirst_11_1_binding[3];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_SplitFirst_11_1_binding[4];

			Object[] result_pattern_SplitFirst_11_1_black = pattern_SplitFirst_11_1_blackBBBBBBFB(pnToFlow, step,
					prevNode, flow, process, _this, isApplicableMatch);
			if (result_pattern_SplitFirst_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SplitFirst_11_1_black[6];

				return new Object[] { pnToFlow, step, prevNode, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_11_1_greenBBBFFFFFB(ParallelStep step, FlowNode prevNode,
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
		return new Object[] { step, prevNode, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_SplitFirst_11_2_blackBBBBBB(ParallelStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_11_2_greenFBBBBBB(ParallelStep step, SequenceFlow sf1,
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

	public static final Object[] pattern_SplitFirst_11_3_blackBBBBBBBBBBB(PerformRuleResult ruleresult,
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

	public static final Object[] pattern_SplitFirst_11_3_greenBBBBBBBBBBFFFFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject step, EObject prevNode, EObject flow, EObject process, EObject sf1, EObject pgw, EObject pcgwToStep,
			EObject pgwToStep, EObject pcgw) {
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
		String ruleresult_ruleName_prime = "SplitFirst";
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

	public static final void pattern_SplitFirst_11_5_expressionBBBBBBBBBBBB(SplitFirst _this,
			PerformRuleResult ruleresult, EObject pnToFlow, EObject step, EObject prevNode, EObject flow,
			EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_BWD(ruleresult, pnToFlow, step, prevNode, flow, process, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw);

	}

	public static final PerformRuleResult pattern_SplitFirst_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_12_1_bindingFB(SplitFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_12_1_blackFBB(EClass eClass, SplitFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_12_1_bindingAndBlackFFB(SplitFirst _this) {
		Object[] result_pattern_SplitFirst_12_1_binding = pattern_SplitFirst_12_1_bindingFB(_this);
		if (result_pattern_SplitFirst_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SplitFirst_12_1_binding[0];

			Object[] result_pattern_SplitFirst_12_1_black = pattern_SplitFirst_12_1_blackFBB(eClass, _this);
			if (result_pattern_SplitFirst_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SplitFirst_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SplitFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SplitFirst_12_2_bindingFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_SplitFirst_12_2_blackFBFBB(ParallelStep step, Flow flow,
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

	public static final Iterable<Object[]> pattern_SplitFirst_12_3_blackBBBBF(FN2F pnToFlow, ParallelStep step,
			FlowNode prevNode, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (prevNode.equals(pnToFlow.getSource())) {
			if (flow.equals(pnToFlow.getTarget())) {
				if (flow.getSteps().contains(step)) {
					for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(prevNode, de.abilov.bpmn.Process.class, "flowElements")) {
						_result.add(new Object[] { pnToFlow, step, prevNode, flow, process });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SplitFirst_12_3_greenBBBBBFFFFF(FN2F pnToFlow, ParallelStep step,
			FlowNode prevNode, Flow flow, de.abilov.bpmn.Process process) {
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

	public static final Object[] pattern_SplitFirst_12_4_bindingFBBBBBBB(SplitFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, ParallelStep step, FlowNode prevNode, Flow flow,
			de.abilov.bpmn.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, pnToFlow, step, prevNode, flow,
				process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pnToFlow, step, prevNode, flow, process };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitFirst_12_4_bindingAndBlackFBBBBBBB(SplitFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, ParallelStep step, FlowNode prevNode, Flow flow,
			de.abilov.bpmn.Process process) {
		Object[] result_pattern_SplitFirst_12_4_binding = pattern_SplitFirst_12_4_bindingFBBBBBBB(_this,
				isApplicableMatch, pnToFlow, step, prevNode, flow, process);
		if (result_pattern_SplitFirst_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SplitFirst_12_4_binding[0];

			Object[] result_pattern_SplitFirst_12_4_black = pattern_SplitFirst_12_4_blackB(csp);
			if (result_pattern_SplitFirst_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pnToFlow, step, prevNode, flow, process };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitFirst_12_5_expressionFBB(SplitFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SplitFirst_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SplitFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SplitFirst_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_20_1_bindingFB(SplitFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_20_1_blackFBB(EClass __eClass, SplitFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_20_1_bindingAndBlackFFB(SplitFirst _this) {
		Object[] result_pattern_SplitFirst_20_1_binding = pattern_SplitFirst_20_1_bindingFB(_this);
		if (result_pattern_SplitFirst_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitFirst_20_1_binding[0];

			Object[] result_pattern_SplitFirst_20_1_black = pattern_SplitFirst_20_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitFirst_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitFirst_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitFirst_20_2_black_nac_0BB(ParallelStep step, Flow flow) {
		for (Flow __DEC_step_steps_197096 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_197096)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_20_2_black_nac_1B(ParallelStep step) {
		for (Step __DEC_step_next_667102 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_667102)) {
				return new Object[] { step };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitFirst_20_2_blackFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_SplitFirst_20_2_black_nac_0BB(step, flow) == null) {
						if (pattern_SplitFirst_20_2_black_nac_1B(step) == null) {
							_result.add(new Object[] { step, flow, _edge_steps });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SplitFirst_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitFirst_20_3_expressionFBBBB(SplitFirst _this, Match match,
			ParallelStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitFirst_20_4_expressionFBB(SplitFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitFirst_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitFirst_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_21_1_bindingFB(SplitFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_21_1_blackFBB(EClass __eClass, SplitFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_21_1_bindingAndBlackFFB(SplitFirst _this) {
		Object[] result_pattern_SplitFirst_21_1_binding = pattern_SplitFirst_21_1_bindingFB(_this);
		if (result_pattern_SplitFirst_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitFirst_21_1_binding[0];

			Object[] result_pattern_SplitFirst_21_1_black = pattern_SplitFirst_21_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitFirst_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitFirst_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitFirst_21_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_992866 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_992866)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_21_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_725068 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_725068)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_21_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_789093 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_789093)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_21_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_421518 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_421518)) {
							if (!prevNode.equals(__DEC_pgw___conv_421518)) {
								if (!pcgw.equals(__DEC_pgw___conv_421518)) {
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

	public static final Object[] pattern_SplitFirst_21_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_301129 = pcgw.get__conv();
					if (__DEC_pcgw___conv_301129 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_301129)) {
							if (!prevNode.equals(__DEC_pcgw___conv_301129)) {
								if (!pgw.equals(__DEC_pcgw___conv_301129)) {
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

	public static final Object[] pattern_SplitFirst_21_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_171698 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_171698)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_21_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_300593 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_300593)) {
							if (!prevNode.equals(__DEC_pcgw___conv_300593)) {
								if (!pgw.equals(__DEC_pcgw___conv_300593)) {
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

	public static final Iterable<Object[]> pattern_SplitFirst_21_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
										if (pattern_SplitFirst_21_2_black_nac_2BB(pgw, process) == null) {
											if (pattern_SplitFirst_21_2_black_nac_5BB(pcgw, process) == null) {
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
																			if (pattern_SplitFirst_21_2_black_nac_1BB(
																					sf1, process) == null) {
																				if (pattern_SplitFirst_21_2_black_nac_0BB(
																						sf1, prevNode) == null) {
																					if (pattern_SplitFirst_21_2_black_nac_3BBB(
																							pgw, prevNode,
																							pcgw) == null) {
																						if (pattern_SplitFirst_21_2_black_nac_4BBB(
																								pcgw, prevNode,
																								pgw) == null) {
																							if (pattern_SplitFirst_21_2_black_nac_6BBB(
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

	public static final Object[] pattern_SplitFirst_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitFirst_21_3_expressionFBBBBBBB(SplitFirst _this, Match match,
			FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitFirst_21_4_expressionFBB(SplitFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitFirst_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitFirst_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_22_1_bindingFB(SplitFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_22_1_blackFBB(EClass __eClass, SplitFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_22_1_bindingAndBlackFFB(SplitFirst _this) {
		Object[] result_pattern_SplitFirst_22_1_binding = pattern_SplitFirst_22_1_bindingFB(_this);
		if (result_pattern_SplitFirst_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitFirst_22_1_binding[0];

			Object[] result_pattern_SplitFirst_22_1_black = pattern_SplitFirst_22_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitFirst_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitFirst_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitFirst_22_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_280984 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_280984)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_22_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_566 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_566)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_22_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_377734 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_377734)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_22_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_451859 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_451859)) {
							if (!prevNode.equals(__DEC_pgw___conv_451859)) {
								if (!pcgw.equals(__DEC_pgw___conv_451859)) {
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

	public static final Object[] pattern_SplitFirst_22_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_656243 = pcgw.get__conv();
					if (__DEC_pcgw___conv_656243 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_656243)) {
							if (!prevNode.equals(__DEC_pcgw___conv_656243)) {
								if (!pgw.equals(__DEC_pcgw___conv_656243)) {
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

	public static final Object[] pattern_SplitFirst_22_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_977723 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_977723)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_22_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_448962 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_448962)) {
							if (!prevNode.equals(__DEC_pcgw___conv_448962)) {
								if (!pgw.equals(__DEC_pcgw___conv_448962)) {
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

	public static final Iterable<Object[]> pattern_SplitFirst_22_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
																if (pattern_SplitFirst_22_2_black_nac_1BB(sf1,
																		process) == null) {
																	if (pattern_SplitFirst_22_2_black_nac_2BB(pgw,
																			process) == null) {
																		if (pattern_SplitFirst_22_2_black_nac_0BB(sf1,
																				prevNode) == null) {
																			if (pattern_SplitFirst_22_2_black_nac_3BBB(
																					pgw, prevNode, pcgw) == null) {
																				if (pattern_SplitFirst_22_2_black_nac_4BBB(
																						pcgw, prevNode, pgw) == null) {
																					if (pattern_SplitFirst_22_2_black_nac_5BB(
																							pcgw, process) == null) {
																						if (pattern_SplitFirst_22_2_black_nac_6BBB(
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

	public static final Object[] pattern_SplitFirst_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitFirst_22_3_expressionFBBBBBBB(SplitFirst _this, Match match,
			FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitFirst_22_4_expressionFBB(SplitFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitFirst_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitFirst_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_23_1_bindingFB(SplitFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_23_1_blackFBB(EClass __eClass, SplitFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_23_1_bindingAndBlackFFB(SplitFirst _this) {
		Object[] result_pattern_SplitFirst_23_1_binding = pattern_SplitFirst_23_1_bindingFB(_this);
		if (result_pattern_SplitFirst_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitFirst_23_1_binding[0];

			Object[] result_pattern_SplitFirst_23_1_black = pattern_SplitFirst_23_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitFirst_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitFirst_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitFirst_23_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_651327 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_651327)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_23_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_90939 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_90939)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_23_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_684462 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_684462)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_23_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_52752 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_52752)) {
							if (!prevNode.equals(__DEC_pgw___conv_52752)) {
								if (!pcgw.equals(__DEC_pgw___conv_52752)) {
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

	public static final Object[] pattern_SplitFirst_23_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_903040 = pcgw.get__conv();
					if (__DEC_pcgw___conv_903040 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_903040)) {
							if (!prevNode.equals(__DEC_pcgw___conv_903040)) {
								if (!pgw.equals(__DEC_pcgw___conv_903040)) {
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

	public static final Object[] pattern_SplitFirst_23_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_745522 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_745522)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_23_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_431303 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_431303)) {
							if (!prevNode.equals(__DEC_pcgw___conv_431303)) {
								if (!pgw.equals(__DEC_pcgw___conv_431303)) {
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

	public static final Iterable<Object[]> pattern_SplitFirst_23_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
						if (pattern_SplitFirst_23_2_black_nac_5BB(pcgw, process) == null) {
							for (FlowElement tmpPgw : process.getFlowElements()) {
								if (tmpPgw instanceof ParallelGateway) {
									ParallelGateway pgw = (ParallelGateway) tmpPgw;
									if (!pcgw.equals(pgw)) {
										if (pcgw.equals(pgw.get__conv())) {
											boolean pgwisDiverging = pgw.isIsDiverging();
											if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
												if (pattern_SplitFirst_23_2_black_nac_2BB(pgw, process) == null) {
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
																				if (pattern_SplitFirst_23_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitFirst_23_2_black_nac_0BB(
																							sf1, prevNode) == null) {
																						if (pattern_SplitFirst_23_2_black_nac_3BBB(
																								pgw, prevNode,
																								pcgw) == null) {
																							if (pattern_SplitFirst_23_2_black_nac_4BBB(
																									pcgw, prevNode,
																									pgw) == null) {
																								if (pattern_SplitFirst_23_2_black_nac_6BBB(
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

	public static final Object[] pattern_SplitFirst_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitFirst_23_3_expressionFBBBBBBB(SplitFirst _this, Match match,
			FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitFirst_23_4_expressionFBB(SplitFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitFirst_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitFirst_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_24_1_bindingFB(SplitFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_24_1_blackFBB(EClass __eClass, SplitFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_24_1_bindingAndBlackFFB(SplitFirst _this) {
		Object[] result_pattern_SplitFirst_24_1_binding = pattern_SplitFirst_24_1_bindingFB(_this);
		if (result_pattern_SplitFirst_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitFirst_24_1_binding[0];

			Object[] result_pattern_SplitFirst_24_1_black = pattern_SplitFirst_24_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitFirst_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitFirst_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitFirst_24_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_353474 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_353474)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_24_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_379084 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_379084)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_24_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_151801 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_151801)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_24_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_952605 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_952605)) {
							if (!prevNode.equals(__DEC_pgw___conv_952605)) {
								if (!pcgw.equals(__DEC_pgw___conv_952605)) {
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

	public static final Object[] pattern_SplitFirst_24_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_411936 = pcgw.get__conv();
					if (__DEC_pcgw___conv_411936 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_411936)) {
							if (!prevNode.equals(__DEC_pcgw___conv_411936)) {
								if (!pgw.equals(__DEC_pcgw___conv_411936)) {
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

	public static final Object[] pattern_SplitFirst_24_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_607288 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_607288)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_24_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_589977 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_589977)) {
							if (!prevNode.equals(__DEC_pcgw___conv_589977)) {
								if (!pgw.equals(__DEC_pcgw___conv_589977)) {
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

	public static final Iterable<Object[]> pattern_SplitFirst_24_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
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
												if (pattern_SplitFirst_24_2_black_nac_0BB(sf1, prevNode) == null) {
													if (pattern_SplitFirst_24_2_black_nac_3BBB(pgw, prevNode,
															pcgw) == null) {
														if (pattern_SplitFirst_24_2_black_nac_4BBB(pcgw, prevNode,
																pgw) == null) {
															if (pattern_SplitFirst_24_2_black_nac_6BBB(pcgw, prevNode,
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
																				if (pattern_SplitFirst_24_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitFirst_24_2_black_nac_2BB(
																							pgw, process) == null) {
																						if (pattern_SplitFirst_24_2_black_nac_5BB(
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

	public static final Object[] pattern_SplitFirst_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitFirst_24_3_expressionFBBBBBBB(SplitFirst _this, Match match,
			FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitFirst_24_4_expressionFBB(SplitFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitFirst_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitFirst_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_25_1_bindingFB(SplitFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_25_1_blackFBB(EClass __eClass, SplitFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_25_1_bindingAndBlackFFB(SplitFirst _this) {
		Object[] result_pattern_SplitFirst_25_1_binding = pattern_SplitFirst_25_1_bindingFB(_this);
		if (result_pattern_SplitFirst_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitFirst_25_1_binding[0];

			Object[] result_pattern_SplitFirst_25_1_black = pattern_SplitFirst_25_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitFirst_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitFirst_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitFirst_25_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_889619 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_889619)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_25_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_709761 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_709761)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_25_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_623784 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_623784)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_25_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_878471 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_878471)) {
							if (!prevNode.equals(__DEC_pgw___conv_878471)) {
								if (!pcgw.equals(__DEC_pgw___conv_878471)) {
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

	public static final Object[] pattern_SplitFirst_25_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_377477 = pcgw.get__conv();
					if (__DEC_pcgw___conv_377477 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_377477)) {
							if (!prevNode.equals(__DEC_pcgw___conv_377477)) {
								if (!pgw.equals(__DEC_pcgw___conv_377477)) {
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

	public static final Object[] pattern_SplitFirst_25_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_663722 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_663722)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_25_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_370775 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_370775)) {
							if (!prevNode.equals(__DEC_pcgw___conv_370775)) {
								if (!pgw.equals(__DEC_pcgw___conv_370775)) {
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

	public static final Iterable<Object[]> pattern_SplitFirst_25_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
												if (pattern_SplitFirst_25_2_black_nac_0BB(sf1, prevNode) == null) {
													if (pattern_SplitFirst_25_2_black_nac_3BBB(pgw, prevNode,
															pcgw) == null) {
														if (pattern_SplitFirst_25_2_black_nac_4BBB(pcgw, prevNode,
																pgw) == null) {
															if (pattern_SplitFirst_25_2_black_nac_6BBB(pcgw, prevNode,
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
																				if (pattern_SplitFirst_25_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitFirst_25_2_black_nac_2BB(
																							pgw, process) == null) {
																						if (pattern_SplitFirst_25_2_black_nac_5BB(
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

	public static final Object[] pattern_SplitFirst_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitFirst_25_3_expressionFBBBBBBB(SplitFirst _this, Match match,
			FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitFirst_25_4_expressionFBB(SplitFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitFirst_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitFirst_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_26_1_bindingFB(SplitFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_26_1_blackFBB(EClass __eClass, SplitFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_26_1_bindingAndBlackFFB(SplitFirst _this) {
		Object[] result_pattern_SplitFirst_26_1_binding = pattern_SplitFirst_26_1_bindingFB(_this);
		if (result_pattern_SplitFirst_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitFirst_26_1_binding[0];

			Object[] result_pattern_SplitFirst_26_1_black = pattern_SplitFirst_26_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitFirst_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitFirst_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitFirst_26_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_586598 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_586598)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_493474 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_493474)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_26_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_480419 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_480419)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_26_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_81691 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_81691)) {
							if (!prevNode.equals(__DEC_pgw___conv_81691)) {
								if (!pcgw.equals(__DEC_pgw___conv_81691)) {
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

	public static final Object[] pattern_SplitFirst_26_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_681083 = pcgw.get__conv();
					if (__DEC_pcgw___conv_681083 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_681083)) {
							if (!prevNode.equals(__DEC_pcgw___conv_681083)) {
								if (!pgw.equals(__DEC_pcgw___conv_681083)) {
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

	public static final Object[] pattern_SplitFirst_26_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_926531 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_926531)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_26_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_468251 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_468251)) {
							if (!prevNode.equals(__DEC_pcgw___conv_468251)) {
								if (!pgw.equals(__DEC_pcgw___conv_468251)) {
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

	public static final Iterable<Object[]> pattern_SplitFirst_26_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
												if (pattern_SplitFirst_26_2_black_nac_0BB(sf1, prevNode) == null) {
													if (pattern_SplitFirst_26_2_black_nac_3BBB(pgw, prevNode,
															pcgw) == null) {
														if (pattern_SplitFirst_26_2_black_nac_4BBB(pcgw, prevNode,
																pgw) == null) {
															if (pattern_SplitFirst_26_2_black_nac_6BBB(pcgw, prevNode,
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
																				if (pattern_SplitFirst_26_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitFirst_26_2_black_nac_2BB(
																							pgw, process) == null) {
																						if (pattern_SplitFirst_26_2_black_nac_5BB(
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

	public static final Object[] pattern_SplitFirst_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitFirst_26_3_expressionFBBBBBBB(SplitFirst _this, Match match,
			FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitFirst_26_4_expressionFBB(SplitFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitFirst_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitFirst_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_27_1_bindingFB(SplitFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_27_1_blackFBB(EClass __eClass, SplitFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_27_1_bindingAndBlackFFB(SplitFirst _this) {
		Object[] result_pattern_SplitFirst_27_1_binding = pattern_SplitFirst_27_1_bindingFB(_this);
		if (result_pattern_SplitFirst_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitFirst_27_1_binding[0];

			Object[] result_pattern_SplitFirst_27_1_black = pattern_SplitFirst_27_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitFirst_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitFirst_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitFirst_27_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_389140 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_389140)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_399687 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_399687)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_27_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_861532 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_861532)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_27_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_971527 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_971527)) {
							if (!prevNode.equals(__DEC_pgw___conv_971527)) {
								if (!pcgw.equals(__DEC_pgw___conv_971527)) {
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

	public static final Object[] pattern_SplitFirst_27_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_415444 = pcgw.get__conv();
					if (__DEC_pcgw___conv_415444 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_415444)) {
							if (!prevNode.equals(__DEC_pcgw___conv_415444)) {
								if (!pgw.equals(__DEC_pcgw___conv_415444)) {
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

	public static final Object[] pattern_SplitFirst_27_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_708638 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_708638)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_27_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_737240 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_737240)) {
							if (!prevNode.equals(__DEC_pcgw___conv_737240)) {
								if (!pgw.equals(__DEC_pcgw___conv_737240)) {
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

	public static final Iterable<Object[]> pattern_SplitFirst_27_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
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
												if (pattern_SplitFirst_27_2_black_nac_0BB(sf1, prevNode) == null) {
													if (pattern_SplitFirst_27_2_black_nac_3BBB(pgw, prevNode,
															pcgw) == null) {
														if (pattern_SplitFirst_27_2_black_nac_4BBB(pcgw, prevNode,
																pgw) == null) {
															if (pattern_SplitFirst_27_2_black_nac_6BBB(pcgw, prevNode,
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
																				if (pattern_SplitFirst_27_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitFirst_27_2_black_nac_2BB(
																							pgw, process) == null) {
																						if (pattern_SplitFirst_27_2_black_nac_5BB(
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

	public static final Object[] pattern_SplitFirst_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitFirst_27_3_expressionFBBBBBBB(SplitFirst _this, Match match,
			FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitFirst_27_4_expressionFBB(SplitFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitFirst_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitFirst_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitFirst_28_1_bindingFB(SplitFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_28_1_blackFBB(EClass __eClass, SplitFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_28_1_bindingAndBlackFFB(SplitFirst _this) {
		Object[] result_pattern_SplitFirst_28_1_binding = pattern_SplitFirst_28_1_bindingFB(_this);
		if (result_pattern_SplitFirst_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitFirst_28_1_binding[0];

			Object[] result_pattern_SplitFirst_28_1_black = pattern_SplitFirst_28_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitFirst_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitFirst_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitFirst_28_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_420639 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_420639)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_161212 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_161212)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_28_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_45338 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_45338)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_28_2_black_nac_3BBB(ParallelGateway pgw, FlowNode prevNode,
			ParallelGateway pcgw) {
		if (!pgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pcgw.equals(prevNode)) {
					for (Gateway __DEC_pgw___conv_232823 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
						if (!pgw.equals(__DEC_pgw___conv_232823)) {
							if (!prevNode.equals(__DEC_pgw___conv_232823)) {
								if (!pcgw.equals(__DEC_pgw___conv_232823)) {
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

	public static final Object[] pattern_SplitFirst_28_2_black_nac_4BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					Gateway __DEC_pcgw___conv_602563 = pcgw.get__conv();
					if (__DEC_pcgw___conv_602563 != null) {
						if (!pcgw.equals(__DEC_pcgw___conv_602563)) {
							if (!prevNode.equals(__DEC_pcgw___conv_602563)) {
								if (!pgw.equals(__DEC_pcgw___conv_602563)) {
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

	public static final Object[] pattern_SplitFirst_28_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_94334 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_94334)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitFirst_28_2_black_nac_6BBB(ParallelGateway pcgw, FlowNode prevNode,
			ParallelGateway pgw) {
		if (!pcgw.equals(prevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!pgw.equals(prevNode)) {
					for (Gateway __DEC_pcgw___conv_173747 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
						if (!pcgw.equals(__DEC_pcgw___conv_173747)) {
							if (!prevNode.equals(__DEC_pcgw___conv_173747)) {
								if (!pgw.equals(__DEC_pcgw___conv_173747)) {
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

	public static final Iterable<Object[]> pattern_SplitFirst_28_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
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
												if (pattern_SplitFirst_28_2_black_nac_0BB(sf1, prevNode) == null) {
													if (pattern_SplitFirst_28_2_black_nac_3BBB(pgw, prevNode,
															pcgw) == null) {
														if (pattern_SplitFirst_28_2_black_nac_4BBB(pcgw, prevNode,
																pgw) == null) {
															if (pattern_SplitFirst_28_2_black_nac_6BBB(pcgw, prevNode,
																	pgw) == null) {
																for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(prevNode,
																				de.abilov.bpmn.Process.class,
																				"flowElements")) {
																	if (process.getFlowElements().contains(pgw)) {
																		if (process.getFlowElements().contains(sf1)) {
																			if (process.getFlowElements()
																					.contains(pcgw)) {
																				if (pattern_SplitFirst_28_2_black_nac_1BB(
																						sf1, process) == null) {
																					if (pattern_SplitFirst_28_2_black_nac_2BB(
																							pgw, process) == null) {
																						if (pattern_SplitFirst_28_2_black_nac_5BB(
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

	public static final Object[] pattern_SplitFirst_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitFirst_28_3_expressionFBBBBBBB(SplitFirst _this, Match match,
			FlowNode prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, pgw, pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitFirst_28_4_expressionFBB(SplitFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitFirst_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitFirst_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitFirst_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SplitFirstImpl
