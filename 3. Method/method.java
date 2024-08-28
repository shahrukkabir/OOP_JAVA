
//Create an Object and Call the Method:

class HelloWorld {
    // Method inside a class
    void printMessage() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();   //object creation
        hw.printMessage();  // Call the method on an object
    }
}

/* 
//Make the Method Static

class HelloWorld {
    // Static method inside a class
    static void printMessage() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        printMessage();  // Call the static method directly
    }
}

*/


public class method {

    // Method to calculate square of an integer
    int square(int val) {
        return val * val;
    }

    public static void main(String[] args) {
        method obj = new method();  
        int result = obj.square(5); 
        System.out.println("Square of 5 is: " + result);  
    }
}


// class add {x
//     public void add(int a, int b){
//         int c = a+b;
//         System.out.println(c);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         add obj = new add();
//         obj.add(10,60);
//     }
// }
