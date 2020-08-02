package com.zhulu.test;
/**
 * 测试模板方法模式
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
        Father f = new SonA();
        f.d();
	}
    
}
class SonA extends Father {

	@Override
	public void b() {
		System.out.println("我要取钱");
	}
	
}
class SonB extends Father {

	@Override
	public void b() {
		System.out.println("我要理财");
	}
	
}