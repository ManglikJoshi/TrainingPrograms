package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		HelloWorld ho=new HelloWorld();
		
        assertEquals("Hello World!",ho.getMessage());
	}

}
