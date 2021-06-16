package ru.otus.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	private Calculator calculator;

	@BeforeEach
	public void setup() {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Test sum")
	void test1() {
		Integer val1 = 3;
		Integer val2 = 7;
		Integer expected = 10;

		assert calculator.sum(val1, val2).equals(expected);
	}
	@Test
	@DisplayName("Test subtraction")
	void test2() {
		Integer val1 = 10;
		Integer val2 = 3;
		Integer expected = 7;

		assert calculator.subtraction(val1, val2).equals(expected);
	}
	@Test
	@DisplayName("Test multiply")
	void test3() {
		Integer val1 = 4;
		Integer val2 = 5;
		Integer expected = 20;

		assert calculator.multiply(val1, val2).equals(expected);
	}
	@Test
	@DisplayName("Test division")
	void test4() {
		Integer val1 = 9;
		Integer val2 = 3;
		Integer expected = 3;

		assert calculator.division(val1, val2).equals(expected);
	}
	@Test
	@DisplayName("Test exponentiation")
	void test5() {
		Integer val1 = 5;
		Integer expected = 25;

		assert calculator.exponentiation(val1).equals(expected);
	}
}
