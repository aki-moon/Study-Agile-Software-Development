package agilesoftwaredevelopment.designpattern.observer.test;

import agilesoftwaredevelopment.designpattern.observer.src.ClockObserver;
import agilesoftwaredevelopment.designpattern.observer.src.TimeSource;
import agilesoftwaredevelopment.designpattern.observer.src.TimeSourceImpl;

public class MockTimeSource implements TimeSource {
	TimeSourceImpl timeSource = new TimeSourceImpl();

	@Override
	public void registerObserver(ClockObserver clockObserver) {
		timeSource.registerObserver(clockObserver);
	}

	public void setTime(int hours, int minutes, int seconds) {
		timeSource.notify(hours, minutes, seconds);
	}

}
