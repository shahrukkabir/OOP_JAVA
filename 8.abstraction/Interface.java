// Defining an interface
interface Animal {
    void sound();  // Interface method (no body)
}

// Implementing the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Creating a Dog object
        myDog.sound();  // Outputs: Bark
        
        Animal myCat = new Cat();  // Creating a Cat object
        myCat.sound();  // Outputs: Meow
    }
}



// In Java, an interface is a blueprint for a class. It is used to define a set of methods that a class must implement but without providing any implementation for those methods.

// Key Points:
// Method Declarations:

// Interfaces only have method declarations (signatures), no method bodies. The actual implementation is provided by the classes that implement the interface.
// A class that implements an interface must provide implementations for all the methods declared in the interface.
// No Object Creation:

// You cannot create an object of an interface directly, but you can use a class that implements the interface to create an object.
// Multiple Inheritance:

// In Java, a class can implement multiple interfaces, allowing it to inherit multiple behaviors.
// Default and Static Methods (Java 8 onwards):

// Interfaces can now contain default methods (with a body) and static methods.