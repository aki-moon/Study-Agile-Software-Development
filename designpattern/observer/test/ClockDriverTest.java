package agilesoftwaredevelopment.designpattern.observer.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClockDriverTest {

	@SuppressWarnings("unused")
	@Test
	void clockDriverTest() {
		MockTimeSource source = new MockTimeSource();
		MockTimeSinc sink = new MockTimeSinc();
		ClockDriver driver = new ClockDriver(source, sink);
		source.setTime(3, 4, 5);
		assertEquals(3, sink.hours());
		assertEquals(4, sink.minutes());
		assertEquals(5, sink.seconds());
		source.setTime(7, 8, 9);
		assertEquals(7, sink.hours());
		assertEquals(8, sink.minutes());
		assertEquals(9, sink.seconds());
	}

}
