package action.scheduler;
import java.util.ArrayList;
import java.util.List;

import exception.ActionFinishedException;

import action.Action;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public abstract class Scheduler extends Action
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected List<Action> actions;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected boolean isInitialized;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Scheduler() {
		super(0);
		this.actions = new ArrayList<Action>();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean isReady() {
		return (isInitialized && isReady);	
	}
	
	
	@Override
	public boolean isFinished() {
		return (isInitialized && !isReady() && actions.isEmpty());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
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
	
	protected abstract Action nextAction();

	@Override
	public boolean isInProgess() {
		return (isInitialized && !isFinished() && !isFinished());
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Scheduler) {
			Scheduler other = (Scheduler) o;
			return ((other.getTotalTime() == this.totalTime) && (this.getListAction().size() == other.getListAction().size()));
		}
		return false;
	}
	
}

