/**
 * 
 */
package src.test.action.scheduler.fair;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import src.action.scheduler.fair.SwimmingPool;
import src.action.scheduler.sequential.Swimmer;
import src.exception.ActionFinishedException;
import src.resource.resourcePool.BasketPool;
import src.resource.resourcePool.CubiclePool;

/**
 * test swimming pool
 * @author meyer bellamy
 *
 */
public class TestSwimmingPool{

	/**
	 * Test method for {@link src.action.scheduler.SwimmingPool#SwimmingPool()}.
	 * @throws ActionFinishedException 
	 */
	@Test
	public void testSwimmingPool() throws ActionFinishedException {
		List<Swimmer> swimmers = new ArrayList<Swimmer>();
		BasketPool bp = new BasketPool(6);
		CubiclePool cp = new CubiclePool(3);
		Swimmer sw = new Swimmer("Camille", bp, cp, 1, 2, 2);
		Swimmer swim = new Swimmer("Lois", bp, cp, 2, 1, 1);
		swimmers.add(sw);
		swimmers.add(swim);
		
		SwimmingPool sp = new SwimmingPool("SP", swimmers);
		assertSame(7, sw.getListAction().size());
		assertSame(7, swim.getListAction().size());
		while (!sp.isFinished()) {
			sp.doStep();
		}

	}

}
