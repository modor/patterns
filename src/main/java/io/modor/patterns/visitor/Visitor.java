package io.modor.patterns.visitor;

public class Visitor {
	public String process(Service0 service0) {
		return "service0";
	}

	public String process(Service1 service1) {
		return "service1";
	}

	public String process(Service2 service2) {
		return "service2";
	}
}
