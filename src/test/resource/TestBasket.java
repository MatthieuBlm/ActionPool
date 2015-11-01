package src.test.resource;


import src.resource.Basket;
import src.resource.Resource;

/**
 * class to test basket
 * @author meyer bellamy
 *
 */
public class TestBasket extends TestResource{

	
	@Override
	protected Resource createResource() {
		return new Basket();
	}

	@Override
	protected String resourceString() {
		return "Basket";
	}

}
