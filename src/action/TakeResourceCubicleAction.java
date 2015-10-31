package src.action;

import src.resource.Cubicle;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

public class TakeResourceCubicleAction extends TakeResourceAction<Cubicle> {

	public TakeResourceCubicleAction(ResourcePool<Cubicle> resPool,
			ResourcefulUser<Cubicle> resfulUser) {
		super(resPool, resfulUser);
	}

	@Override
	protected Cubicle getInstance() {
		return new Cubicle();
	}

}
