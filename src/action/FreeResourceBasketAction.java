package src.action;

import src.resource.Basket;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

public class FreeResourceBasketAction extends FreeResourceAction<Basket> {

	public FreeResourceBasketAction(ResourcePool<Basket> resPool,
			ResourcefulUser<Basket> resfulUser) {
		super(resPool, resfulUser);
	}

	@Override
	protected Basket getInstance() {
		return new Basket();
	}

}
