package com.zhulu.test;
/*
 * 测试静态  代理模式
 */
public class Test {

	public static void main(String[] args) {
        Star realStar = new RealStar();
        ProxyStar proxyStar = new ProxyStar(realStar);
        proxyStar.confer();
        proxyStar.bookTicket();
        proxyStar.signContract();
        proxyStar.sign();
        proxyStar.collectMoney();
	}

}
