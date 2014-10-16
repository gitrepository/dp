package com.ch03;

public class DecoSteamedMilk extends ACondimentDecorator {

	private ABeverageComponent comp;

	public DecoSteamedMilk(ABeverageComponent comp) {
		this.comp = comp;
	}

	@Override
	public String getDesc() {
		return comp.getDesc() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		return comp.cost() + 0.10;
	}

}
