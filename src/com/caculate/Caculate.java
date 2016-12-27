package com.caculate;

import java.math.BigDecimal;

public class Caculate {

	public String partyFeeCaulate(String str) {
		// TODO Auto-generated method stub
		String regex = "\\d+.?\\d{2}";
		String partyfee = " ‰»Î∑«∑®";
		if(!str.matches(regex)){
			return partyfee;
		}
		double income = Double.parseDouble(str);
		double repartyfee = 0;
		if (income < 0){
			return partyfee;
		} else {
			if (income <= 3000) {
				repartyfee = income * (0.005);
			} else {
				if (income <= 5000) {
					repartyfee = income * (0.01);
				} else {
					if (income <= 10000) {
						repartyfee = income * (0.015);
					} else {
						repartyfee = income * (0.02);
					}
				}
			}
		}
		BigDecimal b = new BigDecimal(repartyfee);
		double f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		partyfee = Double.toString(f1);
		return partyfee;
	}
}
