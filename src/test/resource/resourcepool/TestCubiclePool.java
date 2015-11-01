/**
 * 
 */
package src.test.resource.resourcepool;


import src.resource.Cubicle;
import src.resource.resourcePool.CubiclePool;
import src.resource.resourcePool.ResourcePool;

/**
 * test Resource Pool
 * @author meyer bellamy
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
