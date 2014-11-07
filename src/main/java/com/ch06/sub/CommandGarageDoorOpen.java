package com.ch06.sub;

import com.ch06.ICommand;


public class CommandGarageDoorOpen implements ICommand {
	ReceiverGarageDoor garageDoor;

	public CommandGarageDoorOpen(ReceiverGarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute(){
		garageDoor.open();
	}
}
