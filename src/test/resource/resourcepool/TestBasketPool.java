/**
 * 
 */
package src.test.resource.resourcepool;


import src.resource.Basket;

import src.resource.resourcePool.BasketPool;
import src.resource.resourcePool.ResourcePool;

/**
 * @author meyer
 *
 */
public class TestBasketPool extends TestResourcePool<Basket> {


	@Override
	protected ResourcePool<Basket> createResourcePool(int i) {
		return new BasketPool(i);
	}

	@Override
	protected Basket getResource() {
		return new Basket();
	}


}
