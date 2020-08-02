package com.zhulu.test;

public class CheckedInState implements State{
    @Override
    public void handle() {
    	System.out.println("房间已经入住");
    }
}
