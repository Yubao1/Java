package com.zhulu.test2;
/*
 * 测试工厂方法模式
 */
public class Test {

	public static void main(String[] args) {
        Car car1 = new AoDiCarFactory().createCar();
        Car car2 = new BiYaDiCarFactory().createCar();
        car1.run();
        car2.run();
	}

}
