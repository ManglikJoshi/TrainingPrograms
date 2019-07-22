package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		
		Temperature t=new Temperature();
		 double m=t.ConvertToFarenheit(38.0);
		 double n=t.ConvertToCelsius(100.0);
		 assertEquals(100.4,m);
				 assertEquals(37.77777777777778,n);
	}

}
