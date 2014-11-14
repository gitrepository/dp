package com.ch08;

public class Tea extends ACaffeineBeverage {
	@Override
	public void brew() {
		System.out.println("Steeping tea bag");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}
