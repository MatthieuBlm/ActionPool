/**
 * 
 */
package test.action.scheduler;

import static org.junit.Assert.*;

import org.junit.Test;

import exception.ActionFinishedException;

import action.Action;
import action.scheduler.Scheduler;

/**
 * @author meyer
 *
 */
public abstract class TestFair extends TestScheduler {

	/**
	 * Test method for {@link action.scheduler.Fair#isInProgess()}.
	 * Test method for {@link action.scheduler.Fair#reallyDoOneStep()}.
	 * Test method for {@link action.scheduler.Fair#Fair(int)}.
	 * @throws ActionFinishedException 
	 */
	@Test
	public void testFair() throws ActionFinishedException {
		Action action1= createAction(3);
		Action action2= createAction(2);
		
		Scheduler scheduler= createScheduler(action1);
		scheduler.addAction(action2);
		
		assertTrue(action1.isReady());
		assertTrue(action2.isReady());
		
		scheduler.doStep();
		
		if (action1.getTotalTime() >1 && action2.getTotalTime() >1) {
			assertTrue(action1.isInProgess());
			assertTrue(action2.isReady());
			
			scheduler.doStep();
			
			assertTrue(action1.isInProgess());
			assertTrue(action2.isInProgess());
			
			scheduler.doStep();
			
			if (action1.getTotalTime() > 2) {
				assertTrue(action1.isInProgess());
				assertTrue(action2.isInProgess());
				
				scheduler.doStep();
				
				assertTrue(action1.isInProgess());
				assertTrue(action2.isFinished());
			} else {
				assertTrue(action1.isFinished());
				assertTrue(action2.isInProgess());
			}
		} else {
			assertTrue(action1.isFinished());
			assertFalse(action2.isFinished());
		}
		
		
	}

	

}
