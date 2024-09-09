class Vehicle{
    String color;
    double weight;
    Vehicle(String c, double w){
        color = c;
        weight = w;
    }
    void attribute(){
        System.out.println("Color  : "+color);
        System.out.println("Weight : "+weight);
    }
}

class Car extends Vehicle{
    int gear;
    Car(String c,double w,int g){
        super(c,w); //call the constructor of vehicle class
        // color = c;
        // weight = w;
        gear = g;
    }
    @Override

    void attribute(){
        // System.out.println("Color : "+color);
        // System.out.println("Weight : "+weight);
        super.attribute();
        System.out.println("Gear : "+gear);
    }
}

public class Test4 {
    public static void main(String[] args) {
        Car Toyota = new Car("White",350,5);
        Toyota.attribute();
         
    }
}
