package com.ch04;

public class ShopPizza {
	private FactorySimplePizza simpleFactoryPizza;

	public Pizza orderPizza(String type){
		Pizza pizza = simpleFactoryPizza.createPizza(type);

		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	public ShopPizza(FactorySimplePizza simpleFactoryPizza) {
		this.simpleFactoryPizza = simpleFactoryPizza;
	}
}
