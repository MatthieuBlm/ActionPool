/**
 * 
 */
package src.test.action.scheduler.fair;

import static org.junit.Assert.*;

import org.junit.Test;

import src.exception.ActionFinishedException;
import src.test.action.scheduler.TestScheduler;

import src.action.foreseeable.Foreseeable;
import src.action.scheduler.Scheduler;

/**
 * test fair
 * @author meyer bellamy
 *
 */
public abstract class TestFair extends TestScheduler {

	/**
	 * Test method for {@link src.action.scheduler.Fair#isInProgess()}.
	 * Test method for {@link src.action.scheduler.Fair#reallyDoOneStep()}.
	 * Test method for {@link src.action.scheduler.Fair#Fair(int)}.
	 * @throws ActionFinishedException 
	 */
	@Test
	public void testFair() throws ActionFinishedException {
		Foreseeable action1= createActionForeseeable(3);
		Foreseeable action2= createActionForeseeable(2);
		
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
			
			if (action1.getTotalTime() == 3) {
				assertTrue(action1.isInProgess());
				assertTrue(action2.isInProgess());
				
				scheduler.doStep();
				
				assertTrue(action1.isInProgess());
				assertTrue(action2.isFinished());
			} else if (action1.getTotalTime() < 3) {
				assertTrue(action1.isFinished());
				assertTrue(action2.isInProgess());
			}
		} else {
			assertTrue(action1.isFinished());
			assertFalse(action2.isFinished());
		}
		
		
	}

	

}
