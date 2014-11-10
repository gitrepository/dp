package com.ch06;

import com.ch06.sub.CommandGarageDoorClose;
import com.ch06.sub.CommandGarageDoorOpen;
import com.ch06.sub.CommandLightOff;
import com.ch06.sub.CommandLightOn;
import com.ch06.sub.CommandSterioOff;
import com.ch06.sub.CommandSterioOn;
import com.ch06.sub.ReceiverGarageDoor;
import com.ch06.sub.ReceiverLight;
import com.ch06.sub.ReceiverSterio;


public class zClient {

	public static void main(String[] args) {
		SimpleRemoteControl rc = new SimpleRemoteControl();

		//RC setup
		setupRemote(rc);

		rc.offbuttonPushed(0);
		rc.offbuttonPushed(3);
		rc.offbuttonPushed(1);
		rc.undoButtonPushed();
	}

	private static void setupRemote(SimpleRemoteControl rc){
		rc.setCommand(0, new CommandLightOn(new ReceiverLight("Living Room")), new CommandLightOff(new ReceiverLight("Living Room")));
		rc.setCommand(1, new CommandLightOn(new ReceiverLight("Family Room")), new CommandLightOff(new ReceiverLight("Family Room")));
		rc.setCommand(2, new CommandSterioOn(new ReceiverSterio("Living Room")), new CommandSterioOff(new ReceiverSterio("Living Room")));
		rc.setCommand(3, new CommandGarageDoorOpen(new ReceiverGarageDoor()), new CommandGarageDoorClose(new ReceiverGarageDoor()));
	}
}
