class Animal {
    // Animal class definition
}

class Person extends Animal {
    // Person class definition
}

class Teacher extends Person {
    // Teacher class definition
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        Person p = new Person();
        Teacher t = new Teacher();

        // Check if 'a' is an instance of Animal
        System.out.println(a instanceof Animal); // true

        // Check if 'p' is an instance of Animal
        System.out.println(p instanceof Animal); // true

        // Check if 't' is an instance of Person
        System.out.println(t instanceof Person); // true

        // Check if 't' is an instance of Animal
        System.out.println(t instanceof Animal); // true

        // Check if 'p' is an instance of Teacher
        System.out.println(p instanceof Teacher); // false
    }
}
