package com.coforge.Day4_07_07_26_Exceptions;

/**
 * Hello world!
 */
//public class App {
//	
//	public static void div(int a, int b) {
//		if(b==0) 
//			throw new ArithmeticException();
//		else	
//			System.out.println(a/b);
//
//	}
//    public static void main(String[] args) {
       // System.out.println("Hello World!");
        
//        int a = 78, b[] = {2,3,4,5,6}, c = 0;
//        try {
//        		for(int i=0;i<=b.length;i++)
//        		c= a/b[i]; 
//        }
//        catch(ArithmeticException e) {
//        		e.printStackTrace();
//        }
//        catch(ArrayIndexOutOfBoundsException ae) {
//        		ae.printStackTrace();
//        }
//        catch(RuntimeException r) {
//        		r.printStackTrace();
//        }
//        catch(Exception e) {
//        		e.printStackTrace();
//        }
//        System.out.println(c);
    	
    		
//    		div(5,0);
//    		System.out.println("Program completed");
//    }
//}

/**
 * Hello world!
 */
public class App {
	
	public static void div(int a,int b) { //propagation of exception
		
		if(b==0)
			throw new ArithmeticException();
		else
			System.out.println(a/b);
		
	}
	
	
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
        div(5,0);
        }catch (Exception e) {
			// TODO: handle exception
		}
        
        System.out.println("Program completed");
      
        
    }
}
