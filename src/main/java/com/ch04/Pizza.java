package com.ch04;

public class Pizza {
	private String name;
	private String dough;
	private String crust;

	public void bake(){
		System.out.println("Baking");
	}
	public void cut(){
		System.out.println("Cutting");
	}
	public void box(){
		System.out.println("Packing");
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

}