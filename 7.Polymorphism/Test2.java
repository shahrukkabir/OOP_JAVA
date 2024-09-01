class Shape {
    double area() {
        System.out.print("Area for Shape: ");
        return 0;
    }
}

class Rectangle extends Shape {
    double l, w;

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    double area() {
        System.out.print("Area for Rectangle: ");
        return l * w;
    }
}

class Triangle extends Shape {
    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    double area() {
        System.out.print("Area for Triangle: ");
        return 0.5 * b * h;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];

        s[0] = new Shape();
        s[1] = new Rectangle(10, 20);
        s[2] = new Triangle(5, 15);

        System.out.println(s[0].area());
        System.out.println(s[1].area());
        System.out.println(s[2].area());

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].area());
        }
    }
}


