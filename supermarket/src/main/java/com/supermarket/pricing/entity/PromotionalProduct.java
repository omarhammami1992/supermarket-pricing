package com.supermarket.pricing.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PromotionalProduct implements Product {

	protected String name;
	
	protected Float unitPrice;
	
	protected Integer quantity;
	
	protected Integer promotionalQuantity;

}
