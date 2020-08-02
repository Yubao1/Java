package com.zhulu.test;

public class RealStar implements Star{

	@Override
	public void confer() {
		System.out.println("RealStar confer");
	}

	@Override
	public void signContract() {
        System.out.println("RealStar signContract");		
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar bookTicket");
	}

	@Override
	public void sign() {
		System.out.println("周杰伦本人唱歌");
	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar collectMoney");
	}

}
