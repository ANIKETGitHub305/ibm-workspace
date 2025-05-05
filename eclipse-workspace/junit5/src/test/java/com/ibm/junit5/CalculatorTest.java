package com.ibm.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void test() {
		int except =6;
		Calculator calculator = new Calculator();
		int actual = calculator.sum(4, 2);
		assertEquals(except, actual);
		//fail("Not yet implemented");
	}

}
