package com.ch06.sub;

import com.ch06.ICommand;

public class CommandGarageDoorClose implements ICommand {
	ReceiverGarageDoor garageDoor;

	public CommandGarageDoorClose(ReceiverGarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute(){
		garageDoor.close();
	}
}
