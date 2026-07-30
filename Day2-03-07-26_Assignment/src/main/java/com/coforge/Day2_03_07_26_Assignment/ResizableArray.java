package com.coforge.Day2_03_07_26_Assignment;

public class ResizableArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Original size: " + arr.length);

        int[] newArr = new int[arr.length * 2];

        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }

        arr = newArr;

        System.out.println("New size after resizing: " + arr.length);
        
    }
}
