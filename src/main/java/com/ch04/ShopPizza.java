package com.ch04;

public class ShopPizza {
	private Pizza pizza;
	private FactoryPizza factory;

	public Pizza orderPizza(String type){
		pizza = factory.createPizza("Cheese");

		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
