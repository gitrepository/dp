package com.ch03;

public class Whip extends ACondimentDecorator {

	private ABeverage beverage;

	public Whip(ABeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.10;
	}

}
