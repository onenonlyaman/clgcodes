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
