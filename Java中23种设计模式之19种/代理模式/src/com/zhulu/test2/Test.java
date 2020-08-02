package com.zhulu.test2;

import java.lang.reflect.Proxy;

/*测试动态   代理模式
 * 
 */
public class Test {

	public static void main(String[] args) {
        Star star = new RealStar();
        StarHandler starHandler = new StarHandler(star);
        Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
        proxy.bookTicket();
        proxy.sign();
	}

}
