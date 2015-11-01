package src.test.action.resourceaction.freeresourceaction;

import src.action.resourceaction.ResourceAction;
import src.action.resourceaction.freeresourceaction.FreeResourceBasketAction;
import src.resource.Basket;
import src.resource.resourcePool.BasketPool;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;
/**
 * test free resource for basket
 * @author meyer bellamy
 *
 */
public class TestFreeResourceActionBasket extends TestFreeResourceAction<Basket> {

	@Override
	protected ResourceAction<Basket> createResourceAction(ResourcePool<Basket> resPool,
			ResourcefulUser<Basket> resfulUser) {
		return new FreeResourceBasketAction(resPool, resfulUser);
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
