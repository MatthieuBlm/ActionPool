package src;

import src.resource.resourcePool.BasketPool;
import src.resource.resourcePool.CubiclePool;
import src.action.scheduler.fair.SwimmingPool;
import src.action.scheduler.sequential.Swimmer;



public class Main {
	public static void main(String[] args){
		SwimmingPool sp = new SwimmingPool("SP");
		BasketPool bp = new BasketPool(10);
		CubiclePool cp = new CubiclePool(10);
		Swimmer sw = new Swimmer("Helene", bp, cp, 6, 18, 12);
		Swimmer swim = new Swimmer("Matthieu", bp, cp, 5, 15, 11);
	}
}
