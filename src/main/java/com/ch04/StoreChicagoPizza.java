package com.ch04;

public class StoreChicagoPizza extends AStorePizza {

	public APizza orderPizza(String type){
		APizza pizza;

		pizza = createPizza(type);
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	public APizza createPizza(String type){
		APizza pizza = null;
		IFactoryPizzaIngredients  factoryPizzaIngredients = new FactoryChicagoPizzaIngredients();

		if(type.equalsIgnoreCase("clams")){
			pizza = new PizzaClams(factoryPizzaIngredients);
			pizza.setName("Chicago Clams Pizza");
		} else {
			pizza = new PizzaCheese(factoryPizzaIngredients);
			pizza.setName("Chicago Cheese Pizza");
		}
		pizza.prepare();
		return pizza;
	}
}