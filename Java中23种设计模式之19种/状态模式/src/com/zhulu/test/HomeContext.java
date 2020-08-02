package com.zhulu.test;

public class HomeContext {
    private State state;
    public void setState(State state) {
    	this.state = state;
    	state.handle();
    }
}
