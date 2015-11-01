/**
 * 
 */
package src.test.action.foreseeable;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import src.exception.ActionFinishedException;
import src.action.Action;
import src.action.foreseeable.Foreseeable;
import src.action.foreseeable.OneStepAction;

/**
 * Test the foreseeable action
 * @author Meyer Bellamy
 *
 */
public class TestOneStepAction extends TestForeseeable {


	@Override
	protected Foreseeable createActionForeseeable(int nb) {
		return new OneStepAction();
	}
	
	/**
	 * Test method for {@link src.action.Action#isReady()}.
	 * Test method for {@link src.action.Action#doStep()}.
	 * Test method for {@link src.action.Action#isInProgess()}.
	 * Test method for {@link src.action.Action#isFinished()}.
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

	@Override
	protected Action createAction() {
		return new OneStepAction();
	}
	
}
