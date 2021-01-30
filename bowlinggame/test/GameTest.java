package bowlinggame.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bowlinggame.main.Game;

class GameTest {
	private Game game;

	@BeforeEach
	void setUp() {
		game = new Game();
	}

	@Test
	void testOneThrow() {
		game.add(5);
		assertEquals(5, game.getScore());
		assertEquals(1, game.getCurrentFrame());
	}

	@Test
	void testTwoThrowsNoMark() {
		game.add(5);
		game.add(4);
		assertEquals(9, game.getScore());
		assertEquals(1, game.getCurrentFrame());
	}

	@Test
	void testFourThrowsNoMark() {
		game.add(5);
		game.add(4);
		game.add(7);
		game.add(2);
		assertEquals(18, game.getScore());
		assertEquals(9, game.scoreForFrame(1));
		assertEquals(18, game.scoreForFrame(2));
		assertEquals(2, game.getCurrentFrame());
	}

	@Test
	void testSimpleSpare() {
		game.add(3);
		game.add(7);
		game.add(3);
		game.add(2);
		assertEquals(13, game.scoreForFrame(1));
		assertEquals(18, game.scoreForFrame(2));
	}

//	@Test
//	void testSimpleFrameAfterSpare() {
//		game.add(3);
//		game.add(7);
//		game.add(3);
//		game.add(2);
//		assertEquals(18, game.getScore());
//	}

}
