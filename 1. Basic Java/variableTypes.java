public class variableTypes {
    String name;
    int id;
    static String universityName;

    variableTypes(String n, int i){
        name = n;
        id = i;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("University : "+universityName);
    }
}

//Local variable
//A variable that is declared inside the method,constructor or in a block 
//n,i->local variable

//Instance variable
//A variable that is declared inside the class but outside the method
//it is not declared as static
//name,id->instance variable

//Static/class variable
//A variable that is declared as static is called static or class variable
//it cant be declared as local variable


