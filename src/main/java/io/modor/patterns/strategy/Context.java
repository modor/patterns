package io.modor.patterns.strategy;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public String operation() {
		return strategy.operation();
	}
}
