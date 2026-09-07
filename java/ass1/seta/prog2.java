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