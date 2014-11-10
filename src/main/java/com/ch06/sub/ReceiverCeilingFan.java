package com.ch06.sub;


public class ReceiverCeilingFan {
	private static final int HIHG = 3;
	private static final int MEDIUM = 2;
	private static final int LOW = 1;
	private static final int OFF = 0;
	private String room;
	int speed;

	public ReceiverCeilingFan(String room) {
		this.room = room;
	}

	public void high(){
		speed = HIHG;
		System.out.println("HIGH Speed - Ceiling fan - "+room);
	}
	public void medium(){
		speed = MEDIUM;
		System.out.println("MEDIUM Speed - Ceiling fan - "+room);
	}
	public void low(){
		speed = LOW;
		System.out.println("LOW Speed - Ceiling fan - "+room);
	}
	public void off(){
		speed = OFF;
		System.out.println("OFF Speed - Ceiling fan - "+room);
	}

	public int getSpeed() {
		return speed;
	}
}
