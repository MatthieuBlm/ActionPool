package src.action;

import src.exception.ActionFinishedException;

/**
 * Action's class represents an action with its moments(ready, progress, finished)
 * 
 * @author Meyer Bellamy
 *
 */
public abstract class Action{
	/**
	 * attribute isReady is true if the action is ready else is false
	 */
	protected boolean isReady;
	
	/**
	 * return true if the action can be run
	 * @return true if the action is ready else false
	 */
	public abstract boolean isReady();
	
	/**
	 * return true if the action is in progress else false
	 * @return true if the action is in progress else false
	 */
	public abstract boolean isInProgess() ;
	
	/**
	 * return true if the action is finished else false
	 * @return true id the action is finished else false
	 */
	public abstract boolean isFinished();
	
	
	/**
	 * do one step according to the action
	 */
	public abstract void reallyDoOneStep() ;

	/**
	 * Constructor action 
	 * put the attribute isReady at true
	 */
	public Action() {
		isReady = true;
	}
	
	/**
	 * make one step of the action
	 * @throws ActionFinishedException if the action is already finished
	 */
	public final void doStep() throws ActionFinishedException{
			if (this.isFinished()) {
				throw new ActionFinishedException();
			}
			reallyDoOneStep();
	}
	
	
}

