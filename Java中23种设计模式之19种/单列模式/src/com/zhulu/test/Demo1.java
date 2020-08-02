package com.zhulu.test;

import java.util.concurrent.CountDownLatch;

import com.zhulu.test2.Singleton2;

public class Demo1 {

	
	public static void main(String[] args) {
		final CountDownLatch cdl = new CountDownLatch(10);
		long start = System.currentTimeMillis();
        for (int i = 0;i < 10;i++) {
        	new Thread(){
            	public void run() {
            		super.run();
            		for(int y=0;y<100000;y++){
            			Object object = Singleton2.getInstance();
            		}
            		cdl.countDown();
            	}
            }.start();
        }
        try {
			cdl.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        long end = System.currentTimeMillis();
        System.out.println(end - start);
	}

}
