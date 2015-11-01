package src.action.scheduler.fair;

import src.action.Action;
import src.action.scheduler.Scheduler;

/**
 * Fair Action shares all the actions
 * @author Meyer Bellamy
 *
 */

public abstract class Fair extends Scheduler
{
	/**
	 * attribute turn keep the turn
	 */
	protected int turn;
	
	/**
	 * Constructor Fair
	 * initialize the turn at 0
	 */
	public Fair() {
		super();	
		turn = 0;
	}

	/* (non-Javadoc)
	 * @see src.action.scheduler.Scheduler#nextAction()
	 */
	@Override
	protected Action nextAction() {
		if (this.actions.size() != 0) {
			int tour = (turn)%this.actions.size();
			turn ++;
			return actions.get(tour);
		} else {
			return null;
		}
	}
	
}

