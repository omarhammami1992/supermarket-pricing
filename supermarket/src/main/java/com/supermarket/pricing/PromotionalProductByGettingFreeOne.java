package com.supermarket.pricing;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromotionalProductByGettingFreeOne extends PromotionalProduct{

	private Integer freeQuantity;
	
	public PromotionalProductByGettingFreeOne(String name,Float unitPrice, Integer promotionalQuantity, Integer freeQuantity, Integer quantity) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.promotionalQuantity = promotionalQuantity;
		this.freeQuantity = freeQuantity;
		this.quantity = quantity;
	}

	@Override
	public Float computeCost() {
		if (this.quantity <= this.promotionalQuantity) {
			return this.quantity * this.unitPrice;
		} else {
			Integer total = this.quantity;
			Float cost = 0f;
			while (total > 0 ) {
				if (total >= this.promotionalQuantity) {			
					total = total - this.promotionalQuantity;
					cost = cost + (this.promotionalQuantity * this.unitPrice) ;
					total = (total >= this.freeQuantity ? total = total - this.freeQuantity : 0 );
				} else {
					cost = cost + (this.getUnitPrice() * total);
					total = 0;
				}
			}
			return cost;
		}
	}

}
