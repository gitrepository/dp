package com.ch06;

import com.ch06.sub.CommandLightOff;
import com.ch06.sub.CommandLightOn;
import com.ch06.sub.ReceiverLight;

public class zClient {

	public static void main(String[] args) {
		SimpleRemoteControl rc = new SimpleRemoteControl();

		ReceiverLight lt = new ReceiverLight();
		CommandLightOn ltOn = new CommandLightOn(lt);
		CommandLightOff ltOff = new CommandLightOff(lt);

		rc.setSlot(ltOn);
		rc.buttonPushed();

		rc.setSlot(ltOff);
		rc.buttonPushed();
	}
}
