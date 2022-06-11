package com.ignite.beans;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc ;
	@Before
	public void init() {
		calc = new Calculator();
	}
	@After
	public void cleanup() {
		calc = null;
	}

	@Test
	public void testAdd() {
		int actual = calc.add(5, 8);
		int expected = 13;
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiply() {
		int actual = calc.multiply(7, 5);
		int expected = 35;
		assertEquals(expected, actual);
	}

}
