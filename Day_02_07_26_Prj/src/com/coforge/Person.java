package com.coforge;

public class Person {
	
	protected String name;
	protected int age;
	protected String address;
	public Person() {
		super();//default constructor  of Object class
	}
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	protected String sayHello(String mobile) {
		return "Hello from Person"+" is person mobile number"+mobile;
	}

}
