/**
 * 
 */
package test.resource.resourcepool;


import resource.Basket;

import resource.resourcePool.BasketPool;
import resource.resourcePool.ResourcePool;

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
