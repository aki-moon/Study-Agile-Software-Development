package agilesoftwaredevelopment.designpattern.observer.test;

import agilesoftwaredevelopment.designpattern.observer.src.Observer;
import agilesoftwaredevelopment.designpattern.observer.src.TimeSource;

public class MockTimeSink implements Observer {
	private int hours;
	private int minutes;
	private int seconds;
	private TimeSource timeSource;

	public MockTimeSink(agilesoftwaredevelopment.designpattern.observer.src.TimeSource timeSource) {
		this.timeSource = timeSource;
	}

	public int hours() {
		return hours;
	}

	public int minutes() {
		return minutes;
	}

	public int seconds() {
		return seconds;
	}

	@Override
	public void update() {
		hours = timeSource.getHours();
		minutes = timeSource.getMinutes();
		seconds = timeSource.getSeconds();
	}

}
