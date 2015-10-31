package src.test.action;


import src.action.ResourceAction;
import src.action.TakeResourceBasketAction;
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

	@Override
	protected ResourceAction<Basket> createResourceAction(
			ResourcePool<Basket> resPool, ResourcefulUser<Basket> resfulUser) {
		return new TakeResourceBasketAction(resPool, resfulUser);
	}

}
