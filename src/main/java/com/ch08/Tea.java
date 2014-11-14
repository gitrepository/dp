package com.ch08;

public class Tea {
	void prepareRecipe(){
		boilWater();
		steepTeaBag();
		pourIntoCup();
		addLemon();
	}

	public void boilWater(){
		System.out.println("Boiling Water");
	}

	public void steepTeaBag(){
		System.out.println("Steeping tea bag");
	}

	public void pourIntoCup(){
		System.out.println("Pouring into cup");
	}

	public void addLemon(){
		System.out.println("Adding Lemon");
	}
}
