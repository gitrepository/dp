package com.ch08;

public class Coffee extends ACaffeineBeverage {
	@Override
	public void brew() {
		System.out.println("Brewing Coffee grinds");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
}
