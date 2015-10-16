/**
 * 
 */
package test.action.scheduler;

import static org.junit.Assert.*;

import org.junit.Test;

import action.Action;

import test.action.TestAction;

/**
 * @author meyer
 *
 */
public abstract class TestScheduler extends TestAction {

	/**
	 * Test method for {@link action.scheduler.Scheduler#reallyDoOneStep()}.
	 */
	@Test
	public void testReallyDoOneStep() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link action.Action#doStep()}.
	 */
	@Test
	public void testDoStep() {
		fail("Not yet implemented");
	}

	@Override
	@Test
	protected abstract Action createAction(int nb) ;

}
