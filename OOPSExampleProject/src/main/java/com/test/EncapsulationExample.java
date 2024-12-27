package com.test;

class Employee {
   
    private String name;
    private int age;
    private double salary;

    
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

  
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

     
    public int getAge() {
        return age;
    }

   
    public void setAge(int age) {
        if (age > 0) {  
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero.");
        }
    }

     
    public double getSalary() {
        return salary;
    }

     
    public void setSalary(double salary) {
        if (salary > 0) {  
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative or zero.");
        }
    }

    // Method to display the employee's information
    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {
        
        Employee employee = new Employee("Pranita", 28, 50000.00);

       
        System.out.println("Before modification:");
        employee.displayEmployeeInfo();

       
        employee.setName("Ankita Y");
        employee.setAge(30);
        employee.setSalary(55000.00);

        System.out.println("\nAfter modification:");
        employee.displayEmployeeInfo();
    }
}

