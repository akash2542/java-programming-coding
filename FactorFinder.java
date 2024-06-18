import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Count factors and print them
        System.out.println("Number of factors: " + countFactors(number));
        
        // Input the nth factor to print
        System.out.print("Enter the nth factor to print: ");
        int n = scanner.nextInt();
        
        // Print the nth factor
        int nthFactor = findNthFactor(number, n);
        if (nthFactor != -1) {
            System.out.println("The " + n + "th factor is: " + nthFactor);
        } else {
            System.out.println("There is no " + n + "th factor for the given number.");
        }
        
        scanner.close();
    }
    
    // Function to count the number of factors
    public static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
    
    // Function to find the nth factor
    public static int findNthFactor(int num, int n) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        return -1; // Indicates nth factor does not exist
    }
}
