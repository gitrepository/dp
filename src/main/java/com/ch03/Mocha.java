package com.ch03;

public class Mocha extends ACondimentDecorator {

	private ABeverage beverage;

	public Mocha(ABeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}

}
