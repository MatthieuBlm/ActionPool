package src.action.foreseeable;
import src.action.Action;

/**
 * Action Foreseeable must be execute in some time given at the build
 * @author Meyer Bellamy
 *
 */
public abstract class Foreseeable extends Action{
	/**
	 * attribute remainingTime keep the remaining time to finished
	 */
	protected int remainingTime;
	/**
	 * attribute totalTime keep the real time to execute the action
	 */
	protected int totalTime;
	
	/**
	 * Constructor Foreseeable 
	 * @param totalTime the time to finish the action
	 */
	public Foreseeable(int totalTime){
		super();
		this.remainingTime = totalTime;
		this.totalTime = totalTime;
	}
	
	

	/* (non-Javadoc)
	 * @see src.action.Action#isReady()
	 */
	public boolean isReady() {
		return (remainingTime == totalTime);	
	}
	
	/* (non-Javadoc)
	 * @see src.action.Action#reallyDoOneStep()
	 */
	public void reallyDoOneStep() {
		remainingTime--;
	}

	/* (non-Javadoc)
	 * @see src.action.Action#isInProgess()
	 */
	@Override
	public boolean isInProgess() {
		return (!isReady() && !isFinished());
	}

	/* (non-Javadoc)
	 * @see src.action.Action#isFinished()
	 */
	@Override
	public boolean isFinished() {
		return (remainingTime <= 0);
	}

	/**
	 * return the total time
	 * @return the total time
	 */
	public int getTotalTime() {
		return totalTime;
	}

	
}

