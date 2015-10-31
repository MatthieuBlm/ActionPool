package src.action.scheduler.sequential;

import src.action.FreeResourceBasketAction;
import src.action.FreeResourceCubicleAction;
import src.action.TakeResourceBasketAction;
import src.action.TakeResourceCubicleAction;
import src.action.foreseeable.GettingDressed;
import src.action.foreseeable.GettingUndressed;
import src.action.foreseeable.Swim;
import src.resource.Basket;
import src.resource.Cubicle;
import src.resource.resourcePool.BasketPool;
import src.resource.resourcePool.CubiclePool;
import src.resource.resourcefuluser.ResourcefulUser;


public class Swimmer extends Sequential{
	private String name;	
	private BasketPool resourceBasket;
	private CubiclePool resourceCubicle;
	private int timeToUndress;
	private int timeToSwim;
	private int timeToDress;
	private ResourcefulUser<Basket> resFulUserBasket;
	private ResourcefulUser<Cubicle> resFulUserCubicle;
		

	public Swimmer(String name, BasketPool resourceBasket,CubiclePool resourceCubicle, int timeToUndress, int timeToSwim,int timeToDress) {
		super();
		this.name = name;
		this.resourceBasket = resourceBasket;
		this.resourceCubicle = resourceCubicle;
		this.timeToUndress = timeToUndress;
		this.timeToSwim = timeToSwim;
		this.timeToDress = timeToDress;
		this.resFulUserBasket = new ResourcefulUser<Basket>();
		this.resFulUserCubicle = new ResourcefulUser<Cubicle>();
		addAction(new TakeResourceBasketAction(this.resourceBasket, this.resFulUserBasket));
		addAction(new TakeResourceCubicleAction(this.resourceCubicle, this.resFulUserCubicle));
		addAction(new GettingUndressed(timeToUndress));
		addAction(new Swim(timeToSwim));
		addAction(new GettingDressed(timeToDress));
		addAction(new FreeResourceCubicleAction(this.resourceCubicle, this.resFulUserCubicle));
		addAction(new FreeResourceBasketAction(this.resourceBasket, this.resFulUserBasket));

	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public BasketPool getResourceBasket() {
		return resourceBasket;
	}


	public CubiclePool getResourceCubicle() {
		return resourceCubicle;
	}


	public int getTimeToUndress() {
		return timeToUndress;
	}

	public int getTimeToSwim() {
		return timeToSwim;
	}



	public int getTimeToDress() {
		return timeToDress;
	}


	@Override
	public String toString() {
		return "Swimmer [name=" + name + ", resourceBasket=" + resourceBasket
				+ ", resourceCubicle=" + resourceCubicle + ", timeToUndress="
				+ timeToUndress + ", timeToSwim=" + timeToSwim
				+ ", timeToDress=" + timeToDress + "]";
	}

	
	
}

