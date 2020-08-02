package com.zhulu.test2;
/*
 * 双重检查锁实现单列模式
 */
public class Singleton1 {
   private static Singleton1 instance = null;
   private Singleton1(){
	   
   }
   public static Singleton1 getInstance() {
	   if (instance == null) {
		   synchronized(Singleton1.class){
		   Singleton1 sc = instance;
		   if (sc == null) {
			   synchronized(Singleton1.class){
				   if (sc == null)
					   sc = new Singleton1();
			   }
			   instance = sc;
		   }
		   }
	   }
	   return instance;
   }
}
