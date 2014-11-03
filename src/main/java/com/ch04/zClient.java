package com.ch04;

public class zClient {

	public static void main(String[] args) {
		AStorePizza store = null;

		System.out.println("### - ###");
		//Order NYC Cheese Pizza
		store = new StoreNYCPizza();
		store.orderPizza("Cheese");

		System.out.println("### - ###");
		//Order Chicago Cheese Pizza
		store = new StoreChicagoPizza();
		store.orderPizza("Cheese");

		//If a new Franchise is opened, this client code is not effected as
		//we are coding to an interface/abstraction and not to a concrete class

		//Order LA Cheese Pizza
		//store = new StoreChicagoPizza();
		//store.orderPizza("Cheese");
	}
}
