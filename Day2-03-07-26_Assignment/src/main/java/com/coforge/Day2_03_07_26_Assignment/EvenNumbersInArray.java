package com.coforge.Day2_03_07_26_Assignment;

public class EvenNumbersInArray {

	public static void main(String[] args) {
		 int[] arr = {1,2,3,4,5,6};

	        System.out.println("Even numbers:");
	        for(int i=0;i<arr.length;i++){
	            if(arr[i] % 2 == 0){
	                System.out.print(arr[i] + " ");
	            }
	        }
	}
	

}
