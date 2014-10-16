package com.ch03;

public class DecoMocha extends ACondimentDecorator {

	private ABeverageComponent comp;

	public DecoMocha(ABeverageComponent comp) {
		this.comp = comp;
	}

	@Override
	public String getDesc() {
		return comp.getDesc() + ", Mocha";
	}

	@Override
	public double cost() {
		return comp.cost() + 0.20;
	}

}
