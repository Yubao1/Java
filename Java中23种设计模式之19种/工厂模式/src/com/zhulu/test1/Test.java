package com.zhulu.test1;

/*
 *  测试简单工厂模式
 */
public class Test {
 
	public static void main(String[] args) {
        Car car1 = CreateCar.createAoDiCar();
        Car car2 = CreateCar.createBiYaDiCar();
        car1.run();
        car2.run();
	}

}
