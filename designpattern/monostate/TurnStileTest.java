package agilesoftwaredevelopment.designpattern.monostate;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TurnStileTest {
	@BeforeEach
	void setUp() throws Exception {
		TurnStile turnStile = new TurnStile();
		turnStile.reset();
	}

	@Test
	void testInit() {
		TurnStile turnStile = new TurnStile();
		assertTrue(turnStile.locked());
		assertTrue(!turnStile.alarm());
	}

	@Test
	void testCoin() {
		TurnStile turnStile1 = new TurnStile();
		turnStile1.coin();
		TurnStile turnStile2 = new TurnStile();
		assertTrue(!turnStile2.locked());
		assertTrue(!turnStile2.alarm());
		assertEquals(1, turnStile2.coins());
	}

	@Test
	void testCoinAndPass() {
		TurnStile turnStile1 = new TurnStile();
		turnStile1.coin();
		turnStile1.pass();
		TurnStile turnStile2 = new TurnStile();
		assertTrue(turnStile2.locked());
		assertTrue(!turnStile2.alarm());
		assertEquals("coins", 1, turnStile2.coins());
	}

	@Test
	void testTwoCoins() {
		TurnStile turnStile1 = new TurnStile();
		turnStile1.coin();
		turnStile1.coin();
		TurnStile turnStile2 = new TurnStile();
		assertTrue("unlocked", !turnStile2.locked());
		assertEquals("coins", 1, turnStile2.coins());
		assertEquals("refunds", 1, turnStile2.refunds());
		assertTrue(!turnStile2.alarm());
	}

	@Test
	void testPass() {
		TurnStile turnStile1 = new TurnStile();
		turnStile1.pass();
		TurnStile turnStile2 = new TurnStile();
		assertTrue("alarm", turnStile2.alarm());
		assertTrue("locked", turnStile2.locked());
	}

	@Test
	void testCancelAlarm() {
		TurnStile turnStile1 = new TurnStile();
		turnStile1.pass();
		turnStile1.coin();
		TurnStile turnStile2 = new TurnStile();
		assertTrue("alarm", !turnStile2.alarm());
		assertTrue("locked", !turnStile2.locked());
		assertEquals("coins", 1, turnStile2.coins());
		assertEquals("refunds", 0, turnStile2.refunds());
	}

	@Test
	void testTwoOperations() {
		TurnStile turnStile1 = new TurnStile();
		turnStile1.coin();
		turnStile1.pass();
		turnStile1.coin();
		assertTrue("unlocked", !turnStile1.locked());
		assertEquals("coins", 2, turnStile1.coins());
		turnStile1.pass();
		assertTrue("locked", turnStile1.locked());
	}

}
