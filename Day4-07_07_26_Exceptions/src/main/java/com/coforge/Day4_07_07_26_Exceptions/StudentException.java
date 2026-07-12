package com.coforge.Day4_07_07_26_Exceptions;

public class StudentException {

    // Student class
    static class Student {
        String name;
        int id;
        int[] marks;
        String phone;
        String email;

        Student(String name, int id, int[] marks, String phone, String email) {
            this.name = name;
            this.id = id;
            this.marks = marks;
            this.phone = phone;
            this.email = email;
        }
    }

    public static void main(String[] args) {

        Student[] students = new Student[2];

        // valid student but with wrong data to trigger exceptions
        students[0] = new Student("Sekhar", -1, new int[]{80, 90, 85}, "123abc", "a@gmail.com");

        // null student → NullPointerException
        students[1] = null;

        for (int i = 0; i <= students.length; i++) { // will cause ArrayIndexOutOfBounds
            try {

                System.out.println("\nProcessing student index: " + i);

                // ArrayIndexOutOfBounds handled here
                Student s = students[i];

                // NullPointerException
                if (s == null) {
                    throw new NullPointerException("Student object is null");
                }

                // IllegalArgumentException
                if (s.id < 0) {
                    throw new IllegalArgumentException("ID cannot be negative");
                }

                // ArithmeticException
                int sum = 0;
                for (int j = 0; j < s.marks.length; j++) {
                    sum += s.marks[j];
                }
                int avg = sum / 0; // force ArithmeticException
                System.out.println("Average: " + avg);

                // StringIndexOutOfBoundsException
                System.out.println("Char: " + s.name.charAt(50));

                // NumberFormatException
                int phoneNum = Integer.parseInt(s.phone);
                System.out.println(phoneNum);

                // ClassCastException
                Object obj = "Hello";
                Integer num = (Integer) obj;

            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());

            } 
            catch (NullPointerException e) {
                System.out.println("NullPointerException: " + e.getMessage());

            } 
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());

            } 
            catch (StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());

            } 
            catch (NumberFormatException e) { // child first
                System.out.println("NumberFormatException: " + e.getMessage());

            } 
            catch (IllegalArgumentException e) { // parent after child
                System.out.println("IllegalArgumentException: " + e.getMessage());

            } 
            catch (ClassCastException e) {
                System.out.println("ClassCastException: " + e.getMessage());
            }
        }
    }
}