package com.coforge;

public class EmployeeClass  extends Person{
	
	private int eid;
	private double salary;
	
	public EmployeeClass() {
		super();//person class default constructor
	}

	public EmployeeClass(String name, int age, String address, int eid, double salary) {
		super(name, age, address);//person class constructor with parameters
		this.eid = eid;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeClass [eid=" + eid + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}
	
	
	public String sayHello() {
		return "hello swapna";
	}
	
	
	

}
