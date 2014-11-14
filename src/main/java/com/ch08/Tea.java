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

	//Hook - not a final method
	//sub class may override if needed.
	public boolean customerWantsCondiments(){
		return isNeedCondiments();
	}
}
