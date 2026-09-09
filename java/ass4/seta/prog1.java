import java.util.Hashtable;
import java.util.Scanner;

class prog1 {
    public static void main(String[] args) {
        Hashtable<String, Double> emp = new Hashtable<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            emp.put(name, salary);
        }

        System.out.println("Employee Details: " + emp);

        System.out.print("Enter employee name to search: ");
        String searchName = sc.next();

        if (emp.containsKey(searchName)) {
            System.out.println("Salary of " + searchName + " is: " + emp.get(searchName));
        } else {
            System.out.println("Employee not found.");
        }
        sc.close();
    }
}
