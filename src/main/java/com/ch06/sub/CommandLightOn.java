package com.ch06.sub;

import com.ch06.ICommand;

public class CommandLightOn implements ICommand {
	ReceiverLight light;

	public CommandLightOn(ReceiverLight light) {
		this.light = light;
	}

	public void execute(){
		light.on();
	}

	public void undo(){
		light.off();
	}
}
