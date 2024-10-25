
public class methodOverload {

    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        methodOverload mo = new methodOverload();

        System.out.println(mo.add(2, 3));           // Calls add(int, int)
        System.out.println(mo.add(2, 3, 4));        // Calls add(int, int, int)
        System.out.println(mo.add(2.5, 3.5));       // Calls add(double, double)
    }
}

// Method overloading in Java is a feature of Object-Oriented Programming (OOP) 
// that allows a class to have more than one method with the same name, provided 
// their parameter lists are different. This is also known as compile-time polymorphism.

// Here are some key points about method overloading:

// Same Method Name: The methods must have the same name.
// Different Parameters: The methods must differ in the type, number, or order of parameters. 
// This is known as the method's signature.
// Return Type: The return type can be different, but it alone cannot be used to distinguish overloaded methods.






