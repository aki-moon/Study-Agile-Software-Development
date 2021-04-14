package agilesoftwaredevelopment.designpattern.observer;

public class MockTimeSource implements TimeSource {
	private ClockDriver driver;

	public void setTime(int hours, int minutes, int seconds) {
		driver.update(hours, minutes, seconds);
	}

	public void setDriver(ClockDriver driver) {
		this.driver = driver;
	}

}
