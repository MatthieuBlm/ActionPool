package src.test;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import src.action.scheduler.fair.SwimmingPool;
import src.action.scheduler.sequential.Swimmer;
import src.exception.ActionFinishedException;
import src.resource.resourcePool.BasketPool;
import src.resource.resourcePool.CubiclePool;

/**
 * Test the swimming pool
 * @author Meyer Bellamy
 *
 */
public class TestSwimmingPool {

	@Test
	public void test() throws ActionFinishedException {
		List<Swimmer> swimmers = new ArrayList<Swimmer>();
		BasketPool bp = new BasketPool(10);
		CubiclePool cp = new CubiclePool(10);
		Swimmer sw = new Swimmer("Helene", bp, cp, 6, 18, 12);
		Swimmer swim = new Swimmer("Matthieu", bp, cp, 5, 15, 11);
		swimmers.add(sw);
		swimmers.add(swim);
		
		SwimmingPool sp = new SwimmingPool("SP", swimmers);
		while (!sp.isFinished()) {
			sp.doStep();
		}
	}

}
