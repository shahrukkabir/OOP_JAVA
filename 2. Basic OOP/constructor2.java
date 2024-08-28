//overloading constructor

class Teacher {

    // Fields (attributes)
    String name, gender;
    int phone;

    //  Constructor
    
    Teacher(){
        System.out.println("NO VALUE");
    }

    Teacher(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }
    

    void displayInformation(){
        System.out.println("\n");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone); 
        System.out.println("\n");       
    }
}

public class constructor2 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Shahruk Kabir","Male",322988707);
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Nurul Kabir", "Male", 821835758);
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();
    }
}


///constructor vs method :

//Constructor:

//1.Constructor is used to initialize the state of an object
//2.Constructor must not have return type
//3.Constructor name must be same as the class name
//4.Constructor is invoked implicitly

//Method: 

//1.Method is used to expose behaviour of an object
//2.Method must have return type
//3.Method name should not be same as class name
//4.Method is invoked explicitly