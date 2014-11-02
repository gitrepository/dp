package com.ch04;

public class zClient {

	public static void main(String[] args) {
		AShopPizza factory = null;

		//Order NYC Cheese Pizza
		factory = new ShopNYCPizza();
		factory.orderPizza("Cheese");

		//Order Chicago Pepperoni
		factory = new ShopChicagoPizza();
		factory.orderPizza("Pepperoni");

		//If a new Franchise is opened, this client code is not effected as
		//we are coding to an interface/abstraction and not to a concrete class

		//Order LA Veggie
		//factory = new FactoryLAPizza();
		//factory.orderPizza("veggie");
	}
}
