// Parent class
class Animal {
    // Method in parent class
    public void sound() {
        System.out.println("This is an animal sound");
    }
}

// Child class that inherits from Animal
class Dog extends Animal {
    // Method in child class
    public void bark() {
        System.out.println("The dog barks");
    }
}

// Main class to test inheritance
public class Inheritence {
    public static void main(String[] args) {
        // Create an object of Dog class
        Dog dog = new Dog();
        
        // Call method from parent class
        dog.sound();  // Inherited method
        
        // Call method from child class
        dog.bark();   // Child's own method
    }
}
