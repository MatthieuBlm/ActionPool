package action.foreseeable;
import action.Action;

public class Foreseeable extends Action{
	protected int remainingTime;
	protected int totalTime;
	
	public Foreseeable(int totalTime){
		super();
		this.remainingTime = totalTime;
		this.totalTime = totalTime;
	}
	
	public boolean isReady() {
		return (remainingTime == totalTime);	
	}
	
	public boolean isInProgress() {
		return (!isReady() && !isFinished());	
	}
	
	public void reallyDoOneStep() {
		remainingTime--;
	}

	@Override
	public boolean isInProgess() {
		return (!isReady() && !isFinished());
	}

	@Override
	public boolean isFinished() {
		return (remainingTime <= 0);
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Foreseeable) {
			Foreseeable other = (Foreseeable) o;
			return other.getTotalTime() == this.totalTime;
		}
		return false;
	}
	
}

