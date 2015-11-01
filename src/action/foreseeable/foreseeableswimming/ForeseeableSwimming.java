package src.action.foreseeable.foreseeableswimming;

import src.action.foreseeable.Foreseeable;

/**
 * ForeseeableSwimming to represents all the action for the swimming pool
 * @author Meyer Bellamy
 *
 */
public abstract class ForeseeableSwimming extends Foreseeable{

	/**
	 * Constructor ForeseeableSwimming
	 * @param totalTime the total time to execute the action
	 */
	public ForeseeableSwimming(int totalTime) {
		super(totalTime);
	}

	/**
	 * print the description
	 */
	public void printDescription() {
		System.out.println(getDescription() + " (" + (this.totalTime-this.remainingTime) + "/" + this.totalTime + ")");
	}
	
	/**
	 * return a description about the action
	 * @return  a description about the action
	 */
	protected abstract String getDescription();
	
	/* (non-Javadoc)
	 * @see src.action.foreseeable.Foreseeable#reallyDoOneStep()
	 */
	public void reallyDoOneStep() {
		super.reallyDoOneStep();
		printDescription();
	}
}
