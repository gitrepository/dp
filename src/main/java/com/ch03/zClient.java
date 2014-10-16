package com.ch03;

public class zClient {

	public static void main(String[] args) {
		ABeverageComponent beverageComponent = new CompHouseBlend();
		System.out.println("Plain "+beverageComponent.getDesc() + " $: "+ beverageComponent.cost());

		beverageComponent = new  DecoSteamedMilk(beverageComponent);
		beverageComponent = new  DecoMocha(beverageComponent);
		beverageComponent = new  DecoMocha(beverageComponent);
		beverageComponent = new  DecoSoy(beverageComponent);
		beverageComponent = new  DecoWhip(beverageComponent);
		System.out.println(beverageComponent.getDesc() + " $: "+ beverageComponent.cost());

		beverageComponent = new CompDarkRoast();
		System.out.println("Plain "+beverageComponent.getDesc() + " $: "+ beverageComponent.cost());

		beverageComponent = new  DecoMocha(beverageComponent);
		System.out.println(beverageComponent.getDesc() + " $: "+ beverageComponent.cost());

	}
}
