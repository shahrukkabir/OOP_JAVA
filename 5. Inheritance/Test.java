
class Person{
    String name;
    int age;
    void displayInformation1(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

class Teacher extends Person{
    String qualification;

    void displayInformation2(){
        displayInformation1();
        System.out.println("Qualification : "+qualification);
        System.out.println();
    }
}



public class Test {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.name = "Shahruk Kabir";
        t1.age = 30;
        t1.qualification = "BSc in ICT";

        t1.displayInformation2();
        
    }
}
