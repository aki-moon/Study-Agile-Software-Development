package agilesoftwaredevelopment.designpattern.observer;

public class ClockDriver {
	private TimeSink sink;

	public ClockDriver(MockTimeSource source, MockTimeSinc sink) {
		source.setDriver(this);
		this.sink = sink;
	}

	public void update(int hours, int minutes, int seconds) {
		sink.setTime(hours, minutes, seconds);
	}

}
