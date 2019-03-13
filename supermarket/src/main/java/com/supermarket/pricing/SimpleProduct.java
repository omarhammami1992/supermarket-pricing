package com.supermarket.pricing;

import com.supermarket.pricing.util.SuperMarketUtils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleProduct implements Product{

	private String name;
	
	private Float price;
	
	private Integer quantity;
	
	private Integer number;
	
	/**
	 * Constructor of a one product having a price
	 * @param name : product name
	 * @param price : unit price
	 * @param quantity : purchased quantity
	 */
	public SimpleProduct(String name, Float price, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity =  quantity;
		this.number = 1;
	}
	
	/**
	 * Constructor of a number of product having a price
	 * @param name : product name
	 * @param number : 
	 * @param price : price of number of product
	 * @param quantity : purchased quantity
	 */
	public SimpleProduct(String name, Integer number, Float price, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.number = number;
	}
	
	@Override
	public Float computeCost() {
		Float result = (this.quantity * (this.price / this.number));
		return SuperMarketUtils.formateCost(result);
	}

}
