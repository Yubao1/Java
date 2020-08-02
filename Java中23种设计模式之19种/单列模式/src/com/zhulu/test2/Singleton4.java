package com.zhulu.test2;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton4 implements Serializable{
    private Singleton4(){
    	
    }
    private static Singleton4 instance;
    
    //饿汉式单例模式
    public static Singleton4 getInstance() {
    	if (instance == null) {
    		instance = new Singleton4();
    	}
    	return instance;
    }
    
    //反序列化时系统调用
    private Object readResolve() throws ObjectStreamException{
    	return instance;
    }
}
