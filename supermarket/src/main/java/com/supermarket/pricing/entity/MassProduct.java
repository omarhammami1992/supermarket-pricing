package com.supermarket.pricing.entity;

import com.supermarket.pricing.enums.MassUnit;
import com.supermarket.pricing.util.SuperMarketUtils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MassProduct implements Product{
	
	private String name;
	
	private MassUnit unit;

	private Float unitPrice;
	
	private Integer purchasedQuantity;
	
	private MassUnit purchasedUnit;
	
	public MassProduct(String name, MassUnit unit, Float unitPrice, Integer purchasedQuantity, MassUnit purchasedUnit) {
		this.name = name;
		this.unit = unit;
		this.unitPrice = unitPrice;
		this.purchasedQuantity = purchasedQuantity;
		this.purchasedUnit = purchasedUnit;
	}
	
	
	@Override
	public Float computeCost() {
		if (this.unit == this.purchasedUnit) {
			return this.purchasedQuantity * this.unitPrice;
		}
		Float priceOfOnce = this.unitPrice / this.unit.getOnceCoefficient();
		Float purchasedQuantityOnOnce = this.purchasedQuantity * this.purchasedUnit.getOnceCoefficient() ;
		return SuperMarketUtils.formateCost(priceOfOnce * purchasedQuantityOnOnce);
	}
	
	
}
