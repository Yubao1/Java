package com.zhulu.test;

public class Price85 implements Price{

	@Override
	public double getPrice(double s) {
		System.out.println("打85折");
		return 0.85*s;
	}

}
