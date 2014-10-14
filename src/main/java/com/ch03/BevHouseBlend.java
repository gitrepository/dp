package com.ch03;

public class BevHouseBlend extends ABeverage {

	public BevHouseBlend() {
		this.setDesc("House Blend Coffee");
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
