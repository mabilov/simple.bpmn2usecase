/**
 */
package de.abilov.tgg.bpmn2useCase.Rules.impl;

import TGGRuntime.impl.AbstractRuleImpl;

import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;
import de.abilov.tgg.bpmn2useCase.Rules.Termination;

import org.eclipse.emf.ecore.EClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Termination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TerminationImpl extends AbstractRuleImpl implements Termination {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTermination();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TerminationImpl
