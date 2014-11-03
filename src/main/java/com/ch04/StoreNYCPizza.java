package com.ch04;

public class StoreNYCPizza extends AStorePizza {

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
		IFactoryPizzaIngredients  factoryPizzaIngredients = new FactoryNYCPizzaIngredients();

		if(type.equals("clams")){
			pizza = new PizzaClams(factoryPizzaIngredients);
			pizza.setName("NYC Clams Pizza");
		} else {
			pizza = new PizzaCheese(factoryPizzaIngredients);
			pizza.setName("NYC Cheese Pizza");
		}
		pizza.prepare();
		return pizza;
	}
}