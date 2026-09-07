import java.util.Scanner;

public class prog1 {
    private int pid;
    private String pname;
    private int age;
    private String gender;

    public prog1() {
        this.pid = 0;
        this.pname = "None";
        this.age = 0;
        this.gender = "Nil";
    }

    public prog1(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    public void display() {
        System.out.println("ID: " + this.pid + "Name: " + this.pname + "Age: " + this.age + "Gender: " + this.gender);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prog1[] persons = new prog1[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            
            int id = sc.nextInt();

            String name = sc.nextLine();

            int age = sc.nextInt();

            String gender = sc.nextLine();

            persons[i] = new prog1(id, name, age, gender);
        }

        for (int i = 0; i < persons.length; i++) {
            persons[i].display();
        }

        sc.close();
    }
}