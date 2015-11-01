package src.action.scheduler.sequential;

import src.action.foreseeable.foreseeableswimming.GettingDressed;
import src.action.foreseeable.foreseeableswimming.GettingUndressed;
import src.action.foreseeable.foreseeableswimming.Swim;
import src.action.resourceaction.freeresourceaction.FreeResourceBasketAction;
import src.action.resourceaction.freeresourceaction.FreeResourceCubicleAction;
import src.action.resourceaction.takeresourceaction.TakeResourceBasketAction;
import src.action.resourceaction.takeresourceaction.TakeResourceCubicleAction;
import src.resource.Basket;
import src.resource.Cubicle;
import src.resource.resourcePool.BasketPool;
import src.resource.resourcePool.CubiclePool;
import src.resource.resourcefuluser.ResourcefulUser;

/**
 * Class Swimmer with a name, the resource pool of Basket and Cubicle, and the time to undress, to swim and to dress
 * @author Meyer Bellamy
 *
 */
public class Swimmer extends Sequential{
	/**
	 * attribute name of the swimmer
	 */
	private String name;	
	/**
	 * attribute resource pool of the Basket
	 */
	private BasketPool resourceBasket;
	/**
	 * attribute for the resource pool of the cubicle
	 */
	private CubiclePool resourceCubicle;
	/**
	 * attribute to keep the time to undress
	 */
	private int timeToUndress;
	/**
	 * attribute to keep the time to swim
	 */
	private int timeToSwim;
	/**
	 * attribute to keep the time to dress
	 */
	private int timeToDress;
	/**
	 * attribute to keep the exchange between the user and the resource pool basket
	 */
	private ResourcefulUser<Basket> resFulUserBasket;
	/**
	 * attribute to keep the exchange between the user and the resource pool Cubicle
	 */
	private ResourcefulUser<Cubicle> resFulUserCubicle;
		

	/**
	 * Constructor for the swimmer
	 * add all the actions at swimmer
	 * @param name the name of the swimmer
	 * @param resourceBasket the Basket's resource of the swimming pool
	 * @param resourceCubicle the Cubicle's resource of the swimming pool
	 * @param timeToUndress the time to undress
	 * @param timeToSwim the time to swim
	 * @param timeToDress the time to dress
	 */
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

	/**
	 * return the name of the swimmer
	 * @return the name of the swimmer
	 */
	public String getName() {
		return name;
	}


	/**
	 * return the Basket's resource
	 * @return the Basket's resource
	 */
	public BasketPool getResourceBasket() {
		return resourceBasket;
	}


	/**
	 * return the Cubicle's resource
	 * @return the Cubicle's resource
	 */
	public CubiclePool getResourceCubicle() {
		return resourceCubicle;
	}


	/**
	 * return the time to undress
	 * @return the time to undress
	 */
	public int getTimeToUndress() {
		return timeToUndress;
	}

	/**
	 * return the time to swim
	 * @return the time to swim
	 */
	public int getTimeToSwim() {
		return timeToSwim;
	}



	/**
	 * return the time to dress
	 * @return the time to dress
	 */
	public int getTimeToDress() {
		return timeToDress;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getName();
	}

	
	
}

