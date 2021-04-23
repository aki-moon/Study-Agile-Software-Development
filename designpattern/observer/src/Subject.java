package agilesoftwaredevelopment.designpattern.observer.src;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> itsObservers = new ArrayList<Observer>();

	public void notifyObservers() {
		for (Observer clockObserver : itsObservers) {
			clockObserver.update();
		}
	}

	public void registerObserver(Observer observer) {
		itsObservers.add(observer);
	}

}
