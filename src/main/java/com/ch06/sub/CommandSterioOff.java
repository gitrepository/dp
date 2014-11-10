package com.ch06.sub;

import com.ch06.ICommand;

public class CommandSterioOff implements ICommand {
	ReceiverSterio sterio;

	public CommandSterioOff(ReceiverSterio sterio) {
		this.sterio = sterio;
	}

	public void execute(){
		sterio.setVolume(0);
		sterio.off();
	}

	public void undo() {
		sterio.setVolume(7);
		sterio.on();
	}
}
