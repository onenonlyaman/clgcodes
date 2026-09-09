import java.util.LinkedList;
import java.util.Scanner;

class prog3 {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of friends: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter friend name: ");
            friends.add(sc.next());
        }

        System.out.println("Friends LinkedList: " + friends);
        sc.close();
    }
}
