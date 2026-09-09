import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;

class prog3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = sc.next();
            System.out.print("Enter value: ");
            int val = sc.nextInt();
            map.put(key, val);
        }

        System.out.println("Before sorting: " + map);

        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        System.out.println("After sorting by keys: " + sortedMap);
        sc.close();
    }
}
