package action.scheduler;

import action.Action;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public abstract class Sequential extends Scheduler
{

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Sequential() {
		super();
	}


	@Override
	protected Action nextAction() {
		return actions.get(0);
	}

	
}

