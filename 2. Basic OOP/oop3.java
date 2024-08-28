class Teacher {
    String name, gender;
    int phone;

    void setInformation(String n, String g, int ph){
        name = n;
        gender = g;
        phone = ph;
    }

    void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone); 
        System.out.println("\n");       
    }
}

public class oop3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        teacher1.setInformation("Shahruk Kabir","Male",322988707);
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher();

        teacher2.setInformation("Nurul Kabir", "Male", 821835758);
        teacher2.displayInformation();
    }
}
