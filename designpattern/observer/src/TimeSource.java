package agilesoftwaredevelopment.designpattern.observer.src;

public interface TimeSource {
	public void registerObserver(ClockObserver driver);
}
