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
	 * The meta object id for the '{@link Bpmn2UseCase.impl.FN2FImpl <em>FN2F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.impl.FN2FImpl
	 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getFN2F()
	 * @generated
	 */
	int FN2F = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FN2F__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FN2F__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FN2F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FN2F_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FN2F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FN2F_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.impl.GW2SImpl <em>GW2S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.impl.GW2SImpl
	 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getGW2S()
	 * @generated
	 */
	int GW2S = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GW2S__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GW2S__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GW2S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GW2S_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GW2S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GW2S_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.impl.FN2SImpl <em>FN2S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.impl.FN2SImpl
	 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getFN2S()
	 * @generated
	 */
	int FN2S = 3;

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
	 * Returns the meta object for class '{@link Bpmn2UseCase.FN2F <em>FN2F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FN2F</em>'.
	 * @see Bpmn2UseCase.FN2F
	 * @generated
	 */
	EClass getFN2F();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.FN2F#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Bpmn2UseCase.FN2F#getSource()
	 * @see #getFN2F()
	 * @generated
	 */
	EReference getFN2F_Source();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.FN2F#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Bpmn2UseCase.FN2F#getTarget()
	 * @see #getFN2F()
	 * @generated
	 */
	EReference getFN2F_Target();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.GW2S <em>GW2S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GW2S</em>'.
	 * @see Bpmn2UseCase.GW2S
	 * @generated
	 */
	EClass getGW2S();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.GW2S#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Bpmn2UseCase.GW2S#getSource()
	 * @see #getGW2S()
	 * @generated
	 */
	EReference getGW2S_Source();

	/**
	 * Returns the meta object for the reference '{@link Bpmn2UseCase.GW2S#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Bpmn2UseCase.GW2S#getTarget()
	 * @see #getGW2S()
	 * @generated
	 */
	EReference getGW2S_Target();

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
		 * The meta object literal for the '{@link Bpmn2UseCase.impl.FN2FImpl <em>FN2F</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bpmn2UseCase.impl.FN2FImpl
		 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getFN2F()
		 * @generated
		 */
		EClass FN2F = eINSTANCE.getFN2F();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FN2F__SOURCE = eINSTANCE.getFN2F_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FN2F__TARGET = eINSTANCE.getFN2F_Target();

		/**
		 * The meta object literal for the '{@link Bpmn2UseCase.impl.GW2SImpl <em>GW2S</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Bpmn2UseCase.impl.GW2SImpl
		 * @see Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl#getGW2S()
		 * @generated
		 */
		EClass GW2S = eINSTANCE.getGW2S();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GW2S__SOURCE = eINSTANCE.getGW2S_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GW2S__TARGET = eINSTANCE.getGW2S_Target();

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
