package action.scheduler;


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
	protected Scheduler nextAction() {
		return (Scheduler) actions.get(0);
	}

	
}

