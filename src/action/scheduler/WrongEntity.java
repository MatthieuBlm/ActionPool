package action.scheduler;

import action.Action;

public class WrongEntity extends Scheduler {

	public WrongEntity() {
		super();
	}

	@Override
	protected Action nextAction() {
		return  actions.get(0);
	}


}
