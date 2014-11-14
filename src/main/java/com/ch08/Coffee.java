package com.ch08;

public class Coffee {
	void prepareRecipe(){
		boilWater();
		brewCoffeeGrings();
		pourIntoCup();
		addSugarAndMilk();
	}

	public void boilWater(){
		System.out.println("Boiling Water");
	}

	public void brewCoffeeGrings(){
		System.out.println("Brewing Coffee grinds");
	}

	public void pourIntoCup(){
		System.out.println("Pouring into cup");
	}

	public void addSugarAndMilk(){
		System.out.println("Adding Sugar and Milk");
	}
}
