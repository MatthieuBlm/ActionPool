package src.test.action.resourceaction;


import src.action.Action;
import src.action.resourceaction.ResourceAction;
import src.resource.Resource;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;
import src.test.action.TestAction;
/**
 * test resource action
 * @author meyer bellamy
 *
 * @param <R> an object extends resource
 */
public abstract class TestResourceAction<R extends Resource> extends TestAction {


	@Override
	protected Action createAction() {
		return this.createResourceAction(2);
	}

	protected ResourceAction<R> createResourceAction(int n) {
		ResourcePool<R> resPool = createResourcePool(n);
		ResourcefulUser<R> resfulUser = createResourceFulUser();
		return createResourceAction(resPool, resfulUser);
	}

	
	protected abstract ResourceAction<R> createResourceAction(ResourcePool<R> resPool, ResourcefulUser<R> resfulUser);
	protected abstract ResourcePool<R> createResourcePool(int i);
	protected abstract ResourcefulUser<R> createResourceFulUser();

}
