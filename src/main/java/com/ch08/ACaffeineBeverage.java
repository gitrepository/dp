package com.ch08;

public abstract class ACaffeineBeverage {
	final void prepareRecipe(){
		boilWater();
		brew();
		pourIntoCup();
		addCondiments();
	}

	public final void boilWater(){
		System.out.println("Boiling Water");
	}

	public abstract void brew();

	public final void pourIntoCup(){
		System.out.println("Pouring into cup");
	}

	public abstract void addCondiments();
}
