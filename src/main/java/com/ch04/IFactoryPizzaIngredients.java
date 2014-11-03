package com.ch04;

import com.ch04.sub.ICheese;
import com.ch04.sub.IClams;
import com.ch04.sub.IDough;
import com.ch04.sub.ISauce;

public interface IFactoryPizzaIngredients {
	public IDough createDough();
	public ISauce createSauce();
	public ICheese createCheese();
	public IClams createClams();
}
