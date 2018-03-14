package io.modor.patterns.command;

public class ConcreteCommand implements Command {
	Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return receiver.action();
	}

}
