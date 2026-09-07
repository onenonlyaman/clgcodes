interface Shape {
    void area();
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }

    public void area() {
        System.out.println("Square Area: " + (length * length));
    }
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}
class prog1
{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(12.0, 6.0);
        Square sq = new Square(5.0);
        Circle c = new Circle(7.0);

        rect.area();
        sq.area();
        c.area();
    }
}
