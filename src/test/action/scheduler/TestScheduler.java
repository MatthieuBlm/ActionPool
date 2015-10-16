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
		assertSame(1, actions.size());
		assertEquals(action1, actions.get(0));
		scheduler.addAction(action2);
		List<Action> actions2 = scheduler.getListAction();
		assertSame(2, actions2.size());
		assertEquals(action1, actions2.get(0));
		assertEquals(action2, actions2.get(1));
	}
	
	protected abstract Scheduler createScheduler(Action a);

	/**
	 * Test method for {@link action.scheduler.Scheduler#reallyDoOneStep()}.
	 * Test method for {@link action.Action#doStep()}.
	 * @throws ActionFinishedException 
	 */
	@Test
	public void testReallyDoOneStepWithDoStepScheduler1() throws ActionFinishedException {
		Action action1= createAction(2);
		Action action2= createAction(1);
		
		Scheduler scheduler= createScheduler(action1);
		scheduler.addAction(action2);
		
		assertTrue(action1.isReady());
		assertTrue(action2.isReady());
		
		scheduler.doStep();
		
		if (action1.getTotalTime() == 2 && action2.getTotalTime() == 1) {
			assertTrue(action1.isInProgess());
			assertTrue(action2.isReady());
			
			scheduler.doStep();
			
			assertTrue(action1.isFinished());
			assertTrue(action2.isReady());
			
		}
		scheduler.doStep();
		
		assertTrue(action1.isFinished());
		assertTrue(action2.isFinished());
	}

	@Test
	public void testSchedulerWithScheduler() throws ActionFinishedException {
		Action action1 = createAction(2);
		Action subScheduler = createAction(0);
		
		Scheduler scheduler = createScheduler(action1);
		
		scheduler.addAction(subScheduler);
		
		assertTrue(action1.isReady());
		assertTrue(subScheduler.isReady());
		
		scheduler.doStep();
		if (subScheduler.getTotalTime() == 0) {
			assertTrue(action1.isInProgess());
			assertTrue(subScheduler.isInProgess());
		}
		scheduler.doStep();
		
		assertTrue(subScheduler.isFinished());
		assertTrue(action1.isFinished());

	}

}
