/**
 * 
 */
package test.action.scheduler;

import static org.junit.Assert.*;

import org.junit.Test;

import exception.ActionFinishedException;

import action.Action;
import action.foreseeable.OneStepAction;
import action.scheduler.Scheduler;
import action.scheduler.WrongEntity;

/**
 * @author meyer
 *
 */
public class TestWrongEntity extends TestScheduler {

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
		Scheduler scheduler = new WrongEntity();
		scheduler.addAction(a);
		return scheduler;
	}


	public Action createAction(int nb) {
		return new OneStepAction();
	}

}