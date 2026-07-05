package com.coforge;

public class DemoOnStrings {

	public static void main(String[] args) {
		String s1="swapna";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1="swapna motupally";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		String s2="swapna";
		System.out.println(s2.hashCode());
		String s3="swapna";
		System.out.println(s3.hashCode());
	}

}
