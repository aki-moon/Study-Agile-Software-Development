package agilesoftwaredevelopment.designpattern.observer.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClockDriverTest {
	private MockTimeSource source;
	private MockTimeSink sink;

	@BeforeEach
	public void setup() {
		source = new MockTimeSource();
		sink = new MockTimeSink();
		source.registerObserver(sink);
	}

	@Test
	void timeChangeTest() {
		source.setTime(3, 4, 5);
		assertSinkEquals(sink, 3, 4, 5);
		source.setTime(7, 8, 9);
		assertSinkEquals(sink, 7, 8, 9);
	}

	private void assertSinkEquals(MockTimeSink mockTimeSink, int hours, int minutes, int seconds) {
		assertEquals(hours, sink.hours());
		assertEquals(minutes, sink.minutes());
		assertEquals(seconds, sink.seconds());
	}



}
