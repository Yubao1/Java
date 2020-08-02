package com.zhulu.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.zhulu.test2.Singleton2;
import com.zhulu.test2.Singleton4;

public class Dome2 {

	public static void main(String[] args) {
		Singleton4 si = Singleton4.getInstance();
		System.out.println(si);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
			fos = new FileOutputStream("E:/a.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
        
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {
			fis = new FileInputStream("E:/a.txt");
			ois = new ObjectInputStream(fis);
			Singleton4 sing = (Singleton4)ois.readObject();
			System.out.println(sing);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
    
}
