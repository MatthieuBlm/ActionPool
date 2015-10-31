/**
 * 
 */
package src.test.action;

import static org.junit.Assert.*;

import org.junit.Test;

import src.action.ResourceAction;
import src.action.TakeResourceAction;
import src.exception.ActionFinishedException;
import src.resource.Resource;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

/**
 * @author meyer
 *
 */
public abstract class TestTakeResourceAction<R extends Resource> extends TestResourceAction<R> {

	@Test
	public void testIsReadyAndIsInProgress() throws ActionFinishedException {
		ResourceAction<R> res = createResourceAction(2);
		assertTrue(res.isReady());
		res.doStep();
		assertFalse(res.isReady());
		assertTrue(res.isFinished());
	}
	
	/**
	 * Test method for {@link src.action.TakeResourceAction#reallyDoOneStep()}.
	 * Test method for {@link src.action.Action#doStep()}.
	 * Test method for {@link src.action.TakeResourceAction#isFinished()}.
	 * @throws ActionFinishedException 
	 */
	@Test
	public void testReallyTakeAction() throws ActionFinishedException {
		ResourcePool<R> resPool = createResourcePool(2);
		ResourcefulUser<R> resfulUser = createResourceFulUser();
		TakeResourceAction<R> take = new TakeResourceAction<R>(resPool, resfulUser);
		assertTrue(take.isReady());
		assertEquals(null, resfulUser.getResource());
		assertSame(2, resPool.getResources().size());
		take.doStep();
		assertSame(1, resPool.getResources().size());
		assertTrue(take.isFinished());
		assertNotEquals(null,resfulUser.getResource());
		ResourcefulUser<R> resfulUser2 = createResourceFulUser();
		TakeResourceAction<R> take2 = new TakeResourceAction<R> (resPool, resfulUser2);
		assertTrue(take2.isReady());
		assertEquals(null, resfulUser2.getResource());
		assertSame(1, resPool.getResources().size());
		take2.doStep();
		assertSame(0, resPool.getResources().size());
		assertNotEquals(null, resfulUser2.getResource());
		assertTrue(take2.isFinished());
		ResourcefulUser<R> resfulUser3 = createResourceFulUser();
		TakeResourceAction<R> take3 = new TakeResourceAction<R> (resPool, resfulUser3);
		assertTrue(take3.isReady());
		assertEquals(null, resfulUser3.getResource());
		take3.doStep();
		assertEquals(null, resfulUser3.getResource());
		assertFalse(take3.isFinished());
		assertFalse(take3.isReady());
		assertTrue(take3.isInProgess());
	}

}
