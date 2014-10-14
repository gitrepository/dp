package com.ch03;

public class Soy extends ACondimentDecorator {

	private ABeverage beverage;

	public Soy(ABeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc() + ", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.15;
	}

}
