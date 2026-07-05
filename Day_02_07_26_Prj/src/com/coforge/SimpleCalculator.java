package com.coforge;

import java.util.Scanner;
// Assignment day 02-07-26
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number with an operator sign");
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter second Number");
		int b= sc.nextInt();
		System.out.println("Enter the valid Operator");
		char ch= sc.next().charAt(0);
		
		
		switch (ch) {
		case '+': {
			
			System.out.println(a+b);
			break;
		}
		case '-': {
			
			System.out.println(a-b);
			break;
		}		
		case '*': {
		
			System.out.println(a*b);
			break;
		}
		case '/': {
			if (b != 0) {
		        System.out.println(a / b);
		    } else {
		        System.out.println("Cannot divide by zero");
		    }
			break;
		}		
		
		default:
			
			System.out.println("Invalid Argument");
		}
		sc.close();
	}

}
