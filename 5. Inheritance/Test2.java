
// Inheriting Private Member | setters, getters

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
class Teacher extends Person{
    
    private String qualification;

    public void setQualification( String qualification ){
        this.qualification=qualification;
    }
    public String getQualification(){
        return qualification;
    }

    void display(){
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Qualification : "+getQualification());
    }
    
}

public class Test2{
    public static void main(String[] args) {

        Teacher t1 = new Teacher();

        t1.setName("Shahruk Kabir");
        t1.setAge(20);
        t1.setQualification("BSc in ICT ");

        t1.display();

        // System.out.println(t1.getName());
        // System.out.println(t1.getAge());
        // System.out.println(t1.getQualification());
    }
}









