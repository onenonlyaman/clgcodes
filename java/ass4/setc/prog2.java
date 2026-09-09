import java.util.LinkedList;
import java.util.Scanner;

class prog2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Initial list: " + list);

        System.out.print("Enter element to add at first position: ");
        int first = sc.nextInt();
        list.addFirst(first);
        System.out.println("After adding at first position: " + list);

        list.removeLast();
        System.out.println("After deleting last element: " + list);

        System.out.println("Size of linked list: " + list.size());
        sc.close();
    }
}
