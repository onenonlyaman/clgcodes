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
