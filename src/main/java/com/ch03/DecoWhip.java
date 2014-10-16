package com.ch03;

public class DecoWhip extends ACondimentDecorator {

	private ABeverageComponent comp;

	public DecoWhip(ABeverageComponent comp) {
		this.comp = comp;
	}

	@Override
	public String getDesc() {
		return comp.getDesc() + ", Whip";
	}

	@Override
	public double cost() {
		return comp.cost() + 0.10;
	}

}
