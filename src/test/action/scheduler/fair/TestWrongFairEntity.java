package src.test.action.scheduler.fair;

import src.action.Action;
import src.action.foreseeable.Foreseeable;
import src.action.foreseeable.NStepAction;
import src.action.foreseeable.OneStepAction;
import src.action.scheduler.Scheduler;
import src.action.scheduler.fair.WrongFairEntity;

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
