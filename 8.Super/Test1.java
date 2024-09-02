class A{
    int x = 10;
}
class B extends A{
    //x=10;
    int x = 5;
    void display(){
        System.out.println(x);      //5
        System.out.println(super.x);  //10
    }
}

public class Test1 {
    public static void main(String[] args) {
        B ob = new B();
        ob.display();
    }
}