package com.ch03;

public class CompHouseBlend extends ABeverageComponent {

	public CompHouseBlend() {
		this.setDesc("House Blend Coffee");
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
