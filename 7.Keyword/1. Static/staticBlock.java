
public class staticBlock {
    static int id;
    static String name;

    static{
        id=101;                    //static block
        name="Shahruk";
    }
    static void display(){
        System.out.println("ID :"+id);
        System.out.println("Name :"+name);
    }
    public static void main(String[] args) {
        staticBlock.display();
    }
}


//static keyword is used for memory management
//It makes the program more efficient by saving memory