/**
 * 
 */
package src.test.action.scheduler.sequential;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import src.action.foreseeable.Foreseeable;
import src.action.scheduler.Scheduler;
import src.exception.ActionFinishedException;
import src.test.action.scheduler.TestScheduler;

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
		Foreseeable action1 = createActionForeseeable(2);
		Foreseeable action2 = createActionForeseeable(1);
		
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
