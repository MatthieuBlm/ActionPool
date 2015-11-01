/**
 * 
 */
package src.test.action.scheduler;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import src.exception.ActionFinishedException;

import src.action.Action;
import src.action.foreseeable.Foreseeable;
import src.action.scheduler.Scheduler;

import src.test.action.TestAction;

/**
 * Test Scheduler
 * @author meyer bellamy
 *
 */
public abstract class TestScheduler extends TestAction {

	
	/**
	 * Test method for {@link src.action.scheduler.Scheduler#addAction(Action)}.
	 */
	@Test
	public void testAddAction() {
		Action action1= createActionForeseeable(2);
		Action action2= createActionForeseeable(1);
		
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
		Foreseeable action1 = createActionForeseeable(2);
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
	
	protected abstract Foreseeable createActionForeseeable(int n);

}
