package com.test;

abstract class Animal {
 
public abstract void sound();

 
 public void eat() {
     System.out.println("This animal eats food.");
 }
}


class Dog extends Animal {
 
 @Override
 public void sound() {
     System.out.println("The dog barks.");
 }
}

class Cat extends Animal {
 
 @Override
 public void sound() {
     System.out.println("The cat meows.");
 }
}


public class AbstractionExample {
 public static void main(String[] args) {
     // Cannot instantiate the Animal class directly
     // Animal animal = new Animal(); // Error: Cannot instantiate the abstract class Animal

     
     Animal dog = new Dog();
     Animal cat = new Cat();

     
     dog.sound();  
     dog.eat();    
     
     cat.sound(); 
     cat.eat();    
 }
}

