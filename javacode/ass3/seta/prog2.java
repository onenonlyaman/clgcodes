// 2.Write a java program that displays the number of characters, lines and words of a
// file.
import java.io.BufferedReader;
import java.io.FileReader;

class prog2 {
    public static void main(String[] args) {
        String filePath = "text.txt"; 
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
    }
}