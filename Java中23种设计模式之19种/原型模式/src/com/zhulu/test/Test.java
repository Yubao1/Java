package com.zhulu.test;

import java.util.Date;

/*
 * 测试浅复制
 */
public class Test {

	public static void main(String[] args) {
		Date date = new Date(12345689l);
        Sheep s1 = new Sheep("多利",date);
        System.out.println(s1);
        System.out.println(s1.getName()+"**" + s1.getBirthday());
        
        System.out.println(s1.getBirthday());
        System.out.println("________________________________");
        try {
			Sheep s2 = (Sheep) s1.clone();
			date.setTime(345466578887l);
			System.out.println(s2);
			System.out.println(s2.getName()+"**" + s2.getBirthday());
			System.out.println(s2.getBirthday());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
