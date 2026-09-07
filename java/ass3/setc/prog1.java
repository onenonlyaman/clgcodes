import java.util.Scanner;

class FundException extends Exception {
    public FundException(String message) {
        super(message);
    }
}

class SavingAccount {
    String AccNo;
    String name;
    float bal;

    SavingAccount(String AccNo, String name, float bal) throws FundException {
        if (bal < 500) {
            throw new FundException("Initial balance must be at least 500");
        }
        this.AccNo = AccNo;
        this.name = name;
        this.bal = bal;
    }

    public void viewBal() {
        System.out.println("Balance: " + bal);
    }

    public void withdraw(float amount) throws FundException {
        if (amount > this.bal) {
            throw new FundException("Insufficient Funds");
        }
        if (this.bal - amount < 500) {
            throw new FundException("Minimum balance must be 500");
        }
        this.bal -= amount;
        viewBal();
    }

    public void deposit(float amount) {
        this.bal += amount;
        viewBal();
    }
}

class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount sa = null;

        while (sa == null) {
            try {
                System.out.print("Enter account number: ");
                String accNo = sc.next();
                System.out.print("Enter name: ");
                String name = sc.next();
                System.out.print("Enter opening balance (min 500): ");
                float initialBal = sc.nextFloat();

                sa = new SavingAccount(accNo, name, initialBal);
                System.out.println("Account created successfully.");
            } catch (FundException e) {
                System.out.println("Error: " + e.getMessage() + ". Try again.\n");
            }
        }

        boolean running = true;
        while (running) {
            try {
                System.out.println("\nMenu:\n1 = View Balance\n2 = Withdraw\n3 = Deposit\n4 = Exit");
                System.out.print("Enter your choice: ");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        sa.viewBal();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        float wAmt = sc.nextFloat();
                        sa.withdraw(wAmt);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        float dAmt = sc.nextFloat();
                        sa.deposit(dAmt);
                        break;
                    case 4:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (FundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}