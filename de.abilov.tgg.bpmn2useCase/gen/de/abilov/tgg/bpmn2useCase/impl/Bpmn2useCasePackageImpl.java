/**
 */
package de.abilov.tgg.bpmn2useCase.impl;

import TGGLanguage.TGGLanguagePackage;

import de.abilov.bpmn.BpmnPackage;

import de.abilov.tgg.bpmn2useCase.Bpmn2useCaseFactory;
import de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage;

import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;

import de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl;

import de.abilov.useCase.UseCasePackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bpmn2useCasePackageImpl extends EPackageImpl implements Bpmn2useCasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "de.abilov.tgg.bpmn2useCase.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p2UCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fn2FEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gw2SEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fn2SEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bpmn2useCasePackageImpl() {
		super(eNS_URI, Bpmn2useCaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Bpmn2useCasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Bpmn2useCasePackage init() {
		if (isInited)
			return (Bpmn2useCasePackage) EPackage.Registry.INSTANCE.getEPackage(Bpmn2useCasePackage.eNS_URI);

		// Obtain or create and register package
		Bpmn2useCasePackageImpl theBpmn2useCasePackage = (Bpmn2useCasePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Bpmn2useCasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Bpmn2useCasePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BpmnPackage.eINSTANCE.eClass();
		UseCasePackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Load packages
		theBpmn2useCasePackage.loadPackage();

		// Fix loaded packages
		theBpmn2useCasePackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theBpmn2useCasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bpmn2useCasePackage.eNS_URI, theBpmn2useCasePackage);
		return theBpmn2useCasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP2UC() {
		if (p2UCEClass == null) {
			p2UCEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Bpmn2useCasePackage.eNS_URI).getEClassifiers()
					.get(0);
		}
		return p2UCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getP2UC_Source() {
		return (EReference) getP2UC().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getP2UC_Target() {
		return (EReference) getP2UC().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFN2F() {
		if (fn2FEClass == null) {
			fn2FEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Bpmn2useCasePackage.eNS_URI).getEClassifiers()
					.get(1);
		}
		return fn2FEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFN2F_Source() {
		return (EReference) getFN2F().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFN2F_Target() {
		return (EReference) getFN2F().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGW2S() {
		if (gw2SEClass == null) {
			gw2SEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Bpmn2useCasePackage.eNS_URI).getEClassifiers()
					.get(2);
		}
		return gw2SEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGW2S_Source() {
		return (EReference) getGW2S().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGW2S_Target() {
		return (EReference) getGW2S().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFN2S() {
		if (fn2SEClass == null) {
			fn2SEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Bpmn2useCasePackage.eNS_URI).getEClassifiers()
					.get(3);
		}
		return fn2SEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFN2S_Source() {
		return (EReference) getFN2S().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFN2S_Target() {
		return (EReference) getFN2S().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2useCaseFactory getBpmn2useCaseFactory() {
		return (Bpmn2useCaseFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("de.abilov.tgg.bpmn2useCase." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Bpmn2useCasePackageImpl
