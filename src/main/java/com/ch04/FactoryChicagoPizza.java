package com.ch04;

public class FactoryChicagoPizza extends AShopPizza{

	public APizza createPizza(String type){
		APizza pizza = null;

		if(type.equals("Cheese")){
			pizza = new PizzaChicagoCheese();
		} else if(type.equals("Clam")){
			pizza = new PizzaChicagoClam();
		} else if(type.equals("Pepperoni")){
			pizza = new PizzaChicagoPepperoni();
		}
		return pizza;
	}
}
