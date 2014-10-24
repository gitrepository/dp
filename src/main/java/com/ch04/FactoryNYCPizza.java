package com.ch04;

public class FactoryNYCPizza {

	public Pizza createPizza(String type){
		Pizza pizza = null;

		if(type.equals("Cheese")){
			pizza = new PizzaCheese("NYC");
		} else if(type.equals("Clam")){
			pizza = new PizzaClam("NYC");
		} else if(type.equals("Pepperoni")){
			pizza = new PizzaPepperoni("NYC");
		}
		return pizza;
	}
}
