package com.ch03;

public class zClient {

	public static void main(String[] args) {
		ABeverage bev = new BevHouseBlend();
		System.out.println("Plain "+bev.getDesc() + " $: "+ bev.cost());

		bev = new  SteamedMilk(bev);
		bev = new  Mocha(bev);
		bev = new  Mocha(bev);
		bev = new  Soy(bev);
		bev = new  Whip(bev);
		System.out.println(bev.getDesc() + " $: "+ bev.cost());
	}
}
