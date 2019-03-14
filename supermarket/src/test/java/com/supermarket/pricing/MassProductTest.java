package com.supermarket.pricing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.supermarket.pricing.entity.MassProduct;
import com.supermarket.pricing.entity.Product;
import com.supermarket.pricing.enums.MassUnit;

public class MassProductTest {

	@Test
	public void testCaseSameUnit() {
		// Given
		Product product = new MassProduct("Orange", MassUnit.POUND, 1.99f, 2, MassUnit.POUND);
		// When
		Float cost = product.computeCost();
		// Then
		assertEquals("1 pound for 1.99$ ===> 2 for 3.98$ ", 3.98f, cost, 0f); 
	}
	
	@Test
	public void testCaseDifferentUnit() {
		// Given
		Product product = new MassProduct("Orange", MassUnit.POUND, 1.99f, 4, MassUnit.ONCE);
		// When
		Float cost = product.computeCost();
		// Then
		assertEquals("1 pound for 1.99$ ===> 4 onces for 0.5$ ", 0.5f, cost, 0f); 
	}
	
	@Test
	public void testCaseDifferentUnit2() {
		// Given
		Product product = new MassProduct("Orange", MassUnit.ONCE, 1f, 16, MassUnit.ONCE);
		// When
		Float cost = product.computeCost();
		// Then
		assertEquals("1 pound for 1.99$ ===> 4 onces for 0.5$ ", 16f, cost, 0f); 
	}
}
