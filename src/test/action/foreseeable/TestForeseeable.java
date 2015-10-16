/**
 * 
 */
package test.action.foreseeable;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import exception.ActionFinishedException;

import action.foreseeable.Foreseeable;

import test.action.TestAction;

/**
 * @author meyer
 *
 */
public abstract class TestForeseeable extends TestAction {
	
	protected Foreseeable action2;
	
	@Before
	public void init() {
		super.init();
		this.action2 = (Foreseeable) createAction(4);
	}
	
	/**
	 * it's ok if there are only one valid state
	 * @throws ActionFinishedException 
	 */
	@Test
	public void testOnlyOneValidState2() throws ActionFinishedException {
		onlyOneValidStateAtEachMoment(createAction(10));
	}

	/**
	 * Test method for {@link action.Action#reallyDoOneStep()}.
	 * @throws ActionFinishedException 
	 */
	@Test
	public void testReallyDoOneStepWithDoStep() throws ActionFinishedException {
		if (action2.getTotalTime() == 4) {
			assertTrue(action2.isReady());
			assertFalse(this.action2.isInProgess());
			assertFalse(this.action2.isFinished());
			action2.doStep();
			assertFalse(action2.isReady());
			assertTrue(this.action2.isInProgess());
			assertFalse(this.action2.isFinished());
			action2.doStep();
			assertFalse(action2.isReady());
			assertTrue(this.action2.isInProgess());
			assertFalse(this.action2.isFinished());
			action2.doStep();
			assertFalse(action2.isReady());
			assertTrue(this.action2.isInProgess());
			assertFalse(this.action2.isFinished());
			action2.doStep();
			assertTrue(this.action2.isFinished());
			assertFalse(this.action2.isReady());
			assertFalse(this.action2.isInProgess());
		}
		
	}
	
	
}
