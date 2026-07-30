package com.coforge.Day2_03_07_26_Assignment;

public class BinarySearch {
	public static void main(String[] args) {
        int[] arr = {10,20,30,40,50}; // must be sorted
        int key = 30;

        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == key){
                System.out.println("Found at index: " + mid);
                return;
            } else if(key < arr[mid]){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        System.out.println("Not Found");
    }

}
