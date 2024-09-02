class A{
    void display(){
        System.out.println("Inside A Class");
    }
}

class B extends A{
    @Override
    void display(){
        super.display();
        System.out.println("Inside a class");
    }
}


public class Test2 {
    public static void main(String[] args) {
        B ob = new B();
        ob.display();
    }
}
