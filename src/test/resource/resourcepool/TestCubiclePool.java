/**
 * 
 */
package test.resource.resourcepool;


import resource.Cubicle;
import resource.resourcePool.CubiclePool;
import resource.resourcePool.ResourcePool;

/**
 * @author meyer
 *
 */
public class TestCubiclePool extends TestResourcePool<Cubicle> {

	@Override
	protected ResourcePool<Cubicle> createResourcePool(int i) {
		return new CubiclePool(i);
	}

	@Override
	protected Cubicle getResource() {
		return new Cubicle();
	}

}
