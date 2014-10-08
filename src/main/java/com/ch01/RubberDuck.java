package com.ch01;

public class RubberDuck extends Duck {

	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squeak());
	}

	@Override
	public void display() {
		System.out.println("I am a Rubber Duck");
	}

}
