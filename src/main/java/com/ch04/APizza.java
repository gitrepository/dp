package com.ch04;

import java.util.ArrayList;
import java.util.List;

public abstract class APizza {
	private String name;
	private String dough;
	private String crust;
	private List<String> toppings = new ArrayList<String>();

	public void prepare(){
		System.out.println("Preparing "+name);
		for(String topping : toppings){
			System.out.println("	Toppings "+topping);
		}
	}
	public void bake(){
		System.out.println("Baking "+name);
	}
	public void cut(){
		System.out.println("Cutting "+name);
	}
	public void box(){
		System.out.println("Packing "+name);
	}

	public APizza() {}
	public APizza(String name) {
		this.name = name;
	}

	/*
	 * G&S
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDough() {
		return dough;
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	public String getCrust() {
		return crust;
	}
	public void setCrust(String crust) {
		this.crust = crust;
	}
	public List<String> getToppings() {
		return toppings;
	}
	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}
}
