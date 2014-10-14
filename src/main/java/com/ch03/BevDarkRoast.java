package com.ch03;

public class BevDarkRoast extends ABeverage {

	public BevDarkRoast() {
		this.setDesc("Dark Roast");
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
