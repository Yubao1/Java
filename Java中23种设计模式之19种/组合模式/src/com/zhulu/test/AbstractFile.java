package com.zhulu.test;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
	public void killVirus();
}

class ImageFile implements AbstractFile {

	private String name;

	public ImageFile(String name) {
        this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("图片文件" + name + "查杀");
	}

}
class TextFile implements AbstractFile {

	private String name;

	public TextFile(String name) {
        this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("文本文件" + name + "查杀");
	}

}
class VideoFile implements AbstractFile {

	private String name;

	public VideoFile(String name) {
        this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("视频文件" + name + "查杀");
	}

}
class Folder implements AbstractFile {

	private String name;
    private List<AbstractFile> list = new ArrayList<AbstractFile>();
	public Folder(String name) {
        this.name = name;
	}
    public void add(AbstractFile file) {
    	list.add(file);
    }
    public void remove(AbstractFile file) {
    	list.remove(file);
    }
    public AbstractFile get(int index) {
    	return list.get(index);
    }
	@Override
	public void killVirus() {
		System.out.println("文件夹" + name + "查杀");
		for (AbstractFile file: list) {
			file.killVirus();
		}
	}

}

