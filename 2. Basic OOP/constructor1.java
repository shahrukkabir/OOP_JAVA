class Teacher {

    // Fields (attributes)
    String name, gender;
    int phone;

    //  Constructor
    // Teacher(String n, String g, int ph){
    //     name = n;
    //     gender = g;
    //     phone = ph;
    // }
    // Teacher(String n, String g, int p){
    //     this.name = n;
    //     this.gender = g;
    //     this.phone = p;
    // }
    Teacher(String name, String gender, int phone){
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone); 
        System.out.println("\n");       
    }
}

public class constructor1 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Shahruk Kabir","Male",322988707);
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Nurul Kabir", "Male", 821835758);
        teacher2.displayInformation();
    }
}



/*

A constructor in Java is a special method that is called when an object is instantiated. 
It is used to initialize objects and can set initial values for the object's attributes. 
Constructors have the same name as the class and do not have a return type, not even void. 
It is called automatically.
Constructor has the same name as that of the class it belongs.
Default constructor(no parameter), parametrized constructor.

*/





