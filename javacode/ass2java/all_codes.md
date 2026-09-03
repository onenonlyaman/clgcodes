# Java Assignment 2 Code Collection

## SETA

### seta/TestGame.java

```java
import game.Indoor;
import game.Outdoor;

public class TestGame {
    public static void main(String[] args) {
        Indoor i1 = new Indoor();
        Indoor i2 = new Indoor("Amit");
        Outdoor o1 = new Outdoor();
        Outdoor o2 = new Outdoor("Virat");

        i1.display();
        i2.display();
        o1.display();
        o2.display();
    }
}
```

### seta/prog1.java

```java
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

    public static void main(String[] args) {
        Cylinder c = new Cylinder(7.0, 10.0);
        c.displayArea();
    }
}
```

### seta/prog2.java

```java
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
```

### seta/prog3.java

```java
interface Integer {
    void check(int num);
}

class NumberCheck implements Integer {
    public void check(int num) {
        if (num >= 0) {
            System.out.println(num + " is Positive");
        } else {
            System.out.println(num + " is Negative");
        }
    }

    public static void main(String[] args) {
        NumberCheck obj = new NumberCheck();
        obj.check(45);
        obj.check(-12);
    }
}
```

### seta/prog4.java

```java
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    protected double salary;

    public Employee() {
        id = 101;
        name = "Aman";
        department = "IT";
        salary = 45000;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void accept(Scanner sc) {
        id = sc.nextInt();
        name = sc.next();
        department = sc.next();
        salary = sc.nextDouble();
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + department + ", Base Salary: " + salary);
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager() {
        super();
        bonus = 5000;
    }

    public Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    public void accept(Scanner sc) {
        super.accept(sc);
        bonus = sc.nextDouble();
    }

    public double getTotalSalary() {
        return salary + bonus;
    }

    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus + ", Total Salary: " + getTotalSalary());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of managers: ");
        int n = sc.nextInt();

        Manager[] mgrs = new Manager[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID, Name, Dept, Salary, Bonus:");
            mgrs[i] = new Manager();
            mgrs[i].accept(sc);
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (mgrs[i].getTotalSalary() > mgrs[maxIndex].getTotalSalary()) {
                maxIndex = i;
            }
        }

        System.out.println("\nManager with Maximum Total Salary:");
        mgrs[maxIndex].display();
    }
}
```

### seta/prog5.java

```java
import game.Indoor;
import game.Outdoor;

public class prog5 {
    public static void main(String[] args) {
        Indoor i1 = new Indoor();
        Indoor i2 = new Indoor("Amit");
        Outdoor o1 = new Outdoor();
        Outdoor o2 = new Outdoor("Virat");

        i1.display();
        i2.display();
        o1.display();
        o2.display();
    }
}
```

### seta/game/Indoor.java

```java
package game;

public class Indoor {
    String player;

    public Indoor() {
        player = "Rahul";
    }

    public Indoor(String player) {
        this.player = player;
    }

    public void display() {
        System.out.println("Indoor Player: " + player);
    }
}
```

### seta/game/Outdoor.java

```java
package game;

public class Outdoor {
    String player;

    public Outdoor() {
        player = "Rohit";
    }

    public Outdoor(String player) {
        this.player = player;
    }

    public void display() {
        System.out.println("Outdoor Player: " + player);
    }
}
```

## SETB

### setb/prog1.java

```java
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

    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.area();
        c.volume();

        Cylinder cy = new Cylinder(7, 10);
        cy.area();
        cy.volume();
    }
}
```

### setb/prog2.java

```java
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Developer extends Employee {
    String projectName;

    Developer(String name, double salary, String projectName) {
        super(name, salary);
        this.projectName = projectName;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Project: " + projectName);
    }
}

class Programmer extends Developer {
    String progLanguage;

    Programmer(String name, double salary, String projectName, String progLanguage) {
        super(name, salary, projectName);
        this.progLanguage = progLanguage;
    }

    void display() {
        super.display();
        System.out.println("Language: " + progLanguage);
    }

    public static void main(String[] args) {
        Developer d = new Developer("Suresh", 65000, "Aadhaar Portal");
        d.display();
    }
}
```

### setb/prog3.java

```java
import java.util.Scanner;

abstract class Staff {
    String name, address;

    Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract double calculateSalary();
    abstract void display();
}

class FullTimeStaff extends Staff {
    String department;
    double salary;

    FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    double calculateSalary() {
        double hra = 0.08 * salary;
        double da = 0.05 * salary;
        return salary + hra + da;
    }

    void display() {
        System.out.println("FullTime -> Name: " + name + ", Address: " + address + ", Dept: " + department + ", Total Salary: " + calculateSalary());
    }
}

class PartTimeStaff extends Staff {
    int numberOfHours;
    double ratePerHour;

    PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary() {
        return numberOfHours * ratePerHour;
    }

    void display() {
        System.out.println("PartTime -> Name: " + name + ", Address: " + address + ", Hours: " + numberOfHours + ", Total Salary: " + calculateSalary());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of staff: ");
        int n = sc.nextInt();

        Staff[] staffList = new Staff[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter 1 for FullTime or 2 for PartTime: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                staffList[i] = new FullTimeStaff("Rohan", "Pune", "Sales", 35000);
            } else {
                staffList[i] = new PartTimeStaff("Priya", "Mumbai", 50, 400);
            }
        }

        System.out.println("\n--- Staff Details ---");
        for (Staff s : staffList) {
            s.display();
        }
    }
}
```

## SETC

### setc/prog1.java

```java
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

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(12.0, 6.0);
        Square sq = new Square(5.0);
        Circle c = new Circle(7.0);

        rect.area();
        sq.area();
        c.area();
    }
}
```
