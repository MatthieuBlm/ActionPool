/**
 * 
 */
package test.action.scheduler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import action.Action;
import action.scheduler.Scheduler;
import exception.ActionFinishedException;

/**
 * @author meyer
 *
 */
public abstract class TestSequential extends TestScheduler {

	/**
	 * Test method for {@link action.scheduler.Scheduler#reallyDoOneStep()}.
	 * Test method for {@link action.Action#doStep()}.
	 * @throws ActionFinishedException 
	 */
	@Test
	public void testReallyDoOneStepWithDoStepScheduler1() throws ActionFinishedException {
		Action action1= createAction(2);
		Action action2= createAction(1);
		
		Scheduler scheduler= createScheduler(action1);
		scheduler.addAction(action2);
		
		assertTrue(action1.isReady());
		assertTrue(action2.isReady());
		
		scheduler.doStep();
		
		if (action1.getTotalTime() == 2 && action2.getTotalTime() == 1) {
			assertTrue(action1.isInProgess());
			assertTrue(action2.isReady());
			
			scheduler.doStep();
			
			assertTrue(action1.isFinished());
			assertTrue(action2.isReady());
			
		}
		scheduler.doStep();
		
		assertTrue(action1.isFinished());
		assertTrue(action2.isFinished());
	}

}
