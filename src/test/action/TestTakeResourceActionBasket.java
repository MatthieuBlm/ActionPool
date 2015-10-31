package src.test.action;


import src.resource.Basket;
import src.resource.resourcePool.BasketPool;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

public class TestTakeResourceActionBasket extends TestTakeResourceAction<Basket> {

	@Override
	protected ResourcePool<Basket> createResourcePool(int i) {
		return new BasketPool(i);
	}

	@Override
	protected ResourcefulUser<Basket> createResourceFulUser() {
		return new ResourcefulUser<Basket>();
	}

}
