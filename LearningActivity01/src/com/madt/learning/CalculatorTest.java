package com.madt.learning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		
		assertEquals(c.Add(5, 2),7,0.0);
		
		assertNotEquals(c.Substract(4, 2), 7);
		
	}
	
	@Test
	public void testMultiply() {
		Calculator c1 = new Calculator();
		double result = Math.round(c1.Multipy(2.2, 2.2)*100);
		
		assertEquals(result/100, 4.84,0.0);
		
		assertNotEquals(c1.Multipy(2.2, 2.2), 6,0.0);

	}

}
