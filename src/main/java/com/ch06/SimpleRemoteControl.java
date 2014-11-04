package com.ch06;


public class SimpleRemoteControl {
	public ICommand slot;

	public SimpleRemoteControl() {}

	public void setSlot(ICommand slot) {
		this.slot = slot;
	}

	public void buttonPushed() {
		slot.execute();
	}
}
