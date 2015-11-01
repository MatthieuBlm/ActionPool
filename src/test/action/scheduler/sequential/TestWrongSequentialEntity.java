/**
 * 
 */
package src.test.action.scheduler.sequential;

import static org.junit.Assert.*;

import org.junit.Test;

import src.exception.ActionFinishedException;

import src.action.Action;
import src.action.foreseeable.Foreseeable;
import src.action.foreseeable.NStepAction;
import src.action.foreseeable.OneStepAction;
import src.action.scheduler.Scheduler;
import src.action.scheduler.sequential.WrongSequentialEntity;

/**
 * class to test sequential
 * @author meyer bellamy
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
