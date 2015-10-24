/**
 * 
 */
package test.action.scheduler;

import static org.junit.Assert.*;

import org.junit.Test;

import exception.ActionFinishedException;

import action.Action;
import action.foreseeable.Foreseeable;
import action.foreseeable.NStepAction;
import action.foreseeable.OneStepAction;
import action.scheduler.Scheduler;
import action.scheduler.WrongSequentialEntity;

/**
 * @author meyer
 *
 */
public class TestWrongSequentialEntity extends TestSequential {

	@Test
	public void testWithOneStepAction() throws ActionFinishedException {
		OneStepAction action1= new OneStepAction();
		Scheduler scheduler = createScheduler(action1);
		
		assertFalse(scheduler.isFinished());
		assertFalse(scheduler.isFinished());
		
		scheduler.doStep();
		
		assertTrue(scheduler.isFinished());
		assertTrue(action1.isFinished());
	}


	public Scheduler createScheduler(Action a) {
		Scheduler scheduler = new WrongSequentialEntity();
		scheduler.addAction(a);
		return scheduler;
	}


	@Override
	protected Foreseeable createActionForeseeable(int n) {
		return new NStepAction(n);
	}


	@Override
	protected Action createAction() {
		return new OneStepAction();
	}

}
