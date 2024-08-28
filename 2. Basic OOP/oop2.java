class Teacher {
    String name, gender;
    int phone;
    void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone); 
        System.out.println("\n\n");       
    }
}

public class oop2 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        teacher1.name = "Shahruk Kabir";
        teacher1.gender = "Male";
        teacher1.phone = 322988707;

        teacher1.displayInformation();

        Teacher teacher2 = new Teacher();

        teacher2.name = "Nurul Kabir";
        teacher2.gender = "Male";
        teacher2.phone = 821835758;

        teacher2.displayInformation();
    }
}
