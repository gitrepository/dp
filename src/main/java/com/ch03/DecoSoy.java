package com.ch03;

public class DecoSoy extends ACondimentDecorator {

	private ABeverageComponent comp;

	public DecoSoy(ABeverageComponent comp) {
		this.comp = comp;
	}

	@Override
	public String getDesc() {
		return comp.getDesc() + ", Soy";
	}

	@Override
	public double cost() {
		return comp.cost() + 0.15;
	}

}
