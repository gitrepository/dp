package com.ch04;

public class PizzaChicagoClam extends APizza {

	public PizzaChicagoClam() {
		setName("Chicago Clam Pizza");
		getToppings().add("Chicago Cheese");
	}

	public void cut(){
		System.out.println("Cutting Chicago Style "+getName());
	}
}
