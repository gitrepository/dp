package com.ch04;

import com.ch04.sub.CheeseReggiano;
import com.ch04.sub.ClamsFresh;
import com.ch04.sub.DoughThinCrust;
import com.ch04.sub.ICheese;
import com.ch04.sub.IClams;
import com.ch04.sub.IDough;
import com.ch04.sub.ISauce;
import com.ch04.sub.SauceMarinara;


public class FactoryNYCPizzaIngredients implements IFactoryPizzaIngredients {
	public IDough createDough() {
		return new DoughThinCrust();
	}
	public ISauce createSauce(){
		return new SauceMarinara();
	}
	public ICheese createCheese(){
		return new CheeseReggiano();
	}
	public IClams createClams(){
		return new ClamsFresh();
	}
}
