package src.test.action;

import static org.junit.Assert.*;

import org.junit.Test;

import src.action.ResourceAction;
import src.exception.ActionFinishedException;
import src.resource.Resource;

public abstract class TestResourceAction<R extends Resource> extends TestAction {

	@Test
	public void testIsReadyAndIsInProgress() throws ActionFinishedException {
		ResourceAction<R> res = createResourceAction(2);
		assertTrue(res.isReady());
		res.doStep();
		assertFalse(res.isReady());
		assertTrue(res.isFinished());
	}

	protected abstract ResourceAction<R> createResourceAction(int n);

}
