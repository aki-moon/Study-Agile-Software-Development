package agilesoftwaredevelopment.designpattern.observer.test;

import agilesoftwaredevelopment.designpattern.observer.src.ClockObserver;
import agilesoftwaredevelopment.designpattern.observer.src.TimeSink;

public class ClockDriver implements ClockObserver {
	private TimeSink sink;

	public ClockDriver(MockTimeSource source, MockTimeSinc sink) {
		source.setObserver(this);
		this.sink = sink;
	}

	public void update(int hours, int minutes, int seconds) {
		sink.setTime(hours, minutes, seconds);
	}

}
