package com.zhulu.test;
/**
 * 测试中介者模式
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
        Mediator mediator = new President();
        Market market = new Market(mediator);
        Finacial finacial = new Finacial(mediator);
        Development development = new Development(mediator);
        market.selfAction();
        market.outAction();
	}

}
