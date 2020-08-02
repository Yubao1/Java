package com.zhulu.test;
/*
 * 测试 组合模式
 */
public class Test {

	public static void main(String[] args) {
       AbstractFile f2,f3,f4,f5;
       Folder f1 = new Folder("我的文件夹");
       f2 = new ImageFile("我的图片");
       f3 = new TextFile("我的文本文件");
       Folder f11 = new Folder("我的电影");
       f1.add(f2);
       f1.add(f3);
       f4 = new VideoFile("神雕侠侣");
       f5 = new VideoFile("笑傲江湖");
       f11.add(f4);
       f11.add(f5);
       f1.add(f11);
       f1.killVirus();
	}

}
