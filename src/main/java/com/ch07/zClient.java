package com.ch07;


public class zClient {

	public static void main(String[] args) {
		IDuck duck = new DuckMallard();
		IDuck turkeyDuck = new AdapterTurkey(new TurkeyWild());

		System.out.println("Real Duck");
		duck.quack();
		duck.fly();
		System.out.println();
		System.out.println("Duck thru Turkey Adaptor");
		turkeyDuck.quack();
		turkeyDuck.fly();
	}
}
