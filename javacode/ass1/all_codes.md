# Java Assignment 1 Code Collection

## SETA

### seta/prog1.java

```java
import java.io.*;

public class prog1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number: ");
        int a = Integer.parseInt(br.readLine());

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(a * i);
        }
    }
}
```

### seta/prog2.java

```java
public class prog2
{
    public static void main(String args[])
    {
        int a = Integer.parseInt(args[0]);
        int digit, rev = 0;

        while(a > 0)
        {
            digit = a % 10;
            rev = rev * 10 + digit;
            a = a / 10;
        }
        System.out.println("The reverse is " + rev);
    }
}
```

### seta/prog3.java

```java
import java.util.*;

public class prog3 {
    public static void main(String[] args) {
        int num[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int sum = 0;

        for(int i = 0; i <= 8; i++)
        {
            sum = sum + num[i];
        }

        System.out.println("Sum of array is " + sum);

        for(int i = 0; i < num.length; i++)
        {
            for(int j = 0; j < num.length - 1 - i; j++)
            {
                if(num[j] > num[j + 1])
                {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
    }
}
```

### seta/prog4.java

```java
import java.io.*;

public class prog4
{  
    private int dd;
    private int mm;
    private int yyyy;

    public prog4()
    {
        this.dd = 1;
        this.mm = 1;
        this.yyyy = 2000;
    }

    public prog4(int dd, int mm, int yyyy)
    {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }

    public void ShowDate()
    {
        System.out.println(dd + "-" + mm + "-" + yyyy);
    }

    public static void main(String args[])
    {
        prog4 d1 = new prog4();
        prog4 d2 = new prog4(29,07,2026);

        d1.ShowDate();
        d2.ShowDate();
    }
}
```

## SETB

### setb/prog1.java

```java
import java.io.*;

public class prog1
{  
    private int num;

    public prog1(int n)
    {
        this.num = n;
    }

    public void CalSC()
    {
        System.out.println(num * num);
        System.out.println(num * num * num);
    }

    public static void main(String args[])
    {
        prog1 n = new prog1(Integer.parseInt(args[0]));
        n.CalSC();
    }
}
```

### setb/prog2.java

```java
import java.util.*;

public class prog2
{  
    private int bookId;
    private String bookName;
    private float bookPrice;

    public prog2(int id, String name, float price)
    {
        this.bookId = id;
        this.bookName = name;
        this.bookPrice = price;
    }

    public void ShowBook()
    {
        System.out.println("ID: " + bookId + " Name: " + bookName + " Price: " + bookPrice);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        prog2[] books = new prog2[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the book id, name and price: ");
            int id = sc.nextInt();
            String name = sc.next();
            float price = sc.nextFloat();
            books[i] = new prog2(id, name, price);
        }
        for(int i = 0; i < n; i++)
        {
            books[i].ShowBook();
        }
    }
}
```

### setb/prog3.java

```java
import java.util.*;

public class prog3
{  
    private int cId;
    private String cName;
    private float billAmount;

    public prog3(int id, String name, float price)
    {
        this.cId = id;
        this.cName = name;
        this.billAmount = price;
    }

    public void ShowBook()
    {
        System.out.println("ID: " + cId + " Name: " + cName + " Amount: " + billAmount);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers: ");
        int n = sc.nextInt();
        prog3[] c = new prog3[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the customer id, name and bill amount: ");
            int id = sc.nextInt();
            String name = sc.next();
            float price = sc.nextFloat();
            c[i] = new prog3(id, name, price);
        }
        for(int i = 0; i < n; i++)
        {
            c[i].ShowBook();
        }
        prog3[] sorted = c;
        for(int i = 0; i < sorted.length; i++)
        {
            for(int j = 0; j < sorted.length - 1 - i; j++)
            {
                if(sorted[j].billAmount > sorted[j + 1].billAmount)
                {
                    prog3 temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted: ");
        for(int i = 0; i < sorted.length; i++)
        {
            c[i].ShowBook();
        }
    }
}
```

## SETC

### setc/prog1.java

```java
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
```
