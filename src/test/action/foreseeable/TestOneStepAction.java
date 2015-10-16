/**
 * 
 */
package test.action.foreseeable;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import exception.ActionFinishedException;
import action.Action;
import action.foreseeable.OneStepAction;

/**
 * @author meyer
 *
 */
public class TestOneStepAction extends TestForeseeable {


	@Override
	protected Action createAction(int nb) {
		return new OneStepAction();
	}
	
	/**
	 * Test method for {@link action.Action#isReady()}.
	 * Test method for {@link action.Action#doStep()}.
	 * Test method for {@link action.Action#isInProgess()}.
	 * Test method for {@link action.Action#isFinished()}.
	 * @throws ActionFinishedException 
	 */
	@Test
	public void testAction() throws ActionFinishedException {
		assertTrue(action.isReady());
		assertFalse(this.action.isInProgess());
		assertFalse(this.action.isFinished());
	
		action.doStep();
		
		assertFalse(action.isReady());
		assertFalse(this.action.isInProgess());
		assertTrue(this.action.isFinished());
	}
	
}