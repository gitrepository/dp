package com.ch04;

public class ShopPizza {
	private FactoryNYCPizza nycPizzaFactory;
	private FactoryChicagoPizza chicagoPizzaFactory;

	public Pizza orderNycPizza(String type){
		Pizza pizza = nycPizzaFactory.createPizza(type);

		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	public Pizza orderChicagoPizza(String type){
		Pizza pizza = chicagoPizzaFactory.createPizza(type);

		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	public ShopPizza(FactoryNYCPizza nycPizzaFactory) {
		this.nycPizzaFactory = nycPizzaFactory;
	}

	public ShopPizza(FactoryChicagoPizza chicagoPizzaFactory) {
		this.chicagoPizzaFactory = chicagoPizzaFactory;
	}
}
