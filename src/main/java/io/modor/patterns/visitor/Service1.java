package io.modor.patterns.visitor;

public class Service1 implements Service {

	@Override
	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.process(this);

	}

}
