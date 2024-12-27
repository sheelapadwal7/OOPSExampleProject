package com.test;

//Interface: Animal
interface Ab {
 // Abstract method (does not have a body)
 void sound();

 // Default method (introduced in Java 8)
 default void eat() {
     System.out.println("This animal eats food.");
 }
}

//Class Dog implementing the Animal interface
class Dogs implements Ab {
 // Providing implementation for the abstract method sound()
 @Override
 public void sound() {
     System.out.println("The dog barks.");
 }
}

//Class Cat implementing the Animal interface
class Cats implements Ab{
 // Providing implementation for the abstract method sound()
 @Override
 public void sound() {
     System.out.println("The cat meows.");
 }
}

//Main class to test abstraction using interface
public class InterfaceAbstractionExample {
 public static void main(String[] args) {
     // Creating objects of Dog and Cat
     Ab dog = new Dogs();
     Ab cat = new Cats();

     // Calling methods
     dog.sound(); 
     dog.eat();    
     
     cat.sound();  
     cat.eat();    
 }
}

