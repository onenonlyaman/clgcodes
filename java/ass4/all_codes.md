# Java Code Collection

## Assignment 4: Collections

### Set A

#### 1. Hashtable of Employee name and Salary with search (`ass4/seta/prog1.java`)
```java
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
```

#### 2. ArrayList of Cities, display and remove all (`ass4/seta/prog2.java`)
```java
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
```

#### 3. LinkedList of Friends names (`ass4/seta/prog3.java`)
```java
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
```

#### 4. LinkedList of Friends using Iterator (`ass4/seta/prog4.java`)
```java
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

class prog4 {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of friends: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter friend name: ");
            friends.add(sc.next());
        }

        System.out.println("Friends list using Iterator:");
        Iterator<String> itr = friends.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        sc.close();
    }
}
```

---

### Set B

#### 1. TreeSet with Predefined Search (`ass4/setb/prog1.java`)
```java
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
```

#### 2. TreeSet Store and Display Sorted Integers (`ass4/setb/prog2.java`)
```java
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
```

#### 3. Sort HashMap by Keys (`ass4/setb/prog3.java`)
```java
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
```

---

### Set C

#### 1. LinkedList of Colors with Iterator, ListIterator, and Insertion (`ass4/setc/prog1.java`)
```java
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

class prog1 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        System.out.println("Display using Iterator:");
        Iterator<String> itr = colors.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Display in reverse order using ListIterator:");
        ListIterator<String> litr = colors.listIterator(colors.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        LinkedList<String> newColors = new LinkedList<>();
        newColors.add("pink");
        newColors.add("green");

        int index = colors.indexOf("yellow");
        colors.addAll(index, newColors);

        System.out.println("After inserting pink and green between blue and yellow:");
        System.out.println(colors);
    }
}
```

#### 2. Integer LinkedList Operations (`ass4/setc/prog2.java`)
```java
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
```
