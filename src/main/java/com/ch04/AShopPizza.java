package com.ch04;

public abstract class AShopPizza {

	public APizza orderPizza(String type){
		APizza pizza;

		pizza = factoryMethodCreatePizza(type);
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	public abstract APizza factoryMethodCreatePizza(String type);
}
