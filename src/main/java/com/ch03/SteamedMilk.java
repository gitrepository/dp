package com.ch03;

public class SteamedMilk extends ACondimentDecorator {

	private ABeverage beverage;

	public SteamedMilk(ABeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.10;
	}

}
