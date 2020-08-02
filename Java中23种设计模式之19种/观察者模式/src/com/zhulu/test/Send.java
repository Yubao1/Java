package com.zhulu.test;

import java.util.ArrayList;
import java.util.List;

public class Send {
    private int state = 0;
    private List<Reciever> list = new ArrayList<Reciever>();
    public void setState(int state) {
    	this.state = state;
    }
    public int getSate() {
    	return this.state;
    }
    public void register(Reciever reciever) {
    	list.add(reciever);
    }
    public void notifiAll(int i) {
    	for (Reciever reciever:list) {
    		reciever.update(i);
    	}
    }
}
