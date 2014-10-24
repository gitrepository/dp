package com.ch04;

public class FactoryChicagoPizza {

	public Pizza createPizza(String type){
		Pizza pizza = null;

		if(type.equals("Cheese")){
			pizza = new PizzaCheese("Chicago");
		} else if(type.equals("Clam")){
			pizza = new PizzaClam("Chicago");
		} else if(type.equals("Pepperoni")){
			pizza = new PizzaPepperoni("Chicago");
		}
		return pizza;
	}
}
