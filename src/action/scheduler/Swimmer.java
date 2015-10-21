package action.scheduler;
import resource.resourcePool.BasketPool;
import resource.resourcePool.CubiclePool;




public class Swimmer extends Sequential{
	private String name;	
	private BasketPool resourceBasket;
	private CubiclePool resourceCubicle;	
	private int timeToUndress;
	private int timeToSwim;
	private int timeToDress;
		

	public Swimmer(String name, BasketPool resourceBasket,CubiclePool resourceCubicle, int timeToUndress, int timeToSwim,int timeToDress) {
		super();
		this.name = name;
		this.resourceBasket = resourceBasket;
		this.resourceCubicle = resourceCubicle;
		this.timeToUndress = timeToUndress;
		this.timeToSwim = timeToSwim;
		this.timeToDress = timeToDress;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((resourceBasket == null) ? 0 : resourceBasket.hashCode());
		result = prime * result
				+ ((resourceCubicle == null) ? 0 : resourceCubicle.hashCode());
		result = prime * result + timeToDress;
		result = prime * result + timeToSwim;
		result = prime * result + timeToUndress;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Swimmer other = (Swimmer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (resourceBasket == null) {
			if (other.resourceBasket != null)
				return false;
		} else if (!resourceBasket.equals(other.resourceBasket))
			return false;
		if (resourceCubicle == null) {
			if (other.resourceCubicle != null)
				return false;
		} else if (!resourceCubicle.equals(other.resourceCubicle))
			return false;
		if (timeToDress != other.timeToDress)
			return false;
		if (timeToSwim != other.timeToSwim)
			return false;
		if (timeToUndress != other.timeToUndress)
			return false;
		return true;
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


	public void setResourceBasket(BasketPool resourceBasket) {
		this.resourceBasket = resourceBasket;
	}


	public CubiclePool getResourceCubicle() {
		return resourceCubicle;
	}


	public void setResourceCubicle(CubiclePool resourceCubicle) {
		this.resourceCubicle = resourceCubicle;
	}


	public int getTimeToUndress() {
		return timeToUndress;
	}


	public void setTimeToUndress(int timeToUndress) {
		this.timeToUndress = timeToUndress;
	}


	public int getTimeToSwim() {
		return timeToSwim;
	}


	public void setTimeToSwim(int timeToSwim) {
		this.timeToSwim = timeToSwim;
	}


	public int getTimeToDress() {
		return timeToDress;
	}


	public void setTimeToDress(int timeToDress) {
		this.timeToDress = timeToDress;
	}


	@Override
	public String toString() {
		return "Swimmer [name=" + name + ", resourceBasket=" + resourceBasket
				+ ", resourceCubicle=" + resourceCubicle + ", timeToUndress="
				+ timeToUndress + ", timeToSwim=" + timeToSwim
				+ ", timeToDress=" + timeToDress + "]";
	}
	
	
}

