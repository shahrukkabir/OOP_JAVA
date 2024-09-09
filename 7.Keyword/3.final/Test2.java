class University{
    // Final method, cannot be overridden
    final void display(){
        System.out.println("University Class");
    }
}
class Student extends University{
    //display
    // Trying to override display() will cause a compile-time error
    void display2(){
        System.out.println("Student Class");
    }
}


public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        s1.display2();
    }
}


// // Final class cannot be extended
// final class Parent {
//     void display() {
//         System.out.println("This is a method in the final Parent class.");
//     }
// }

// // This will cause a compile-time error
// // class Child extends Parent { // Error: Cannot inherit from final 'Parent'
// // }

// public class Main {
//     public static void main(String[] args) {
//         Parent p = new Parent();
//         p.display();
//     }
// }
