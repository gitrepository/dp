package com.ch06.sub;


public class CommandCeilingFanMedium extends ACommandCeilingFan {

	public CommandCeilingFanMedium(ReceiverCeilingFan fan) {
		super(fan);
	}

	public void execute(){
		prevSpeed = fan.getSpeed();
		fan.medium();
	}
}
