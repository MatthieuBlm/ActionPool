package src.test.resource;



import src.resource.Cubicle;
import src.resource.Resource;
/**
 * class to test cubicle
 * @author meyer bellamy
 *
 */

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
