class Student{
    // int count=0;
    static int count=0;
    Student(){
        count++;
    }
    void totalStudent(){
        System.out.println("Total Student = "+count);
    }
}

public class StaticKeyword3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.totalStudent();
        Student s2 = new Student();
        s2.totalStudent();
        Student s3 = new Student();
        s3.totalStudent();
    }
    
}