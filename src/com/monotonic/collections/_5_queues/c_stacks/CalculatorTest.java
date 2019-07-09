package com.monotonic.collections._5_queues.c_stacks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator calculator = new Calculator();
	

	@Test
	void shouldEvaluateConstatns() {
		int result = calculator.evalute("1");
		assertEquals(1, result);
	}
	
	@Test
	public void shouldSupportAdding() {
		int result = calculator.evalute("1 + 2");
		assertEquals(3, result);
	}

	@Test
	public void shouldSupportSubtraction() {
		int result = calculator.evalute("1 - 2");
		assertEquals(-1, result);
	}
	
	@Test
	public void shouldComplexStatements() {
		int result = calculator.evalute("1 - 3 + 2 + 4");
		assertEquals(4, result);
	}
}
