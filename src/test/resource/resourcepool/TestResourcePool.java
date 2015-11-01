/**
 * 
 */
package src.test.resource.resourcepool;

import static org.junit.Assert.*;

import org.junit.Test;

import src.resource.Resource;
import src.resource.resourcePool.ResourcePool;
import java.util.NoSuchElementException;


/**
 * Test the resource Pool
 * @author meyer bellamy
 * 
 * @param <R> object extends Resource
 *
 */
public abstract class TestResourcePool<R extends Resource> {



	@Test
	public void testResourcePool() {
		ResourcePool<R> resPool = createResourcePool(0);
		assertSame(0, resPool.getLength());
		assertSame(0, resPool.getResources().size());
		assertSame(0, resPool.getFreeresources().size());
		
		ResourcePool<R> resPool2 = createResourcePool(2);
		assertSame(2, resPool2.getLength());
		assertSame(2, resPool2.getResources().size());
		assertSame(0, resPool2.getFreeresources().size());
		
	}
	
	/**
	 * Test method for {@link src.resource.resourcePool.ResourcePool#provideResource()}.
	 */
	@Test(expected=NoSuchElementException.class)
	public void testProvideResourceWhenResourcePoolIsEmpty() {
		ResourcePool<R> resPool = createResourcePool(0);
		resPool.provideResource();
	}
	
	/**
	 * Test method for {@link src.resource.resourcePool.ResourcePool#provideResource()}.
	 */
	@Test(expected=NoSuchElementException.class)
	public void testProvideResourceWhenResourcePoolIsFull() {
		ResourcePool<R> resPool = createResourcePool(2);
		assertSame(2, resPool.getResources().size());
		assertSame(0, resPool.getFreeresources().size());
		resPool.provideResource();
		assertSame(1, resPool.getResources().size());
		assertSame(1, resPool.getFreeresources().size());
		resPool.provideResource();
		assertSame(0, resPool.getResources().size());
		assertSame(2, resPool.getFreeresources().size());
		resPool.provideResource();
	}

	protected abstract ResourcePool<R> createResourcePool(int i) ;
	protected abstract R getResource();

	/**
	 * Test method for {@link src.resource.resourcePool.ResourcePool#freeResource(resource.Resource)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testFreeResourceWithIllegalArgument() {
		ResourcePool<R> resPool = createResourcePool(2);
		assertSame(2, resPool.getResources().size());
		assertSame(0, resPool.getFreeresources().size());
		resPool.provideResource();
		assertSame(1, resPool.getResources().size());
		assertSame(1, resPool.getFreeresources().size());
		resPool.freeResource(null);
	}
	
	/**
	 * Test method for {@link src.resource.resourcePool.ResourcePool#freeResource(resource.Resource)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testFreeResourceWithGoodArgumentButInMore() {
		ResourcePool<R> resPool = createResourcePool(2);
		R r = getResource();
		assertSame(2, resPool.getResources().size());
		assertSame(0, resPool.getFreeresources().size());
		resPool.freeResource(r);
	}
	
	
	/**
	 * Test method for {@link src.resource.resourcePool.ResourcePool#freeResource(resource.Resource)}.
	 */
	@Test
	public void testFreeResourceWithGoodArgument() {
		ResourcePool<R> resPool = createResourcePool(2);
		assertSame(2, resPool.getResources().size());
		assertSame(0, resPool.getFreeresources().size());
		resPool.provideResource();
		assertSame(1, resPool.getResources().size());
		assertSame(1, resPool.getFreeresources().size());
		R r = resPool.getFreeresources().get(0);
		resPool.freeResource(r);
		assertSame(2, resPool.getResources().size());
		assertSame(0, resPool.getFreeresources().size());
	}
	

}
