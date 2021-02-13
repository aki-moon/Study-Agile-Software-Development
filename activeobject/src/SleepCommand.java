package agilesoftwaredevelopment.designpattern.activeobject.src;

public class SleepCommand implements Command {
	private Command wakeupCommand = null;
	private ActiveObjectEngine activeObjectEngine = null;
	private long sleepTime = 0;
	private long startTime = 0;
	private boolean started = false;

	public SleepCommand(long miliseconds, ActiveObjectEngine activeObjectEngine, Command wakeupCommand) {
		sleepTime = miliseconds;
		this.activeObjectEngine = activeObjectEngine;
		this.wakeupCommand = wakeupCommand;
	}

	@Override
	public void execute() {
		long currentTime = System.currentTimeMillis();
		if (!started) {
			started = true;
			startTime = currentTime;
			activeObjectEngine.addCommand(this);
		} else if ((currentTime - startTime) < sleepTime) {
			activeObjectEngine.addCommand(this);
		} else {
			activeObjectEngine.addCommand(wakeupCommand);
		}
	}

}
