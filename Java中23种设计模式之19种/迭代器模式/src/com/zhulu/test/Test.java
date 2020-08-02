package com.zhulu.test;
/**
 * 测试迭代器模式
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
        ConcreteMyAggregate c = new ConcreteMyAggregate();
        c.addObject("aa");
        c.addObject("bb");
        c.addObject("cc");
        c.addObject("dd");
        MyIterator iterator = c.createIterator();
        while (iterator.hasNext()) {
        	System.out.println(iterator.getCurrentObject());
        	iterator.next();
        }
	}

}
