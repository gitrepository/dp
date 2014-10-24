package com.ch04;

public class FactorySimplePizza {

	public Pizza createPizza(String type){
		Pizza pizza = null;

		if(type.equals("Cheese")){
			pizza = new PizzaCheese();
		} else if(type.equals("Clam")){
			pizza = new PizzaClam();
		} else if(type.equals("Pepperoni")){
			pizza = new PizzaPepperoni();
		}
		return pizza;
	}
}
