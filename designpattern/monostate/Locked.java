package agilesoftwaredevelopment.designpattern.monostate;

public class Locked extends TurnStile {
	public void coin() {
		itsState = UNLOCKED;
		lock(false);
		alarm(false);
		deposit();
	}

	public void pass() {
		alarm(true);
	}

}
