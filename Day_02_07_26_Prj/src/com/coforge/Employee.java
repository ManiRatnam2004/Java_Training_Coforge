package com.coforge;
//POJO-->plain old java object
//properties
//methods--setters & getters
//constructor -- parameterized/no parameters(default)
public class Employee {
	
	//properties
	//access specifier , data type , variable name
	
	public String ename;
	private int eid;
	private double salary;
	
	
	// if there is a param constructor then default constructor mandatory
	public Employee() {
		super();
	}
	public Employee(String ename, int eid, double salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
	}
	
	public Employee(String ename) {
		super();
		this.ename = ename;
	}
	
	
	
	
	public Employee(String ename, int eid) {
		super();
		this.ename = ename;
		this.eid = eid;
	}
	
	
	public Employee(int eid,String ename) {
		super();
		this.ename = ename;
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		System.out.println("setter for ename");
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", salary=" + salary + "]";
	}
	
	//ctrl+shft+s
	
	//command+option+s
	
	
	
	

}
