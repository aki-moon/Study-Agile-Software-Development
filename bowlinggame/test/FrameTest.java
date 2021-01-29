package bowlinggame.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import bowlinggame.main.Frame;

class FrameTest {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testScoreNoThrow() {
		Frame frame = new Frame();
		assertEquals(0, frame.getScore());
	}

	@Test
	void testAddOneThrow() {
		Frame frame = new Frame();
		frame.add(5);
		assertEquals(5, frame.getScore());
	}

}
