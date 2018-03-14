package io.modor.patterns.decorator;

public class Decorator {

	public Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	public String operation() {
		return "Decorator" + this.component.operation();
	}
}
