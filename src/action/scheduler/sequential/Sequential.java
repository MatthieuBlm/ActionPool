package src.action.scheduler.sequential;

import src.action.Action;
import src.action.scheduler.Scheduler;

/**
 * action sequential, finished the action in progress before begin an other action
 * @author Meyer Bellamy
 *
 */
public abstract class Sequential extends Scheduler{

	
	/**
	 * Constructor Sequential
	 */
	public Sequential() {
		super();
	}


	/* (non-Javadoc)
	 * @see src.action.scheduler.Scheduler#nextAction()
	 */
	@Override
	protected Action nextAction() {
		return actions.get(0);
	}

	
}

