package agilesoftwaredevelopment.designpattern.observer.test;

import agilesoftwaredevelopment.designpattern.observer.src.ClockObserver;
import agilesoftwaredevelopment.designpattern.observer.src.TimeSource;

public class MockTimeSource implements TimeSource {
	private ClockObserver observer;

	public void setTime(int hours, int minutes, int seconds) {
		observer.update(hours, minutes, seconds);
	}

	public void setObserver(ClockObserver observer) {
		this.observer = observer;
	}

}
