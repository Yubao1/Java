package com.zhulu.test;

public class Development implements Department{
    private Mediator mediator;
    public Development(Mediator mediator) {
    	this.mediator = mediator;
    	mediator.register("development", this);
    }
	@Override
	public void selfAction() {
		System.out.println("专心科研项目");
	}

	@Override
	public void outAction() {
		System.out.println("没钱了，需要资金支持");
	}

}
