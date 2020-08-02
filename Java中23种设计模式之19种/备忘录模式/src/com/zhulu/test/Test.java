package com.zhulu.test;
/**
 * 测试备忘录模式
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
        CareTaker taker = new CareTaker();
        Emp emp = new Emp("小周", 11, 300);
        System.out.println("第一次打印" + emp.getEname() + "---" + emp.getAge() + "---" + emp.getSalary());
        
        taker.setMemento(emp.memento());
        
        emp.setEname("小二");
        emp.setAge(19);
        emp.setSalary(99);
        System.out.println("第二次打印" + emp.getEname() + "---" + emp.getAge() + "---" + emp.getSalary());
        
        emp.recovery(taker.getMemento());
        
        System.out.println("第三次打印" + emp.getEname() + "---" + emp.getAge() + "---" + emp.getSalary());
        
	}

}
