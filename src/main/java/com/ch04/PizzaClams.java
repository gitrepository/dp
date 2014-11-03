package com.ch04;


public class PizzaClams extends APizza {
	private IFactoryPizzaIngredients factoryPizzaIngredients;

	public PizzaClams(IFactoryPizzaIngredients factoryPizzaIngredients) {
		this.factoryPizzaIngredients = factoryPizzaIngredients;
	}

	public void prepare(){
		System.out.println("Preparing "+getName());
		setDough(factoryPizzaIngredients.createDough());
		setClams(factoryPizzaIngredients.createClams());
		setSauce(factoryPizzaIngredients.createSauce());
	}
}
