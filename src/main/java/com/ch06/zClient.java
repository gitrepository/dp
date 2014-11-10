package com.ch06;

import com.ch06.sub.CommandCeilingFanHigh;
import com.ch06.sub.CommandCeilingFanLow;
import com.ch06.sub.CommandCeilingFanMedium;
import com.ch06.sub.CommandCeilingFanOff;
import com.ch06.sub.CommandGarageDoorClose;
import com.ch06.sub.CommandGarageDoorOpen;
import com.ch06.sub.CommandLightOff;
import com.ch06.sub.CommandLightOn;
import com.ch06.sub.CommandSterioOff;
import com.ch06.sub.CommandSterioOn;
import com.ch06.sub.ReceiverCeilingFan;
import com.ch06.sub.ReceiverGarageDoor;
import com.ch06.sub.ReceiverLight;
import com.ch06.sub.ReceiverSterio;


public class zClient {

	public static void main(String[] args) {
		SimpleRemoteControl rc = new SimpleRemoteControl();

		//RC setup
		setupRemote(rc);

		rc.onbuttonPushed(0);
		rc.onbuttonPushed(1);
		System.out.println("UNDO");
		rc.undoButtonPushed();

		System.out.println("");
		rc.offbuttonPushed(1);
		rc.offbuttonPushed(1);

		System.out.println("");
		rc.onbuttonPushed(4);
		rc.onbuttonPushed(5);
		rc.onbuttonPushed(6);
		System.out.println("UNDO");
		rc.undoButtonPushed();
		System.out.println("");

		rc.onbuttonPushed(7);
		System.out.println("UNDO");
		rc.undoButtonPushed();

		System.out.println("");
		rc.onbuttonPushed(8);
		rc.onbuttonPushed(9);
		System.out.println("UNDO");
		rc.undoButtonPushed();

	}

	private static void setupRemote(SimpleRemoteControl rc){
		rc.setCommand(0, new CommandLightOn(new ReceiverLight("Living Room")), new CommandLightOff(new ReceiverLight("Living Room")));
		rc.setCommand(1, new CommandLightOn(new ReceiverLight("Family Room")), new CommandLightOff(new ReceiverLight("Family Room")));
		rc.setCommand(2, new CommandSterioOn(new ReceiverSterio("Living Room")), new CommandSterioOff(new ReceiverSterio("Living Room")));
		rc.setCommand(3, new CommandGarageDoorOpen(new ReceiverGarageDoor()), new CommandGarageDoorClose(new ReceiverGarageDoor()));

		ReceiverCeilingFan livingRoomFan = new ReceiverCeilingFan("Living Room");
		rc.setCommand(4, new CommandCeilingFanHigh(livingRoomFan), new CommandCeilingFanOff(livingRoomFan));
		rc.setCommand(5, new CommandCeilingFanMedium(livingRoomFan), new CommandCeilingFanOff(livingRoomFan));
		rc.setCommand(6, new CommandCeilingFanLow(livingRoomFan), new CommandCeilingFanOff(livingRoomFan));

		ReceiverCeilingFan familyRoomFan = new ReceiverCeilingFan("Family Room");
		rc.setCommand(7, new CommandCeilingFanHigh(familyRoomFan), new CommandCeilingFanOff(familyRoomFan));
		rc.setCommand(8, new CommandCeilingFanMedium(familyRoomFan), new CommandCeilingFanOff(familyRoomFan));
		rc.setCommand(9, new CommandCeilingFanLow(familyRoomFan), new CommandCeilingFanOff(familyRoomFan));
	}
}
