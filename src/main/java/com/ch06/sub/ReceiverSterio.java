package com.ch06.sub;


public class ReceiverSterio {
	String room;
	int volume;

	public ReceiverSterio(String room) {
		this.room = room;
	}

	public void on(){
		System.out.println("ON - Serio - "+room);
	}
	public void off(){
		System.out.println("OFF - Serio "+room);
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
