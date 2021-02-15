package agilesoftwaredevelopment.designpattern.activeobject.src;

public class DelayedTyper implements Command {
	private long itsDelay;
	private char itsChar;
	private static ActiveObjectEngine activeObjectEngine = new ActiveObjectEngine();
	private static boolean stop = false;

	public DelayedTyper(int itsDelay, char itsChar) {
		this.itsDelay = itsDelay;
		this.itsChar = itsChar;
	}

	public static void main(String[] args) {
		activeObjectEngine.addCommand(new DelayedTyper(100, '1'));
		activeObjectEngine.addCommand(new DelayedTyper(300, '3'));
		activeObjectEngine.addCommand(new DelayedTyper(500, '5'));
		activeObjectEngine.addCommand(new DelayedTyper(700, '7'));
		Command stopCommand = new Command() {
			@Override
			public void execute() {
				stop = true;
			}
		};
		activeObjectEngine.addCommand(new SleepCommand(20000, activeObjectEngine, stopCommand));
		activeObjectEngine.run();
	}

	@Override
	public void execute() {
		System.out.println(itsChar);
		if (!stop) {
			delayAndRepeat();
		}
	}

	private void delayAndRepeat() {
		activeObjectEngine.addCommand(new SleepCommand(itsDelay, activeObjectEngine, this));
	}

}
