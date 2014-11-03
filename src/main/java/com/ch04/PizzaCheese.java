package com.ch04;


public class PizzaCheese extends APizza {
	private IFactoryPizzaIngredients factoryPizzaIngredients;

	public PizzaCheese(IFactoryPizzaIngredients factoryPizzaIngredients) {
		this.factoryPizzaIngredients = factoryPizzaIngredients;
	}

	public void prepare(){
		System.out.println("Preparing "+getName());
		setDough(factoryPizzaIngredients.createDough());
		setCheese(factoryPizzaIngredients.createCheese());
		setSauce(factoryPizzaIngredients.createSauce());
	}
}
