package com.ch08;

public class Duck implements Comparable {
	private String name;
	private int weight;

	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Object o) {
		Duck otherDuck = (Duck) o;
		if(this.weight < otherDuck.weight)
			return -1;
		else if(this.weight == otherDuck.weight)
			return 0;
		else
			return 1;
	}
	
	/*
	 * G&S
	 */
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
}
