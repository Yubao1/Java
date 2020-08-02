package com.zhulu.test3;
/*
 * 测试抽象工厂模式
 */
public class Test {

	public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine engine = factory.createEngine();
        engine.run();
        engine.start();
	}

}
