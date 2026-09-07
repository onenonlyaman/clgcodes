interface Operation {
    double PI = 3.142;
    void area();
    void volume();
}

class Circle implements Operation {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Circle Area: " + (PI * radius * radius));
    }

    public void volume() {
        System.out.println("Circle Volume: 0");
    }
}

class Cylinder implements Operation {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void area() {
        double a = (2 * PI * radius * height) + (2 * PI * radius * radius);
        System.out.println("Cylinder Area: " + a);
    }

    public void volume() {
        double v = PI * radius * radius * height;
        System.out.println("Cylinder Volume: " + v);
    }
}
class prog1
{
    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.area();
        c.volume();

        Cylinder cy = new Cylinder(7, 10);
        cy.area();
        cy.volume();
    }
}
