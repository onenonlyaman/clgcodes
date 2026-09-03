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
