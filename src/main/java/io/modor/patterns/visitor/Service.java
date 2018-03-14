package io.modor.patterns.visitor;

public interface Service {
	String accept(Visitor visitor);
}
