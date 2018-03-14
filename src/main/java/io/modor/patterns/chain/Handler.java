package io.modor.patterns.chain;

public abstract class Handler{
	private Handler nextHandler;

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public abstract String doHandler();

}