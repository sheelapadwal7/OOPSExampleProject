package com.test;

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        
        System.out.println(calc.add(10, 20));         
        System.out.println(calc.add(10, 20, 30));  
        System.out.println(calc.add(10.5, 20.5));     
    }
}

