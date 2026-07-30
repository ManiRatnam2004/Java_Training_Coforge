package com.coforge.Day2_03_07_26_Assignment;

import java.util.Scanner;

//Employee class
class Employee {
 String name;
 int id;
 double salary;
 String address;

 // Constructor
 Employee(String name, int id, double salary, String address) {
     this.name = name;
     this.id = id;
     this.salary = salary;
     this.address = address;
 }

 // Method to display employee details
 void display() {
     System.out.println("ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
     System.out.println("Address: " + address);
     System.out.println("----------------------");
 }
}

//Main class
public class EmployeeList {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Array of 10 employees
     Employee[] empList = new Employee[10];

     // Taking input
     for(int i = 0; i < empList.length; i++) {
         System.out.println("Enter details for Employee " + (i+1));

         System.out.print("Enter ID: ");
         int id = sc.nextInt();
         sc.nextLine(); // clear buffer

         System.out.print("Enter Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Salary: ");
         double salary = sc.nextDouble();
         sc.nextLine();

         System.out.print("Enter Address: ");
         String address = sc.nextLine();

         empList[i] = new Employee(name, id, salary, address);
     }

     // Display all employees
     System.out.println("\nEmployee Details:");
     for(int i = 0; i < empList.length; i++) {
         empList[i].display();
     }
 }
}

