package src.resource.resourcePool;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import src.resource.Resource;


/**
 * <br>
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public abstract class ResourcePool<R extends Resource>
{

	protected List<R> resources;
	protected List<R> freeresources;
	protected int length;
	

	
	public ResourcePool(int size) {
		super();
		this.length = size;	
		this.resources = new ArrayList<R>();
		for (int i=0; i<size; i++) {
			this.resources.add(getType());
		}
		this.freeresources = new ArrayList<R>();
	}
	
	
	public R provideResource() throws NoSuchElementException {
		if (this.resources.size() == 0) {
			throw new NoSuchElementException();
		}
		R r = this.resources.get(0);
		this.resources.remove(0);
		this.freeresources.add(r);
		return r;
	}
	

	public void freeResource(R r) throws IllegalArgumentException{
			if (!this.freeresources.contains(r)) {
				throw new IllegalArgumentException();
			}
			this.freeresources.remove(r);
			this.resources.add(r);
	}

	protected abstract R getType() ;


	public List<R> getResources() {
		return resources;
	}


	public List<R> getFreeresources() {
		return freeresources;
	}


	public int getLength() {
		return length;
	}
	
}

