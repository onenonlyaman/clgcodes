import java.util.Scanner;
class DateInvalid extends Exception {
    public DateInvalid(String message) {
        super(message);
    }
}

class Date {
    int dd, mm, yyyy;
    Date(int dd, int mm, int yyyy) throws DateInvalid
    {
        if(mm > 0 && mm <= 12)
        {
            int[] dm = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if((yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 400 == 0))
            {
                dm[1] = 29;
            }

            if(dd > dm[mm])
            {
                throw new DateInvalid("Day invalid");
            }
        }
        else
        {
            throw new DateInvalid("Month Invalid");
        }
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }
    public void getDate()
    {
        System.out.println(dd + "/" +  mm + "/" + yyyy);
    }
}

class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int dd, mm, yyyy;
            System.out.print("Enter date: ");
            dd = sc.nextInt();
            mm = sc.nextInt();
            yyyy = sc.nextInt();
            Date date = new Date(dd, mm, yyyy);
            date.getDate();
        }
        catch (DateInvalid e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}