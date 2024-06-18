import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input course details
        System.out.println("Enter course name:");
        String courseName = scanner.nextLine();
        System.out.println("Enter course code:");
        String courseCode = scanner.nextLine();

        // Input student details
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        System.out.println("Enter marks obtained:");
        int marks = scanner.nextInt();

        // Calculate grade
        char grade;
        if (marks >= 90) {
            grade = 'S';
        } else if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output result
        System.out.println("\nCourse: " + courseName + " (" + courseCode + ")");
        System.out.println("Student: " + studentName);
        System.out.println("Marks Obtained: " + marks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
