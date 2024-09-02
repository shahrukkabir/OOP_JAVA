class A{
    A(){
        System.out.println("A's constructor");
    }
}
class B extends A{
    B(){
        // super();
        System.out.println("B's constructor");
    }
}
public class Test3 {

    public static void main(String[] args) {
        B ob = new B();
    }
    
}