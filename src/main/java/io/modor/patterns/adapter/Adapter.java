package io.modor.patterns.adapter;

public class Adapter extends NewObject implements StandardInterface {

	@Override
	public String standardOperation() {
		// TODO Auto-generated method stub
		return super.ownOperation();
	}

}
