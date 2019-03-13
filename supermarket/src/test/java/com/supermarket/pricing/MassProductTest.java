package com.supermarket.pricing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.supermarket.pricing.enums.MassUnit;

public class MassProductTest {

	@Test
	public void testCaseSameUnit() {
		Product product = new MassProduct("Orange", MassUnit.POUND, 1.99f, 2, MassUnit.POUND);
		Float cost = product.computeCost();
		assertEquals("1 pound for 1.99$ ===> 2 for 3.98$ ", 3.98f, cost, 0f); 
	}
	
	@Test
	public void testCaseDifferentUnit() {
		Product product = new MassProduct("Orange", MassUnit.POUND, 1.99f, 4, MassUnit.ONCE);
		Float cost = product.computeCost();
		assertEquals("1 pound for 1.99$ ===> 4 onces for 0.5$ ", 0.5f, cost, 0f); 
	}
	
	@Test
	public void testCaseDifferentUnit2() {
		Product product = new MassProduct("Orange", MassUnit.ONCE, 1f, 16, MassUnit.ONCE);
		Float cost = product.computeCost();
		assertEquals("1 pound for 1.99$ ===> 4 onces for 0.5$ ", 16f, cost, 0f); 
	}
}
