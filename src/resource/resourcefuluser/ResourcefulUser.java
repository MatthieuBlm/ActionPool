package src.resource.resourcefuluser;
import src.resource.Resource;


public class ResourcefulUser<R extends Resource>{
	protected R resource;
	
	public ResourcefulUser() {}
	
	public R getResource() {
		return resource;	
	}
	
	public void setResource(R resource) {
		this.resource = resource;	
	}
	
	public void resetResource() {
		this.resource = null;	
	}
	
}

