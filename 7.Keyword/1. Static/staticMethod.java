class Test {
    void display1() {
        System.out.println("I am non static method");
    }
    
    static void display2() {
        System.out.println("I am static method");
    }
}

public class staticMethod {
    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.display1();  // Call to non-static method using object
        
        Test.display2(); // Call to static method using class name
    }
}


//main method k static hishebe declare kora hoi karon main 
//method ke access korar jonno kono object toiri korte na hoi

//Restrictions:
//1.Static method cant use non static member but reverse is possible
//2."this" and "super" keyword cant be used here