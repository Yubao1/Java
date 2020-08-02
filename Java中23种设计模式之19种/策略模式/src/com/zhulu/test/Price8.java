package com.zhulu.test;

public class Price8 implements Price{

	@Override
	public double getPrice(double s) {
		System.out.println("打8折");
		return 0.8*s;
	}

}
