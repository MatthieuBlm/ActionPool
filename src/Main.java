package src;

import java.util.ArrayList;
import java.util.List;

import src.resource.resourcePool.BasketPool;
import src.resource.resourcePool.CubiclePool;
import src.action.scheduler.fair.SwimmingPool;
import src.action.scheduler.sequential.Swimmer;
import src.exception.ActionFinishedException;

/**
 * Class which execute the simulation of the actions in the swimming pool
 * @author Meyer Bellamy
 *
 */

public class Main {
	public static void main(String[] args) throws ActionFinishedException{
		int steps =0;
		List<Swimmer> swimmers = new ArrayList<Swimmer>();
		BasketPool bp = new BasketPool(6);
		CubiclePool cp = new CubiclePool(3);
		swimmers.add(new Swimmer("Camille", bp, cp, 6, 4, 8));
		swimmers.add(new Swimmer("Lois", bp, cp, 2, 10, 4));
		swimmers.add(new Swimmer("Mae", bp, cp, 10, 18, 10));
		swimmers.add(new Swimmer("Ange", bp, cp, 3, 7, 5));
		swimmers.add(new Swimmer("Louison", bp, cp, 18, 3, 3));
		swimmers.add(new Swimmer("Charlie", bp, cp, 3, 6, 10));
		swimmers.add(new Swimmer("Alexis", bp, cp, 6, 5, 7));
		
		SwimmingPool sp = new SwimmingPool("SP", swimmers);
		while (!sp.isFinished()) {
			sp.doStep();
			steps++;
		}
		System.out.println("Finished in " + steps + " steps");
		
	}
}
