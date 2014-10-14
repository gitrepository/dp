package com.ch03;

public abstract class ABeverage {
	private String desc = "Unknown Beverage";

	public abstract double cost();

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
