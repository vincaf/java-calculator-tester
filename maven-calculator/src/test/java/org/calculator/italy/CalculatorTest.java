package org.calculator.italy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calc = new Calculator();

	@Test
	@DisplayName("Test add")
	void addTest() {
		float value = calc.add(1, 2);
		assertEquals(3, value);
	}

	@Test
	@DisplayName("Test subtract")
	void subracTest() {
		float value = calc.subtract(4, 2);
		assertEquals(2, value);
	}

	@Test
	@DisplayName("Test divide")
	void divideTest() {
		float value = calc.divide(10, 2);
		assertEquals(5, value);
	}
	
	@Test
	@DisplayName("Test multiply")
	void multiplyTest() {
		float value = calc.multiply(2, 10);
		assertEquals(20, value);
	}

}
