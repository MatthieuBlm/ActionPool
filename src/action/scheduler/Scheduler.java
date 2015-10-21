package action.scheduler;

import java.util.ArrayList;
import java.util.List;

import exception.ActionFinishedException;

import action.Action;

public abstract class Scheduler extends Action{
	protected List<Action> actions;
	protected boolean isInitialized;
	
	protected abstract Action nextAction();
	
	public Scheduler() {
		super();
		this.actions = new ArrayList<Action>();
	}
	
	public void addAction(Action a) {
		isInitialized = true;
		if (a.isFinished()) {
			throw new IllegalArgumentException("Can't add an already finished action");
		}
		if (isFinished()) {
			throw new IllegalArgumentException("ou can't add an action to a finished scheduler");
		} else {
			actions.add(a);
		}
	}

	public boolean isReady() {
		return (isInitialized && isReady);	
	}
	
	@Override
	public boolean isFinished() {
		return (isInitialized && !isReady() && actions.isEmpty());
	}
	
	public void reallyDoOneStep() {
		isReady= false;
		Action nextAction = nextAction();
		try {
			nextAction.doStep();
		} catch (ActionFinishedException e) {
			System.out.println(e.getMessage());
		}
		if (nextAction.isFinished()) {
			actions.remove(0);
		}
	}

	public List<Action> getListAction() {
		return actions;
	}
	
	@Override
	public boolean isInProgess() {
		return (isInitialized && !isFinished() && !isReady());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actions == null) ? 0 : actions.hashCode());
		result = prime * result + (isInitialized ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scheduler other = (Scheduler) obj;
		if (actions == null) {
			if (other.actions != null)
				return false;
		} else if (!actions.equals(other.actions))
			return false;
		if (isInitialized != other.isInitialized)
			return false;
		return true;
	}
	
}

