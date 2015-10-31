package src.test.action;

import static org.junit.Assert.*;

import org.junit.Test;

import src.action.Action;
import src.action.ResourceAction;
import src.exception.ActionFinishedException;
import src.resource.Resource;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

public abstract class TestFreeResourceAction<R extends Resource> extends TestResourceAction<R> {

	/**
	 * Test method for {@link src.action.TakeResourceAction#reallyDoOneStep()}.
	 * Test method for {@link src.action.Action#doStep()}.
	 * Test method for {@link src.action.TakeResourceAction#isFinished()}.
	 * @throws ActionFinishedException 
	 */
	@Test
	public void testReallyFreeAction() throws ActionFinishedException {
		ResourcePool<R> resPool = createResourcePool(2);
		ResourcefulUser<R> resfulUser = createResourceFulUser();
		R resource = resPool.provideResource();
		resfulUser.setResource(resource);
		assertSame(1, resPool.getResources().size());
		ResourceAction<R> free = createResourceAction(resPool, resfulUser);
		assertTrue(free.isReady());
		assertNotEquals(null, resfulUser.getResource());
		free.doStep();
		assertSame(2, resPool.getResources().size());
		assertTrue(free.isFinished());
		assertEquals(null,resfulUser.getResource());
		ResourcefulUser<R> resfulUser2 = createResourceFulUser();
		ResourceAction<R> free2 = createResourceAction(resPool, resfulUser2);
		assertTrue(free2.isReady());
		assertEquals(null, resfulUser2.getResource());
		free2.doStep();
		assertTrue(free2.isFinished());
	}
	
	protected void onlyOneValidStateAtEachMoment(Action act) {}

}
