/**
 * 
 */
package test.action;

import static org.junit.Assert.*;

import org.junit.Test;

import action.Action;

/**
 * @author meyer
 *
 */
public abstract class TestAction {


	/**
	 * Test method for {@link action.Action#isReady()}.
	 */
	@Test
	public void testIsReady() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link action.Action#isInProgess()}.
	 */
	@Test
	public void testIsInProgess() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link action.Action#isFinished()}.
	 */
	@Test
	public void testIsFinished() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link action.Action#doStep()}.
	 */
	@Test
	public void testDoStep() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link action.Action#reallyDoOneStep()}.
	 */
	@Test
	public void testReallyDoOneStep() {
		fail("Not yet implemented");
	}
	
	/**
	 * it's ok if there are only one valid state
	 */
	@Test
	public void testOnlyOneValidState() {
		
	}
	
	@Test
	protected abstract Action createAction(int nb);



}
