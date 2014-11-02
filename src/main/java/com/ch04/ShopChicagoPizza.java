package com.ch04;

public class ShopChicagoPizza extends AShopPizza{

	public APizza factoryMethodCreatePizza(String type){
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
