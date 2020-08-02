package com.zhulu.test3;

public interface Tyre {
    public void revolve();
}
class LuxuryTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("转得快");
	}
	
}
class LowTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("转得慢");
	}
	
}