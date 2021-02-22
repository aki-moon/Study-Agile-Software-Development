package agilesoftwaredevelopment.designpattern.monostate;

public class UnLocked extends TurnStile {
	public void coin() {
		refund();
	}

	public void pass() {
		lock(true);
		itsState = LOCKED;
	}

}
