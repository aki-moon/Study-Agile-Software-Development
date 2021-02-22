package agilesoftwaredevelopment.designpattern.monostate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonostateTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testInstance() {
		Monostate monostate = new Monostate();
		for(int x =0; x < 10; x++) {
			monostate.setX(x);
			assertEquals(x, monostate.getX());
		}
	}

	@Test
	void testInstanceBeHaveAsOne() {
		Monostate monostate1 = new Monostate();
		Monostate monostate2 = new Monostate();
		for(int x =0; x < 10; x++) {
			monostate1.setX(x);
			assertEquals(x, monostate2.getX());
		}
	}


}
