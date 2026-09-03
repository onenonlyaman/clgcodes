This file is a merged representation of the entire codebase, combined into a single document by Repomix.

# File Summary

## Purpose
This file contains a packed representation of the entire repository's contents.
It is designed to be easily consumable by AI systems for analysis, code review,
or other automated processes.

## File Format
The content is organized as follows:
1. This summary section
2. Repository information
3. Directory structure
4. Repository files (if enabled)
5. Multiple file entries, each consisting of:
  a. A header with the file path (## File: path/to/file)
  b. The full contents of the file in a code block

## Usage Guidelines
- This file should be treated as read-only. Any changes should be made to the
  original repository files, not this packed version.
- When processing this file, use the file path to distinguish
  between different files in the repository.
- Be aware that this file may contain sensitive information. Handle it with
  the same level of security as you would the original repository.

## Notes
- Some files may have been excluded based on .gitignore rules and Repomix's configuration
- Binary files are not included in this packed representation. Please refer to the Repository Structure section for a complete list of file paths, including binary files
- Files matching patterns in .gitignore are excluded
- Files matching default ignore patterns are excluded
- Files are sorted by Git change count (files with more changes are at the bottom)

# Directory Structure
```
prog1.java
prog2.java
prog3.java
prog4.java
```

# Files

## File: prog1.java
```java
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
```

## File: prog2.java
```java
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
```

## File: prog3.java
```java
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
```

## File: prog4.java
```java
// 4.Write a class Student with attributes roll no, name, age and course. Initialize
// values through parameterized constructor. If age of student is not in
// between 15 and 21 then generate user-defined exception ―Age Not Within The
// Range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age Not Within The Range");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

class prog4 {
    public static void main(String[] args) {
        try {
            Student student = new Student(86, "Sonal Pawar", 20, "Computer Science");
            System.out.println("Student created successfully.");
            System.out.println(student.name + student.age + student.course + student.rollNo);
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
```
