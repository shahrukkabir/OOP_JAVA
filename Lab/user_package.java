// Write a Java program to create user-defined package.


// Create a package in mypackage/Greeting.java:

package mypackage;

public class Greeting {
    public void sayHello() {
        System.out.println("Hello from the package!");
    }
}


// In your main file:


import mypackage.Greeting;

public class TestPackage {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.sayHello();
    }
}

