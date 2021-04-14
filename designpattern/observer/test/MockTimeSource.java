package agilesoftwaredevelopment.designpattern.observer.test;

import agilesoftwaredevelopment.designpattern.observer.src.TimeSource;

public class MockTimeSource implements TimeSource {
	private ClockDriver driver;

	public void setTime(int hours, int minutes, int seconds) {
		driver.update(hours, minutes, seconds);
	}

	public void setDriver(ClockDriver driver) {
		this.driver = driver;
	}

}
