class Person {

    void  display(){
        System.out.println("I am a Person");
    }
    
}

class Teacher extends Person {
    
    @Override
    void  display(){
        System.out.println("I am a Teacher");
    }
    
}

class Student extends Person{

    @Override
    void  display(){
        System.out.println("I am a Student");
    }
}

public class Test {
    public static void main(String[] args) {

        // Person  p = new Person();
        // Teacher t = new Teacher();
        // Student s = new Student();
        // p.display();
        // t.display();
        // s.display();

        Person p = new Person();
        p.display();

        p = new Teacher();
        p.display();

        p = new Student();
        p.display();

        //person is super class, we can create reference variable of p.

    }
}

//Polymorphism allows objects of different classes to be treated as objects of a common super class.