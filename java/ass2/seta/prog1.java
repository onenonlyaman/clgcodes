class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    void displayArea() {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Cylinder extends Circle {
    double h;

    Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    void displayArea() {
        super.displayArea();
        double area = (2 * 3.14 * r * h) + (2 * 3.14 * r * r);
        System.out.println("Cylinder Area: " + area);
    }
}

class prog1
{
    public static void main(String[] args) {
        Cylinder c = new Cylinder(7.0, 10.0);
        c.displayArea();
    }
}
