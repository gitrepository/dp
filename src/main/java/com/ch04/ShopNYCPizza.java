package com.ch04;

public class ShopNYCPizza extends AShopPizza {

	public APizza factoryMethodCreatePizza(String type){
		APizza pizza = null;

		if(type.equals("Cheese")){
			pizza = new PizzaNYCCheese();
		} else if(type.equals("Clam")){
			pizza = new PizzaNYCClam();
		} else if(type.equals("Pepperoni")){
			pizza = new PizzaNYCPepperoni();
		}
		return pizza;
	}
}
