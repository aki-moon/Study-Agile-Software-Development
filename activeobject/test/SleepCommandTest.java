package agilesoftwaredevelopment.designpattern.activeobject.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.designpattern.activeobject.src.ActiveObjectEngine;
import agilesoftwaredevelopment.designpattern.activeobject.src.Command;
import agilesoftwaredevelopment.designpattern.activeobject.src.SleepCommand;

class SleepCommandTest {
	private boolean commandExecuted = false;

	@Test
	void testSleep() {
		Command wakeup = new Command() {
			@Override
			public void execute() {
				commandExecuted = true;
			}
		};
		ActiveObjectEngine activeObjectEngine = new ActiveObjectEngine();
		SleepCommand sleepCommand = new SleepCommand(1000, activeObjectEngine, wakeup);
		activeObjectEngine.addCommand(sleepCommand);
		long start = System.currentTimeMillis();
		activeObjectEngine.run();
		long stop = System.currentTimeMillis();
		long sleepTime = (stop - start);
		assertTrue("SleepTime " + sleepTime + " expected >= 1000", sleepTime >= 1000);
		assertTrue("SleepTime " + sleepTime + " expected < 1100", sleepTime < 1100);
		assertTrue("Command Executed", commandExecuted);
	}

}
