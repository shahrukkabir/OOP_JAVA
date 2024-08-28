
class Person{                //superclass
    String name;
    int age;

    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Age  : "+age);
    }
}

 class Teacher extends Person {      //subclass
     String qualification;
                                   
     @Override

     void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+qualification);
     }
}


public class methodOverriding2{
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Shahruk Kabir";
        t1.age = 20;
        t1.qualification = "BSc in ICT";

        t1.displayInformation();
    }
}

//In Java, method overriding occurs when a subclass (child class) has the same method as the parent class.
//When a method in a subclass has the same name, return type, and parameters as a method in its superclass, 
//the method in the subclass overrides the method in the superclass.

//Method overriding in Java is closely related to inheritance. 
//Inheritance allows a class to inherit properties and methods from another class, 
//and method overriding allows a subclass to provide a specific implementation for a method that is already defined in its superclass.
















