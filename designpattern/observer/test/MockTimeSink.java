package agilesoftwaredevelopment.designpattern.observer.test;

import agilesoftwaredevelopment.designpattern.observer.src.ClockObserver;

public class MockTimeSink implements ClockObserver {
	private int hours;
	private int minutes;
	private int seconds;

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
	public void update(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

}
