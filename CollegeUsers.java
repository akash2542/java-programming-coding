import java.util.Scanner;

public class CollegeUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the total number of users
        System.out.print("Enter the total number of users: ");
        int totalUsers = scanner.nextInt();
        
        // Calculate the number of non-teaching staff
        int nonTeachingStaff = totalUsers / 3;
        
        // Calculate the total number of users considering one in three are non-teaching staff
        int totalWithNonTeaching = totalUsers + nonTeachingStaff;
        
        // Output the result
        System.out.println("Total number of users in the college: " + totalWithNonTeaching);
        
        scanner.close();
    }
}
