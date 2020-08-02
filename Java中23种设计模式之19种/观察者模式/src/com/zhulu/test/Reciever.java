package com.zhulu.test;

public interface Reciever {
    public void update(int i);
}
class ReceiverA implements Reciever {
    private int state = 0;
    private String nameString;
    public ReceiverA(String name) {
    	this.nameString = name;
    }
	@Override
	public void update(int i) {
		state = i;
	}
	public int getState() {
		return this.state;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return nameString + "----------" + state;
	}
	
}
class ReceiverB implements Reciever {
    private int state = 0;
    private String nameString;
    public ReceiverB(String name) {
    	this.nameString = name;
    }
	@Override
	public void update(int i) {
		state = i;
	}
	public int getState() {
		return this.state;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return nameString + "----------" + state;
	}
	
}
class ReceiverC implements Reciever {
    private int state = 0;
    private String nameString;
    public ReceiverC(String name) {
    	this.nameString = name;
    }
	@Override
	public void update(int i) {
		state = i;
	}
	public int getState() {
		return this.state;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return nameString + "----------" + state;
	}
	
}
