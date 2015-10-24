package test.resource;



import resource.Cubicle;
import resource.Resource;


public class TestCubicle extends TestResource{


	@Override
	protected Resource createResource() {
		return new Cubicle();
	}

	@Override
	protected String resourceString() {
		return "Cubicle";
	}

}
