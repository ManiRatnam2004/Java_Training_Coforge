package com.coforge;

public class DeomOnOverloading {
	
	
	//formal parameters 
	// change on number of parameters
	// change on data type of parameters
	// change on order of parameters
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	
	public double add(double d1,double d2) {
		return d1+d2;
	}
	
	//order of parameters
	public double add(int i,double d1) {
		return i+d1;
	}
	
	
	public double add(double d1,int i) {
		return i+d1;
	}
	
	public String add(String s1,String s2) {
		return s1+s2;
	}
	
	public void add(ComplexNumber c1,ComplexNumber c2) {
		
		ComplexNumber c3=new ComplexNumber();
		c3.real=c1.real+c2.real;
		c3.imag=c1.imag+c2.imag;
		System.out.println(c3.real+"+i"+c3.imag);
		
	}
	
	//fraction class addition
	//write add method to fractions
	
	
	//lets define a complex number class

	public static void main(String[] args) {
		
		DeomOnOverloading sc=new DeomOnOverloading();//supplied by jvm
		System.out.println( sc.add(56,78));
		System.out.println( sc.add(56.0,78.0));
		System.out.println( sc.add(56,78,90));
		System.out.println( sc.add(56,78.0));
		System.out.println( sc.add(56.0,78));
		System.out.println( sc.add("Hello ","world"));
		ComplexNumber c1=new ComplexNumber(3, 4);
		ComplexNumber c2=new ComplexNumber(5, 6);
		sc.add(c1,c2);
		
	}

}
