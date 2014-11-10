package com.ch06.sub;

import com.ch06.ICommand;

public abstract class ACommandCeilingFan implements ICommand {
	ReceiverCeilingFan fan;
	int prevSpeed;

	public ACommandCeilingFan(ReceiverCeilingFan fan) {
		this.fan = fan;
	}

	public abstract void execute();

	public void undo(){
		switch (prevSpeed) {
		case 3:
			fan.high();
			break;
		case 2:
			fan.medium();
			break;
		case 1:
			fan.low();
			break;
		case 0:
			fan.off();
			break;
		}
	}
}
