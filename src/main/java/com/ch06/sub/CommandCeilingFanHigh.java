package com.ch06.sub;


public class CommandCeilingFanHigh extends ACommandCeilingFan {

	public CommandCeilingFanHigh(ReceiverCeilingFan fan) {
		super(fan);
	}

	public void execute(){
		prevSpeed = fan.getSpeed();
		fan.high();
	}
}
