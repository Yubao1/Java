package com.zhulu.test;

public class Adapter extends Adaptee implements Target{

	@Override
	public void handler() {
		super.request();
	}


}
