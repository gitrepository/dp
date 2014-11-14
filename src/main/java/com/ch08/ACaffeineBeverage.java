package com.ch08;

public abstract class ACaffeineBeverage {
	private boolean needCondiments = true;

	final void prepareRecipe(){
		boilWater();
		brew();
		pourIntoCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}

	public abstract void brew();
	public abstract void addCondiments();

	public final void boilWater(){
		System.out.println("Boiling Water");
	}

	public final void pourIntoCup(){
		System.out.println("Pouring into cup");
	}

	//Hook - not a final method
	//sub class may override if needed.
	public boolean customerWantsCondiments(){
		return true;
	}

	/*
	 * G&S
	 */
	public boolean isNeedCondiments() {
		return needCondiments;
	}
	public void setNeedCondiments(boolean needCondiments) {
		this.needCondiments = needCondiments;
	}
}
