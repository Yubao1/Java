package com.zhulu.test;

public class EmpMemento {
    private String ename;
    private int age;
    private double saraly;
    
    public EmpMemento(Emp emp) {
    	ename = emp.getEname();
    	age = emp.getAge();
    	saraly = emp.getSalary();
    }
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSaraly() {
		return saraly;
	}
	public void setSaraly(double saraly) {
		this.saraly = saraly;
	}
    
    
}
