package com.zhulu.test3;

public interface Seat {
    public void message();
}
class LuxurySeat implements Seat {

	@Override
	public void message() {
		System.out.println("可以自动按摩");
	}
	
}
class LowSeat implements Seat {

	@Override
	public void message() {
		System.out.println("只能手动按摩");
	}
	
}
