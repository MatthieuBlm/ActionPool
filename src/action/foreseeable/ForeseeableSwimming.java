package src.action.foreseeable;

public abstract class ForeseeableSwimming extends Foreseeable{

	public ForeseeableSwimming(int totalTime) {
		super(totalTime);
	}

	public void printDescription() {
		System.out.println(getDescription() + " (" + (this.totalTime-this.remainingTime) + "/" + this.totalTime + ")");
	}
	
	protected abstract String getDescription();
	
	public void reallyDoOneStep() {
		super.reallyDoOneStep();
		printDescription();
	}
}
