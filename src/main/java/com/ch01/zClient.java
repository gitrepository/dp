package com.ch01;

public class zClient {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();

		duck = new RubberDuck();
		//Default algorithm (behavior) FlyNoWay().
		duck.performFly();
		duck.performQuack();
		//Dynamically change the algorithm (behavior) to FlyRocketPowered().
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();

	}
}
