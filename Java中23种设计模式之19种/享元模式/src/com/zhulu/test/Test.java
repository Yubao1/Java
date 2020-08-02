package com.zhulu.test;
/**
 * 测试享元模式
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
         ChessFlyWeight c1 = ChessFlyWeightFactotry.getChess("黑色");
         ChessFlyWeight c2 = ChessFlyWeightFactotry.getChess("黑色");
         System.out.println(c1);
         System.out.println(c2);
         System.out.println("增加外部处理-------------------");
         c1.display(new Coordinate(10, 10));
         c2.display(new Coordinate(20, 20));
	}

}
