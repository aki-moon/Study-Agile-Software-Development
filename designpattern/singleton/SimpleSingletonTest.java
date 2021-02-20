package agilesoftwaredevelopment.designpattern.singleton;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.jupiter.api.Test;

class SimpleSingletonTest {

	@Test
	void testCreateSingleton() {
		Singleton singleton = Singleton.Instance();
		Singleton singleton2 = Singleton.Instance();
		assertSame(singleton, singleton2);
	}

	@Test
	void testNoPublicConstructors() throws Exception {
		Class<?> singleton = Class.forName("Singleton");
		Constructor<?>[] constructor = singleton.getConstructors();
		assertEquals("Public constructors.", 0, constructor.length);
	}

}
