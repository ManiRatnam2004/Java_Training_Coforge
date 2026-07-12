package com.coforge.Day2_03_07_26_Assignment;

public class CountOccurences {
	public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2,5};
        int key = 2;
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                count++;
            }
        }

        System.out.println("Occurrences of " + key + " = " + count);
    }

}
