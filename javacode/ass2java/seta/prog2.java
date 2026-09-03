interface Shape {
    void area();
}

class Circle implements Shape {
    final double PI = 3.142;
    double r = 5.0;

    public void area() {
        System.out.println("Circle Area: " + (PI * r * r));
    }
}

class Sphere implements Shape {
    final double PI = 3.142;
    double r = 5.0;

    public void area() {
        System.out.println("Sphere Area: " + (4 * PI * r * r));
    }

    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Sphere();
        c.area();
        s.area();
    }
}
