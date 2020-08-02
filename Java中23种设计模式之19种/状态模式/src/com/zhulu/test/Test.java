package com.zhulu.test;
/**
 * 测试状态模式
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
        HomeContext home = new HomeContext();
        home.setState(new CheckedInState());
	}

}
