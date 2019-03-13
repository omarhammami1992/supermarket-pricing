package com.supermarket.pricing;

import static org.junit.Assert.*;

import org.junit.Test;

public class PromotionalProductByGettingFreeOneTest {

	@Test
	public void testCaseWithoutDiscountWithQuantityEqualToPromotionalQuantity() {
		Product product = new PromotionalProductByGettingFreeOne("Product ZZZ", 0.5f, 4, 1, 4);
		Float cost = product.computeCost();
		assertEquals("1 for 0.5$ && by 4 get 1 free ===> 4 for 2$ ", 2f, cost, 0f); 
	}
	
	@Test
	public void testCaseWithoutDiscountWithQuantityLessThanPromotionalQuantity() {
		Product product = new PromotionalProductByGettingFreeOne("Priduct ZZZ", 0.5f,5, 2, 3);
		Float cost = product.computeCost();
		assertEquals("1 for 0.5$ && by 5 get 2 free ===> 3 for 1.5$ ", 1.5f, cost, 0f); 
	}
	
	@Test
	public void testCaseQuantityEqualToPromotionalAndFreeQuantity() {
		Product product = new PromotionalProductByGettingFreeOne("Priduct ZZZ", 0.5f, 4, 1, 5);
		Float cost = product.computeCost();
		assertEquals("1 for 0.5$ && by 4 get 1 free ===> 5 for 0.5$ ", 2f, cost, 0f); 
	}
	
	@Test
	public void testCaseQuantityGreaterThanPromotionalAndFreeQuantity1() {
		Product product = new PromotionalProductByGettingFreeOne("Priduct ZZZ", 0.5f, 5, 2, 10);
		Float cost = product.computeCost();
		assertEquals("1 for 0.5$ && by 4 get 1 free ===> 10 for 4$ ", 4f, cost, 0f); 
	}
	
	@Test
	public void testCaseQuantityGreaterThanPromotionalAndFreeQuantity2() {
		Product product = new PromotionalProductByGettingFreeOne("Priduct ZZZ", 0.5f, 5, 2, 14);
		Float cost = product.computeCost();
		assertEquals("1 for 0.5$ && by 4 get 1 free ===> 14 for 5$ ", 5f, cost, 0f); 
	}
	
	@Test
	public void testCaseQuantityGreaterThanPromotionalAndFreeQuantity3() {
		Product product = new PromotionalProductByGettingFreeOne("Priduct ZZZ", 0.5f, 5, 2, 13);
		Float cost = product.computeCost();
		assertEquals("1 for 0.5$ && by 4 get 1 free ===> 13 for 5$ ", 5f, cost, 0f); 
	}
}
