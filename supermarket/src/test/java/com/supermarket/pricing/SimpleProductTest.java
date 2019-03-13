package com.supermarket.pricing;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleProductTest {

	@Test
	public void testCaseOneProductWithOnePrice() {
		Product product = new SimpleProduct("Produit XXX", 0.65f, 2);
		Float cost = product.computeCost();
		assertEquals("1 for 0.65$ ===> 2 for 1.3$ ", 1.3f, cost, 0f);
	}
	
	@Test
	public void testCaseManyProductsWithPriceCaseOfQuantityMultipleOfNumber() {
		Product product = new SimpleProduct("Product XXX",3, 1f, 6); 
		Float cost = product.computeCost();
		assertEquals("3 for 1$ ===> 6 for 2$ ", 2f, cost, 0f);
	}
	
	@Test
	public void testCaseManyProductsWithPriceCaseOfQuantityNotMultipleOfNumber() {
		Product product = new SimpleProduct("Product XXX",3, 1f, 4); 
		Float cost = product.computeCost();
		assertEquals("3 for 1$ ===> 4 for 1.34$ ", 1.34f, cost, 0f);
	}
}
