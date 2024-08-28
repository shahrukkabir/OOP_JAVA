// Define the class 
class Dog {
    // Fields (attributes)
    String name;
    int age;

    // Method (behavior)
    void bark() {
        System.out.println(name + " is barking");
        System.out.println(age + " years old");
    }
}

public class oop {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();

        // Set attributes
        myDog.name = "Buddy";
        myDog.age = 3;

        // Call method
        myDog.bark();  // Output: Buddy is barking
    }
}

/* 
In Java, a class is a blueprint or template from which individual objects are created. It defines a datatype 
by bundling data and methods that work on the data into one single unit. Objects are instances of 
classes; they represent real-world entities and can have attributes and behaviors.

Class:
A class in Java is defined using the class keyword. It can contain fields (variables) and methods to 
define the behavior of an object.

Object:
An object is an instance of a class. When a class is defined, no memory is allocated until an object
of that class is created. 
 
*/
/* 
Explanation:

Class Definition (Dog Class):
Attributes: name and age.
Method: bark(), which prints a message indicating that the dog is barking.
Object Creation:
Dog myDog = new Dog();: Creates an object myDog of class Dog.
myDog.name = "Buddy";: Sets the name attribute of myDog to "Buddy".
myDog.age = 3;: Sets the age attribute of myDog to 3.
myDog.bark();: Calls the bark method, which prints "Buddy is barking".
In this example, Dog is the class, and myDog is an object of that class. 
The object has its own set of attributes (name and age) and can perform actions defined by the methods in the class (bark). 

*/