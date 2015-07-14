/**
 */
package Bpmn2UseCase;

import TGGRuntime.TGGRuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Bpmn2UseCase.Bpmn2UseCaseFactory
 * @model kind="package"
 * @generated
 */
public interface Bpmn2UseCasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Bpmn2UseCase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/Bpmn2UseCase/model/Bpmn2UseCase.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Bpmn2UseCase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bpmn2UseCasePackage eINSTANCE = Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl.init();

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.impl.P2UCImpl <em>P2UC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.impl.P2UCImpl
	 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getP2UC()
	 * @generated
	 */
	int P2UC = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2UC__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2UC__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>P2UC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2UC_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>P2UC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2UC_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.impl.SF2FImpl <em>SF2F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.impl.SF2FImpl
	 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getSF2F()
	 * @generated
	 */
	int SF2F = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF2F__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF2F__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SF2F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF2F_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SF2F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF2F_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.impl.SE2BFImpl <em>SE2BF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.impl.SE2BFImpl
	 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getSE2BF()
	 * @generated
	 */
	int SE2BF = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE2BF__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE2BF__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SE2BF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE2BF_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SE2BF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE2BF_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.impl.EE2FSImpl <em>EE2FS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.impl.EE2FSImpl
	 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getEE2FS()
	 * @generated
	 */
	int EE2FS = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE2FS__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE2FS__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EE2FS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE2FS_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EE2FS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE2FS_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.impl.FN2SImpl <em>FN2S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.impl.FN2SImpl
	 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getFN2S()
	 * @generated
	 */
	int FN2S = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FN2S__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FN2S__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FN2S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FN2S_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FN2S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FN2S_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.P2UC <em>P2UC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P2UC</em>'.
	 * @see Bpmn2UseCase.P2UC
	 * @generated
	 */
	EClass getP2UC();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.P2UC#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Bpmn2UseCase.P2UC#getSource()
	 * @see #getP2UC()
	 * @generated
	 */
	EReference getP2UC_Source();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.P2UC#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Bpmn2UseCase.P2UC#getTarget()
	 * @see #getP2UC()
	 * @generated
	 */
	EReference getP2UC_Target();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.SF2F <em>SF2F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SF2F</em>'.
	 * @see Bpmn2UseCase.SF2F
	 * @generated
	 */
	EClass getSF2F();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.SF2F#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Bpmn2UseCase.SF2F#getSource()
	 * @see #getSF2F()
	 * @generated
	 */
	EReference getSF2F_Source();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.SF2F#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Bpmn2UseCase.SF2F#getTarget()
	 * @see #getSF2F()
	 * @generated
	 */
	EReference getSF2F_Target();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.SE2BF <em>SE2BF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SE2BF</em>'.
	 * @see Bpmn2UseCase.SE2BF
	 * @generated
	 */
	EClass getSE2BF();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.SE2BF#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Bpmn2UseCase.SE2BF#getSource()
	 * @see #getSE2BF()
	 * @generated
	 */
	EReference getSE2BF_Source();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.SE2BF#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Bpmn2UseCase.SE2BF#getTarget()
	 * @see #getSE2BF()
	 * @generated
	 */
	EReference getSE2BF_Target();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.EE2FS <em>EE2FS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EE2FS</em>'.
	 * @see Bpmn2UseCase.EE2FS
	 * @generated
	 */
	EClass getEE2FS();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.EE2FS#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Bpmn2UseCase.EE2FS#getSource()
	 * @see #getEE2FS()
	 * @generated
	 */
	EReference getEE2FS_Source();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.EE2FS#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Bpmn2UseCase.EE2FS#getTarget()
	 * @see #getEE2FS()
	 * @generated
	 */
	EReference getEE2FS_Target();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.FN2S <em>FN2S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FN2S</em>'.
	 * @see Bpmn2UseCase.FN2S
	 * @generated
	 */
	EClass getFN2S();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.FN2S#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Bpmn2UseCase.FN2S#getSource()
	 * @see #getFN2S()
	 * @generated
	 */
	EReference getFN2S_Source();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.FN2S#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Bpmn2UseCase.FN2S#getTarget()
	 * @see #getFN2S()
	 * @generated
	 */
	EReference getFN2S_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bpmn2UseCaseFactory getBpmn2UseCaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Bpmn2UseCase.impl.P2UCImpl <em>P2UC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bpmn2UseCase.impl.P2UCImpl
		 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getP2UC()
		 * @generated
		 */
		EClass P2UC = eINSTANCE.getP2UC();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference P2UC__SOURCE = eINSTANCE.getP2UC_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference P2UC__TARGET = eINSTANCE.getP2UC_Target();

		/**
		 * The meta object literal for the '{@link Bpmn2UseCase.impl.SF2FImpl <em>SF2F</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bpmn2UseCase.impl.SF2FImpl
		 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getSF2F()
		 * @generated
		 */
		EClass SF2F = eINSTANCE.getSF2F();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SF2F__SOURCE = eINSTANCE.getSF2F_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SF2F__TARGET = eINSTANCE.getSF2F_Target();

		/**
		 * The meta object literal for the '{@link Bpmn2UseCase.impl.SE2BFImpl <em>SE2BF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bpmn2UseCase.impl.SE2BFImpl
		 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getSE2BF()
		 * @generated
		 */
		EClass SE2BF = eINSTANCE.getSE2BF();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE2BF__SOURCE = eINSTANCE.getSE2BF_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE2BF__TARGET = eINSTANCE.getSE2BF_Target();

		/**
		 * The meta object literal for the '{@link Bpmn2UseCase.impl.EE2FSImpl <em>EE2FS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bpmn2UseCase.impl.EE2FSImpl
		 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getEE2FS()
		 * @generated
		 */
		EClass EE2FS = eINSTANCE.getEE2FS();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EE2FS__SOURCE = eINSTANCE.getEE2FS_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EE2FS__TARGET = eINSTANCE.getEE2FS_Target();

		/**
		 * The meta object literal for the '{@link Bpmn2UseCase.impl.FN2SImpl <em>FN2S</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bpmn2UseCase.impl.FN2SImpl
		 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getFN2S()
		 * @generated
		 */
		EClass FN2S = eINSTANCE.getFN2S();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FN2S__SOURCE = eINSTANCE.getFN2S_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FN2S__TARGET = eINSTANCE.getFN2S_Target();

	}

} //Bpmn2UseCasePackage
