package com.zhulu.test;
/*
 * 测试  适配器模式
 */
public class Test {

	public static void main(String[] args) {
		// 测试1
        Test test = new Test();
        Target target = new Adapter();
        test.test(target);
        
        //测试2
        
        Target target2 = new Adapter2(new Adaptee());
        test.test(target2);
        
	}
     public void test(Target t) {
    	 t.handler();
     }
}
