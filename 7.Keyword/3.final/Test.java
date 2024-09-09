class University{
    final String UNIVERSITY_NAME = "CoU";
    static final int fees; //static blank final variable

    static{
        fees=4000;
    }
    void display(){
        System.out.println(UNIVERSITY_NAME);
        System.out.println(fees);
    }
}

public class Test {
    public static void main(String[] args) {
        University ob = new University();
        ob.display();
    }
}
