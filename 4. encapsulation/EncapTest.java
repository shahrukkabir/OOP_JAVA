
/* 
class Person {

    String name;
    int age;

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

}

public class EncapTest{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name="Shahruk";
        p1.age=21;

        p1.display();
    }
}


*/

//setter and getter methods

class Person {

    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}

public class EncapTest{
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setName("Shahruk");
        p1.setAge(21);
        
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

    }
}