package src.resource.resourcePool;
import src.resource.Basket;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */


public class BasketPool extends ResourcePool<Basket>
{

	
	public BasketPool(int nb) {
		super(nb);	
	}
	
	
	public Basket getType() {
		return new Basket();	
	}
	

	public String description() {
		String description = "There are " + this.resources.size() + " available :\n";
		for (Basket b : this.resources) {
			description += " -" + b.description() + " here \n";
		}
		description += "\nThere are "+ this.freeresources.size() + "free :\n";
		for (Basket b2 : this.freeresources) {
			description +=" -" + b2.description() + " free\n";
		}
		return description;	
	}
	
}

