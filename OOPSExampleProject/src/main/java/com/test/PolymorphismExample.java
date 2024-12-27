
package com.test;
// Superclass: Animal
class Animals {
    // Method in the superclass
    public void sound() {
        System.out.println("Some animal makes a sound");
    }
}

// Subclass: Dog
class D extends Animals {
    // Overriding the sound method in the Dog class
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass: Cat
class C extends Animals {
    // Overriding the sound method in the Cat class
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to test polymorphism
public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of Animal, Dog, and Cat
        Animals a = new Animals();
        Animal myDog = new Dog();        
        Animal myCat = new Cat();        

        // Call the sound method on each object
        a.sound();  
        myDog.sound();     
        myCat.sound();     
    }
}
