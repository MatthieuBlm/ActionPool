package src.test.action;

import src.action.FreeResourceAction;
import src.action.ResourceAction;
import src.resource.Basket;
import src.resource.resourcePool.BasketPool;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

public class TestFreeResourceActionBasket extends TestFreeResourceAction<Basket> {

	@Override
	protected ResourceAction<Basket> createResourceAction(ResourcePool<Basket> resPool,
			ResourcefulUser<Basket> resfulUser) {
		return new FreeResourceAction<Basket>(resPool, resfulUser);
	}

	@Override
	protected ResourcePool<Basket> createResourcePool(int i) {
		return new BasketPool(i);
	}

	@Override
	protected ResourcefulUser<Basket> createResourceFulUser() {
		return new ResourcefulUser<Basket>();
	}
	
	

}
