package src.test.action;


import src.resource.Cubicle;
import src.resource.resourcePool.CubiclePool;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

public class TestTakeResourceActionCubicle extends TestTakeResourceAction<Cubicle>{

	@Override
	protected ResourcePool<Cubicle> createResourcePool(int i) {
		return new CubiclePool(i);
	}

	@Override
	protected ResourcefulUser<Cubicle> createResourceFulUser() {
		return new ResourcefulUser<Cubicle>();
	}


}
