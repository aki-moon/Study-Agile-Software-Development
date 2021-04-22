package agilesoftwaredevelopment.designpattern.observer.src;

import java.util.ArrayList;
import java.util.List;

public class TimeSourceImpl implements TimeSource {

	private List<ClockObserver> itsObservers = new ArrayList<ClockObserver>();

	public void notify(int hours, int minutes, int seconds) {
		for (ClockObserver clockObserver : itsObservers) {
			clockObserver.update(hours, minutes, seconds);
		}
	}

	@Override
	public void registerObserver(ClockObserver observer) {
		itsObservers.add(observer);
	}

}
