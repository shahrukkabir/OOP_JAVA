// Write a Java program that explains multi-level inheritance and overriding.

class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }
}

class Puppy extends Dog {
    @Override
    public void sound() {
        System.out.println("Yip Yip");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.sound(); // Calls the overridden method in Puppy class
    }
}
