package agilesoftwaredevelopment.designpattern.observer.src;

import agilesoftwaredevelopment.designpattern.observer.test.ClockDriver;

public interface TimeSource {
	public void setDriver(ClockDriver driver);
}
