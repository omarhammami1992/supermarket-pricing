package com.supermarket.pricing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.supermarket.pricing.entity.Product;
import com.supermarket.pricing.entity.PromotionalProductByGettingFreeOne;

public class PromotionalProductByGettingFreeOneTest {

	@Test
	public void testCaseWithoutDiscountWithQuantityEqualToPromotionalQuantity() {
		// Given
		Product product = new PromotionalProductByGettingFreeOne("Product ZZZ", 0.5f, 4, 1, 4);
		// When
		Float cost = product.computeCost();
		// Then
		assertEquals("1 for 0.5$ && by 4 get 1 free ===> 4 for 2$ ", 2f, cost, 0f); 
	}
	
	@Test
	public void testCaseWithoutDiscountWithQuantityLessThanPromotionalQuantity() {
		// Given
		Product product = new PromotionalProductByGettingFreeOne("Priduct ZZZ", 0.5f,5, 2, 3);
		// When
		Float cost = product.computeCost();
		// Then
		assertEquals("1 for 0.5$ && by 5 get 2 free ===> 3 for 1.5$ ", 1.5f, cost, 0f); 
	}
	
	@Test
	public void testCaseQuantityEqualToPromotionalAndFreeQuantity() {
		// Given
		Product product = new PromotionalProductByGettingFreeOne("Priduct ZZZ", 0.5f, 4, 1, 5);
		// When
		Float cost = product.computeCost();
		// Then
		assertEquals("1 for 0.5$ && by 4 get 1 free ===> 5 for 0.5$ ", 2f, cost, 0f); 
	}
	
	@Test
	public void testCaseQuantityGreaterThanPromotionalAndFreeQuantity1() {
		// Given
		Product product = new PromotionalProductByGettingFreeOne("Priduct ZZZ", 0.5f, 5, 2, 10);
		// When
		Float cost = product.computeCost();
		// Then
		assertEquals("1 for 0.5$ && by 4 get 1 free ===> 10 for 4$ ", 4f, cost, 0f); 
	}
	
	@Test
	public void testCaseQuantityGreaterThanPromotionalAndFreeQuantity2() {
		// Given
		Product product = new PromotionalProductByGettingFreeOne("Priduct ZZZ", 0.5f, 5, 2, 14);
		// When
		Float cost = product.computeCost();
		// Then
		assertEquals("1 for 0.5$ && by 4 get 1 free ===> 14 for 5$ ", 5f, cost, 0f); 
	}
	
	@Test
	public void testCaseQuantityGreaterThanPromotionalAndFreeQuantity3() {
		// Given
		Product product = new PromotionalProductByGettingFreeOne("Priduct ZZZ", 0.5f, 5, 2, 13);
		// When
		Float cost = product.computeCost();
		// Then
		assertEquals("1 for 0.5$ && by 4 get 1 free ===> 13 for 5$ ", 5f, cost, 0f); 
	}
}
