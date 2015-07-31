/**
 */
package de.abilov.tgg.bpmn2useCase.impl;

import de.abilov.tgg.bpmn2useCase.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bpmn2useCaseFactoryImpl extends EFactoryImpl implements Bpmn2useCaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bpmn2useCaseFactory init() {
		try {
			Bpmn2useCaseFactory theBpmn2useCaseFactory = (Bpmn2useCaseFactory) EPackage.Registry.INSTANCE
					.getEFactory(Bpmn2useCasePackage.eNS_URI);
			if (theBpmn2useCaseFactory != null) {
				return theBpmn2useCaseFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bpmn2useCaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2useCaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Bpmn2useCasePackage.P2UC:
			return createP2UC();
		case Bpmn2useCasePackage.FN2F:
			return createFN2F();
		case Bpmn2useCasePackage.GW2S:
			return createGW2S();
		case Bpmn2useCasePackage.FN2S:
			return createFN2S();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P2UC createP2UC() {
		P2UCImpl p2UC = new P2UCImpl();
		return p2UC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FN2F createFN2F() {
		FN2FImpl fn2F = new FN2FImpl();
		return fn2F;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GW2S createGW2S() {
		GW2SImpl gw2S = new GW2SImpl();
		return gw2S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FN2S createFN2S() {
		FN2SImpl fn2S = new FN2SImpl();
		return fn2S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2useCasePackage getBpmn2useCasePackage() {
		return (Bpmn2useCasePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bpmn2useCasePackage getPackage() {
		return Bpmn2useCasePackage.eINSTANCE;
	}

} //Bpmn2useCaseFactoryImpl
