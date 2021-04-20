package agilesoftwaredevelopment.designpattern.observer.test;

import agilesoftwaredevelopment.designpattern.observer.src.TimeSource;

public class MockTimeSource extends TimeSource {
	public void setTime(int hours, int minutes, int seconds) {
		notify(hours, minutes, seconds);
	}

}
