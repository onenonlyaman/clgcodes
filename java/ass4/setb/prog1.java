import java.util.TreeSet;
import java.util.Scanner;

class prog1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer: ");
            ts.add(sc.nextInt());
        }

        System.out.println("Sorted elements (no duplicates): " + ts);

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        if (ts.contains(search)) {
            System.out.println("Element " + search + " is found in collection.");
        } else {
            System.out.println("Element " + search + " is not found in collection.");
        }
        sc.close();
    }
}
