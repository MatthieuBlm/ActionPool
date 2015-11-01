package src.test.action.resourceaction.takeresourceaction;


import src.action.resourceaction.ResourceAction;
import src.action.resourceaction.takeresourceaction.TakeResourceCubicleAction;
import src.resource.Cubicle;
import src.resource.resourcePool.CubiclePool;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;
/**
 * Test take resource cubicle
 * @author meyer bellamy
 *
 */
public class TestTakeResourceActionCubicle extends TestTakeResourceAction<Cubicle>{

	@Override
	protected ResourcePool<Cubicle> createResourcePool(int i) {
		return new CubiclePool(i);
	}

	@Override
	protected ResourcefulUser<Cubicle> createResourceFulUser() {
		return new ResourcefulUser<Cubicle>();
	}

	@Override
	protected ResourceAction<Cubicle> createResourceAction(
			ResourcePool<Cubicle> resPool, ResourcefulUser<Cubicle> resfulUser) {
		return new TakeResourceCubicleAction(resPool, resfulUser);
	}


}
