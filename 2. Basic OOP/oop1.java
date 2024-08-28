class Teacher {
    String name, gender;
    int phone;
}

public class oop1 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        teacher1.name = "Shahruk Kabir";
        teacher1.gender = "Male";
        teacher1.phone = 322988707;

        System.out.println("Name: " + teacher1.name);
        System.out.println("Gender: " + teacher1.gender);
        System.out.println("Phone: " + teacher1.phone);

        Teacher teacher2 = new Teacher();

        teacher2.name = "Nurul Kabir";
        teacher2.gender = "Male";
        teacher2.phone = 322988707;

        System.out.println("Name: " + teacher2.name);
        System.out.println("Gender: " + teacher2.gender);
        System.out.println("Phone: " + teacher2.phone);
    }
}
