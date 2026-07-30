package com.coforge.Day2_03_07_26_Assignment;
import java.util.Scanner;

public class MatrixMenuDriven {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[][] a = {{1,2},{3,4}};
	        int[][] b = {{5,6},{7,8}};
	        int[][] c = new int[2][2];

	        System.out.println("1.Add 2.Sub 3.Multiply");
	        int choice = sc.nextInt();

	        switch(choice){
	            case 1:
	                for(int i=0;i<2;i++){
	                    for(int j=0;j<2;j++){
	                        c[i][j] = a[i][j] + b[i][j];
	                    }
	                }
	                break;

	            case 2:
	                for(int i=0;i<2;i++){
	                    for(int j=0;j<2;j++){
	                        c[i][j] = a[i][j] - b[i][j];
	                    }
	                }
	                break;

	            case 3:
	                for(int i=0;i<2;i++){
	                    for(int j=0;j<2;j++){
	                        c[i][j] = 0;
	                        for(int k=0;k<2;k++){
	                            c[i][j] += a[i][k] * b[k][j];
	                        }
	                    }
	                }
	                break;
	        }

	        for(int i=0;i<2;i++){
	            for(int j=0;j<2;j++){
	                System.out.print(c[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
