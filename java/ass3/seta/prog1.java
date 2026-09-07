// 1.Write a java program to accept a number from the user, if number is zero then
// throw user defined exception ―Number is 0, otherwise check whether no is
// prime or not.
import java.util.Scanner;
class NumberisZeroException extends Exception {
    public NumberisZeroException(String message) {
        super(message);
    }
}

class PrimeCheck {
    public static boolean isPrime(int num)
    {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class prog1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            if (number == 0) {
                throw new NumberisZeroException("Number is 0");
            } else {
                if (PrimeCheck.isPrime(number)) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }
        } catch (NumberisZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}