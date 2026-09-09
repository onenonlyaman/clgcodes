import java.util.ArrayList;
import java.util.Scanner;

class prog2 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name: ");
            cities.add(sc.next());
        }

        System.out.println("Cities in ArrayList: " + cities);

        cities.clear();
        System.out.println("After removing all elements: " + cities);
        sc.close();
    }
}
