package resource.resourcePool;
import resource.Cubicle;



public class CubiclePool extends ResourcePool<Cubicle>
{


	
	public CubiclePool(int length) {
		super(length);	
	}
	
	
	public Cubicle getType() {
		return new Cubicle();	
	}
	
	
	public String description() {
		String description = "There are " + this.resources.size() + " available :\n";
		for (Cubicle b : this.resources) {
			description += " -" + b.description() + " here \n";
		}
		description += "\nThere are "+ this.freeresources.size() + "free :\n";
		for (Cubicle b2 : this.freeresources) {
			description +=" -" + b2.description() + " free\n";
		}
		return description;	
	}
	
}

