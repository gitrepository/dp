package com.ch06.sub;


public class CommandCeilingFanLow extends ACommandCeilingFan {

	public CommandCeilingFanLow(ReceiverCeilingFan fan) {
		super(fan);
	}

	public void execute(){
		prevSpeed = fan.getSpeed();
		fan.low();
	}
}
