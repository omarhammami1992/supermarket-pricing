package com.supermarket.pricing.util;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SuperMarketUtils {
	
	/**
	 * format result as cost format : 2 digits after the decimal point
	 * @param cost
	 * @return
	 */
	public static Float formateCost (Float cost) {
		DecimalFormat df = new DecimalFormat("####0.00");
        df.setRoundingMode(RoundingMode.CEILING);
		return Float.parseFloat(df.format(cost).replace(',', '.'));
	}
}
