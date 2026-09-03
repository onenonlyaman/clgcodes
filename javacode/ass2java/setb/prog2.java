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
