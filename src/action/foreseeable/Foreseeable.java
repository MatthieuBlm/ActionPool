package action.foreseeable;
import action.Action;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Foreseeable extends Action
{
	
	/**
	 * <!-- begin-user-doc -->
	 * attribute which contains the remaining time 
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected int remainingTime;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Foreseeable(int totalTime){
		super(totalTime);
		this.remainingTime = totalTime;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean isReady() {
		return (remainingTime == totalTime);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean isInProgress() {
		return (!isReady() && !isFinished());	
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void reallyDoOneStep() {
		remainingTime--;
	}

	@Override
	public boolean isInProgess() {
		return (!isReady() && !isFinished());
	}

	@Override
	public boolean isFinished() {
		return (remainingTime <= 0);
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Foreseeable) {
			Foreseeable other = (Foreseeable) o;
			return other.getTotalTime() == this.totalTime;
		}
		return false;
	}
	
}

