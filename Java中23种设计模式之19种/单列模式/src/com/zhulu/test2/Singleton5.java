package com.zhulu.test2;

public class Singleton5 {
    private Singleton5(){
    	
    }
    private static Singleton5 instance;
    
    //懒汉式单例模式
    public static synchronized Singleton5 getInstance() {
    	if (instance == null) {
    		instance = new Singleton5();
    	}
    	return instance;
    }
}
