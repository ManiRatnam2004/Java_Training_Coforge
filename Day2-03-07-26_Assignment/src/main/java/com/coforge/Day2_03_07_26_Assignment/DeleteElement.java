package com.coforge.Day2_03_07_26_Assignment;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        for(int i=pos;i<n-1;i++){
            arr[i] = arr[i+1];
        }

        n--;

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
