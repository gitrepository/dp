package com.ch06.sub;

import com.ch06.ICommand;

public class CommandLightOff implements ICommand {
	ReceiverLight light;

	public CommandLightOff(ReceiverLight light) {
		this.light = light;
	}

	public void execute(){
		light.off();
	}

	public void undo(){
		light.on();
	}
}
