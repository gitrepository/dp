package com.ch05;

public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {}

	public Singleton getInstance(){
		if(uniqueInstance == null){
			synchronized (Singleton.class) {
				if(uniqueInstance == null){
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
