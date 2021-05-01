package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticCalculatorTest {
	TestSwingApplication application = new TestSwingApplication();

	@Test
	void given5And7WhenSumThen12() {
		
		//Given 5 and 7
		int a = 5;
		int b = 7;
		int expectedResult = 12;
		
		//When operation is sum
		int actualResult = ArithmeticCalculator.sum(a, b);
		
		//then result is 12
		assertEquals(expectedResult, actualResult);
	}

}
