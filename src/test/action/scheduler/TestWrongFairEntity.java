package test.action.scheduler;

import action.Action;
import action.foreseeable.NStepAction;
import action.scheduler.Scheduler;
import action.scheduler.WrongFairEntity;

public class TestWrongFairEntity extends TestFair {

	protected Scheduler createScheduler(Action a){
		Scheduler scheduler = new WrongFairEntity();
		scheduler.addAction(a);
		return scheduler;
	}
	
	public Action createAction(int nb) {
		return new NStepAction(nb);
		/*return new OneStepAction();*/
	}

}
