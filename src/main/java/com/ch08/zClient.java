package com.ch08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

		//Template Method real world example
		List<Duck> list = new ArrayList<Duck>();
		list.add(new Duck("D", 10));
		list.add(new Duck("B", 30));
		list.add(new Duck("E", 56));
		list.add(new Duck("C", 2));
		list.add(new Duck("A", 100));
		print(list);

		Collections.sort(list);
		print(list);
	}

	private static void print(List<Duck> list){
		for(Duck duck : list){
			System.out.println(duck.getName()+" * "+duck.getWeight());
		}
		System.out.println();
	}
}
