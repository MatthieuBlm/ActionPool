package src.test.action.resourceaction.freeresourceaction;


import src.action.resourceaction.ResourceAction;
import src.action.resourceaction.freeresourceaction.FreeResourceCubicleAction;
import src.resource.Cubicle;
import src.resource.resourcePool.CubiclePool;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;
/**
 * test free resource for cubicle
 * @author meyer bellamy
 *
 */
public class TestFreeResourceActionCubicle extends TestFreeResourceAction<Cubicle> {

	@Override
	protected ResourceAction<Cubicle> createResourceAction(ResourcePool<Cubicle> resPool,
			ResourcefulUser<Cubicle> resfulUser) {
		return new FreeResourceCubicleAction(resPool, resfulUser);
	}

	@Override
	protected ResourcePool<Cubicle> createResourcePool(int i) {
		return new CubiclePool(i);
	}

	@Override
	protected ResourcefulUser<Cubicle> createResourceFulUser() {
		return new ResourcefulUser<Cubicle>();
	}

}
