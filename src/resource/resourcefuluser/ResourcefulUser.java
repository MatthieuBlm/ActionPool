package src.resource.resourcefuluser;
import src.resource.Resource;
/**
 * ResourcefulUser keep one of the resource of the user
 * @author Meyer Bellamy
 *
 * @param <R> one of the resource
 */

public class ResourcefulUser<R extends Resource>{
	/**
	 * attribute resource
	 */
	protected R resource;
	
	/**
	 * Constructor ResourcefulUser
	 */
	public ResourcefulUser() {}
	
	/**
	 * return the resource
	 * @return the resource
	 */
	public R getResource() {
		return resource;	
	}
	
	/**
	 * change the resource
	 * @param resource which you can change
	 */
	public void setResource(R resource) {
		this.resource = resource;	
	}
	
	/**
	 * reset the resource
	 */
	public void resetResource() {
		this.resource = null;	
	}
	
}

