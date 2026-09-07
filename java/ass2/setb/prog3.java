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
}
class prog3
{
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
