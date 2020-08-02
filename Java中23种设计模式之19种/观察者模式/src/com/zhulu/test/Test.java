package com.zhulu.test;
/**
 * 测试观察者模式
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
        Send send = new Send();
        Reciever recieverA = new ReceiverA("A");
        Reciever recieverB = new ReceiverA("B");
        Reciever recieverC = new ReceiverA("C");
        send.register(recieverA);
        send.register(recieverC);
        send.register(recieverB);
        send.setState(999);
        send.notifiAll(send.getSate());
        System.out.println(recieverA);
        System.out.println(recieverB);
        System.out.println(recieverC);
	}

}
