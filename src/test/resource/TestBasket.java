package src.test.resource;


import src.resource.Basket;
import src.resource.Resource;


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
