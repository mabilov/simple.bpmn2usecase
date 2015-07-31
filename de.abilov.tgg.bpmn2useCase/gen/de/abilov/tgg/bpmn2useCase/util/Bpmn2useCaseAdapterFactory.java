/**
 */
package de.abilov.tgg.bpmn2useCase.util;

import TGGRuntime.AbstractCorrespondence;

import de.abilov.tgg.bpmn2useCase.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage
 * @generated
 */
public class Bpmn2useCaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Bpmn2useCasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2useCaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Bpmn2useCasePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bpmn2useCaseSwitch<Adapter> modelSwitch = new Bpmn2useCaseSwitch<Adapter>() {
		@Override
		public Adapter caseP2UC(P2UC object) {
			return createP2UCAdapter();
		}

		@Override
		public Adapter caseFN2F(FN2F object) {
			return createFN2FAdapter();
		}

		@Override
		public Adapter caseGW2S(GW2S object) {
			return createGW2SAdapter();
		}

		@Override
		public Adapter caseFN2S(FN2S object) {
			return createFN2SAdapter();
		}

		@Override
		public Adapter caseAbstractCorrespondence(AbstractCorrespondence object) {
			return createAbstractCorrespondenceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.P2UC <em>P2UC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.P2UC
	 * @generated
	 */
	public Adapter createP2UCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.FN2F <em>FN2F</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.FN2F
	 * @generated
	 */
	public Adapter createFN2FAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.GW2S <em>GW2S</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.GW2S
	 * @generated
	 */
	public Adapter createGW2SAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.FN2S <em>FN2S</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.FN2S
	 * @generated
	 */
	public Adapter createFN2SAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TGGRuntime.AbstractCorrespondence <em>Abstract Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TGGRuntime.AbstractCorrespondence
	 * @generated
	 */
	public Adapter createAbstractCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Bpmn2useCaseAdapterFactory
