import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of days
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();
        
        // Calculate years, weeks, and remaining days
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;
        
        // Output the result
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
        
        scanner.close();
    }
}
