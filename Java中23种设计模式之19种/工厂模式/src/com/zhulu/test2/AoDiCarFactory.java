package com.zhulu.test2;

public class AoDiCarFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new AoDiCar();
	}

}
