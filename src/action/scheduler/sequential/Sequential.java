package src.action.scheduler.sequential;

import src.action.Action;
import src.action.scheduler.Scheduler;


public abstract class Sequential extends Scheduler{

	
	public Sequential() {
		super();
	}


	@Override
	protected Action nextAction() {
		return actions.get(0);
	}

	
}

