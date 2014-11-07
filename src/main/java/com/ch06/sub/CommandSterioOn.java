package com.ch06.sub;

import com.ch06.ICommand;

public class CommandSterioOn implements ICommand {
	ReceiverSterio sterio;

	public CommandSterioOn(ReceiverSterio sterio) {
		this.sterio = sterio;
	}

	public void execute(){
		sterio.setVolume(7);
		sterio.on();
	}
}
