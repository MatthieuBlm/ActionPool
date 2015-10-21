/**
 * 
 */
package test.action.scheduler;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import exception.ActionFinishedException;

import action.Action;
import action.scheduler.Scheduler;

import test.action.TestAction;

/**
 * @author meyer
 *
 */
public abstract class TestScheduler extends TestAction {

	
	/**
	 * Test method for {@link action.scheduler.Scheduler#addAction(Action)}.
	 */
	@Test
	public void testAddAction() {
		Action action1= createAction(2);
		Action action2= createAction(1);
		
		Scheduler scheduler= createScheduler(action1);
		
		List<Action> actions = scheduler.getListAction();
		assertEquals(1, actions.size());
		assertEquals(action1, actions.get(0));
		scheduler.addAction(action2);
		List<Action> actions2 = scheduler.getListAction();
		assertSame(2, actions2.size());
		assertEquals(action1, actions2.get(0));
		assertEquals(action2, actions2.get(1));
	}
	
	protected abstract Scheduler createScheduler(Action a);



	@Test
	public void testSchedulerWithScheduler() throws ActionFinishedException {
		Action action1 = createAction(2);
		Action subScheduler = createScheduler(action1);
		
		Scheduler scheduler = createScheduler(subScheduler);
		
		assertTrue(action1.isReady());
		assertTrue(subScheduler.isReady());
		
		scheduler.doStep();
		if (action1.getTotalTime() == 2) {
			assertTrue(action1.isInProgess());
			assertTrue(subScheduler.isInProgess());
			scheduler.doStep();
		} 
		if (action1.getTotalTime() <= 2) {
			assertTrue(subScheduler.isFinished());
			assertTrue(action1.isFinished());
		}

	}

}
