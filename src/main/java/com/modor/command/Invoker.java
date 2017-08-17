package com.modor.command;

public class Invoker {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public String runCommand() {
		return command.execute();
	}
}
