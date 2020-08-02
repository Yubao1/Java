package com.zhulu.test;
/**
 * 测试策略模式
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
       Context cxt = new Context(new Price85());
       cxt.printPrice(996);
	}

}
