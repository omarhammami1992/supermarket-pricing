package com.supermarket.pricing.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromotionalProductByReducingPrice extends PromotionalProduct{

	private Float promotionalPrice;
	
	public PromotionalProductByReducingPrice(String name, Float unitPrice, Integer promotionalQuantity, Float promotionalPrice, Integer quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.promotionalQuantity = promotionalQuantity;
		this.promotionalPrice = promotionalPrice;
		this.quantity = quantity;
	}

	@Override
	public Float computeCost() {
		if ((this.quantity % this.promotionalQuantity) == 0) {
			return ((this.quantity / this.promotionalQuantity) * this.promotionalPrice);
		} else {
			Integer quantityOfNonPromotionalProduct = this.quantity % this.promotionalQuantity;
			Float priceOfNonPromotionalProduct = quantityOfNonPromotionalProduct * this.unitPrice;
			Float priceOfPromotionalProduct =  ((this.quantity - quantityOfNonPromotionalProduct) / this.promotionalQuantity) * this.promotionalPrice;
			return priceOfNonPromotionalProduct + priceOfPromotionalProduct;
		}
	}
}
