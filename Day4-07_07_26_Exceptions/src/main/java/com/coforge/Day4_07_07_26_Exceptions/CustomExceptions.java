package com.coforge.Day4_07_07_26_Exceptions;

public class CustomExceptions {

    // ===== Custom Exceptions =====

    // Invalid Marks Exception
    static class InvalidMarksException extends Exception {
        public InvalidMarksException(String msg) {
            super(msg);
        }
    }

    // Insufficient Balance Exception
    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String msg) {
            super(msg);
        }
    }

    // Password Mismatch Exception
    static class PasswordMismatchException extends Exception {
        public PasswordMismatchException(String msg) {
            super(msg);
        }
    }

    // Invalid Email Exception
    static class InvalidEmailException extends Exception {
        public InvalidEmailException(String msg) {
            super(msg);
        }
    }

    // Stock Out Exception
    static class StockOutException extends Exception {
        public StockOutException(String msg) {
            super(msg);
        }
    }

    
    public static void main(String[] args) {

        // Invalid Marks
        try {
            int marks = 120;
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks should be between 0 and 100");
            }
        } catch (InvalidMarksException e) {
            System.out.println("InvalidMarksException: " + e.getMessage());
        }

        // Insufficient Balance
        try {
            double balance = 500;
            double withdraw = 1000;

            if (withdraw > balance) {
                throw new InsufficientBalanceException("Not enough balance");
            }
        } catch (InsufficientBalanceException e) {
            System.out.println("InsufficientBalanceException: " + e.getMessage());
        }

        // Password Mismatch
        try {
            String password = "abc123";
            String confirmPassword = "abc124";

            if (!password.equals(confirmPassword)) {
                throw new PasswordMismatchException("Passwords do not match");
            }
        } catch (PasswordMismatchException e) {
            System.out.println("PasswordMismatchException: " + e.getMessage());
        }

        // Invalid Email
        try {
            String email = "abcgmail.com";

            if (!email.contains("@")) {
                throw new InvalidEmailException("Invalid email format");
            }
        } catch (InvalidEmailException e) {
            System.out.println("InvalidEmailException: " + e.getMessage());
        }

        // Stock Out
        try {
            int stock = 0;

            if (stock <= 0) {
                throw new StockOutException("Product is out of stock");
            }
        } catch (StockOutException e) {
            System.out.println("StockOutException: " + e.getMessage());
        }

        System.out.println("\nProgram completed...");
    }
}