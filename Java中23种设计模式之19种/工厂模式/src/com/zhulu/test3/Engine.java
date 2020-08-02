package com.zhulu.test3;

public interface Engine {
   public void run();
   public void start();
}

class LuxuryEngine implements Engine {

	@Override
	public void run() {
		System.out.println("跑得快");
	}

	@Override
	public void start() {
		System.out.println("启动快");
	}
	
	
	
}
class LowEngine implements Engine {

	@Override
	public void run() {
		System.out.println("跑得慢");
	}

	@Override
	public void start() {
		System.out.println("启动慢");
	}
}