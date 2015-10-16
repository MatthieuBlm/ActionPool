package action;

import exception.ActionFinishedException;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public abstract class Action
{
	/**
	 * <!-- begin-user-doc -->
	 * attribute which is true if the action is ready else false
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected boolean isReady;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * attribute totalTime contains the total time for the execution
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected int totalTime;
	

	/**
	 * <br>
	 * <!-- begin-user-doc -->
	 * Constructor Action
	 * <!--  end-user-doc  -->
	 * @param timeToEnd contains the time to execute the action
	 * @generated
	 * @ordered
	 */
	
	public Action(int timeToEnd) {
		this.totalTime= timeToEnd;	
		isReady =true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public abstract boolean isReady();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public abstract boolean isInProgess() ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public abstract boolean isFinished();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public final void doStep() throws ActionFinishedException{
			if (this.isFinished()) {
				throw new ActionFinishedException();
			}
			reallyDoOneStep();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public abstract void reallyDoOneStep() ;
	
	public int getTotalTime() {
		return this.totalTime;
	}
	
}

