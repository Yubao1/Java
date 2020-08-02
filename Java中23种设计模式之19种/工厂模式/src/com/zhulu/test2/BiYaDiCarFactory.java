package com.zhulu.test2;

public class BiYaDiCarFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new BiYaDiCar();
	}

}
