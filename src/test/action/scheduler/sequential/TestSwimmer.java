/**
 * 
 */
package src.test.action.scheduler.sequential;

import static org.junit.Assert.*;

import org.junit.Test;

import src.action.scheduler.sequential.Swimmer;
import src.exception.ActionFinishedException;
import src.resource.resourcePool.BasketPool;
import src.resource.resourcePool.CubiclePool;

/**
 * @author meyer
 *
 */
public class TestSwimmer {
	
	@Test
	public void testSwimmer() throws ActionFinishedException {
		BasketPool baskets = new BasketPool(2);
		CubiclePool cubicles = new CubiclePool(2);
		Swimmer swimmer = new Swimmer("Clara", baskets, cubicles, 1, 2, 2);
				
		assertTrue(swimmer.isReady());
		assertFalse(swimmer.isFinished());
		
		swimmer.doStep();
		assertSame(1, baskets.getResources().size());
		
		assertFalse(swimmer.isReady());
		assertTrue(swimmer.isInProgess());
		assertFalse(swimmer.isFinished());
		
		swimmer.doStep();
		assertSame(1, cubicles.getResources().size());
		
		assertFalse(swimmer.isReady());
		assertTrue(swimmer.isInProgess());
		assertFalse(swimmer.isFinished());
		//undress
		swimmer.doStep();
		
		assertFalse(swimmer.isReady());
		assertTrue(swimmer.isInProgess());
		assertFalse(swimmer.isFinished());
		
		//swim
		swimmer.doStep();
		
		assertFalse(swimmer.isReady());
		assertTrue(swimmer.isInProgess());
		assertFalse(swimmer.isFinished());
		
		//swim
		swimmer.doStep();
		
		assertFalse(swimmer.isReady());
		assertTrue(swimmer.isInProgess());
		assertFalse(swimmer.isFinished());
		
		//dress
		swimmer.doStep();
		
		assertFalse(swimmer.isReady());
		assertTrue(swimmer.isInProgess());
		assertFalse(swimmer.isFinished());
		
		//dress
		swimmer.doStep();
		
		assertFalse(swimmer.isReady());
		assertTrue(swimmer.isInProgess());
		assertFalse(swimmer.isFinished());
		
		//free cubicle
		swimmer.doStep();
		assertSame(2, cubicles.getResources().size());
		assertFalse(swimmer.isReady());
		assertTrue(swimmer.isInProgess());
		assertFalse(swimmer.isFinished());
		
		//free basket
		swimmer.doStep();
		assertSame(2, baskets.getResources().size());
		assertFalse(swimmer.isReady());
		assertFalse(swimmer.isInProgess());
		assertTrue(swimmer.isFinished());
	}


}
