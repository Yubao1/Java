package com.zhulu.test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{
    Star realStar;
    public StarHandler(Star realStar) {
    	this.realStar = realStar;
    }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if (method.getName().equals("sign")) {
			method.invoke(realStar, args);
		}
		return null;
	}

}
