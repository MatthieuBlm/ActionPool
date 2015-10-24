package test.resource;


import resource.Basket;
import resource.Resource;


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
