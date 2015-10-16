package action.scheduler;


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
	protected Scheduler nextAction() {
		return (Scheduler) actions.get((turn++)%(this.totalTime));
	}
	
}

