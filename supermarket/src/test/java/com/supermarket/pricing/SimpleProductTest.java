package com.supermarket.pricing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.supermarket.pricing.entity.Product;
import com.supermarket.pricing.entity.SimpleProduct;

public class SimpleProductTest {

	@Test
	public void testCaseOneProductWithOnePrice() {
	    // Given
		Product product = new SimpleProduct("Produit XXX", 0.65f, 2);
	    // When
		Float cost = product.computeCost();
	    // Then
		assertEquals("1 for 0.65$ ===> 2 for 1.3$ ", 1.3f, cost, 0f);
	}
	
	@Test
	public void testCaseManyProductsWithPriceCaseOfQuantityMultipleOfNumber() {
		// Given
		Product product = new SimpleProduct("Product XXX",3, 1f, 6); 
		// When
		Float cost = product.computeCost();
		// Then
		assertEquals("3 for 1$ ===> 6 for 2$ ", 2f, cost, 0f);
	}
	
	@Test
	public void testCaseManyProductsWithPriceCaseOfQuantityNotMultipleOfNumber() {
		// Given
		Product product = new SimpleProduct("Product XXX",3, 1f, 4);
		// When
		Float cost = product.computeCost();
		// Then
		assertEquals("3 for 1$ ===> 4 for 1.34$ ", 1.34f, cost, 0f);
	}
}
