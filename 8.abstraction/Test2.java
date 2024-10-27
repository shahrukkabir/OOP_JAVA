abstract class Shape {
    double dim1, dim2;

    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void area();
}

class Triangle extends Shape {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    void area() {
        double result = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + result);
    }
}

class Circle extends Shape {
    Circle(double r) {
        super(r, r); 
    }

    void area() {
        double result = Math.PI * dim1 * dim1; 
        System.out.println("Area of Circle: " + result);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Shape shape;

        shape = new Triangle(5, 10);
        shape.area();

        shape = new Circle(5);
        shape.area();
    }
}
