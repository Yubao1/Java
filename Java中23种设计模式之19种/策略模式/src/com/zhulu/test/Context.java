package com.zhulu.test;

public class Context {
    private Price price;
    public Context(Price price) {
    	this.price = price;
    }
    public void printPrice(double s) {
    	System.out.println("请您报原价" + price.getPrice(s));
    }
}
