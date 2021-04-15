package agilesoftwaredevelopment.designpattern.observer.test;

import agilesoftwaredevelopment.designpattern.observer.src.ClockObserver;

public class ClockDriver implements ClockObserver {
	private ClockObserver observer;

	public ClockDriver(MockTimeSource source, MockTimeSink sink) {
		source.setObserver(this);
		this.observer = sink;
	}

	public void update(int hours, int minutes, int seconds) {
		observer.update(hours, minutes, seconds);
	}

}
