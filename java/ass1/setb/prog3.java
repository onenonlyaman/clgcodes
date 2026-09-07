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
