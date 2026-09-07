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
