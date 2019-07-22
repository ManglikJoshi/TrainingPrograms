package day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Program5Test {

	@Test
	void test() {
		Factorial ft=new Factorial();
		int result=ft.CalculateFactorial(5);
		assertEquals(120,result);
	}

}
