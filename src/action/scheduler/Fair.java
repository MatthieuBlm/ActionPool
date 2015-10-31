package src.action.scheduler;

import src.action.Action;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public abstract class Fair extends Scheduler
{
	protected int turn;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Fair() {
		super();	
		turn = 0;
	}


	@Override
	protected Action nextAction() {
		return actions.get((turn++)%(this.actions.size()));
	}
	
}

