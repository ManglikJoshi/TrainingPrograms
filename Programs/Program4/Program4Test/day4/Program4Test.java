package day4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Program4Test {

	@Test
	void test() {

		SumOfNumbers st=new SumOfNumbers();
		int resultO=st.SumOfOddNumbers(1,10);
		assertEquals(25,resultO);
		int resultE=st.SumOfEvenNumbers(1,10);
		assertEquals(30,resultE);
	}

}
