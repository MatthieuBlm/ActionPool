package src.action.foreseeable;

public class Swim extends ForeseeableSwimming {

	public Swim(int totalTime) {
		super(totalTime);
	}

	@Override
	protected String getDescription() {
		return "swim";
	}

}
