package com.ch03;

public class CompDarkRoast extends ABeverageComponent {

	public CompDarkRoast() {
		this.setDesc("Dark Roast");
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
