package com.coforge.Day2_03_07_26_Assignment;

public class SecondMax {
	 public static void main(String[] args) {
	        int[] arr = {10,50,30,70,20};

	        int max = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;

	        for(int num : arr){
	            if(num > max){
	                second = max;
	                max = num;
	            } else if(num > second && num != max){
	                second = num;
	            }
	        }

	        System.out.println("Second Maximum = " + second);
	    }

}
