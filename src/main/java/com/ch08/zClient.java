package com.ch08;

public class zClient {
	public static void main(String[] args) {
		ACaffeineBeverage tea = new Tea();
		ACaffeineBeverage coffee = new Coffee();
		System.out.println();
		tea.prepareRecipe();
		System.out.println();
		coffee.prepareRecipe();
		System.out.println();
		tea.setNeedCondiments(false);
		tea.prepareRecipe();
	}
}
