package src.test.action.scheduler.fair;

import org.junit.Test;

import src.action.Action;
import src.action.foreseeable.Foreseeable;
import src.action.foreseeable.NStepAction;
import src.action.foreseeable.OneStepAction;
import src.action.scheduler.Scheduler;
import src.action.scheduler.fair.WrongFairEntity;
import src.exception.ActionFinishedException;

/**
 * Class to test Fair
 * @author meyer bellamy
 *
 */
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

	@Test
	public void testFairWithFinishedAction() throws ActionFinishedException {
		WrongFairEntity sc = new WrongFairEntity();
		Action act = new OneStepAction();
		sc.addAction(new OneStepAction());
		sc.addAction(act);
		sc.getListAction().get(1).doStep();
		sc.addAction(new OneStepAction());
		
		while (!sc.isFinished()){
			sc.doStep();
		}
	}

}
