package com.coforge.Day2_03_07_26_Assignment;

public class PrimeNumbersInArray {
	 public static void main(String[] args) {
	        int[] arr = {2,11,4,67,9,37};

	        for(int num : arr){
	            boolean isPrime = true;

	            if(num <= 1) isPrime = false;

	            for(int i=2;i<=num/2;i++){
	                if(num % i == 0){
	                    isPrime = false;
	                    break;
	                }
	            }

	            if(isPrime){
	                System.out.print(num + " ");
	            }
	        }
	    }
}
