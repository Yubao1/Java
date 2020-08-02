package com.zhulu.test;

public interface Mediator {
    public void register(String name,Department d);
    public void command(String name);
}
