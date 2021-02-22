package agilesoftwaredevelopment.designpattern.monostate;

public class TurnStile {
	private static boolean isLocked = true;
	private static boolean isAlarming = false;
	private static int itsCoins = 0;
	private static int itsRefunds = 0;
	protected final static TurnStile LOCKED = new Locked();
	protected final static TurnStile UNLOCKED = new UnLocked();
	protected static TurnStile itsState = LOCKED;

	public void reset() {
		lock(true);
		alarm(false);
		itsCoins = 0;
		itsRefunds = 0;
		itsState = LOCKED;
	}

	public boolean locked() {
		return isLocked;
	}

	public boolean alarm() {
		return isAlarming;
	}

	public void coin() {
		itsState.coin();
	}

	public void pass() {
		itsState.pass();
	}

	public int coins() {
		return itsCoins;
	}

	public int refunds() {
		return itsRefunds;
	}

	public void deposit() {
		itsCoins++;
	}

	public void refund() {
		itsRefunds++;
	}

	protected void alarm(boolean shouldAlarm) {
		isAlarming = shouldAlarm;
	}

	protected void lock(boolean shouldLock) {
		isLocked = shouldLock;
	}

}
