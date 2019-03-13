package com.supermarket.pricing.enums;

public enum MassUnit {
	POUND , ONCE, KG;
	
	private Float valueOnOnce;
	
	static {
		POUND.valueOnOnce = 16f;
		ONCE.valueOnOnce = 1f;
		KG.valueOnOnce = 35.27f;
    }
	
	public Float getOnceCoefficient() {
        return valueOnOnce;
    }
}
