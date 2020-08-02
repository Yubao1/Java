package com.zhulu.test3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.zhulu.test.Sheep;

/*
 * 测试原型模式的序列化与反序列化实现深复制
 */
public class Test {

	public static void main(String[] args) {
		Date date = new Date(1234655657l);
        Sheep sheep = new Sheep("多利", date);
        System.out.println(sheep);
        System.out.println(sheep.getName()+"**" + sheep.getBirthday());
        System.out.println("-----------------------------");
        try {
        	ByteArrayOutputStream baos = new ByteArrayOutputStream();
        	ObjectOutputStream oos = new ObjectOutputStream(baos);
        	oos.writeObject(sheep);
        	byte[] bytes = baos.toByteArray();
        	ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        	ObjectInputStream ois = new ObjectInputStream(bais);
			Sheep sheep2 = (Sheep) ois.readObject();
			date.setTime(465676877867878l);
			System.out.println(sheep2);
			System.out.println(sheep2.getName()+"**"+ sheep2.getBirthday());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
