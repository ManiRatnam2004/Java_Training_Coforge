package com.coforge.Day4_07_07_26_Exceptions;

public class CustomException {
	public static void main(String[] args) throws AgeNotSufficientException {
		
		
		Person p=new Person("swapna",44,"Hyderabad");
		if(p.getAge()<18)
			throw new AgeNotSufficientException("Person Age is less thand 18");
		else
			System.out.println("Person is eligile to cast Vote");
			
	}

}