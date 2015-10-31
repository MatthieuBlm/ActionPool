/**
 * 
 */
package src.test.action.foreseeable;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import src.exception.ActionFinishedException;

import src.action.foreseeable.Foreseeable;

import src.test.action.TestAction;

/**
 * @author meyer
 *
 */
public abstract class TestForeseeable extends TestAction {
	
	protected Foreseeable action2;
	
	@Before
	public void init() {
		super.init();
		this.action2 = (Foreseeable) createActionForeseeable(4);
	}
	
	/**
	 * it's ok if there are only one valid state
	 * @throws ActionFinishedException 
	 */
	@Test
	public void testOnlyOneValidState2() throws ActionFinishedException {
		onlyOneValidStateAtEachMoment(createActionForeseeable(10));
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
		if (action2.getTotalTime() == 2) {
			assertTrue(action2.isReady());
			assertFalse(this.action2.isInProgess());
			assertFalse(this.action2.isFinished());
		
			action2.doStep();
			
			assertFalse(action2.isReady());
			assertTrue(this.action2.isInProgess());
			assertFalse(this.action2.isFinished());
			
			action2.doStep();
			
			assertFalse(action2.isReady());
			assertFalse(this.action2.isInProgess());
			assertTrue(this.action2.isFinished());
		}
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
	
	protected abstract Foreseeable createActionForeseeable(int n);
	
}
