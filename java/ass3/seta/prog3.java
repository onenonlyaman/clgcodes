// 3. Write a program to copy the contents from one file into another file in upper case
import java.io.*;
class prog3 {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt"; 
        String destinationFilePath = "destination.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFilePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toUpperCase());
                bw.newLine(); 
            }
            System.out.println("Contents copied to " + destinationFilePath + " in upper case.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}