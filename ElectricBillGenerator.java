import java.util.Scanner;

public class ElectricBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of units consumed
        System.out.println("Enter the number of units consumed:");
        int unitsConsumed = scanner.nextInt();

        // Calculate the bill based on the given rates
        double billAmount = 0.0;
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.0;
        } else if (unitsConsumed <= 200) {
            billAmount = 100 * 1.0 + (unitsConsumed - 100) * 2.50;
        } else if (unitsConsumed <= 500) {
            billAmount = 100 * 1.0 + 100 * 2.50 + (unitsConsumed - 200) * 4.0;
        } else {
            billAmount = 100 * 1.0 + 100 * 2.50 + 300 * 4.0 + (unitsConsumed - 500) * 6.0;
        }

        // Output the bill amount
        System.out.println("Electric Bill Amount: Rs. " + billAmount);

        scanner.close();
    }
}
