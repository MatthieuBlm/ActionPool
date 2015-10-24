package test.action.scheduler;

import action.Action;
import action.foreseeable.Foreseeable;
import action.foreseeable.NStepAction;
import action.foreseeable.OneStepAction;
import action.scheduler.Scheduler;
import action.scheduler.WrongFairEntity;

public class TestWrongFairEntity extends TestFair {

	protected Scheduler createScheduler(Action a){
		Scheduler scheduler = new WrongFairEntity();
		scheduler.addAction(a);
		return scheduler;
	}
	
	public Action createAction() {
		return new OneStepAction();
	}

	@Override
	protected Foreseeable createActionForeseeable(int n) {
		return new NStepAction(n);
	}


}
