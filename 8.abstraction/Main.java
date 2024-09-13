abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    // Providing the implementation of the abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Providing the implementation of the abstract method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Dog dog = new Dog();
        // Cat cat = new Cat();

        // dog.sound();  // Output: Dog barks
        // dog.sleep();  // Output: Sleeping...

        // cat.sound();  // Output: Cat meows
        // cat.sleep();  // Output: Sleeping...

        Animal an; //reference variable
        
        an = new Dog();
        an.sound();
        an.sleep();

        an = new Cat();
        an.sound();
        an.sleep();
    }
}


// Abstract Classes:

// An abstract class cannot be instantiated directly.
// It can contain abstract methods (methods without a body) that must be implemented by any non-abstract subclass.
// It can also contain regular methods with a defined body, allowing a mix of abstract and non-abstract behaviors.
