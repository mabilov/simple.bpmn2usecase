/**
 */
package SimpleUseCase.impl;

import SimpleUseCase.NormalStep;
import SimpleUseCase.SimpleUseCasePackage;

import org.eclipse.emf.ecore.EClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NormalStepImpl extends StepImpl implements NormalStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleUseCasePackage.Literals.NORMAL_STEP;
	}
	// <-- [user code injected with eMoflon]
	@Override
	public String export() {
		StringBuffer sb = new StringBuffer();
		sb.append(" step ");
		sb.append(this.getId());
		if (this.getNext() != null) {
			sb.append(" next ");
			sb.append(this.getNext().getId());
		}
		return sb.toString();
	}
	// [user code injected with eMoflon] -->
} //NormalStepImpl
