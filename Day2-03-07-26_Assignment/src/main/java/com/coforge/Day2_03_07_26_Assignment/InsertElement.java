package com.coforge.Day2_03_07_26_Assignment;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int n = 5;

        arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4; arr[4]=5;

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        System.out.print("Enter value: ");
        int val = sc.nextInt();

        for(int i=n-1;i>=pos;i--){
            arr[i+1] = arr[i];
        }

        arr[pos] = val;
        n++;

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
