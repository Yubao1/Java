package com.zhulu.test;

public interface Brand {
    public void sale();
}
class Lenovo implements Brand {

	@Override
	public void sale() {
		System.out.print("联想");
	}
	
}
class Shenzhou implements Brand {

	@Override
	public void sale() {
		System.out.print("神舟");
	}
	
}