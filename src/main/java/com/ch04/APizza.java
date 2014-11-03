package com.ch04;

import com.ch04.sub.ICheese;
import com.ch04.sub.IClams;
import com.ch04.sub.IDough;
import com.ch04.sub.ISauce;

public abstract class APizza {
	private String name;
	private IDough dough;
	private ISauce sauce;
	private ICheese cheese;
	private IClams clams;

	public abstract void prepare();

	public void bake(){
		System.out.println(name+" - Baking for 25 min st 350 F");
	}
	public void cut(){
		System.out.println(name+" - Cutting pizza into 8 diagonal slices");
	}
	public void box(){
		System.out.println(name+" - Packing pizza into the box");
	}


















	/*
	 * G&S
	 */
	public String getName() {
		return name;
	}

	public IDough getDough() {
		return dough;
	}

	public void setDough(IDough dough) {
		this.dough = dough;
	}

	public ISauce getSauce() {
		return sauce;
	}

	public void setSauce(ISauce sauce) {
		this.sauce = sauce;
	}

	public ICheese getCheese() {
		return cheese;
	}

	public void setCheese(ICheese cheese) {
		this.cheese = cheese;
	}

	public IClams getClams() {
		return clams;
	}

	public void setClams(IClams clams) {
		this.clams = clams;
	}

	public void setName(String name) {
		this.name = name;
	}
}
