package com.ch01;

public abstract class Duck {
	public IFlyBehavior flyBehavior;
	public IQuackBehavior quackBehavior;

	public abstract void display();
	public void swim(){
		System.out.println("I can swim");
	}
	public void performFly(){
		flyBehavior.fly();
	}
	public void performQuack(){
		quackBehavior.quack();
	}

	/*
	 * G&S
	 */
	public IFlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public IQuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	public void setQuackBehavior(IQuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
