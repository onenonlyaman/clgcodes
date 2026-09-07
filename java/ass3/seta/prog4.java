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
            Student student = new Student(9, "Aman", 20, "Computer Science");
            System.out.println("Student created successfully.");
            System.out.println(student.name + student.age + student.course + student.rollNo);
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}