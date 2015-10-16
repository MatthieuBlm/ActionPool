/**
 * 
 */
package test.action.foreseeable;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import action.foreseeable.Foreseeable;

import test.action.TestAction;

/**
 * @author meyer
 *
 */
public abstract class TestForeseeable extends TestAction {

	protected Foreseeable action;
	
	@Before 
	public void init() {
		this.action = (Foreseeable) createAction(2);
	}
	
	@Test
	public void testerForeseeableAction() {
		assertTrue(action.isReady());
		assertFalse(action.isInProgress());
		assertFalse(action.isFinished());
	}

	/**
	 * Test method for {@link action.Action#doStep()}.
	 */
	@Test
	public void testDoStep() {
		this.action.doStep();
		assertFalse(action.isReady());
		assertTrue(action.isInProgess());
		assertFalse(action.isFinished());
		this.action.doStep();
		assertFalse(action.isReady());
		assertFalse(action.isInProgess());
		assertTrue(action.isFinished());
	}

}
