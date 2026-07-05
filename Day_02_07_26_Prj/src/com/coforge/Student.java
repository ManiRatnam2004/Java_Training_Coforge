package com.coforge;

public class Student extends Person{//class follows title case

	private int id;
	private String branchName;
	private String collegeName;//variables and method names follows camel case
	
	
	public Student(String name, int age, String address, int id, String branchName, String collegeName) {
		super(name, age, address);
		this.id = id;
		this.branchName = branchName;
		this.collegeName = collegeName;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentName="+ name +", Student Age="+ age +", Address="+address+  ", id=" + id + ", branchName=" + branchName + ", collegeName=" + collegeName + "]";
	}
	
	//if parent and child have the same method signature , then it is overriding
	
	@Override
	public String  sayHello(String mobile) {
		return super.sayHello(mobile)+" and from Student too";
	}
	
	
}
