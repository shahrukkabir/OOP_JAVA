class Student{
    String name;
    int id;
    static String universityName = "CoU"; //memory te alada kore jaiga nibe na
    Student(String n, int i){
        name=n;
        id=i;
    }
    void displayInformation(){
        System.out.println("Name :"+name);
        System.out.println("ID :"+id);
        System.out.println("University Name :"+universityName);
    }
}

public class StaticKeyword1 {

    public static void main(String[] args) {
        Student s1 = new Student("Shahruk", 12209015);
        Student s2 = new Student("Junaid", 12209016);
        s1.displayInformation();
        s2.displayInformation();
    }
    
}







