import java.io.*;
import java.util.Scanner;

class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "customers.txt";

        System.out.print("Enter number of customers (n): ");
        int n = sc.nextInt();
        sc.nextLine();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(n);

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for Customer " + (i + 1) + ":");

                System.out.print("Customer ID: ");
                int c_id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String cname = sc.nextLine();

                System.out.print("Address: ");
                String address = sc.nextLine();

                System.out.print("Mobile No: ");
                String mobile_no = sc.nextLine();

                dos.writeInt(c_id);
                dos.writeUTF(cname);
                dos.writeUTF(address);
                dos.writeUTF(mobile_no);
            }

            System.out.println("\nCustomer details successfully stored in " + filePath);
        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
            sc.close();
            return;
        }

        System.out.println("\nCustomer from file " + filePath + ":");

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int total = dis.readInt();
            System.out.println("Total Customers Found: " + total);

            for (int i = 0; i < total; i++) {
                int c_id = dis.readInt();
                String cname = dis.readUTF();
                String address = dis.readUTF();
                String mobile_no = dis.readUTF();

                System.out.println("\nCustomer " + (i + 1) + ":");
                System.out.println("ID: " + c_id);
                System.out.println("Name: " + cname);
                System.out.println("Address: " + address);
                System.out.println("Mobile No: " + mobile_no);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (EOFException e) {
            System.out.println("Reached end of file unexpectedly.");
        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}