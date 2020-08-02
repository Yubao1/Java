package com.zhulu.test;
/*
 * 测试装饰模式
 */
public class Test {

	
	public static void main(String[] args) {
        Car car = new Car();
        FlyCar flyCar = new FlyCar(car);
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();
	}

}
