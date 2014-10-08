package com.ch01;

public class ReadHeadDuck extends Duck {

	public ReadHeadDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
		System.out.println("I am a Read Head Duck");
	}

}
