package com.zhulu.test;

public abstract class Father {
    public void a(){
    	System.out.println("排队取号");
    }
    public void c() {
    	System.out.println("给工作人员评分");
    }
    public abstract void b();
    public void d() {
    	this.a();
    	this.b();
    	this.c();
    }
}
