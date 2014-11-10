package com.ch06;

import com.ch06.sub.CommandNone;


public class SimpleRemoteControl {
	private ICommand[] onCommand;
	private ICommand[] offCommand;
	private ICommand undoCommand;

	public SimpleRemoteControl() {
		onCommand = new ICommand[7];
		offCommand = new ICommand[7];

		for(int i=0; i<7; i++){
			ICommand cmd = new CommandNone();
			onCommand[i] = cmd;
			offCommand[i] = cmd;
		}
	}

	public void setCommand(int slot, ICommand onCmd, ICommand offCmd) {
		onCommand[slot] = onCmd;
		offCommand[slot] = offCmd;
	}

	public void onbuttonPushed(int slot) {
		undoCommand = onCommand[slot];
		onCommand[slot].execute();
	}

	public void offbuttonPushed(int slot) {
		undoCommand = offCommand[slot];
		offCommand[slot].execute();
	}

	public void undoButtonPushed(){
		undoCommand.undo();
	}
}
