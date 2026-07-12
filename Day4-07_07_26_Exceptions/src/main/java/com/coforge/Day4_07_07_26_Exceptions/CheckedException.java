package com.coforge.Day4_07_07_26_Exceptions;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckedException {

    public static void main(String[] args) {

        // ClassNotFoundException
        try {
            Class.forName("com.coforge.NonExistingClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }

        // IOException
        try {
            FileReader fr = new FileReader("abc.txt"); // file may not exist
            fr.read();
            fr.close();
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        // InterruptedException
        try {
            System.out.println("Thread sleeping...");
            Thread.sleep(1000); // may throw InterruptedException
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e.getMessage());
        }

        // ParseException
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            sdf.setLenient(false); // strict parsing
            sdf.parse("32-13-2025"); // invalid date
        } catch (ParseException e) {
            System.out.println("ParseException: " + e.getMessage());
        }

        System.out.println("Program completed...");
    }
}