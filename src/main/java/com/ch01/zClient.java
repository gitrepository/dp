package com.ch01;

public class zClient {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();

		duck = new RubberDuck();
		duck.performFly();
		duck.performQuack();
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();

	}
}
