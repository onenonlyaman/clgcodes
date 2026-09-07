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