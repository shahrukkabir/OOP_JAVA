class Animal {
    // Method in the superclass
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound() method in the subclass
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class methodOverriding1 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create an Animal object
        Animal myDog = new Dog();        // Create a Dog object (which is an Animal)

        myAnimal.sound();  // Calls the method from Animal class
        myDog.sound();     // Calls the overridden method from Dog class
    }
}



