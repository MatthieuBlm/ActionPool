package src.action;

import src.resource.Basket;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

public class TakeResourceBasketAction extends TakeResourceAction<Basket>{

	public TakeResourceBasketAction(ResourcePool<Basket> resPool,
			ResourcefulUser<Basket> resfulUser) {
		super(resPool, resfulUser);
	}

	@Override
	protected Basket getInstance() {
		return new Basket();
	}

}
