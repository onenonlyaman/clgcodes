import java.util.TreeSet;
import java.util.Scanner;

class prog2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter count of integers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer: ");
            set.add(sc.nextInt());
        }

        System.out.println("Integers in sorted order: " + set);
        sc.close();
    }
}
