/**
 */
package Bpmn2UseCase.util;

import Bpmn2UseCase.*;

import TGGRuntime.AbstractCorrespondence;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Bpmn2UseCase.Bpmn2UseCasePackage
 * @generated
 */
public class Bpmn2UseCaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Bpmn2UseCasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2UseCaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Bpmn2UseCasePackage.eINSTANCE;
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
	protected Bpmn2UseCaseSwitch<Adapter> modelSwitch = new Bpmn2UseCaseSwitch<Adapter>() {
		@Override
		public Adapter caseP2UC(P2UC object) {
			return createP2UCAdapter();
		}

		@Override
		public Adapter caseT2NS(T2NS object) {
			return createT2NSAdapter();
		}

		@Override
		public Adapter casePG2PS(PG2PS object) {
			return createPG2PSAdapter();
		}

		@Override
		public Adapter caseSF2F(SF2F object) {
			return createSF2FAdapter();
		}

		@Override
		public Adapter caseSE2BF(SE2BF object) {
			return createSE2BFAdapter();
		}

		@Override
		public Adapter caseEE2FS(EE2FS object) {
			return createEE2FSAdapter();
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
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.P2UC <em>P2UC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.P2UC
	 * @generated
	 */
	public Adapter createP2UCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.T2NS <em>T2NS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.T2NS
	 * @generated
	 */
	public Adapter createT2NSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.PG2PS <em>PG2PS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.PG2PS
	 * @generated
	 */
	public Adapter createPG2PSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.SF2F <em>SF2F</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.SF2F
	 * @generated
	 */
	public Adapter createSF2FAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.SE2BF <em>SE2BF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.SE2BF
	 * @generated
	 */
	public Adapter createSE2BFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.EE2FS <em>EE2FS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.EE2FS
	 * @generated
	 */
	public Adapter createEE2FSAdapter() {
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

} //Bpmn2UseCaseAdapterFactory
