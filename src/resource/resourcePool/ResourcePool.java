package src.resource.resourcePool;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import src.resource.Resource;

/**
 * Resource Pool keep all the objects 
 * @author Meyer Bellamy
 *
 * @param <R> the type of objects
 */

public abstract class ResourcePool<R extends Resource>
{

	/**
	 * attribute list of resources keep the resource which can be take it
	 */
	protected List<R> resources;
	/**
	 * attribute list of resources keep the resource which you can be free it
	 */
	protected List<R> freeresources;
	/**
	 * attribute length of the resource pool
	 */
	protected int length;
	

	
	/**
	 * Constructor of the ResourcePool 
	 * @param size the size of the resource pool
	 */
	public ResourcePool(int size) {
		super();
		this.length = size;	
		this.resources = new ArrayList<R>();
		for (int i=0; i<size; i++) {
			this.resources.add(getType());
		}
		this.freeresources = new ArrayList<R>();
	}
	
	
	/**
	 * keep an action to the resource pool 
	 * @return an action to the resource pool
	 * @throws NoSuchElementException when there aren't element in the list
	 */
	public R provideResource() throws NoSuchElementException {
		if (this.resources.size() == 0) {
			throw new NoSuchElementException();
		}
		R r = this.resources.get(0);
		this.resources.remove(0);
		this.freeresources.add(r);
		return r;
	}
	

	/**
	 * free resource 
	 * @param r the resource
	 * @throws IllegalArgumentException if the resource can't be in the list
	 */
	public void freeResource(R r) throws IllegalArgumentException{
			if (!this.freeresources.contains(r)) {
				throw new IllegalArgumentException();
			}
			this.freeresources.remove(r);
			this.resources.add(r);
	}

	/**
	 * return the instance of R
	 * @return the instance of R
	 */
	protected abstract R getType() ;


	/**
	 * return the list of the resources
	 * @return the list of the resources
	 */
	public List<R> getResources() {
		return resources;
	}


	/**
	 * return the list of free resources
	 * @return the list of free resources
	 */
	public List<R> getFreeresources() {
		return freeresources;
	}


	/**
	 * return the length of the resource
	 * @return the length of the resource
	 */
	public int getLength() {
		return length;
	}
	
	
}

