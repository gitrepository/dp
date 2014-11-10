package com.ch06.sub;


public class CommandCeilingFanOff extends ACommandCeilingFan {

	public CommandCeilingFanOff(ReceiverCeilingFan fan) {
		super(fan);
	}

	public void execute(){
		fan.off();
	}
}
