package action.scheduler;

import action.Action;


public abstract class Sequential extends Scheduler{

	
	public Sequential() {
		super();
	}


	@Override
	protected Action nextAction() {
		return actions.get(0);
	}

	
}

