package com.ch04;

import com.ch04.sub.CheeseMozzarella;
import com.ch04.sub.ClamsFrozen;
import com.ch04.sub.DoughThickCrust;
import com.ch04.sub.ICheese;
import com.ch04.sub.IClams;
import com.ch04.sub.IDough;
import com.ch04.sub.ISauce;
import com.ch04.sub.SaucePlumTomato;


public class FactoryChicagoPizzaIngredients implements IFactoryPizzaIngredients {
	public IDough createDough() {
		return new DoughThickCrust();
	}
	public ISauce createSauce(){
		return new SaucePlumTomato();
	}
	public ICheese createCheese(){
		return new CheeseMozzarella();
	}
	public IClams createClams(){
		return new ClamsFrozen();
	}
}
