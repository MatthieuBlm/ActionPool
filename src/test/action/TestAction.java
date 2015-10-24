/**
 * 
 */
package test.action;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exception.ActionFinishedException;

import action.Action;

/**
 * @author meyer
 *
 */
public abstract class TestAction {

	protected Action action;

	
	@Before
	public void init() {
		this.action = createAction();
	}
	
	
	/**
	 * it's ok if there are only one valid state
	 * @throws ActionFinishedException 
	 */
	@Test
	public void testOnlyOneValidState() throws ActionFinishedException {
		onlyOneValidStateAtEachMoment(createAction());
	}
	
	protected abstract Action createAction();

	protected void onlyOneValidStateAtEachMoment(Action act) throws ActionFinishedException {
		assertTrue(act.isReady());
		assertFalse(act.isInProgess());
		assertFalse(act.isFinished());
		
		while (!act.isFinished()) {
			act.doStep();
			assertFalse(act.isReady());
			// isFinished xor isInProgress
			assertTrue(act.isFinished() == !act.isInProgess());
		}
		
		assertFalse(act.isReady());
		assertFalse(act.isInProgess());
		assertTrue(act.isFinished());
	}
	
	@Test(expected = ActionFinishedException.class, timeout = 2000)
	public void doStepWhileFinishedThrowsException() throws ActionFinishedException {
		
		while (!this.action.isFinished()) {
			//try {
				action.doStep();
//			} catch (ActionFinishedException e) {
//				fail("action was not supposed to be finished, we just checked");
//			}
		}
		
		assertTrue(action.isFinished());
		action.doStep();
	}
	
	

}
