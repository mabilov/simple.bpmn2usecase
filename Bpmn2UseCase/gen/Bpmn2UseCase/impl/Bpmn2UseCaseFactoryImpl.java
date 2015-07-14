/**
 */
package Bpmn2UseCase.impl;

import Bpmn2UseCase.*;

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
public class Bpmn2UseCaseFactoryImpl extends EFactoryImpl implements Bpmn2UseCaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bpmn2UseCaseFactory init() {
		try {
			Bpmn2UseCaseFactory theBpmn2UseCaseFactory = (Bpmn2UseCaseFactory) EPackage.Registry.INSTANCE
					.getEFactory(Bpmn2UseCasePackage.eNS_URI);
			if (theBpmn2UseCaseFactory != null) {
				return theBpmn2UseCaseFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bpmn2UseCaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2UseCaseFactoryImpl() {
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
		case Bpmn2UseCasePackage.P2UC:
			return createP2UC();
		case Bpmn2UseCasePackage.T2NS:
			return createT2NS();
		case Bpmn2UseCasePackage.PG2PS:
			return createPG2PS();
		case Bpmn2UseCasePackage.SF2F:
			return createSF2F();
		case Bpmn2UseCasePackage.SE2BF:
			return createSE2BF();
		case Bpmn2UseCasePackage.EE2FS:
			return createEE2FS();
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
	public T2NS createT2NS() {
		T2NSImpl t2NS = new T2NSImpl();
		return t2NS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PG2PS createPG2PS() {
		PG2PSImpl pg2PS = new PG2PSImpl();
		return pg2PS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SF2F createSF2F() {
		SF2FImpl sf2F = new SF2FImpl();
		return sf2F;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SE2BF createSE2BF() {
		SE2BFImpl se2BF = new SE2BFImpl();
		return se2BF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EE2FS createEE2FS() {
		EE2FSImpl ee2FS = new EE2FSImpl();
		return ee2FS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2UseCasePackage getBpmn2UseCasePackage() {
		return (Bpmn2UseCasePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bpmn2UseCasePackage getPackage() {
		return Bpmn2UseCasePackage.eINSTANCE;
	}

} //Bpmn2UseCaseFactoryImpl
