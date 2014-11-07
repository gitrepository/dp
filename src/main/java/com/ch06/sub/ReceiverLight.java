package com.ch06.sub;


public class ReceiverLight {
	String room;

	public ReceiverLight(String room) {
		this.room = room;
	}

	public void on(){
		System.out.println("ON - Light - "+room);
	}
	public void off(){
		System.out.println("OFF - Light "+room);
	}
}
