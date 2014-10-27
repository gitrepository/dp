package com.ch04;

public class PizzaChicagoCheese extends APizza {

	public PizzaChicagoCheese() {
		setName("Chicago Cheese Pizza");
		getToppings().add("Chicago Cheese");
	}

	public void cut(){
		System.out.println("Cutting Chicago Style "+getName());
	}
}
