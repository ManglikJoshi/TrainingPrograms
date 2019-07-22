package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Program2Test {

	@Test
	void test() {
		MarkValidator m=new MarkValidator();
		String result=m. markGrade(92);
		Boolean mj=m.isPass(92);
		assertEquals(true,mj);
		assertEquals("Grade A",result);
	}

}
