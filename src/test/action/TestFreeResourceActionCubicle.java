package src.test.action;


import src.action.FreeResourceAction;
import src.action.ResourceAction;
import src.resource.Cubicle;
import src.resource.resourcePool.CubiclePool;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

public class TestFreeResourceActionCubicle extends TestFreeResourceAction<Cubicle> {

	@Override
	protected ResourceAction<Cubicle> createResourceAction(ResourcePool<Cubicle> resPool,
			ResourcefulUser<Cubicle> resfulUser) {
		return new FreeResourceAction<Cubicle>(resPool, resfulUser);
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
