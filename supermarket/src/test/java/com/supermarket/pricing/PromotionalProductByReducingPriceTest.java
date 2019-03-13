package com.supermarket.pricing;

import static org.junit.Assert.*;

import org.junit.Test;

public class PromotionalProductByReducingPriceTest {

	@Test
	public void testCaseQuantityMultipleOfPromotionalQuantity() {
		Product product = new PromotionalProductByReducingPrice("Product YYY", 0.5f, 3, 1f, 6);
		Float cost = product.computeCost();
		assertEquals("3 for 1$ && 1 for 0.5$ ===> 6 for 2 ", 2f, cost, 0f);
	}
	
	@Test
	public void testCaseQuantityNotMultipleOfPromotionalQuantity() {
		Product product = new PromotionalProductByReducingPrice("Product YYY", 0.5f, 3, 1f, 4);
		Float cost = product.computeCost();
		assertEquals("3 for 1$ && 1 for 0.5$ ===> 4 for 1.5$ ", 1.5f, cost, 0f);
	}
	
	@Test
	public void testCaseWithoutDiscount() {
		Product product = new PromotionalProductByReducingPrice("Product YYY", 0.5f, 3, 1f, 1);
		Float cost = product.computeCost();
		assertEquals("3 for 1$ && 1 for 0.5$ ===> 1 for 0.5$ ", 0.5f, cost, 0f);
	}
}
