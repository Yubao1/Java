package com.zhulu.test2;
/*
 * 静态内部类实现单列模式
 */
public class Singleton2 {
   private Singleton2(){
	   
   }
   private static class SingletonInstance {
	   private static final Singleton2 instance= new Singleton2();
   }
   public static Singleton2 getInstance() {
	   return SingletonInstance.instance;
   }
}
