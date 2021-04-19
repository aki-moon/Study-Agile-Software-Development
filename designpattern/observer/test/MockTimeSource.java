package agilesoftwaredevelopment.designpattern.observer.test;

import java.util.ArrayList;
import java.util.List;

import agilesoftwaredevelopment.designpattern.observer.src.ClockObserver;
import agilesoftwaredevelopment.designpattern.observer.src.TimeSource;

public class MockTimeSource implements TimeSource {
	private List<ClockObserver> itsObservers = new ArrayList<ClockObserver>();

	public void setTime(int hours, int minutes, int seconds) {
		for (ClockObserver clockObserver : itsObservers) {
			clockObserver.update(hours, minutes, seconds);
		}
	}

	public void registerObserver(ClockObserver observer) {
		itsObservers.add(observer);
	}

}
