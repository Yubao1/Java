package com.zhulu.test;

public class Adapter2 implements Target{
    private Adaptee adaptee;
	@Override
	public void handler() {
		adaptee.request();
	}
    public Adapter2(Adaptee adaptee) {
    	this.adaptee = adaptee;
    }

}
