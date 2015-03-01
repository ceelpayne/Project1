package training;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void sayHello() {
		assertTrue(Hello.sayHello()=="Hello");
	}

}
