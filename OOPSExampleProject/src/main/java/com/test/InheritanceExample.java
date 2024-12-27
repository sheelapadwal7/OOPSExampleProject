package com.test;

// Superclass: Employee
class Emp {
    
    private String name;
    private int age;
    private double salary;

    
    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter methods for name, age, and salary
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
    }
}

// Subclass: Manager (inherits from Employee)
class Managers extends Emp {
    private String department;

    // Constructor to initialize Manager object, calls the superclass constructor
    public Managers(String name, int age, double salary, String department) {
        super(name, age, salary);  // Call the Employee constructor
        this.department = department;
    }

    // Getter method for department
    public String getDepartment() {
        return department;
    }

    // Overriding the displayInfo method to include department for the Manager
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call Employee's displayInfo method
        System.out.println("Department: " + department);
    }
}

// Subclass: Developer (inherits from Employee)
class Developers extends Emp {
    private String programmingLanguage;

    // Constructor to initialize Developer object, calls the superclass constructor
    public Developers(String name, int age, double salary, String programmingLanguage) {
        super(name, age, salary);  // Call the Employee constructor
        this.programmingLanguage = programmingLanguage;
    }

    
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Overriding the displayInfo method to include programming language for the Developer
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call Employee's displayInfo method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}


public class InheritanceExample {

    public static void main(String[] args) {
        // Creating objects of Employee, Manager, and Developer
        Emp employee = new Emp("John Doe", 30, 50000);
        Managers manager = new Managers("Alice Smith", 40, 90000, "Sales");
        Developers developer = new Developers("Bob Brown", 35, 75000, "Java");

        // Displaying information of each employee using the displayInfo method
        System.out.println("Employee Info:");
        employee.displayInfo();  
        System.out.println();

        System.out.println("Manager Info:");
        manager.displayInfo();   
        System.out.println();

        System.out.println("Developer Info:");
        developer.displayInfo(); 
    }
}
