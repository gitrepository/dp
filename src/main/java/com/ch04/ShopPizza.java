package com.ch04;

public class ShopPizza {
	private Pizza pizza;

	public Pizza orderPizza(String type){

		if(type.equals("Cheese")){
			pizza = new PizzaCheese();
		} else if(type.equals("Clam")){
			pizza = new PizzaClam();
		} else if(type.equals("Pepperoni")){
			pizza = new PizzaPepperoni();
		}

		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
